package deob;

@ObfuscatedName("EEUUOAGX")
public class EEUUOAGX {

	@ObfuscatedName("EEUUOAGX.k")
	public boolean field590 = false;

	@ObfuscatedName("EEUUOAGX.l")
	public boolean field591 = true;

	@ObfuscatedName("EEUUOAGX.n")
	public boolean field593 = false;

	@ObfuscatedName("EEUUOAGX.q")
	public boolean field596 = false;

	@ObfuscatedName("EEUUOAGX.r")
	public int field597 = -1;

	@ObfuscatedName("EEUUOAGX.d")
	public static int field583;

	@ObfuscatedName("EEUUOAGX.f")
	public static int field585;

	@ObfuscatedName("EEUUOAGX.i")
	public int field588;

	@ObfuscatedName("EEUUOAGX.j")
	public int field589;

	@ObfuscatedName("EEUUOAGX.m")
	public int field592;

	@ObfuscatedName("EEUUOAGX.o")
	public int field594;

	@ObfuscatedName("EEUUOAGX.p")
	public int field595;

	@ObfuscatedName("EEUUOAGX.h")
	public String field587;

	@ObfuscatedName("EEUUOAGX.g")
	public static int[] field586;

	@ObfuscatedName("EEUUOAGX.e")
	public static EEUUOAGX[] field584;

	@ObfuscatedName("EEUUOAGX.a(ILSPZBTZXL;)V")
	public static void method233(SPZBTZXL arg0) {
		LDILQFVA var1 = new LDILQFVA(arg0.method515("varp.dat", null));
		field585 = 0;
		field583 = var1.method404();
		if (field584 == null) {
			field584 = new EEUUOAGX[field583];
		}

		if (field586 == null) {
			field586 = new int[field583];
		}

		for (int var2 = 0; var2 < field583; var2++) {
			if (field584[var2] == null) {
				field584[var2] = new EEUUOAGX();
			}

			field584[var2].method234(var1, var2);
		}

		if (var1.field901.length != var1.field902) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("EEUUOAGX.a(ZLLDILQFVA;I)V")
	public void method234(LDILQFVA arg0, int arg1) {
		while (true) {
			int var3 = arg0.method402();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field588 = arg0.method402();
			} else if (var3 == 2) {
				field589 = arg0.method402();
			} else if (var3 == 3) {
				field590 = true;
				field586[field585++] = arg1;
			} else if (var3 == 4) {
				field591 = false;
			} else if (var3 == 5) {
				field592 = arg0.method404();
			} else if (var3 == 6) {
				field593 = true;
			} else if (var3 == 7) {
				field594 = arg0.method407();
			} else if (var3 == 8) {
				field595 = 1;
				field596 = true;
			} else if (var3 == 10) {
				field587 = arg0.method409();
			} else if (var3 == 11) {
				field596 = true;
			} else if (var3 == 12) {
				field597 = arg0.method407();
			} else if (var3 == 13) {
				field595 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
