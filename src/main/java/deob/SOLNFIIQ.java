package deob;

@ObfuscatedName("SOLNFIIQ")
public final class SOLNFIIQ {

	@ObfuscatedName("SOLNFIIQ.l")
	public int field1291 = -1;

	@ObfuscatedName("SOLNFIIQ.O")
	public String field1317 = "null";

	@ObfuscatedName("SOLNFIIQ.F")
	public static OGORHYVW[] field1308 = new OGORHYVW[4];

	@ObfuscatedName("SOLNFIIQ.H")
	public static LXKBDSHJ field1310 = new LXKBDSHJ(500);

	@ObfuscatedName("SOLNFIIQ.S")
	public static LXKBDSHJ field1321 = new LXKBDSHJ(40);

	@ObfuscatedName("SOLNFIIQ.x")
	public byte field1300;

	@ObfuscatedName("SOLNFIIQ.y")
	public byte field1301;

	@ObfuscatedName("SOLNFIIQ.a")
	public int field1281;

	@ObfuscatedName("SOLNFIIQ.c")
	public int field1283;

	@ObfuscatedName("SOLNFIIQ.d")
	public int field1284;

	@ObfuscatedName("SOLNFIIQ.e")
	public int field1285;

	@ObfuscatedName("SOLNFIIQ.f")
	public int field1286;

	@ObfuscatedName("SOLNFIIQ.j")
	public int field1289;

	@ObfuscatedName("SOLNFIIQ.k")
	public int field1290;

	@ObfuscatedName("SOLNFIIQ.n")
	public int field1293;

	@ObfuscatedName("SOLNFIIQ.q")
	public int field1295;

	@ObfuscatedName("SOLNFIIQ.s")
	public static int field1296;

	@ObfuscatedName("SOLNFIIQ.A")
	public int field1303;

	@ObfuscatedName("SOLNFIIQ.E")
	public int field1307;

	@ObfuscatedName("SOLNFIIQ.K")
	public int field1313;

	@ObfuscatedName("SOLNFIIQ.M")
	public int field1315;

	@ObfuscatedName("SOLNFIIQ.N")
	public int field1316;

	@ObfuscatedName("SOLNFIIQ.R")
	public static int field1320;

	@ObfuscatedName("SOLNFIIQ.V")
	public int field1324;

	@ObfuscatedName("SOLNFIIQ.X")
	public int field1326;

	@ObfuscatedName("SOLNFIIQ.G")
	public static TKPFKOXP field1309;

	@ObfuscatedName("SOLNFIIQ.U")
	public static client field1323;

	@ObfuscatedName("SOLNFIIQ.b")
	public boolean field1282;

	@ObfuscatedName("SOLNFIIQ.h")
	public boolean field1287;

	@ObfuscatedName("SOLNFIIQ.m")
	public boolean field1292;

	@ObfuscatedName("SOLNFIIQ.t")
	public boolean field1297;

	@ObfuscatedName("SOLNFIIQ.u")
	public static boolean field1298;

	@ObfuscatedName("SOLNFIIQ.v")
	public boolean field1299;

	@ObfuscatedName("SOLNFIIQ.D")
	public boolean field1306;

	@ObfuscatedName("SOLNFIIQ.L")
	public boolean field1314;

	@ObfuscatedName("SOLNFIIQ.P")
	public boolean field1318;

	@ObfuscatedName("SOLNFIIQ.Q")
	public boolean field1319;

	@ObfuscatedName("SOLNFIIQ.T")
	public boolean field1322;

	@ObfuscatedName("SOLNFIIQ.o")
	public byte[] field1294;

	@ObfuscatedName("SOLNFIIQ.i")
	public static int[] field1288;

	@ObfuscatedName("SOLNFIIQ.z")
	public int[] field1302;

	@ObfuscatedName("SOLNFIIQ.C")
	public int[] field1305;

	@ObfuscatedName("SOLNFIIQ.I")
	public int[] field1311;

	@ObfuscatedName("SOLNFIIQ.J")
	public int[] field1312;

	@ObfuscatedName("SOLNFIIQ.Y")
	public int[] field1327;

	@ObfuscatedName("SOLNFIIQ.W")
	public static SOLNFIIQ[] field1325;

	@ObfuscatedName("SOLNFIIQ.B")
	public String[] field1304;

	@ObfuscatedName("SOLNFIIQ.a(B)V")
	public static final void method495() {
		field1310 = null;
		field1321 = null;
		field1288 = null;
		field1325 = null;
		field1309 = null;
	}

	@ObfuscatedName("SOLNFIIQ.a(IIIIIII)LOGORHYVW;")
	public final OGORHYVW method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		OGORHYVW var8 = method500(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1306 || field1287) {
			var8 = new OGORHYVW(field1306, field1287, var8);
		}

