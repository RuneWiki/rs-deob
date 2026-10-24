package deob;

@ObfuscatedName("ZDMOUFDZ")
public final class ZDMOUFDZ {

	@ObfuscatedName("ZDMOUFDZ.a")
	public int field1419 = -1;

	@ObfuscatedName("ZDMOUFDZ.b")
	public int field1420 = -1;

	@ObfuscatedName("ZDMOUFDZ.c")
	public boolean field1421 = false;

	@ObfuscatedName("ZDMOUFDZ.e")
	public int field1423 = -1;

	@ObfuscatedName("ZDMOUFDZ.g")
	public int field1425 = -1;

	@ObfuscatedName("ZDMOUFDZ.i")
	public int field1427 = 128;

	@ObfuscatedName("ZDMOUFDZ.k")
	public boolean field1429 = true;

	@ObfuscatedName("ZDMOUFDZ.l")
	public int field1430 = -1;

	@ObfuscatedName("ZDMOUFDZ.n")
	public int field1432 = -1;

	@ObfuscatedName("ZDMOUFDZ.q")
	public int field1435 = -1;

	@ObfuscatedName("ZDMOUFDZ.t")
	public int field1438 = -1;

	@ObfuscatedName("ZDMOUFDZ.u")
	public int field1439 = -1;

	@ObfuscatedName("ZDMOUFDZ.x")
	public long field1441 = -1L;

	@ObfuscatedName("ZDMOUFDZ.y")
	public int field1442 = -1;

	@ObfuscatedName("ZDMOUFDZ.z")
	public byte field1443 = 1;

	@ObfuscatedName("ZDMOUFDZ.A")
	public int field1444 = 32;

	@ObfuscatedName("ZDMOUFDZ.F")
	public int field1449 = 128;

	@ObfuscatedName("ZDMOUFDZ.G")
	public int field1450 = -1;

	@ObfuscatedName("ZDMOUFDZ.H")
	public int field1451 = -1;

	@ObfuscatedName("ZDMOUFDZ.L")
	public boolean field1454 = true;

	@ObfuscatedName("ZDMOUFDZ.I")
	public static ISXEOURU field1452 = new ISXEOURU(30);

	@ObfuscatedName("ZDMOUFDZ.f")
	public int field1424;

	@ObfuscatedName("ZDMOUFDZ.j")
	public int field1428;

	@ObfuscatedName("ZDMOUFDZ.s")
	public static int field1437;

	@ObfuscatedName("ZDMOUFDZ.D")
	public static int field1447;

	@ObfuscatedName("ZDMOUFDZ.r")
	public static ZOMNSJJM field1436;

	@ObfuscatedName("ZDMOUFDZ.m")
	public static client field1431;

	@ObfuscatedName("ZDMOUFDZ.E")
	public String field1448;

	@ObfuscatedName("ZDMOUFDZ.C")
	public byte[] field1446;

	@ObfuscatedName("ZDMOUFDZ.h")
	public static int[] field1426;

	@ObfuscatedName("ZDMOUFDZ.p")
	public int[] field1434;

	@ObfuscatedName("ZDMOUFDZ.v")
	public int[] field1440;

	@ObfuscatedName("ZDMOUFDZ.B")
	public int[] field1445;

	@ObfuscatedName("ZDMOUFDZ.J")
	public int[] field1453;

	@ObfuscatedName("ZDMOUFDZ.M")
	public int[] field1455;

	@ObfuscatedName("ZDMOUFDZ.d")
	public static ZDMOUFDZ[] field1422;

	@ObfuscatedName("ZDMOUFDZ.o")
	public String[] field1433;

	@ObfuscatedName("ZDMOUFDZ.a(I)LZDMOUFDZ;")
	public final ZDMOUFDZ method528() {
		int var1 = -1;
		if (field1439 != -1) {
			DUFZKGOK var2 = DUFZKGOK.field719[field1439];
			int var3 = var2.field721;
			int var4 = var2.field722;
			int var5 = var2.field723;
			int var6 = client.field365[var5 - var4];
			var1 = field1431.field476[var3] >> var4 & var6;
		} else if (field1420 != -1) {
			var1 = field1431.field476[field1420];
		}

		if (var1 >= 0 && var1 < field1455.length && field1455[var1] != -1) {
			return method529(field1455[var1]);
		}

		return null;
	}

