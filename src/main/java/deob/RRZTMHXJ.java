package deob;

@ObfuscatedName("RRZTMHXJ")
public final class RRZTMHXJ {

	@ObfuscatedName("RRZTMHXJ.d")
	public boolean field1278 = false;

	@ObfuscatedName("RRZTMHXJ.f")
	public int field1280 = -1;

	@ObfuscatedName("RRZTMHXJ.j")
	public int field1282 = 32;

	@ObfuscatedName("RRZTMHXJ.m")
	public int field1285 = -1;

	@ObfuscatedName("RRZTMHXJ.o")
	public int field1287 = -1;

	@ObfuscatedName("RRZTMHXJ.p")
	public int field1288 = -1;

	@ObfuscatedName("RRZTMHXJ.r")
	public byte field1290 = 1;

	@ObfuscatedName("RRZTMHXJ.s")
	public int field1291 = -1;

	@ObfuscatedName("RRZTMHXJ.t")
	public int field1292 = -1;

	@ObfuscatedName("RRZTMHXJ.v")
	public int field1293 = 128;

	@ObfuscatedName("RRZTMHXJ.w")
	public long field1294 = -1L;

	@ObfuscatedName("RRZTMHXJ.x")
	public int field1295 = -1;

	@ObfuscatedName("RRZTMHXJ.y")
	public int field1296 = 128;

	@ObfuscatedName("RRZTMHXJ.A")
	public int field1298 = -1;

	@ObfuscatedName("RRZTMHXJ.E")
	public boolean field1301 = true;

	@ObfuscatedName("RRZTMHXJ.G")
	public int field1303 = -1;

	@ObfuscatedName("RRZTMHXJ.H")
	public int field1304 = -1;

	@ObfuscatedName("RRZTMHXJ.J")
	public int field1306 = -1;

	@ObfuscatedName("RRZTMHXJ.M")
	public int field1309 = -1;

	@ObfuscatedName("RRZTMHXJ.b")
	public static JETHVCIV field1276 = new JETHVCIV(30);

	@ObfuscatedName("RRZTMHXJ.a")
	public static int field1275;

	@ObfuscatedName("RRZTMHXJ.z")
	public static int field1297;

	@ObfuscatedName("RRZTMHXJ.I")
	public int field1305;

	@ObfuscatedName("RRZTMHXJ.L")
	public int field1308;

	@ObfuscatedName("RRZTMHXJ.g")
	public static BJPWOXRJ field1281;

	@ObfuscatedName("RRZTMHXJ.q")
	public static client field1289;

	@ObfuscatedName("RRZTMHXJ.n")
	public String field1286;

	@ObfuscatedName("RRZTMHXJ.K")
	public byte[] field1307;

	@ObfuscatedName("RRZTMHXJ.c")
	public int[] field1277;

	@ObfuscatedName("RRZTMHXJ.e")
	public int[] field1279;

	@ObfuscatedName("RRZTMHXJ.k")
	public int[] field1283;

	@ObfuscatedName("RRZTMHXJ.D")
	public static int[] field1300;

	@ObfuscatedName("RRZTMHXJ.F")
	public int[] field1302;

	@ObfuscatedName("RRZTMHXJ.N")
	public int[] field1310;

	@ObfuscatedName("RRZTMHXJ.C")
	public static RRZTMHXJ[] field1299;

	@ObfuscatedName("RRZTMHXJ.l")
	public String[] field1284;

	@ObfuscatedName("RRZTMHXJ.a(ILBJPWOXRJ;)V")
	public final void method482(BJPWOXRJ arg0) {
		while (true) {
			int var2 = arg0.method15();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method15();
				field1302 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1302[var4] = arg0.method17();
				}
			} else if (var2 == 2) {
				field1286 = arg0.method22();
			} else if (var2 == 3) {
				field1307 = arg0.method23();
			} else if (var2 == 12) {
				field1290 = arg0.method16();
			} else if (var2 == 13) {
				field1287 = arg0.method17();
			} else if (var2 == 14) {
				field1298 = arg0.method17();
			} else if (var2 == 17) {
				field1298 = arg0.method17();
				field1303 = arg0.method17();
				field1309 = arg0.method17();
				field1288 = arg0.method17();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1284 == null) {
					field1284 = new String[5];
				}

