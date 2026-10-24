package deob;

@ObfuscatedName("JMEOMLFD")
public class JMEOMLFD {

	@ObfuscatedName("JMEOMLFD.h")
	public boolean field896 = false;

	@ObfuscatedName("JMEOMLFD.i")
	public boolean field897 = true;

	@ObfuscatedName("JMEOMLFD.k")
	public boolean field899 = false;

	@ObfuscatedName("JMEOMLFD.n")
	public boolean field902 = false;

	@ObfuscatedName("JMEOMLFD.o")
	public int field903 = -1;

	@ObfuscatedName("JMEOMLFD.a")
	public static int field889;

	@ObfuscatedName("JMEOMLFD.c")
	public static int field891;

	@ObfuscatedName("JMEOMLFD.f")
	public int field894;

	@ObfuscatedName("JMEOMLFD.g")
	public int field895;

	@ObfuscatedName("JMEOMLFD.j")
	public int field898;

	@ObfuscatedName("JMEOMLFD.l")
	public int field900;

	@ObfuscatedName("JMEOMLFD.m")
	public int field901;

	@ObfuscatedName("JMEOMLFD.e")
	public String field893;

	@ObfuscatedName("JMEOMLFD.d")
	public static int[] field892;

	@ObfuscatedName("JMEOMLFD.b")
	public static JMEOMLFD[] field890;

	@ObfuscatedName("JMEOMLFD.a(LMNPBQFWE;B)V")
	public static void method353(MNPBQFWE arg0) {
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("varp.dat", null));
		field891 = 0;
		field889 = var1.method17();
		if (field890 == null) {
			field890 = new JMEOMLFD[field889];
		}

		if (field892 == null) {
			field892 = new int[field889];
		}

		for (int var2 = 0; var2 < field889; var2++) {
			if (field890[var2] == null) {
				field890[var2] = new JMEOMLFD();
			}

			field890[var2].method354(var1, var2);
		}

		if (var1.field4.length != var1.field5) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("JMEOMLFD.a(LBJPWOXRJ;II)V")
	public void method354(BJPWOXRJ arg0, int arg1) {
		while (true) {
			int var3 = arg0.method15();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field894 = arg0.method15();
			} else if (var3 == 2) {
				field895 = arg0.method15();
			} else if (var3 == 3) {
				field896 = true;
				field892[field891++] = arg1;
			} else if (var3 == 4) {
				field897 = false;
			} else if (var3 == 5) {
				field898 = arg0.method17();
			} else if (var3 == 6) {
				field899 = true;
			} else if (var3 == 7) {
				field900 = arg0.method20();
			} else if (var3 == 8) {
				field901 = 1;
				field902 = true;
			} else if (var3 == 10) {
				field893 = arg0.method22();
			} else if (var3 == 11) {
				field902 = true;
			} else if (var3 == 12) {
				field903 = arg0.method20();
			} else if (var3 == 13) {
				field901 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
