package deob;

@ObfuscatedName("WEJSKHXC")
public final class WEJSKHXC {

	@ObfuscatedName("WEJSKHXC.e")
	public int field1377 = -1;

	@ObfuscatedName("WEJSKHXC.p")
	public String field1388 = "null";

	@ObfuscatedName("WEJSKHXC.E")
	public static UNPPHFRC field1401 = new UNPPHFRC(500);

	@ObfuscatedName("WEJSKHXC.H")
	public static UNPPHFRC field1403 = new UNPPHFRC(40);

	@ObfuscatedName("WEJSKHXC.Z")
	public static OJGAHFXC[] field1419 = new OJGAHFXC[4];

	@ObfuscatedName("WEJSKHXC.h")
	public byte field1380;

	@ObfuscatedName("WEJSKHXC.F")
	public byte field1402;

	@ObfuscatedName("WEJSKHXC.d")
	public static int field1376;

	@ObfuscatedName("WEJSKHXC.k")
	public int field1383;

	@ObfuscatedName("WEJSKHXC.l")
	public int field1384;

	@ObfuscatedName("WEJSKHXC.o")
	public int field1387;

	@ObfuscatedName("WEJSKHXC.s")
	public int field1390;

	@ObfuscatedName("WEJSKHXC.v")
	public int field1392;

	@ObfuscatedName("WEJSKHXC.w")
	public int field1393;

	@ObfuscatedName("WEJSKHXC.y")
	public static int field1395;

	@ObfuscatedName("WEJSKHXC.z")
	public int field1396;

	@ObfuscatedName("WEJSKHXC.B")
	public int field1398;

	@ObfuscatedName("WEJSKHXC.C")
	public int field1399;

	@ObfuscatedName("WEJSKHXC.J")
	public int field1405;

	@ObfuscatedName("WEJSKHXC.L")
	public int field1407;

	@ObfuscatedName("WEJSKHXC.M")
	public int field1408;

	@ObfuscatedName("WEJSKHXC.N")
	public int field1409;

	@ObfuscatedName("WEJSKHXC.S")
	public int field1413;

	@ObfuscatedName("WEJSKHXC.T")
	public int field1414;

	@ObfuscatedName("WEJSKHXC.U")
	public int field1415;

	@ObfuscatedName("WEJSKHXC.a")
	public static EYMNCFMK field1373;

	@ObfuscatedName("WEJSKHXC.K")
	public static client field1406;

	@ObfuscatedName("WEJSKHXC.b")
	public boolean field1374;

	@ObfuscatedName("WEJSKHXC.c")
	public static boolean field1375;

	@ObfuscatedName("WEJSKHXC.f")
	public boolean field1378;

	@ObfuscatedName("WEJSKHXC.j")
	public boolean field1382;

	@ObfuscatedName("WEJSKHXC.n")
	public boolean field1386;

	@ObfuscatedName("WEJSKHXC.u")
	public boolean field1391;

	@ObfuscatedName("WEJSKHXC.A")
	public boolean field1397;

	@ObfuscatedName("WEJSKHXC.O")
	public boolean field1410;

	@ObfuscatedName("WEJSKHXC.Q")
	public boolean field1411;

	@ObfuscatedName("WEJSKHXC.W")
	public boolean field1417;

	@ObfuscatedName("WEJSKHXC.X")
	public boolean field1418;

	@ObfuscatedName("WEJSKHXC.D")
	public byte[] field1400;

	@ObfuscatedName("WEJSKHXC.g")
	public int[] field1379;

	@ObfuscatedName("WEJSKHXC.i")
	public static int[] field1381;

	@ObfuscatedName("WEJSKHXC.q")
	public int[] field1389;

	@ObfuscatedName("WEJSKHXC.x")
	public int[] field1394;

	@ObfuscatedName("WEJSKHXC.I")
	public int[] field1404;

	@ObfuscatedName("WEJSKHXC.R")
	public int[] field1412;

	@ObfuscatedName("WEJSKHXC.m")
	public static WEJSKHXC[] field1385;

	@ObfuscatedName("WEJSKHXC.V")
	public String[] field1416;

