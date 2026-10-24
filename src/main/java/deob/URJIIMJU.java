package deob;

@ObfuscatedName("URJIIMJU")
public class URJIIMJU {

	@ObfuscatedName("URJIIMJU.b")
	public int field1334;

	@ObfuscatedName("URJIIMJU.c")
	public int[] field1335;

	@ObfuscatedName("URJIIMJU.d")
	public int[][] field1336;

	public URJIIMJU(WNCFPLWV arg0) {
		field1334 = arg0.method502();
		field1335 = new int[field1334];
		field1336 = new int[field1334][];

		for (int var2 = 0; var2 < field1334; var2++) {
			field1335[var2] = arg0.method502();
		}

		for (int var3 = 0; var3 < field1334; var3++) {
			int var4 = arg0.method502();
			field1336[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1336[var3][var5] = arg0.method502();
			}
		}
	}
}
