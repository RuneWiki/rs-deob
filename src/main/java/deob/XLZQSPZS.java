package deob;

@ObfuscatedName("XLZQSPZS")
public final class XLZQSPZS {

	@ObfuscatedName("XLZQSPZS.e")
	public int field1303 = -1;

	@ObfuscatedName("XLZQSPZS.k")
	public static boolean field1309 = true;

	@ObfuscatedName("XLZQSPZS.F")
	public static DSMCVRKW field1327 = new DSMCVRKW(100);

	@ObfuscatedName("XLZQSPZS.P")
	public static DSMCVRKW field1337 = new DSMCVRKW(50);

	@ObfuscatedName("XLZQSPZS.i")
	public byte field1307;

	@ObfuscatedName("XLZQSPZS.v")
	public byte field1319;

	@ObfuscatedName("XLZQSPZS.a")
	public static int field1300;

	@ObfuscatedName("XLZQSPZS.c")
	public int field1302;

	@ObfuscatedName("XLZQSPZS.g")
	public int field1305;

	@ObfuscatedName("XLZQSPZS.h")
	public int field1306;

	@ObfuscatedName("XLZQSPZS.j")
	public int field1308;

	@ObfuscatedName("XLZQSPZS.m")
	public int field1311;

	@ObfuscatedName("XLZQSPZS.o")
	public int field1313;

	@ObfuscatedName("XLZQSPZS.s")
	public int field1316;

	@ObfuscatedName("XLZQSPZS.t")
	public int field1317;

	@ObfuscatedName("XLZQSPZS.u")
	public int field1318;

	@ObfuscatedName("XLZQSPZS.w")
	public int field1320;

	@ObfuscatedName("XLZQSPZS.x")
	public int field1321;

	@ObfuscatedName("XLZQSPZS.y")
	public int field1322;

	@ObfuscatedName("XLZQSPZS.z")
	public int field1323;

	@ObfuscatedName("XLZQSPZS.A")
	public int field1324;

	@ObfuscatedName("XLZQSPZS.C")
	public int field1325;

	@ObfuscatedName("XLZQSPZS.E")
	public int field1326;

	@ObfuscatedName("XLZQSPZS.G")
	public int field1328;

	@ObfuscatedName("XLZQSPZS.I")
	public int field1330;

	@ObfuscatedName("XLZQSPZS.K")
	public int field1332;

	@ObfuscatedName("XLZQSPZS.M")
	public int field1334;

	@ObfuscatedName("XLZQSPZS.O")
	public int field1336;

	@ObfuscatedName("XLZQSPZS.R")
	public static int field1339;

	@ObfuscatedName("XLZQSPZS.T")
	public int field1341;

	@ObfuscatedName("XLZQSPZS.V")
	public int field1343;

	@ObfuscatedName("XLZQSPZS.W")
	public int field1344;

	@ObfuscatedName("XLZQSPZS.X")
	public int field1345;

	@ObfuscatedName("XLZQSPZS.Z")
	public int field1346;

	@ObfuscatedName("XLZQSPZS.ab")
	public int field1347;

	@ObfuscatedName("XLZQSPZS.H")
	public static EILHLJCE field1329;

	@ObfuscatedName("XLZQSPZS.Q")
	public String field1338;

	@ObfuscatedName("XLZQSPZS.q")
	public boolean field1315;

	@ObfuscatedName("XLZQSPZS.J")
	public boolean field1331;

	@ObfuscatedName("XLZQSPZS.L")
	public byte[] field1333;

	@ObfuscatedName("XLZQSPZS.b")
	public int[] field1301;

	@ObfuscatedName("XLZQSPZS.f")
	public int[] field1304;

	@ObfuscatedName("XLZQSPZS.n")
	public int[] field1312;

	@ObfuscatedName("XLZQSPZS.S")
	public static int[] field1340;

	@ObfuscatedName("XLZQSPZS.U")
	public int[] field1342;

	@ObfuscatedName("XLZQSPZS.p")
	public static XLZQSPZS[] field1314;

	@ObfuscatedName("XLZQSPZS.l")
	public String[] field1310;

	@ObfuscatedName("XLZQSPZS.N")
	public String[] field1335;

	@ObfuscatedName("XLZQSPZS.a(I)LKBEXSZSN;")
	public final KBEXSZSN method514(int arg0) {
		if (field1301 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1312[var3] && field1312[var3] != 0) {
					var2 = field1301[var3];
				}
			}

