package deob;

@ObfuscatedName("XETSOHUA")
public class XETSOHUA {

	@ObfuscatedName("XETSOHUA.h")
	public int field1479 = -1;

	@ObfuscatedName("XETSOHUA.j")
	public boolean field1481 = false;

	@ObfuscatedName("XETSOHUA.k")
	public int field1482 = 5;

	@ObfuscatedName("XETSOHUA.l")
	public int field1483 = -1;

	@ObfuscatedName("XETSOHUA.m")
	public int field1484 = -1;

	@ObfuscatedName("XETSOHUA.n")
	public int field1485 = 99;

	@ObfuscatedName("XETSOHUA.o")
	public int field1486 = -1;

	@ObfuscatedName("XETSOHUA.p")
	public int field1487 = -1;

	@ObfuscatedName("XETSOHUA.q")
	public int field1488 = 2;

	@ObfuscatedName("XETSOHUA.b")
	public static int field1473;

	@ObfuscatedName("XETSOHUA.d")
	public int field1475;

	@ObfuscatedName("XETSOHUA.r")
	public int field1489;

	@ObfuscatedName("XETSOHUA.e")
	public int[] field1476;

	@ObfuscatedName("XETSOHUA.f")
	public int[] field1477;

	@ObfuscatedName("XETSOHUA.g")
	public int[] field1478;

	@ObfuscatedName("XETSOHUA.i")
	public int[] field1480;

	@ObfuscatedName("XETSOHUA.c")
	public static XETSOHUA[] field1474;

	@ObfuscatedName("XETSOHUA.a(LLKPVZAQN;I)V")
	public static void method566(LKPVZAQN arg0) {
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("seq.dat", null));
		field1473 = var1.method517();
		if (field1474 == null) {
			field1474 = new XETSOHUA[field1473];
		}

		for (int var2 = 0; var2 < field1473; var2++) {
			if (field1474[var2] == null) {
				field1474[var2] = new XETSOHUA();
			}

			field1474[var2].method568(var1);
		}
	}

	@ObfuscatedName("XETSOHUA.a(II)I")
	public int method567(int arg0) {
		int var2 = field1478[arg0];
		if (var2 == 0) {
			FGGKJQKK var3 = FGGKJQKK.method234(field1476[arg0]);
			if (var3 != null) {
				var2 = field1478[arg0] = var3.field760;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("XETSOHUA.a(LWBEWPIXO;I)V")
	public void method568(WBEWPIXO arg0) {
		while (true) {
			int var2 = arg0.method515();
			if (var2 == 0) {
				if (field1475 == 0) {
					field1475 = 1;
					field1476 = new int[1];
					field1476[0] = -1;
					field1477 = new int[1];
					field1477[0] = -1;
					field1478 = new int[1];
					field1478[0] = -1;
				}

				if (field1486 == -1) {
					if (field1480 == null) {
						field1486 = 0;
					} else {
						field1486 = 2;
					}
				}

				if (field1487 == -1) {
					if (field1480 != null) {
						field1487 = 2;
						return;
					}

					field1487 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1475 = arg0.method515();
				field1476 = new int[field1475];
				field1477 = new int[field1475];
				field1478 = new int[field1475];
				for (int var3 = 0; var3 < field1475; var3++) {
					field1476[var3] = arg0.method517();
					field1477[var3] = arg0.method517();
					if (field1477[var3] == 0xFFFF) {
						field1477[var3] = -1;
					}

					field1478[var3] = arg0.method517();
				}
			} else if (var2 == 2) {
				field1479 = arg0.method517();
			} else if (var2 == 3) {
				int var4 = arg0.method515();
				field1480 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1480[var5] = arg0.method515();
				}

				field1480[var4] = 9999999;
			} else if (var2 == 4) {
				field1481 = true;
			} else if (var2 == 5) {
				field1482 = arg0.method515();
			} else if (var2 == 6) {
				field1483 = arg0.method517();
			} else if (var2 == 7) {
				field1484 = arg0.method517();
			} else if (var2 == 8) {
				field1485 = arg0.method515();
			} else if (var2 == 9) {
				field1486 = arg0.method515();
			} else if (var2 == 10) {
				field1487 = arg0.method515();
			} else if (var2 == 11) {
				field1488 = arg0.method515();
			} else if (var2 == 12) {
				field1489 = arg0.method520();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
