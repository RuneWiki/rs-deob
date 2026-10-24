package deob;

@ObfuscatedName("KVOIHOSF")
public class KVOIHOSF {

	@ObfuscatedName("KVOIHOSF.i")
	public boolean field925 = false;

	@ObfuscatedName("KVOIHOSF.j")
	public boolean field926 = true;

	@ObfuscatedName("KVOIHOSF.l")
	public boolean field928 = false;

	@ObfuscatedName("KVOIHOSF.o")
	public boolean field931 = false;

	@ObfuscatedName("KVOIHOSF.p")
	public int field932 = -1;

	@ObfuscatedName("KVOIHOSF.q")
	public boolean field933 = true;

	@ObfuscatedName("KVOIHOSF.b")
	public static int field918;

	@ObfuscatedName("KVOIHOSF.d")
	public static int field920;

	@ObfuscatedName("KVOIHOSF.g")
	public int field923;

	@ObfuscatedName("KVOIHOSF.h")
	public int field924;

	@ObfuscatedName("KVOIHOSF.k")
	public int field927;

	@ObfuscatedName("KVOIHOSF.m")
	public int field929;

	@ObfuscatedName("KVOIHOSF.n")
	public int field930;

	@ObfuscatedName("KVOIHOSF.f")
	public String field922;

	@ObfuscatedName("KVOIHOSF.e")
	public static int[] field921;

	@ObfuscatedName("KVOIHOSF.c")
	public static KVOIHOSF[] field919;

	@ObfuscatedName("KVOIHOSF.a(ZLMJLXHQTQ;)V")
	public static void method286(MJLXHQTQ arg0) {
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("varp.dat", null));
		field920 = 0;
		field918 = var1.method467();
		if (field919 == null) {
			field919 = new KVOIHOSF[field918];
		}

		if (field921 == null) {
			field921 = new int[field918];
		}

		for (int var2 = 0; var2 < field918; var2++) {
			if (field919[var2] == null) {
				field919[var2] = new KVOIHOSF();
			}

			field919[var2].method287(var2, var1);
		}

		if (var1.field1431.length != var1.field1432) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("KVOIHOSF.a(IILXGRGMPUQ;)V")
	public void method287(int arg0, XGRGMPUQ arg1) {
		while (true) {
			int var3 = arg1.method465();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field923 = arg1.method465();
			} else if (var3 == 2) {
				field924 = arg1.method465();
			} else if (var3 == 3) {
				field925 = true;
				field921[field920++] = arg0;
			} else if (var3 == 4) {
				field926 = false;
			} else if (var3 == 5) {
				field927 = arg1.method467();
			} else if (var3 == 6) {
				field928 = true;
			} else if (var3 == 7) {
				field929 = arg1.method470();
			} else if (var3 == 8) {
				field930 = 1;
				field931 = true;
			} else if (var3 == 10) {
				field922 = arg1.method472();
			} else if (var3 == 11) {
				field931 = true;
			} else if (var3 == 12) {
				field932 = arg1.method470();
			} else if (var3 == 13) {
				field930 = 2;
				field931 = true;
			} else if (var3 == 14) {
				field933 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
