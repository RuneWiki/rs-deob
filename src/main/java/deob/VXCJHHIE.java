package deob;

@ObfuscatedName("VXCJHHIE")
public final class VXCJHHIE {

	@ObfuscatedName("VXCJHHIE.p")
	public int field1236 = -1;

	@ObfuscatedName("VXCJHHIE.q")
	public static BVBRKPZH field1237 = new BVBRKPZH(100);

	@ObfuscatedName("VXCJHHIE.E")
	public static boolean field1251 = true;

	@ObfuscatedName("VXCJHHIE.R")
	public static BVBRKPZH field1263 = new BVBRKPZH(50);

	@ObfuscatedName("VXCJHHIE.e")
	public byte field1226;

	@ObfuscatedName("VXCJHHIE.g")
	public byte field1228;

	@ObfuscatedName("VXCJHHIE.b")
	public static int field1225;

	@ObfuscatedName("VXCJHHIE.f")
	public int field1227;

	@ObfuscatedName("VXCJHHIE.h")
	public int field1229;

	@ObfuscatedName("VXCJHHIE.j")
	public int field1230;

	@ObfuscatedName("VXCJHHIE.k")
	public int field1231;

	@ObfuscatedName("VXCJHHIE.m")
	public int field1233;

	@ObfuscatedName("VXCJHHIE.o")
	public int field1235;

	@ObfuscatedName("VXCJHHIE.r")
	public int field1238;

	@ObfuscatedName("VXCJHHIE.s")
	public int field1239;

	@ObfuscatedName("VXCJHHIE.t")
	public int field1240;

	@ObfuscatedName("VXCJHHIE.v")
	public int field1242;

	@ObfuscatedName("VXCJHHIE.w")
	public int field1243;

	@ObfuscatedName("VXCJHHIE.x")
	public int field1244;

	@ObfuscatedName("VXCJHHIE.y")
	public int field1245;

	@ObfuscatedName("VXCJHHIE.B")
	public int field1248;

	@ObfuscatedName("VXCJHHIE.F")
	public int field1252;

	@ObfuscatedName("VXCJHHIE.I")
	public int field1255;

	@ObfuscatedName("VXCJHHIE.J")
	public int field1256;

	@ObfuscatedName("VXCJHHIE.L")
	public int field1258;

	@ObfuscatedName("VXCJHHIE.N")
	public int field1259;

	@ObfuscatedName("VXCJHHIE.P")
	public int field1261;

	@ObfuscatedName("VXCJHHIE.Q")
	public int field1262;

	@ObfuscatedName("VXCJHHIE.T")
	public int field1265;

	@ObfuscatedName("VXCJHHIE.U")
	public int field1266;

	@ObfuscatedName("VXCJHHIE.V")
	public int field1267;

	@ObfuscatedName("VXCJHHIE.W")
	public int field1268;

	@ObfuscatedName("VXCJHHIE.X")
	public static int field1269;

	@ObfuscatedName("VXCJHHIE.Y")
	public int field1270;

	@ObfuscatedName("VXCJHHIE.Z")
	public int field1271;

	@ObfuscatedName("VXCJHHIE.C")
	public static EMWAMCXW field1249;

	@ObfuscatedName("VXCJHHIE.D")
	public String field1250;

	@ObfuscatedName("VXCJHHIE.a")
	public boolean field1224;

	@ObfuscatedName("VXCJHHIE.G")
	public boolean field1253;

	@ObfuscatedName("VXCJHHIE.H")
	public byte[] field1254;

	@ObfuscatedName("VXCJHHIE.n")
	public int[] field1234;

	@ObfuscatedName("VXCJHHIE.u")
	public static int[] field1241;

	@ObfuscatedName("VXCJHHIE.z")
	public int[] field1246;

	@ObfuscatedName("VXCJHHIE.A")
	public int[] field1247;

	@ObfuscatedName("VXCJHHIE.S")
	public int[] field1264;

	@ObfuscatedName("VXCJHHIE.K")
	public static VXCJHHIE[] field1257;

	@ObfuscatedName("VXCJHHIE.l")
	public String[] field1232;

	@ObfuscatedName("VXCJHHIE.O")
	public String[] field1260;

