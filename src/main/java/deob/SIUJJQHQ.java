package deob;

@ObfuscatedName("SIUJJQHQ")
public final class SIUJJQHQ {

	@ObfuscatedName("SIUJJQHQ.s")
	public int field1270 = -1;

	@ObfuscatedName("SIUJJQHQ.A")
	public static JLTMYUOM field1277 = new JLTMYUOM(30);

	@ObfuscatedName("SIUJJQHQ.H")
	public static JLTMYUOM field1284 = new JLTMYUOM(500);

	@ObfuscatedName("SIUJJQHQ.W")
	public static FUTAQMCE[] field1297 = new FUTAQMCE[4];

	@ObfuscatedName("SIUJJQHQ.b")
	public byte field1255;

	@ObfuscatedName("SIUJJQHQ.y")
	public byte field1275;

	@ObfuscatedName("SIUJJQHQ.c")
	public int field1256;

	@ObfuscatedName("SIUJJQHQ.e")
	public static int field1257;

	@ObfuscatedName("SIUJJQHQ.f")
	public int field1258;

	@ObfuscatedName("SIUJJQHQ.h")
	public int field1260;

	@ObfuscatedName("SIUJJQHQ.n")
	public int field1265;

	@ObfuscatedName("SIUJJQHQ.o")
	public int field1266;

	@ObfuscatedName("SIUJJQHQ.B")
	public int field1278;

	@ObfuscatedName("SIUJJQHQ.C")
	public int field1279;

	@ObfuscatedName("SIUJJQHQ.F")
	public int field1282;

	@ObfuscatedName("SIUJJQHQ.G")
	public int field1283;

	@ObfuscatedName("SIUJJQHQ.I")
	public int field1285;

	@ObfuscatedName("SIUJJQHQ.J")
	public int field1286;

	@ObfuscatedName("SIUJJQHQ.O")
	public int field1290;

	@ObfuscatedName("SIUJJQHQ.P")
	public int field1291;

	@ObfuscatedName("SIUJJQHQ.R")
	public static int field1292;

	@ObfuscatedName("SIUJJQHQ.T")
	public int field1294;

	@ObfuscatedName("SIUJJQHQ.Y")
	public int field1299;

	@ObfuscatedName("SIUJJQHQ.Z")
	public int field1300;

	@ObfuscatedName("SIUJJQHQ.v")
	public static XJCNBMKS field1272;

	@ObfuscatedName("SIUJJQHQ.j")
	public static client field1262;

	@ObfuscatedName("SIUJJQHQ.a")
	public String field1254;

	@ObfuscatedName("SIUJJQHQ.i")
	public boolean field1261;

	@ObfuscatedName("SIUJJQHQ.l")
	public boolean field1263;

	@ObfuscatedName("SIUJJQHQ.m")
	public boolean field1264;

	@ObfuscatedName("SIUJJQHQ.q")
	public boolean field1268;

	@ObfuscatedName("SIUJJQHQ.r")
	public boolean field1269;

	@ObfuscatedName("SIUJJQHQ.u")
	public boolean field1271;

	@ObfuscatedName("SIUJJQHQ.w")
	public boolean field1273;

	@ObfuscatedName("SIUJJQHQ.x")
	public static boolean field1274;

	@ObfuscatedName("SIUJJQHQ.z")
	public boolean field1276;

	@ObfuscatedName("SIUJJQHQ.L")
	public boolean field1288;

	@ObfuscatedName("SIUJJQHQ.U")
	public boolean field1295;

	@ObfuscatedName("SIUJJQHQ.g")
	public byte[] field1259;

	@ObfuscatedName("SIUJJQHQ.p")
	public int[] field1267;

	@ObfuscatedName("SIUJJQHQ.D")
	public int[] field1280;

	@ObfuscatedName("SIUJJQHQ.E")
	public int[] field1281;

	@ObfuscatedName("SIUJJQHQ.K")
	public int[] field1287;

	@ObfuscatedName("SIUJJQHQ.V")
	public int[] field1296;

	@ObfuscatedName("SIUJJQHQ.X")
	public static int[] field1298;

	@ObfuscatedName("SIUJJQHQ.S")
	public static SIUJJQHQ[] field1293;

	@ObfuscatedName("SIUJJQHQ.M")
	public String[] field1289;

