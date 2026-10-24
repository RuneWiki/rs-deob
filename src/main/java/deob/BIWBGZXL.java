package deob;

@ObfuscatedName("BIWBGZXL")
public class BIWBGZXL {

	@ObfuscatedName("BIWBGZXL.a")
	public int field1;

	@ObfuscatedName("BIWBGZXL.b")
	public int[] field2;

	@ObfuscatedName("BIWBGZXL.c")
	public int[][] field3;

	public BIWBGZXL(MLYYHULT arg0) {
		field1 = arg0.method296();
		field2 = new int[field1];
		field3 = new int[field1][];

		for (int var2 = 0; var2 < field1; var2++) {
			field2[var2] = arg0.method296();
		}

		for (int var3 = 0; var3 < field1; var3++) {
			int var4 = arg0.method296();
			field3[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field3[var3][var5] = arg0.method296();
			}
		}
	}
}