	@ObfuscatedName("ZDMOUFDZ.b(I)LZDMOUFDZ;")
	public static final ZDMOUFDZ method529(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1422[var1].field1441) {
				return field1422[var1];
			}
		}

		field1447 = (field1447 + 1) % 20;
		ZDMOUFDZ var2 = field1422[field1447] = new ZDMOUFDZ();
		field1436.field1457 = field1426[arg0];
		var2.field1441 = arg0;
		var2.method531(field1436);
		return var2;
	}

	@ObfuscatedName("ZDMOUFDZ.a(II[II)LCCYECDYX;")
	public final CCYECDYX method530(int arg0, int arg1, int[] arg2) {
		if (field1455 != null) {
			ZDMOUFDZ var4 = method528();
			if (var4 == null) {
				return null;
			}

			return var4.method530(arg0, arg1, arg2);
		}

		CCYECDYX var5 = (CCYECDYX) field1452.method228(field1441);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1440.length; var7++) {
				if (!CCYECDYX.method12(field1440[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			CCYECDYX[] var8 = new CCYECDYX[field1440.length];
			for (int var9 = 0; var9 < field1440.length; var9++) {
				var8[var9] = CCYECDYX.method11(field1440[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new CCYECDYX(var8, var8.length);
			}

			if (field1434 != null) {
				for (int var10 = 0; var10 < field1434.length; var10++) {
					var5.method25(field1434[var10], field1453[var10]);
				}
			}

			var5.method18();
			var5.method28(field1424 + 64, field1428 + 850, -30, -50, -30, true);
			field1452.method229(field1441, var5);
		}

		CCYECDYX var11 = CCYECDYX.field22;
		var11.method13(RKTGZGSS.method383(arg1) & RKTGZGSS.method383(arg0), var5);

		if (arg1 != -1 && arg0 != -1) {
			var11.method20(arg2, arg1, arg0);
		} else if (arg1 != -1) {
			var11.method19(arg1);
		}

		if (field1427 != 128 || field1449 != 128) {
			var11.method27(field1427, field1449, field1427);
		}

		var11.method15();
		var11.field59 = null;
		var11.field58 = null;

		if (field1443 == 1) {
			var11.field60 = true;
		}

		return var11;
	}

	@ObfuscatedName("ZDMOUFDZ.a(LZOMNSJJM;B)V")
	public final void method531(ZOMNSJJM arg0) {
		while (true) {
			int var2 = arg0.method547();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method547();
				field1440 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1440[var4] = arg0.method549();
				}
			} else if (var2 == 2) {
				field1448 = arg0.method554();
			} else if (var2 == 3) {
				field1446 = arg0.method555();
			} else if (var2 == 12) {
				field1443 = arg0.method548();
			} else if (var2 == 13) {
				field1451 = arg0.method549();
			} else if (var2 == 14) {
				field1438 = arg0.method549();
			} else if (var2 == 17) {
				field1438 = arg0.method549();
				field1450 = arg0.method549();
				field1419 = arg0.method549();
				field1425 = arg0.method549();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1433 == null) {
					field1433 = new String[5];
				}

				field1433[var2 - 30] = arg0.method554();
				if (field1433[var2 - 30].equalsIgnoreCase("hidden")) {
					field1433[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method547();
				field1434 = new int[var5];
				field1453 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1434[var6] = arg0.method549();
					field1453[var6] = arg0.method549();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method547();
				field1445 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1445[var8] = arg0.method549();
				}
			} else if (var2 == 90) {
				field1432 = arg0.method549();
			} else if (var2 == 91) {
				field1435 = arg0.method549();
			} else if (var2 == 92) {
				field1430 = arg0.method549();
			} else if (var2 == 93) {
				field1454 = false;
			} else if (var2 == 95) {
				field1423 = arg0.method549();
			} else if (var2 == 97) {
				field1427 = arg0.method549();
			} else if (var2 == 98) {
				field1449 = arg0.method549();
			} else if (var2 == 99) {
				field1421 = true;
			} else if (var2 == 100) {
				field1424 = arg0.method548();
			} else if (var2 == 101) {
				field1428 = arg0.method548() * 5;
			} else if (var2 == 102) {
				field1442 = arg0.method549();
			} else if (var2 == 103) {
				field1444 = arg0.method549();
			} else if (var2 == 106) {
				field1439 = arg0.method549();
				if (field1439 == 0xFFFF) {
					field1439 = -1;
				}

				field1420 = arg0.method549();
				if (field1420 == 0xFFFF) {
					field1420 = -1;
				}

				int var9 = arg0.method547();
				field1455 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1455[var10] = arg0.method549();
					if (field1455[var10] == 0xFFFF) {
						field1455[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1429 = false;
			}
		}
	}

	@ObfuscatedName("ZDMOUFDZ.a(LLYZBHNJP;)V")
	public static final void method532(LYZBHNJP arg0) {
		field1436 = new ZOMNSJJM(arg0.method290("npc.dat", null));
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("npc.idx", null));
		field1437 = var1.method549();
		field1426 = new int[field1437];
		int var2 = 2;
		for (int var3 = 0; var3 < field1437; var3++) {
			field1426[var3] = var2;
			var2 += var1.method549();
		}

		field1422 = new ZDMOUFDZ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1422[var4] = new ZDMOUFDZ();
		}
	}

	@ObfuscatedName("ZDMOUFDZ.c(I)LCCYECDYX;")
	public final CCYECDYX method533() {
		if (field1455 != null) {
			ZDMOUFDZ var1 = method528();
			if (var1 == null) {
				return null;
			}

			return var1.method533();
		} else if (field1445 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1445.length; var3++) {
				if (!CCYECDYX.method12(field1445[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			CCYECDYX[] var4 = new CCYECDYX[field1445.length];
			for (int var5 = 0; var5 < field1445.length; var5++) {
				var4[var5] = CCYECDYX.method11(field1445[var5]);
			}

			CCYECDYX var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new CCYECDYX(var4, var4.length);
			}

			if (field1434 != null) {
				for (int var7 = 0; var7 < field1434.length; var7++) {
					var6.method25(field1434[var7], field1453[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("ZDMOUFDZ.a(B)V")
	public static final void method534() {
		field1452 = null;
		field1426 = null;
		field1422 = null;
		field1436 = null;
	}
}
