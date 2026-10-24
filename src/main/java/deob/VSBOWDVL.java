package deob;

@ObfuscatedName("VSBOWDVL")
public class VSBOWDVL {

	@ObfuscatedName("VSBOWDVL.g")
	public int field1383 = -1;

	@ObfuscatedName("VSBOWDVL.i")
	public int[] field1385 = new int[6];

	@ObfuscatedName("VSBOWDVL.j")
	public int[] field1386 = new int[6];

	@ObfuscatedName("VSBOWDVL.k")
	public int field1387 = 128;

	@ObfuscatedName("VSBOWDVL.l")
	public int field1388 = 128;

	@ObfuscatedName("VSBOWDVL.p")
	public static JLTMYUOM field1392 = new JLTMYUOM(30);

	@ObfuscatedName("VSBOWDVL.c")
	public static int field1379;

	@ObfuscatedName("VSBOWDVL.e")
	public int field1381;

	@ObfuscatedName("VSBOWDVL.f")
	public int field1382;

	@ObfuscatedName("VSBOWDVL.m")
	public int field1389;

	@ObfuscatedName("VSBOWDVL.n")
	public int field1390;

	@ObfuscatedName("VSBOWDVL.o")
	public int field1391;

	@ObfuscatedName("VSBOWDVL.h")
	public GMRGYXFL field1384;

	@ObfuscatedName("VSBOWDVL.d")
	public static VSBOWDVL[] field1380;

	@ObfuscatedName("VSBOWDVL.a(ILQKFGLETG;)V")
	public static void method517(QKFGLETG arg0) {
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("spotanim.dat", null));
		field1379 = var1.method536();
		if (field1380 == null) {
			field1380 = new VSBOWDVL[field1379];
		}

		for (int var2 = 0; var2 < field1379; var2++) {
			if (field1380[var2] == null) {
				field1380[var2] = new VSBOWDVL();
			}

			field1380[var2].field1381 = var2;
			field1380[var2].method518(var1);
		}
	}

	@ObfuscatedName("VSBOWDVL.a(BLXJCNBMKS;)V")
	public void method518(XJCNBMKS arg0) {
		while (true) {
			int var2 = arg0.method534();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1382 = arg0.method536();
			} else if (var2 == 2) {
				field1383 = arg0.method536();
				if (GMRGYXFL.field720 != null) {
					field1384 = GMRGYXFL.field720[field1383];
				}
			} else if (var2 == 4) {
				field1387 = arg0.method536();
			} else if (var2 == 5) {
				field1388 = arg0.method536();
			} else if (var2 == 6) {
				field1389 = arg0.method536();
			} else if (var2 == 7) {
				field1390 = arg0.method534();
			} else if (var2 == 8) {
				field1391 = arg0.method534();
			} else if (var2 >= 40 && var2 < 50) {
				field1385[var2 - 40] = arg0.method536();
			} else if (var2 >= 50 && var2 < 60) {
				field1386[var2 - 50] = arg0.method536();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("VSBOWDVL.a()LFUTAQMCE;")
	public FUTAQMCE method519() {
		FUTAQMCE var1 = (FUTAQMCE) field1392.method297(field1381);
		if (var1 != null) {
			return var1;
		}

		FUTAQMCE var2 = FUTAQMCE.method250(field1382);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1385[0] != 0) {
				var2.method264(field1385[var3], field1386[var3]);
			}
		}

		field1392.method298(field1381, var2);
		return var2;
	}
}
