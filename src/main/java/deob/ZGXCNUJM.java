package deob;

@ObfuscatedName("ZGXCNUJM")
public class ZGXCNUJM {

	@ObfuscatedName("ZGXCNUJM.i")
	public int field1486 = -1;

	@ObfuscatedName("ZGXCNUJM.k")
	public boolean field1488 = false;

	@ObfuscatedName("ZGXCNUJM.l")
	public int field1489 = 5;

	@ObfuscatedName("ZGXCNUJM.m")
	public int field1490 = -1;

	@ObfuscatedName("ZGXCNUJM.n")
	public int field1491 = -1;

	@ObfuscatedName("ZGXCNUJM.o")
	public int field1492 = 99;

	@ObfuscatedName("ZGXCNUJM.p")
	public int field1493 = -1;

	@ObfuscatedName("ZGXCNUJM.q")
	public int field1494 = -1;

	@ObfuscatedName("ZGXCNUJM.r")
	public int field1495 = 2;

	@ObfuscatedName("ZGXCNUJM.c")
	public static int field1480;

	@ObfuscatedName("ZGXCNUJM.e")
	public int field1482;

	@ObfuscatedName("ZGXCNUJM.s")
	public int field1496;

	@ObfuscatedName("ZGXCNUJM.f")
	public int[] field1483;

	@ObfuscatedName("ZGXCNUJM.g")
	public int[] field1484;

	@ObfuscatedName("ZGXCNUJM.h")
	public int[] field1485;

	@ObfuscatedName("ZGXCNUJM.j")
	public int[] field1487;

	@ObfuscatedName("ZGXCNUJM.d")
	public static ZGXCNUJM[] field1481;

	@ObfuscatedName("ZGXCNUJM.a(LFNOQZAYQ;I)V")
	public static void method597(FNOQZAYQ arg0) {
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("seq.dat", null));
		field1480 = var1.method191();
		if (field1481 == null) {
			field1481 = new ZGXCNUJM[field1480];
		}

		for (int var2 = 0; var2 < field1480; var2++) {
			if (field1481[var2] == null) {
				field1481[var2] = new ZGXCNUJM();
			}

			field1481[var2].method599(var1);
		}
	}

	@ObfuscatedName("ZGXCNUJM.a(II)I")
	public int method598(int arg0) {
		int var2 = field1485[arg0];
		if (var2 == 0) {
			NLIOLBXV var3 = NLIOLBXV.method355(field1483[arg0]);
			if (var3 != null) {
				var2 = field1485[arg0] = var3.field1004;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("ZGXCNUJM.a(LDNRIFKTO;I)V")
	public void method599(DNRIFKTO arg0) {
		while (true) {
			int var2 = arg0.method189();
			if (var2 == 0) {
				if (field1482 == 0) {
					field1482 = 1;
					field1483 = new int[1];
					field1483[0] = -1;
					field1484 = new int[1];
					field1484[0] = -1;
					field1485 = new int[1];
					field1485[0] = -1;
				}

				if (field1493 == -1) {
					if (field1487 == null) {
						field1493 = 0;
					} else {
						field1493 = 2;
					}
				}

				if (field1494 == -1) {
					if (field1487 != null) {
						field1494 = 2;
						return;
					}

					field1494 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1482 = arg0.method189();
				field1483 = new int[field1482];
				field1484 = new int[field1482];
				field1485 = new int[field1482];
				for (int var3 = 0; var3 < field1482; var3++) {
					field1483[var3] = arg0.method191();
					field1484[var3] = arg0.method191();
					if (field1484[var3] == 0xFFFF) {
						field1484[var3] = -1;
					}

					field1485[var3] = arg0.method191();
				}
			} else if (var2 == 2) {
				field1486 = arg0.method191();
			} else if (var2 == 3) {
				int var4 = arg0.method189();
				field1487 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1487[var5] = arg0.method189();
				}

				field1487[var4] = 9999999;
			} else if (var2 == 4) {
				field1488 = true;
			} else if (var2 == 5) {
				field1489 = arg0.method189();
			} else if (var2 == 6) {
				field1490 = arg0.method191();
			} else if (var2 == 7) {
				field1491 = arg0.method191();
			} else if (var2 == 8) {
				field1492 = arg0.method189();
			} else if (var2 == 9) {
				field1493 = arg0.method189();
			} else if (var2 == 10) {
				field1494 = arg0.method189();
			} else if (var2 == 11) {
				field1495 = arg0.method189();
			} else if (var2 == 12) {
				field1496 = arg0.method194();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
