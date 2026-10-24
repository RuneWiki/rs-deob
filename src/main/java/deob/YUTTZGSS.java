package deob;

@ObfuscatedName("YUTTZGSS")
public class YUTTZGSS {

	@ObfuscatedName("YUTTZGSS.e")
	public int field1489 = -1;

	@ObfuscatedName("YUTTZGSS.g")
	public int[] field1491 = new int[6];

	@ObfuscatedName("YUTTZGSS.h")
	public int[] field1492 = new int[6];

	@ObfuscatedName("YUTTZGSS.i")
	public int[] field1493 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("YUTTZGSS.j")
	public boolean field1494 = false;

	@ObfuscatedName("YUTTZGSS.c")
	public static int field1487;

	@ObfuscatedName("YUTTZGSS.f")
	public int[] field1490;

	@ObfuscatedName("YUTTZGSS.d")
	public static YUTTZGSS[] field1488;

	@ObfuscatedName("YUTTZGSS.a(BLXOJZVVDK;)V")
	public static void method579(XOJZVVDK arg0) {
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("idk.dat", null));
		field1487 = var1.method342();
		if (field1488 == null) {
			field1488 = new YUTTZGSS[field1487];
		}

		for (int var2 = 0; var2 < field1487; var2++) {
			if (field1488[var2] == null) {
				field1488[var2] = new YUTTZGSS();
			}

			field1488[var2].method580(var1);
		}
	}

	@ObfuscatedName("YUTTZGSS.a(LPQBRPYKE;Z)V")
	public void method580(PQBRPYKE arg0) {
		while (true) {
			int var2 = arg0.method340();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1489 = arg0.method340();
			} else if (var2 == 2) {
				int var3 = arg0.method340();
				field1490 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1490[var4] = arg0.method342();
				}
			} else if (var2 == 3) {
				field1494 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1491[var2 - 40] = arg0.method342();
			} else if (var2 >= 50 && var2 < 60) {
				field1492[var2 - 50] = arg0.method342();
			} else if (var2 >= 60 && var2 < 70) {
				field1493[var2 - 60] = arg0.method342();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("YUTTZGSS.a(I)Z")
	public boolean method581() {
		if (field1490 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1490.length; var2++) {
			if (!FLXAIVEA.method219(field1490[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("YUTTZGSS.b(I)LFLXAIVEA;")
	public FLXAIVEA method582() {
		if (field1490 == null) {
			return null;
		}

		FLXAIVEA[] var1 = new FLXAIVEA[field1490.length];
		for (int var2 = 0; var2 < field1490.length; var2++) {
			var1[var2] = FLXAIVEA.method218(field1490[var2]);
		}

		FLXAIVEA var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new FLXAIVEA(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1491[var4] != 0; var4++) {
			var3.method232(field1491[var4], field1492[var4]);
		}

		return var3;
	}

	@ObfuscatedName("YUTTZGSS.a(B)Z")
	public boolean method583() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1493[var2] != -1 && !FLXAIVEA.method219(field1493[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("YUTTZGSS.a(Z)LFLXAIVEA;")
	public FLXAIVEA method584() {
		FLXAIVEA[] var1 = new FLXAIVEA[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1493[var3] != -1) {
				var1[var2++] = FLXAIVEA.method218(field1493[var3]);
			}
		}

		FLXAIVEA var4 = new FLXAIVEA(var2, var1);
		for (int var5 = 0; var5 < 6 && field1491[var5] != 0; var5++) {
			var4.method232(field1491[var5], field1492[var5]);
		}

		return var4;
	}
}
