package deob;

@ObfuscatedName("ez")
public class class106 {

	@ObfuscatedName("ez.af")
	public int field1418;

	@ObfuscatedName("ez.aw")
	public int field1416;

	@ObfuscatedName("ez.at")
	public int[] field1417;

	@ObfuscatedName("ez.ac")
	public int[] field1415;

	public class106(class116 arg0) {
		arg0.method3332(16);
		this.field1418 = arg0.method3330() == 0 ? 1 : arg0.method3332(4) + 1;
		if (arg0.method3330() != 0) {
			arg0.method3332(8);
		}
		arg0.method3332(2);
		if (this.field1418 > 1) {
			this.field1416 = arg0.method3332(4);
		}
		this.field1417 = new int[this.field1418];
		this.field1415 = new int[this.field1418];
		for (int var2 = 0; var2 < this.field1418; var2++) {
			arg0.method3332(8);
			this.field1417[var2] = arg0.method3332(8);
			this.field1415[var2] = arg0.method3332(8);
		}
	}
}
