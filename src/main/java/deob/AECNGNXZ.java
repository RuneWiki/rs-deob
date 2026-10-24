package deob;

@ObfuscatedName("AECNGNXZ")
public class AECNGNXZ {

	@ObfuscatedName("AECNGNXZ.b")
	public int field1;

	@ObfuscatedName("AECNGNXZ.c")
	public int[] field2;

	@ObfuscatedName("AECNGNXZ.d")
	public int[][] field3;

	public AECNGNXZ(GLMIQHJI arg0) {
		field1 = arg0.method244();
		field2 = new int[field1];
		field3 = new int[field1][];

		for (int var2 = 0; var2 < field1; var2++) {
			field2[var2] = arg0.method244();
		}

		for (int var3 = 0; var3 < field1; var3++) {
			int var4 = arg0.method244();
			field3[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field3[var3][var5] = arg0.method244();
			}
		}
	}
}
