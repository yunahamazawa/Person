
public class Robot {
	public String name = null;
	public static void main(String[] args) {	
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
	
		System.out.println(taro.name);
		System.out.println(taro.age);
	taro.talk();
	taro.walk();
	taro.run();

	}
}
