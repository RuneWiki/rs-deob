package deob;

@ObfuscatedName("SCWSBSIM")
public final class SCWSBSIM {

	@ObfuscatedName("SCWSBSIM.I")
	public int field1279 = -1;

	@ObfuscatedName("SCWSBSIM.n")
	public static HPFNYARJ field1259 = new HPFNYARJ(30);

	@ObfuscatedName("SCWSBSIM.J")
	public static HPFNYARJ field1280 = new HPFNYARJ(500);

	@ObfuscatedName("SCWSBSIM.V")
	public static KPUOCBCE[] field1290 = new KPUOCBCE[4];

	@ObfuscatedName("SCWSBSIM.E")
	public byte field1275;

	@ObfuscatedName("SCWSBSIM.K")
	public byte field1281;

	@ObfuscatedName("SCWSBSIM.a")
	public int field1246;

	@ObfuscatedName("SCWSBSIM.b")
	public static int field1247;

	@ObfuscatedName("SCWSBSIM.d")
	public int field1249;

	@ObfuscatedName("SCWSBSIM.i")
	public int field1254;

	@ObfuscatedName("SCWSBSIM.j")
	public int field1255;

	@ObfuscatedName("SCWSBSIM.k")
	public int field1256;

	@ObfuscatedName("SCWSBSIM.m")
	public int field1258;

	@ObfuscatedName("SCWSBSIM.q")
	public int field1262;

	@ObfuscatedName("SCWSBSIM.t")
	public int field1264;

	@ObfuscatedName("SCWSBSIM.w")
	public int field1267;

	@ObfuscatedName("SCWSBSIM.A")
	public static int field1271;

	@ObfuscatedName("SCWSBSIM.C")
	public int field1273;

	@ObfuscatedName("SCWSBSIM.G")
	public int field1277;

	@ObfuscatedName("SCWSBSIM.N")
	public int field1283;

	@ObfuscatedName("SCWSBSIM.P")
	public int field1284;

	@ObfuscatedName("SCWSBSIM.R")
	public int field1286;

	@ObfuscatedName("SCWSBSIM.T")
	public int field1288;

	@ObfuscatedName("SCWSBSIM.U")
	public int field1289;

	@ObfuscatedName("SCWSBSIM.Q")
	public static XOUQUKZW field1285;

	@ObfuscatedName("SCWSBSIM.e")
	public static client field1250;

	@ObfuscatedName("SCWSBSIM.H")
	public String field1278;

	@ObfuscatedName("SCWSBSIM.c")
	public boolean field1248;

	@ObfuscatedName("SCWSBSIM.g")
	public boolean field1252;

	@ObfuscatedName("SCWSBSIM.s")
	public boolean field1263;

	@ObfuscatedName("SCWSBSIM.x")
	public boolean field1268;

	@ObfuscatedName("SCWSBSIM.y")
	public boolean field1269;

	@ObfuscatedName("SCWSBSIM.z")
	public static boolean field1270;

	@ObfuscatedName("SCWSBSIM.B")
	public boolean field1272;

	@ObfuscatedName("SCWSBSIM.D")
	public boolean field1274;

	@ObfuscatedName("SCWSBSIM.S")
	public boolean field1287;

	@ObfuscatedName("SCWSBSIM.W")
	public boolean field1291;

	@ObfuscatedName("SCWSBSIM.X")
	public boolean field1292;

	@ObfuscatedName("SCWSBSIM.f")
	public byte[] field1251;

	@ObfuscatedName("SCWSBSIM.h")
	public int[] field1253;

	@ObfuscatedName("SCWSBSIM.l")
	public int[] field1257;

	@ObfuscatedName("SCWSBSIM.o")
	public static int[] field1260;

	@ObfuscatedName("SCWSBSIM.v")
	public int[] field1266;

	@ObfuscatedName("SCWSBSIM.F")
	public int[] field1276;

	@ObfuscatedName("SCWSBSIM.L")
	public int[] field1282;

	@ObfuscatedName("SCWSBSIM.p")
	public static SCWSBSIM[] field1261;

	@ObfuscatedName("SCWSBSIM.u")
	public String[] field1265;

