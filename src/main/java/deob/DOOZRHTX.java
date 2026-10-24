package deob;

@ObfuscatedName("DOOZRHTX")
public class DOOZRHTX {

	@ObfuscatedName("DOOZRHTX.g")
	public int field556 = -1;

	@ObfuscatedName("DOOZRHTX.i")
	public int[] field558 = new int[6];

	@ObfuscatedName("DOOZRHTX.j")
	public int[] field559 = new int[6];

	@ObfuscatedName("DOOZRHTX.k")
	public int[] field560 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("DOOZRHTX.l")
	public boolean field561 = false;

	@ObfuscatedName("DOOZRHTX.e")
	public static int field554;

	@ObfuscatedName("DOOZRHTX.h")
	public int[] field557;

	@ObfuscatedName("DOOZRHTX.f")
	public static DOOZRHTX[] field555;

	@ObfuscatedName("DOOZRHTX.a(BLSXKKBWPU;)V")
	public static void method189(SXKKBWPU arg0) {
		TQYMAXSO var1 = new TQYMAXSO(arg0.method442("idk.dat", null));
		field554 = var1.method470();
		if (field555 == null) {
			field555 = new DOOZRHTX[field554];
		}

		for (int var2 = 0; var2 < field554; var2++) {
			if (field555[var2] == null) {
				field555[var2] = new DOOZRHTX();
			}

			field555[var2].method190(var1);
		}
	}

	@ObfuscatedName("DOOZRHTX.a(ILTQYMAXSO;)V")
	public void method190(TQYMAXSO arg0) {
		while (true) {
			int var2 = arg0.method468();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field556 = arg0.method468();
			} else if (var2 == 2) {
				int var3 = arg0.method468();
				field557 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field557[var4] = arg0.method470();
				}
			} else if (var2 == 3) {
				field561 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field558[var2 - 40] = arg0.method470();
			} else if (var2 >= 50 && var2 < 60) {
				field559[var2 - 50] = arg0.method470();
			} else if (var2 >= 60 && var2 < 70) {
				field560[var2 - 60] = arg0.method470();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("DOOZRHTX.a(I)Z")
	public boolean method191() {
		if (field557 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field557.length; var2++) {
			if (!KDWDYCIL.method247(field557[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("DOOZRHTX.a(Z)LKDWDYCIL;")
	public KDWDYCIL method192() {
		if (field557 == null) {
			return null;
		}

		KDWDYCIL[] var1 = new KDWDYCIL[field557.length];
		for (int var2 = 0; var2 < field557.length; var2++) {
			var1[var2] = KDWDYCIL.method246(field557[var2]);
		}

		KDWDYCIL var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new KDWDYCIL(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field558[var4] != 0; var4++) {
			var3.method260(field558[var4], field559[var4]);
		}

		return var3;
	}

	@ObfuscatedName("DOOZRHTX.b(I)Z")
	public boolean method193() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field560[var2] != -1 && !KDWDYCIL.method247(field560[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("DOOZRHTX.c(I)LKDWDYCIL;")
	public KDWDYCIL method194() {
		KDWDYCIL[] var1 = new KDWDYCIL[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field560[var3] != -1) {
				var1[var2++] = KDWDYCIL.method246(field560[var3]);
			}
		}

		KDWDYCIL var4 = new KDWDYCIL(var1, var2);
		for (int var5 = 0; var5 < 6 && field558[var5] != 0; var5++) {
			var4.method260(field558[var5], field559[var5]);
		}

		return var4;
	}
}
