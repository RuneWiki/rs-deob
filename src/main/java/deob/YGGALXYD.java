package deob;

@ObfuscatedName("YGGALXYD")
public final class YGGALXYD {

	@ObfuscatedName("YGGALXYD.b")
	public int field1361 = -1;

	@ObfuscatedName("YGGALXYD.d")
	public boolean field1363 = false;

	@ObfuscatedName("YGGALXYD.g")
	public int field1365 = -1;

	@ObfuscatedName("YGGALXYD.i")
	public long field1367 = -1L;

	@ObfuscatedName("YGGALXYD.j")
	public int field1368 = -1;

	@ObfuscatedName("YGGALXYD.m")
	public int field1371 = -1;

	@ObfuscatedName("YGGALXYD.o")
	public int field1373 = -1;

	@ObfuscatedName("YGGALXYD.p")
	public boolean field1374 = true;

	@ObfuscatedName("YGGALXYD.t")
	public int field1378 = -1;

	@ObfuscatedName("YGGALXYD.u")
	public int field1379 = 128;

	@ObfuscatedName("YGGALXYD.v")
	public int field1380 = -1;

	@ObfuscatedName("YGGALXYD.w")
	public int field1381 = -1;

	@ObfuscatedName("YGGALXYD.z")
	public boolean field1384 = true;

	@ObfuscatedName("YGGALXYD.A")
	public int field1385 = -1;

	@ObfuscatedName("YGGALXYD.B")
	public int field1386 = 128;

	@ObfuscatedName("YGGALXYD.G")
	public int field1391 = -1;

	@ObfuscatedName("YGGALXYD.H")
	public byte field1392 = 1;

	@ObfuscatedName("YGGALXYD.J")
	public int field1394 = -1;

	@ObfuscatedName("YGGALXYD.K")
	public int field1395 = 32;

	@ObfuscatedName("YGGALXYD.L")
	public int field1396 = -1;

	@ObfuscatedName("YGGALXYD.r")
	public static THJKANXW field1376 = new THJKANXW(30);

	@ObfuscatedName("YGGALXYD.k")
	public int field1369;

	@ObfuscatedName("YGGALXYD.l")
	public static int field1370;

	@ObfuscatedName("YGGALXYD.D")
	public static int field1388;

	@ObfuscatedName("YGGALXYD.F")
	public int field1390;

	@ObfuscatedName("YGGALXYD.I")
	public static LBBVYYXO field1393;

	@ObfuscatedName("YGGALXYD.y")
	public static client field1383;

	@ObfuscatedName("YGGALXYD.s")
	public String field1377;

	@ObfuscatedName("YGGALXYD.C")
	public byte[] field1387;

	@ObfuscatedName("YGGALXYD.a")
	public int[] field1360;

	@ObfuscatedName("YGGALXYD.f")
	public int[] field1364;

	@ObfuscatedName("YGGALXYD.h")
	public static int[] field1366;

	@ObfuscatedName("YGGALXYD.q")
	public int[] field1375;

	@ObfuscatedName("YGGALXYD.x")
	public int[] field1382;

	@ObfuscatedName("YGGALXYD.E")
	public int[] field1389;

	@ObfuscatedName("YGGALXYD.c")
	public static YGGALXYD[] field1362;

	@ObfuscatedName("YGGALXYD.n")
	public String[] field1372;

