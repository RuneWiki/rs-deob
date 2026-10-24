package deob;

@ObfuscatedName("CNLXCYXM")
public class CNLXCYXM {

	@ObfuscatedName("CNLXCYXM.k")
	public boolean field494 = false;

	@ObfuscatedName("CNLXCYXM.l")
	public boolean field495 = true;

	@ObfuscatedName("CNLXCYXM.n")
	public boolean field497 = false;

	@ObfuscatedName("CNLXCYXM.q")
	public boolean field500 = false;

	@ObfuscatedName("CNLXCYXM.r")
	public int field501 = -1;

	@ObfuscatedName("CNLXCYXM.d")
	public static int field487;

	@ObfuscatedName("CNLXCYXM.f")
	public static int field489;

	@ObfuscatedName("CNLXCYXM.i")
	public int field492;

	@ObfuscatedName("CNLXCYXM.j")
	public int field493;

	@ObfuscatedName("CNLXCYXM.m")
	public int field496;

	@ObfuscatedName("CNLXCYXM.o")
	public int field498;

	@ObfuscatedName("CNLXCYXM.p")
	public int field499;

	@ObfuscatedName("CNLXCYXM.h")
	public String field491;

	@ObfuscatedName("CNLXCYXM.g")
	public static int[] field490;

	@ObfuscatedName("CNLXCYXM.e")
	public static CNLXCYXM[] field488;

	@ObfuscatedName("CNLXCYXM.a(LCXFTMSCH;B)V")
	public static void method162(CXFTMSCH arg0) {
		MQZHAILV var1 = new MQZHAILV(arg0.method176("varp.dat", null));
		field489 = 0;
		field487 = var1.method327();
		if (field488 == null) {
			field488 = new CNLXCYXM[field487];
		}

		if (field490 == null) {
			field490 = new int[field487];
		}

		for (int var2 = 0; var2 < field487; var2++) {
			if (field488[var2] == null) {
				field488[var2] = new CNLXCYXM();
			}

			field488[var2].method163(var2, var1);
		}

		if (var1.field796.length != var1.field797) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("CNLXCYXM.a(BILMQZHAILV;)V")
	public void method163(int arg0, MQZHAILV arg1) {
		while (true) {
			int var3 = arg1.method325();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field492 = arg1.method325();
			} else if (var3 == 2) {
				field493 = arg1.method325();
			} else if (var3 == 3) {
				field494 = true;
				field490[field489++] = arg0;
			} else if (var3 == 4) {
				field495 = false;
			} else if (var3 == 5) {
				field496 = arg1.method327();
			} else if (var3 == 6) {
				field497 = true;
			} else if (var3 == 7) {
				field498 = arg1.method330();
			} else if (var3 == 8) {
				field499 = 1;
				field500 = true;
			} else if (var3 == 10) {
				field491 = arg1.method332();
			} else if (var3 == 11) {
				field500 = true;
			} else if (var3 == 12) {
				field501 = arg1.method330();
			} else if (var3 == 13) {
				field499 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
