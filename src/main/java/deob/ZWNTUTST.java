package deob;

@ObfuscatedName("ZWNTUTST")
public class ZWNTUTST {

	@ObfuscatedName("ZWNTUTST.h")
	public boolean field1479 = false;

	@ObfuscatedName("ZWNTUTST.i")
	public boolean field1480 = true;

	@ObfuscatedName("ZWNTUTST.k")
	public boolean field1482 = false;

	@ObfuscatedName("ZWNTUTST.n")
	public boolean field1485 = false;

	@ObfuscatedName("ZWNTUTST.o")
	public int field1486 = -1;

	@ObfuscatedName("ZWNTUTST.p")
	public boolean field1487 = true;

	@ObfuscatedName("ZWNTUTST.a")
	public static int field1472;

	@ObfuscatedName("ZWNTUTST.c")
	public static int field1474;

	@ObfuscatedName("ZWNTUTST.f")
	public int field1477;

	@ObfuscatedName("ZWNTUTST.g")
	public int field1478;

	@ObfuscatedName("ZWNTUTST.j")
	public int field1481;

	@ObfuscatedName("ZWNTUTST.l")
	public int field1483;

	@ObfuscatedName("ZWNTUTST.m")
	public int field1484;

	@ObfuscatedName("ZWNTUTST.e")
	public String field1476;

	@ObfuscatedName("ZWNTUTST.d")
	public static int[] field1475;

	@ObfuscatedName("ZWNTUTST.b")
	public static ZWNTUTST[] field1473;

	@ObfuscatedName("ZWNTUTST.a(ILQDHHNYHL;)V")
	public static void method597(QDHHNYHL arg0) {
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("varp.dat", null));
		field1474 = 0;
		field1472 = var1.method422();
		if (field1473 == null) {
			field1473 = new ZWNTUTST[field1472];
		}

		if (field1475 == null) {
			field1475 = new int[field1472];
		}

		for (int var2 = 0; var2 < field1472; var2++) {
			if (field1473[var2] == null) {
				field1473[var2] = new ZWNTUTST();
			}

			field1473[var2].method598(var1, var2);
		}

		if (var1.field1081.length != var1.field1082) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("ZWNTUTST.a(BLPGNBHFUF;I)V")
	public void method598(PGNBHFUF arg0, int arg1) {
		while (true) {
			int var3 = arg0.method420();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1477 = arg0.method420();
			} else if (var3 == 2) {
				field1478 = arg0.method420();
			} else if (var3 == 3) {
				field1479 = true;
				field1475[field1474++] = arg1;
			} else if (var3 == 4) {
				field1480 = false;
			} else if (var3 == 5) {
				field1481 = arg0.method422();
			} else if (var3 == 6) {
				field1482 = true;
			} else if (var3 == 7) {
				field1483 = arg0.method425();
			} else if (var3 == 8) {
				field1484 = 1;
				field1485 = true;
			} else if (var3 == 10) {
				field1476 = arg0.method427();
			} else if (var3 == 11) {
				field1485 = true;
			} else if (var3 == 12) {
				field1486 = arg0.method425();
			} else if (var3 == 13) {
				field1484 = 2;
				field1485 = true;
			} else if (var3 == 14) {
				field1487 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