	@ObfuscatedName("SIUJJQHQ.a(IZ)Z")
	public final boolean method450(int arg0) {
		if (field1296 != null) {
			for (int var4 = 0; var4 < field1296.length; var4++) {
				if (field1296[var4] == arg0) {
					return FUTAQMCE.method251(field1280[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1280 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1280.length; var3++) {
				var2 &= FUTAQMCE.method251(field1280[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("SIUJJQHQ.a(LQKFGLETG;)V")
	public static final void method451(QKFGLETG arg0) {
		field1272 = new XJCNBMKS(arg0.method402("loc.dat", null));
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("loc.idx", null));
		field1292 = var1.method536();
		field1298 = new int[field1292];
		int var2 = 2;
		for (int var3 = 0; var3 < field1292; var3++) {
			field1298[var3] = var2;
			var2 += var1.method536();
		}

		field1293 = new SIUJJQHQ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1293[var4] = new SIUJJQHQ();
		}
	}

	@ObfuscatedName("SIUJJQHQ.a(I)V")
	public static final void method452() {
		field1284 = null;
		field1277 = null;
		field1298 = null;
		field1293 = null;
		field1272 = null;
	}

	@ObfuscatedName("SIUJJQHQ.a(LSDLNXGIT;I)V")
	public final void method453(SDLNXGIT arg0) {
		if (field1280 != null) {
			for (int var2 = 0; var2 < field1280.length; var2++) {
				arg0.method441(0, field1280[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("SIUJJQHQ.a(BLXJCNBMKS;)V")
	public final void method454(XJCNBMKS arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method534();
					if (var3 == 0) {
						if (var2 == -1) {
							field1263 = false;
							if (field1280 != null && (field1296 == null || field1296[0] == 10)) {
								field1263 = true;
							}

							if (field1289 != null) {
								field1263 = true;
							}
						}

						if (field1271) {
							field1295 = false;
							field1261 = false;
						}

						if (field1282 == -1) {
							field1282 = field1295 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1254 = arg0.method541();
					} else if (var3 == 3) {
						field1259 = arg0.method542();
					} else if (var3 == 5) {
						int var6 = arg0.method534();
						if (var6 > 0) {
							if (field1280 == null || field1274) {
								field1296 = null;
								field1280 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1280[var7] = arg0.method536();
								}
							} else {
								arg0.field1403 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1265 = arg0.method534();
					} else if (var3 == 15) {
						field1256 = arg0.method534();
					} else if (var3 == 17) {
						field1295 = false;
					} else if (var3 == 18) {
						field1261 = false;
					} else if (var3 == 19) {
						var2 = arg0.method534();
						if (var2 == 1) {
							field1263 = true;
						}
					} else if (var3 == 21) {
						field1273 = true;
					} else if (var3 == 22) {
						field1268 = true;
					} else if (var3 == 23) {
						field1269 = true;
					} else if (var3 == 24) {
						field1258 = arg0.method536();
						if (field1258 == 0xFFFF) {
							field1258 = -1;
						}
					} else if (var3 == 28) {
						field1291 = arg0.method534();
					} else if (var3 == 29) {
						field1275 = arg0.method535();
					} else if (var3 == 39) {
						field1255 = arg0.method535();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1289 == null) {
							field1289 = new String[5];
						}

						field1289[var3 - 30] = arg0.method541();
						if (field1289[var3 - 30].equalsIgnoreCase("hidden")) {
							field1289[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method534();
						field1267 = new int[var8];
						field1287 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1267[var9] = arg0.method536();
							field1287[var9] = arg0.method536();
						}
					} else if (var3 == 60) {
						field1260 = arg0.method536();
					} else if (var3 == 62) {
						field1264 = true;
					} else if (var3 == 64) {
						field1288 = false;
					} else if (var3 == 65) {
						field1299 = arg0.method536();
					} else if (var3 == 66) {
						field1300 = arg0.method536();
					} else if (var3 == 67) {
						field1283 = arg0.method536();
					} else if (var3 == 68) {
						field1266 = arg0.method536();
					} else if (var3 == 69) {
						field1279 = arg0.method534();
					} else if (var3 == 70) {
						field1286 = arg0.method537();
					} else if (var3 == 71) {
						field1294 = arg0.method537();
					} else if (var3 == 72) {
						field1278 = arg0.method537();
					} else if (var3 == 73) {
						field1276 = true;
					} else if (var3 == 74) {
						field1271 = true;
					} else if (var3 == 75) {
						field1282 = arg0.method534();
					} else if (var3 == 77) {
						field1290 = arg0.method536();
						if (field1290 == 0xFFFF) {
							field1290 = -1;
						}

						field1285 = arg0.method536();
						if (field1285 == 0xFFFF) {
							field1285 = -1;
						}

						int var10 = arg0.method534();
						field1281 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1281[var11] = arg0.method536();
							if (field1281[var11] == 0xFFFF) {
								field1281[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method534();
			} while (var4 <= 0);

			if (field1280 == null || field1274) {
				field1296 = new int[var4];
				field1280 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1280[var5] = arg0.method536();
					field1296[var5] = arg0.method534();
				}
			} else {
				arg0.field1403 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("SIUJJQHQ.b(I)LSIUJJQHQ;")
	public static final SIUJJQHQ method455(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1293[var1].field1270 == arg0) {
				return field1293[var1];
			}
		}

		field1257 = (field1257 + 1) % 20;
		SIUJJQHQ var2 = field1293[field1257];
		field1272.field1403 = field1298[arg0];
		var2.field1270 = arg0;
		var2.method460();
		var2.method454(field1272);
		return var2;
	}

	@ObfuscatedName("SIUJJQHQ.a(IIIIIII)LFUTAQMCE;")
	public final FUTAQMCE method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		FUTAQMCE var8 = method459(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1273 || field1268) {
			var8 = new FUTAQMCE(field1273, var8, field1268);
		}

		if (field1273) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field638; var10++) {
				int var11 = var8.field639[var10];
				int var12 = var8.field641[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field640[var10] += var15 - var9;
			}

			var8.method255();
		}

		return var8;
	}

	@ObfuscatedName("SIUJJQHQ.a(B)LSIUJJQHQ;")
	public final SIUJJQHQ method457() {
		int var1 = -1;
		if (field1290 != -1) {
			VSLUEINI var2 = VSLUEINI.field1394[field1290];
			int var3 = var2.field1396;
			int var4 = var2.field1397;
			int var5 = var2.field1398;
			int var6 = client.field232[var5 - var4];
			var1 = field1262.field524[var3] >> var4 & var6;
		} else if (field1285 != -1) {
			var1 = field1262.field524[field1285];
		}

		if (var1 >= 0 && var1 < field1281.length && field1281[var1] != -1) {
			return method455(field1281[var1]);
		}

		return null;
	}

	@ObfuscatedName("SIUJJQHQ.c(I)Z")
	public final boolean method458() {
		if (field1280 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1280.length; var2++) {
			var1 &= FUTAQMCE.method251(field1280[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("SIUJJQHQ.a(IBII)LFUTAQMCE;")
	public final FUTAQMCE method459(int arg0, int arg1, int arg2) {
		FUTAQMCE var4 = null;
		long var5;
		if (field1296 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1270 << 6) + arg1);
			FUTAQMCE var7 = (FUTAQMCE) field1277.method297(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1280 == null) {
				return null;
			}

			boolean var8 = field1264 ^ arg1 > 3;
			int var9 = field1280.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1280[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (FUTAQMCE) field1284.method297(var11);
				if (var4 == null) {
					var4 = FUTAQMCE.method250(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method265();
					}

					field1284.method298(var11, var4);
				}

				if (var9 > 1) {
					field1297[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new FUTAQMCE(var9, field1297);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1296.length; var13++) {
				if (field1296[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1270 << 6) + (var12 << 3) + arg1);
			FUTAQMCE var14 = (FUTAQMCE) field1277.method297(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1280[var12];
			boolean var16 = field1264 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (FUTAQMCE) field1284.method297(var15);
			if (var4 == null) {
				var4 = FUTAQMCE.method250(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method265();
				}

				field1284.method298(var15, var4);
			}
		}

		boolean var17;
		if (field1299 == 128 && field1300 == 128 && field1283 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1286 == 0 && field1294 == 0 && field1278 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		FUTAQMCE var19 = new FUTAQMCE(var4, arg1 == 0 && arg2 == -1 && !var17 && !var18, field1267 == null, RYVJCVCB.method428(arg2));
		if (arg2 != -1) {
			var19.method257();
			var19.method258(arg2);
			var19.field670 = null;
			var19.field669 = null;
		}

		while (arg1-- > 0) {
			var19.method261();
		}

		if (field1267 != null) {
			for (int var20 = 0; var20 < field1267.length; var20++) {
				var19.method264(field1267[var20], field1287[var20]);
			}
		}

		if (var17) {
			var19.method266(field1283, field1300, field1299);
		}

		if (var18) {
			var19.method263(field1278, field1294, field1286);
		}

		var19.method267(field1275 + 64, field1255 * 5 + 768, -50, -10, -50, !field1268);

		if (field1282 == 1) {
			var19.field666 = var19.field976;
		}

		field1277.method298(var5, var19);
		return var19;
	}

	@ObfuscatedName("SIUJJQHQ.a()V")
	public final void method460() {
		field1280 = null;
		field1296 = null;
		field1254 = null;
		field1259 = null;
		field1267 = null;
		field1287 = null;
		field1265 = 1;
		field1256 = 1;
		field1295 = true;
		field1261 = true;
		field1263 = false;
		field1273 = false;
		field1268 = false;
		field1269 = false;
		field1258 = -1;
		field1291 = 16;
		field1275 = 0;
		field1255 = 0;
		field1289 = null;
		field1260 = -1;
		field1266 = -1;
		field1264 = false;
		field1288 = true;
		field1299 = 128;
		field1300 = 128;
		field1283 = 128;
		field1279 = 0;
		field1286 = 0;
		field1294 = 0;
		field1278 = 0;
		field1276 = false;
		field1271 = false;
		field1282 = -1;
		field1290 = -1;
		field1285 = -1;
		field1281 = null;
	}
}
