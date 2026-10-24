package deob;

@ObfuscatedName("XVBRPTSM")
public class XVBRPTSM {

	@ObfuscatedName("XVBRPTSM.a")
	public int field1475;

	@ObfuscatedName("XVBRPTSM.b")
	public int[] field1476;

	@ObfuscatedName("XVBRPTSM.c")
	public int[][] field1477;

	public XVBRPTSM(CKBTFRZM arg0) {
		field1475 = arg0.method44();
		field1476 = new int[field1475];
		field1477 = new int[field1475][];

		for (int var2 = 0; var2 < field1475; var2++) {
			field1476[var2] = arg0.method44();
		}

		for (int var3 = 0; var3 < field1475; var3++) {
			int var4 = arg0.method44();
			field1477[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1477[var3][var5] = arg0.method44();
			}
		}
	}
}
