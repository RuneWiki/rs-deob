package deob;

@ObfuscatedName("YCVHWRKK")
public final class YCVHWRKK {

	@ObfuscatedName("YCVHWRKK.k")
	public String field1455 = "null";

	@ObfuscatedName("YCVHWRKK.n")
	public int field1457 = -1;

	@ObfuscatedName("YCVHWRKK.j")
	public static RYXFUVWJ field1454 = new RYXFUVWJ(500);

	@ObfuscatedName("YCVHWRKK.B")
	public static XBVYIDUH[] field1471 = new XBVYIDUH[4];

	@ObfuscatedName("YCVHWRKK.L")
	public static RYXFUVWJ field1479 = new RYXFUVWJ(40);

	@ObfuscatedName("YCVHWRKK.o")
	public byte field1458;

	@ObfuscatedName("YCVHWRKK.D")
	public byte field1473;

	@ObfuscatedName("YCVHWRKK.b")
	public int field1446;

	@ObfuscatedName("YCVHWRKK.s")
	public int field1462;

	@ObfuscatedName("YCVHWRKK.t")
	public int field1463;

	@ObfuscatedName("YCVHWRKK.u")
	public static int field1464;

	@ObfuscatedName("YCVHWRKK.v")
	public int field1465;

	@ObfuscatedName("YCVHWRKK.x")
	public int field1467;

	@ObfuscatedName("YCVHWRKK.z")
	public int field1469;

	@ObfuscatedName("YCVHWRKK.A")
	public int field1470;

	@ObfuscatedName("YCVHWRKK.F")
	public int field1475;

	@ObfuscatedName("YCVHWRKK.J")
	public int field1477;

	@ObfuscatedName("YCVHWRKK.K")
	public int field1478;

	@ObfuscatedName("YCVHWRKK.M")
	public static int field1480;

	@ObfuscatedName("YCVHWRKK.O")
	public int field1482;

	@ObfuscatedName("YCVHWRKK.Q")
	public int field1484;

	@ObfuscatedName("YCVHWRKK.R")
	public int field1485;

	@ObfuscatedName("YCVHWRKK.T")
	public int field1487;

	@ObfuscatedName("YCVHWRKK.V")
	public int field1489;

	@ObfuscatedName("YCVHWRKK.W")
	public int field1490;

	@ObfuscatedName("YCVHWRKK.H")
	public static BFQIDHPO field1476;

	@ObfuscatedName("YCVHWRKK.q")
	public static client field1460;

	@ObfuscatedName("YCVHWRKK.e")
	public static boolean field1449;

	@ObfuscatedName("YCVHWRKK.f")
	public boolean field1450;

	@ObfuscatedName("YCVHWRKK.i")
	public boolean field1453;

	@ObfuscatedName("YCVHWRKK.l")
	public boolean field1456;

	@ObfuscatedName("YCVHWRKK.p")
	public boolean field1459;

	@ObfuscatedName("YCVHWRKK.r")
	public boolean field1461;

	@ObfuscatedName("YCVHWRKK.C")
	public boolean field1472;

	@ObfuscatedName("YCVHWRKK.E")
	public boolean field1474;

	@ObfuscatedName("YCVHWRKK.P")
	public boolean field1483;

	@ObfuscatedName("YCVHWRKK.U")
	public boolean field1488;

	@ObfuscatedName("YCVHWRKK.X")
	public boolean field1491;

	@ObfuscatedName("YCVHWRKK.y")
	public byte[] field1468;

	@ObfuscatedName("YCVHWRKK.a")
	public int[] field1445;

	@ObfuscatedName("YCVHWRKK.c")
	public int[] field1447;

	@ObfuscatedName("YCVHWRKK.g")
	public int[] field1451;

	@ObfuscatedName("YCVHWRKK.h")
	public int[] field1452;

	@ObfuscatedName("YCVHWRKK.N")
	public int[] field1481;

	@ObfuscatedName("YCVHWRKK.S")
	public static int[] field1486;

	@ObfuscatedName("YCVHWRKK.d")
	public static YCVHWRKK[] field1448;

	@ObfuscatedName("YCVHWRKK.w")
	public String[] field1466;

