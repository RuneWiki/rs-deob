package deob;

@ObfuscatedName("XWNROHZR")
public class XWNROHZR {

	@ObfuscatedName("XWNROHZR.f")
	public int field1442 = -1;

	@ObfuscatedName("XWNROHZR.h")
	public int[] field1444 = new int[6];

	@ObfuscatedName("XWNROHZR.i")
	public int[] field1445 = new int[6];

	@ObfuscatedName("XWNROHZR.j")
	public int field1446 = 128;

	@ObfuscatedName("XWNROHZR.k")
	public int field1447 = 128;

	@ObfuscatedName("XWNROHZR.o")
	public static UECXVCCS field1451 = new UECXVCCS(30);

	@ObfuscatedName("XWNROHZR.b")
	public static int field1438;

	@ObfuscatedName("XWNROHZR.d")
	public int field1440;

	@ObfuscatedName("XWNROHZR.e")
	public int field1441;

	@ObfuscatedName("XWNROHZR.l")
	public int field1448;

	@ObfuscatedName("XWNROHZR.m")
	public int field1449;

	@ObfuscatedName("XWNROHZR.n")
	public int field1450;

	@ObfuscatedName("XWNROHZR.g")
	public UVDKTGZK field1443;

	@ObfuscatedName("XWNROHZR.c")
	public static XWNROHZR[] field1439;

	@ObfuscatedName("XWNROHZR.a(LGWOEELWB;B)V")
	public static void method587(GWOEELWB arg0) {
		MLYYHULT var1 = new MLYYHULT(arg0.method249("spotanim.dat", null));
		field1438 = var1.method298();
		if (field1439 == null) {
			field1439 = new XWNROHZR[field1438];
		}

		for (int var2 = 0; var2 < field1438; var2++) {
			if (field1439[var2] == null) {
				field1439[var2] = new XWNROHZR();
			}

			field1439[var2].field1440 = var2;
			field1439[var2].method588(var1);
		}
	}

	@ObfuscatedName("XWNROHZR.a(LMLYYHULT;B)V")
	public void method588(MLYYHULT arg0) {
		while (true) {
			int var2 = arg0.method296();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1441 = arg0.method298();
			} else if (var2 == 2) {
				field1442 = arg0.method298();
				if (UVDKTGZK.field1357 != null) {
					field1443 = UVDKTGZK.field1357[field1442];
				}
			} else if (var2 == 4) {
				field1446 = arg0.method298();
			} else if (var2 == 5) {
				field1447 = arg0.method298();
			} else if (var2 == 6) {
				field1448 = arg0.method298();
			} else if (var2 == 7) {
				field1449 = arg0.method296();
			} else if (var2 == 8) {
				field1450 = arg0.method296();
			} else if (var2 >= 40 && var2 < 50) {
				field1444[var2 - 40] = arg0.method298();
			} else if (var2 >= 50 && var2 < 60) {
				field1445[var2 - 50] = arg0.method298();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("XWNROHZR.a()LCADBNSXE;")
	public CADBNSXE method589() {
		CADBNSXE var1 = (CADBNSXE) field1451.method538(field1440);
		if (var1 != null) {
			return var1;
		}

		CADBNSXE var2 = CADBNSXE.method11(field1441);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1444[0] != 0) {
				var2.method25(field1444[var3], field1445[var3]);
			}
		}

		field1451.method539(var2, field1440);
		return var2;
	}
}
