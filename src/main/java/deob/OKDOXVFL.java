package deob;

@ObfuscatedName("OKDOXVFL")
public class OKDOXVFL {

	@ObfuscatedName("OKDOXVFL.a")
	public long field1028;

	@ObfuscatedName("OKDOXVFL.b")
	public OKDOXVFL field1029;

	@ObfuscatedName("OKDOXVFL.c")
	public OKDOXVFL field1030;

	@ObfuscatedName("OKDOXVFL.a()V")
	public void method398() {
		if (field1030 != null) {
			field1030.field1029 = field1029;
			field1029.field1030 = field1030;
			field1029 = null;
			field1030 = null;
		}
	}
}
