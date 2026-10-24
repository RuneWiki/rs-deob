package deob;

@ObfuscatedName("ONRKYVGF")
public class ONRKYVGF {

	@ObfuscatedName("ONRKYVGF.j")
	public boolean field926 = false;

	@ObfuscatedName("ONRKYVGF.k")
	public boolean field927 = true;

	@ObfuscatedName("ONRKYVGF.m")
	public boolean field929 = false;

	@ObfuscatedName("ONRKYVGF.p")
	public boolean field932 = false;

	@ObfuscatedName("ONRKYVGF.q")
	public int field933 = -1;

	@ObfuscatedName("ONRKYVGF.r")
	public boolean field934 = true;

	@ObfuscatedName("ONRKYVGF.c")
	public static int field919;

	@ObfuscatedName("ONRKYVGF.e")
	public static int field921;

	@ObfuscatedName("ONRKYVGF.h")
	public int field924;

	@ObfuscatedName("ONRKYVGF.i")
	public int field925;

	@ObfuscatedName("ONRKYVGF.l")
	public int field928;

	@ObfuscatedName("ONRKYVGF.n")
	public int field930;

	@ObfuscatedName("ONRKYVGF.o")
	public int field931;

	@ObfuscatedName("ONRKYVGF.g")
	public String field923;

	@ObfuscatedName("ONRKYVGF.f")
	public static int[] field922;

	@ObfuscatedName("ONRKYVGF.d")
	public static ONRKYVGF[] field920;

	@ObfuscatedName("ONRKYVGF.a(ZLVSQMPWOM;)V")
	public static void method361(VSQMPWOM arg0) {
		BFQIDHPO var1 = new BFQIDHPO(arg0.method526("varp.dat", null));
		field921 = 0;
		field919 = var1.method56();
		if (field920 == null) {
			field920 = new ONRKYVGF[field919];
		}

		if (field922 == null) {
			field922 = new int[field919];
		}

		for (int var2 = 0; var2 < field919; var2++) {
			if (field920[var2] == null) {
				field920[var2] = new ONRKYVGF();
			}

			field920[var2].method362(var2, var1);
		}

		if (var1.field9.length != var1.field10) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("ONRKYVGF.a(ILBFQIDHPO;I)V")
	public void method362(int arg0, BFQIDHPO arg1) {
		while (true) {
			int var3 = arg1.method54();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field924 = arg1.method54();
			} else if (var3 == 2) {
				field925 = arg1.method54();
			} else if (var3 == 3) {
				field926 = true;
				field922[field921++] = arg0;
			} else if (var3 == 4) {
				field927 = false;
			} else if (var3 == 5) {
				field928 = arg1.method56();
			} else if (var3 == 6) {
				field929 = true;
			} else if (var3 == 7) {
				field930 = arg1.method59();
			} else if (var3 == 8) {
				field931 = 1;
				field932 = true;
			} else if (var3 == 10) {
				field923 = arg1.method61();
			} else if (var3 == 11) {
				field932 = true;
			} else if (var3 == 12) {
				field933 = arg1.method59();
			} else if (var3 == 13) {
				field931 = 2;
				field932 = true;
			} else if (var3 == 14) {
				field934 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
