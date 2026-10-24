package deob;

@ObfuscatedName("LZWYDZNA")
public class LZWYDZNA {

	@ObfuscatedName("LZWYDZNA.j")
	public boolean field946 = false;

	@ObfuscatedName("LZWYDZNA.k")
	public boolean field947 = true;

	@ObfuscatedName("LZWYDZNA.m")
	public boolean field949 = false;

	@ObfuscatedName("LZWYDZNA.p")
	public boolean field952 = false;

	@ObfuscatedName("LZWYDZNA.q")
	public int field953 = -1;

	@ObfuscatedName("LZWYDZNA.r")
	public boolean field954 = true;

	@ObfuscatedName("LZWYDZNA.c")
	public static int field939;

	@ObfuscatedName("LZWYDZNA.e")
	public static int field941;

	@ObfuscatedName("LZWYDZNA.h")
	public int field944;

	@ObfuscatedName("LZWYDZNA.i")
	public int field945;

	@ObfuscatedName("LZWYDZNA.l")
	public int field948;

	@ObfuscatedName("LZWYDZNA.n")
	public int field950;

	@ObfuscatedName("LZWYDZNA.o")
	public int field951;

	@ObfuscatedName("LZWYDZNA.g")
	public String field943;

	@ObfuscatedName("LZWYDZNA.f")
	public static int[] field942;

	@ObfuscatedName("LZWYDZNA.d")
	public static LZWYDZNA[] field940;

	@ObfuscatedName("LZWYDZNA.a(ILINOFEYKQ;)V")
	public static void method334(INOFEYKQ arg0) {
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("varp.dat", null));
		field941 = 0;
		field939 = var1.method351();
		if (field940 == null) {
			field940 = new LZWYDZNA[field939];
		}

		if (field942 == null) {
			field942 = new int[field939];
		}

		for (int var2 = 0; var2 < field939; var2++) {
			if (field940[var2] == null) {
				field940[var2] = new LZWYDZNA();
			}

			field940[var2].method335(var1, var2);
		}

		if (var1.field964.length != var1.field965) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("LZWYDZNA.a(ILNHEPCMLW;I)V")
	public void method335(NHEPCMLW arg0, int arg1) {
		while (true) {
			int var3 = arg0.method349();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field944 = arg0.method349();
			} else if (var3 == 2) {
				field945 = arg0.method349();
			} else if (var3 == 3) {
				field946 = true;
				field942[field941++] = arg1;
			} else if (var3 == 4) {
				field947 = false;
			} else if (var3 == 5) {
				field948 = arg0.method351();
			} else if (var3 == 6) {
				field949 = true;
			} else if (var3 == 7) {
				field950 = arg0.method354();
			} else if (var3 == 8) {
				field951 = 1;
				field952 = true;
			} else if (var3 == 10) {
				field943 = arg0.method356();
			} else if (var3 == 11) {
				field952 = true;
			} else if (var3 == 12) {
				field953 = arg0.method354();
			} else if (var3 == 13) {
				field951 = 2;
				field952 = true;
			} else if (var3 == 14) {
				field954 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
