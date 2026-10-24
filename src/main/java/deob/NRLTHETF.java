package deob;

@ObfuscatedName("NRLTHETF")
public class NRLTHETF {

	@ObfuscatedName("NRLTHETF.g")
	public int field955 = -1;

	@ObfuscatedName("NRLTHETF.i")
	public int[] field957 = new int[6];

	@ObfuscatedName("NRLTHETF.j")
	public int[] field958 = new int[6];

	@ObfuscatedName("NRLTHETF.k")
	public int[] field959 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("NRLTHETF.l")
	public boolean field960 = false;

	@ObfuscatedName("NRLTHETF.e")
	public static int field953;

	@ObfuscatedName("NRLTHETF.h")
	public int[] field956;

	@ObfuscatedName("NRLTHETF.f")
	public static NRLTHETF[] field954;

	@ObfuscatedName("NRLTHETF.a(ILRVLWVPJQ;)V")
	public static void method333(RVLWVPJQ arg0) {
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("idk.dat", null));
		field953 = var1.method457();
		if (field954 == null) {
			field954 = new NRLTHETF[field953];
		}

		for (int var2 = 0; var2 < field953; var2++) {
			if (field954[var2] == null) {
				field954[var2] = new NRLTHETF();
			}

			field954[var2].method334(var1);
		}
	}

	@ObfuscatedName("NRLTHETF.a(ILUAWAYCTK;)V")
	public void method334(UAWAYCTK arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field955 = arg0.method455();
			} else if (var2 == 2) {
				int var3 = arg0.method455();
				field956 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field956[var4] = arg0.method457();
				}
			} else if (var2 == 3) {
				field960 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field957[var2 - 40] = arg0.method457();
			} else if (var2 >= 50 && var2 < 60) {
				field958[var2 - 50] = arg0.method457();
			} else if (var2 >= 60 && var2 < 70) {
				field959[var2 - 60] = arg0.method457();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("NRLTHETF.a(I)Z")
	public boolean method335() {
		if (field956 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field956.length; var2++) {
			if (!WEVRTBOZ.method526(field956[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("NRLTHETF.a(B)LWEVRTBOZ;")
	public WEVRTBOZ method336() {
		if (field956 == null) {
			return null;
		}

		WEVRTBOZ[] var1 = new WEVRTBOZ[field956.length];
		for (int var2 = 0; var2 < field956.length; var2++) {
			var1[var2] = WEVRTBOZ.method525(field956[var2]);
		}

		WEVRTBOZ var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new WEVRTBOZ(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field957[var4] != 0; var4++) {
			var3.method539(field957[var4], field958[var4]);
		}

		return var3;
	}

	@ObfuscatedName("NRLTHETF.a(Z)Z")
	public boolean method337() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field959[var2] != -1 && !WEVRTBOZ.method526(field959[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("NRLTHETF.b(I)LWEVRTBOZ;")
	public WEVRTBOZ method338() {
		WEVRTBOZ[] var1 = new WEVRTBOZ[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field959[var3] != -1) {
				var1[var2++] = WEVRTBOZ.method525(field959[var3]);
			}
		}

		WEVRTBOZ var4 = new WEVRTBOZ(var2, var1);
		for (int var5 = 0; var5 < 6 && field957[var5] != 0; var5++) {
			var4.method539(field957[var5], field958[var5]);
		}

		return var4;
	}
}
