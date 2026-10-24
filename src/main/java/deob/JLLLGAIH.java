package deob;

@ObfuscatedName("JLLLGAIH")
public class JLLLGAIH {

	@ObfuscatedName("JLLLGAIH.b")
	public int field753;

	@ObfuscatedName("JLLLGAIH.c")
	public int[] field754;

	@ObfuscatedName("JLLLGAIH.d")
	public int[][] field755;

	public JLLLGAIH(BSNPYLEV arg0) {
		field753 = arg0.method47();
		field754 = new int[field753];
		field755 = new int[field753][];

		for (int var2 = 0; var2 < field753; var2++) {
			field754[var2] = arg0.method47();
		}

		for (int var3 = 0; var3 < field753; var3++) {
			int var4 = arg0.method47();
			field755[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field755[var3][var5] = arg0.method47();
			}
		}
	}
}
