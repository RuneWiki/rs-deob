package deob;

@ObfuscatedName("CKXVXQFJ")
public class CKXVXQFJ {

	@ObfuscatedName("CKXVXQFJ.b")
	public int field70;

	@ObfuscatedName("CKXVXQFJ.c")
	public int[] field71;

	@ObfuscatedName("CKXVXQFJ.d")
	public int[][] field72;

	public CKXVXQFJ(NQUAUMDT arg0) {
		field70 = arg0.method339();
		field71 = new int[field70];
		field72 = new int[field70][];

		for (int var2 = 0; var2 < field70; var2++) {
			field71[var2] = arg0.method339();
		}

		for (int var3 = 0; var3 < field70; var3++) {
			int var4 = arg0.method339();
			field72[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field72[var3][var5] = arg0.method339();
			}
		}
	}
}
