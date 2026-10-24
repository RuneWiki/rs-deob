package deob;

@ObfuscatedName("NJBQYBAL")
public class NJBQYBAL {

	@ObfuscatedName("NJBQYBAL.i")
	public boolean field989 = false;

	@ObfuscatedName("NJBQYBAL.j")
	public boolean field990 = true;

	@ObfuscatedName("NJBQYBAL.l")
	public boolean field992 = false;

	@ObfuscatedName("NJBQYBAL.o")
	public boolean field995 = false;

	@ObfuscatedName("NJBQYBAL.p")
	public int field996 = -1;

	@ObfuscatedName("NJBQYBAL.b")
	public static int field982;

	@ObfuscatedName("NJBQYBAL.d")
	public static int field984;

	@ObfuscatedName("NJBQYBAL.g")
	public int field987;

	@ObfuscatedName("NJBQYBAL.h")
	public int field988;

	@ObfuscatedName("NJBQYBAL.k")
	public int field991;

	@ObfuscatedName("NJBQYBAL.m")
	public int field993;

	@ObfuscatedName("NJBQYBAL.n")
	public int field994;

	@ObfuscatedName("NJBQYBAL.f")
	public String field986;

	@ObfuscatedName("NJBQYBAL.e")
	public static int[] field985;

	@ObfuscatedName("NJBQYBAL.c")
	public static NJBQYBAL[] field983;

	@ObfuscatedName("NJBQYBAL.a(ILCVNWKEAW;)V")
	public static void method412(CVNWKEAW arg0) {
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("varp.dat", null));
		field984 = 0;
		field982 = var1.method523();
		if (field983 == null) {
			field983 = new NJBQYBAL[field982];
		}

		if (field985 == null) {
			field985 = new int[field982];
		}

		for (int var2 = 0; var2 < field982; var2++) {
			if (field983[var2] == null) {
				field983[var2] = new NJBQYBAL();
			}

			field983[var2].method413(var2, var1);
		}

		if (var1.field1366.length != var1.field1367) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("NJBQYBAL.a(ILXOUQUKZW;B)V")
	public void method413(int arg0, XOUQUKZW arg1) {
		while (true) {
			int var3 = arg1.method521();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field987 = arg1.method521();
			} else if (var3 == 2) {
				field988 = arg1.method521();
			} else if (var3 == 3) {
				field989 = true;
				field985[field984++] = arg0;
			} else if (var3 == 4) {
				field990 = false;
			} else if (var3 == 5) {
				field991 = arg1.method523();
			} else if (var3 == 6) {
				field992 = true;
			} else if (var3 == 7) {
				field993 = arg1.method526();
			} else if (var3 == 8) {
				field994 = 1;
				field995 = true;
			} else if (var3 == 10) {
				field986 = arg1.method528();
			} else if (var3 == 11) {
				field995 = true;
			} else if (var3 == 12) {
				field996 = arg1.method526();
			} else if (var3 == 13) {
				field994 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