				field1284[var2 - 30] = arg0.method22();
				if (field1284[var2 - 30].equalsIgnoreCase("hidden")) {
					field1284[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method15();
				field1310 = new int[var5];
				field1277 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1310[var6] = arg0.method17();
					field1277[var6] = arg0.method17();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method15();
				field1279 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1279[var8] = arg0.method17();
				}
			} else if (var2 == 90) {
				field1304 = arg0.method17();
			} else if (var2 == 91) {
				field1291 = arg0.method17();
			} else if (var2 == 92) {
				field1306 = arg0.method17();
			} else if (var2 == 93) {
				field1301 = false;
			} else if (var2 == 95) {
				field1292 = arg0.method17();
			} else if (var2 == 97) {
				field1293 = arg0.method17();
			} else if (var2 == 98) {
				field1296 = arg0.method17();
			} else if (var2 == 99) {
				field1278 = true;
			} else if (var2 == 100) {
				field1308 = arg0.method16();
			} else if (var2 == 101) {
				field1305 = arg0.method16() * 5;
			} else if (var2 == 102) {
				field1280 = arg0.method17();
			} else if (var2 == 103) {
				field1282 = arg0.method17();
			} else if (var2 == 106) {
				field1285 = arg0.method17();
				if (field1285 == 0xFFFF) {
					field1285 = -1;
				}

				field1295 = arg0.method17();
				if (field1295 == 0xFFFF) {
					field1295 = -1;
				}

				int var9 = arg0.method15();
				field1283 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1283[var10] = arg0.method17();
					if (field1283[var10] == 0xFFFF) {
						field1283[var10] = -1;
					}
				}
			}
		}
	}

	@ObfuscatedName("RRZTMHXJ.a(LMNPBQFWE;)V")
	public static final void method483(MNPBQFWE arg0) {
		field1281 = new BJPWOXRJ(arg0.method429("npc.dat", null));
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("npc.idx", null));
		field1297 = var1.method17();
		field1300 = new int[field1297];
		int var2 = 2;
		for (int var3 = 0; var3 < field1297; var3++) {
			field1300[var3] = var2;
			var2 += var1.method17();
		}

		field1299 = new RRZTMHXJ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1299[var4] = new RRZTMHXJ();
		}
	}

	@ObfuscatedName("RRZTMHXJ.a(B)V")
	public static final void method484() {
		field1276 = null;
		field1300 = null;
		field1299 = null;
		field1281 = null;
	}

	@ObfuscatedName("RRZTMHXJ.a([IIII)LJLNSJQDR;")
	public final JLNSJQDR method485(int[] arg0, int arg1, int arg2) {
		if (field1283 != null) {
			RRZTMHXJ var4 = method487();
			if (var4 == null) {
				return null;
			}

			return var4.method485(arg0, arg1, arg2);
		}

		JLNSJQDR var5 = (JLNSJQDR) field1276.method315(field1294);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1302.length; var7++) {
				if (!JLNSJQDR.method329(field1302[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			JLNSJQDR[] var8 = new JLNSJQDR[field1302.length];
			for (int var9 = 0; var9 < field1302.length; var9++) {
				var8[var9] = JLNSJQDR.method328(field1302[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new JLNSJQDR(var8.length, var8);
			}

			if (field1310 != null) {
				for (int var10 = 0; var10 < field1310.length; var10++) {
					var5.method342(field1310[var10], field1277[var10]);
				}
			}

			var5.method335();
			var5.method345(field1308 + 64, field1305 + 850, -30, -50, -30, true);
			field1276.method316(var5, field1294);
		}

		JLNSJQDR var11 = JLNSJQDR.field817;
		var11.method330(var5, UIZESDZR.method524(arg1) & UIZESDZR.method524(arg2));

		if (arg1 != -1 && arg2 != -1) {
			var11.method337(arg0, arg1, arg2);
		} else if (arg1 != -1) {
			var11.method336(arg1);
		}

		if (field1293 != 128 || field1296 != 128) {
			var11.method344(field1293, field1296, field1293);
		}

		var11.method332();
		var11.field854 = null;
		var11.field853 = null;

		if (field1290 == 1) {
			var11.field855 = true;
		}

		return var11;
	}

	@ObfuscatedName("RRZTMHXJ.a(I)LJLNSJQDR;")
	public final JLNSJQDR method486() {
		if (field1283 != null) {
			RRZTMHXJ var1 = method487();
			if (var1 == null) {
				return null;
			}

			return var1.method486();
		} else if (field1279 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1279.length; var3++) {
				if (!JLNSJQDR.method329(field1279[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			JLNSJQDR[] var4 = new JLNSJQDR[field1279.length];
			for (int var5 = 0; var5 < field1279.length; var5++) {
				var4[var5] = JLNSJQDR.method328(field1279[var5]);
			}

			JLNSJQDR var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new JLNSJQDR(var4.length, var4);
			}

			if (field1310 != null) {
				for (int var7 = 0; var7 < field1310.length; var7++) {
					var6.method342(field1310[var7], field1277[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("RRZTMHXJ.b(I)LRRZTMHXJ;")
	public final RRZTMHXJ method487() {
		int var1 = -1;
		if (field1285 != -1) {
			BUYMNSFH var2 = BUYMNSFH.field20[field1285];
			int var3 = var2.field22;
			int var4 = var2.field23;
			int var5 = var2.field24;
			int var6 = client.field123[var5 - var4];
			var1 = field1289.field41[var3] >> var4 & var6;
		} else if (field1295 != -1) {
			var1 = field1289.field41[field1295];
		}

		if (var1 >= 0 && var1 < field1283.length && field1283[var1] != -1) {
			return method488(field1283[var1]);
		}

		return null;
	}

	@ObfuscatedName("RRZTMHXJ.c(I)LRRZTMHXJ;")
	public static final RRZTMHXJ method488(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1299[var1].field1294) {
				return field1299[var1];
			}
		}

		field1275 = (field1275 + 1) % 20;
		RRZTMHXJ var2 = field1299[field1275] = new RRZTMHXJ();
		field1281.field5 = field1300[arg0];
		var2.field1294 = arg0;
		var2.method482(field1281);
		return var2;
	}
}
