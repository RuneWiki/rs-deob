package deob;

@ObfuscatedName("EPQQXCGW")
public class EPQQXCGW {

	@ObfuscatedName("EPQQXCGW.b")
	public int field654;

	@ObfuscatedName("EPQQXCGW.c")
	public int[] field655;

	@ObfuscatedName("EPQQXCGW.d")
	public int[][] field656;

	public EPQQXCGW(IUVBENCV arg0) {
		field654 = arg0.method245();
		field655 = new int[field654];
		field656 = new int[field654][];

		for (int var2 = 0; var2 < field654; var2++) {
			field655[var2] = arg0.method245();
		}

		for (int var3 = 0; var3 < field654; var3++) {
			int var4 = arg0.method245();
			field656[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field656[var3][var5] = arg0.method245();
			}
		}
	}
}
