package deob;

@ObfuscatedName("WMJBOJYO")
public final class WMJBOJYO {

	@ObfuscatedName("WMJBOJYO.U")
	public int field1428 = -1;

	@ObfuscatedName("WMJBOJYO.h")
	public static boolean field1391 = true;

	@ObfuscatedName("WMJBOJYO.n")
	public static AKUDQPZE field1397 = new AKUDQPZE(100);

	@ObfuscatedName("WMJBOJYO.s")
	public static AKUDQPZE field1402 = new AKUDQPZE(50);

	@ObfuscatedName("WMJBOJYO.c")
	public byte field1386;

	@ObfuscatedName("WMJBOJYO.d")
	public byte field1387;

	@ObfuscatedName("WMJBOJYO.a")
	public int field1385;

	@ObfuscatedName("WMJBOJYO.e")
	public int field1388;

	@ObfuscatedName("WMJBOJYO.f")
	public int field1389;

	@ObfuscatedName("WMJBOJYO.g")
	public int field1390;

	@ObfuscatedName("WMJBOJYO.j")
	public int field1393;

	@ObfuscatedName("WMJBOJYO.k")
	public int field1394;

	@ObfuscatedName("WMJBOJYO.l")
	public int field1395;

	@ObfuscatedName("WMJBOJYO.m")
	public static int field1396;

	@ObfuscatedName("WMJBOJYO.t")
	public int field1403;

	@ObfuscatedName("WMJBOJYO.w")
	public int field1406;

	@ObfuscatedName("WMJBOJYO.x")
	public int field1407;

	@ObfuscatedName("WMJBOJYO.A")
	public int field1409;

	@ObfuscatedName("WMJBOJYO.B")
	public int field1410;

	@ObfuscatedName("WMJBOJYO.C")
	public int field1411;

	@ObfuscatedName("WMJBOJYO.D")
	public int field1412;

	@ObfuscatedName("WMJBOJYO.E")
	public int field1413;

	@ObfuscatedName("WMJBOJYO.F")
	public int field1414;

	@ObfuscatedName("WMJBOJYO.G")
	public int field1415;

	@ObfuscatedName("WMJBOJYO.H")
	public int field1416;

	@ObfuscatedName("WMJBOJYO.I")
	public int field1417;

	@ObfuscatedName("WMJBOJYO.J")
	public static int field1418;

	@ObfuscatedName("WMJBOJYO.M")
	public int field1421;

	@ObfuscatedName("WMJBOJYO.O")
	public int field1422;

	@ObfuscatedName("WMJBOJYO.P")
	public int field1423;

	@ObfuscatedName("WMJBOJYO.S")
	public int field1426;

	@ObfuscatedName("WMJBOJYO.T")
	public int field1427;

	@ObfuscatedName("WMJBOJYO.W")
	public int field1430;

	@ObfuscatedName("WMJBOJYO.X")
	public int field1431;

	@ObfuscatedName("WMJBOJYO.Z")
	public int field1432;

	@ObfuscatedName("WMJBOJYO.Q")
	public static EGCCHUZS field1424;

	@ObfuscatedName("WMJBOJYO.K")
	public String field1419;

	@ObfuscatedName("WMJBOJYO.o")
	public boolean field1398;

	@ObfuscatedName("WMJBOJYO.q")
	public boolean field1400;

	@ObfuscatedName("WMJBOJYO.V")
	public byte[] field1429;

	@ObfuscatedName("WMJBOJYO.i")
	public int[] field1392;

	@ObfuscatedName("WMJBOJYO.r")
	public static int[] field1401;

	@ObfuscatedName("WMJBOJYO.u")
	public int[] field1404;

	@ObfuscatedName("WMJBOJYO.z")
	public int[] field1408;

	@ObfuscatedName("WMJBOJYO.L")
	public int[] field1420;

	@ObfuscatedName("WMJBOJYO.v")
	public static WMJBOJYO[] field1405;

	@ObfuscatedName("WMJBOJYO.p")
	public String[] field1399;

	@ObfuscatedName("WMJBOJYO.R")
	public String[] field1425;

	@ObfuscatedName("WMJBOJYO.a(I)LIGXVZOHI;")
	public final IGXVZOHI method557(int arg0) {
		if (field1404 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1420[var3] && field1420[var3] != 0) {
					var2 = field1404[var3];
				}
			}

