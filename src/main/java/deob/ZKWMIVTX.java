package deob;

@ObfuscatedName("ZKWMIVTX")
public class ZKWMIVTX {

	@ObfuscatedName("ZKWMIVTX.h")
	public int field1466 = -1;

	@ObfuscatedName("ZKWMIVTX.j")
	public boolean field1468 = false;

	@ObfuscatedName("ZKWMIVTX.k")
	public int field1469 = 5;

	@ObfuscatedName("ZKWMIVTX.l")
	public int field1470 = -1;

	@ObfuscatedName("ZKWMIVTX.m")
	public int field1471 = -1;

	@ObfuscatedName("ZKWMIVTX.n")
	public int field1472 = 99;

	@ObfuscatedName("ZKWMIVTX.o")
	public int field1473 = -1;

	@ObfuscatedName("ZKWMIVTX.p")
	public int field1474 = -1;

	@ObfuscatedName("ZKWMIVTX.q")
	public int field1475 = 2;

	@ObfuscatedName("ZKWMIVTX.b")
	public static int field1460;

	@ObfuscatedName("ZKWMIVTX.d")
	public int field1462;

	@ObfuscatedName("ZKWMIVTX.r")
	public int field1476;

	@ObfuscatedName("ZKWMIVTX.e")
	public int[] field1463;

	@ObfuscatedName("ZKWMIVTX.f")
	public int[] field1464;

	@ObfuscatedName("ZKWMIVTX.g")
	public int[] field1465;

	@ObfuscatedName("ZKWMIVTX.i")
	public int[] field1467;

	@ObfuscatedName("ZKWMIVTX.c")
	public static ZKWMIVTX[] field1461;

	@ObfuscatedName("ZKWMIVTX.a(LBYZSQZUF;Z)V")
	public static void method590(BYZSQZUF arg0) {
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("seq.dat", null));
		field1460 = var1.method240();
		if (field1461 == null) {
			field1461 = new ZKWMIVTX[field1460];
		}

		for (int var2 = 0; var2 < field1460; var2++) {
			if (field1461[var2] == null) {
				field1461[var2] = new ZKWMIVTX();
			}

			field1461[var2].method592(var1);
		}
	}

	@ObfuscatedName("ZKWMIVTX.a(II)I")
	public int method591(int arg0) {
		int var2 = field1465[arg0];
		if (var2 == 0) {
			HQHBJEDA var3 = HQHBJEDA.method218(field1463[arg0]);
			if (var3 != null) {
				var2 = field1465[arg0] = var3.field695;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("ZKWMIVTX.a(ILIMUIZRAF;)V")
	public void method592(IMUIZRAF arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				if (field1462 == 0) {
					field1462 = 1;
					field1463 = new int[1];
					field1463[0] = -1;
					field1464 = new int[1];
					field1464[0] = -1;
					field1465 = new int[1];
					field1465[0] = -1;
				}

				if (field1473 == -1) {
					if (field1467 == null) {
						field1473 = 0;
					} else {
						field1473 = 2;
					}
				}

				if (field1474 == -1) {
					if (field1467 != null) {
						field1474 = 2;
						return;
					}

					field1474 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1462 = arg0.method238();
				field1463 = new int[field1462];
				field1464 = new int[field1462];
				field1465 = new int[field1462];
				for (int var3 = 0; var3 < field1462; var3++) {
					field1463[var3] = arg0.method240();
					field1464[var3] = arg0.method240();
					if (field1464[var3] == 0xFFFF) {
						field1464[var3] = -1;
					}

					field1465[var3] = arg0.method240();
				}
			} else if (var2 == 2) {
				field1466 = arg0.method240();
			} else if (var2 == 3) {
				int var4 = arg0.method238();
				field1467 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1467[var5] = arg0.method238();
				}

				field1467[var4] = 9999999;
			} else if (var2 == 4) {
				field1468 = true;
			} else if (var2 == 5) {
				field1469 = arg0.method238();
			} else if (var2 == 6) {
				field1470 = arg0.method240();
			} else if (var2 == 7) {
				field1471 = arg0.method240();
			} else if (var2 == 8) {
				field1472 = arg0.method238();
			} else if (var2 == 9) {
				field1473 = arg0.method238();
			} else if (var2 == 10) {
				field1474 = arg0.method238();
			} else if (var2 == 11) {
				field1475 = arg0.method238();
			} else if (var2 == 12) {
				field1476 = arg0.method243();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
