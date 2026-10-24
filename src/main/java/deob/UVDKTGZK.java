package deob;

@ObfuscatedName("UVDKTGZK")
public class UVDKTGZK {

	@ObfuscatedName("UVDKTGZK.i")
	public int field1362 = -1;

	@ObfuscatedName("UVDKTGZK.k")
	public boolean field1364 = false;

	@ObfuscatedName("UVDKTGZK.l")
	public int field1365 = 5;

	@ObfuscatedName("UVDKTGZK.m")
	public int field1366 = -1;

	@ObfuscatedName("UVDKTGZK.n")
	public int field1367 = -1;

	@ObfuscatedName("UVDKTGZK.o")
	public int field1368 = 99;

	@ObfuscatedName("UVDKTGZK.p")
	public int field1369 = -1;

	@ObfuscatedName("UVDKTGZK.q")
	public int field1370 = -1;

	@ObfuscatedName("UVDKTGZK.r")
	public int field1371 = 2;

	@ObfuscatedName("UVDKTGZK.c")
	public static int field1356;

	@ObfuscatedName("UVDKTGZK.e")
	public int field1358;

	@ObfuscatedName("UVDKTGZK.s")
	public int field1372;

	@ObfuscatedName("UVDKTGZK.f")
	public int[] field1359;

	@ObfuscatedName("UVDKTGZK.g")
	public int[] field1360;

	@ObfuscatedName("UVDKTGZK.h")
	public int[] field1361;

	@ObfuscatedName("UVDKTGZK.j")
	public int[] field1363;

	@ObfuscatedName("UVDKTGZK.d")
	public static UVDKTGZK[] field1357;

	@ObfuscatedName("UVDKTGZK.a(LGWOEELWB;B)V")
	public static void method561(GWOEELWB arg0) {
		MLYYHULT var1 = new MLYYHULT(arg0.method249("seq.dat", null));
		field1356 = var1.method298();
		if (field1357 == null) {
			field1357 = new UVDKTGZK[field1356];
		}

		for (int var2 = 0; var2 < field1356; var2++) {
			if (field1357[var2] == null) {
				field1357[var2] = new UVDKTGZK();
			}

			field1357[var2].method563(var1);
		}
	}

	@ObfuscatedName("UVDKTGZK.a(BI)I")
	public int method562(int arg0) {
		int var2 = field1361[arg0];
		if (var2 == 0) {
			DFGNFGZH var3 = DFGNFGZH.method214(field1359[arg0]);
			if (var3 != null) {
				var2 = field1361[arg0] = var3.field610;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("UVDKTGZK.a(LMLYYHULT;B)V")
	public void method563(MLYYHULT arg0) {
		while (true) {
			int var2 = arg0.method296();
			if (var2 == 0) {
				if (field1358 == 0) {
					field1358 = 1;
					field1359 = new int[1];
					field1359[0] = -1;
					field1360 = new int[1];
					field1360[0] = -1;
					field1361 = new int[1];
					field1361[0] = -1;
				}

				if (field1369 == -1) {
					if (field1363 == null) {
						field1369 = 0;
					} else {
						field1369 = 2;
					}
				}

				if (field1370 == -1) {
					if (field1363 != null) {
						field1370 = 2;
						return;
					}

					field1370 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1358 = arg0.method296();
				field1359 = new int[field1358];
				field1360 = new int[field1358];
				field1361 = new int[field1358];
				for (int var3 = 0; var3 < field1358; var3++) {
					field1359[var3] = arg0.method298();
					field1360[var3] = arg0.method298();
					if (field1360[var3] == 0xFFFF) {
						field1360[var3] = -1;
					}

					field1361[var3] = arg0.method298();
				}
			} else if (var2 == 2) {
				field1362 = arg0.method298();
			} else if (var2 == 3) {
				int var4 = arg0.method296();
				field1363 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1363[var5] = arg0.method296();
				}

				field1363[var4] = 9999999;
			} else if (var2 == 4) {
				field1364 = true;
			} else if (var2 == 5) {
				field1365 = arg0.method296();
			} else if (var2 == 6) {
				field1366 = arg0.method298();
			} else if (var2 == 7) {
				field1367 = arg0.method298();
			} else if (var2 == 8) {
				field1368 = arg0.method296();
			} else if (var2 == 9) {
				field1369 = arg0.method296();
			} else if (var2 == 10) {
				field1370 = arg0.method296();
			} else if (var2 == 11) {
				field1371 = arg0.method296();
			} else if (var2 == 12) {
				field1372 = arg0.method301();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
