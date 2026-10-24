package deob;

@ObfuscatedName("CJICJSIY")
public class CJICJSIY {

	@ObfuscatedName("CJICJSIY.i")
	public boolean field106 = false;

	@ObfuscatedName("CJICJSIY.j")
	public boolean field107 = true;

	@ObfuscatedName("CJICJSIY.l")
	public boolean field109 = false;

	@ObfuscatedName("CJICJSIY.o")
	public boolean field112 = false;

	@ObfuscatedName("CJICJSIY.p")
	public int field113 = -1;

	@ObfuscatedName("CJICJSIY.q")
	public boolean field114 = true;

	@ObfuscatedName("CJICJSIY.d")
	public static int field101;

	@ObfuscatedName("CJICJSIY.g")
	public int field104;

	@ObfuscatedName("CJICJSIY.h")
	public int field105;

	@ObfuscatedName("CJICJSIY.k")
	public int field108;

	@ObfuscatedName("CJICJSIY.m")
	public int field110;

	@ObfuscatedName("CJICJSIY.n")
	public int field111;

	@ObfuscatedName("CJICJSIY.b")
	public static int field99;

	@ObfuscatedName("CJICJSIY.f")
	public String field103;

	@ObfuscatedName("CJICJSIY.e")
	public static int[] field102;

	@ObfuscatedName("CJICJSIY.c")
	public static CJICJSIY[] field100;

	@ObfuscatedName("CJICJSIY.a(BLXOJZVVDK;)V")
	public static void method14(XOJZVVDK arg0) {
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("varp.dat", null));
		field101 = 0;
		field99 = var1.method342();
		if (field100 == null) {
			field100 = new CJICJSIY[field99];
		}

		if (field102 == null) {
			field102 = new int[field99];
		}

		for (int var2 = 0; var2 < field99; var2++) {
			if (field100[var2] == null) {
				field100[var2] = new CJICJSIY();
			}

			field100[var2].method15(var1, var2);
		}

		if (var1.field1090.length != var1.field1091) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("CJICJSIY.a(ILPQBRPYKE;I)V")
	public void method15(PQBRPYKE arg0, int arg1) {
		while (true) {
			int var3 = arg0.method340();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field104 = arg0.method340();
			} else if (var3 == 2) {
				field105 = arg0.method340();
			} else if (var3 == 3) {
				field106 = true;
				field102[field101++] = arg1;
			} else if (var3 == 4) {
				field107 = false;
			} else if (var3 == 5) {
				field108 = arg0.method342();
			} else if (var3 == 6) {
				field109 = true;
			} else if (var3 == 7) {
				field110 = arg0.method345();
			} else if (var3 == 8) {
				field111 = 1;
				field112 = true;
			} else if (var3 == 10) {
				field103 = arg0.method347();
			} else if (var3 == 11) {
				field112 = true;
			} else if (var3 == 12) {
				field113 = arg0.method345();
			} else if (var3 == 13) {
				field111 = 2;
				field112 = true;
			} else if (var3 == 14) {
				field114 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
