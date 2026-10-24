package deob;

@ObfuscatedName("KLNBCMBU")
public class KLNBCMBU {

	@ObfuscatedName("KLNBCMBU.b")
	public int field917;

	@ObfuscatedName("KLNBCMBU.c")
	public int[] field918;

	@ObfuscatedName("KLNBCMBU.d")
	public int[][] field919;

	public KLNBCMBU(BJPWOXRJ arg0) {
		field917 = arg0.method15();
		field918 = new int[field917];
		field919 = new int[field917][];

		for (int var2 = 0; var2 < field917; var2++) {
			field918[var2] = arg0.method15();
		}

		for (int var3 = 0; var3 < field917; var3++) {
			int var4 = arg0.method15();
			field919[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field919[var3][var5] = arg0.method15();
			}
		}
	}
}
