package deob;

@ObfuscatedName("YMQGRGSI")
public class YMQGRGSI {

	@ObfuscatedName("YMQGRGSI.h")
	public int field1382 = -1;

	@ObfuscatedName("YMQGRGSI.j")
	public int[] field1384 = new int[6];

	@ObfuscatedName("YMQGRGSI.k")
	public int[] field1385 = new int[6];

	@ObfuscatedName("YMQGRGSI.l")
	public int[] field1386 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("YMQGRGSI.m")
	public boolean field1387 = false;

	@ObfuscatedName("YMQGRGSI.f")
	public static int field1380;

	@ObfuscatedName("YMQGRGSI.i")
	public int[] field1383;

	@ObfuscatedName("YMQGRGSI.g")
	public static YMQGRGSI[] field1381;

	@ObfuscatedName("YMQGRGSI.a(ILSPZBTZXL;)V")
	public static void method568(SPZBTZXL arg0) {
		LDILQFVA var1 = new LDILQFVA(arg0.method515("idk.dat", null));
		field1380 = var1.method404();
		if (field1381 == null) {
			field1381 = new YMQGRGSI[field1380];
		}

		for (int var2 = 0; var2 < field1380; var2++) {
			if (field1381[var2] == null) {
				field1381[var2] = new YMQGRGSI();
			}

			field1381[var2].method569(var1);
		}
	}

	@ObfuscatedName("YMQGRGSI.a(LLDILQFVA;I)V")
	public void method569(LDILQFVA arg0) {
		while (true) {
			int var2 = arg0.method402();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1382 = arg0.method402();
			} else if (var2 == 2) {
				int var3 = arg0.method402();
				field1383 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1383[var4] = arg0.method404();
				}
			} else if (var2 == 3) {
				field1387 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1384[var2 - 40] = arg0.method404();
			} else if (var2 >= 50 && var2 < 60) {
				field1385[var2 - 50] = arg0.method404();
			} else if (var2 >= 60 && var2 < 70) {
				field1386[var2 - 60] = arg0.method404();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("YMQGRGSI.a(I)Z")
	public boolean method570() {
		if (field1383 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1383.length; var2++) {
			if (!HEQROJXW.method323(field1383[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("YMQGRGSI.b(I)LHEQROJXW;")
	public HEQROJXW method571() {
		if (field1383 == null) {
			return null;
		}

		HEQROJXW[] var1 = new HEQROJXW[field1383.length];
		for (int var2 = 0; var2 < field1383.length; var2++) {
			var1[var2] = HEQROJXW.method322(field1383[var2]);
		}

		HEQROJXW var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new HEQROJXW(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1384[var4] != 0; var4++) {
			var3.method336(field1384[var4], field1385[var4]);
		}

		return var3;
	}

	@ObfuscatedName("YMQGRGSI.a(Z)Z")
	public boolean method572() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1386[var2] != -1 && !HEQROJXW.method323(field1386[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("YMQGRGSI.b(Z)LHEQROJXW;")
	public HEQROJXW method573() {
		HEQROJXW[] var1 = new HEQROJXW[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1386[var3] != -1) {
				var1[var2++] = HEQROJXW.method322(field1386[var3]);
			}
		}

		HEQROJXW var4 = new HEQROJXW(var2, var1);
		for (int var5 = 0; var5 < 6 && field1384[var5] != 0; var5++) {
			var4.method336(field1384[var5], field1385[var5]);
		}

		return var4;
	}
}
