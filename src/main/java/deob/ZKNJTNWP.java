package deob;

@ObfuscatedName("ZKNJTNWP")
public final class ZKNJTNWP {

	@ObfuscatedName("ZKNJTNWP.s")
	public int field1485 = -1;

	@ObfuscatedName("ZKNJTNWP.g")
	public static boolean field1474 = true;

	@ObfuscatedName("ZKNJTNWP.G")
	public static VNWSQIXW field1498 = new VNWSQIXW(50);

	@ObfuscatedName("ZKNJTNWP.W")
	public static VNWSQIXW field1514 = new VNWSQIXW(100);

	@ObfuscatedName("ZKNJTNWP.K")
	public byte field1502;

	@ObfuscatedName("ZKNJTNWP.M")
	public byte field1504;

	@ObfuscatedName("ZKNJTNWP.a")
	public int field1468;

	@ObfuscatedName("ZKNJTNWP.b")
	public int field1469;

	@ObfuscatedName("ZKNJTNWP.c")
	public int field1470;

	@ObfuscatedName("ZKNJTNWP.d")
	public int field1471;

	@ObfuscatedName("ZKNJTNWP.e")
	public int field1472;

	@ObfuscatedName("ZKNJTNWP.f")
	public int field1473;

	@ObfuscatedName("ZKNJTNWP.h")
	public static int field1475;

	@ObfuscatedName("ZKNJTNWP.i")
	public int field1476;

	@ObfuscatedName("ZKNJTNWP.k")
	public int field1478;

	@ObfuscatedName("ZKNJTNWP.l")
	public int field1479;

	@ObfuscatedName("ZKNJTNWP.q")
	public int field1483;

	@ObfuscatedName("ZKNJTNWP.r")
	public int field1484;

	@ObfuscatedName("ZKNJTNWP.t")
	public int field1486;

	@ObfuscatedName("ZKNJTNWP.w")
	public int field1489;

	@ObfuscatedName("ZKNJTNWP.x")
	public int field1490;

	@ObfuscatedName("ZKNJTNWP.y")
	public int field1491;

	@ObfuscatedName("ZKNJTNWP.z")
	public static int field1492;

	@ObfuscatedName("ZKNJTNWP.C")
	public int field1494;

	@ObfuscatedName("ZKNJTNWP.D")
	public int field1495;

	@ObfuscatedName("ZKNJTNWP.E")
	public int field1496;

	@ObfuscatedName("ZKNJTNWP.F")
	public int field1497;

	@ObfuscatedName("ZKNJTNWP.H")
	public int field1499;

	@ObfuscatedName("ZKNJTNWP.I")
	public int field1500;

	@ObfuscatedName("ZKNJTNWP.J")
	public int field1501;

	@ObfuscatedName("ZKNJTNWP.P")
	public int field1507;

	@ObfuscatedName("ZKNJTNWP.R")
	public int field1509;

	@ObfuscatedName("ZKNJTNWP.S")
	public int field1510;

	@ObfuscatedName("ZKNJTNWP.U")
	public int field1512;

	@ObfuscatedName("ZKNJTNWP.X")
	public int field1515;

	@ObfuscatedName("ZKNJTNWP.v")
	public static GHHPHSRU field1488;

	@ObfuscatedName("ZKNJTNWP.p")
	public String field1482;

	@ObfuscatedName("ZKNJTNWP.Q")
	public boolean field1508;

	@ObfuscatedName("ZKNJTNWP.T")
	public boolean field1511;

	@ObfuscatedName("ZKNJTNWP.u")
	public byte[] field1487;

	@ObfuscatedName("ZKNJTNWP.j")
	public int[] field1477;

	@ObfuscatedName("ZKNJTNWP.m")
	public int[] field1480;

	@ObfuscatedName("ZKNJTNWP.o")
	public static int[] field1481;

	@ObfuscatedName("ZKNJTNWP.L")
	public int[] field1503;

	@ObfuscatedName("ZKNJTNWP.V")
	public int[] field1513;

	@ObfuscatedName("ZKNJTNWP.O")
	public static ZKNJTNWP[] field1506;

	@ObfuscatedName("ZKNJTNWP.B")
	public String[] field1493;

	@ObfuscatedName("ZKNJTNWP.N")
	public String[] field1505;

