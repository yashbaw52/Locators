package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Yash//Downloads//chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		//partial link text
		WebElement gmail = driver.findElement(By.partialLinkText("Gmail"));
		gmail.click();
		
		//absolute xpath
		WebElement cacc = driver.findElement(By.xpath("/html/body/header/div/div/div/a[3]"));
		cacc.click();
		
		//by id
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("qwerty");
		
		//name
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("asdfgh");
		
		//classname
		WebElement user = driver.findElement(By.className("whsOnd zHQkBf"));
		user.sendKeys("qwerty12345");
		
		//relative xpath
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
		pass.sendKeys("yashbaw789456@123$");
		
		//
		WebElement pass1 = driver.findElement(By.tagName("input"));
		pass1.getAttribute("type = password");
		pass1.sendKeys("yashbaw789456@123$");
		
		
		WebElement check = driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div.SdBahf.Fjk18.OcVpRe.DbQnIe.ia6RDd > div.EcjFDf > div > div.ci67pc > div > div > div.enBDyd > div > input"));
		check.click();
	}

}
