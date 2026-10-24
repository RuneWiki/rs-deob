package deob;

@ObfuscatedName("VCTVXSNH")
public class VCTVXSNH {

	@ObfuscatedName("VCTVXSNH.f")
	public int field1351 = -1;

	@ObfuscatedName("VCTVXSNH.h")
	public int[] field1353 = new int[6];

	@ObfuscatedName("VCTVXSNH.i")
	public int[] field1354 = new int[6];

	@ObfuscatedName("VCTVXSNH.j")
	public int field1355 = 128;

	@ObfuscatedName("VCTVXSNH.k")
	public int field1356 = 128;

	@ObfuscatedName("VCTVXSNH.o")
	public static AKUDQPZE field1360 = new AKUDQPZE(30);

	@ObfuscatedName("VCTVXSNH.b")
	public static int field1347;

	@ObfuscatedName("VCTVXSNH.d")
	public int field1349;

	@ObfuscatedName("VCTVXSNH.e")
	public int field1350;

	@ObfuscatedName("VCTVXSNH.l")
	public int field1357;

	@ObfuscatedName("VCTVXSNH.m")
	public int field1358;

	@ObfuscatedName("VCTVXSNH.n")
	public int field1359;

	@ObfuscatedName("VCTVXSNH.g")
	public BZONLWPM field1352;

	@ObfuscatedName("VCTVXSNH.c")
	public static VCTVXSNH[] field1348;

	@ObfuscatedName("VCTVXSNH.a(ILTKEGJSFV;)V")
	public static void method553(TKEGJSFV arg0) {
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("spotanim.dat", null));
		field1347 = var1.method263();
		if (field1348 == null) {
			field1348 = new VCTVXSNH[field1347];
		}

		for (int var2 = 0; var2 < field1347; var2++) {
			if (field1348[var2] == null) {
				field1348[var2] = new VCTVXSNH();
			}

			field1348[var2].field1349 = var2;
			field1348[var2].method554(var1);
		}
	}

	@ObfuscatedName("VCTVXSNH.a(LEGCCHUZS;Z)V")
	public void method554(EGCCHUZS arg0) {
		while (true) {
			int var2 = arg0.method261();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1350 = arg0.method263();
			} else if (var2 == 2) {
				field1351 = arg0.method263();
				if (BZONLWPM.field53 != null) {
					field1352 = BZONLWPM.field53[field1351];
				}
			} else if (var2 == 4) {
				field1355 = arg0.method263();
			} else if (var2 == 5) {
				field1356 = arg0.method263();
			} else if (var2 == 6) {
				field1357 = arg0.method263();
			} else if (var2 == 7) {
				field1358 = arg0.method261();
			} else if (var2 == 8) {
				field1359 = arg0.method261();
			} else if (var2 >= 40 && var2 < 50) {
				field1353[var2 - 40] = arg0.method263();
			} else if (var2 >= 50 && var2 < 60) {
				field1354[var2 - 50] = arg0.method263();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("VCTVXSNH.a()LIGXVZOHI;")
	public IGXVZOHI method555() {
		IGXVZOHI var1 = (IGXVZOHI) field1360.method1(field1349);
		if (var1 != null) {
			return var1;
		}

		IGXVZOHI var2 = IGXVZOHI.method354(field1350);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1353[0] != 0) {
				var2.method368(field1353[var3], field1354[var3]);
			}
		}

		field1360.method2(var2, field1349);
		return var2;
	}
}
