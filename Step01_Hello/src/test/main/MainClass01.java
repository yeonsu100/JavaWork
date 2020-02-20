package test.main;

import test.mypac.Car;
import test.mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("Winnie");
		System.out.println("Stitch");
		Car car1=new Car();
		car1.drive();
		System.out.println("Alice");
		Phone p1=new Phone();
		p1.call();
		p1.takePicture();
	}
}
