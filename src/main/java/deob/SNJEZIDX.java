package deob;

@ObfuscatedName("SNJEZIDX")
public final class SNJEZIDX {

	@ObfuscatedName("SNJEZIDX.D")
	public int field1258 = -1;

	@ObfuscatedName("SNJEZIDX.o")
	public static LXKBDSHJ field1244 = new LXKBDSHJ(50);

	@ObfuscatedName("SNJEZIDX.y")
	public static boolean field1253 = true;

	@ObfuscatedName("SNJEZIDX.Y")
	public static LXKBDSHJ field1276 = new LXKBDSHJ(100);

	@ObfuscatedName("SNJEZIDX.e")
	public byte field1236;

	@ObfuscatedName("SNJEZIDX.k")
	public byte field1242;

	@ObfuscatedName("SNJEZIDX.a")
	public int field1233;

	@ObfuscatedName("SNJEZIDX.f")
	public int field1237;

	@ObfuscatedName("SNJEZIDX.h")
	public static int field1239;

	@ObfuscatedName("SNJEZIDX.i")
	public int field1240;

	@ObfuscatedName("SNJEZIDX.q")
	public static int field1246;

	@ObfuscatedName("SNJEZIDX.r")
	public int field1247;

	@ObfuscatedName("SNJEZIDX.s")
	public int field1248;

	@ObfuscatedName("SNJEZIDX.w")
	public int field1251;

	@ObfuscatedName("SNJEZIDX.x")
	public int field1252;

	@ObfuscatedName("SNJEZIDX.A")
	public int field1255;

	@ObfuscatedName("SNJEZIDX.B")
	public int field1256;

	@ObfuscatedName("SNJEZIDX.E")
	public int field1259;

	@ObfuscatedName("SNJEZIDX.F")
	public int field1260;

	@ObfuscatedName("SNJEZIDX.H")
	public int field1262;

	@ObfuscatedName("SNJEZIDX.J")
	public int field1263;

	@ObfuscatedName("SNJEZIDX.K")
	public int field1264;

	@ObfuscatedName("SNJEZIDX.L")
	public int field1265;

	@ObfuscatedName("SNJEZIDX.M")
	public int field1266;

	@ObfuscatedName("SNJEZIDX.N")
	public int field1267;

	@ObfuscatedName("SNJEZIDX.P")
	public int field1268;

	@ObfuscatedName("SNJEZIDX.Q")
	public int field1269;

	@ObfuscatedName("SNJEZIDX.R")
	public int field1270;

	@ObfuscatedName("SNJEZIDX.T")
	public int field1272;

	@ObfuscatedName("SNJEZIDX.W")
	public int field1274;

	@ObfuscatedName("SNJEZIDX.X")
	public int field1275;

	@ObfuscatedName("SNJEZIDX.Z")
	public int field1277;

	@ObfuscatedName("SNJEZIDX.ab")
	public int field1278;

	@ObfuscatedName("SNJEZIDX.bb")
	public int field1279;

	@ObfuscatedName("SNJEZIDX.cb")
	public int field1280;

	@ObfuscatedName("SNJEZIDX.z")
	public static TKPFKOXP field1254;

	@ObfuscatedName("SNJEZIDX.l")
	public String field1243;

	@ObfuscatedName("SNJEZIDX.t")
	public boolean field1249;

	@ObfuscatedName("SNJEZIDX.u")
	public boolean field1250;

	@ObfuscatedName("SNJEZIDX.g")
	public byte[] field1238;

	@ObfuscatedName("SNJEZIDX.b")
	public int[] field1234;

	@ObfuscatedName("SNJEZIDX.j")
	public int[] field1241;

	@ObfuscatedName("SNJEZIDX.p")
	public int[] field1245;

	@ObfuscatedName("SNJEZIDX.C")
	public static int[] field1257;

	@ObfuscatedName("SNJEZIDX.U")
	public int[] field1273;

	@ObfuscatedName("SNJEZIDX.G")
	public static SNJEZIDX[] field1261;

	@ObfuscatedName("SNJEZIDX.d")
	public String[] field1235;

	@ObfuscatedName("SNJEZIDX.S")
	public String[] field1271;

