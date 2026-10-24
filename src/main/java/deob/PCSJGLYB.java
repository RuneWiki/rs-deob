package deob;

@ObfuscatedName("PCSJGLYB")
public class PCSJGLYB {

	@ObfuscatedName("PCSJGLYB.b")
	public int field830;

	@ObfuscatedName("PCSJGLYB.c")
	public int[] field831;

	@ObfuscatedName("PCSJGLYB.d")
	public int[][] field832;

	public PCSJGLYB(MQZHAILV arg0) {
		field830 = arg0.method325();
		field831 = new int[field830];
		field832 = new int[field830][];

		for (int var2 = 0; var2 < field830; var2++) {
			field831[var2] = arg0.method325();
		}

		for (int var3 = 0; var3 < field830; var3++) {
			int var4 = arg0.method325();
			field832[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field832[var3][var5] = arg0.method325();
			}
		}
	}
}
