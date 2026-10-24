package deob;

@ObfuscatedName("ZAYCIZYV")
public class ZAYCIZYV {

	@ObfuscatedName("ZAYCIZYV.g")
	public int field1508 = -1;

	@ObfuscatedName("ZAYCIZYV.i")
	public int[] field1510 = new int[6];

	@ObfuscatedName("ZAYCIZYV.j")
	public int[] field1511 = new int[6];

	@ObfuscatedName("ZAYCIZYV.k")
	public int[] field1512 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("ZAYCIZYV.l")
	public boolean field1513 = false;

	@ObfuscatedName("ZAYCIZYV.e")
	public static int field1506;

	@ObfuscatedName("ZAYCIZYV.h")
	public int[] field1509;

	@ObfuscatedName("ZAYCIZYV.f")
	public static ZAYCIZYV[] field1507;

	@ObfuscatedName("ZAYCIZYV.a(LHBJEXSJX;Z)V")
	public static void method587(HBJEXSJX arg0) {
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("idk.dat", null));
		field1506 = var1.method241();
		if (field1507 == null) {
			field1507 = new ZAYCIZYV[field1506];
		}

		for (int var2 = 0; var2 < field1506; var2++) {
			if (field1507[var2] == null) {
				field1507[var2] = new ZAYCIZYV();
			}

			field1507[var2].method588(var1);
		}
	}

	@ObfuscatedName("ZAYCIZYV.a(BLEYMNCFMK;)V")
	public void method588(EYMNCFMK arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1508 = arg0.method239();
			} else if (var2 == 2) {
				int var3 = arg0.method239();
				field1509 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1509[var4] = arg0.method241();
				}
			} else if (var2 == 3) {
				field1513 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1510[var2 - 40] = arg0.method241();
			} else if (var2 >= 50 && var2 < 60) {
				field1511[var2 - 50] = arg0.method241();
			} else if (var2 >= 60 && var2 < 70) {
				field1512[var2 - 60] = arg0.method241();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("ZAYCIZYV.a(I)Z")
	public boolean method589() {
		if (field1509 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1509.length; var2++) {
			if (!OJGAHFXC.method414(field1509[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ZAYCIZYV.a(Z)LOJGAHFXC;")
	public OJGAHFXC method590() {
		if (field1509 == null) {
			return null;
		}

		OJGAHFXC[] var1 = new OJGAHFXC[field1509.length];
		for (int var2 = 0; var2 < field1509.length; var2++) {
			var1[var2] = OJGAHFXC.method413(field1509[var2]);
		}

		OJGAHFXC var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new OJGAHFXC(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1510[var4] != 0; var4++) {
			var3.method427(field1510[var4], field1511[var4]);
		}

		return var3;
	}

	@ObfuscatedName("ZAYCIZYV.b(I)Z")
	public boolean method591() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1512[var2] != -1 && !OJGAHFXC.method414(field1512[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ZAYCIZYV.a(B)LOJGAHFXC;")
	public OJGAHFXC method592() {
		OJGAHFXC[] var1 = new OJGAHFXC[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1512[var3] != -1) {
				var1[var2++] = OJGAHFXC.method413(field1512[var3]);
			}
		}

		OJGAHFXC var4 = new OJGAHFXC(var2, var1);
		for (int var5 = 0; var5 < 6 && field1510[var5] != 0; var5++) {
			var4.method427(field1510[var5], field1511[var5]);
		}

		return var4;
	}
}
