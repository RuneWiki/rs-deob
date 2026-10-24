package deob;

@ObfuscatedName("ICYTWAKR")
public class ICYTWAKR {

	@ObfuscatedName("ICYTWAKR.a")
	public long field745;

	@ObfuscatedName("ICYTWAKR.b")
	public ICYTWAKR field746;

	@ObfuscatedName("ICYTWAKR.c")
	public ICYTWAKR field747;

	@ObfuscatedName("ICYTWAKR.a()V")
	public void method290() {
		if (field747 != null) {
			field747.field746 = field746;
			field746.field747 = field747;
			field746 = null;
			field747 = null;
		}
	}
}
