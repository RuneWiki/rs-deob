package deob;

@ObfuscatedName("WWONSPNF")
public class WWONSPNF {

	@ObfuscatedName("WWONSPNF.a")
	public long field1370;

	@ObfuscatedName("WWONSPNF.b")
	public WWONSPNF field1371;

	@ObfuscatedName("WWONSPNF.c")
	public WWONSPNF field1372;

	@ObfuscatedName("WWONSPNF.a()V")
	public void method555() {
		if (field1372 != null) {
			field1372.field1371 = field1371;
			field1371.field1372 = field1372;
			field1371 = null;
			field1372 = null;
		}
	}
}