	@ObfuscatedName("ZKNJTNWP.a(II)LOQIGXOFQ;")
	public final OQIGXOFQ method589(int arg0) {
		int var2 = field1483;
		int var3 = field1512;
		int var4 = field1476;
		if (arg0 == 1) {
			var2 = field1491;
			var3 = field1515;
			var4 = field1497;
		}

		if (var2 == -1) {
			return null;
		}

		OQIGXOFQ var5 = OQIGXOFQ.method391(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				OQIGXOFQ var9 = OQIGXOFQ.method391(var3);
				OQIGXOFQ[] var10 = new OQIGXOFQ[] { var5, var9 };
				var5 = new OQIGXOFQ(2, var10);
			} else {
				OQIGXOFQ var6 = OQIGXOFQ.method391(var3);
				OQIGXOFQ var7 = OQIGXOFQ.method391(var4);
				OQIGXOFQ[] var8 = new OQIGXOFQ[] { var5, var6, var7 };
				var5 = new OQIGXOFQ(3, var8);
			}
		}

		if (arg0 == 0 && field1504 != 0) {
			var5.method404(0, field1504, 0);
		}

		if (arg0 == 1 && field1502 != 0) {
			var5.method404(0, field1502, 0);
		}

		if (field1480 != null) {
			for (int var11 = 0; var11 < field1480.length; var11++) {
				var5.method405(field1480[var11], field1477[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("ZKNJTNWP.a(I)LZKNJTNWP;")
	public static final ZKNJTNWP method590(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1506[var1].field1485 == arg0) {
				return field1506[var1];
			}
		}

		field1492 = (field1492 + 1) % 10;
		ZKNJTNWP var2 = field1506[field1492];
		field1488.field667 = field1481[arg0];
		var2.field1485 = arg0;
		var2.method595();
		var2.method593(field1488);

		if (var2.field1479 != -1) {
			var2.method596();
		}

		if (!field1474 && var2.field1511) {
			var2.field1482 = "Members Object";
			var2.field1487 = "Login to a members' server to use this object.".getBytes();
			var2.field1505 = null;
			var2.field1493 = null;
			var2.field1496 = 0;
		}

		return var2;
	}

	@ObfuscatedName("ZKNJTNWP.b(I)V")
	public static final void method591() {
		field1498 = null;
		field1514 = null;
		field1481 = null;
		field1506 = null;
		field1488 = null;
	}

	@ObfuscatedName("ZKNJTNWP.a(IIBI)LNUXITFPR;")
	public static final NUXITFPR method592(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			NUXITFPR var3 = (NUXITFPR) field1514.method507(arg2);
			if (var3 != null && var3.field1001 != arg1 && var3.field1001 != -1) {
				var3.method19();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		ZKNJTNWP var4 = method590(arg2);
		if (var4.field1503 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field1513[var6] && var4.field1513[var6] != 0) {
					var5 = var4.field1503[var6];
				}
			}

			if (var5 != -1) {
				var4 = method590(var5);
			}
		}

		OQIGXOFQ var7 = var4.method597(1);
		if (var7 == null) {
			return null;
		}

		NUXITFPR var8 = null;
		if (var4.field1479 != -1) {
			var8 = method592(-1, 10, var4.field1473);
			if (var8 == null) {
				return null;
			}
		}

		NUXITFPR var9 = new NUXITFPR(32, 32);
		int var10 = QAMTFDSD.field1146;
		int var11 = QAMTFDSD.field1147;
		int[] var12 = QAMTFDSD.field1152;
		int[] var13 = JNJDBENA.field809;
		int var14 = JNJDBENA.field810;
		int var15 = JNJDBENA.field811;
		int var16 = JNJDBENA.field814;
		int var17 = JNJDBENA.field815;
		int var18 = JNJDBENA.field812;
		int var19 = JNJDBENA.field813;
		QAMTFDSD.field1144 = false;
		JNJDBENA.method283(32, 32, var9.field995);
		JNJDBENA.method288(0, 0, 32, 0, 32);
		QAMTFDSD.method448();
		int var20 = var4.field1486;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = QAMTFDSD.field1150[var4.field1490] * var20 >> 16;
		int var22 = QAMTFDSD.field1151[var4.field1490] * var20 >> 16;
		var7.method411(0, var4.field1478, var4.field1510, var4.field1490, var4.field1469, var7.field1467 / 2 + var21 + var4.field1495, var4.field1495 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field995[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field995[var24 * 32 + var23 - 1] > 1) {
						var9.field995[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field995[(var24 - 1) * 32 + var23] > 1) {
						var9.field995[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field995[var24 * 32 + var23 + 1] > 1) {
						var9.field995[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field995[(var24 + 1) * 32 + var23] > 1) {
						var9.field995[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field995[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field995[var26 * 32 + var25 - 1] == 1) {
							var9.field995[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field995[(var26 - 1) * 32 + var25] == 1) {
							var9.field995[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field995[var26 * 32 + var25 + 1] == 1) {
							var9.field995[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field995[(var26 + 1) * 32 + var25] == 1) {
							var9.field995[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field995[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field995[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field995[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1479 != -1) {
			int var29 = var8.field1000;
			int var30 = var8.field1001;
			var8.field1000 = 32;
			var8.field1001 = 32;
			var8.method376(0, 0);
			var8.field1000 = var29;
			var8.field1001 = var30;
		}

		if (arg0 == 0) {
			field1514.method508(arg2, var9);
		}

		JNJDBENA.method283(var14, var15, var13);
		JNJDBENA.method285(var16, var18, var19, var17);
		QAMTFDSD.field1146 = var10;
		QAMTFDSD.field1147 = var11;
		QAMTFDSD.field1152 = var12;
		QAMTFDSD.field1144 = true;

		if (var4.field1508) {
			var9.field1000 = 33;
		} else {
			var9.field1000 = 32;
		}

		var9.field1001 = arg1;
		return var9;
	}

	@ObfuscatedName("ZKNJTNWP.a(LGHHPHSRU;I)V")
	public final void method593(GHHPHSRU arg0) {
		while (true) {
			int var2 = arg0.method202();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1509 = arg0.method204();
			} else if (var2 == 2) {
				field1482 = arg0.method209();
			} else if (var2 == 3) {
				field1487 = arg0.method210();
			} else if (var2 == 4) {
				field1486 = arg0.method204();
			} else if (var2 == 5) {
				field1490 = arg0.method204();
			} else if (var2 == 6) {
				field1478 = arg0.method204();
			} else if (var2 == 7) {
				field1469 = arg0.method204();
				if (field1469 > 32767) {
					field1469 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1495 = arg0.method204();
				if (field1495 > 32767) {
					field1495 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1468 = arg0.method204();
			} else if (var2 == 11) {
				field1508 = true;
			} else if (var2 == 12) {
				field1494 = arg0.method207();
			} else if (var2 == 16) {
				field1511 = true;
			} else if (var2 == 23) {
				field1483 = arg0.method204();
				field1504 = arg0.method203();
			} else if (var2 == 24) {
				field1512 = arg0.method204();
			} else if (var2 == 25) {
				field1491 = arg0.method204();
				field1502 = arg0.method203();
			} else if (var2 == 26) {
				field1515 = arg0.method204();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1505 == null) {
					field1505 = new String[5];
				}

				field1505[var2 - 30] = arg0.method209();
				if (field1505[var2 - 30].equalsIgnoreCase("hidden")) {
					field1505[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1493 == null) {
					field1493 = new String[5];
				}

				field1493[var2 - 35] = arg0.method209();
			} else if (var2 == 40) {
				int var3 = arg0.method202();
				field1480 = new int[var3];
				field1477 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1480[var4] = arg0.method204();
					field1477[var4] = arg0.method204();
				}
			} else if (var2 == 78) {
				field1476 = arg0.method204();
			} else if (var2 == 79) {
				field1497 = arg0.method204();
			} else if (var2 == 90) {
				field1501 = arg0.method204();
			} else if (var2 == 91) {
				field1471 = arg0.method204();
			} else if (var2 == 92) {
				field1489 = arg0.method204();
			} else if (var2 == 93) {
				field1484 = arg0.method204();
			} else if (var2 == 95) {
				field1510 = arg0.method204();
			} else if (var2 == 97) {
				field1473 = arg0.method204();
			} else if (var2 == 98) {
				field1479 = arg0.method204();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1503 == null) {
					field1503 = new int[10];
					field1513 = new int[10];
				}

				field1503[var2 - 100] = arg0.method204();
				field1513[var2 - 100] = arg0.method204();
			} else if (var2 == 110) {
				field1472 = arg0.method204();
			} else if (var2 == 111) {
				field1499 = arg0.method204();
			} else if (var2 == 112) {
				field1470 = arg0.method204();
			} else if (var2 == 113) {
				field1507 = arg0.method203();
			} else if (var2 == 114) {
				field1500 = arg0.method203() * 5;
			} else if (var2 == 115) {
				field1496 = arg0.method202();
			}
		}
	}

	@ObfuscatedName("ZKNJTNWP.b(II)Z")
	public final boolean method594(int arg0) {
		int var2 = field1501;
		int var3 = field1489;
		if (arg0 == 1) {
			var2 = field1471;
			var3 = field1484;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!OQIGXOFQ.method392(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !OQIGXOFQ.method392(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("ZKNJTNWP.a()V")
	public final void method595() {
		field1509 = 0;
		field1482 = null;
		field1487 = null;
		field1480 = null;
		field1477 = null;
		field1486 = 2000;
		field1490 = 0;
		field1478 = 0;
		field1510 = 0;
		field1469 = 0;
		field1495 = 0;
		field1468 = -1;
		field1508 = false;
		field1494 = 1;
		field1511 = false;
		field1505 = null;
		field1493 = null;
		field1483 = -1;
		field1512 = -1;
		field1504 = 0;
		field1491 = -1;
		field1515 = -1;
		field1502 = 0;
		field1476 = -1;
		field1497 = -1;
		field1501 = -1;
		field1489 = -1;
		field1471 = -1;
		field1484 = -1;
		field1503 = null;
		field1513 = null;
		field1473 = -1;
		field1479 = -1;
		field1472 = 128;
		field1499 = 128;
		field1470 = 128;
		field1507 = 0;
		field1500 = 0;
		field1496 = 0;
	}

	@ObfuscatedName("ZKNJTNWP.c(I)V")
	public void method596() {
		ZKNJTNWP var1 = method590(field1479);
		field1509 = var1.field1509;
		field1486 = var1.field1486;
		field1490 = var1.field1490;
		field1478 = var1.field1478;
		field1510 = var1.field1510;
		field1469 = var1.field1469;
		field1495 = var1.field1495;
		field1480 = var1.field1480;
		field1477 = var1.field1477;
		ZKNJTNWP var2 = method590(field1473);
		field1482 = var2.field1482;
		field1511 = var2.field1511;
		field1494 = var2.field1494;
		String var3 = "a";
		char var4 = var2.field1482.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1487 = ("Swap this note at any bank for " + var3 + " " + var2.field1482 + ".").getBytes();
		field1508 = true;
	}

	@ObfuscatedName("ZKNJTNWP.d(I)LOQIGXOFQ;")
	public final OQIGXOFQ method597(int arg0) {
		if (field1503 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1513[var3] && field1513[var3] != 0) {
					var2 = field1503[var3];
				}
			}

			if (var2 != -1) {
				return method590(var2).method597(1);
			}
		}

		OQIGXOFQ var4 = (OQIGXOFQ) field1498.method507(field1485);
		if (var4 != null) {
			return var4;
		}

		OQIGXOFQ var5 = OQIGXOFQ.method391(field1509);
		if (var5 == null) {
			return null;
		}

		if (field1472 != 128 || field1499 != 128 || field1470 != 128) {
			var5.method407(field1499, field1470, field1472);
		}

		if (field1480 != null) {
			for (int var6 = 0; var6 < field1480.length; var6++) {
				var5.method405(field1480[var6], field1477[var6]);
			}
		}

		var5.method408(field1507 + 64, field1500 + 768, -50, -10, -50, true);
		var5.field1067 = true;
		field1498.method508(field1485, var5);
		return var5;
	}

	@ObfuscatedName("ZKNJTNWP.c(II)LOQIGXOFQ;")
	public final OQIGXOFQ method598(int arg0) {
		int var2 = field1501;
		int var3 = field1489;
		if (arg0 == 1) {
			var2 = field1471;
			var3 = field1484;
		}

		if (var2 == -1) {
			return null;
		}

		OQIGXOFQ var4 = OQIGXOFQ.method391(var2);
		if (var3 != -1) {
			OQIGXOFQ var5 = OQIGXOFQ.method391(var3);
			OQIGXOFQ[] var6 = new OQIGXOFQ[] { var4, var5 };
			var4 = new OQIGXOFQ(2, var6);
		}

		if (field1480 != null) {
			for (int var7 = 0; var7 < field1480.length; var7++) {
				var4.method405(field1480[var7], field1477[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("ZKNJTNWP.a(IB)Z")
	public final boolean method599(int arg0) {
		int var2 = field1483;
		int var3 = field1512;
		int var4 = field1476;
		if (arg0 == 1) {
			var2 = field1491;
			var3 = field1515;
			var4 = field1497;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!OQIGXOFQ.method392(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !OQIGXOFQ.method392(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !OQIGXOFQ.method392(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("ZKNJTNWP.a(LDTIATKJO;)V")
	public static final void method600(DTIATKJO arg0) {
		field1488 = new GHHPHSRU(arg0.method168("obj.dat", null));
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("obj.idx", null));
		field1475 = var1.method204();
		field1481 = new int[field1475];
		int var2 = 2;
		for (int var3 = 0; var3 < field1475; var3++) {
			field1481[var3] = var2;
			var2 += var1.method204();
		}

		field1506 = new ZKNJTNWP[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1506[var4] = new ZKNJTNWP();
		}
	}

	@ObfuscatedName("ZKNJTNWP.a(BI)LOQIGXOFQ;")
	public final OQIGXOFQ method601(int arg0) {
		if (field1503 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1513[var3] && field1513[var3] != 0) {
					var2 = field1503[var3];
				}
			}

			if (var2 != -1) {
				return method590(var2).method601(1);
			}
		}

		OQIGXOFQ var4 = OQIGXOFQ.method391(field1509);
		if (var4 == null) {
			return null;
		}

		if (field1480 != null) {
			for (int var5 = 0; var5 < field1480.length; var5++) {
				var4.method405(field1480[var5], field1477[var5]);
			}
		}

		return var4;
	}
}
