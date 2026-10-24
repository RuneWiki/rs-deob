package deob;

@ObfuscatedName("PXORWIXO")
public class PXORWIXO {

	@ObfuscatedName("PXORWIXO.a")
	public long field1136;

	@ObfuscatedName("PXORWIXO.b")
	public PXORWIXO field1137;

	@ObfuscatedName("PXORWIXO.c")
	public PXORWIXO field1138;

	@ObfuscatedName("PXORWIXO.a()V")
	public void method464() {
		if (field1138 != null) {
			field1138.field1137 = field1137;
			field1137.field1138 = field1138;
			field1137 = null;
			field1138 = null;
		}
	}
}
