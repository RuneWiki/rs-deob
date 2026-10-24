package deob;

@ObfuscatedName("LSIUBIYU")
public class LSIUBIYU {

	@ObfuscatedName("LSIUBIYU.j")
	public boolean field901 = false;

	@ObfuscatedName("LSIUBIYU.k")
	public boolean field902 = true;

	@ObfuscatedName("LSIUBIYU.m")
	public boolean field904 = false;

	@ObfuscatedName("LSIUBIYU.p")
	public boolean field907 = false;

	@ObfuscatedName("LSIUBIYU.q")
	public int field908 = -1;

	@ObfuscatedName("LSIUBIYU.r")
	public boolean field909 = true;

	@ObfuscatedName("LSIUBIYU.c")
	public static int field894;

	@ObfuscatedName("LSIUBIYU.e")
	public static int field896;

	@ObfuscatedName("LSIUBIYU.h")
	public int field899;

	@ObfuscatedName("LSIUBIYU.i")
	public int field900;

	@ObfuscatedName("LSIUBIYU.l")
	public int field903;

	@ObfuscatedName("LSIUBIYU.n")
	public int field905;

	@ObfuscatedName("LSIUBIYU.o")
	public int field906;

	@ObfuscatedName("LSIUBIYU.g")
	public String field898;

	@ObfuscatedName("LSIUBIYU.f")
	public static int[] field897;

	@ObfuscatedName("LSIUBIYU.d")
	public static LSIUBIYU[] field895;

	@ObfuscatedName("LSIUBIYU.a(LFUZJMGZB;I)V")
	public static void method407(FUZJMGZB arg0) {
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("varp.dat", null));
		field896 = 0;
		field894 = var1.method371();
		if (field895 == null) {
			field895 = new LSIUBIYU[field894];
		}

		if (field897 == null) {
			field897 = new int[field894];
		}

		for (int var2 = 0; var2 < field894; var2++) {
			if (field895[var2] == null) {
				field895[var2] = new LSIUBIYU();
			}

			field895[var2].method408(var1, var2);
		}

		if (var1.field881.length != var1.field882) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("LSIUBIYU.a(ZLLBBVYYXO;I)V")
	public void method408(LBBVYYXO arg0, int arg1) {
		while (true) {
			int var3 = arg0.method369();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field899 = arg0.method369();
			} else if (var3 == 2) {
				field900 = arg0.method369();
			} else if (var3 == 3) {
				field901 = true;
				field897[field896++] = arg1;
			} else if (var3 == 4) {
				field902 = false;
			} else if (var3 == 5) {
				field903 = arg0.method371();
			} else if (var3 == 6) {
				field904 = true;
			} else if (var3 == 7) {
				field905 = arg0.method374();
			} else if (var3 == 8) {
				field906 = 1;
				field907 = true;
			} else if (var3 == 10) {
				field898 = arg0.method376();
			} else if (var3 == 11) {
				field907 = true;
			} else if (var3 == 12) {
				field908 = arg0.method374();
			} else if (var3 == 13) {
				field906 = 2;
				field907 = true;
			} else if (var3 == 14) {
				field909 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
