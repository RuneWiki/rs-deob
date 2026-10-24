package deob;

@ObfuscatedName("FDNUHSLC")
public class FDNUHSLC {

	@ObfuscatedName("FDNUHSLC.g")
	public int field753 = -1;

	@ObfuscatedName("FDNUHSLC.i")
	public int[] field755 = new int[6];

	@ObfuscatedName("FDNUHSLC.j")
	public int[] field756 = new int[6];

	@ObfuscatedName("FDNUHSLC.k")
	public int[] field757 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("FDNUHSLC.l")
	public boolean field758 = false;

	@ObfuscatedName("FDNUHSLC.e")
	public static int field751;

	@ObfuscatedName("FDNUHSLC.h")
	public int[] field754;

	@ObfuscatedName("FDNUHSLC.f")
	public static FDNUHSLC[] field752;

	@ObfuscatedName("FDNUHSLC.a(LLKPVZAQN;I)V")
	public static void method225(LKPVZAQN arg0) {
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("idk.dat", null));
		field751 = var1.method517();
		if (field752 == null) {
			field752 = new FDNUHSLC[field751];
		}

		for (int var2 = 0; var2 < field751; var2++) {
			if (field752[var2] == null) {
				field752[var2] = new FDNUHSLC();
			}

			field752[var2].method226(var1);
		}
	}

	@ObfuscatedName("FDNUHSLC.a(LWBEWPIXO;I)V")
	public void method226(WBEWPIXO arg0) {
		while (true) {
			int var2 = arg0.method515();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field753 = arg0.method515();
			} else if (var2 == 2) {
				int var3 = arg0.method515();
				field754 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field754[var4] = arg0.method517();
				}
			} else if (var2 == 3) {
				field758 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field755[var2 - 40] = arg0.method517();
			} else if (var2 >= 50 && var2 < 60) {
				field756[var2 - 50] = arg0.method517();
			} else if (var2 >= 60 && var2 < 70) {
				field757[var2 - 60] = arg0.method517();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FDNUHSLC.a(I)Z")
	public boolean method227() {
		if (field754 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field754.length; var2++) {
			if (!FCIDIKVY.method200(field754[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("FDNUHSLC.a(B)LFCIDIKVY;")
	public FCIDIKVY method228() {
		if (field754 == null) {
			return null;
		}

		FCIDIKVY[] var1 = new FCIDIKVY[field754.length];
		for (int var2 = 0; var2 < field754.length; var2++) {
			var1[var2] = FCIDIKVY.method199(field754[var2]);
		}

		FCIDIKVY var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new FCIDIKVY(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field755[var4] != 0; var4++) {
			var3.method213(field755[var4], field756[var4]);
		}

		return var3;
	}

	@ObfuscatedName("FDNUHSLC.b(I)Z")
	public boolean method229() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field757[var2] != -1 && !FCIDIKVY.method200(field757[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("FDNUHSLC.c(I)LFCIDIKVY;")
	public FCIDIKVY method230() {
		FCIDIKVY[] var1 = new FCIDIKVY[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field757[var3] != -1) {
				var1[var2++] = FCIDIKVY.method199(field757[var3]);
			}
		}

		FCIDIKVY var4 = new FCIDIKVY(var2, var1);
		for (int var5 = 0; var5 < 6 && field755[var5] != 0; var5++) {
			var4.method213(field755[var5], field756[var5]);
		}

		return var4;
	}
}
