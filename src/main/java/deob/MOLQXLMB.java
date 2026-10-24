package deob;

@ObfuscatedName("MOLQXLMB")
public class MOLQXLMB {

	@ObfuscatedName("MOLQXLMB.a")
	public int field1060;

	@ObfuscatedName("MOLQXLMB.b")
	public int[] field1061;

	@ObfuscatedName("MOLQXLMB.c")
	public int[][] field1062;

	public MOLQXLMB(XGRGMPUQ arg0) {
		field1060 = arg0.method465();
		field1061 = new int[field1060];
		field1062 = new int[field1060][];

		for (int var2 = 0; var2 < field1060; var2++) {
			field1061[var2] = arg0.method465();
		}

		for (int var3 = 0; var3 < field1060; var3++) {
			int var4 = arg0.method465();
			field1062[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1062[var3][var5] = arg0.method465();
			}
		}
	}
}
