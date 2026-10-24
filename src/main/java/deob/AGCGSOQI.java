package deob;

@ObfuscatedName("AGCGSOQI")
public class AGCGSOQI extends ICYTWAKR {

	@ObfuscatedName("AGCGSOQI.f")
	public AGCGSOQI field1;

	@ObfuscatedName("AGCGSOQI.g")
	public AGCGSOQI field2;

	@ObfuscatedName("AGCGSOQI.b()V")
	public void method1() {
		if (field2 != null) {
			field2.field1 = field1;
			field1.field2 = field2;
			field1 = null;
			field2 = null;
		}
	}
}
