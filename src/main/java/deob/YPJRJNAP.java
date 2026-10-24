package deob;

@ObfuscatedName("YPJRJNAP")
public class YPJRJNAP {

	@ObfuscatedName("YPJRJNAP.b")
	public int field1457;

	@ObfuscatedName("YPJRJNAP.c")
	public int[] field1458;

	@ObfuscatedName("YPJRJNAP.d")
	public int[][] field1459;

	public YPJRJNAP(IMUIZRAF arg0) {
		field1457 = arg0.method238();
		field1458 = new int[field1457];
		field1459 = new int[field1457][];

		for (int var2 = 0; var2 < field1457; var2++) {
			field1458[var2] = arg0.method238();
		}

		for (int var3 = 0; var3 < field1457; var3++) {
			int var4 = arg0.method238();
			field1459[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1459[var3][var5] = arg0.method238();
			}
		}
	}
}
