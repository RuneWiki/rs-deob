package deob;

@ObfuscatedName("MJXROMKT")
public class MJXROMKT {

	@ObfuscatedName("MJXROMKT.a")
	public int field883;

	@ObfuscatedName("MJXROMKT.b")
	public int[] field884;

	@ObfuscatedName("MJXROMKT.c")
	public int[][] field885;

	public MJXROMKT(SVWJKJVI arg0) {
		field883 = arg0.method461();
		field884 = new int[field883];
		field885 = new int[field883][];

		for (int var2 = 0; var2 < field883; var2++) {
			field884[var2] = arg0.method461();
		}

		for (int var3 = 0; var3 < field883; var3++) {
			int var4 = arg0.method461();
			field885[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field885[var3][var5] = arg0.method461();
			}
		}
	}
}
