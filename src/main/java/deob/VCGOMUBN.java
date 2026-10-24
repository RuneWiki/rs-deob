package deob;

@ObfuscatedName("VCGOMUBN")
public final class VCGOMUBN {

	@ObfuscatedName("VCGOMUBN.N")
	public int field1413 = -1;

	@ObfuscatedName("VCGOMUBN.s")
	public static ASORKPAH field1394 = new ASORKPAH(500);

	@ObfuscatedName("VCGOMUBN.F")
	public static ASORKPAH field1405 = new ASORKPAH(30);

	@ObfuscatedName("VCGOMUBN.K")
	public static GFYXEFQY[] field1410 = new GFYXEFQY[4];

	@ObfuscatedName("VCGOMUBN.c")
	public byte field1379;

	@ObfuscatedName("VCGOMUBN.r")
	public byte field1393;

	@ObfuscatedName("VCGOMUBN.e")
	public int field1381;

	@ObfuscatedName("VCGOMUBN.f")
	public int field1382;

	@ObfuscatedName("VCGOMUBN.h")
	public int field1384;

	@ObfuscatedName("VCGOMUBN.i")
	public int field1385;

	@ObfuscatedName("VCGOMUBN.j")
	public static int field1386;

	@ObfuscatedName("VCGOMUBN.k")
	public int field1387;

	@ObfuscatedName("VCGOMUBN.o")
	public int field1390;

	@ObfuscatedName("VCGOMUBN.p")
	public int field1391;

	@ObfuscatedName("VCGOMUBN.q")
	public int field1392;

	@ObfuscatedName("VCGOMUBN.x")
	public int field1398;

	@ObfuscatedName("VCGOMUBN.y")
	public int field1399;

	@ObfuscatedName("VCGOMUBN.B")
	public static int field1402;

	@ObfuscatedName("VCGOMUBN.E")
	public int field1404;

	@ObfuscatedName("VCGOMUBN.J")
	public int field1409;

	@ObfuscatedName("VCGOMUBN.L")
	public int field1411;

	@ObfuscatedName("VCGOMUBN.O")
	public int field1414;

	@ObfuscatedName("VCGOMUBN.S")
	public int field1418;

	@ObfuscatedName("VCGOMUBN.U")
	public int field1420;

	@ObfuscatedName("VCGOMUBN.z")
	public static CKBTFRZM field1400;

	@ObfuscatedName("VCGOMUBN.t")
	public static client field1395;

	@ObfuscatedName("VCGOMUBN.C")
	public String field1403;

	@ObfuscatedName("VCGOMUBN.d")
	public boolean field1380;

	@ObfuscatedName("VCGOMUBN.g")
	public boolean field1383;

	@ObfuscatedName("VCGOMUBN.n")
	public boolean field1389;

	@ObfuscatedName("VCGOMUBN.u")
	public boolean field1396;

	@ObfuscatedName("VCGOMUBN.A")
	public boolean field1401;

	@ObfuscatedName("VCGOMUBN.G")
	public boolean field1406;

	@ObfuscatedName("VCGOMUBN.H")
	public boolean field1407;

	@ObfuscatedName("VCGOMUBN.T")
	public boolean field1419;

	@ObfuscatedName("VCGOMUBN.V")
	public static boolean field1421;

	@ObfuscatedName("VCGOMUBN.W")
	public boolean field1422;

	@ObfuscatedName("VCGOMUBN.X")
	public boolean field1423;

	@ObfuscatedName("VCGOMUBN.Q")
	public byte[] field1416;

	@ObfuscatedName("VCGOMUBN.a")
	public int[] field1377;

	@ObfuscatedName("VCGOMUBN.b")
	public int[] field1378;

	@ObfuscatedName("VCGOMUBN.m")
	public int[] field1388;

	@ObfuscatedName("VCGOMUBN.v")
	public int[] field1397;

	@ObfuscatedName("VCGOMUBN.M")
	public int[] field1412;

	@ObfuscatedName("VCGOMUBN.P")
	public static int[] field1415;

	@ObfuscatedName("VCGOMUBN.I")
	public static VCGOMUBN[] field1408;

	@ObfuscatedName("VCGOMUBN.R")
	public String[] field1417;

	@ObfuscatedName("VCGOMUBN.a()V")
	public final void method565() {
		field1377 = null;
		field1388 = null;
		field1403 = null;
		field1416 = null;
		field1378 = null;
		field1397 = null;
		field1420 = 1;
		field1392 = 1;
		field1396 = true;
		field1419 = true;
		field1389 = false;
		field1380 = false;
		field1407 = false;
		field1406 = false;
		field1384 = -1;
		field1385 = 16;
		field1379 = 0;
		field1393 = 0;
		field1417 = null;
		field1391 = -1;
		field1381 = -1;
		field1422 = false;
		field1383 = true;
		field1387 = 128;
		field1418 = 128;
		field1399 = 128;
		field1411 = 0;
		field1382 = 0;
		field1414 = 0;
		field1398 = 0;
		field1423 = false;
		field1401 = false;
		field1404 = -1;
		field1390 = -1;
		field1409 = -1;
		field1412 = null;
	}

