package deob;

@ObfuscatedName("BUSRYWAJ")
public class BUSRYWAJ {

	@ObfuscatedName("BUSRYWAJ.i")
	public boolean field127 = false;

	@ObfuscatedName("BUSRYWAJ.j")
	public boolean field128 = true;

	@ObfuscatedName("BUSRYWAJ.l")
	public boolean field130 = false;

	@ObfuscatedName("BUSRYWAJ.o")
	public boolean field133 = false;

	@ObfuscatedName("BUSRYWAJ.p")
	public int field134 = -1;

	@ObfuscatedName("BUSRYWAJ.b")
	public static int field120;

	@ObfuscatedName("BUSRYWAJ.d")
	public static int field122;

	@ObfuscatedName("BUSRYWAJ.g")
	public int field125;

	@ObfuscatedName("BUSRYWAJ.h")
	public int field126;

	@ObfuscatedName("BUSRYWAJ.k")
	public int field129;

	@ObfuscatedName("BUSRYWAJ.m")
	public int field131;

	@ObfuscatedName("BUSRYWAJ.n")
	public int field132;

	@ObfuscatedName("BUSRYWAJ.f")
	public String field124;

	@ObfuscatedName("BUSRYWAJ.e")
	public static int[] field123;

	@ObfuscatedName("BUSRYWAJ.c")
	public static BUSRYWAJ[] field121;

	@ObfuscatedName("BUSRYWAJ.a(LOTSGNSQM;Z)V")
	public static void method19(OTSGNSQM arg0) {
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("varp.dat", null));
		field122 = 0;
		field120 = var1.method551();
		if (field121 == null) {
			field121 = new BUSRYWAJ[field120];
		}

		if (field123 == null) {
			field123 = new int[field120];
		}

		for (int var2 = 0; var2 < field120; var2++) {
			if (field121[var2] == null) {
				field121[var2] = new BUSRYWAJ();
			}

			field121[var2].method20(var1, var2);
		}

		if (var1.field1392.length != var1.field1393) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("BUSRYWAJ.a(BLYOXDZEVD;I)V")
	public void method20(YOXDZEVD arg0, int arg1) {
		while (true) {
			int var3 = arg0.method549();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field125 = arg0.method549();
			} else if (var3 == 2) {
				field126 = arg0.method549();
			} else if (var3 == 3) {
				field127 = true;
				field123[field122++] = arg1;
			} else if (var3 == 4) {
				field128 = false;
			} else if (var3 == 5) {
				field129 = arg0.method551();
			} else if (var3 == 6) {
				field130 = true;
			} else if (var3 == 7) {
				field131 = arg0.method554();
			} else if (var3 == 8) {
				field132 = 1;
				field133 = true;
			} else if (var3 == 10) {
				field124 = arg0.method556();
			} else if (var3 == 11) {
				field133 = true;
			} else if (var3 == 12) {
				field134 = arg0.method554();
			} else if (var3 == 13) {
				field132 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
