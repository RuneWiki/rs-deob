package deob;

@ObfuscatedName("XDAGNEWI")
public class XDAGNEWI {

	@ObfuscatedName("XDAGNEWI.i")
	public boolean field1455 = false;

	@ObfuscatedName("XDAGNEWI.j")
	public boolean field1456 = true;

	@ObfuscatedName("XDAGNEWI.l")
	public boolean field1458 = false;

	@ObfuscatedName("XDAGNEWI.o")
	public boolean field1461 = false;

	@ObfuscatedName("XDAGNEWI.p")
	public int field1462 = -1;

	@ObfuscatedName("XDAGNEWI.q")
	public boolean field1463 = true;

	@ObfuscatedName("XDAGNEWI.b")
	public static int field1448;

	@ObfuscatedName("XDAGNEWI.d")
	public static int field1450;

	@ObfuscatedName("XDAGNEWI.g")
	public int field1453;

	@ObfuscatedName("XDAGNEWI.h")
	public int field1454;

	@ObfuscatedName("XDAGNEWI.k")
	public int field1457;

	@ObfuscatedName("XDAGNEWI.m")
	public int field1459;

	@ObfuscatedName("XDAGNEWI.n")
	public int field1460;

	@ObfuscatedName("XDAGNEWI.f")
	public String field1452;

	@ObfuscatedName("XDAGNEWI.e")
	public static int[] field1451;

	@ObfuscatedName("XDAGNEWI.c")
	public static XDAGNEWI[] field1449;

	@ObfuscatedName("XDAGNEWI.a(LLKPVZAQN;I)V")
	public static void method564(LKPVZAQN arg0) {
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("varp.dat", null));
		field1450 = 0;
		field1448 = var1.method517();
		if (field1449 == null) {
			field1449 = new XDAGNEWI[field1448];
		}

		if (field1451 == null) {
			field1451 = new int[field1448];
		}

		for (int var2 = 0; var2 < field1448; var2++) {
			if (field1449[var2] == null) {
				field1449[var2] = new XDAGNEWI();
			}

			field1449[var2].method565(var1, var2);
		}

		if (var1.field1400.length != var1.field1401) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("XDAGNEWI.a(LWBEWPIXO;II)V")
	public void method565(WBEWPIXO arg0, int arg1) {
		while (true) {
			int var3 = arg0.method515();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1453 = arg0.method515();
			} else if (var3 == 2) {
				field1454 = arg0.method515();
			} else if (var3 == 3) {
				field1455 = true;
				field1451[field1450++] = arg1;
			} else if (var3 == 4) {
				field1456 = false;
			} else if (var3 == 5) {
				field1457 = arg0.method517();
			} else if (var3 == 6) {
				field1458 = true;
			} else if (var3 == 7) {
				field1459 = arg0.method520();
			} else if (var3 == 8) {
				field1460 = 1;
				field1461 = true;
			} else if (var3 == 10) {
				field1452 = arg0.method522();
			} else if (var3 == 11) {
				field1461 = true;
			} else if (var3 == 12) {
				field1462 = arg0.method520();
			} else if (var3 == 13) {
				field1460 = 2;
				field1461 = true;
			} else if (var3 == 14) {
				field1463 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
