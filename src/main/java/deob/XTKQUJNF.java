package deob;

@ObfuscatedName("XTKQUJNF")
public class XTKQUJNF {

	@ObfuscatedName("XTKQUJNF.h")
	public int field1437 = -1;

	@ObfuscatedName("XTKQUJNF.j")
	public boolean field1439 = false;

	@ObfuscatedName("XTKQUJNF.k")
	public int field1440 = 5;

	@ObfuscatedName("XTKQUJNF.l")
	public int field1441 = -1;

	@ObfuscatedName("XTKQUJNF.m")
	public int field1442 = -1;

	@ObfuscatedName("XTKQUJNF.n")
	public int field1443 = 99;

	@ObfuscatedName("XTKQUJNF.o")
	public int field1444 = -1;

	@ObfuscatedName("XTKQUJNF.p")
	public int field1445 = -1;

	@ObfuscatedName("XTKQUJNF.q")
	public int field1446 = 2;

	@ObfuscatedName("XTKQUJNF.b")
	public static int field1431;

	@ObfuscatedName("XTKQUJNF.d")
	public int field1433;

	@ObfuscatedName("XTKQUJNF.r")
	public int field1447;

	@ObfuscatedName("XTKQUJNF.e")
	public int[] field1434;

	@ObfuscatedName("XTKQUJNF.f")
	public int[] field1435;

	@ObfuscatedName("XTKQUJNF.g")
	public int[] field1436;

	@ObfuscatedName("XTKQUJNF.i")
	public int[] field1438;

	@ObfuscatedName("XTKQUJNF.c")
	public static XTKQUJNF[] field1432;

	@ObfuscatedName("XTKQUJNF.a(LAWEEREDT;I)V")
	public static void method531(AWEEREDT arg0) {
		IUVBENCV var1 = new IUVBENCV(arg0.method14("seq.dat", null));
		field1431 = var1.method247();
		if (field1432 == null) {
			field1432 = new XTKQUJNF[field1431];
		}

		for (int var2 = 0; var2 < field1431; var2++) {
			if (field1432[var2] == null) {
				field1432[var2] = new XTKQUJNF();
			}

			field1432[var2].method533(var1);
		}
	}

	@ObfuscatedName("XTKQUJNF.a(IB)I")
	public int method532(int arg0) {
		int var2 = field1436[arg0];
		if (var2 == 0) {
			OJYMITMR var3 = OJYMITMR.method381(field1434[arg0]);
			if (var3 != null) {
				var2 = field1436[arg0] = var3.field1161;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("XTKQUJNF.a(LIUVBENCV;B)V")
	public void method533(IUVBENCV arg0) {
		while (true) {
			int var2 = arg0.method245();
			if (var2 == 0) {
				if (field1433 == 0) {
					field1433 = 1;
					field1434 = new int[1];
					field1434[0] = -1;
					field1435 = new int[1];
					field1435[0] = -1;
					field1436 = new int[1];
					field1436[0] = -1;
				}

				if (field1444 == -1) {
					if (field1438 == null) {
						field1444 = 0;
					} else {
						field1444 = 2;
					}
				}

				if (field1445 == -1) {
					if (field1438 != null) {
						field1445 = 2;
						return;
					}

					field1445 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1433 = arg0.method245();
				field1434 = new int[field1433];
				field1435 = new int[field1433];
				field1436 = new int[field1433];
				for (int var3 = 0; var3 < field1433; var3++) {
					field1434[var3] = arg0.method247();
					field1435[var3] = arg0.method247();
					if (field1435[var3] == 0xFFFF) {
						field1435[var3] = -1;
					}

					field1436[var3] = arg0.method247();
				}
			} else if (var2 == 2) {
				field1437 = arg0.method247();
			} else if (var2 == 3) {
				int var4 = arg0.method245();
				field1438 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1438[var5] = arg0.method245();
				}

				field1438[var4] = 9999999;
			} else if (var2 == 4) {
				field1439 = true;
			} else if (var2 == 5) {
				field1440 = arg0.method245();
			} else if (var2 == 6) {
				field1441 = arg0.method247();
			} else if (var2 == 7) {
				field1442 = arg0.method247();
			} else if (var2 == 8) {
				field1443 = arg0.method245();
			} else if (var2 == 9) {
				field1444 = arg0.method245();
			} else if (var2 == 10) {
				field1445 = arg0.method245();
			} else if (var2 == 11) {
				field1446 = arg0.method245();
			} else if (var2 == 12) {
				field1447 = arg0.method250();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
