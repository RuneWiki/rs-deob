package deob;

@ObfuscatedName("XRDQTWLL")
public class XRDQTWLL {

	@ObfuscatedName("XRDQTWLL.j")
	public int field1423 = -1;

	@ObfuscatedName("XRDQTWLL.l")
	public boolean field1425 = false;

	@ObfuscatedName("XRDQTWLL.m")
	public int field1426 = 5;

	@ObfuscatedName("XRDQTWLL.n")
	public int field1427 = -1;

	@ObfuscatedName("XRDQTWLL.o")
	public int field1428 = -1;

	@ObfuscatedName("XRDQTWLL.p")
	public int field1429 = 99;

	@ObfuscatedName("XRDQTWLL.q")
	public int field1430 = -1;

	@ObfuscatedName("XRDQTWLL.r")
	public int field1431 = -1;

	@ObfuscatedName("XRDQTWLL.s")
	public int field1432 = 2;

	@ObfuscatedName("XRDQTWLL.d")
	public static int field1417;

	@ObfuscatedName("XRDQTWLL.f")
	public int field1419;

	@ObfuscatedName("XRDQTWLL.t")
	public int field1433;

	@ObfuscatedName("XRDQTWLL.g")
	public int[] field1420;

	@ObfuscatedName("XRDQTWLL.h")
	public int[] field1421;

	@ObfuscatedName("XRDQTWLL.i")
	public int[] field1422;

	@ObfuscatedName("XRDQTWLL.k")
	public int[] field1424;

	@ObfuscatedName("XRDQTWLL.e")
	public static XRDQTWLL[] field1418;

	@ObfuscatedName("XRDQTWLL.a(ILUUIGNTAD;)V")
	public static void method582(UUIGNTAD arg0) {
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("seq.dat", null));
		field1417 = var1.method196();
		if (field1418 == null) {
			field1418 = new XRDQTWLL[field1417];
		}

		for (int var2 = 0; var2 < field1417; var2++) {
			if (field1418[var2] == null) {
				field1418[var2] = new XRDQTWLL();
			}

			field1418[var2].method584(var1);
		}
	}

	@ObfuscatedName("XRDQTWLL.a(IB)I")
	public int method583(int arg0) {
		int var2 = field1422[arg0];
		if (var2 == 0) {
			RLONYBCF var3 = RLONYBCF.method435(field1420[arg0]);
			if (var3 != null) {
				var2 = field1422[arg0] = var3.field1058;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("XRDQTWLL.a(LCMGGUSPR;I)V")
	public void method584(CMGGUSPR arg0) {
		while (true) {
			int var2 = arg0.method194();
			if (var2 == 0) {
				if (field1419 == 0) {
					field1419 = 1;
					field1420 = new int[1];
					field1420[0] = -1;
					field1421 = new int[1];
					field1421[0] = -1;
					field1422 = new int[1];
					field1422[0] = -1;
				}

				if (field1430 == -1) {
					if (field1424 == null) {
						field1430 = 0;
					} else {
						field1430 = 2;
					}
				}

				if (field1431 == -1) {
					if (field1424 != null) {
						field1431 = 2;
						return;
					}

					field1431 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1419 = arg0.method194();
				field1420 = new int[field1419];
				field1421 = new int[field1419];
				field1422 = new int[field1419];
				for (int var3 = 0; var3 < field1419; var3++) {
					field1420[var3] = arg0.method196();
					field1421[var3] = arg0.method196();
					if (field1421[var3] == 0xFFFF) {
						field1421[var3] = -1;
					}

					field1422[var3] = arg0.method196();
				}
			} else if (var2 == 2) {
				field1423 = arg0.method196();
			} else if (var2 == 3) {
				int var4 = arg0.method194();
				field1424 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1424[var5] = arg0.method194();
				}

				field1424[var4] = 9999999;
			} else if (var2 == 4) {
				field1425 = true;
			} else if (var2 == 5) {
				field1426 = arg0.method194();
			} else if (var2 == 6) {
				field1427 = arg0.method196();
			} else if (var2 == 7) {
				field1428 = arg0.method196();
			} else if (var2 == 8) {
				field1429 = arg0.method194();
			} else if (var2 == 9) {
				field1430 = arg0.method194();
			} else if (var2 == 10) {
				field1431 = arg0.method194();
			} else if (var2 == 11) {
				field1432 = arg0.method194();
			} else if (var2 == 12) {
				field1433 = arg0.method199();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
