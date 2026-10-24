package deob;

@ObfuscatedName("AIZKCREI")
public class AIZKCREI {

	@ObfuscatedName("AIZKCREI.a")
	public long field1;

	@ObfuscatedName("AIZKCREI.b")
	public AIZKCREI field2;

	@ObfuscatedName("AIZKCREI.c")
	public AIZKCREI field3;

	@ObfuscatedName("AIZKCREI.a()V")
	public void method1() {
		if (field3 != null) {
			field3.field2 = field2;
			field2.field3 = field3;
			field2 = null;
			field3 = null;
		}
	}
}
