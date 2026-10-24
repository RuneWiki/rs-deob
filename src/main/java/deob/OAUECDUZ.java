package deob;

@ObfuscatedName("OAUECDUZ")
public class OAUECDUZ {

	@ObfuscatedName("OAUECDUZ.a")
	public int field1107;

	@ObfuscatedName("OAUECDUZ.b")
	public int[] field1108;

	@ObfuscatedName("OAUECDUZ.c")
	public int[][] field1109;

	public OAUECDUZ(EGCCHUZS arg0) {
		field1107 = arg0.method261();
		field1108 = new int[field1107];
		field1109 = new int[field1107][];

		for (int var2 = 0; var2 < field1107; var2++) {
			field1108[var2] = arg0.method261();
		}

		for (int var3 = 0; var3 < field1107; var3++) {
			int var4 = arg0.method261();
			field1109[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1109[var3][var5] = arg0.method261();
			}
		}
	}
}
