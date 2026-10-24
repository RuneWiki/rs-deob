package deob;

@ObfuscatedName("XKEHWKFH")
public class XKEHWKFH {

	@ObfuscatedName("XKEHWKFH.i")
	public int field1367 = -1;

	@ObfuscatedName("XKEHWKFH.k")
	public boolean field1369 = false;

	@ObfuscatedName("XKEHWKFH.l")
	public int field1370 = 5;

	@ObfuscatedName("XKEHWKFH.m")
	public int field1371 = -1;

	@ObfuscatedName("XKEHWKFH.n")
	public int field1372 = -1;

	@ObfuscatedName("XKEHWKFH.o")
	public int field1373 = 99;

	@ObfuscatedName("XKEHWKFH.p")
	public int field1374 = -1;

	@ObfuscatedName("XKEHWKFH.q")
	public int field1375 = -1;

	@ObfuscatedName("XKEHWKFH.r")
	public int field1376 = 2;

	@ObfuscatedName("XKEHWKFH.c")
	public static int field1361;

	@ObfuscatedName("XKEHWKFH.e")
	public int field1363;

	@ObfuscatedName("XKEHWKFH.s")
	public int field1377;

	@ObfuscatedName("XKEHWKFH.f")
	public int[] field1364;

	@ObfuscatedName("XKEHWKFH.g")
	public int[] field1365;

	@ObfuscatedName("XKEHWKFH.h")
	public int[] field1366;

	@ObfuscatedName("XKEHWKFH.j")
	public int[] field1368;

	@ObfuscatedName("XKEHWKFH.d")
	public static XKEHWKFH[] field1362;

	@ObfuscatedName("XKEHWKFH.a(ILSPZBTZXL;)V")
	public static void method565(SPZBTZXL arg0) {
		LDILQFVA var1 = new LDILQFVA(arg0.method515("seq.dat", null));
		field1361 = var1.method404();
		if (field1362 == null) {
			field1362 = new XKEHWKFH[field1361];
		}

		for (int var2 = 0; var2 < field1361; var2++) {
			if (field1362[var2] == null) {
				field1362[var2] = new XKEHWKFH();
			}

			field1362[var2].method567(var1);
		}
	}

	@ObfuscatedName("XKEHWKFH.a(IB)I")
	public int method566(int arg0) {
		int var2 = field1366[arg0];
		if (var2 == 0) {
			UEUSJYYO var3 = UEUSJYYO.method535(field1364[arg0]);
			if (var3 != null) {
				var2 = field1366[arg0] = var3.field1143;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("XKEHWKFH.a(LLDILQFVA;I)V")
	public void method567(LDILQFVA arg0) {
		while (true) {
			int var2 = arg0.method402();
			if (var2 == 0) {
				if (field1363 == 0) {
					field1363 = 1;
					field1364 = new int[1];
					field1364[0] = -1;
					field1365 = new int[1];
					field1365[0] = -1;
					field1366 = new int[1];
					field1366[0] = -1;
				}

				if (field1374 == -1) {
					if (field1368 == null) {
						field1374 = 0;
					} else {
						field1374 = 2;
					}
				}

				if (field1375 == -1) {
					if (field1368 != null) {
						field1375 = 2;
						return;
					}

					field1375 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1363 = arg0.method402();
				field1364 = new int[field1363];
				field1365 = new int[field1363];
				field1366 = new int[field1363];
				for (int var3 = 0; var3 < field1363; var3++) {
					field1364[var3] = arg0.method404();
					field1365[var3] = arg0.method404();
					if (field1365[var3] == 0xFFFF) {
						field1365[var3] = -1;
					}

					field1366[var3] = arg0.method404();
				}
			} else if (var2 == 2) {
				field1367 = arg0.method404();
			} else if (var2 == 3) {
				int var4 = arg0.method402();
				field1368 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1368[var5] = arg0.method402();
				}

				field1368[var4] = 9999999;
			} else if (var2 == 4) {
				field1369 = true;
			} else if (var2 == 5) {
				field1370 = arg0.method402();
			} else if (var2 == 6) {
				field1371 = arg0.method404();
			} else if (var2 == 7) {
				field1372 = arg0.method404();
			} else if (var2 == 8) {
				field1373 = arg0.method402();
			} else if (var2 == 9) {
				field1374 = arg0.method402();
			} else if (var2 == 10) {
				field1375 = arg0.method402();
			} else if (var2 == 11) {
				field1376 = arg0.method402();
			} else if (var2 == 12) {
				field1377 = arg0.method407();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
