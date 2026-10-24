package deob;

@ObfuscatedName("YXSRFNQD")
public final class YXSRFNQD {

	@ObfuscatedName("YXSRFNQD.a")
	public int field1470 = 32;

	@ObfuscatedName("YXSRFNQD.b")
	public int field1471 = 128;

	@ObfuscatedName("YXSRFNQD.d")
	public int field1473 = -1;

	@ObfuscatedName("YXSRFNQD.e")
	public String field1474 = "null";

	@ObfuscatedName("YXSRFNQD.h")
	public int field1477 = -1;

	@ObfuscatedName("YXSRFNQD.i")
	public int field1478 = -1;

	@ObfuscatedName("YXSRFNQD.l")
	public boolean field1480 = false;

	@ObfuscatedName("YXSRFNQD.n")
	public int field1482 = -1;

	@ObfuscatedName("YXSRFNQD.o")
	public int field1483 = -1;

	@ObfuscatedName("YXSRFNQD.r")
	public long field1486 = -1L;

	@ObfuscatedName("YXSRFNQD.s")
	public boolean field1487 = true;

	@ObfuscatedName("YXSRFNQD.v")
	public int field1490 = -1;

	@ObfuscatedName("YXSRFNQD.x")
	public byte field1492 = 1;

	@ObfuscatedName("YXSRFNQD.z")
	public int field1494 = -1;

	@ObfuscatedName("YXSRFNQD.A")
	public int field1495 = -1;

	@ObfuscatedName("YXSRFNQD.B")
	public int field1496 = 128;

	@ObfuscatedName("YXSRFNQD.C")
	public int field1497 = -1;

	@ObfuscatedName("YXSRFNQD.D")
	public int field1498 = -1;

	@ObfuscatedName("YXSRFNQD.G")
	public int field1501 = -1;

	@ObfuscatedName("YXSRFNQD.H")
	public boolean field1502 = true;

	@ObfuscatedName("YXSRFNQD.M")
	public int field1506 = -1;

	@ObfuscatedName("YXSRFNQD.j")
	public static LXKBDSHJ field1479 = new LXKBDSHJ(30);

	@ObfuscatedName("YXSRFNQD.q")
	public int field1485;

	@ObfuscatedName("YXSRFNQD.y")
	public static int field1493;

	@ObfuscatedName("YXSRFNQD.E")
	public static int field1499;

	@ObfuscatedName("YXSRFNQD.K")
	public int field1504;

	@ObfuscatedName("YXSRFNQD.c")
	public static TKPFKOXP field1472;

	@ObfuscatedName("YXSRFNQD.F")
	public static client field1500;

	@ObfuscatedName("YXSRFNQD.L")
	public byte[] field1505;

	@ObfuscatedName("YXSRFNQD.f")
	public int[] field1475;

	@ObfuscatedName("YXSRFNQD.g")
	public int[] field1476;

	@ObfuscatedName("YXSRFNQD.m")
	public int[] field1481;

	@ObfuscatedName("YXSRFNQD.p")
	public int[] field1484;

	@ObfuscatedName("YXSRFNQD.u")
	public int[] field1489;

	@ObfuscatedName("YXSRFNQD.w")
	public static int[] field1491;

	@ObfuscatedName("YXSRFNQD.J")
	public static YXSRFNQD[] field1503;

	@ObfuscatedName("YXSRFNQD.t")
	public String[] field1488;

	@ObfuscatedName("YXSRFNQD.a(LJUPFHAZZ;)V")
	public static final void method592(JUPFHAZZ arg0) {
		field1472 = new TKPFKOXP(arg0.method372("npc.dat", null));
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("npc.idx", null));
		field1499 = var1.method531();
		field1491 = new int[field1499];
		int var2 = 2;
		for (int var3 = 0; var3 < field1499; var3++) {
			field1491[var3] = var2;
			var2 += var1.method531();
		}

