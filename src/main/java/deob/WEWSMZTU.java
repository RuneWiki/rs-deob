package deob;

@ObfuscatedName("WEWSMZTU")
public final class WEWSMZTU {

	@ObfuscatedName("WEWSMZTU.q")
	public int field1353 = -1;

	@ObfuscatedName("WEWSMZTU.X")
	public String field1382 = "null";

	@ObfuscatedName("WEWSMZTU.l")
	public static KDWDYCIL[] field1348 = new KDWDYCIL[4];

	@ObfuscatedName("WEWSMZTU.u")
	public static JGECYJMS field1355 = new JGECYJMS(40);

	@ObfuscatedName("WEWSMZTU.V")
	public static JGECYJMS field1380 = new JGECYJMS(500);

	@ObfuscatedName("WEWSMZTU.D")
	public byte field1363;

	@ObfuscatedName("WEWSMZTU.H")
	public byte field1367;

	@ObfuscatedName("WEWSMZTU.b")
	public static int field1339;

	@ObfuscatedName("WEWSMZTU.c")
	public int field1340;

	@ObfuscatedName("WEWSMZTU.d")
	public int field1341;

	@ObfuscatedName("WEWSMZTU.h")
	public int field1345;

	@ObfuscatedName("WEWSMZTU.i")
	public int field1346;

	@ObfuscatedName("WEWSMZTU.m")
	public int field1349;

	@ObfuscatedName("WEWSMZTU.n")
	public int field1350;

	@ObfuscatedName("WEWSMZTU.o")
	public int field1351;

	@ObfuscatedName("WEWSMZTU.p")
	public int field1352;

	@ObfuscatedName("WEWSMZTU.v")
	public int field1356;

	@ObfuscatedName("WEWSMZTU.B")
	public int field1361;

	@ObfuscatedName("WEWSMZTU.C")
	public int field1362;

	@ObfuscatedName("WEWSMZTU.F")
	public int field1365;

	@ObfuscatedName("WEWSMZTU.G")
	public int field1366;

	@ObfuscatedName("WEWSMZTU.L")
	public int field1371;

	@ObfuscatedName("WEWSMZTU.N")
	public int field1373;

	@ObfuscatedName("WEWSMZTU.U")
	public static int field1379;

	@ObfuscatedName("WEWSMZTU.Z")
	public int field1384;

	@ObfuscatedName("WEWSMZTU.K")
	public static TQYMAXSO field1370;

	@ObfuscatedName("WEWSMZTU.I")
	public static client field1368;

	@ObfuscatedName("WEWSMZTU.a")
	public boolean field1338;

	@ObfuscatedName("WEWSMZTU.e")
	public boolean field1342;

	@ObfuscatedName("WEWSMZTU.f")
	public boolean field1343;

	@ObfuscatedName("WEWSMZTU.w")
	public boolean field1357;

	@ObfuscatedName("WEWSMZTU.x")
	public boolean field1358;

	@ObfuscatedName("WEWSMZTU.A")
	public boolean field1360;

	@ObfuscatedName("WEWSMZTU.J")
	public boolean field1369;

	@ObfuscatedName("WEWSMZTU.P")
	public boolean field1375;

	@ObfuscatedName("WEWSMZTU.T")
	public boolean field1378;

	@ObfuscatedName("WEWSMZTU.W")
	public static boolean field1381;

	@ObfuscatedName("WEWSMZTU.Y")
	public boolean field1383;

	@ObfuscatedName("WEWSMZTU.E")
	public byte[] field1364;

	@ObfuscatedName("WEWSMZTU.g")
	public int[] field1344;

	@ObfuscatedName("WEWSMZTU.t")
	public int[] field1354;

	@ObfuscatedName("WEWSMZTU.z")
	public int[] field1359;

	@ObfuscatedName("WEWSMZTU.O")
	public int[] field1374;

	@ObfuscatedName("WEWSMZTU.Q")
	public static int[] field1376;

	@ObfuscatedName("WEWSMZTU.S")
	public int[] field1377;

	@ObfuscatedName("WEWSMZTU.k")
	public static WEWSMZTU[] field1347;

	@ObfuscatedName("WEWSMZTU.M")
	public String[] field1372;