			if (var2 != -1) {
				return method526(var2).method514(1);
			}
		}

		KBEXSZSN var4 = (KBEXSZSN) field1337.method197(field1303);
		if (var4 != null) {
			return var4;
		}

		KBEXSZSN var5 = KBEXSZSN.method339(field1341);
		if (var5 == null) {
			return null;
		}

		if (field1345 != 128 || field1346 != 128 || field1325 != 128) {
			var5.method355(field1325, field1346, field1345);
		}

		if (field1304 != null) {
			for (int var6 = 0; var6 < field1304.length; var6++) {
				var5.method353(field1304[var6], field1342[var6]);
			}
		}

		var5.method356(field1334 + 64, field1305 + 768, -50, -10, -50, true);
		var5.field905 = true;
		field1337.method198(field1303, var5);
		return var5;
	}

	@ObfuscatedName("XLZQSPZS.a(II)Z")
	public final boolean method515(int arg0) {
		int var2 = field1317;
		int var3 = field1313;
		if (arg0 == 1) {
			var2 = field1311;
			var3 = field1321;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!KBEXSZSN.method340(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !KBEXSZSN.method340(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("XLZQSPZS.b(I)V")
	public void method516() {
		XLZQSPZS var1 = method526(field1324);
		field1341 = var1.field1341;
		field1322 = var1.field1322;
		field1336 = var1.field1336;
		field1318 = var1.field1318;
		field1328 = var1.field1328;
		field1332 = var1.field1332;
		field1320 = var1.field1320;
		field1304 = var1.field1304;
		field1342 = var1.field1342;
		XLZQSPZS var2 = method526(field1330);
		field1338 = var2.field1338;
		field1315 = var2.field1315;
		field1316 = var2.field1316;
		String var3 = "a";
		char var4 = var2.field1338.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1333 = ("Swap this note at any bank for " + var3 + " " + var2.field1338 + ".").getBytes();
		field1331 = true;
	}

	@ObfuscatedName("XLZQSPZS.a(ZI)Z")
	public final boolean method517(int arg0) {
		int var2 = field1343;
		int var3 = field1302;
		int var4 = field1323;
		if (arg0 == 1) {
			var2 = field1326;
			var3 = field1306;
			var4 = field1347;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!KBEXSZSN.method340(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !KBEXSZSN.method340(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !KBEXSZSN.method340(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("XLZQSPZS.a(LBBMKAXRK;)V")
	public static final void method518(BBMKAXRK arg0) {
		field1329 = new EILHLJCE(arg0.method30("obj.dat", null));
		EILHLJCE var1 = new EILHLJCE(arg0.method30("obj.idx", null));
		field1339 = var1.method226();
		field1340 = new int[field1339];
		int var2 = 2;
		for (int var3 = 0; var3 < field1339; var3++) {
			field1340[var3] = var2;
			var2 += var1.method226();
		}

		field1314 = new XLZQSPZS[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1314[var4] = new XLZQSPZS();
		}
	}

	@ObfuscatedName("XLZQSPZS.c(I)V")
	public static final void method519() {
		field1337 = null;
		field1327 = null;
		field1340 = null;
		field1314 = null;
		field1329 = null;
	}

	@ObfuscatedName("XLZQSPZS.b(II)LKBEXSZSN;")
	public final KBEXSZSN method520(int arg0) {
		if (field1301 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1312[var3] && field1312[var3] != 0) {
					var2 = field1301[var3];
				}
			}

			if (var2 != -1) {
				return method526(var2).method520(1);
			}
		}

		KBEXSZSN var4 = KBEXSZSN.method339(field1341);
		if (var4 == null) {
			return null;
		}

		if (field1304 != null) {
			for (int var5 = 0; var5 < field1304.length; var5++) {
				var4.method353(field1304[var5], field1342[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("XLZQSPZS.a()V")
	public final void method521() {
		field1341 = 0;
		field1338 = null;
		field1333 = null;
		field1304 = null;
		field1342 = null;
		field1322 = 2000;
		field1336 = 0;
		field1318 = 0;
		field1328 = 0;
		field1332 = 0;
		field1320 = 0;
		field1344 = -1;
		field1331 = false;
		field1316 = 1;
		field1315 = false;
		field1310 = null;
		field1335 = null;
		field1343 = -1;
		field1302 = -1;
		field1319 = 0;
		field1326 = -1;
		field1306 = -1;
		field1307 = 0;
		field1323 = -1;
		field1347 = -1;
		field1317 = -1;
		field1313 = -1;
		field1311 = -1;
		field1321 = -1;
		field1301 = null;
		field1312 = null;
		field1330 = -1;
		field1324 = -1;
		field1345 = 128;
		field1346 = 128;
		field1325 = 128;
		field1334 = 0;
		field1305 = 0;
		field1308 = 0;
	}

	@ObfuscatedName("XLZQSPZS.c(II)LKBEXSZSN;")
	public final KBEXSZSN method522(int arg0) {
		int var2 = field1343;
		int var3 = field1302;
		int var4 = field1323;
		if (arg0 == 1) {
			var2 = field1326;
			var3 = field1306;
			var4 = field1347;
		}

		if (var2 == -1) {
			return null;
		}

		KBEXSZSN var5 = KBEXSZSN.method339(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				KBEXSZSN var9 = KBEXSZSN.method339(var3);
				KBEXSZSN[] var10 = new KBEXSZSN[] { var5, var9 };
				var5 = new KBEXSZSN(2, var10);
			} else {
				KBEXSZSN var6 = KBEXSZSN.method339(var3);
				KBEXSZSN var7 = KBEXSZSN.method339(var4);
				KBEXSZSN[] var8 = new KBEXSZSN[] { var5, var6, var7 };
				var5 = new KBEXSZSN(3, var8);
			}
		}

		if (arg0 == 0 && field1319 != 0) {
			var5.method352(field1319, 0, 0);
		}

		if (arg0 == 1 && field1307 != 0) {
			var5.method352(field1307, 0, 0);
		}

		if (field1304 != null) {
			for (int var11 = 0; var11 < field1304.length; var11++) {
				var5.method353(field1304[var11], field1342[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("XLZQSPZS.a(LEILHLJCE;B)V")
	public final void method523(EILHLJCE arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1341 = arg0.method226();
			} else if (var2 == 2) {
				field1338 = arg0.method231();
			} else if (var2 == 3) {
				field1333 = arg0.method232();
			} else if (var2 == 4) {
				field1322 = arg0.method226();
			} else if (var2 == 5) {
				field1336 = arg0.method226();
			} else if (var2 == 6) {
				field1318 = arg0.method226();
			} else if (var2 == 7) {
				field1332 = arg0.method226();
				if (field1332 > 32767) {
					field1332 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1320 = arg0.method226();
				if (field1320 > 32767) {
					field1320 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1344 = arg0.method226();
			} else if (var2 == 11) {
				field1331 = true;
			} else if (var2 == 12) {
				field1316 = arg0.method229();
			} else if (var2 == 16) {
				field1315 = true;
			} else if (var2 == 23) {
				field1343 = arg0.method226();
				field1319 = arg0.method225();
			} else if (var2 == 24) {
				field1302 = arg0.method226();
			} else if (var2 == 25) {
				field1326 = arg0.method226();
				field1307 = arg0.method225();
			} else if (var2 == 26) {
				field1306 = arg0.method226();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1310 == null) {
					field1310 = new String[5];
				}

				field1310[var2 - 30] = arg0.method231();
				if (field1310[var2 - 30].equalsIgnoreCase("hidden")) {
					field1310[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1335 == null) {
					field1335 = new String[5];
				}

				field1335[var2 - 35] = arg0.method231();
			} else if (var2 == 40) {
				int var3 = arg0.method224();
				field1304 = new int[var3];
				field1342 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1304[var4] = arg0.method226();
					field1342[var4] = arg0.method226();
				}
			} else if (var2 == 78) {
				field1323 = arg0.method226();
			} else if (var2 == 79) {
				field1347 = arg0.method226();
			} else if (var2 == 90) {
				field1317 = arg0.method226();
			} else if (var2 == 91) {
				field1311 = arg0.method226();
			} else if (var2 == 92) {
				field1313 = arg0.method226();
			} else if (var2 == 93) {
				field1321 = arg0.method226();
			} else if (var2 == 95) {
				field1328 = arg0.method226();
			} else if (var2 == 97) {
				field1330 = arg0.method226();
			} else if (var2 == 98) {
				field1324 = arg0.method226();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1301 == null) {
					field1301 = new int[10];
					field1312 = new int[10];
				}

				field1301[var2 - 100] = arg0.method226();
				field1312[var2 - 100] = arg0.method226();
			} else if (var2 == 110) {
				field1345 = arg0.method226();
			} else if (var2 == 111) {
				field1346 = arg0.method226();
			} else if (var2 == 112) {
				field1325 = arg0.method226();
			} else if (var2 == 113) {
				field1334 = arg0.method225();
			} else if (var2 == 114) {
				field1305 = arg0.method225() * 5;
			} else if (var2 == 115) {
				field1308 = arg0.method224();
			}
		}
	}

	@ObfuscatedName("XLZQSPZS.a(IBII)LODBDSPMH;")
	public static final ODBDSPMH method524(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			ODBDSPMH var3 = (ODBDSPMH) field1327.method197(arg0);
			if (var3 != null && var3.field1033 != arg2 && var3.field1033 != -1) {
				var3.method334();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		XLZQSPZS var4 = method526(arg0);
		if (var4.field1301 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field1312[var6] && var4.field1312[var6] != 0) {
					var5 = var4.field1301[var6];
				}
			}

			if (var5 != -1) {
				var4 = method526(var5);
			}
		}

		KBEXSZSN var7 = var4.method514(1);
		if (var7 == null) {
			return null;
		}

		ODBDSPMH var8 = null;
		if (var4.field1324 != -1) {
			var8 = method524(var4.field1330, -1, 10);
			if (var8 == null) {
				return null;
			}
		}

		ODBDSPMH var9 = new ODBDSPMH(32, 32);
		int var10 = GBZDHVLZ.field711;
		int var11 = GBZDHVLZ.field712;
		int[] var12 = GBZDHVLZ.field717;
		int[] var13 = IFHRXNFO.field759;
		int var14 = IFHRXNFO.field760;
		int var15 = IFHRXNFO.field761;
		int var16 = IFHRXNFO.field764;
		int var17 = IFHRXNFO.field765;
		int var18 = IFHRXNFO.field762;
		int var19 = IFHRXNFO.field763;
		GBZDHVLZ.field709 = false;
		IFHRXNFO.method310(32, var9.field1027, 32);
		IFHRXNFO.method315(0, 0, 32, 32, 0);
		GBZDHVLZ.method281();
		int var20 = var4.field1322;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = GBZDHVLZ.field715[var4.field1336] * var20 >> 16;
		int var22 = GBZDHVLZ.field716[var4.field1336] * var20 >> 16;
		var7.method360(0, var4.field1318, var4.field1328, var4.field1336, var4.field1332, var7.field1299 / 2 + var21 + var4.field1320, var4.field1320 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1027[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1027[var24 * 32 + var23 - 1] > 1) {
						var9.field1027[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1027[(var24 - 1) * 32 + var23] > 1) {
						var9.field1027[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1027[var24 * 32 + var23 + 1] > 1) {
						var9.field1027[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1027[(var24 + 1) * 32 + var23] > 1) {
						var9.field1027[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1027[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1027[var26 * 32 + var25 - 1] == 1) {
							var9.field1027[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field1027[(var26 - 1) * 32 + var25] == 1) {
							var9.field1027[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field1027[var26 * 32 + var25 + 1] == 1) {
							var9.field1027[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field1027[(var26 + 1) * 32 + var25] == 1) {
							var9.field1027[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1027[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1027[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1027[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1324 != -1) {
			int var29 = var8.field1032;
			int var30 = var8.field1033;
			var8.field1032 = 32;
			var8.field1033 = 32;
			var8.method404(0, 0);
			var8.field1032 = var29;
			var8.field1033 = var30;
		}

		if (arg1 == 0) {
			field1327.method198(arg0, var9);
		}

		IFHRXNFO.method310(var15, var13, var14);
		IFHRXNFO.method312(var17, var19, var16, var18);
		GBZDHVLZ.field711 = var10;
		GBZDHVLZ.field712 = var11;
		GBZDHVLZ.field717 = var12;
		GBZDHVLZ.field709 = true;

		if (var4.field1331) {
			var9.field1032 = 33;
		} else {
			var9.field1032 = 32;
		}

		var9.field1033 = arg2;
		return var9;
	}

	@ObfuscatedName("XLZQSPZS.d(II)LKBEXSZSN;")
	public final KBEXSZSN method525(int arg0) {
		int var2 = field1317;
		int var3 = field1313;
		if (arg0 == 1) {
			var2 = field1311;
			var3 = field1321;
		}

		if (var2 == -1) {
			return null;
		}

		KBEXSZSN var4 = KBEXSZSN.method339(var2);
		if (var3 != -1) {
			KBEXSZSN var5 = KBEXSZSN.method339(var3);
			KBEXSZSN[] var6 = new KBEXSZSN[] { var4, var5 };
			var4 = new KBEXSZSN(2, var6);
		}

		if (field1304 != null) {
			for (int var7 = 0; var7 < field1304.length; var7++) {
				var4.method353(field1304[var7], field1342[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("XLZQSPZS.d(I)LXLZQSPZS;")
	public static final XLZQSPZS method526(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1314[var1].field1303 == arg0) {
				return field1314[var1];
			}
		}

		field1300 = (field1300 + 1) % 10;
		XLZQSPZS var2 = field1314[field1300];
		field1329.field684 = field1340[arg0];
		var2.field1303 = arg0;
		var2.method521();
		var2.method523(field1329);

		if (var2.field1324 != -1) {
			var2.method516();
		}

		if (!field1309 && var2.field1315) {
			var2.field1338 = "Members Object";
			var2.field1333 = "Login to a members' server to use this object.".getBytes();
			var2.field1310 = null;
			var2.field1335 = null;
			var2.field1308 = 0;
		}

		return var2;
	}
}
