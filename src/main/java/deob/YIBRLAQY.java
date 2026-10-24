package deob;

@ObfuscatedName("YIBRLAQY")
public final class YIBRLAQY {

	@ObfuscatedName("YIBRLAQY.a")
	public int field1439 = -1;

	@ObfuscatedName("YIBRLAQY.b")
	public long field1440 = -1L;

	@ObfuscatedName("YIBRLAQY.c")
	public int field1441 = -1;

	@ObfuscatedName("YIBRLAQY.e")
	public boolean field1443 = true;

	@ObfuscatedName("YIBRLAQY.o")
	public int field1452 = -1;

	@ObfuscatedName("YIBRLAQY.q")
	public int field1454 = 32;

	@ObfuscatedName("YIBRLAQY.r")
	public int field1455 = -1;

	@ObfuscatedName("YIBRLAQY.s")
	public int field1456 = 128;

	@ObfuscatedName("YIBRLAQY.t")
	public int field1457 = -1;

	@ObfuscatedName("YIBRLAQY.v")
	public boolean field1459 = false;

	@ObfuscatedName("YIBRLAQY.w")
	public int field1460 = -1;

	@ObfuscatedName("YIBRLAQY.A")
	public int field1463 = 128;

	@ObfuscatedName("YIBRLAQY.B")
	public int field1464 = -1;

	@ObfuscatedName("YIBRLAQY.D")
	public int field1466 = -1;

	@ObfuscatedName("YIBRLAQY.E")
	public int field1467 = -1;

	@ObfuscatedName("YIBRLAQY.F")
	public int field1468 = -1;

	@ObfuscatedName("YIBRLAQY.G")
	public boolean field1469 = true;

	@ObfuscatedName("YIBRLAQY.J")
	public int field1472 = -1;

	@ObfuscatedName("YIBRLAQY.K")
	public int field1473 = -1;

	@ObfuscatedName("YIBRLAQY.N")
	public byte field1475 = 1;

	@ObfuscatedName("YIBRLAQY.g")
	public static WIUIWDML field1445 = new WIUIWDML(30);

	@ObfuscatedName("YIBRLAQY.j")
	public int field1448;

	@ObfuscatedName("YIBRLAQY.l")
	public static int field1450;

	@ObfuscatedName("YIBRLAQY.n")
	public int field1451;

	@ObfuscatedName("YIBRLAQY.x")
	public static int field1461;

	@ObfuscatedName("YIBRLAQY.L")
	public static PKHWFJLM field1474;

	@ObfuscatedName("YIBRLAQY.f")
	public static client field1444;

	@ObfuscatedName("YIBRLAQY.p")
	public String field1453;

	@ObfuscatedName("YIBRLAQY.C")
	public byte[] field1465;

	@ObfuscatedName("YIBRLAQY.d")
	public int[] field1442;

	@ObfuscatedName("YIBRLAQY.h")
	public int[] field1446;

	@ObfuscatedName("YIBRLAQY.i")
	public int[] field1447;

	@ObfuscatedName("YIBRLAQY.u")
	public int[] field1458;

	@ObfuscatedName("YIBRLAQY.y")
	public int[] field1462;

	@ObfuscatedName("YIBRLAQY.H")
	public static int[] field1470;

	@ObfuscatedName("YIBRLAQY.k")
	public static YIBRLAQY[] field1449;

	@ObfuscatedName("YIBRLAQY.I")
	public String[] field1471;

	@ObfuscatedName("YIBRLAQY.a(I)LYIBRLAQY;")
	public final YIBRLAQY method576() {
		int var1 = -1;
		if (field1455 != -1) {
			BCUFZZFO var2 = BCUFZZFO.field27[field1455];
			int var3 = var2.field29;
			int var4 = var2.field30;
			int var5 = var2.field31;
			int var6 = client.field178[var5 - var4];
			var1 = field1444.field165[var3] >> var4 & var6;
		} else if (field1452 != -1) {
			var1 = field1444.field165[field1452];
		}

		if (var1 >= 0 && var1 < field1447.length && field1447[var1] != -1) {
			return method579(field1447[var1]);
		}

		return null;
	}

	@ObfuscatedName("YIBRLAQY.a(LPKHWFJLM;Z)V")
	public final void method577(PKHWFJLM arg0) {
		while (true) {
			int var2 = arg0.method330();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method330();
				field1462 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1462[var4] = arg0.method332();
				}
			} else if (var2 == 2) {
				field1453 = arg0.method337();
			} else if (var2 == 3) {
				field1465 = arg0.method338();
			} else if (var2 == 12) {
				field1475 = arg0.method331();
			} else if (var2 == 13) {
				field1464 = arg0.method332();
			} else if (var2 == 14) {
				field1472 = arg0.method332();
			} else if (var2 == 17) {
				field1472 = arg0.method332();
				field1457 = arg0.method332();
				field1468 = arg0.method332();
				field1441 = arg0.method332();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1471 == null) {
					field1471 = new String[5];
				}

