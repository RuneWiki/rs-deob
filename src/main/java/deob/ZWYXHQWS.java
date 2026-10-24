package deob;

@ObfuscatedName("ZWYXHQWS")
public class ZWYXHQWS {

	@ObfuscatedName("ZWYXHQWS.e")
	public int field1508 = -1;

	@ObfuscatedName("ZWYXHQWS.g")
	public int[] field1510 = new int[6];

	@ObfuscatedName("ZWYXHQWS.h")
	public int[] field1511 = new int[6];

	@ObfuscatedName("ZWYXHQWS.i")
	public int[] field1512 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("ZWYXHQWS.j")
	public boolean field1513 = false;

	@ObfuscatedName("ZWYXHQWS.c")
	public static int field1506;

	@ObfuscatedName("ZWYXHQWS.f")
	public int[] field1509;

	@ObfuscatedName("ZWYXHQWS.d")
	public static ZWYXHQWS[] field1507;

	@ObfuscatedName("ZWYXHQWS.a(ILTKEGJSFV;)V")
	public static void method595(TKEGJSFV arg0) {
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("idk.dat", null));
		field1506 = var1.method263();
		if (field1507 == null) {
			field1507 = new ZWYXHQWS[field1506];
		}

		for (int var2 = 0; var2 < field1506; var2++) {
			if (field1507[var2] == null) {
				field1507[var2] = new ZWYXHQWS();
			}

			field1507[var2].method596(var1);
		}
	}

	@ObfuscatedName("ZWYXHQWS.a(LEGCCHUZS;Z)V")
	public void method596(EGCCHUZS arg0) {
		while (true) {
			int var2 = arg0.method261();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1508 = arg0.method261();
			} else if (var2 == 2) {
				int var3 = arg0.method261();
				field1509 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1509[var4] = arg0.method263();
				}
			} else if (var2 == 3) {
				field1513 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1510[var2 - 40] = arg0.method263();
			} else if (var2 >= 50 && var2 < 60) {
				field1511[var2 - 50] = arg0.method263();
			} else if (var2 >= 60 && var2 < 70) {
				field1512[var2 - 60] = arg0.method263();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("ZWYXHQWS.a(B)Z")
	public boolean method597() {
		if (field1509 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1509.length; var2++) {
			if (!IGXVZOHI.method355(field1509[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ZWYXHQWS.b(B)LIGXVZOHI;")
	public IGXVZOHI method598() {
		if (field1509 == null) {
			return null;
		}

		IGXVZOHI[] var1 = new IGXVZOHI[field1509.length];
		for (int var2 = 0; var2 < field1509.length; var2++) {
			var1[var2] = IGXVZOHI.method354(field1509[var2]);
		}

		IGXVZOHI var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new IGXVZOHI(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1510[var4] != 0; var4++) {
			var3.method368(field1510[var4], field1511[var4]);
		}

		return var3;
	}

	@ObfuscatedName("ZWYXHQWS.a(Z)Z")
	public boolean method599() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1512[var2] != -1 && !IGXVZOHI.method355(field1512[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ZWYXHQWS.b(Z)LIGXVZOHI;")
	public IGXVZOHI method600() {
		IGXVZOHI[] var1 = new IGXVZOHI[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1512[var3] != -1) {
				var1[var2++] = IGXVZOHI.method354(field1512[var3]);
			}
		}

		IGXVZOHI var4 = new IGXVZOHI(var2, var1);
		for (int var5 = 0; var5 < 6 && field1510[var5] != 0; var5++) {
			var4.method368(field1510[var5], field1511[var5]);
		}

		return var4;
	}
}
