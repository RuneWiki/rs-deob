package deob;

@ObfuscatedName("BGEILVDT")
public class BGEILVDT {

	@ObfuscatedName("BGEILVDT.f")
	public int field101 = -1;

	@ObfuscatedName("BGEILVDT.h")
	public int[] field103 = new int[6];

	@ObfuscatedName("BGEILVDT.i")
	public int[] field104 = new int[6];

	@ObfuscatedName("BGEILVDT.j")
	public int[] field105 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("BGEILVDT.k")
	public boolean field106 = false;

	@ObfuscatedName("BGEILVDT.d")
	public static int field99;

	@ObfuscatedName("BGEILVDT.g")
	public int[] field102;

	@ObfuscatedName("BGEILVDT.e")
	public static BGEILVDT[] field100;

	@ObfuscatedName("BGEILVDT.a(ILSRZUEVOD;)V")
	public static void method20(SRZUEVOD arg0) {
		LZWRHABP var1 = new LZWRHABP(arg0.method566("idk.dat", null));
		field99 = var1.method465();
		if (field100 == null) {
			field100 = new BGEILVDT[field99];
		}

		for (int var2 = 0; var2 < field99; var2++) {
			if (field100[var2] == null) {
				field100[var2] = new BGEILVDT();
			}

			field100[var2].method21(var1);
		}
	}

	@ObfuscatedName("BGEILVDT.a(ZLLZWRHABP;)V")
	public void method21(LZWRHABP arg0) {
		while (true) {
			int var2 = arg0.method463();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field101 = arg0.method463();
			} else if (var2 == 2) {
				int var3 = arg0.method463();
				field102 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field102[var4] = arg0.method465();
				}
			} else if (var2 == 3) {
				field106 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field103[var2 - 40] = arg0.method465();
			} else if (var2 >= 50 && var2 < 60) {
				field104[var2 - 50] = arg0.method465();
			} else if (var2 >= 60 && var2 < 70) {
				field105[var2 - 60] = arg0.method465();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BGEILVDT.a(Z)Z")
	public boolean method22() {
		if (field102 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field102.length; var2++) {
			if (!LSSDQDBV.method424(field102[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("BGEILVDT.a(B)LLSSDQDBV;")
	public LSSDQDBV method23() {
		if (field102 == null) {
			return null;
		}

		LSSDQDBV[] var1 = new LSSDQDBV[field102.length];
		for (int var2 = 0; var2 < field102.length; var2++) {
			var1[var2] = LSSDQDBV.method423(field102[var2]);
		}

		LSSDQDBV var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new LSSDQDBV(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field103[var4] != 0; var4++) {
			var3.method437(field103[var4], field104[var4]);
		}

		return var3;
	}

	@ObfuscatedName("BGEILVDT.a(I)Z")
	public boolean method24() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field105[var2] != -1 && !LSSDQDBV.method424(field105[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("BGEILVDT.b(I)LLSSDQDBV;")
	public LSSDQDBV method25() {
		LSSDQDBV[] var1 = new LSSDQDBV[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field105[var3] != -1) {
				var1[var2++] = LSSDQDBV.method423(field105[var3]);
			}
		}

		LSSDQDBV var4 = new LSSDQDBV(var1, var2);
		for (int var5 = 0; var5 < 6 && field103[var5] != 0; var5++) {
			var4.method437(field103[var5], field104[var5]);
		}

		return var4;
	}
}