	@ObfuscatedName("WEJSKHXC.a(I)LWEJSKHXC;")
	public static final WEJSKHXC method548(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1385[var1].field1377 == arg0) {
				return field1385[var1];
			}
		}

		field1376 = (field1376 + 1) % 20;
		WEJSKHXC var2 = field1385[field1376];
		field1373.field679 = field1381[arg0];
		var2.field1377 = arg0;
		var2.method558();
		var2.method551(field1373);
		return var2;
	}

	@ObfuscatedName("WEJSKHXC.a(IIIIIII)LOJGAHFXC;")
	public final OJGAHFXC method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		OJGAHFXC var8 = method554(arg6, arg0, arg1);
		if (var8 == null) {
			return null;
		}

		if (field1417 || field1386) {
			var8 = new OJGAHFXC(field1386, var8, field1417);
		}

		if (field1417) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1018; var10++) {
				int var11 = var8.field1019[var10];
				int var12 = var8.field1021[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1020[var10] += var15 - var9;
			}

			var8.method418();
		}

		return var8;
	}

	@ObfuscatedName("WEJSKHXC.a(ILXQFIPMSR;)V")
	public final void method550(XQFIPMSR arg0) {
		if (field1412 != null) {
			for (int var2 = 0; var2 < field1412.length; var2++) {
				arg0.method566(field1412[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("WEJSKHXC.a(BLEYMNCFMK;)V")
	public final void method551(EYMNCFMK arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method239();
					if (var3 == 0) {
						if (var2 == -1) {
							field1397 = false;
							if (field1412 != null && (field1394 == null || field1394[0] == 10)) {
								field1397 = true;
							}

							if (field1416 != null) {
								field1397 = true;
							}
						}

						if (field1374) {
							field1411 = false;
							field1418 = false;
						}

						if (field1413 == -1) {
							field1413 = field1411 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1388 = arg0.method246();
					} else if (var3 == 3) {
						field1400 = arg0.method247();
					} else if (var3 == 5) {
						int var6 = arg0.method239();
						if (var6 > 0) {
							if (field1412 == null || field1375) {
								field1394 = null;
								field1412 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1412[var7] = arg0.method241();
								}
							} else {
								arg0.field679 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1399 = arg0.method239();
					} else if (var3 == 15) {
						field1408 = arg0.method239();
					} else if (var3 == 17) {
						field1411 = false;
					} else if (var3 == 18) {
						field1418 = false;
					} else if (var3 == 19) {
						var2 = arg0.method239();
						if (var2 == 1) {
							field1397 = true;
						}
					} else if (var3 == 21) {
						field1417 = true;
					} else if (var3 == 22) {
						field1386 = true;
					} else if (var3 == 23) {
						field1378 = true;
					} else if (var3 == 24) {
						field1405 = arg0.method241();
						if (field1405 == 0xFFFF) {
							field1405 = -1;
						}
					} else if (var3 == 28) {
						field1383 = arg0.method239();
					} else if (var3 == 29) {
						field1402 = arg0.method240();
					} else if (var3 == 39) {
						field1380 = arg0.method240();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1416 == null) {
							field1416 = new String[5];
						}

						field1416[var3 - 30] = arg0.method246();
						if (field1416[var3 - 30].equalsIgnoreCase("hidden")) {
							field1416[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method239();
						field1404 = new int[var8];
						field1379 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1404[var9] = arg0.method241();
							field1379[var9] = arg0.method241();
						}
					} else if (var3 == 60) {
						field1387 = arg0.method241();
					} else if (var3 == 62) {
						field1391 = true;
					} else if (var3 == 64) {
						field1382 = false;
					} else if (var3 == 65) {
						field1414 = arg0.method241();
					} else if (var3 == 66) {
						field1392 = arg0.method241();
					} else if (var3 == 67) {
						field1393 = arg0.method241();
					} else if (var3 == 68) {
						field1390 = arg0.method241();
					} else if (var3 == 69) {
						field1396 = arg0.method239();
					} else if (var3 == 70) {
						field1415 = arg0.method242();
					} else if (var3 == 71) {
						field1398 = arg0.method242();
					} else if (var3 == 72) {
						field1384 = arg0.method242();
					} else if (var3 == 73) {
						field1410 = true;
					} else if (var3 == 74) {
						field1374 = true;
					} else if (var3 == 75) {
						field1413 = arg0.method239();
					} else if (var3 == 77) {
						field1409 = arg0.method241();
						if (field1409 == 0xFFFF) {
							field1409 = -1;
						}

						field1407 = arg0.method241();
						if (field1407 == 0xFFFF) {
							field1407 = -1;
						}

						int var10 = arg0.method239();
						field1389 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1389[var11] = arg0.method241();
							if (field1389[var11] == 0xFFFF) {
								field1389[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method239();
			} while (var4 <= 0);

			if (field1412 == null || field1375) {
				field1394 = new int[var4];
				field1412 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1412[var5] = arg0.method241();
					field1394[var5] = arg0.method239();
				}
			} else {
				arg0.field679 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("WEJSKHXC.a(B)LWEJSKHXC;")
	public final WEJSKHXC method552() {
		int var1 = -1;
		if (field1409 != -1) {
			BVXCTZVJ var2 = BVXCTZVJ.field109[field1409];
			int var3 = var2.field111;
			int var4 = var2.field112;
			int var5 = var2.field113;
			int var6 = client.field131[var5 - var4];
			var1 = field1406.field307[var3] >> var4 & var6;
		} else if (field1407 != -1) {
			var1 = field1406.field307[field1407];
		}

		if (var1 >= 0 && var1 < field1389.length && field1389[var1] != -1) {
			return method548(field1389[var1]);
		}

		return null;
	}

	@ObfuscatedName("WEJSKHXC.a(II)Z")
	public final boolean method553(int arg0) {
		if (field1394 != null) {
			for (int var4 = 0; var4 < field1394.length; var4++) {
				if (field1394[var4] == arg0) {
					return OJGAHFXC.method414(field1412[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1412 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1412.length; var3++) {
				var2 &= OJGAHFXC.method414(field1412[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("WEJSKHXC.a(IIII)LOJGAHFXC;")
	public final OJGAHFXC method554(int arg0, int arg1, int arg2) {
		OJGAHFXC var4 = null;
		long var5;
		if (field1394 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1377 << 6) + arg2);
			OJGAHFXC var7 = (OJGAHFXC) field1403.method531(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1412 == null) {
				return null;
			}

			boolean var8 = field1391 ^ arg2 > 3;
			int var9 = field1412.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1412[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (OJGAHFXC) field1401.method531(var11);
				if (var4 == null) {
					var4 = OJGAHFXC.method413(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method428();
					}

					field1401.method532(var11, var4);
				}

				if (var9 > 1) {
					field1419[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new OJGAHFXC(var9, field1419);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1394.length; var13++) {
				if (field1394[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1377 << 6) + (var12 << 3) + arg2);
			OJGAHFXC var14 = (OJGAHFXC) field1403.method531(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1412[var12];
			boolean var16 = field1391 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (OJGAHFXC) field1401.method531(var15);
			if (var4 == null) {
				var4 = OJGAHFXC.method413(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method428();
				}

				field1401.method532(var15, var4);
			}
		}

		boolean var17;
		if (field1414 == 128 && field1392 == 128 && field1393 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1415 == 0 && field1398 == 0 && field1384 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		OJGAHFXC var19 = new OJGAHFXC(MOOJSKCU.method395(arg0), arg2 == 0 && arg0 == -1 && !var17 && !var18, field1404 == null, var4);
		if (arg0 != -1) {
			var19.method420();
			var19.method421(arg0);
			var19.field1049 = null;
			var19.field1048 = null;
		}

		while (arg2-- > 0) {
			var19.method424();
		}

		if (field1404 != null) {
			for (int var20 = 0; var20 < field1404.length; var20++) {
				var19.method427(field1404[var20], field1379[var20]);
			}
		}

		if (var17) {
			var19.method429(field1393, field1392, field1414);
		}

		if (var18) {
			var19.method426(field1398, field1384, field1415);
		}

		var19.method430(field1402 + 64, field1380 * 5 + 768, -50, -10, -50, !field1386);

		if (field1413 == 1) {
			var19.field1045 = var19.field1265;
		}

		field1403.method532(var5, var19);
		return var19;
	}

	@ObfuscatedName("WEJSKHXC.b(I)Z")
	public final boolean method555() {
		if (field1412 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1412.length; var2++) {
			var1 &= OJGAHFXC.method414(field1412[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("WEJSKHXC.a(LHBJEXSJX;)V")
	public static final void method556(HBJEXSJX arg0) {
		field1373 = new EYMNCFMK(arg0.method348("loc.dat", null));
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("loc.idx", null));
		field1395 = var1.method241();
		field1381 = new int[field1395];
		int var2 = 2;
		for (int var3 = 0; var3 < field1395; var3++) {
			field1381[var3] = var2;
			var2 += var1.method241();
		}

		field1385 = new WEJSKHXC[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1385[var4] = new WEJSKHXC();
		}
	}

	@ObfuscatedName("WEJSKHXC.c(I)V")
	public static final void method557() {
		field1401 = null;
		field1403 = null;
		field1381 = null;
		field1385 = null;
		field1373 = null;
	}

	@ObfuscatedName("WEJSKHXC.a()V")
	public final void method558() {
		field1412 = null;
		field1394 = null;
		field1388 = "null";
		field1400 = null;
		field1404 = null;
		field1379 = null;
		field1399 = 1;
		field1408 = 1;
		field1411 = true;
		field1418 = true;
		field1397 = false;
		field1417 = false;
		field1386 = false;
		field1378 = false;
		field1405 = -1;
		field1383 = 16;
		field1402 = 0;
		field1380 = 0;
		field1416 = null;
		field1387 = -1;
		field1390 = -1;
		field1391 = false;
		field1382 = true;
		field1414 = 128;
		field1392 = 128;
		field1393 = 128;
		field1396 = 0;
		field1415 = 0;
		field1398 = 0;
		field1384 = 0;
		field1410 = false;
		field1374 = false;
		field1413 = -1;
		field1409 = -1;
		field1407 = -1;
		field1389 = null;
	}
}
