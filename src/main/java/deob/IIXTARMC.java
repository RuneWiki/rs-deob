package deob;

@ObfuscatedName("IIXTARMC")
public class IIXTARMC {

	@ObfuscatedName("IIXTARMC.b")
	public int field729;

	@ObfuscatedName("IIXTARMC.c")
	public int[] field730;

	@ObfuscatedName("IIXTARMC.d")
	public int[][] field731;

	public IIXTARMC(EMWAMCXW arg0) {
		field729 = arg0.method217();
		field730 = new int[field729];
		field731 = new int[field729][];

		for (int var2 = 0; var2 < field729; var2++) {
			field730[var2] = arg0.method217();
		}

		for (int var3 = 0; var3 < field729; var3++) {
			int var4 = arg0.method217();
			field731[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field731[var3][var5] = arg0.method217();
			}
		}
	}
}
