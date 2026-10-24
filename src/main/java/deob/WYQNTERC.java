package deob;

@ObfuscatedName("WYQNTERC")
public class WYQNTERC {

	@ObfuscatedName("WYQNTERC.a")
	public long field1362;

	@ObfuscatedName("WYQNTERC.b")
	public WYQNTERC field1363;

	@ObfuscatedName("WYQNTERC.c")
	public WYQNTERC field1364;

	@ObfuscatedName("WYQNTERC.a()V")
	public void method540() {
		if (field1364 != null) {
			field1364.field1363 = field1363;
			field1363.field1364 = field1364;
			field1363 = null;
			field1364 = null;
		}
	}
}
