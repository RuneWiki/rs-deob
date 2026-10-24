package deob;

@ObfuscatedName("UVSOAWGE")
public final class UVSOAWGE {

	@ObfuscatedName("UVSOAWGE.a")
	public int field1298;

	@ObfuscatedName("UVSOAWGE.g")
	public int field1304 = -1;

	@ObfuscatedName("UVSOAWGE.b")
	public static QQBOAQZB field1299 = new QQBOAQZB(30);

	@ObfuscatedName("UVSOAWGE.O")
	public static DHUPIIUL[] field1334 = new DHUPIIUL[4];

	@ObfuscatedName("UVSOAWGE.V")
	public static QQBOAQZB field1340 = new QQBOAQZB(500);

	@ObfuscatedName("UVSOAWGE.e")
	public byte field1302;

	@ObfuscatedName("UVSOAWGE.n")
	public byte field1310;

	@ObfuscatedName("UVSOAWGE.c")
	public int field1300;

	@ObfuscatedName("UVSOAWGE.d")
	public int field1301;

	@ObfuscatedName("UVSOAWGE.f")
	public int field1303;

	@ObfuscatedName("UVSOAWGE.l")
	public int field1308;

	@ObfuscatedName("UVSOAWGE.q")
	public int field1313;

	@ObfuscatedName("UVSOAWGE.s")
	public int field1315;

	@ObfuscatedName("UVSOAWGE.C")
	public int field1324;

	@ObfuscatedName("UVSOAWGE.D")
	public int field1325;

	@ObfuscatedName("UVSOAWGE.H")
	public int field1329;

	@ObfuscatedName("UVSOAWGE.J")
	public int field1330;

	@ObfuscatedName("UVSOAWGE.L")
	public int field1332;

	@ObfuscatedName("UVSOAWGE.N")
	public static int field1333;

	@ObfuscatedName("UVSOAWGE.Q")
	public int field1335;

	@ObfuscatedName("UVSOAWGE.R")
	public int field1336;

	@ObfuscatedName("UVSOAWGE.S")
	public static int field1337;

	@ObfuscatedName("UVSOAWGE.U")
	public int field1339;

	@ObfuscatedName("UVSOAWGE.X")
	public int field1342;

	@ObfuscatedName("UVSOAWGE.z")
	public static INLHDAGO field1321;

	@ObfuscatedName("UVSOAWGE.F")
	public static client field1327;

	@ObfuscatedName("UVSOAWGE.p")
	public String field1312;

	@ObfuscatedName("UVSOAWGE.i")
	public static boolean field1305;

	@ObfuscatedName("UVSOAWGE.j")
	public boolean field1306;

	@ObfuscatedName("UVSOAWGE.k")
	public boolean field1307;

	@ObfuscatedName("UVSOAWGE.o")
	public boolean field1311;

	@ObfuscatedName("UVSOAWGE.t")
	public boolean field1316;

	@ObfuscatedName("UVSOAWGE.u")
	public boolean field1317;

	@ObfuscatedName("UVSOAWGE.v")
	public boolean field1318;

	@ObfuscatedName("UVSOAWGE.w")
	public boolean field1319;

	@ObfuscatedName("UVSOAWGE.A")
	public boolean field1322;

	@ObfuscatedName("UVSOAWGE.T")
	public boolean field1338;

	@ObfuscatedName("UVSOAWGE.W")
	public boolean field1341;

	@ObfuscatedName("UVSOAWGE.K")
	public byte[] field1331;

	@ObfuscatedName("UVSOAWGE.m")
	public int[] field1309;

	@ObfuscatedName("UVSOAWGE.x")
	public static int[] field1320;

	@ObfuscatedName("UVSOAWGE.E")
	public int[] field1326;

	@ObfuscatedName("UVSOAWGE.G")
	public int[] field1328;

	@ObfuscatedName("UVSOAWGE.Y")
	public int[] field1343;

	@ObfuscatedName("UVSOAWGE.Z")
	public int[] field1344;

	@ObfuscatedName("UVSOAWGE.B")
	public static UVSOAWGE[] field1323;

	@ObfuscatedName("UVSOAWGE.r")
	public String[] field1314;