	@ObfuscatedName("VCGOMUBN.a(II)Z")
	public final boolean method566(int arg0) {
		if (field1388 != null) {
			for (int var4 = 0; var4 < field1388.length; var4++) {
				if (field1388[var4] == arg0) {
					return GFYXEFQY.method342(field1377[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1377 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1377.length; var3++) {
				var2 &= GFYXEFQY.method342(field1377[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("VCGOMUBN.a(BLCKBTFRZM;)V")
	public final void method567(CKBTFRZM arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method44();
					if (var3 == 0) {
						if (var2 == -1) {
							field1389 = false;
							if (field1377 != null && (field1388 == null || field1388[0] == 10)) {
								field1389 = true;
							}

							if (field1417 != null) {
								field1389 = true;
							}
						}

						if (field1401) {
							field1396 = false;
							field1419 = false;
						}

						if (field1404 == -1) {
							field1404 = field1396 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1403 = arg0.method51();
					} else if (var3 == 3) {
						field1416 = arg0.method52();
					} else if (var3 == 5) {
						int var6 = arg0.method44();
						if (var6 > 0) {
							if (field1377 == null || field1421) {
								field1388 = null;
								field1377 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1377[var7] = arg0.method46();
								}
							} else {
								arg0.field92 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1420 = arg0.method44();
					} else if (var3 == 15) {
						field1392 = arg0.method44();
					} else if (var3 == 17) {
						field1396 = false;
					} else if (var3 == 18) {
						field1419 = false;
					} else if (var3 == 19) {
						var2 = arg0.method44();
						if (var2 == 1) {
							field1389 = true;
						}
					} else if (var3 == 21) {
						field1380 = true;
					} else if (var3 == 22) {
						field1407 = true;
					} else if (var3 == 23) {
						field1406 = true;
					} else if (var3 == 24) {
						field1384 = arg0.method46();
						if (field1384 == 0xFFFF) {
							field1384 = -1;
						}
					} else if (var3 == 28) {
						field1385 = arg0.method44();
					} else if (var3 == 29) {
						field1379 = arg0.method45();
					} else if (var3 == 39) {
						field1393 = arg0.method45();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1417 == null) {
							field1417 = new String[5];
						}

						field1417[var3 - 30] = arg0.method51();
						if (field1417[var3 - 30].equalsIgnoreCase("hidden")) {
							field1417[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method44();
						field1378 = new int[var8];
						field1397 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1378[var9] = arg0.method46();
							field1397[var9] = arg0.method46();
						}
					} else if (var3 == 60) {
						field1391 = arg0.method46();
					} else if (var3 == 62) {
						field1422 = true;
					} else if (var3 == 64) {
						field1383 = false;
					} else if (var3 == 65) {
						field1387 = arg0.method46();
					} else if (var3 == 66) {
						field1418 = arg0.method46();
					} else if (var3 == 67) {
						field1399 = arg0.method46();
					} else if (var3 == 68) {
						field1381 = arg0.method46();
					} else if (var3 == 69) {
						field1411 = arg0.method44();
					} else if (var3 == 70) {
						field1382 = arg0.method47();
					} else if (var3 == 71) {
						field1414 = arg0.method47();
					} else if (var3 == 72) {
						field1398 = arg0.method47();
					} else if (var3 == 73) {
						field1423 = true;
					} else if (var3 == 74) {
						field1401 = true;
					} else if (var3 == 75) {
						field1404 = arg0.method44();
					} else if (var3 == 77) {
						field1390 = arg0.method46();
						if (field1390 == 0xFFFF) {
							field1390 = -1;
						}

						field1409 = arg0.method46();
						if (field1409 == 0xFFFF) {
							field1409 = -1;
						}

						int var10 = arg0.method44();
						field1412 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1412[var11] = arg0.method46();
							if (field1412[var11] == 0xFFFF) {
								field1412[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method44();
			} while (var4 <= 0);

			if (field1377 == null || field1421) {
				field1388 = new int[var4];
				field1377 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1377[var5] = arg0.method46();
					field1388[var5] = arg0.method44();
				}
			} else {
				arg0.field92 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("VCGOMUBN.a(I)LVCGOMUBN;")
	public static final VCGOMUBN method568(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1408[var1].field1413 == arg0) {
				return field1408[var1];
			}
		}

		field1402 = (field1402 + 1) % 20;
		VCGOMUBN var2 = field1408[field1402];
		field1400.field92 = field1415[arg0];
		var2.field1413 = arg0;
		var2.method565();
		var2.method567(field1400);
		return var2;
	}

	@ObfuscatedName("VCGOMUBN.a(IIIIIII)LGFYXEFQY;")
	public final GFYXEFQY method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		GFYXEFQY var8 = method575(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1380 || field1407) {
			var8 = new GFYXEFQY(field1407, field1380, var8);
		}

		if (field1380) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field753; var10++) {
				int var11 = var8.field754[var10];
				int var12 = var8.field756[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field755[var10] += var15 - var9;
			}

			var8.method346();
		}

		return var8;
	}

	@ObfuscatedName("VCGOMUBN.b(I)V")
	public static final void method570() {
		field1394 = null;
		field1405 = null;
		field1415 = null;
		field1408 = null;
		field1400 = null;
	}

	@ObfuscatedName("VCGOMUBN.a(LEEDCHWRL;I)V")
	public final void method571(EEDCHWRL arg0) {
		if (field1377 != null) {
			for (int var2 = 0; var2 < field1377.length; var2++) {
				arg0.method277(0, field1377[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("VCGOMUBN.c(I)Z")
	public final boolean method572() {
		if (field1377 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1377.length; var2++) {
			var1 &= GFYXEFQY.method342(field1377[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("VCGOMUBN.d(I)LVCGOMUBN;")
	public final VCGOMUBN method573() {
		int var1 = -1;
		if (field1390 != -1) {
			ZESTMKXA var2 = ZESTMKXA.field1479[field1390];
			int var3 = var2.field1481;
			int var4 = var2.field1482;
			int var5 = var2.field1483;
			int var6 = client.field174[var5 - var4];
			var1 = field1395.field336[var3] >> var4 & var6;
		} else if (field1409 != -1) {
			var1 = field1395.field336[field1409];
		}

		if (var1 >= 0 && var1 < field1412.length && field1412[var1] != -1) {
			return method568(field1412[var1]);
		}

		return null;
	}

	@ObfuscatedName("VCGOMUBN.a(LEAXVDNXA;)V")
	public static final void method574(EAXVDNXA arg0) {
		field1400 = new CKBTFRZM(arg0.method255("loc.dat", null));
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("loc.idx", null));
		field1386 = var1.method46();
		field1415 = new int[field1386];
		int var2 = 2;
		for (int var3 = 0; var3 < field1386; var3++) {
			field1415[var3] = var2;
			var2 += var1.method46();
		}

		field1408 = new VCGOMUBN[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1408[var4] = new VCGOMUBN();
		}
	}

	@ObfuscatedName("VCGOMUBN.a(IIZI)LGFYXEFQY;")
	public final GFYXEFQY method575(int arg0, int arg1, int arg2) {
		GFYXEFQY var4 = null;
		long var5;
		if (field1388 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1413 << 6) + arg1);
			GFYXEFQY var7 = (GFYXEFQY) field1405.method1(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1377 == null) {
				return null;
			}

			boolean var8 = field1422 ^ arg1 > 3;
			int var9 = field1377.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1377[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (GFYXEFQY) field1394.method1(var11);
				if (var4 == null) {
					var4 = GFYXEFQY.method341(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method356();
					}

					field1394.method2(var11, var4);
				}

				if (var9 > 1) {
					field1410[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new GFYXEFQY(field1410, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1388.length; var13++) {
				if (field1388[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1413 << 6) + (var12 << 3) + arg1);
			GFYXEFQY var14 = (GFYXEFQY) field1405.method1(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1377[var12];
			boolean var16 = field1422 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (GFYXEFQY) field1394.method1(var15);
			if (var4 == null) {
				var4 = GFYXEFQY.method341(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method356();
				}

				field1394.method2(var15, var4);
			}
		}

		boolean var17;
		if (field1387 == 128 && field1418 == 128 && field1399 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1382 == 0 && field1414 == 0 && field1398 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		GFYXEFQY var19 = new GFYXEFQY(ERVJQNCY.method282(arg2), var4, field1378 == null, arg1 == 0 && arg2 == -1 && !var17 && !var18);
		if (arg2 != -1) {
			var19.method348();
			var19.method349(arg2);
			var19.field785 = null;
			var19.field784 = null;
		}

		while (arg1-- > 0) {
			var19.method352();
		}

		if (field1378 != null) {
			for (int var20 = 0; var20 < field1378.length; var20++) {
				var19.method355(field1378[var20], field1397[var20]);
			}
		}

		if (var17) {
			var19.method357(field1399, field1387, field1418);
		}

		if (var18) {
			var19.method354(field1382, field1414, field1398);
		}

		var19.method358(field1379 + 64, field1393 * 5 + 768, -50, -10, -50, !field1407);

		if (field1404 == 1) {
			var19.field781 = var19.field739;
		}

		field1405.method2(var5, var19);
		return var19;
	}
}
