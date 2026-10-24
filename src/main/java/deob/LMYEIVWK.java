package deob;

@ObfuscatedName("LMYEIVWK")
public class LMYEIVWK {

	@ObfuscatedName("LMYEIVWK.b")
	public int field828;

	@ObfuscatedName("LMYEIVWK.c")
	public int[] field829;

	@ObfuscatedName("LMYEIVWK.d")
	public int[][] field830;

	public LMYEIVWK(RSWRPCHR arg0) {
		field828 = arg0.method388();
		field829 = new int[field828];
		field830 = new int[field828][];

		for (int var2 = 0; var2 < field828; var2++) {
			field829[var2] = arg0.method388();
		}

		for (int var3 = 0; var3 < field828; var3++) {
			int var4 = arg0.method388();
			field830[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field830[var3][var5] = arg0.method388();
			}
		}
	}
}
