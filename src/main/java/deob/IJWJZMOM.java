package deob;

@ObfuscatedName("IJWJZMOM")
public class IJWJZMOM {

	@ObfuscatedName("IJWJZMOM.a")
	public int field821;

	@ObfuscatedName("IJWJZMOM.b")
	public int[] field822;

	@ObfuscatedName("IJWJZMOM.c")
	public int[][] field823;

	public IJWJZMOM(XOUQUKZW arg0) {
		field821 = arg0.method521();
		field822 = new int[field821];
		field823 = new int[field821][];

		for (int var2 = 0; var2 < field821; var2++) {
			field822[var2] = arg0.method521();
		}

		for (int var3 = 0; var3 < field821; var3++) {
			int var4 = arg0.method521();
			field823[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field823[var3][var5] = arg0.method521();
			}
		}
	}
}
