package deob;

@ObfuscatedName("QOKQYKHB")
public class QOKQYKHB {

	@ObfuscatedName("QOKQYKHB.i")
	public boolean field1121 = false;

	@ObfuscatedName("QOKQYKHB.j")
	public boolean field1122 = true;

	@ObfuscatedName("QOKQYKHB.l")
	public boolean field1124 = false;

	@ObfuscatedName("QOKQYKHB.o")
	public boolean field1127 = false;

	@ObfuscatedName("QOKQYKHB.p")
	public int field1128 = -1;

	@ObfuscatedName("QOKQYKHB.b")
	public static int field1114;

	@ObfuscatedName("QOKQYKHB.d")
	public static int field1116;

	@ObfuscatedName("QOKQYKHB.g")
	public int field1119;

	@ObfuscatedName("QOKQYKHB.h")
	public int field1120;

	@ObfuscatedName("QOKQYKHB.k")
	public int field1123;

	@ObfuscatedName("QOKQYKHB.m")
	public int field1125;

	@ObfuscatedName("QOKQYKHB.n")
	public int field1126;

	@ObfuscatedName("QOKQYKHB.f")
	public String field1118;

	@ObfuscatedName("QOKQYKHB.e")
	public static int[] field1117;

	@ObfuscatedName("QOKQYKHB.c")
	public static QOKQYKHB[] field1115;

	@ObfuscatedName("QOKQYKHB.a(LLYZBHNJP;I)V")
	public static void method377(LYZBHNJP arg0) {
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("varp.dat", null));
		field1116 = 0;
		field1114 = var1.method549();
		if (field1115 == null) {
			field1115 = new QOKQYKHB[field1114];
		}

		if (field1117 == null) {
			field1117 = new int[field1114];
		}

		for (int var2 = 0; var2 < field1114; var2++) {
			if (field1115[var2] == null) {
				field1115[var2] = new QOKQYKHB();
			}

			field1115[var2].method378(var2, var1);
		}

		if (var1.field1456.length != var1.field1457) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("QOKQYKHB.a(IILZOMNSJJM;)V")
	public void method378(int arg0, ZOMNSJJM arg1) {
		while (true) {
			int var3 = arg1.method547();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1119 = arg1.method547();
			} else if (var3 == 2) {
				field1120 = arg1.method547();
			} else if (var3 == 3) {
				field1121 = true;
				field1117[field1116++] = arg0;
			} else if (var3 == 4) {
				field1122 = false;
			} else if (var3 == 5) {
				field1123 = arg1.method549();
			} else if (var3 == 6) {
				field1124 = true;
			} else if (var3 == 7) {
				field1125 = arg1.method552();
			} else if (var3 == 8) {
				field1126 = 1;
				field1127 = true;
			} else if (var3 == 10) {
				field1118 = arg1.method554();
			} else if (var3 == 11) {
				field1127 = true;
			} else if (var3 == 12) {
				field1128 = arg1.method552();
			} else if (var3 == 13) {
				field1126 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
