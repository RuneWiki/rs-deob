package deob;

@ObfuscatedName("XPVGEAJJ")
public class XPVGEAJJ {

	@ObfuscatedName("XPVGEAJJ.c")
	public int field1386 = -1;

	@ObfuscatedName("XPVGEAJJ.e")
	public int[] field1388 = new int[6];

	@ObfuscatedName("XPVGEAJJ.f")
	public int[] field1389 = new int[6];

	@ObfuscatedName("XPVGEAJJ.g")
	public int[] field1390 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("XPVGEAJJ.h")
	public boolean field1391 = false;

	@ObfuscatedName("XPVGEAJJ.a")
	public static int field1384;

	@ObfuscatedName("XPVGEAJJ.d")
	public int[] field1387;

	@ObfuscatedName("XPVGEAJJ.b")
	public static XPVGEAJJ[] field1385;

	@ObfuscatedName("XPVGEAJJ.a(ZLAKPFVPPG;)V")
	public static void method538(AKPFVPPG arg0) {
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("idk.dat", null));
		field1384 = var1.method215();
		if (field1385 == null) {
			field1385 = new XPVGEAJJ[field1384];
		}

		for (int var2 = 0; var2 < field1384; var2++) {
			if (field1385[var2] == null) {
				field1385[var2] = new XPVGEAJJ();
			}

			field1385[var2].method539(var1);
		}
	}

	@ObfuscatedName("XPVGEAJJ.a(LFTMSICIZ;I)V")
	public void method539(FTMSICIZ arg0) {
		while (true) {
			int var2 = arg0.method213();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1386 = arg0.method213();
			} else if (var2 == 2) {
				int var3 = arg0.method213();
				field1387 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1387[var4] = arg0.method215();
				}
			} else if (var2 == 3) {
				field1391 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1388[var2 - 40] = arg0.method215();
			} else if (var2 >= 50 && var2 < 60) {
				field1389[var2 - 50] = arg0.method215();
			} else if (var2 >= 60 && var2 < 70) {
				field1390[var2 - 60] = arg0.method215();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("XPVGEAJJ.a(Z)Z")
	public boolean method540() {
		if (field1387 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1387.length; var2++) {
			if (!KUGNQTGL.method331(field1387[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("XPVGEAJJ.a(I)LKUGNQTGL;")
	public KUGNQTGL method541() {
		if (field1387 == null) {
			return null;
		}

		KUGNQTGL[] var1 = new KUGNQTGL[field1387.length];
		for (int var2 = 0; var2 < field1387.length; var2++) {
			var1[var2] = KUGNQTGL.method330(field1387[var2]);
		}

		KUGNQTGL var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new KUGNQTGL(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1388[var4] != 0; var4++) {
			var3.method344(field1388[var4], field1389[var4]);
		}

		return var3;
	}

	@ObfuscatedName("XPVGEAJJ.b(I)Z")
	public boolean method542() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1390[var2] != -1 && !KUGNQTGL.method331(field1390[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("XPVGEAJJ.b(Z)LKUGNQTGL;")
	public KUGNQTGL method543() {
		KUGNQTGL[] var1 = new KUGNQTGL[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1390[var3] != -1) {
				var1[var2++] = KUGNQTGL.method330(field1390[var3]);
			}
		}

		KUGNQTGL var4 = new KUGNQTGL(var2, var1);
		for (int var5 = 0; var5 < 6 && field1388[var5] != 0; var5++) {
			var4.method344(field1388[var5], field1389[var5]);
		}

		return var4;
	}
}
