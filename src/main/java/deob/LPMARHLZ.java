package deob;

@ObfuscatedName("LPMARHLZ")
public class LPMARHLZ {

	@ObfuscatedName("LPMARHLZ.i")
	public boolean field930 = false;

	@ObfuscatedName("LPMARHLZ.j")
	public int field931 = -1;

	@ObfuscatedName("LPMARHLZ.c")
	public static int field924;

	@ObfuscatedName("LPMARHLZ.f")
	public int field927;

	@ObfuscatedName("LPMARHLZ.g")
	public int field928;

	@ObfuscatedName("LPMARHLZ.h")
	public int field929;

	@ObfuscatedName("LPMARHLZ.k")
	public int field932;

	@ObfuscatedName("LPMARHLZ.e")
	public String field926;

	@ObfuscatedName("LPMARHLZ.d")
	public static LPMARHLZ[] field925;

	@ObfuscatedName("LPMARHLZ.a(ILSPZBTZXL;)V")
	public static void method456(SPZBTZXL arg0) {
		LDILQFVA var1 = new LDILQFVA(arg0.method515("varbit.dat", null));
		field924 = var1.method404();
		if (field925 == null) {
			field925 = new LPMARHLZ[field924];
		}

		for (int var2 = 0; var2 < field924; var2++) {
			if (field925[var2] == null) {
				field925[var2] = new LPMARHLZ();
			}

			field925[var2].method457(var1, var2);

			if (field925[var2].field930) {
				EEUUOAGX.field584[field925[var2].field927].field596 = true;
			}
		}

		if (var1.field901.length != var1.field902) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("LPMARHLZ.a(ZLLDILQFVA;I)V")
	public void method457(LDILQFVA arg0, int arg1) {
		while (true) {
			int var3 = arg0.method402();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field927 = arg0.method404();
				field928 = arg0.method402();
				field929 = arg0.method402();
			} else if (var3 == 10) {
				field926 = arg0.method409();
			} else if (var3 == 2) {
				field930 = true;
			} else if (var3 == 3) {
				field931 = arg0.method407();
			} else if (var3 == 4) {
				field932 = arg0.method407();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