	@ObfuscatedName("WEWSMZTU.a(II)Z")
	public final boolean method550(int arg0) {
		if (field1374 != null) {
			for (int var4 = 0; var4 < field1374.length; var4++) {
				if (field1374[var4] == arg0) {
					return KDWDYCIL.method247(field1344[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1344 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1344.length; var3++) {
				var2 &= KDWDYCIL.method247(field1344[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("WEWSMZTU.a(ILTQYMAXSO;)V")
	public final void method551(TQYMAXSO arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method468();
					if (var3 == 0) {
						if (var2 == -1) {
							field1378 = false;
							if (field1344 != null && (field1374 == null || field1374[0] == 10)) {
								field1378 = true;
							}

							if (field1372 != null) {
								field1378 = true;
							}
						}

						if (field1357) {
							field1343 = false;
							field1383 = false;
						}

						if (field1340 == -1) {
							field1340 = field1343 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1382 = arg0.method475();
					} else if (var3 == 3) {
						field1364 = arg0.method476();
					} else if (var3 == 5) {
						int var6 = arg0.method468();
						if (var6 > 0) {
							if (field1344 == null || field1381) {
								field1374 = null;
								field1344 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1344[var7] = arg0.method470();
								}
							} else {
								arg0.field1263 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1349 = arg0.method468();
					} else if (var3 == 15) {
						field1384 = arg0.method468();
					} else if (var3 == 17) {
						field1343 = false;
					} else if (var3 == 18) {
						field1383 = false;
					} else if (var3 == 19) {
						var2 = arg0.method468();
						if (var2 == 1) {
							field1378 = true;
						}
					} else if (var3 == 21) {
						field1342 = true;
					} else if (var3 == 22) {
						field1369 = true;
					} else if (var3 == 23) {
						field1360 = true;
					} else if (var3 == 24) {
						field1362 = arg0.method470();
						if (field1362 == 0xFFFF) {
							field1362 = -1;
						}
					} else if (var3 == 28) {
						field1350 = arg0.method468();
					} else if (var3 == 29) {
						field1367 = arg0.method469();
					} else if (var3 == 39) {
						field1363 = arg0.method469();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1372 == null) {
							field1372 = new String[5];
						}

						field1372[var3 - 30] = arg0.method475();
						if (field1372[var3 - 30].equalsIgnoreCase("hidden")) {
							field1372[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method468();
						field1377 = new int[var8];
						field1359 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1377[var9] = arg0.method470();
							field1359[var9] = arg0.method470();
						}
					} else if (var3 == 60) {
						field1373 = arg0.method470();
					} else if (var3 == 62) {
						field1338 = true;
					} else if (var3 == 64) {
						field1375 = false;
					} else if (var3 == 65) {
						field1365 = arg0.method470();
					} else if (var3 == 66) {
						field1345 = arg0.method470();
					} else if (var3 == 67) {
						field1341 = arg0.method470();
					} else if (var3 == 68) {
						field1352 = arg0.method470();
					} else if (var3 == 69) {
						field1346 = arg0.method468();
					} else if (var3 == 70) {
						field1366 = arg0.method471();
					} else if (var3 == 71) {
						field1371 = arg0.method471();
					} else if (var3 == 72) {
						field1361 = arg0.method471();
					} else if (var3 == 73) {
						field1358 = true;
					} else if (var3 == 74) {
						field1357 = true;
					} else if (var3 == 75) {
						field1340 = arg0.method468();
					} else if (var3 == 77) {
						field1356 = arg0.method470();
						if (field1356 == 0xFFFF) {
							field1356 = -1;
						}

						field1351 = arg0.method470();
						if (field1351 == 0xFFFF) {
							field1351 = -1;
						}

						int var10 = arg0.method468();
						field1354 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1354[var11] = arg0.method470();
							if (field1354[var11] == 0xFFFF) {
								field1354[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method468();
			} while (var4 <= 0);

			if (field1344 == null || field1381) {
				field1374 = new int[var4];
				field1344 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1344[var5] = arg0.method470();
					field1374[var5] = arg0.method468();
				}
			} else {
				arg0.field1263 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("WEWSMZTU.a(LHJOZCGZH;Z)V")
	public final void method552(HJOZCGZH arg0) {
		if (field1344 != null) {
			for (int var2 = 0; var2 < field1344.length; var2++) {
				arg0.method203(field1344[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("WEWSMZTU.a()V")
	public final void method553() {
		field1344 = null;
		field1374 = null;
		field1382 = "null";
		field1364 = null;
		field1377 = null;
		field1359 = null;
		field1349 = 1;
		field1384 = 1;
		field1343 = true;
		field1383 = true;
		field1378 = false;
		field1342 = false;
		field1369 = false;
		field1360 = false;
		field1362 = -1;
		field1350 = 16;
		field1367 = 0;
		field1363 = 0;
		field1372 = null;
		field1373 = -1;
		field1352 = -1;
		field1338 = false;
		field1375 = true;
		field1365 = 128;
		field1345 = 128;
		field1341 = 128;
		field1346 = 0;
		field1366 = 0;
		field1371 = 0;
		field1361 = 0;
		field1358 = false;
		field1357 = false;
		field1340 = -1;
		field1356 = -1;
		field1351 = -1;
		field1354 = null;
	}

	@ObfuscatedName("WEWSMZTU.a(Z)Z")
	public final boolean method554() {
		if (field1344 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1344.length; var2++) {
			var1 &= KDWDYCIL.method247(field1344[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("WEWSMZTU.a(I)LWEWSMZTU;")
	public static final WEWSMZTU method555(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1347[var1].field1353 == arg0) {
				return field1347[var1];
			}
		}

		field1379 = (field1379 + 1) % 20;
		WEWSMZTU var2 = field1347[field1379];
		field1370.field1263 = field1376[arg0];
		var2.field1353 = arg0;
		var2.method553();
		var2.method551(field1370);
		return var2;
	}

	@ObfuscatedName("WEWSMZTU.a(IIIIIII)LKDWDYCIL;")
	public final KDWDYCIL method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		KDWDYCIL var8 = method558(arg0, arg6, arg1);
		if (var8 == null) {
			return null;
		}

		if (field1342 || field1369) {
			var8 = new KDWDYCIL(var8, field1342, field1369);
		}

		if (field1342) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field766; var10++) {
				int var11 = var8.field767[var10];
				int var12 = var8.field769[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field768[var10] += var15 - var9;
			}

			var8.method251();
		}

		return var8;
	}

	@ObfuscatedName("WEWSMZTU.a(B)LWEWSMZTU;")
	public final WEWSMZTU method557() {
		int var1 = -1;
		if (field1356 != -1) {
			ATLVWFDY var2 = ATLVWFDY.field69[field1356];
			int var3 = var2.field71;
			int var4 = var2.field72;
			int var5 = var2.field73;
			int var6 = client.field271[var5 - var4];
			var1 = field1368.field341[var3] >> var4 & var6;
		} else if (field1351 != -1) {
			var1 = field1368.field341[field1351];
		}

		if (var1 >= 0 && var1 < field1354.length && field1354[var1] != -1) {
			return method555(field1354[var1]);
		}

		return null;
	}

	@ObfuscatedName("WEWSMZTU.a(IIIB)LKDWDYCIL;")
	public final KDWDYCIL method558(int arg0, int arg1, int arg2) {
		KDWDYCIL var4 = null;
		long var5;
		if (field1374 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1353 << 6) + arg2);
			KDWDYCIL var7 = (KDWDYCIL) field1355.method230(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1344 == null) {
				return null;
			}

			boolean var8 = field1338 ^ arg2 > 3;
			int var9 = field1344.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1344[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (KDWDYCIL) field1380.method230(var11);
				if (var4 == null) {
					var4 = KDWDYCIL.method246(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method261();
					}

					field1380.method231(var11, var4);
				}

				if (var9 > 1) {
					field1348[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new KDWDYCIL(field1348, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1374.length; var13++) {
				if (field1374[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1353 << 6) + (var12 << 3) + arg2);
			KDWDYCIL var14 = (KDWDYCIL) field1355.method230(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1344[var12];
			boolean var16 = field1338 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (KDWDYCIL) field1380.method230(var15);
			if (var4 == null) {
				var4 = KDWDYCIL.method246(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method261();
				}

				field1380.method231(var15, var4);
			}
		}

		boolean var17;
		if (field1365 == 128 && field1345 == 128 && field1341 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1366 == 0 && field1371 == 0 && field1361 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		KDWDYCIL var19 = new KDWDYCIL(arg2 == 0 && arg1 == -1 && !var17 && !var18, var4, SGSYCWFB.method423(arg1), field1377 == null);
		if (arg1 != -1) {
			var19.method253();
			var19.method254(arg1);
			var19.field797 = null;
			var19.field796 = null;
		}

		while (arg2-- > 0) {
			var19.method257();
		}

		if (field1377 != null) {
			for (int var20 = 0; var20 < field1377.length; var20++) {
				var19.method260(field1377[var20], field1359[var20]);
			}
		}

		if (var17) {
			var19.method262(field1365, field1341, field1345);
		}

		if (var18) {
			var19.method259(field1366, field1371, field1361);
		}

		var19.method263(field1367 + 64, field1363 * 5 + 768, -50, -10, -50, !field1369);

		if (field1340 == 1) {
			var19.field793 = var19.field666;
		}

		field1355.method231(var5, var19);
		return var19;
	}

	@ObfuscatedName("WEWSMZTU.a(LSXKKBWPU;)V")
	public static final void method559(SXKKBWPU arg0) {
		field1370 = new TQYMAXSO(arg0.method442("loc.dat", null));
		TQYMAXSO var1 = new TQYMAXSO(arg0.method442("loc.idx", null));
		field1339 = var1.method470();
		field1376 = new int[field1339];
		int var2 = 2;
		for (int var3 = 0; var3 < field1339; var3++) {
			field1376[var3] = var2;
			var2 += var1.method470();
		}

		field1347 = new WEWSMZTU[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1347[var4] = new WEWSMZTU();
		}
	}

	@ObfuscatedName("WEWSMZTU.b(I)V")
	public static final void method560() {
		field1380 = null;
		field1355 = null;
		field1376 = null;
		field1347 = null;
		field1370 = null;
	}
}