		if (field1306) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1109; var10++) {
				int var11 = var8.field1110[var10];
				int var12 = var8.field1112[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1111[var10] += var15 - var9;
			}

			var8.method438();
		}

		return var8;
	}

	@ObfuscatedName("SOLNFIIQ.a(LJUPFHAZZ;)V")
	public static final void method497(JUPFHAZZ arg0) {
		field1309 = new TKPFKOXP(arg0.method372("loc.dat", null));
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("loc.idx", null));
		field1320 = var1.method531();
		field1288 = new int[field1320];
		int var2 = 2;
		for (int var3 = 0; var3 < field1320; var3++) {
			field1288[var3] = var2;
			var2 += var1.method531();
		}

		field1325 = new SOLNFIIQ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1325[var4] = new SOLNFIIQ();
		}
	}

	@ObfuscatedName("SOLNFIIQ.a(I)Z")
	public final boolean method498() {
		if (field1311 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1311.length; var2++) {
			var1 &= OGORHYVW.method434(field1311[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("SOLNFIIQ.b(I)LSOLNFIIQ;")
	public static final SOLNFIIQ method499(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1325[var1].field1291 == arg0) {
				return field1325[var1];
			}
		}

		field1296 = (field1296 + 1) % 20;
		SOLNFIIQ var2 = field1325[field1296];
		field1309.field1382 = field1288[arg0];
		var2.field1291 = arg0;
		var2.method502();
		var2.method501(field1309);
		return var2;
	}

	@ObfuscatedName("SOLNFIIQ.a(IIZI)LOGORHYVW;")
	public final OGORHYVW method500(int arg0, int arg1, int arg2) {
		OGORHYVW var4 = null;
		long var5;
		if (field1312 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1291 << 6) + arg1);
			OGORHYVW var7 = (OGORHYVW) field1321.method413(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1311 == null) {
				return null;
			}

			boolean var8 = field1299 ^ arg1 > 3;
			int var9 = field1311.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1311[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (OGORHYVW) field1310.method413(var11);
				if (var4 == null) {
					var4 = OGORHYVW.method433(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method448();
					}

					field1310.method414(var4, var11);
				}

				if (var9 > 1) {
					field1308[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new OGORHYVW(var9, field1308);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1312.length; var13++) {
				if (field1312[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1291 << 6) + (var12 << 3) + arg1);
			OGORHYVW var14 = (OGORHYVW) field1321.method413(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1311[var12];
			boolean var16 = field1299 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (OGORHYVW) field1310.method413(var15);
			if (var4 == null) {
				var4 = OGORHYVW.method433(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method448();
				}

				field1310.method414(var4, var15);
			}
		}

		boolean var17;
		if (field1313 == 128 && field1285 == 128 && field1303 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1293 == 0 && field1295 == 0 && field1286 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		OGORHYVW var19 = new OGORHYVW(field1302 == null, var4, OYJABRDD.method467(arg2), arg1 == 0 && arg2 == -1 && !var17 && !var18);
		if (arg2 != -1) {
			var19.method440();
			var19.method441(arg2);
			var19.field1140 = null;
			var19.field1139 = null;
		}

		while (arg1-- > 0) {
			var19.method444();
		}

		if (field1302 != null) {
			for (int var20 = 0; var20 < field1302.length; var20++) {
				var19.method447(field1302[var20], field1305[var20]);
			}
		}

		if (var17) {
			var19.method449(field1303, field1313, field1285);
		}

		if (var18) {
			var19.method446(field1295, field1293, field1286);
		}

		var19.method450(field1301 + 64, field1300 * 5 + 768, -50, -10, -50, !field1287);

		if (field1315 == 1) {
			var19.field1136 = var19.field628;
		}

		field1321.method414(var19, var5);
		return var19;
	}

	@ObfuscatedName("SOLNFIIQ.a(LTKPFKOXP;B)V")
	public final void method501(TKPFKOXP arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method529();
					if (var3 == 0) {
						if (var2 == -1) {
							field1322 = false;
							if (field1311 != null && (field1312 == null || field1312[0] == 10)) {
								field1322 = true;
							}

							if (field1304 != null) {
								field1322 = true;
							}
						}

						if (field1292) {
							field1314 = false;
							field1319 = false;
						}

						if (field1315 == -1) {
							field1315 = field1314 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1317 = arg0.method536();
					} else if (var3 == 3) {
						field1294 = arg0.method537();
					} else if (var3 == 5) {
						int var6 = arg0.method529();
						if (var6 > 0) {
							if (field1311 == null || field1298) {
								field1312 = null;
								field1311 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1311[var7] = arg0.method531();
								}
							} else {
								arg0.field1382 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1284 = arg0.method529();
					} else if (var3 == 15) {
						field1326 = arg0.method529();
					} else if (var3 == 17) {
						field1314 = false;
					} else if (var3 == 18) {
						field1319 = false;
					} else if (var3 == 19) {
						var2 = arg0.method529();
						if (var2 == 1) {
							field1322 = true;
						}
					} else if (var3 == 21) {
						field1306 = true;
					} else if (var3 == 22) {
						field1287 = true;
					} else if (var3 == 23) {
						field1297 = true;
					} else if (var3 == 24) {
						field1290 = arg0.method531();
						if (field1290 == 0xFFFF) {
							field1290 = -1;
						}
					} else if (var3 == 28) {
						field1316 = arg0.method529();
					} else if (var3 == 29) {
						field1301 = arg0.method530();
					} else if (var3 == 39) {
						field1300 = arg0.method530();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1304 == null) {
							field1304 = new String[5];
						}

						field1304[var3 - 30] = arg0.method536();
						if (field1304[var3 - 30].equalsIgnoreCase("hidden")) {
							field1304[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method529();
						field1302 = new int[var8];
						field1305 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1302[var9] = arg0.method531();
							field1305[var9] = arg0.method531();
						}
					} else if (var3 == 60) {
						field1289 = arg0.method531();
					} else if (var3 == 62) {
						field1299 = true;
					} else if (var3 == 64) {
						field1282 = false;
					} else if (var3 == 65) {
						field1313 = arg0.method531();
					} else if (var3 == 66) {
						field1285 = arg0.method531();
					} else if (var3 == 67) {
						field1303 = arg0.method531();
					} else if (var3 == 68) {
						field1307 = arg0.method531();
					} else if (var3 == 69) {
						field1324 = arg0.method529();
					} else if (var3 == 70) {
						field1293 = arg0.method532();
					} else if (var3 == 71) {
						field1295 = arg0.method532();
					} else if (var3 == 72) {
						field1286 = arg0.method532();
					} else if (var3 == 73) {
						field1318 = true;
					} else if (var3 == 74) {
						field1292 = true;
					} else if (var3 == 75) {
						field1315 = arg0.method529();
					} else if (var3 == 77) {
						field1283 = arg0.method531();
						if (field1283 == 0xFFFF) {
							field1283 = -1;
						}

						field1281 = arg0.method531();
						if (field1281 == 0xFFFF) {
							field1281 = -1;
						}

						int var10 = arg0.method529();
						field1327 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1327[var11] = arg0.method531();
							if (field1327[var11] == 0xFFFF) {
								field1327[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method529();
			} while (var4 <= 0);

			if (field1311 == null || field1298) {
				field1312 = new int[var4];
				field1311 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1311[var5] = arg0.method531();
					field1312[var5] = arg0.method529();
				}
			} else {
				arg0.field1382 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("SOLNFIIQ.a()V")
	public final void method502() {
		field1311 = null;
		field1312 = null;
		field1317 = "null";
		field1294 = null;
		field1302 = null;
		field1305 = null;
		field1284 = 1;
		field1326 = 1;
		field1314 = true;
		field1319 = true;
		field1322 = false;
		field1306 = false;
		field1287 = false;
		field1297 = false;
		field1290 = -1;
		field1316 = 16;
		field1301 = 0;
		field1300 = 0;
		field1304 = null;
		field1289 = -1;
		field1307 = -1;
		field1299 = false;
		field1282 = true;
		field1313 = 128;
		field1285 = 128;
		field1303 = 128;
		field1324 = 0;
		field1293 = 0;
		field1295 = 0;
		field1286 = 0;
		field1318 = false;
		field1292 = false;
		field1315 = -1;
		field1283 = -1;
		field1281 = -1;
		field1327 = null;
	}

	@ObfuscatedName("SOLNFIIQ.c(I)LSOLNFIIQ;")
	public final SOLNFIIQ method503() {
		int var1 = -1;
		if (field1283 != -1) {
			UDCHKCCJ var2 = UDCHKCCJ.field1395[field1283];
			int var3 = var2.field1397;
			int var4 = var2.field1398;
			int var5 = var2.field1399;
			int var6 = client.field571[var5 - var4];
			var1 = field1323.field472[var3] >> var4 & var6;
		} else if (field1281 != -1) {
			var1 = field1323.field472[field1281];
		}

		if (var1 >= 0 && var1 < field1327.length && field1327[var1] != -1) {
			return method499(field1327[var1]);
		}

		return null;
	}

	@ObfuscatedName("SOLNFIIQ.a(LFOFQGQZJ;Z)V")
	public final void method504(FOFQGQZJ arg0) {
		if (field1311 != null) {
			for (int var2 = 0; var2 < field1311.length; var2++) {
				arg0.method215(0, field1311[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("SOLNFIIQ.a(II)Z")
	public final boolean method505(int arg0) {
		if (field1312 != null) {
			for (int var4 = 0; var4 < field1312.length; var4++) {
				if (field1312[var4] == arg0) {
					return OGORHYVW.method434(field1311[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1311 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1311.length; var3++) {
				var2 &= OGORHYVW.method434(field1311[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}
}
