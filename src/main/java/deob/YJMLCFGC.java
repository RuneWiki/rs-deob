package deob;

@ObfuscatedName("YJMLCFGC")
public final class YJMLCFGC {

	@ObfuscatedName("YJMLCFGC.F")
	public String field1476 = "null";

	@ObfuscatedName("YJMLCFGC.U")
	public int field1491 = -1;

	@ObfuscatedName("YJMLCFGC.l")
	public static HARAZQMH field1458 = new HARAZQMH(500);

	@ObfuscatedName("YJMLCFGC.r")
	public static HARAZQMH field1463 = new HARAZQMH(40);

	@ObfuscatedName("YJMLCFGC.K")
	public static GCSAWSJV[] field1481 = new GCSAWSJV[4];

	@ObfuscatedName("YJMLCFGC.p")
	public byte field1461;

	@ObfuscatedName("YJMLCFGC.A")
	public byte field1472;

	@ObfuscatedName("YJMLCFGC.a")
	public int field1449;

	@ObfuscatedName("YJMLCFGC.d")
	public int field1451;

	@ObfuscatedName("YJMLCFGC.f")
	public int field1453;

	@ObfuscatedName("YJMLCFGC.j")
	public int field1456;

	@ObfuscatedName("YJMLCFGC.n")
	public int field1460;

	@ObfuscatedName("YJMLCFGC.t")
	public static int field1465;

	@ObfuscatedName("YJMLCFGC.u")
	public int field1466;

	@ObfuscatedName("YJMLCFGC.v")
	public int field1467;

	@ObfuscatedName("YJMLCFGC.x")
	public int field1469;

	@ObfuscatedName("YJMLCFGC.y")
	public int field1470;

	@ObfuscatedName("YJMLCFGC.G")
	public static int field1477;

	@ObfuscatedName("YJMLCFGC.I")
	public int field1479;

	@ObfuscatedName("YJMLCFGC.L")
	public int field1482;

	@ObfuscatedName("YJMLCFGC.M")
	public int field1483;

	@ObfuscatedName("YJMLCFGC.S")
	public int field1489;

	@ObfuscatedName("YJMLCFGC.T")
	public int field1490;

	@ObfuscatedName("YJMLCFGC.V")
	public int field1492;

	@ObfuscatedName("YJMLCFGC.W")
	public int field1493;

	@ObfuscatedName("YJMLCFGC.e")
	public static CMGGUSPR field1452;

	@ObfuscatedName("YJMLCFGC.s")
	public static client field1464;

	@ObfuscatedName("YJMLCFGC.c")
	public boolean field1450;

	@ObfuscatedName("YJMLCFGC.i")
	public static boolean field1455;

	@ObfuscatedName("YJMLCFGC.m")
	public boolean field1459;

	@ObfuscatedName("YJMLCFGC.z")
	public boolean field1471;

	@ObfuscatedName("YJMLCFGC.B")
	public boolean field1473;

	@ObfuscatedName("YJMLCFGC.C")
	public boolean field1474;

	@ObfuscatedName("YJMLCFGC.D")
	public boolean field1475;

	@ObfuscatedName("YJMLCFGC.P")
	public boolean field1486;

	@ObfuscatedName("YJMLCFGC.Q")
	public boolean field1487;

	@ObfuscatedName("YJMLCFGC.X")
	public boolean field1494;

	@ObfuscatedName("YJMLCFGC.Z")
	public boolean field1495;

	@ObfuscatedName("YJMLCFGC.h")
	public byte[] field1454;

	@ObfuscatedName("YJMLCFGC.k")
	public int[] field1457;

	@ObfuscatedName("YJMLCFGC.w")
	public int[] field1468;

	@ObfuscatedName("YJMLCFGC.H")
	public int[] field1478;

	@ObfuscatedName("YJMLCFGC.N")
	public static int[] field1484;

	@ObfuscatedName("YJMLCFGC.O")
	public int[] field1485;

	@ObfuscatedName("YJMLCFGC.R")
	public int[] field1488;

	@ObfuscatedName("YJMLCFGC.q")
	public static YJMLCFGC[] field1462;

	@ObfuscatedName("YJMLCFGC.J")
	public String[] field1480;

