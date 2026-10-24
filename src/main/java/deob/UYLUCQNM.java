package deob;

@ObfuscatedName("UYLUCQNM")
public class UYLUCQNM {

	@ObfuscatedName("UYLUCQNM.f")
	public int field1367 = -1;

	@ObfuscatedName("UYLUCQNM.h")
	public int[] field1369 = new int[6];

	@ObfuscatedName("UYLUCQNM.i")
	public int[] field1370 = new int[6];

	@ObfuscatedName("UYLUCQNM.j")
	public int field1371 = 128;

	@ObfuscatedName("UYLUCQNM.k")
	public int field1372 = 128;

	@ObfuscatedName("UYLUCQNM.o")
	public static ASORKPAH field1376 = new ASORKPAH(30);

	@ObfuscatedName("UYLUCQNM.b")
	public static int field1363;

	@ObfuscatedName("UYLUCQNM.d")
	public int field1365;

	@ObfuscatedName("UYLUCQNM.e")
	public int field1366;

	@ObfuscatedName("UYLUCQNM.l")
	public int field1373;

	@ObfuscatedName("UYLUCQNM.m")
	public int field1374;

	@ObfuscatedName("UYLUCQNM.n")
	public int field1375;

	@ObfuscatedName("UYLUCQNM.g")
	public KIRTNGZJ field1368;

	@ObfuscatedName("UYLUCQNM.c")
	public static UYLUCQNM[] field1364;

	@ObfuscatedName("UYLUCQNM.a(ZLEAXVDNXA;)V")
	public static void method562(EAXVDNXA arg0) {
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("spotanim.dat", null));
		field1363 = var1.method46();
		if (field1364 == null) {
			field1364 = new UYLUCQNM[field1363];
		}

		for (int var2 = 0; var2 < field1363; var2++) {
			if (field1364[var2] == null) {
				field1364[var2] = new UYLUCQNM();
			}

			field1364[var2].field1365 = var2;
			field1364[var2].method563(var1);
		}
	}

	@ObfuscatedName("UYLUCQNM.a(BLCKBTFRZM;)V")
	public void method563(CKBTFRZM arg0) {
		while (true) {
			int var2 = arg0.method44();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1366 = arg0.method46();
			} else if (var2 == 2) {
				field1367 = arg0.method46();
				if (KIRTNGZJ.field1015 != null) {
					field1368 = KIRTNGZJ.field1015[field1367];
				}
			} else if (var2 == 4) {
				field1371 = arg0.method46();
			} else if (var2 == 5) {
				field1372 = arg0.method46();
			} else if (var2 == 6) {
				field1373 = arg0.method46();
			} else if (var2 == 7) {
				field1374 = arg0.method44();
			} else if (var2 == 8) {
				field1375 = arg0.method44();
			} else if (var2 >= 40 && var2 < 50) {
				field1369[var2 - 40] = arg0.method46();
			} else if (var2 >= 50 && var2 < 60) {
				field1370[var2 - 50] = arg0.method46();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("UYLUCQNM.a()LGFYXEFQY;")
	public GFYXEFQY method564() {
		GFYXEFQY var1 = (GFYXEFQY) field1376.method1(field1365);
		if (var1 != null) {
			return var1;
		}

		GFYXEFQY var2 = GFYXEFQY.method341(field1366);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1369[0] != 0) {
				var2.method355(field1369[var3], field1370[var3]);
			}
		}

		field1376.method2(field1365, var2);
		return var2;
	}
}