	@ObfuscatedName("SCWSBSIM.a(I)Z")
	public final boolean method460() {
		if (field1257 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1257.length; var2++) {
			var1 &= KPUOCBCE.method380(field1257[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("SCWSBSIM.a(ZI)Z")
	public final boolean method461(int arg0) {
		if (field1282 != null) {
			for (int var4 = 0; var4 < field1282.length; var4++) {
				if (field1282[var4] == arg0) {
					return KPUOCBCE.method380(field1257[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1257 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1257.length; var3++) {
				var2 &= KPUOCBCE.method380(field1257[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("SCWSBSIM.a()V")
	public final void method462() {
		field1257 = null;
		field1282 = null;
		field1278 = null;
		field1251 = null;
		field1253 = null;
		field1276 = null;
		field1249 = 1;
		field1283 = 1;
		field1274 = true;
		field1272 = true;
		field1252 = false;
		field1263 = false;
		field1248 = false;
		field1269 = false;
		field1246 = -1;
		field1255 = 16;
		field1275 = 0;
		field1281 = 0;
		field1265 = null;
		field1256 = -1;
		field1288 = -1;
		field1287 = false;
		field1291 = true;
		field1289 = 128;
		field1264 = 128;
		field1262 = 128;
		field1267 = 0;
		field1277 = 0;
		field1254 = 0;
		field1284 = 0;
		field1292 = false;
		field1268 = false;
		field1286 = -1;
		field1258 = -1;
		field1273 = -1;
		field1266 = null;
	}

	@ObfuscatedName("SCWSBSIM.b(I)LSCWSBSIM;")
	public final SCWSBSIM method463() {
		int var1 = -1;
		if (field1258 != -1) {
			XBHMGKWV var2 = XBHMGKWV.field1354[field1258];
			int var3 = var2.field1356;
			int var4 = var2.field1357;
			int var5 = var2.field1358;
			int var6 = client.field378[var5 - var4];
			var1 = field1250.field342[var3] >> var4 & var6;
		} else if (field1273 != -1) {
			var1 = field1250.field342[field1273];
		}

		if (var1 >= 0 && var1 < field1266.length && field1266[var1] != -1) {
			return method464(field1266[var1]);
		}

		return null;
	}

	@ObfuscatedName("SCWSBSIM.c(I)LSCWSBSIM;")
	public static final SCWSBSIM method464(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1261[var1].field1279 == arg0) {
				return field1261[var1];
			}
		}

		field1247 = (field1247 + 1) % 20;
		SCWSBSIM var2 = field1261[field1247];
		field1285.field1367 = field1260[arg0];
		var2.field1279 = arg0;
		var2.method462();
		var2.method465(field1285);
		return var2;
	}

	@ObfuscatedName("SCWSBSIM.a(BLXOUQUKZW;)V")
	public final void method465(XOUQUKZW arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method521();
					if (var3 == 0) {
						if (var2 == -1) {
							field1252 = false;
							if (field1257 != null && (field1282 == null || field1282[0] == 10)) {
								field1252 = true;
							}

							if (field1265 != null) {
								field1252 = true;
							}
						}

						if (field1268) {
							field1274 = false;
							field1272 = false;
						}

						if (field1286 == -1) {
							field1286 = field1274 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1278 = arg0.method528();
					} else if (var3 == 3) {
						field1251 = arg0.method529();
					} else if (var3 == 5) {
						int var6 = arg0.method521();
						if (var6 > 0) {
							if (field1257 == null || field1270) {
								field1282 = null;
								field1257 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1257[var7] = arg0.method523();
								}
							} else {
								arg0.field1367 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1249 = arg0.method521();
					} else if (var3 == 15) {
						field1283 = arg0.method521();
					} else if (var3 == 17) {
						field1274 = false;
					} else if (var3 == 18) {
						field1272 = false;
					} else if (var3 == 19) {
						var2 = arg0.method521();
						if (var2 == 1) {
							field1252 = true;
						}
					} else if (var3 == 21) {
						field1263 = true;
					} else if (var3 == 22) {
						field1248 = true;
					} else if (var3 == 23) {
						field1269 = true;
					} else if (var3 == 24) {
						field1246 = arg0.method523();
						if (field1246 == 0xFFFF) {
							field1246 = -1;
						}
					} else if (var3 == 28) {
						field1255 = arg0.method521();
					} else if (var3 == 29) {
						field1275 = arg0.method522();
					} else if (var3 == 39) {
						field1281 = arg0.method522();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1265 == null) {
							field1265 = new String[5];
						}

						field1265[var3 - 30] = arg0.method528();
						if (field1265[var3 - 30].equalsIgnoreCase("hidden")) {
							field1265[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method521();
						field1253 = new int[var8];
						field1276 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1253[var9] = arg0.method523();
							field1276[var9] = arg0.method523();
						}
					} else if (var3 == 60) {
						field1256 = arg0.method523();
					} else if (var3 == 62) {
						field1287 = true;
					} else if (var3 == 64) {
						field1291 = false;
					} else if (var3 == 65) {
						field1289 = arg0.method523();
					} else if (var3 == 66) {
						field1264 = arg0.method523();
					} else if (var3 == 67) {
						field1262 = arg0.method523();
					} else if (var3 == 68) {
						field1288 = arg0.method523();
					} else if (var3 == 69) {
						field1267 = arg0.method521();
					} else if (var3 == 70) {
						field1277 = arg0.method524();
					} else if (var3 == 71) {
						field1254 = arg0.method524();
					} else if (var3 == 72) {
						field1284 = arg0.method524();
					} else if (var3 == 73) {
						field1292 = true;
					} else if (var3 == 74) {
						field1268 = true;
					} else if (var3 == 75) {
						field1286 = arg0.method521();
					} else if (var3 == 77) {
						field1258 = arg0.method523();
						if (field1258 == 0xFFFF) {
							field1258 = -1;
						}

						field1273 = arg0.method523();
						if (field1273 == 0xFFFF) {
							field1273 = -1;
						}

						int var10 = arg0.method521();
						field1266 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1266[var11] = arg0.method523();
							if (field1266[var11] == 0xFFFF) {
								field1266[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method521();
			} while (var4 <= 0);

			if (field1257 == null || field1270) {
				field1282 = new int[var4];
				field1257 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1257[var5] = arg0.method523();
					field1282[var5] = arg0.method521();
				}
			} else {
				arg0.field1367 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("SCWSBSIM.a(LCVNWKEAW;)V")
	public static final void method466(CVNWKEAW arg0) {
		field1285 = new XOUQUKZW(arg0.method180("loc.dat", null));
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("loc.idx", null));
		field1271 = var1.method523();
		field1260 = new int[field1271];
		int var2 = 2;
		for (int var3 = 0; var3 < field1271; var3++) {
			field1260[var3] = var2;
			var2 += var1.method523();
		}

		field1261 = new SCWSBSIM[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1261[var4] = new SCWSBSIM();
		}
	}

	@ObfuscatedName("SCWSBSIM.a(IIII)LKPUOCBCE;")
	public final KPUOCBCE method467(int arg0, int arg1, int arg2) {
		KPUOCBCE var4 = null;
		long var5;
		if (field1282 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1279 << 6) + arg1);
			KPUOCBCE var7 = (KPUOCBCE) field1259.method302(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1257 == null) {
				return null;
			}

			boolean var8 = field1287 ^ arg1 > 3;
			int var9 = field1257.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1257[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (KPUOCBCE) field1280.method302(var11);
				if (var4 == null) {
					var4 = KPUOCBCE.method379(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method394();
					}

					field1280.method303(var11, var4);
				}

				if (var9 > 1) {
					field1290[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new KPUOCBCE(var9, field1290);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1282.length; var13++) {
				if (field1282[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1279 << 6) + (var12 << 3) + arg1);
			KPUOCBCE var14 = (KPUOCBCE) field1259.method302(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1257[var12];
			boolean var16 = field1287 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (KPUOCBCE) field1280.method302(var15);
			if (var4 == null) {
				var4 = KPUOCBCE.method379(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method394();
				}

				field1280.method303(var15, var4);
			}
		}

		boolean var17;
		if (field1289 == 128 && field1264 == 128 && field1262 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1277 == 0 && field1254 == 0 && field1284 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		KPUOCBCE var19 = new KPUOCBCE(ZNUJPBQV.method585(arg2), arg1 == 0 && arg2 == -1 && !var17 && !var18, var4, field1253 == null);
		if (arg2 != -1) {
			var19.method386();
			var19.method387(arg2);
			var19.field889 = null;
			var19.field888 = null;
		}

		while (arg1-- > 0) {
			var19.method390();
		}

		if (field1253 != null) {
			for (int var20 = 0; var20 < field1253.length; var20++) {
				var19.method393(field1253[var20], field1276[var20]);
			}
		}

		if (var17) {
			var19.method395(field1289, field1264, field1262);
		}

		if (var18) {
			var19.method392(field1284, field1277, field1254);
		}

		var19.method396(field1275 + 64, field1281 * 5 + 768, -50, -10, -50, !field1248);

		if (field1286 == 1) {
			var19.field885 = var19.field1380;
		}

		field1259.method303(var5, var19);
		return var19;
	}

	@ObfuscatedName("SCWSBSIM.d(I)V")
	public static final void method468() {
		field1280 = null;
		field1259 = null;
		field1260 = null;
		field1261 = null;
		field1285 = null;
	}

	@ObfuscatedName("SCWSBSIM.a(BLTXSWXFHQ;)V")
	public final void method469(TXSWXFHQ arg0) {
		if (field1257 != null) {
			for (int var2 = 0; var2 < field1257.length; var2++) {
				arg0.method476(0, field1257[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("SCWSBSIM.a(IIIIIII)LKPUOCBCE;")
	public final KPUOCBCE method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		KPUOCBCE var8 = method467(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1263 || field1248) {
			var8 = new KPUOCBCE(field1248, var8, field1263);
		}

		if (field1263) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field857; var10++) {
				int var11 = var8.field858[var10];
				int var12 = var8.field860[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field859[var10] += var15 - var9;
			}

			var8.method384();
		}

		return var8;
	}
}
