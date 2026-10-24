package deob;

@ObfuscatedName("FAQFGVMF")
public class FAQFGVMF {

	@ObfuscatedName("FAQFGVMF.h")
	public int field760 = -1;

	@ObfuscatedName("FAQFGVMF.j")
	public int[] field762 = new int[6];

	@ObfuscatedName("FAQFGVMF.k")
	public int[] field763 = new int[6];

	@ObfuscatedName("FAQFGVMF.l")
	public int[] field764 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("FAQFGVMF.m")
	public boolean field765 = false;

	@ObfuscatedName("FAQFGVMF.f")
	public static int field758;

	@ObfuscatedName("FAQFGVMF.i")
	public int[] field761;

	@ObfuscatedName("FAQFGVMF.g")
	public static FAQFGVMF[] field759;

	@ObfuscatedName("FAQFGVMF.a(LLYZBHNJP;I)V")
	public static void method215(LYZBHNJP arg0) {
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("idk.dat", null));
		field758 = var1.method549();
		if (field759 == null) {
			field759 = new FAQFGVMF[field758];
		}

		for (int var2 = 0; var2 < field758; var2++) {
			if (field759[var2] == null) {
				field759[var2] = new FAQFGVMF();
			}

			field759[var2].method216(var1);
		}
	}

	@ObfuscatedName("FAQFGVMF.a(LZOMNSJJM;B)V")
	public void method216(ZOMNSJJM arg0) {
		while (true) {
			int var2 = arg0.method547();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field760 = arg0.method547();
			} else if (var2 == 2) {
				int var3 = arg0.method547();
				field761 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field761[var4] = arg0.method549();
				}
			} else if (var2 == 3) {
				field765 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field762[var2 - 40] = arg0.method549();
			} else if (var2 >= 50 && var2 < 60) {
				field763[var2 - 50] = arg0.method549();
			} else if (var2 >= 60 && var2 < 70) {
				field764[var2 - 60] = arg0.method549();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FAQFGVMF.a(B)Z")
	public boolean method217() {
		if (field761 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field761.length; var2++) {
			if (!CCYECDYX.method12(field761[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("FAQFGVMF.a(I)LCCYECDYX;")
	public CCYECDYX method218() {
		if (field761 == null) {
			return null;
		}

		CCYECDYX[] var1 = new CCYECDYX[field761.length];
		for (int var2 = 0; var2 < field761.length; var2++) {
			var1[var2] = CCYECDYX.method11(field761[var2]);
		}

		CCYECDYX var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new CCYECDYX(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field762[var4] != 0; var4++) {
			var3.method25(field762[var4], field763[var4]);
		}

		return var3;
	}

	@ObfuscatedName("FAQFGVMF.b(I)Z")
	public boolean method219() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field764[var2] != -1 && !CCYECDYX.method12(field764[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("FAQFGVMF.b(B)LCCYECDYX;")
	public CCYECDYX method220() {
		CCYECDYX[] var1 = new CCYECDYX[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field764[var3] != -1) {
				var1[var2++] = CCYECDYX.method11(field764[var3]);
			}
		}

		CCYECDYX var4 = new CCYECDYX(var1, var2);
		for (int var5 = 0; var5 < 6 && field762[var5] != 0; var5++) {
			var4.method25(field762[var5], field763[var5]);
		}

		return var4;
	}
}