			if (var2 != -1) {
				return method560(var2).method557(1);
			}
		}

		IGXVZOHI var4 = (IGXVZOHI) field1402.method1(field1428);
		if (var4 != null) {
			return var4;
		}

		IGXVZOHI var5 = IGXVZOHI.method354(field1406);
		if (var5 == null) {
			return null;
		}

		if (field1422 != 128 || field1410 != 128 || field1385 != 128) {
			var5.method370(field1422, field1410, field1385);
		}

		if (field1408 != null) {
			for (int var6 = 0; var6 < field1408.length; var6++) {
				var5.method368(field1408[var6], field1392[var6]);
			}
		}

		var5.method371(field1431 + 64, field1409 + 768, -50, -10, -50, true);
		var5.field811 = true;
		field1402.method2(var5, field1428);
		return var5;
	}

	@ObfuscatedName("WMJBOJYO.a(LEGCCHUZS;Z)V")
	public final void method558(EGCCHUZS arg0) {
		while (true) {
			int var2 = arg0.method261();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1406 = arg0.method263();
			} else if (var2 == 2) {
				field1419 = arg0.method268();
			} else if (var2 == 3) {
				field1429 = arg0.method269();
			} else if (var2 == 4) {
				field1390 = arg0.method263();
			} else if (var2 == 5) {
				field1432 = arg0.method263();
			} else if (var2 == 6) {
				field1417 = arg0.method263();
			} else if (var2 == 7) {
				field1415 = arg0.method263();
				if (field1415 > 32767) {
					field1415 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1426 = arg0.method263();
				if (field1426 > 32767) {
					field1426 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1413 = arg0.method263();
			} else if (var2 == 11) {
				field1398 = true;
			} else if (var2 == 12) {
				field1421 = arg0.method266();
			} else if (var2 == 16) {
				field1400 = true;
			} else if (var2 == 23) {
				field1393 = arg0.method263();
				field1387 = arg0.method262();
			} else if (var2 == 24) {
				field1411 = arg0.method263();
			} else if (var2 == 25) {
				field1395 = arg0.method263();
				field1386 = arg0.method262();
			} else if (var2 == 26) {
				field1430 = arg0.method263();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1425 == null) {
					field1425 = new String[5];
				}

				field1425[var2 - 30] = arg0.method268();
				if (field1425[var2 - 30].equalsIgnoreCase("hidden")) {
					field1425[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1399 == null) {
					field1399 = new String[5];
				}

				field1399[var2 - 35] = arg0.method268();
			} else if (var2 == 40) {
				int var3 = arg0.method261();
				field1408 = new int[var3];
				field1392 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1408[var4] = arg0.method263();
					field1392[var4] = arg0.method263();
				}
			} else if (var2 == 78) {
				field1389 = arg0.method263();
			} else if (var2 == 79) {
				field1407 = arg0.method263();
			} else if (var2 == 90) {
				field1423 = arg0.method263();
			} else if (var2 == 91) {
				field1412 = arg0.method263();
			} else if (var2 == 92) {
				field1427 = arg0.method263();
			} else if (var2 == 93) {
				field1403 = arg0.method263();
			} else if (var2 == 95) {
				field1414 = arg0.method263();
			} else if (var2 == 97) {
				field1416 = arg0.method263();
			} else if (var2 == 98) {
				field1388 = arg0.method263();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1404 == null) {
					field1404 = new int[10];
					field1420 = new int[10];
				}

				field1404[var2 - 100] = arg0.method263();
				field1420[var2 - 100] = arg0.method263();
			} else if (var2 == 110) {
				field1422 = arg0.method263();
			} else if (var2 == 111) {
				field1410 = arg0.method263();
			} else if (var2 == 112) {
				field1385 = arg0.method263();
			} else if (var2 == 113) {
				field1431 = arg0.method262();
			} else if (var2 == 114) {
				field1409 = arg0.method262() * 5;
			} else if (var2 == 115) {
				field1394 = arg0.method261();
			}
		}
	}

	@ObfuscatedName("WMJBOJYO.a(IZ)Z")
	public final boolean method559(int arg0) {
		int var2 = field1393;
		int var3 = field1411;
		int var4 = field1389;
		if (arg0 == 1) {
			var2 = field1395;
			var3 = field1430;
			var4 = field1407;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!IGXVZOHI.method355(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !IGXVZOHI.method355(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !IGXVZOHI.method355(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("WMJBOJYO.b(I)LWMJBOJYO;")
	public static final WMJBOJYO method560(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1405[var1].field1428 == arg0) {
				return field1405[var1];
			}
		}

		field1418 = (field1418 + 1) % 10;
		WMJBOJYO var2 = field1405[field1418];
		field1424.field589 = field1401[arg0];
		var2.field1428 = arg0;
		var2.method568();
		var2.method558(field1424);

		if (var2.field1388 != -1) {
			var2.method566();
		}

		if (!field1391 && var2.field1400) {
			var2.field1419 = "Members Object";
			var2.field1429 = "Login to a members' server to use this object.".getBytes();
			var2.field1425 = null;
			var2.field1399 = null;
			var2.field1394 = 0;
		}

		return var2;
	}

	@ObfuscatedName("WMJBOJYO.a(LTKEGJSFV;)V")
	public static final void method561(TKEGJSFV arg0) {
		field1424 = new EGCCHUZS(arg0.method542("obj.dat", null));
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("obj.idx", null));
		field1396 = var1.method263();
		field1401 = new int[field1396];
		int var2 = 2;
		for (int var3 = 0; var3 < field1396; var3++) {
			field1401[var3] = var2;
			var2 += var1.method263();
		}

		field1405 = new WMJBOJYO[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1405[var4] = new WMJBOJYO();
		}
	}

	@ObfuscatedName("WMJBOJYO.a(II)LIGXVZOHI;")
	public final IGXVZOHI method562(int arg0) {
		int var2 = field1423;
		int var3 = field1427;
		if (arg0 == 1) {
			var2 = field1412;
			var3 = field1403;
		}

		if (var2 == -1) {
			return null;
		}

		IGXVZOHI var4 = IGXVZOHI.method354(var2);
		if (var3 != -1) {
			IGXVZOHI var5 = IGXVZOHI.method354(var3);
			IGXVZOHI[] var6 = new IGXVZOHI[] { var4, var5 };
			var4 = new IGXVZOHI(2, var6);
		}

		if (field1408 != null) {
			for (int var7 = 0; var7 < field1408.length; var7++) {
				var4.method368(field1408[var7], field1392[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("WMJBOJYO.a(B)V")
	public static final void method563() {
		field1402 = null;
		field1397 = null;
		field1401 = null;
		field1405 = null;
		field1424 = null;
	}

	@ObfuscatedName("WMJBOJYO.b(II)Z")
	public final boolean method564(int arg0) {
		int var2 = field1423;
		int var3 = field1427;
		if (arg0 == 1) {
			var2 = field1412;
			var3 = field1403;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!IGXVZOHI.method355(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !IGXVZOHI.method355(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("WMJBOJYO.b(IZ)LIGXVZOHI;")
	public final IGXVZOHI method565(int arg0) {
		if (field1404 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1420[var3] && field1420[var3] != 0) {
					var2 = field1404[var3];
				}
			}

			if (var2 != -1) {
				return method560(var2).method565(1);
			}
		}

		IGXVZOHI var4 = IGXVZOHI.method354(field1406);
		if (var4 == null) {
			return null;
		}

		if (field1408 != null) {
			for (int var5 = 0; var5 < field1408.length; var5++) {
				var4.method368(field1408[var5], field1392[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("WMJBOJYO.c(I)V")
	public void method566() {
		WMJBOJYO var1 = method560(field1388);
		field1406 = var1.field1406;
		field1390 = var1.field1390;
		field1432 = var1.field1432;
		field1417 = var1.field1417;
		field1414 = var1.field1414;
		field1415 = var1.field1415;
		field1426 = var1.field1426;
		field1408 = var1.field1408;
		field1392 = var1.field1392;
		WMJBOJYO var2 = method560(field1416);
		field1419 = var2.field1419;
		field1400 = var2.field1400;
		field1421 = var2.field1421;
		String var3 = "a";
		char var4 = var2.field1419.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1429 = ("Swap this note at any bank for " + var3 + " " + var2.field1419 + ".").getBytes();
		field1398 = true;
	}

	@ObfuscatedName("WMJBOJYO.a(IIII)LHOSNGCXH;")
	public static final HOSNGCXH method567(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			HOSNGCXH var3 = (HOSNGCXH) field1397.method1(arg2);
			if (var3 != null && var3.field737 != arg1 && var3.field737 != -1) {
				var3.method379();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		WMJBOJYO var4 = method560(arg2);
		if (var4.field1404 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field1420[var6] && var4.field1420[var6] != 0) {
					var5 = var4.field1404[var6];
				}
			}

			if (var5 != -1) {
				var4 = method560(var5);
			}
		}

		IGXVZOHI var7 = var4.method557(1);
		if (var7 == null) {
			return null;
		}

		HOSNGCXH var8 = null;
		if (var4.field1388 != -1) {
			var8 = method567(-1, 10, var4.field1416);
			if (var8 == null) {
				return null;
			}
		}

		HOSNGCXH var9 = new HOSNGCXH(32, 32);
		int var10 = PNDPOZTD.field1153;
		int var11 = PNDPOZTD.field1154;
		int[] var12 = PNDPOZTD.field1159;
		int[] var13 = JOVUNXBE.field850;
		int var14 = JOVUNXBE.field851;
		int var15 = JOVUNXBE.field852;
		int var16 = JOVUNXBE.field855;
		int var17 = JOVUNXBE.field856;
		int var18 = JOVUNXBE.field853;
		int var19 = JOVUNXBE.field854;
		PNDPOZTD.field1151 = false;
		JOVUNXBE.method380(var9.field731, 32, 32);
		JOVUNXBE.method385(0, 32, 32, 0, 0);
		PNDPOZTD.method503();
		int var20 = var4.field1390;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = PNDPOZTD.field1157[var4.field1432] * var20 >> 16;
		int var22 = PNDPOZTD.field1158[var4.field1432] * var20 >> 16;
		var7.method374(0, var4.field1417, var4.field1414, var4.field1432, var4.field1415, var7.field51 / 2 + var21 + var4.field1426, var4.field1426 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field731[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field731[var24 * 32 + var23 - 1] > 1) {
						var9.field731[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field731[(var24 - 1) * 32 + var23] > 1) {
						var9.field731[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field731[var24 * 32 + var23 + 1] > 1) {
						var9.field731[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field731[(var24 + 1) * 32 + var23] > 1) {
						var9.field731[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field731[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field731[var26 * 32 + var25 - 1] == 1) {
							var9.field731[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field731[(var26 - 1) * 32 + var25] == 1) {
							var9.field731[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field731[var26 * 32 + var25 + 1] == 1) {
							var9.field731[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field731[(var26 + 1) * 32 + var25] == 1) {
							var9.field731[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field731[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field731[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field731[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1388 != -1) {
			int var29 = var8.field736;
			int var30 = var8.field737;
			var8.field736 = 32;
			var8.field737 = 32;
			var8.method335(0, 0);
			var8.field736 = var29;
			var8.field737 = var30;
		}

		if (arg0 == 0) {
			field1397.method2(var9, arg2);
		}

		JOVUNXBE.method380(var13, var14, var15);
		JOVUNXBE.method382(var17, var16, var18, var19);
		PNDPOZTD.field1153 = var10;
		PNDPOZTD.field1154 = var11;
		PNDPOZTD.field1159 = var12;
		PNDPOZTD.field1151 = true;

		if (var4.field1398) {
			var9.field736 = 33;
		} else {
			var9.field736 = 32;
		}

		var9.field737 = arg1;
		return var9;
	}

	@ObfuscatedName("WMJBOJYO.a()V")
	public final void method568() {
		field1406 = 0;
		field1419 = null;
		field1429 = null;
		field1408 = null;
		field1392 = null;
		field1390 = 2000;
		field1432 = 0;
		field1417 = 0;
		field1414 = 0;
		field1415 = 0;
		field1426 = 0;
		field1413 = -1;
		field1398 = false;
		field1421 = 1;
		field1400 = false;
		field1425 = null;
		field1399 = null;
		field1393 = -1;
		field1411 = -1;
		field1387 = 0;
		field1395 = -1;
		field1430 = -1;
		field1386 = 0;
		field1389 = -1;
		field1407 = -1;
		field1423 = -1;
		field1427 = -1;
		field1412 = -1;
		field1403 = -1;
		field1404 = null;
		field1420 = null;
		field1416 = -1;
		field1388 = -1;
		field1422 = 128;
		field1410 = 128;
		field1385 = 128;
		field1431 = 0;
		field1409 = 0;
		field1394 = 0;
	}

	@ObfuscatedName("WMJBOJYO.c(II)LIGXVZOHI;")
	public final IGXVZOHI method569(int arg0) {
		int var2 = field1393;
		int var3 = field1411;
		int var4 = field1389;
		if (arg0 == 1) {
			var2 = field1395;
			var3 = field1430;
			var4 = field1407;
		}

		if (var2 == -1) {
			return null;
		}

		IGXVZOHI var5 = IGXVZOHI.method354(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				IGXVZOHI var9 = IGXVZOHI.method354(var3);
				IGXVZOHI[] var10 = new IGXVZOHI[] { var5, var9 };
				var5 = new IGXVZOHI(2, var10);
			} else {
				IGXVZOHI var6 = IGXVZOHI.method354(var3);
				IGXVZOHI var7 = IGXVZOHI.method354(var4);
				IGXVZOHI[] var8 = new IGXVZOHI[] { var5, var6, var7 };
				var5 = new IGXVZOHI(3, var8);
			}
		}

		if (arg0 == 0 && field1387 != 0) {
			var5.method367(0, 0, field1387);
		}

		if (arg0 == 1 && field1386 != 0) {
			var5.method367(0, 0, field1386);
		}

		if (field1408 != null) {
			for (int var11 = 0; var11 < field1408.length; var11++) {
				var5.method368(field1408[var11], field1392[var11]);
			}
		}

		return var5;
	}
}