	@ObfuscatedName("YCVHWRKK.a(I)LYCVHWRKK;")
	public static final YCVHWRKK method575(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1448[var1].field1457 == arg0) {
				return field1448[var1];
			}
		}

		field1480 = (field1480 + 1) % 20;
		YCVHWRKK var2 = field1448[field1480];
		field1476.field10 = field1486[arg0];
		var2.field1457 = arg0;
		var2.method583();
		var2.method578(field1476);
		return var2;
	}

	@ObfuscatedName("YCVHWRKK.b(I)V")
	public static final void method576() {
		field1454 = null;
		field1479 = null;
		field1486 = null;
		field1448 = null;
		field1476 = null;
	}

	@ObfuscatedName("YCVHWRKK.a(LVSQMPWOM;)V")
	public static final void method577(VSQMPWOM arg0) {
		field1476 = new BFQIDHPO(arg0.method526("loc.dat", null));
		BFQIDHPO var1 = new BFQIDHPO(arg0.method526("loc.idx", null));
		field1464 = var1.method56();
		field1486 = new int[field1464];
		int var2 = 2;
		for (int var3 = 0; var3 < field1464; var3++) {
			field1486[var3] = var2;
			var2 += var1.method56();
		}

		field1448 = new YCVHWRKK[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1448[var4] = new YCVHWRKK();
		}
	}

	@ObfuscatedName("YCVHWRKK.a(BLBFQIDHPO;)V")
	public final void method578(BFQIDHPO arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method54();
					if (var3 == 0) {
						if (var2 == -1) {
							field1456 = false;
							if (field1445 != null && (field1481 == null || field1481[0] == 10)) {
								field1456 = true;
							}

							if (field1466 != null) {
								field1456 = true;
							}
						}

						if (field1472) {
							field1488 = false;
							field1459 = false;
						}

						if (field1489 == -1) {
							field1489 = field1488 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1455 = arg0.method61();
					} else if (var3 == 3) {
						field1468 = arg0.method62();
					} else if (var3 == 5) {
						int var6 = arg0.method54();
						if (var6 > 0) {
							if (field1445 == null || field1449) {
								field1481 = null;
								field1445 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1445[var7] = arg0.method56();
								}
							} else {
								arg0.field10 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1462 = arg0.method54();
					} else if (var3 == 15) {
						field1470 = arg0.method54();
					} else if (var3 == 17) {
						field1488 = false;
					} else if (var3 == 18) {
						field1459 = false;
					} else if (var3 == 19) {
						var2 = arg0.method54();
						if (var2 == 1) {
							field1456 = true;
						}
					} else if (var3 == 21) {
						field1450 = true;
					} else if (var3 == 22) {
						field1483 = true;
					} else if (var3 == 23) {
						field1461 = true;
					} else if (var3 == 24) {
						field1490 = arg0.method56();
						if (field1490 == 0xFFFF) {
							field1490 = -1;
						}
					} else if (var3 == 28) {
						field1477 = arg0.method54();
					} else if (var3 == 29) {
						field1473 = arg0.method55();
					} else if (var3 == 39) {
						field1458 = arg0.method55();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1466 == null) {
							field1466 = new String[5];
						}

						field1466[var3 - 30] = arg0.method61();
						if (field1466[var3 - 30].equalsIgnoreCase("hidden")) {
							field1466[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method54();
						field1452 = new int[var8];
						field1447 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1452[var9] = arg0.method56();
							field1447[var9] = arg0.method56();
						}
					} else if (var3 == 60) {
						field1469 = arg0.method56();
					} else if (var3 == 62) {
						field1491 = true;
					} else if (var3 == 64) {
						field1453 = false;
					} else if (var3 == 65) {
						field1482 = arg0.method56();
					} else if (var3 == 66) {
						field1475 = arg0.method56();
					} else if (var3 == 67) {
						field1487 = arg0.method56();
					} else if (var3 == 68) {
						field1463 = arg0.method56();
					} else if (var3 == 69) {
						field1478 = arg0.method54();
					} else if (var3 == 70) {
						field1485 = arg0.method57();
					} else if (var3 == 71) {
						field1446 = arg0.method57();
					} else if (var3 == 72) {
						field1484 = arg0.method57();
					} else if (var3 == 73) {
						field1474 = true;
					} else if (var3 == 74) {
						field1472 = true;
					} else if (var3 == 75) {
						field1489 = arg0.method54();
					} else if (var3 == 77) {
						field1465 = arg0.method56();
						if (field1465 == 0xFFFF) {
							field1465 = -1;
						}

						field1467 = arg0.method56();
						if (field1467 == 0xFFFF) {
							field1467 = -1;
						}

						int var10 = arg0.method54();
						field1451 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1451[var11] = arg0.method56();
							if (field1451[var11] == 0xFFFF) {
								field1451[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method54();
			} while (var4 <= 0);

			if (field1445 == null || field1449) {
				field1481 = new int[var4];
				field1445 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1445[var5] = arg0.method56();
					field1481[var5] = arg0.method54();
				}
			} else {
				arg0.field10 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("YCVHWRKK.c(I)Z")
	public final boolean method579() {
		if (field1445 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1445.length; var2++) {
			var1 &= XBVYIDUH.method542(field1445[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("YCVHWRKK.a(IIIIIII)LXBVYIDUH;")
	public final XBVYIDUH method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		XBVYIDUH var8 = method582(arg6, arg0, arg1);
		if (var8 == null) {
			return null;
		}

		if (field1450 || field1483) {
			var8 = new XBVYIDUH(field1483, field1450, var8);
		}

		if (field1450) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1353; var10++) {
				int var11 = var8.field1354[var10];
				int var12 = var8.field1356[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1355[var10] += var15 - var9;
			}

			var8.method546();
		}

		return var8;
	}

	@ObfuscatedName("YCVHWRKK.a(LBPHGILGU;Z)V")
	public final void method581(BPHGILGU arg0) {
		if (field1445 != null) {
			for (int var2 = 0; var2 < field1445.length; var2++) {
				arg0.method133(0, field1445[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("YCVHWRKK.a(ZIII)LXBVYIDUH;")
	public final XBVYIDUH method582(int arg0, int arg1, int arg2) {
		XBVYIDUH var4 = null;
		long var5;
		if (field1481 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1457 << 6) + arg2);
			XBVYIDUH var7 = (XBVYIDUH) field1479.method495(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1445 == null) {
				return null;
			}

			boolean var8 = field1491 ^ arg2 > 3;
			int var9 = field1445.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1445[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (XBVYIDUH) field1454.method495(var11);
				if (var4 == null) {
					var4 = XBVYIDUH.method541(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method556();
					}

					field1454.method496(var4, var11);
				}

				if (var9 > 1) {
					field1471[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new XBVYIDUH(field1471, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1481.length; var13++) {
				if (field1481[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1457 << 6) + (var12 << 3) + arg2);
			XBVYIDUH var14 = (XBVYIDUH) field1479.method495(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1445[var12];
			boolean var16 = field1491 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (XBVYIDUH) field1454.method495(var15);
			if (var4 == null) {
				var4 = XBVYIDUH.method541(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method556();
				}

				field1454.method496(var4, var15);
			}
		}

		boolean var17;
		if (field1482 == 128 && field1475 == 128 && field1487 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1485 == 0 && field1446 == 0 && field1484 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		XBVYIDUH var19 = new XBVYIDUH(BKYAWERN.method115(arg0), field1452 == null, arg2 == 0 && arg0 == -1 && !var17 && !var18, var4);
		if (arg0 != -1) {
			var19.method548();
			var19.method549(arg0);
			var19.field1384 = null;
			var19.field1383 = null;
		}

		while (arg2-- > 0) {
			var19.method552();
		}

		if (field1452 != null) {
			for (int var20 = 0; var20 < field1452.length; var20++) {
				var19.method555(field1452[var20], field1447[var20]);
			}
		}

		if (var17) {
			var19.method557(field1475, field1487, field1482);
		}

		if (var18) {
			var19.method554(field1484, field1485, field1446);
		}

		var19.method558(field1473 + 64, field1458 * 5 + 768, -50, -10, -50, !field1483);

		if (field1489 == 1) {
			var19.field1380 = var19.field878;
		}

		field1479.method496(var19, var5);
		return var19;
	}

	@ObfuscatedName("YCVHWRKK.a()V")
	public final void method583() {
		field1445 = null;
		field1481 = null;
		field1455 = "null";
		field1468 = null;
		field1452 = null;
		field1447 = null;
		field1462 = 1;
		field1470 = 1;
		field1488 = true;
		field1459 = true;
		field1456 = false;
		field1450 = false;
		field1483 = false;
		field1461 = false;
		field1490 = -1;
		field1477 = 16;
		field1473 = 0;
		field1458 = 0;
		field1466 = null;
		field1469 = -1;
		field1463 = -1;
		field1491 = false;
		field1453 = true;
		field1482 = 128;
		field1475 = 128;
		field1487 = 128;
		field1478 = 0;
		field1485 = 0;
		field1446 = 0;
		field1484 = 0;
		field1474 = false;
		field1472 = false;
		field1489 = -1;
		field1465 = -1;
		field1467 = -1;
		field1451 = null;
	}

	@ObfuscatedName("YCVHWRKK.a(B)LYCVHWRKK;")
	public final YCVHWRKK method584() {
		int var1 = -1;
		if (field1465 != -1) {
			USQYPEQB var2 = USQYPEQB.field1259[field1465];
			int var3 = var2.field1261;
			int var4 = var2.field1262;
			int var5 = var2.field1263;
			int var6 = client.field226[var5 - var4];
			var1 = field1460.field493[var3] >> var4 & var6;
		} else if (field1467 != -1) {
			var1 = field1460.field493[field1467];
		}

		if (var1 >= 0 && var1 < field1451.length && field1451[var1] != -1) {
			return method575(field1451[var1]);
		}

		return null;
	}

	@ObfuscatedName("YCVHWRKK.a(II)Z")
	public final boolean method585(int arg0) {
		if (field1481 != null) {
			for (int var4 = 0; var4 < field1481.length; var4++) {
				if (field1481[var4] == arg0) {
					return XBVYIDUH.method542(field1445[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1445 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1445.length; var3++) {
				var2 &= XBVYIDUH.method542(field1445[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}
}
