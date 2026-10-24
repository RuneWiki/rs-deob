package deob;

@ObfuscatedName("ZJUVOWSB")
public class ZJUVOWSB {

	@ObfuscatedName("ZJUVOWSB.b")
	public int field1514;

	@ObfuscatedName("ZJUVOWSB.c")
	public int[] field1515;

	@ObfuscatedName("ZJUVOWSB.d")
	public int[][] field1516;

	public ZJUVOWSB(LZWRHABP arg0) {
		field1514 = arg0.method463();
		field1515 = new int[field1514];
		field1516 = new int[field1514][];

		for (int var2 = 0; var2 < field1514; var2++) {
			field1515[var2] = arg0.method463();
		}

		for (int var3 = 0; var3 < field1514; var3++) {
			int var4 = arg0.method463();
			field1516[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1516[var3][var5] = arg0.method463();
			}
		}
	}
}
