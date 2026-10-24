package deob;

@ObfuscatedName("RHGWIWMQ")
public class RHGWIWMQ {

	@ObfuscatedName("RHGWIWMQ.d")
	public int field1269 = -1;

	@ObfuscatedName("RHGWIWMQ.f")
	public int[] field1271 = new int[6];

	@ObfuscatedName("RHGWIWMQ.g")
	public int[] field1272 = new int[6];

	@ObfuscatedName("RHGWIWMQ.h")
	public int[] field1273 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("RHGWIWMQ.i")
	public boolean field1274 = false;

	@ObfuscatedName("RHGWIWMQ.b")
	public static int field1267;

	@ObfuscatedName("RHGWIWMQ.e")
	public int[] field1270;

	@ObfuscatedName("RHGWIWMQ.c")
	public static RHGWIWMQ[] field1268;

	@ObfuscatedName("RHGWIWMQ.a(LMNPBQFWE;B)V")
	public static void method476(MNPBQFWE arg0) {
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("idk.dat", null));
		field1267 = var1.method17();
		if (field1268 == null) {
			field1268 = new RHGWIWMQ[field1267];
		}

		for (int var2 = 0; var2 < field1267; var2++) {
			if (field1268[var2] == null) {
				field1268[var2] = new RHGWIWMQ();
			}

			field1268[var2].method477(var1);
		}
	}

	@ObfuscatedName("RHGWIWMQ.a(ILBJPWOXRJ;)V")
	public void method477(BJPWOXRJ arg0) {
		while (true) {
			int var2 = arg0.method15();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1269 = arg0.method15();
			} else if (var2 == 2) {
				int var3 = arg0.method15();
				field1270 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1270[var4] = arg0.method17();
				}
			} else if (var2 == 3) {
				field1274 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1271[var2 - 40] = arg0.method17();
			} else if (var2 >= 50 && var2 < 60) {
				field1272[var2 - 50] = arg0.method17();
			} else if (var2 >= 60 && var2 < 70) {
				field1273[var2 - 60] = arg0.method17();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("RHGWIWMQ.a(I)Z")
	public boolean method478() {
		if (field1270 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1270.length; var2++) {
			if (!JLNSJQDR.method329(field1270[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("RHGWIWMQ.b(I)LJLNSJQDR;")
	public JLNSJQDR method479() {
		if (field1270 == null) {
			return null;
		}

		JLNSJQDR[] var1 = new JLNSJQDR[field1270.length];
		for (int var2 = 0; var2 < field1270.length; var2++) {
			var1[var2] = JLNSJQDR.method328(field1270[var2]);
		}

		JLNSJQDR var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new JLNSJQDR(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1271[var4] != 0; var4++) {
			var3.method342(field1271[var4], field1272[var4]);
		}

		return var3;
	}

	@ObfuscatedName("RHGWIWMQ.c(I)Z")
	public boolean method480() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1273[var2] != -1 && !JLNSJQDR.method329(field1273[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("RHGWIWMQ.d(I)LJLNSJQDR;")
	public JLNSJQDR method481() {
		JLNSJQDR[] var1 = new JLNSJQDR[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1273[var3] != -1) {
				var1[var2++] = JLNSJQDR.method328(field1273[var3]);
			}
		}

		JLNSJQDR var4 = new JLNSJQDR(var2, var1);
		for (int var5 = 0; var5 < 6 && field1271[var5] != 0; var5++) {
			var4.method342(field1271[var5], field1272[var5]);
		}

		return var4;
	}
}