	@ObfuscatedName("YJMLCFGC.a(IZ)Z")
	public final boolean method586(int arg0) {
		if (field1485 != null) {
			for (int var4 = 0; var4 < field1485.length; var4++) {
				if (field1485[var4] == arg0) {
					return GCSAWSJV.method261(field1488[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1488 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1488.length; var3++) {
				var2 &= GCSAWSJV.method261(field1488[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("YJMLCFGC.a(IIIIIII)LGCSAWSJV;")
	public final GCSAWSJV method587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		GCSAWSJV var8 = method592(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1471 || field1486) {
			var8 = new GCSAWSJV(field1486, var8, field1471);
		}

		if (field1471) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field593; var10++) {
				int var11 = var8.field594[var10];
				int var12 = var8.field596[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field595[var10] += var15 - var9;
			}

			var8.method265();
		}

		return var8;
	}

	@ObfuscatedName("YJMLCFGC.a()V")
	public final void method588() {
		field1488 = null;
		field1485 = null;
		field1476 = "null";
		field1454 = null;
		field1457 = null;
		field1468 = null;
		field1469 = 1;
		field1479 = 1;
		field1459 = true;
		field1450 = true;
		field1475 = false;
		field1471 = false;
		field1486 = false;
		field1494 = false;
		field1453 = -1;
		field1490 = 16;
		field1461 = 0;
		field1472 = 0;
		field1480 = null;
		field1493 = -1;
		field1483 = -1;
		field1487 = false;
		field1474 = true;
		field1492 = 128;
		field1456 = 128;
		field1467 = 128;
		field1451 = 0;
		field1482 = 0;
		field1466 = 0;
		field1489 = 0;
		field1495 = false;
		field1473 = false;
		field1460 = -1;
		field1449 = -1;
		field1470 = -1;
		field1478 = null;
	}

	@ObfuscatedName("YJMLCFGC.a(ILUCDUMMGN;)V")
	public final void method589(UCDUMMGN arg0) {
		if (field1488 != null) {
			for (int var2 = 0; var2 < field1488.length; var2++) {
				arg0.method541(field1488[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("YJMLCFGC.a(Z)Z")
	public final boolean method590() {
		if (field1488 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1488.length; var2++) {
			var1 &= GCSAWSJV.method261(field1488[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("YJMLCFGC.a(I)V")
	public static final void method591() {
		field1458 = null;
		field1463 = null;
		field1484 = null;
		field1462 = null;
		field1452 = null;
	}

	@ObfuscatedName("YJMLCFGC.a(IIII)LGCSAWSJV;")
	public final GCSAWSJV method592(int arg0, int arg1, int arg2) {
		GCSAWSJV var4 = null;
		long var5;
		if (field1485 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1491 << 6) + arg0);
			GCSAWSJV var7 = (GCSAWSJV) field1463.method299(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1488 == null) {
				return null;
			}

			boolean var8 = field1487 ^ arg0 > 3;
			int var9 = field1488.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1488[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (GCSAWSJV) field1458.method299(var11);
				if (var4 == null) {
					var4 = GCSAWSJV.method260(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method275();
					}

					field1458.method300(var11, var4);
				}

				if (var9 > 1) {
					field1481[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new GCSAWSJV(field1481, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1485.length; var13++) {
				if (field1485[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1491 << 6) + (var12 << 3) + arg0);
			GCSAWSJV var14 = (GCSAWSJV) field1463.method299(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1488[var12];
			boolean var16 = field1487 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (GCSAWSJV) field1458.method299(var15);
			if (var4 == null) {
				var4 = GCSAWSJV.method260(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method275();
				}

				field1458.method300(var15, var4);
			}
		}

		boolean var17;
		if (field1492 == 128 && field1456 == 128 && field1467 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1482 == 0 && field1466 == 0 && field1489 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		GCSAWSJV var19 = new GCSAWSJV(var4, field1457 == null, RLONYBCF.method436(arg1), arg0 == 0 && arg1 == -1 && !var17 && !var18);
		if (arg1 != -1) {
			var19.method267();
			var19.method268(arg1);
			var19.field624 = null;
			var19.field623 = null;
		}

		while (arg0-- > 0) {
			var19.method271();
		}

		if (field1457 != null) {
			for (int var20 = 0; var20 < field1457.length; var20++) {
				var19.method274(field1457[var20], field1468[var20]);
			}
		}

		if (var17) {
			var19.method276(field1492, field1467, field1456);
		}

		if (var18) {
			var19.method273(field1466, field1482, field1489);
		}

		var19.method277(field1461 + 64, field1472 * 5 + 768, -50, -10, -50, !field1486);

		if (field1460 == 1) {
			var19.field620 = var19.field7;
		}

		field1463.method300(var5, var19);
		return var19;
	}

	@ObfuscatedName("YJMLCFGC.a(LUUIGNTAD;)V")
	public static final void method593(UUIGNTAD arg0) {
		field1452 = new CMGGUSPR(arg0.method545("loc.dat", null));
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("loc.idx", null));
		field1477 = var1.method196();
		field1484 = new int[field1477];
		int var2 = 2;
		for (int var3 = 0; var3 < field1477; var3++) {
			field1484[var3] = var2;
			var2 += var1.method196();
		}

		field1462 = new YJMLCFGC[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1462[var4] = new YJMLCFGC();
		}
	}

	@ObfuscatedName("YJMLCFGC.b(I)LYJMLCFGC;")
	public final YJMLCFGC method594() {
		int var1 = -1;
		if (field1449 != -1) {
			RLLHHJLC var2 = RLLHHJLC.field1048[field1449];
			int var3 = var2.field1050;
			int var4 = var2.field1051;
			int var5 = var2.field1052;
			int var6 = client.field346[var5 - var4];
			var1 = field1464.field226[var3] >> var4 & var6;
		} else if (field1470 != -1) {
			var1 = field1464.field226[field1470];
		}

		if (var1 >= 0 && var1 < field1478.length && field1478[var1] != -1) {
			return method596(field1478[var1]);
		}

		return null;
	}

	@ObfuscatedName("YJMLCFGC.a(LCMGGUSPR;I)V")
	public final void method595(CMGGUSPR arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method194();
					if (var3 == 0) {
						if (var2 == -1) {
							field1475 = false;
							if (field1488 != null && (field1485 == null || field1485[0] == 10)) {
								field1475 = true;
							}

							if (field1480 != null) {
								field1475 = true;
							}
						}

						if (field1473) {
							field1459 = false;
							field1450 = false;
						}

						if (field1460 == -1) {
							field1460 = field1459 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1476 = arg0.method201();
					} else if (var3 == 3) {
						field1454 = arg0.method202();
					} else if (var3 == 5) {
						int var6 = arg0.method194();
						if (var6 > 0) {
							if (field1488 == null || field1455) {
								field1485 = null;
								field1488 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1488[var7] = arg0.method196();
								}
							} else {
								arg0.field540 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1469 = arg0.method194();
					} else if (var3 == 15) {
						field1479 = arg0.method194();
					} else if (var3 == 17) {
						field1459 = false;
					} else if (var3 == 18) {
						field1450 = false;
					} else if (var3 == 19) {
						var2 = arg0.method194();
						if (var2 == 1) {
							field1475 = true;
						}
					} else if (var3 == 21) {
						field1471 = true;
					} else if (var3 == 22) {
						field1486 = true;
					} else if (var3 == 23) {
						field1494 = true;
					} else if (var3 == 24) {
						field1453 = arg0.method196();
						if (field1453 == 0xFFFF) {
							field1453 = -1;
						}
					} else if (var3 == 28) {
						field1490 = arg0.method194();
					} else if (var3 == 29) {
						field1461 = arg0.method195();
					} else if (var3 == 39) {
						field1472 = arg0.method195();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1480 == null) {
							field1480 = new String[5];
						}

						field1480[var3 - 30] = arg0.method201();
						if (field1480[var3 - 30].equalsIgnoreCase("hidden")) {
							field1480[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method194();
						field1457 = new int[var8];
						field1468 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1457[var9] = arg0.method196();
							field1468[var9] = arg0.method196();
						}
					} else if (var3 == 60) {
						field1493 = arg0.method196();
					} else if (var3 == 62) {
						field1487 = true;
					} else if (var3 == 64) {
						field1474 = false;
					} else if (var3 == 65) {
						field1492 = arg0.method196();
					} else if (var3 == 66) {
						field1456 = arg0.method196();
					} else if (var3 == 67) {
						field1467 = arg0.method196();
					} else if (var3 == 68) {
						field1483 = arg0.method196();
					} else if (var3 == 69) {
						field1451 = arg0.method194();
					} else if (var3 == 70) {
						field1482 = arg0.method197();
					} else if (var3 == 71) {
						field1466 = arg0.method197();
					} else if (var3 == 72) {
						field1489 = arg0.method197();
					} else if (var3 == 73) {
						field1495 = true;
					} else if (var3 == 74) {
						field1473 = true;
					} else if (var3 == 75) {
						field1460 = arg0.method194();
					} else if (var3 == 77) {
						field1449 = arg0.method196();
						if (field1449 == 0xFFFF) {
							field1449 = -1;
						}

						field1470 = arg0.method196();
						if (field1470 == 0xFFFF) {
							field1470 = -1;
						}

						int var10 = arg0.method194();
						field1478 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1478[var11] = arg0.method196();
							if (field1478[var11] == 0xFFFF) {
								field1478[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method194();
			} while (var4 <= 0);

			if (field1488 == null || field1455) {
				field1485 = new int[var4];
				field1488 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1488[var5] = arg0.method196();
					field1485[var5] = arg0.method194();
				}
			} else {
				arg0.field540 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("YJMLCFGC.c(I)LYJMLCFGC;")
	public static final YJMLCFGC method596(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1462[var1].field1491 == arg0) {
				return field1462[var1];
			}
		}

		field1465 = (field1465 + 1) % 20;
		YJMLCFGC var2 = field1462[field1465];
		field1452.field540 = field1484[arg0];
		var2.field1491 = arg0;
		var2.method588();
		var2.method595(field1452);
		return var2;
	}
}
