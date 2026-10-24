package deob;

@ObfuscatedName("EINNWKRR")
public class EINNWKRR {

	@ObfuscatedName("EINNWKRR.h")
	public boolean field574 = false;

	@ObfuscatedName("EINNWKRR.i")
	public boolean field575 = true;

	@ObfuscatedName("EINNWKRR.k")
	public boolean field577 = false;

	@ObfuscatedName("EINNWKRR.n")
	public boolean field580 = false;

	@ObfuscatedName("EINNWKRR.o")
	public int field581 = -1;

	@ObfuscatedName("EINNWKRR.a")
	public static int field567;

	@ObfuscatedName("EINNWKRR.c")
	public static int field569;

	@ObfuscatedName("EINNWKRR.f")
	public int field572;

	@ObfuscatedName("EINNWKRR.g")
	public int field573;

	@ObfuscatedName("EINNWKRR.j")
	public int field576;

	@ObfuscatedName("EINNWKRR.l")
	public int field578;

	@ObfuscatedName("EINNWKRR.m")
	public int field579;

	@ObfuscatedName("EINNWKRR.e")
	public String field571;

	@ObfuscatedName("EINNWKRR.d")
	public static int[] field570;

	@ObfuscatedName("EINNWKRR.b")
	public static EINNWKRR[] field568;

	@ObfuscatedName("EINNWKRR.a(ILHRXSNEYZ;)V")
	public static void method223(HRXSNEYZ arg0) {
		JHKSAGUC var1 = new JHKSAGUC(arg0.method289("varp.dat", null));
		field569 = 0;
		field567 = var1.method308();
		if (field568 == null) {
			field568 = new EINNWKRR[field567];
		}

		if (field570 == null) {
			field570 = new int[field567];
		}

		for (int var2 = 0; var2 < field567; var2++) {
			if (field568[var2] == null) {
				field568[var2] = new EINNWKRR();
			}

			field568[var2].method224(var2, var1);
		}

		if (var1.field751.length != var1.field752) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("EINNWKRR.a(IILJHKSAGUC;)V")
	public void method224(int arg0, JHKSAGUC arg1) {
		while (true) {
			int var3 = arg1.method306();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field572 = arg1.method306();
			} else if (var3 == 2) {
				field573 = arg1.method306();
			} else if (var3 == 3) {
				field574 = true;
				field570[field569++] = arg0;
			} else if (var3 == 4) {
				field575 = false;
			} else if (var3 == 5) {
				field576 = arg1.method308();
			} else if (var3 == 6) {
				field577 = true;
			} else if (var3 == 7) {
				field578 = arg1.method311();
			} else if (var3 == 8) {
				field579 = 1;
				field580 = true;
			} else if (var3 == 10) {
				field571 = arg1.method313();
			} else if (var3 == 11) {
				field580 = true;
			} else if (var3 == 12) {
				field581 = arg1.method311();
			} else if (var3 == 13) {
				field579 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