				field1471[var2 - 30] = arg0.method337();
				if (field1471[var2 - 30].equalsIgnoreCase("hidden")) {
					field1471[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method330();
				field1446 = new int[var5];
				field1442 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1446[var6] = arg0.method332();
					field1442[var6] = arg0.method332();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method330();
				field1458 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1458[var8] = arg0.method332();
				}
			} else if (var2 == 90) {
				field1466 = arg0.method332();
			} else if (var2 == 91) {
				field1467 = arg0.method332();
			} else if (var2 == 92) {
				field1473 = arg0.method332();
			} else if (var2 == 93) {
				field1469 = false;
			} else if (var2 == 95) {
				field1439 = arg0.method332();
			} else if (var2 == 97) {
				field1456 = arg0.method332();
			} else if (var2 == 98) {
				field1463 = arg0.method332();
			} else if (var2 == 99) {
				field1459 = true;
			} else if (var2 == 100) {
				field1451 = arg0.method331();
			} else if (var2 == 101) {
				field1448 = arg0.method331() * 5;
			} else if (var2 == 102) {
				field1460 = arg0.method332();
			} else if (var2 == 103) {
				field1454 = arg0.method332();
			} else if (var2 == 106) {
				field1455 = arg0.method332();
				if (field1455 == 0xFFFF) {
					field1455 = -1;
				}

				field1452 = arg0.method332();
				if (field1452 == 0xFFFF) {
					field1452 = -1;
				}

				int var9 = arg0.method330();
				field1447 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1447[var10] = arg0.method332();
					if (field1447[var10] == 0xFFFF) {
						field1447[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1443 = false;
			}
		}
	}

	@ObfuscatedName("YIBRLAQY.a(B)V")
	public static final void method578() {
		field1445 = null;
		field1470 = null;
		field1449 = null;
		field1474 = null;
	}

	@ObfuscatedName("YIBRLAQY.b(I)LYIBRLAQY;")
	public static final YIBRLAQY method579(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1449[var1].field1440) {
				return field1449[var1];
			}
		}

		field1461 = (field1461 + 1) % 20;
		YIBRLAQY var2 = field1449[field1461] = new YIBRLAQY();
		field1474.field971 = field1470[arg0];
		var2.field1440 = arg0;
		var2.method577(field1474);
		return var2;
	}

	@ObfuscatedName("YIBRLAQY.a(LTXPLZUUI;)V")
	public static final void method580(TXPLZUUI arg0) {
		field1474 = new PKHWFJLM(arg0.method506("npc.dat", null));
		PKHWFJLM var1 = new PKHWFJLM(arg0.method506("npc.idx", null));
		field1450 = var1.method332();
		field1470 = new int[field1450];
		int var2 = 2;
		for (int var3 = 0; var3 < field1450; var3++) {
			field1470[var3] = var2;
			var2 += var1.method332();
		}

		field1449 = new YIBRLAQY[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1449[var4] = new YIBRLAQY();
		}
	}

	@ObfuscatedName("YIBRLAQY.a(II[II)LPSGMMDJS;")
	public final PSGMMDJS method581(int arg0, int arg1, int[] arg2) {
		if (field1447 != null) {
			YIBRLAQY var4 = method576();
			if (var4 == null) {
				return null;
			}

			return var4.method581(arg0, arg1, arg2);
		}

		PSGMMDJS var5 = (PSGMMDJS) field1445.method519(field1440);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1462.length; var7++) {
				if (!PSGMMDJS.method411(field1462[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			PSGMMDJS[] var8 = new PSGMMDJS[field1462.length];
			for (int var9 = 0; var9 < field1462.length; var9++) {
				var8[var9] = PSGMMDJS.method410(field1462[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new PSGMMDJS(var8.length, var8);
			}

			if (field1446 != null) {
				for (int var10 = 0; var10 < field1446.length; var10++) {
					var5.method424(field1446[var10], field1442[var10]);
				}
			}

			var5.method417();
			var5.method427(field1451 + 64, field1448 + 850, -30, -50, -30, true);
			field1445.method520(field1440, var5);
		}

		PSGMMDJS var11 = PSGMMDJS.field991;
		var11.method412(var5, AOFTXYIM.method5(arg0) & AOFTXYIM.method5(arg1));

		if (arg0 != -1 && arg1 != -1) {
			var11.method419(arg2, arg1, arg0);
		} else if (arg0 != -1) {
			var11.method418(arg0);
		}

		if (field1456 != 128 || field1463 != 128) {
			var11.method426(field1463, field1456, field1456);
		}

		var11.method414();
		var11.field1028 = null;
		var11.field1027 = null;

		if (field1475 == 1) {
			var11.field1029 = true;
		}

		return var11;
	}

	@ObfuscatedName("YIBRLAQY.c(I)LPSGMMDJS;")
	public final PSGMMDJS method582() {
		if (field1447 != null) {
			YIBRLAQY var1 = method576();
			if (var1 == null) {
				return null;
			}

			return var1.method582();
		} else if (field1458 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1458.length; var3++) {
				if (!PSGMMDJS.method411(field1458[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			PSGMMDJS[] var4 = new PSGMMDJS[field1458.length];
			for (int var5 = 0; var5 < field1458.length; var5++) {
				var4[var5] = PSGMMDJS.method410(field1458[var5]);
			}

			PSGMMDJS var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new PSGMMDJS(var4.length, var4);
			}

			if (field1446 != null) {
				for (int var7 = 0; var7 < field1446.length; var7++) {
					var6.method424(field1446[var7], field1442[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("YIBRLAQY.a(Z)Z")
	public boolean method583() {
		if (field1447 == null) {
			return true;
		}

		int var1 = -1;
		if (field1455 != -1) {
			BCUFZZFO var2 = BCUFZZFO.field27[field1455];
			int var3 = var2.field29;
			int var4 = var2.field30;
			int var5 = var2.field31;
			int var6 = client.field178[var5 - var4];
			var1 = field1444.field165[var3] >> var4 & var6;
		} else if (field1452 != -1) {
			var1 = field1444.field165[field1452];
		}

		if (var1 >= 0 && var1 < field1447.length && field1447[var1] != -1) {
			return true;
		}

		return false;
	}
}