	@ObfuscatedName("YGGALXYD.a(IBI[I)LCYPZUKMB;")
	public final CYPZUKMB method569(int arg0, int arg1, int[] arg2) {
		if (field1382 != null) {
			YGGALXYD var4 = method572();
			if (var4 == null) {
				return null;
			}

			return var4.method569(arg0, arg1, arg2);
		}

		CYPZUKMB var5 = (CYPZUKMB) field1376.method529(field1367);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1360.length; var7++) {
				if (!CYPZUKMB.method197(field1360[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			CYPZUKMB[] var8 = new CYPZUKMB[field1360.length];
			for (int var9 = 0; var9 < field1360.length; var9++) {
				var8[var9] = CYPZUKMB.method196(field1360[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new CYPZUKMB(var8, var8.length);
			}

			if (field1389 != null) {
				for (int var10 = 0; var10 < field1389.length; var10++) {
					var5.method210(field1389[var10], field1364[var10]);
				}
			}

			var5.method203();
			var5.method213(field1369 + 64, field1390 + 850, -30, -50, -30, true);
			field1376.method530(field1367, var5);
		}

		CYPZUKMB var11 = CYPZUKMB.field538;
		var11.method198(QGRLAQIF.method469(arg1) & QGRLAQIF.method469(arg0), var5);

		if (arg1 != -1 && arg0 != -1) {
			var11.method205(arg1, arg0, arg2);
		} else if (arg1 != -1) {
			var11.method204(arg1);
		}

		if (field1379 != 128 || field1386 != 128) {
			var11.method212(field1379, field1386, field1379);
		}

		var11.method200();
		var11.field574 = null;
		var11.field573 = null;

		if (field1392 == 1) {
			var11.field575 = true;
		}

		return var11;
	}

	@ObfuscatedName("YGGALXYD.a(LLBBVYYXO;B)V")
	public final void method570(LBBVYYXO arg0) {
		while (true) {
			int var2 = arg0.method369();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method369();
				field1360 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1360[var4] = arg0.method371();
				}
			} else if (var2 == 2) {
				field1377 = arg0.method376();
			} else if (var2 == 3) {
				field1387 = arg0.method377();
			} else if (var2 == 12) {
				field1392 = arg0.method370();
			} else if (var2 == 13) {
				field1385 = arg0.method371();
			} else if (var2 == 14) {
				field1394 = arg0.method371();
			} else if (var2 == 17) {
				field1394 = arg0.method371();
				field1361 = arg0.method371();
				field1373 = arg0.method371();
				field1391 = arg0.method371();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1372 == null) {
					field1372 = new String[5];
				}

				field1372[var2 - 30] = arg0.method376();
				if (field1372[var2 - 30].equalsIgnoreCase("hidden")) {
					field1372[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method369();
				field1389 = new int[var5];
				field1364 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1389[var6] = arg0.method371();
					field1364[var6] = arg0.method371();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method369();
				field1375 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1375[var8] = arg0.method371();
				}
			} else if (var2 == 90) {
				field1396 = arg0.method371();
			} else if (var2 == 91) {
				field1378 = arg0.method371();
			} else if (var2 == 92) {
				field1368 = arg0.method371();
			} else if (var2 == 93) {
				field1384 = false;
			} else if (var2 == 95) {
				field1371 = arg0.method371();
			} else if (var2 == 97) {
				field1379 = arg0.method371();
			} else if (var2 == 98) {
				field1386 = arg0.method371();
			} else if (var2 == 99) {
				field1363 = true;
			} else if (var2 == 100) {
				field1369 = arg0.method370();
			} else if (var2 == 101) {
				field1390 = arg0.method370() * 5;
			} else if (var2 == 102) {
				field1365 = arg0.method371();
			} else if (var2 == 103) {
				field1395 = arg0.method371();
			} else if (var2 == 106) {
				field1380 = arg0.method371();
				if (field1380 == 0xFFFF) {
					field1380 = -1;
				}

				field1381 = arg0.method371();
				if (field1381 == 0xFFFF) {
					field1381 = -1;
				}

				int var9 = arg0.method369();
				field1382 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1382[var10] = arg0.method371();
					if (field1382[var10] == 0xFFFF) {
						field1382[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1374 = false;
			}
		}
	}

	@ObfuscatedName("YGGALXYD.a(I)LCYPZUKMB;")
	public final CYPZUKMB method571() {
		if (field1382 != null) {
			YGGALXYD var1 = method572();
			if (var1 == null) {
				return null;
			}

			return var1.method571();
		} else if (field1375 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1375.length; var3++) {
				if (!CYPZUKMB.method197(field1375[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			CYPZUKMB[] var4 = new CYPZUKMB[field1375.length];
			for (int var5 = 0; var5 < field1375.length; var5++) {
				var4[var5] = CYPZUKMB.method196(field1375[var5]);
			}

			CYPZUKMB var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new CYPZUKMB(var4, var4.length);
			}

			if (field1389 != null) {
				for (int var7 = 0; var7 < field1389.length; var7++) {
					var6.method210(field1389[var7], field1364[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("YGGALXYD.b(I)LYGGALXYD;")
	public final YGGALXYD method572() {
		int var1 = -1;
		if (field1380 != -1) {
			GJIMXWNM var2 = GJIMXWNM.field832[field1380];
			int var3 = var2.field834;
			int var4 = var2.field835;
			int var5 = var2.field836;
			int var6 = client.field485[var5 - var4];
			var1 = field1383.field316[var3] >> var4 & var6;
		} else if (field1381 != -1) {
			var1 = field1383.field316[field1381];
		}

		if (var1 >= 0 && var1 < field1382.length && field1382[var1] != -1) {
			return method575(field1382[var1]);
		}

		return null;
	}

	@ObfuscatedName("YGGALXYD.a(Z)V")
	public static final void method573() {
		field1376 = null;
		field1366 = null;
		field1362 = null;
		field1393 = null;
	}

	@ObfuscatedName("YGGALXYD.a(B)Z")
	public boolean method574() {
		if (field1382 == null) {
			return true;
		}

		int var1 = -1;
		if (field1380 != -1) {
			GJIMXWNM var2 = GJIMXWNM.field832[field1380];
			int var3 = var2.field834;
			int var4 = var2.field835;
			int var5 = var2.field836;
			int var6 = client.field485[var5 - var4];
			var1 = field1383.field316[var3] >> var4 & var6;
		} else if (field1381 != -1) {
			var1 = field1383.field316[field1381];
		}

		if (var1 >= 0 && var1 < field1382.length && field1382[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("YGGALXYD.c(I)LYGGALXYD;")
	public static final YGGALXYD method575(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1362[var1].field1367) {
				return field1362[var1];
			}
		}

		field1388 = (field1388 + 1) % 20;
		YGGALXYD var2 = field1362[field1388] = new YGGALXYD();
		field1393.field882 = field1366[arg0];
		var2.field1367 = arg0;
		var2.method570(field1393);
		return var2;
	}

	@ObfuscatedName("YGGALXYD.a(LFUZJMGZB;)V")
	public static final void method576(FUZJMGZB arg0) {
		field1393 = new LBBVYYXO(arg0.method277("npc.dat", null));
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("npc.idx", null));
		field1370 = var1.method371();
		field1366 = new int[field1370];
		int var2 = 2;
		for (int var3 = 0; var3 < field1370; var3++) {
			field1366[var3] = var2;
			var2 += var1.method371();
		}

		field1362 = new YGGALXYD[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1362[var4] = new YGGALXYD();
		}
	}
}
