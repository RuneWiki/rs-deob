package deob;

@ObfuscatedName("ATZMJNZU")
public class ATZMJNZU {

	@ObfuscatedName("ATZMJNZU.j")
	public boolean field22 = false;

	@ObfuscatedName("ATZMJNZU.k")
	public boolean field23 = true;

	@ObfuscatedName("ATZMJNZU.m")
	public boolean field25 = false;

	@ObfuscatedName("ATZMJNZU.p")
	public boolean field28 = false;

	@ObfuscatedName("ATZMJNZU.q")
	public int field29 = -1;

	@ObfuscatedName("ATZMJNZU.r")
	public boolean field30 = true;

	@ObfuscatedName("ATZMJNZU.c")
	public static int field15;

	@ObfuscatedName("ATZMJNZU.e")
	public static int field17;

	@ObfuscatedName("ATZMJNZU.h")
	public int field20;

	@ObfuscatedName("ATZMJNZU.i")
	public int field21;

	@ObfuscatedName("ATZMJNZU.l")
	public int field24;

	@ObfuscatedName("ATZMJNZU.n")
	public int field26;

	@ObfuscatedName("ATZMJNZU.o")
	public int field27;

	@ObfuscatedName("ATZMJNZU.g")
	public String field19;

	@ObfuscatedName("ATZMJNZU.f")
	public static int[] field18;

	@ObfuscatedName("ATZMJNZU.d")
	public static ATZMJNZU[] field16;

	@ObfuscatedName("ATZMJNZU.a(ILUUIGNTAD;)V")
	public static void method15(UUIGNTAD arg0) {
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("varp.dat", null));
		field17 = 0;
		field15 = var1.method196();
		if (field16 == null) {
			field16 = new ATZMJNZU[field15];
		}

		if (field18 == null) {
			field18 = new int[field15];
		}

		for (int var2 = 0; var2 < field15; var2++) {
			if (field16[var2] == null) {
				field16[var2] = new ATZMJNZU();
			}

			field16[var2].method16(var1, var2);
		}

		if (var1.field539.length != var1.field540) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("ATZMJNZU.a(LCMGGUSPR;II)V")
	public void method16(CMGGUSPR arg0, int arg1) {
		while (true) {
			int var3 = arg0.method194();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field20 = arg0.method194();
			} else if (var3 == 2) {
				field21 = arg0.method194();
			} else if (var3 == 3) {
				field22 = true;
				field18[field17++] = arg1;
			} else if (var3 == 4) {
				field23 = false;
			} else if (var3 == 5) {
				field24 = arg0.method196();
			} else if (var3 == 6) {
				field25 = true;
			} else if (var3 == 7) {
				field26 = arg0.method199();
			} else if (var3 == 8) {
				field27 = 1;
				field28 = true;
			} else if (var3 == 10) {
				field19 = arg0.method201();
			} else if (var3 == 11) {
				field28 = true;
			} else if (var3 == 12) {
				field29 = arg0.method199();
			} else if (var3 == 13) {
				field27 = 2;
				field28 = true;
			} else if (var3 == 14) {
				field30 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