	@ObfuscatedName("VXCJHHIE.a(II)Z")
	public final boolean method445(int arg0) {
		int var2 = field1258;
		int var3 = field1255;
		int var4 = field1266;
		if (arg0 == 1) {
			var2 = field1230;
			var3 = field1248;
			var4 = field1231;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!IEHKDFMR.method268(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !IEHKDFMR.method268(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !IEHKDFMR.method268(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("VXCJHHIE.a(IZII)LTFHGRYAS;")
	public static final TFHGRYAS method446(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			TFHGRYAS var3 = (TFHGRYAS) field1237.method25(arg1);
			if (var3 != null && var3.field1189 != arg0 && var3.field1189 != -1) {
				var3.method338();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		VXCJHHIE var4 = method447(arg1);
		if (var4.field1247 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field1246[var6] && var4.field1246[var6] != 0) {
					var5 = var4.field1247[var6];
				}
			}

			if (var5 != -1) {
				var4 = method447(var5);
			}
		}

		IEHKDFMR var7 = var4.method456(1);
		if (var7 == null) {
			return null;
		}

		TFHGRYAS var8 = null;
		if (var4.field1261 != -1) {
			var8 = method446(10, var4.field1244, -1);
			if (var8 == null) {
				return null;
			}
		}

		TFHGRYAS var9 = new TFHGRYAS(32, 32);
		int var10 = PTUBVHCT.field982;
		int var11 = PTUBVHCT.field983;
		int[] var12 = PTUBVHCT.field988;
		int[] var13 = ANTOHTCU.field48;
		int var14 = ANTOHTCU.field49;
		int var15 = ANTOHTCU.field50;
		int var16 = ANTOHTCU.field53;
		int var17 = ANTOHTCU.field54;
		int var18 = ANTOHTCU.field51;
		int var19 = ANTOHTCU.field52;
		PTUBVHCT.field980 = false;
		ANTOHTCU.method12(32, 32, var9.field1183);
		ANTOHTCU.method17(0, 0, 0, 32, 32);
		PTUBVHCT.method350();
		int var20 = var4.field1240;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = PTUBVHCT.field986[var4.field1235] * var20 >> 16;
		int var22 = PTUBVHCT.field987[var4.field1235] * var20 >> 16;
		var7.method288(0, var4.field1252, var4.field1229, var4.field1235, var4.field1256, var7.field605 / 2 + var21 + var4.field1243, var4.field1243 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1183[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1183[var24 * 32 + var23 - 1] > 1) {
						var9.field1183[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1183[(var24 - 1) * 32 + var23] > 1) {
						var9.field1183[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1183[var24 * 32 + var23 + 1] > 1) {
						var9.field1183[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1183[(var24 + 1) * 32 + var23] > 1) {
						var9.field1183[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1183[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1183[var26 * 32 + var25 - 1] == 1) {
							var9.field1183[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field1183[(var26 - 1) * 32 + var25] == 1) {
							var9.field1183[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field1183[var26 * 32 + var25 + 1] == 1) {
							var9.field1183[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field1183[(var26 + 1) * 32 + var25] == 1) {
							var9.field1183[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1183[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1183[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1183[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1261 != -1) {
			int var29 = var8.field1188;
			int var30 = var8.field1189;
			var8.field1188 = 32;
			var8.field1189 = 32;
			var8.method424(0, 0);
			var8.field1188 = var29;
			var8.field1189 = var30;
		}

		if (arg2 == 0) {
			field1237.method26(arg1, var9);
		}

		ANTOHTCU.method12(var14, var15, var13);
		ANTOHTCU.method14(var17, var18, var19, var16);
		PTUBVHCT.field982 = var10;
		PTUBVHCT.field983 = var11;
		PTUBVHCT.field988 = var12;
		PTUBVHCT.field980 = true;

		if (var4.field1253) {
			var9.field1188 = 33;
		} else {
			var9.field1188 = 32;
		}

		var9.field1189 = arg0;
		return var9;
	}

	@ObfuscatedName("VXCJHHIE.a(I)LVXCJHHIE;")
	public static final VXCJHHIE method447(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1257[var1].field1236 == arg0) {
				return field1257[var1];
			}
		}

		field1225 = (field1225 + 1) % 10;
		VXCJHHIE var2 = field1257[field1225];
		field1249.field617 = field1241[arg0];
		var2.field1236 = arg0;
		var2.method455();
		var2.method453(field1249);

		if (var2.field1261 != -1) {
			var2.method451();
		}

		if (!field1251 && var2.field1224) {
			var2.field1250 = "Members Object";
			var2.field1254 = "Login to a members' server to use this object.".getBytes();
			var2.field1260 = null;
			var2.field1232 = null;
			var2.field1271 = 0;
		}

		return var2;
	}

	@ObfuscatedName("VXCJHHIE.a(LMAARFNGV;)V")
	public static final void method448(MAARFNGV arg0) {
		field1249 = new EMWAMCXW(arg0.method332("obj.dat", null));
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("obj.idx", null));
		field1269 = var1.method219();
		field1241 = new int[field1269];
		int var2 = 2;
		for (int var3 = 0; var3 < field1269; var3++) {
			field1241[var3] = var2;
			var2 += var1.method219();
		}

		field1257 = new VXCJHHIE[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1257[var4] = new VXCJHHIE();
		}
	}

	@ObfuscatedName("VXCJHHIE.a(IB)Z")
	public final boolean method449(int arg0) {
		int var2 = field1227;
		int var3 = field1262;
		if (arg0 == 1) {
			var2 = field1270;
			var3 = field1242;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!IEHKDFMR.method268(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !IEHKDFMR.method268(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("VXCJHHIE.b(II)LIEHKDFMR;")
	public final IEHKDFMR method450(int arg0) {
		int var2 = field1258;
		int var3 = field1255;
		int var4 = field1266;
		if (arg0 == 1) {
			var2 = field1230;
			var3 = field1248;
			var4 = field1231;
		}

		if (var2 == -1) {
			return null;
		}

		IEHKDFMR var5 = IEHKDFMR.method267(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				IEHKDFMR var9 = IEHKDFMR.method267(var3);
				IEHKDFMR[] var10 = new IEHKDFMR[] { var5, var9 };
				var5 = new IEHKDFMR(var10, 2);
			} else {
				IEHKDFMR var6 = IEHKDFMR.method267(var3);
				IEHKDFMR var7 = IEHKDFMR.method267(var4);
				IEHKDFMR[] var8 = new IEHKDFMR[] { var5, var6, var7 };
				var5 = new IEHKDFMR(var8, 3);
			}
		}

		if (arg0 == 0 && field1226 != 0) {
			var5.method280(0, 0, field1226);
		}

		if (arg0 == 1 && field1228 != 0) {
			var5.method280(0, 0, field1228);
		}

		if (field1264 != null) {
			for (int var11 = 0; var11 < field1264.length; var11++) {
				var5.method281(field1264[var11], field1234[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("VXCJHHIE.a(Z)V")
	public void method451() {
		VXCJHHIE var1 = method447(field1261);
		field1233 = var1.field1233;
		field1240 = var1.field1240;
		field1235 = var1.field1235;
		field1252 = var1.field1252;
		field1229 = var1.field1229;
		field1256 = var1.field1256;
		field1243 = var1.field1243;
		field1264 = var1.field1264;
		field1234 = var1.field1234;
		VXCJHHIE var2 = method447(field1244);
		field1250 = var2.field1250;
		field1224 = var2.field1224;
		field1259 = var2.field1259;
		String var3 = "a";
		char var4 = var2.field1250.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1254 = ("Swap this note at any bank for " + var3 + " " + var2.field1250 + ".").getBytes();
		field1253 = true;
	}

	@ObfuscatedName("VXCJHHIE.c(II)LIEHKDFMR;")
	public final IEHKDFMR method452(int arg0) {
		int var2 = field1227;
		int var3 = field1262;
		if (arg0 == 1) {
			var2 = field1270;
			var3 = field1242;
		}

		if (var2 == -1) {
			return null;
		}

		IEHKDFMR var4 = IEHKDFMR.method267(var2);
		if (var3 != -1) {
			IEHKDFMR var5 = IEHKDFMR.method267(var3);
			IEHKDFMR[] var6 = new IEHKDFMR[] { var4, var5 };
			var4 = new IEHKDFMR(var6, 2);
		}

		if (field1264 != null) {
			for (int var7 = 0; var7 < field1264.length; var7++) {
				var4.method281(field1264[var7], field1234[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("VXCJHHIE.a(ILEMWAMCXW;)V")
	public final void method453(EMWAMCXW arg0) {
		while (true) {
			int var2 = arg0.method217();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1233 = arg0.method219();
			} else if (var2 == 2) {
				field1250 = arg0.method224();
			} else if (var2 == 3) {
				field1254 = arg0.method225();
			} else if (var2 == 4) {
				field1240 = arg0.method219();
			} else if (var2 == 5) {
				field1235 = arg0.method219();
			} else if (var2 == 6) {
				field1252 = arg0.method219();
			} else if (var2 == 7) {
				field1256 = arg0.method219();
				if (field1256 > 32767) {
					field1256 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1243 = arg0.method219();
				if (field1243 > 32767) {
					field1243 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1239 = arg0.method219();
			} else if (var2 == 11) {
				field1253 = true;
			} else if (var2 == 12) {
				field1259 = arg0.method222();
			} else if (var2 == 16) {
				field1224 = true;
			} else if (var2 == 23) {
				field1258 = arg0.method219();
				field1226 = arg0.method218();
			} else if (var2 == 24) {
				field1255 = arg0.method219();
			} else if (var2 == 25) {
				field1230 = arg0.method219();
				field1228 = arg0.method218();
			} else if (var2 == 26) {
				field1248 = arg0.method219();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1260 == null) {
					field1260 = new String[5];
				}

				field1260[var2 - 30] = arg0.method224();
				if (field1260[var2 - 30].equalsIgnoreCase("hidden")) {
					field1260[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1232 == null) {
					field1232 = new String[5];
				}

				field1232[var2 - 35] = arg0.method224();
			} else if (var2 == 40) {
				int var3 = arg0.method217();
				field1264 = new int[var3];
				field1234 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1264[var4] = arg0.method219();
					field1234[var4] = arg0.method219();
				}
			} else if (var2 == 78) {
				field1266 = arg0.method219();
			} else if (var2 == 79) {
				field1231 = arg0.method219();
			} else if (var2 == 90) {
				field1227 = arg0.method219();
			} else if (var2 == 91) {
				field1270 = arg0.method219();
			} else if (var2 == 92) {
				field1262 = arg0.method219();
			} else if (var2 == 93) {
				field1242 = arg0.method219();
			} else if (var2 == 95) {
				field1229 = arg0.method219();
			} else if (var2 == 97) {
				field1244 = arg0.method219();
			} else if (var2 == 98) {
				field1261 = arg0.method219();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1247 == null) {
					field1247 = new int[10];
					field1246 = new int[10];
				}

				field1247[var2 - 100] = arg0.method219();
				field1246[var2 - 100] = arg0.method219();
			} else if (var2 == 110) {
				field1265 = arg0.method219();
			} else if (var2 == 111) {
				field1268 = arg0.method219();
			} else if (var2 == 112) {
				field1245 = arg0.method219();
			} else if (var2 == 113) {
				field1267 = arg0.method218();
			} else if (var2 == 114) {
				field1238 = arg0.method218() * 5;
			} else if (var2 == 115) {
				field1271 = arg0.method217();
			}
		}
	}

	@ObfuscatedName("VXCJHHIE.d(II)LIEHKDFMR;")
	public final IEHKDFMR method454(int arg0) {
		if (field1247 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1246[var3] && field1246[var3] != 0) {
					var2 = field1247[var3];
				}
			}

			if (var2 != -1) {
				return method447(var2).method454(1);
			}
		}

		IEHKDFMR var4 = IEHKDFMR.method267(field1233);
		if (var4 == null) {
			return null;
		}

		if (field1264 != null) {
			for (int var5 = 0; var5 < field1264.length; var5++) {
				var4.method281(field1264[var5], field1234[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("VXCJHHIE.a()V")
	public final void method455() {
		field1233 = 0;
		field1250 = null;
		field1254 = null;
		field1264 = null;
		field1234 = null;
		field1240 = 2000;
		field1235 = 0;
		field1252 = 0;
		field1229 = 0;
		field1256 = 0;
		field1243 = 0;
		field1239 = -1;
		field1253 = false;
		field1259 = 1;
		field1224 = false;
		field1260 = null;
		field1232 = null;
		field1258 = -1;
		field1255 = -1;
		field1226 = 0;
		field1230 = -1;
		field1248 = -1;
		field1228 = 0;
		field1266 = -1;
		field1231 = -1;
		field1227 = -1;
		field1262 = -1;
		field1270 = -1;
		field1242 = -1;
		field1247 = null;
		field1246 = null;
		field1244 = -1;
		field1261 = -1;
		field1265 = 128;
		field1268 = 128;
		field1245 = 128;
		field1267 = 0;
		field1238 = 0;
		field1271 = 0;
	}

	@ObfuscatedName("VXCJHHIE.b(I)LIEHKDFMR;")
	public final IEHKDFMR method456(int arg0) {
		if (field1247 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1246[var3] && field1246[var3] != 0) {
					var2 = field1247[var3];
				}
			}

			if (var2 != -1) {
				return method447(var2).method456(1);
			}
		}

		IEHKDFMR var4 = (IEHKDFMR) field1263.method25(field1236);
		if (var4 != null) {
			return var4;
		}

		IEHKDFMR var5 = IEHKDFMR.method267(field1233);
		if (var5 == null) {
			return null;
		}

		if (field1265 != 128 || field1268 != 128 || field1245 != 128) {
			var5.method283(field1245, field1268, field1265);
		}

		if (field1264 != null) {
			for (int var6 = 0; var6 < field1264.length; var6++) {
				var5.method281(field1264[var6], field1234[var6]);
			}
		}

		var5.method284(field1267 + 64, field1238 + 768, -50, -10, -50, true);
		var5.field695 = true;
		field1263.method26(field1236, var5);
		return var5;
	}

	@ObfuscatedName("VXCJHHIE.b(Z)V")
	public static final void method457() {
		field1263 = null;
		field1237 = null;
		field1241 = null;
		field1257 = null;
		field1249 = null;
	}
}