	@ObfuscatedName("UVSOAWGE.a(ILINLHDAGO;)V")
	public final void method496(INLHDAGO arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method308();
					if (var3 == 0) {
						if (var2 == -1) {
							field1318 = false;
							if (field1326 != null && (field1328 == null || field1328[0] == 10)) {
								field1318 = true;
							}

							if (field1314 != null) {
								field1318 = true;
							}
						}

						if (field1317) {
							field1311 = false;
							field1316 = false;
						}

						if (field1313 == -1) {
							field1313 = field1311 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1312 = arg0.method315();
					} else if (var3 == 3) {
						field1331 = arg0.method316();
					} else if (var3 == 5) {
						int var6 = arg0.method308();
						if (var6 > 0) {
							if (field1326 == null || field1305) {
								field1328 = null;
								field1326 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1326[var7] = arg0.method310();
								}
							} else {
								arg0.field969 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1300 = arg0.method308();
					} else if (var3 == 15) {
						field1332 = arg0.method308();
					} else if (var3 == 17) {
						field1311 = false;
					} else if (var3 == 18) {
						field1316 = false;
					} else if (var3 == 19) {
						var2 = arg0.method308();
						if (var2 == 1) {
							field1318 = true;
						}
					} else if (var3 == 21) {
						field1322 = true;
					} else if (var3 == 22) {
						field1341 = true;
					} else if (var3 == 23) {
						field1307 = true;
					} else if (var3 == 24) {
						field1329 = arg0.method310();
						if (field1329 == 0xFFFF) {
							field1329 = -1;
						}
					} else if (var3 == 28) {
						field1330 = arg0.method308();
					} else if (var3 == 29) {
						field1310 = arg0.method309();
					} else if (var3 == 39) {
						field1302 = arg0.method309();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1314 == null) {
							field1314 = new String[5];
						}

						field1314[var3 - 30] = arg0.method315();
						if (field1314[var3 - 30].equalsIgnoreCase("hidden")) {
							field1314[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method308();
						field1309 = new int[var8];
						field1344 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1309[var9] = arg0.method310();
							field1344[var9] = arg0.method310();
						}
					} else if (var3 == 60) {
						field1308 = arg0.method310();
					} else if (var3 == 62) {
						field1319 = true;
					} else if (var3 == 64) {
						field1338 = false;
					} else if (var3 == 65) {
						field1298 = arg0.method310();
					} else if (var3 == 66) {
						field1303 = arg0.method310();
					} else if (var3 == 67) {
						field1342 = arg0.method310();
					} else if (var3 == 68) {
						field1336 = arg0.method310();
					} else if (var3 == 69) {
						field1301 = arg0.method308();
					} else if (var3 == 70) {
						field1324 = arg0.method311();
					} else if (var3 == 71) {
						field1335 = arg0.method311();
					} else if (var3 == 72) {
						field1325 = arg0.method311();
					} else if (var3 == 73) {
						field1306 = true;
					} else if (var3 == 74) {
						field1317 = true;
					} else if (var3 == 75) {
						field1313 = arg0.method308();
					} else if (var3 == 77) {
						field1339 = arg0.method310();
						if (field1339 == 0xFFFF) {
							field1339 = -1;
						}

						field1315 = arg0.method310();
						if (field1315 == 0xFFFF) {
							field1315 = -1;
						}

						int var10 = arg0.method308();
						field1343 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1343[var11] = arg0.method310();
							if (field1343[var11] == 0xFFFF) {
								field1343[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method308();
			} while (var4 <= 0);

			if (field1326 == null || field1305) {
				field1328 = new int[var4];
				field1326 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1326[var5] = arg0.method310();
					field1328[var5] = arg0.method308();
				}
			} else {
				arg0.field969 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("UVSOAWGE.a(ZI)Z")
	public final boolean method497(int arg0) {
		if (field1328 != null) {
			for (int var4 = 0; var4 < field1328.length; var4++) {
				if (field1328[var4] == arg0) {
					return DHUPIIUL.method192(field1326[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1326 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1326.length; var3++) {
				var2 &= DHUPIIUL.method192(field1326[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("UVSOAWGE.a(I)Z")
	public final boolean method498() {
		if (field1326 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1326.length; var2++) {
			var1 &= DHUPIIUL.method192(field1326[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("UVSOAWGE.a(Z)LUVSOAWGE;")
	public final UVSOAWGE method499() {
		int var1 = -1;
		if (field1339 != -1) {
			MWRUKLPF var2 = MWRUKLPF.field1119[field1339];
			int var3 = var2.field1121;
			int var4 = var2.field1122;
			int var5 = var2.field1123;
			int var6 = client.field276[var5 - var4];
			var1 = field1327.field313[var3] >> var4 & var6;
		} else if (field1315 != -1) {
			var1 = field1327.field313[field1315];
		}

		if (var1 >= 0 && var1 < field1343.length && field1343[var1] != -1) {
			return method501(field1343[var1]);
		}

		return null;
	}

	@ObfuscatedName("UVSOAWGE.b(Z)V")
	public static final void method500() {
		field1340 = null;
		field1299 = null;
		field1320 = null;
		field1323 = null;
		field1321 = null;
	}

	@ObfuscatedName("UVSOAWGE.b(I)LUVSOAWGE;")
	public static final UVSOAWGE method501(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1323[var1].field1304 == arg0) {
				return field1323[var1];
			}
		}

		field1337 = (field1337 + 1) % 20;
		UVSOAWGE var2 = field1323[field1337];
		field1321.field969 = field1320[arg0];
		var2.field1304 = arg0;
		var2.method503();
		var2.method496(field1321);
		return var2;
	}

	@ObfuscatedName("UVSOAWGE.a(BLCXHZUTUD;)V")
	public final void method502(CXHZUTUD arg0) {
		if (field1326 != null) {
			for (int var2 = 0; var2 < field1326.length; var2++) {
				arg0.method172(field1326[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("UVSOAWGE.a()V")
	public final void method503() {
		field1326 = null;
		field1328 = null;
		field1312 = null;
		field1331 = null;
		field1309 = null;
		field1344 = null;
		field1300 = 1;
		field1332 = 1;
		field1311 = true;
		field1316 = true;
		field1318 = false;
		field1322 = false;
		field1341 = false;
		field1307 = false;
		field1329 = -1;
		field1330 = 16;
		field1310 = 0;
		field1302 = 0;
		field1314 = null;
		field1308 = -1;
		field1336 = -1;
		field1319 = false;
		field1338 = true;
		field1298 = 128;
		field1303 = 128;
		field1342 = 128;
		field1301 = 0;
		field1324 = 0;
		field1335 = 0;
		field1325 = 0;
		field1306 = false;
		field1317 = false;
		field1313 = -1;
		field1339 = -1;
		field1315 = -1;
		field1343 = null;
	}

	@ObfuscatedName("UVSOAWGE.a(LDYBMLHQM;)V")
	public static final void method504(DYBMLHQM arg0) {
		field1321 = new INLHDAGO(arg0.method248("loc.dat", null));
		INLHDAGO var1 = new INLHDAGO(arg0.method248("loc.idx", null));
		field1333 = var1.method310();
		field1320 = new int[field1333];
		int var2 = 2;
		for (int var3 = 0; var3 < field1333; var3++) {
			field1320[var3] = var2;
			var2 += var1.method310();
		}

		field1323 = new UVSOAWGE[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1323[var4] = new UVSOAWGE();
		}
	}

	@ObfuscatedName("UVSOAWGE.a(IIBI)LDHUPIIUL;")
	public final DHUPIIUL method505(int arg0, int arg1, int arg2) {
		DHUPIIUL var4 = null;
		long var5;
		if (field1328 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1304 << 6) + arg2);
			DHUPIIUL var7 = (DHUPIIUL) field1299.method421(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1326 == null) {
				return null;
			}

			boolean var8 = field1319 ^ arg2 > 3;
			int var9 = field1326.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1326[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (DHUPIIUL) field1340.method421(var11);
				if (var4 == null) {
					var4 = DHUPIIUL.method191(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method206();
					}

					field1340.method422(var4, var11);
				}

				if (var9 > 1) {
					field1334[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new DHUPIIUL(field1334, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1328.length; var13++) {
				if (field1328[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1304 << 6) + (var12 << 3) + arg2);
			DHUPIIUL var14 = (DHUPIIUL) field1299.method421(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1326[var12];
			boolean var16 = field1319 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (DHUPIIUL) field1340.method421(var15);
			if (var4 == null) {
				var4 = DHUPIIUL.method191(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method206();
				}

				field1340.method422(var4, var15);
			}
		}

		boolean var17;
		if (field1298 == 128 && field1303 == 128 && field1342 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1324 == 0 && field1335 == 0 && field1325 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		DHUPIIUL var19 = new DHUPIIUL(var4, arg2 == 0 && arg0 == -1 && !var17 && !var18, BWSGQYNU.method16(arg0), field1309 == null);
		if (arg0 != -1) {
			var19.method198();
			var19.method199(arg0);
			var19.field576 = null;
			var19.field575 = null;
		}

		while (arg2-- > 0) {
			var19.method202();
		}

		if (field1309 != null) {
			for (int var20 = 0; var20 < field1309.length; var20++) {
				var19.method205(field1309[var20], field1344[var20]);
			}
		}

		if (var17) {
			var19.method207(field1342, field1303, field1298);
		}

		if (var18) {
			var19.method204(field1324, field1325, field1335);
		}

		var19.method208(field1310 + 64, field1302 * 5 + 768, -50, -10, -50, !field1341);

		if (field1313 == 1) {
			var19.field572 = var19.field700;
		}

		field1299.method422(var19, var5);
		return var19;
	}

	@ObfuscatedName("UVSOAWGE.a(IIIIIII)LDHUPIIUL;")
	public final DHUPIIUL method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		DHUPIIUL var8 = method505(arg6, arg0, arg1);
		if (var8 == null) {
			return null;
		}

		if (field1322 || field1341) {
			var8 = new DHUPIIUL(field1341, field1322, var8);
		}

		if (field1322) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field544; var10++) {
				int var11 = var8.field545[var10];
				int var12 = var8.field547[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field546[var10] += var15 - var9;
			}

			var8.method196();
		}

		return var8;
	}
}