		field1503 = new YXSRFNQD[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1503[var4] = new YXSRFNQD();
		}
	}

	@ObfuscatedName("YXSRFNQD.a(Z)LYXSRFNQD;")
	public final YXSRFNQD method593() {
		int var1 = -1;
		if (field1506 != -1) {
			UDCHKCCJ var2 = UDCHKCCJ.field1395[field1506];
			int var3 = var2.field1397;
			int var4 = var2.field1398;
			int var5 = var2.field1399;
			int var6 = client.field571[var5 - var4];
			var1 = field1500.field472[var3] >> var4 & var6;
		} else if (field1490 != -1) {
			var1 = field1500.field472[field1490];
		}

		if (var1 >= 0 && var1 < field1481.length && field1481[var1] != -1) {
			return method598(field1481[var1]);
		}

		return null;
	}

	@ObfuscatedName("YXSRFNQD.a(B)V")
	public static final void method594() {
		field1479 = null;
		field1491 = null;
		field1503 = null;
		field1472 = null;
	}

	@ObfuscatedName("YXSRFNQD.a([IIII)LOGORHYVW;")
	public final OGORHYVW method595(int[] arg0, int arg1, int arg2) {
		if (field1481 != null) {
			YXSRFNQD var4 = method593();
			if (var4 == null) {
				return null;
			}

			return var4.method595(arg0, arg1, arg2);
		}

		OGORHYVW var5 = (OGORHYVW) field1479.method413(field1486);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1475.length; var7++) {
				if (!OGORHYVW.method434(field1475[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			OGORHYVW[] var8 = new OGORHYVW[field1475.length];
			for (int var9 = 0; var9 < field1475.length; var9++) {
				var8[var9] = OGORHYVW.method433(field1475[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new OGORHYVW(var8.length, var8);
			}

			if (field1476 != null) {
				for (int var10 = 0; var10 < field1476.length; var10++) {
					var5.method447(field1476[var10], field1484[var10]);
				}
			}

			var5.method440();
			var5.method450(field1485 + 64, field1504 + 850, -30, -50, -30, true);
			field1479.method414(var5, field1486);
		}

		OGORHYVW var11 = OGORHYVW.field1104;
		var11.method435(var5, OYJABRDD.method467(arg2) & OYJABRDD.method467(arg1));

		if (arg2 != -1 && arg1 != -1) {
			var11.method442(arg0, arg2, arg1);
		} else if (arg2 != -1) {
			var11.method441(arg2);
		}

		if (field1496 != 128 || field1471 != 128) {
			var11.method449(field1496, field1496, field1471);
		}

		var11.method437();
		var11.field1140 = null;
		var11.field1139 = null;

		if (field1492 == 1) {
			var11.field1141 = true;
		}

		return var11;
	}

	@ObfuscatedName("YXSRFNQD.a(I)LOGORHYVW;")
	public final OGORHYVW method596() {
		if (field1481 != null) {
			YXSRFNQD var1 = method593();
			if (var1 == null) {
				return null;
			}

			return var1.method596();
		} else if (field1489 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1489.length; var3++) {
				if (!OGORHYVW.method434(field1489[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			OGORHYVW[] var4 = new OGORHYVW[field1489.length];
			for (int var5 = 0; var5 < field1489.length; var5++) {
				var4[var5] = OGORHYVW.method433(field1489[var5]);
			}

			OGORHYVW var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new OGORHYVW(var4.length, var4);
			}

			if (field1476 != null) {
				for (int var7 = 0; var7 < field1476.length; var7++) {
					var6.method447(field1476[var7], field1484[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("YXSRFNQD.b(I)Z")
	public boolean method597() {
		if (field1481 == null) {
			return true;
		}

		int var1 = -1;
		if (field1506 != -1) {
			UDCHKCCJ var2 = UDCHKCCJ.field1395[field1506];
			int var3 = var2.field1397;
			int var4 = var2.field1398;
			int var5 = var2.field1399;
			int var6 = client.field571[var5 - var4];
			var1 = field1500.field472[var3] >> var4 & var6;
		} else if (field1490 != -1) {
			var1 = field1500.field472[field1490];
		}

		if (var1 >= 0 && var1 < field1481.length && field1481[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("YXSRFNQD.c(I)LYXSRFNQD;")
	public static final YXSRFNQD method598(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1503[var1].field1486) {
				return field1503[var1];
			}
		}

		field1493 = (field1493 + 1) % 20;
		YXSRFNQD var2 = field1503[field1493] = new YXSRFNQD();
		field1472.field1382 = field1491[arg0];
		var2.field1486 = arg0;
		var2.method599(field1472);
		return var2;
	}

	@ObfuscatedName("YXSRFNQD.a(LTKPFKOXP;B)V")
	public final void method599(TKPFKOXP arg0) {
		while (true) {
			int var2 = arg0.method529();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method529();
				field1475 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1475[var4] = arg0.method531();
				}
			} else if (var2 == 2) {
				field1474 = arg0.method536();
			} else if (var2 == 3) {
				field1505 = arg0.method537();
			} else if (var2 == 12) {
				field1492 = arg0.method530();
			} else if (var2 == 13) {
				field1477 = arg0.method531();
			} else if (var2 == 14) {
				field1483 = arg0.method531();
			} else if (var2 == 17) {
				field1483 = arg0.method531();
				field1498 = arg0.method531();
				field1497 = arg0.method531();
				field1473 = arg0.method531();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1488 == null) {
					field1488 = new String[5];
				}

				field1488[var2 - 30] = arg0.method536();
				if (field1488[var2 - 30].equalsIgnoreCase("hidden")) {
					field1488[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method529();
				field1476 = new int[var5];
				field1484 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1476[var6] = arg0.method531();
					field1484[var6] = arg0.method531();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method529();
				field1489 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1489[var8] = arg0.method531();
				}
			} else if (var2 == 90) {
				field1482 = arg0.method531();
			} else if (var2 == 91) {
				field1495 = arg0.method531();
			} else if (var2 == 92) {
				field1494 = arg0.method531();
			} else if (var2 == 93) {
				field1487 = false;
			} else if (var2 == 95) {
				field1501 = arg0.method531();
			} else if (var2 == 97) {
				field1496 = arg0.method531();
			} else if (var2 == 98) {
				field1471 = arg0.method531();
			} else if (var2 == 99) {
				field1480 = true;
			} else if (var2 == 100) {
				field1485 = arg0.method530();
			} else if (var2 == 101) {
				field1504 = arg0.method530() * 5;
			} else if (var2 == 102) {
				field1478 = arg0.method531();
			} else if (var2 == 103) {
				field1470 = arg0.method531();
			} else if (var2 == 106) {
				field1506 = arg0.method531();
				if (field1506 == 0xFFFF) {
					field1506 = -1;
				}

				field1490 = arg0.method531();
				if (field1490 == 0xFFFF) {
					field1490 = -1;
				}

				int var9 = arg0.method529();
				field1481 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1481[var10] = arg0.method531();
					if (field1481[var10] == 0xFFFF) {
						field1481[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1502 = false;
			}
		}
	}
}
