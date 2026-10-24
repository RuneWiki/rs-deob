package deob;

@ObfuscatedName("TSSAWEFF")
public class TSSAWEFF {

	@ObfuscatedName("TSSAWEFF.a")
	public long field1136;

	@ObfuscatedName("TSSAWEFF.b")
	public TSSAWEFF field1137;

	@ObfuscatedName("TSSAWEFF.c")
	public TSSAWEFF field1138;

	@ObfuscatedName("TSSAWEFF.a()V")
	public void method492() {
		if (field1138 != null) {
			field1138.field1137 = field1137;
			field1137.field1138 = field1138;
			field1137 = null;
			field1138 = null;
		}
	}
}
