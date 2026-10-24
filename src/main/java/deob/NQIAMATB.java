package deob;

@ObfuscatedName("NQIAMATB")
public class NQIAMATB {

	@ObfuscatedName("NQIAMATB.g")
	public int field982 = -1;

	@ObfuscatedName("NQIAMATB.i")
	public int[] field984 = new int[6];

	@ObfuscatedName("NQIAMATB.j")
	public int[] field985 = new int[6];

	@ObfuscatedName("NQIAMATB.k")
	public int[] field986 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("NQIAMATB.l")
	public boolean field987 = false;

	@ObfuscatedName("NQIAMATB.e")
	public static int field980;

	@ObfuscatedName("NQIAMATB.h")
	public int[] field983;

	@ObfuscatedName("NQIAMATB.f")
	public static NQIAMATB[] field981;

	@ObfuscatedName("NQIAMATB.a(LGWOEELWB;B)V")
	public static void method336(GWOEELWB arg0) {
		MLYYHULT var1 = new MLYYHULT(arg0.method249("idk.dat", null));
		field980 = var1.method298();
		if (field981 == null) {
			field981 = new NQIAMATB[field980];
		}

		for (int var2 = 0; var2 < field980; var2++) {
			if (field981[var2] == null) {
				field981[var2] = new NQIAMATB();
			}

			field981[var2].method337(var1);
		}
	}

	@ObfuscatedName("NQIAMATB.a(LMLYYHULT;B)V")
	public void method337(MLYYHULT arg0) {
		while (true) {
			int var2 = arg0.method296();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field982 = arg0.method296();
			} else if (var2 == 2) {
				int var3 = arg0.method296();
				field983 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field983[var4] = arg0.method298();
				}
			} else if (var2 == 3) {
				field987 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field984[var2 - 40] = arg0.method298();
			} else if (var2 >= 50 && var2 < 60) {
				field985[var2 - 50] = arg0.method298();
			} else if (var2 >= 60 && var2 < 70) {
				field986[var2 - 60] = arg0.method298();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("NQIAMATB.a(I)Z")
	public boolean method338() {
		if (field983 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field983.length; var2++) {
			if (!CADBNSXE.method12(field983[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("NQIAMATB.b(I)LCADBNSXE;")
	public CADBNSXE method339() {
		if (field983 == null) {
			return null;
		}

		CADBNSXE[] var1 = new CADBNSXE[field983.length];
		for (int var2 = 0; var2 < field983.length; var2++) {
			var1[var2] = CADBNSXE.method11(field983[var2]);
		}

		CADBNSXE var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new CADBNSXE(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field984[var4] != 0; var4++) {
			var3.method25(field984[var4], field985[var4]);
		}

		return var3;
	}

	@ObfuscatedName("NQIAMATB.c(I)Z")
	public boolean method340() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field986[var2] != -1 && !CADBNSXE.method12(field986[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("NQIAMATB.a(B)LCADBNSXE;")
	public CADBNSXE method341() {
		CADBNSXE[] var1 = new CADBNSXE[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field986[var3] != -1) {
				var1[var2++] = CADBNSXE.method11(field986[var3]);
			}
		}

		CADBNSXE var4 = new CADBNSXE(var1, var2);
		for (int var5 = 0; var5 < 6 && field984[var5] != 0; var5++) {
			var4.method25(field984[var5], field985[var5]);
		}

		return var4;
	}
}
