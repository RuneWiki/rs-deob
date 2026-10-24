package deob;

@ObfuscatedName("LXLAQKAC")
public class LXLAQKAC {

	@ObfuscatedName("LXLAQKAC.d")
	public int field920 = -1;

	@ObfuscatedName("LXLAQKAC.f")
	public int[] field922 = new int[6];

	@ObfuscatedName("LXLAQKAC.g")
	public int[] field923 = new int[6];

	@ObfuscatedName("LXLAQKAC.h")
	public int[] field924 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("LXLAQKAC.i")
	public boolean field925 = false;

	@ObfuscatedName("LXLAQKAC.b")
	public static int field918;

	@ObfuscatedName("LXLAQKAC.e")
	public int[] field921;

	@ObfuscatedName("LXLAQKAC.c")
	public static LXLAQKAC[] field919;

	@ObfuscatedName("LXLAQKAC.a(BLIEMHZJLX;)V")
	public static void method335(IEMHZJLX arg0) {
		MVHXDWGI var1 = new MVHXDWGI(arg0.method242("idk.dat", null));
		field918 = var1.method359();
		if (field919 == null) {
			field919 = new LXLAQKAC[field918];
		}

		for (int var2 = 0; var2 < field918; var2++) {
			if (field919[var2] == null) {
				field919[var2] = new LXLAQKAC();
			}

			field919[var2].method336(var1);
		}
	}

	@ObfuscatedName("LXLAQKAC.a(ILMVHXDWGI;)V")
	public void method336(MVHXDWGI arg0) {
		while (true) {
			int var2 = arg0.method357();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field920 = arg0.method357();
			} else if (var2 == 2) {
				int var3 = arg0.method357();
				field921 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field921[var4] = arg0.method359();
				}
			} else if (var2 == 3) {
				field925 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field922[var2 - 40] = arg0.method359();
			} else if (var2 >= 50 && var2 < 60) {
				field923[var2 - 50] = arg0.method359();
			} else if (var2 >= 60 && var2 < 70) {
				field924[var2 - 60] = arg0.method359();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("LXLAQKAC.a(I)Z")
	public boolean method337() {
		if (field921 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field921.length; var2++) {
			if (!PDVZPZLT.method415(field921[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("LXLAQKAC.a(Z)LPDVZPZLT;")
	public PDVZPZLT method338() {
		if (field921 == null) {
			return null;
		}

		PDVZPZLT[] var1 = new PDVZPZLT[field921.length];
		for (int var2 = 0; var2 < field921.length; var2++) {
			var1[var2] = PDVZPZLT.method414(field921[var2]);
		}

		PDVZPZLT var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new PDVZPZLT(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field922[var4] != 0; var4++) {
			var3.method428(field922[var4], field923[var4]);
		}

		return var3;
	}

	@ObfuscatedName("LXLAQKAC.b(I)Z")
	public boolean method339() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field924[var2] != -1 && !PDVZPZLT.method415(field924[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("LXLAQKAC.c(I)LPDVZPZLT;")
	public PDVZPZLT method340() {
		PDVZPZLT[] var1 = new PDVZPZLT[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field924[var3] != -1) {
				var1[var2++] = PDVZPZLT.method414(field924[var3]);
			}
		}

		PDVZPZLT var4 = new PDVZPZLT(var1, var2);
		for (int var5 = 0; var5 < 6 && field922[var5] != 0; var5++) {
			var4.method428(field922[var5], field923[var5]);
		}

		return var4;
	}
}
