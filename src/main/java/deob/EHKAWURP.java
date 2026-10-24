package deob;

@ObfuscatedName("EHKAWURP")
public class EHKAWURP {

	@ObfuscatedName("EHKAWURP.a")
	public int field552;

	@ObfuscatedName("EHKAWURP.b")
	public int[] field553;

	@ObfuscatedName("EHKAWURP.c")
	public int[][] field554;

	public EHKAWURP(MNKDCXXG arg0) {
		field552 = arg0.method386();
		field553 = new int[field552];
		field554 = new int[field552][];

		for (int var2 = 0; var2 < field552; var2++) {
			field553[var2] = arg0.method386();
		}

		for (int var3 = 0; var3 < field552; var3++) {
			int var4 = arg0.method386();
			field554[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field554[var3][var5] = arg0.method386();
			}
		}
	}
}
