package deob;

@ObfuscatedName("CIVOPMKV")
public class CIVOPMKV {

	@ObfuscatedName("CIVOPMKV.g")
	public int field117 = -1;

	@ObfuscatedName("CIVOPMKV.i")
	public int[] field119 = new int[6];

	@ObfuscatedName("CIVOPMKV.j")
	public int[] field120 = new int[6];

	@ObfuscatedName("CIVOPMKV.k")
	public int field121 = 128;

	@ObfuscatedName("CIVOPMKV.l")
	public int field122 = 128;

	@ObfuscatedName("CIVOPMKV.p")
	public static WMYPWVZI field126 = new WMYPWVZI(30);

	@ObfuscatedName("CIVOPMKV.c")
	public static int field113;

	@ObfuscatedName("CIVOPMKV.e")
	public int field115;

	@ObfuscatedName("CIVOPMKV.f")
	public int field116;

	@ObfuscatedName("CIVOPMKV.m")
	public int field123;

	@ObfuscatedName("CIVOPMKV.n")
	public int field124;

	@ObfuscatedName("CIVOPMKV.o")
	public int field125;

	@ObfuscatedName("CIVOPMKV.h")
	public ZKWMIVTX field118;

	@ObfuscatedName("CIVOPMKV.d")
	public static CIVOPMKV[] field114;

	@ObfuscatedName("CIVOPMKV.a(LBYZSQZUF;Z)V")
	public static void method30(BYZSQZUF arg0) {
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("spotanim.dat", null));
		field113 = var1.method240();
		if (field114 == null) {
			field114 = new CIVOPMKV[field113];
		}

		for (int var2 = 0; var2 < field113; var2++) {
			if (field114[var2] == null) {
				field114[var2] = new CIVOPMKV();
			}

			field114[var2].field115 = var2;
			field114[var2].method31(var1);
		}
	}

	@ObfuscatedName("CIVOPMKV.a(ILIMUIZRAF;)V")
	public void method31(IMUIZRAF arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field116 = arg0.method240();
			} else if (var2 == 2) {
				field117 = arg0.method240();
				if (ZKWMIVTX.field1461 != null) {
					field118 = ZKWMIVTX.field1461[field117];
				}
			} else if (var2 == 4) {
				field121 = arg0.method240();
			} else if (var2 == 5) {
				field122 = arg0.method240();
			} else if (var2 == 6) {
				field123 = arg0.method240();
			} else if (var2 == 7) {
				field124 = arg0.method238();
			} else if (var2 == 8) {
				field125 = arg0.method238();
			} else if (var2 >= 40 && var2 < 50) {
				field119[var2 - 40] = arg0.method240();
			} else if (var2 >= 50 && var2 < 60) {
				field120[var2 - 50] = arg0.method240();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("CIVOPMKV.a()LYABPKWWG;")
	public YABPKWWG method32() {
		YABPKWWG var1 = (YABPKWWG) field126.method525(field115);
		if (var1 != null) {
			return var1;
		}

		YABPKWWG var2 = YABPKWWG.method548(field116);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field119[0] != 0) {
				var2.method562(field119[var3], field120[var3]);
			}
		}

		field126.method526(field115, var2);
		return var2;
	}
}
