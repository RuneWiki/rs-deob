package deob;

@ObfuscatedName("XESCWZPS")
public class XESCWZPS {

	@ObfuscatedName("XESCWZPS.i")
	public boolean field1430 = false;

	@ObfuscatedName("XESCWZPS.j")
	public boolean field1431 = true;

	@ObfuscatedName("XESCWZPS.l")
	public boolean field1433 = false;

	@ObfuscatedName("XESCWZPS.o")
	public boolean field1436 = false;

	@ObfuscatedName("XESCWZPS.p")
	public int field1437 = -1;

	@ObfuscatedName("XESCWZPS.q")
	public boolean field1438 = true;

	@ObfuscatedName("XESCWZPS.b")
	public static int field1423;

	@ObfuscatedName("XESCWZPS.d")
	public static int field1425;

	@ObfuscatedName("XESCWZPS.g")
	public int field1428;

	@ObfuscatedName("XESCWZPS.h")
	public int field1429;

	@ObfuscatedName("XESCWZPS.k")
	public int field1432;

	@ObfuscatedName("XESCWZPS.m")
	public int field1434;

	@ObfuscatedName("XESCWZPS.n")
	public int field1435;

	@ObfuscatedName("XESCWZPS.f")
	public String field1427;

	@ObfuscatedName("XESCWZPS.e")
	public static int[] field1426;

	@ObfuscatedName("XESCWZPS.c")
	public static XESCWZPS[] field1424;

	@ObfuscatedName("XESCWZPS.a(ILTXPLZUUI;)V")
	public static void method574(TXPLZUUI arg0) {
		PKHWFJLM var1 = new PKHWFJLM(arg0.method506("varp.dat", null));
		field1425 = 0;
		field1423 = var1.method332();
		if (field1424 == null) {
			field1424 = new XESCWZPS[field1423];
		}

		if (field1426 == null) {
			field1426 = new int[field1423];
		}

		for (int var2 = 0; var2 < field1423; var2++) {
			if (field1424[var2] == null) {
				field1424[var2] = new XESCWZPS();
			}

			field1424[var2].method575(var2, var1);
		}

		if (var1.field970.length != var1.field971) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("XESCWZPS.a(ILPKHWFJLM;I)V")
	public void method575(int arg0, PKHWFJLM arg1) {
		while (true) {
			int var3 = arg1.method330();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1428 = arg1.method330();
			} else if (var3 == 2) {
				field1429 = arg1.method330();
			} else if (var3 == 3) {
				field1430 = true;
				field1426[field1425++] = arg0;
			} else if (var3 == 4) {
				field1431 = false;
			} else if (var3 == 5) {
				field1432 = arg1.method332();
			} else if (var3 == 6) {
				field1433 = true;
			} else if (var3 == 7) {
				field1434 = arg1.method335();
			} else if (var3 == 8) {
				field1435 = 1;
				field1436 = true;
			} else if (var3 == 10) {
				field1427 = arg1.method337();
			} else if (var3 == 11) {
				field1436 = true;
			} else if (var3 == 12) {
				field1437 = arg1.method335();
			} else if (var3 == 13) {
				field1435 = 2;
				field1436 = true;
			} else if (var3 == 14) {
				field1438 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
