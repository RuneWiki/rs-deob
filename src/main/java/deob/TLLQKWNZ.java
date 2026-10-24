package deob;

@ObfuscatedName("TLLQKWNZ")
public class TLLQKWNZ {

	@ObfuscatedName("TLLQKWNZ.j")
	public boolean field1399 = false;

	@ObfuscatedName("TLLQKWNZ.k")
	public boolean field1400 = true;

	@ObfuscatedName("TLLQKWNZ.m")
	public boolean field1402 = false;

	@ObfuscatedName("TLLQKWNZ.p")
	public boolean field1405 = false;

	@ObfuscatedName("TLLQKWNZ.q")
	public int field1406 = -1;

	@ObfuscatedName("TLLQKWNZ.r")
	public boolean field1407 = true;

	@ObfuscatedName("TLLQKWNZ.c")
	public static int field1392;

	@ObfuscatedName("TLLQKWNZ.e")
	public static int field1394;

	@ObfuscatedName("TLLQKWNZ.h")
	public int field1397;

	@ObfuscatedName("TLLQKWNZ.i")
	public int field1398;

	@ObfuscatedName("TLLQKWNZ.l")
	public int field1401;

	@ObfuscatedName("TLLQKWNZ.n")
	public int field1403;

	@ObfuscatedName("TLLQKWNZ.o")
	public int field1404;

	@ObfuscatedName("TLLQKWNZ.g")
	public String field1396;

	@ObfuscatedName("TLLQKWNZ.f")
	public static int[] field1395;

	@ObfuscatedName("TLLQKWNZ.d")
	public static TLLQKWNZ[] field1393;

	@ObfuscatedName("TLLQKWNZ.a(BLESUFCMYV;)V")
	public static void method512(ESUFCMYV arg0) {
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("varp.dat", null));
		field1394 = 0;
		field1392 = var1.method457();
		if (field1393 == null) {
			field1393 = new TLLQKWNZ[field1392];
		}

		if (field1395 == null) {
			field1395 = new int[field1392];
		}

		for (int var2 = 0; var2 < field1392; var2++) {
			if (field1393[var2] == null) {
				field1393[var2] = new TLLQKWNZ();
			}

			field1393[var2].method513(var1, var2);
		}

		if (var1.field1349.length != var1.field1350) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("TLLQKWNZ.a(LRGCGKKUR;II)V")
	public void method513(RGCGKKUR arg0, int arg1) {
		while (true) {
			int var3 = arg0.method455();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1397 = arg0.method455();
			} else if (var3 == 2) {
				field1398 = arg0.method455();
			} else if (var3 == 3) {
				field1399 = true;
				field1395[field1394++] = arg1;
			} else if (var3 == 4) {
				field1400 = false;
			} else if (var3 == 5) {
				field1401 = arg0.method457();
			} else if (var3 == 6) {
				field1402 = true;
			} else if (var3 == 7) {
				field1403 = arg0.method460();
			} else if (var3 == 8) {
				field1404 = 1;
				field1405 = true;
			} else if (var3 == 10) {
				field1396 = arg0.method462();
			} else if (var3 == 11) {
				field1405 = true;
			} else if (var3 == 12) {
				field1406 = arg0.method460();
			} else if (var3 == 13) {
				field1404 = 2;
				field1405 = true;
			} else if (var3 == 14) {
				field1407 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
