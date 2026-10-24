package deob;

@ObfuscatedName("XBHMGKWV")
public class XBHMGKWV {

	@ObfuscatedName("XBHMGKWV.h")
	public boolean field1359 = false;

	@ObfuscatedName("XBHMGKWV.i")
	public int field1360 = -1;

	@ObfuscatedName("XBHMGKWV.b")
	public static int field1353;

	@ObfuscatedName("XBHMGKWV.e")
	public int field1356;

	@ObfuscatedName("XBHMGKWV.f")
	public int field1357;

	@ObfuscatedName("XBHMGKWV.g")
	public int field1358;

	@ObfuscatedName("XBHMGKWV.j")
	public int field1361;

	@ObfuscatedName("XBHMGKWV.d")
	public String field1355;

	@ObfuscatedName("XBHMGKWV.c")
	public static XBHMGKWV[] field1354;

	@ObfuscatedName("XBHMGKWV.a(ILCVNWKEAW;)V")
	public static void method507(CVNWKEAW arg0) {
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("varbit.dat", null));
		field1353 = var1.method523();
		if (field1354 == null) {
			field1354 = new XBHMGKWV[field1353];
		}

		for (int var2 = 0; var2 < field1353; var2++) {
			if (field1354[var2] == null) {
				field1354[var2] = new XBHMGKWV();
			}

			field1354[var2].method508(var2, var1);

			if (field1354[var2].field1359) {
				NJBQYBAL.field983[field1354[var2].field1356].field995 = true;
			}
		}

		if (var1.field1366.length != var1.field1367) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("XBHMGKWV.a(ILXOUQUKZW;B)V")
	public void method508(int arg0, XOUQUKZW arg1) {
		while (true) {
			int var3 = arg1.method521();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1356 = arg1.method523();
				field1357 = arg1.method521();
				field1358 = arg1.method521();
			} else if (var3 == 10) {
				field1355 = arg1.method528();
			} else if (var3 == 2) {
				field1359 = true;
			} else if (var3 == 3) {
				field1360 = arg1.method526();
			} else if (var3 == 4) {
				field1361 = arg1.method526();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
