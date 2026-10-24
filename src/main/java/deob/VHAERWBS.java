package deob;

@ObfuscatedName("VHAERWBS")
public class VHAERWBS {

	@ObfuscatedName("VHAERWBS.a")
	public long field1431;

	@ObfuscatedName("VHAERWBS.b")
	public VHAERWBS field1432;

	@ObfuscatedName("VHAERWBS.c")
	public VHAERWBS field1433;

	@ObfuscatedName("VHAERWBS.a()V")
	public void method579() {
		if (field1433 != null) {
			field1433.field1432 = field1432;
			field1432.field1433 = field1433;
			field1432 = null;
			field1433 = null;
		}
	}
}