	@ObfuscatedName("SNJEZIDX.a(I)LSNJEZIDX;")
	public static final SNJEZIDX method482(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1261[var1].field1258 == arg0) {
				return field1261[var1];
			}
		}

		field1239 = (field1239 + 1) % 10;
		SNJEZIDX var2 = field1261[field1239];
		field1254.field1382 = field1257[arg0];
		var2.field1258 = arg0;
		var2.method494();
		var2.method487(field1254);

		if (var2.field1240 != -1) {
			var2.method490();
		}

		if (!field1253 && var2.field1250) {
			var2.field1243 = "Members Object";
			var2.field1238 = "Login to a members' server to use this object.".getBytes();
			var2.field1271 = null;
			var2.field1235 = null;
			var2.field1262 = 0;
		}

		return var2;
	}

	@ObfuscatedName("SNJEZIDX.a(IB)LOGORHYVW;")
	public final OGORHYVW method483(int arg0) {
		if (field1245 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1234[var3] && field1234[var3] != 0) {
					var2 = field1245[var3];
				}
			}

			if (var2 != -1) {
				return method482(var2).method483(1);
			}
		}

		OGORHYVW var4 = OGORHYVW.method433(field1274);
		if (var4 == null) {
			return null;
		}

		if (field1241 != null) {
			for (int var5 = 0; var5 < field1241.length; var5++) {
				var4.method447(field1241[var5], field1273[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("SNJEZIDX.a(II)Z")
	public final boolean method484(int arg0) {
		int var2 = field1265;
		int var3 = field1247;
		if (arg0 == 1) {
			var2 = field1263;
			var3 = field1260;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!OGORHYVW.method434(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !OGORHYVW.method434(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("SNJEZIDX.a(B)V")
	public static final void method485() {
		field1244 = null;
		field1276 = null;
		field1257 = null;
		field1261 = null;
		field1254 = null;
	}

	@ObfuscatedName("SNJEZIDX.b(I)LOGORHYVW;")
	public final OGORHYVW method486(int arg0) {
		if (field1245 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1234[var3] && field1234[var3] != 0) {
					var2 = field1245[var3];
				}
			}

			if (var2 != -1) {
				return method482(var2).method486(1);
			}
		}

		OGORHYVW var4 = (OGORHYVW) field1244.method413(field1258);
		if (var4 != null) {
			return var4;
		}

		OGORHYVW var5 = OGORHYVW.method433(field1274);
		if (var5 == null) {
			return null;
		}

		if (field1280 != 128 || field1252 != 128 || field1255 != 128) {
			var5.method449(field1255, field1280, field1252);
		}

		if (field1241 != null) {
			for (int var6 = 0; var6 < field1241.length; var6++) {
				var5.method447(field1241[var6], field1273[var6]);
			}
		}

		var5.method450(field1277 + 64, field1269 + 768, -50, -10, -50, true);
		var5.field1141 = true;
		field1244.method414(var5, field1258);
		return var5;
	}

	@ObfuscatedName("SNJEZIDX.a(LTKPFKOXP;B)V")
	public final void method487(TKPFKOXP arg0) {
		while (true) {
			int var2 = arg0.method529();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1274 = arg0.method531();
			} else if (var2 == 2) {
				field1243 = arg0.method536();
			} else if (var2 == 3) {
				field1238 = arg0.method537();
			} else if (var2 == 4) {
				field1267 = arg0.method531();
			} else if (var2 == 5) {
				field1264 = arg0.method531();
			} else if (var2 == 6) {
				field1248 = arg0.method531();
			} else if (var2 == 7) {
				field1233 = arg0.method531();
				if (field1233 > 32767) {
					field1233 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1268 = arg0.method531();
				if (field1268 > 32767) {
					field1268 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1266 = arg0.method531();
			} else if (var2 == 11) {
				field1249 = true;
			} else if (var2 == 12) {
				field1256 = arg0.method534();
			} else if (var2 == 16) {
				field1250 = true;
			} else if (var2 == 23) {
				field1270 = arg0.method531();
				field1242 = arg0.method530();
			} else if (var2 == 24) {
				field1278 = arg0.method531();
			} else if (var2 == 25) {
				field1275 = arg0.method531();
				field1236 = arg0.method530();
			} else if (var2 == 26) {
				field1251 = arg0.method531();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1271 == null) {
					field1271 = new String[5];
				}

				field1271[var2 - 30] = arg0.method536();
				if (field1271[var2 - 30].equalsIgnoreCase("hidden")) {
					field1271[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1235 == null) {
					field1235 = new String[5];
				}

				field1235[var2 - 35] = arg0.method536();
			} else if (var2 == 40) {
				int var3 = arg0.method529();
				field1241 = new int[var3];
				field1273 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1241[var4] = arg0.method531();
					field1273[var4] = arg0.method531();
				}
			} else if (var2 == 78) {
				field1279 = arg0.method531();
			} else if (var2 == 79) {
				field1259 = arg0.method531();
			} else if (var2 == 90) {
				field1265 = arg0.method531();
			} else if (var2 == 91) {
				field1263 = arg0.method531();
			} else if (var2 == 92) {
				field1247 = arg0.method531();
			} else if (var2 == 93) {
				field1260 = arg0.method531();
			} else if (var2 == 95) {
				field1272 = arg0.method531();
			} else if (var2 == 97) {
				field1237 = arg0.method531();
			} else if (var2 == 98) {
				field1240 = arg0.method531();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1245 == null) {
					field1245 = new int[10];
					field1234 = new int[10];
				}

				field1245[var2 - 100] = arg0.method531();
				field1234[var2 - 100] = arg0.method531();
			} else if (var2 == 110) {
				field1280 = arg0.method531();
			} else if (var2 == 111) {
				field1252 = arg0.method531();
			} else if (var2 == 112) {
				field1255 = arg0.method531();
			} else if (var2 == 113) {
				field1277 = arg0.method530();
			} else if (var2 == 114) {
				field1269 = arg0.method530() * 5;
			} else if (var2 == 115) {
				field1262 = arg0.method529();
			}
		}
	}

	@ObfuscatedName("SNJEZIDX.b(II)Z")
	public final boolean method488(int arg0) {
		int var2 = field1270;
		int var3 = field1278;
		int var4 = field1279;
		if (arg0 == 1) {
			var2 = field1275;
			var3 = field1251;
			var4 = field1259;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!OGORHYVW.method434(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !OGORHYVW.method434(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !OGORHYVW.method434(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("SNJEZIDX.c(II)LOGORHYVW;")
	public final OGORHYVW method489(int arg0) {
		int var2 = field1270;
		int var3 = field1278;
		int var4 = field1279;
		if (arg0 == 1) {
			var2 = field1275;
			var3 = field1251;
			var4 = field1259;
		}

		if (var2 == -1) {
			return null;
		}

		OGORHYVW var5 = OGORHYVW.method433(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				OGORHYVW var9 = OGORHYVW.method433(var3);
				OGORHYVW[] var10 = new OGORHYVW[] { var5, var9 };
				var5 = new OGORHYVW(2, var10);
			} else {
				OGORHYVW var6 = OGORHYVW.method433(var3);
				OGORHYVW var7 = OGORHYVW.method433(var4);
				OGORHYVW[] var8 = new OGORHYVW[] { var5, var6, var7 };
				var5 = new OGORHYVW(3, var8);
			}
		}

		if (arg0 == 0 && field1242 != 0) {
			var5.method446(field1242, 0, 0);
		}

		if (arg0 == 1 && field1236 != 0) {
			var5.method446(field1236, 0, 0);
		}

		if (field1241 != null) {
			for (int var11 = 0; var11 < field1241.length; var11++) {
				var5.method447(field1241[var11], field1273[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("SNJEZIDX.c(I)V")
	public void method490() {
		SNJEZIDX var1 = method482(field1240);
		field1274 = var1.field1274;
		field1267 = var1.field1267;
		field1264 = var1.field1264;
		field1248 = var1.field1248;
		field1272 = var1.field1272;
		field1233 = var1.field1233;
		field1268 = var1.field1268;
		field1241 = var1.field1241;
		field1273 = var1.field1273;
		SNJEZIDX var2 = method482(field1237);
		field1243 = var2.field1243;
		field1250 = var2.field1250;
		field1256 = var2.field1256;
		String var3 = "a";
		char var4 = var2.field1243.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1238 = ("Swap this note at any bank for " + var3 + " " + var2.field1243 + ".").getBytes();
		field1249 = true;
	}

	@ObfuscatedName("SNJEZIDX.d(II)LOGORHYVW;")
	public final OGORHYVW method491(int arg0) {
		int var2 = field1265;
		int var3 = field1247;
		if (arg0 == 1) {
			var2 = field1263;
			var3 = field1260;
		}

		if (var2 == -1) {
			return null;
		}

		OGORHYVW var4 = OGORHYVW.method433(var2);
		if (var3 != -1) {
			OGORHYVW var5 = OGORHYVW.method433(var3);
			OGORHYVW[] var6 = new OGORHYVW[] { var4, var5 };
			var4 = new OGORHYVW(2, var6);
		}

		if (field1241 != null) {
			for (int var7 = 0; var7 < field1241.length; var7++) {
				var4.method447(field1241[var7], field1273[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("SNJEZIDX.a(IIII)LLOVQYTIZ;")
	public static final LOVQYTIZ method492(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			LOVQYTIZ var3 = (LOVQYTIZ) field1276.method413(arg0);
			if (var3 != null && var3.field1058 != arg1 && var3.field1058 != -1) {
				var3.method588();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		SNJEZIDX var4 = method482(arg0);
		if (var4.field1245 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field1234[var6] && var4.field1234[var6] != 0) {
					var5 = var4.field1245[var6];
				}
			}

			if (var5 != -1) {
				var4 = method482(var5);
			}
		}

		OGORHYVW var7 = var4.method486(1);
		if (var7 == null) {
			return null;
		}

		LOVQYTIZ var8 = null;
		if (var4.field1240 != -1) {
			var8 = method492(var4.field1237, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		LOVQYTIZ var9 = new LOVQYTIZ(32, 32);
		int var10 = GHWCMNQP.field745;
		int var11 = GHWCMNQP.field746;
		int[] var12 = GHWCMNQP.field751;
		int[] var13 = IBBQNXJX.field815;
		int var14 = IBBQNXJX.field816;
		int var15 = IBBQNXJX.field817;
		int var16 = IBBQNXJX.field820;
		int var17 = IBBQNXJX.field821;
		int var18 = IBBQNXJX.field818;
		int var19 = IBBQNXJX.field819;
		GHWCMNQP.field743 = false;
		IBBQNXJX.method251(var9.field1052, 32, 32);
		IBBQNXJX.method256(0, 32, 0, 0, 32);
		GHWCMNQP.method227();
		int var20 = var4.field1267;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = GHWCMNQP.field749[var4.field1264] * var20 >> 16;
		int var22 = GHWCMNQP.field750[var4.field1264] * var20 >> 16;
		var7.method454(0, var4.field1248, var4.field1272, var4.field1264, var4.field1233, var7.field628 / 2 + var21 + var4.field1268, var4.field1268 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1052[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1052[var24 * 32 + var23 - 1] > 1) {
						var9.field1052[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1052[(var24 - 1) * 32 + var23] > 1) {
						var9.field1052[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1052[var24 * 32 + var23 + 1] > 1) {
						var9.field1052[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1052[(var24 + 1) * 32 + var23] > 1) {
						var9.field1052[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1052[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1052[var26 * 32 + var25 - 1] == 1) {
							var9.field1052[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field1052[(var26 - 1) * 32 + var25] == 1) {
							var9.field1052[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field1052[var26 * 32 + var25 + 1] == 1) {
							var9.field1052[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field1052[(var26 + 1) * 32 + var25] == 1) {
							var9.field1052[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1052[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1052[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1052[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1240 != -1) {
			int var29 = var8.field1057;
			int var30 = var8.field1058;
			var8.field1057 = 32;
			var8.field1058 = 32;
			var8.method400(0, 0);
			var8.field1057 = var29;
			var8.field1058 = var30;
		}

		if (arg2 == 0) {
			field1276.method414(var9, arg0);
		}

		IBBQNXJX.method251(var13, var14, var15);
		IBBQNXJX.method253(var18, var16, var17, var19);
		GHWCMNQP.field745 = var10;
		GHWCMNQP.field746 = var11;
		GHWCMNQP.field751 = var12;
		GHWCMNQP.field743 = true;

		if (var4.field1249) {
			var9.field1057 = 33;
		} else {
			var9.field1057 = 32;
		}

		var9.field1058 = arg1;
		return var9;
	}

	@ObfuscatedName("SNJEZIDX.a(LJUPFHAZZ;)V")
	public static final void method493(JUPFHAZZ arg0) {
		field1254 = new TKPFKOXP(arg0.method372("obj.dat", null));
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("obj.idx", null));
		field1246 = var1.method531();
		field1257 = new int[field1246];
		int var2 = 2;
		for (int var3 = 0; var3 < field1246; var3++) {
			field1257[var3] = var2;
			var2 += var1.method531();
		}

		field1261 = new SNJEZIDX[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1261[var4] = new SNJEZIDX();
		}
	}

	@ObfuscatedName("SNJEZIDX.a()V")
	public final void method494() {
		field1274 = 0;
		field1243 = null;
		field1238 = null;
		field1241 = null;
		field1273 = null;
		field1267 = 2000;
		field1264 = 0;
		field1248 = 0;
		field1272 = 0;
		field1233 = 0;
		field1268 = 0;
		field1266 = -1;
		field1249 = false;
		field1256 = 1;
		field1250 = false;
		field1271 = null;
		field1235 = null;
		field1270 = -1;
		field1278 = -1;
		field1242 = 0;
		field1275 = -1;
		field1251 = -1;
		field1236 = 0;
		field1279 = -1;
		field1259 = -1;
		field1265 = -1;
		field1247 = -1;
		field1263 = -1;
		field1260 = -1;
		field1245 = null;
		field1234 = null;
		field1237 = -1;
		field1240 = -1;
		field1280 = 128;
		field1252 = 128;
		field1255 = 128;
		field1277 = 0;
		field1269 = 0;
		field1262 = 0;
	}
}
