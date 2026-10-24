package deob;

@ObfuscatedName("WHKCNEXD")
public final class WHKCNEXD {

	@ObfuscatedName("WHKCNEXD.b")
	public boolean field1312 = true;

	@ObfuscatedName("WHKCNEXD.f")
	public int field1315 = -1;

	@ObfuscatedName("WHKCNEXD.h")
	public int field1317 = -1;

	@ObfuscatedName("WHKCNEXD.j")
	public boolean field1318 = false;

	@ObfuscatedName("WHKCNEXD.k")
	public int field1319 = -1;

	@ObfuscatedName("WHKCNEXD.l")
	public int field1320 = -1;

	@ObfuscatedName("WHKCNEXD.n")
	public int field1322 = -1;

	@ObfuscatedName("WHKCNEXD.o")
	public int field1323 = 32;

	@ObfuscatedName("WHKCNEXD.s")
	public int field1326 = -1;

	@ObfuscatedName("WHKCNEXD.t")
	public int field1327 = -1;

	@ObfuscatedName("WHKCNEXD.u")
	public boolean field1328 = true;

	@ObfuscatedName("WHKCNEXD.v")
	public long field1329 = -1L;

	@ObfuscatedName("WHKCNEXD.z")
	public int field1333 = -1;

	@ObfuscatedName("WHKCNEXD.A")
	public int field1334 = -1;

	@ObfuscatedName("WHKCNEXD.D")
	public int field1337 = -1;

	@ObfuscatedName("WHKCNEXD.E")
	public int field1338 = -1;

	@ObfuscatedName("WHKCNEXD.F")
	public int field1339 = 128;

	@ObfuscatedName("WHKCNEXD.H")
	public int field1341 = -1;

	@ObfuscatedName("WHKCNEXD.J")
	public byte field1343 = 1;

	@ObfuscatedName("WHKCNEXD.M")
	public int field1346 = 128;

	@ObfuscatedName("WHKCNEXD.w")
	public static WMYPWVZI field1330 = new WMYPWVZI(30);

	@ObfuscatedName("WHKCNEXD.g")
	public int field1316;

	@ObfuscatedName("WHKCNEXD.q")
	public static int field1325;

	@ObfuscatedName("WHKCNEXD.G")
	public static int field1340;

	@ObfuscatedName("WHKCNEXD.L")
	public int field1345;

	@ObfuscatedName("WHKCNEXD.K")
	public static IMUIZRAF field1344;

	@ObfuscatedName("WHKCNEXD.d")
	public static client field1313;

	@ObfuscatedName("WHKCNEXD.x")
	public String field1331;

	@ObfuscatedName("WHKCNEXD.p")
	public byte[] field1324;

	@ObfuscatedName("WHKCNEXD.a")
	public static int[] field1311;

	@ObfuscatedName("WHKCNEXD.e")
	public int[] field1314;

	@ObfuscatedName("WHKCNEXD.m")
	public int[] field1321;

	@ObfuscatedName("WHKCNEXD.y")
	public int[] field1332;

	@ObfuscatedName("WHKCNEXD.C")
	public int[] field1336;

	@ObfuscatedName("WHKCNEXD.I")
	public int[] field1342;

	@ObfuscatedName("WHKCNEXD.B")
	public static WHKCNEXD[] field1335;

	@ObfuscatedName("WHKCNEXD.N")
	public String[] field1347;

	@ObfuscatedName("WHKCNEXD.a(I)V")
	public static final void method516() {
		field1330 = null;
		field1311 = null;
		field1335 = null;
		field1344 = null;
	}

	@ObfuscatedName("WHKCNEXD.a(LBYZSQZUF;)V")
	public static final void method517(BYZSQZUF arg0) {
		field1344 = new IMUIZRAF(arg0.method29("npc.dat", null));
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("npc.idx", null));
		field1340 = var1.method240();
		field1311 = new int[field1340];
		int var2 = 2;
		for (int var3 = 0; var3 < field1340; var3++) {
			field1311[var3] = var2;
			var2 += var1.method240();
		}

		field1335 = new WHKCNEXD[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1335[var4] = new WHKCNEXD();
		}
	}

	@ObfuscatedName("WHKCNEXD.b(I)LWHKCNEXD;")
	public final WHKCNEXD method518() {
		int var1 = -1;
		if (field1337 != -1) {
			AFWJXAMU var2 = AFWJXAMU.field10[field1337];
			int var3 = var2.field12;
			int var4 = var2.field13;
			int var5 = var2.field14;
			int var6 = client.field259[var5 - var4];
			var1 = field1313.field187[var3] >> var4 & var6;
		} else if (field1334 != -1) {
			var1 = field1313.field187[field1334];
		}

		if (var1 >= 0 && var1 < field1332.length && field1332[var1] != -1) {
			return method521(field1332[var1]);
		}

		return null;
	}

	@ObfuscatedName("WHKCNEXD.c(I)Z")
	public boolean method519() {
		if (field1332 == null) {
			return true;
		}

		int var1 = -1;
		if (field1337 != -1) {
			AFWJXAMU var2 = AFWJXAMU.field10[field1337];
			int var3 = var2.field12;
			int var4 = var2.field13;
			int var5 = var2.field14;
			int var6 = client.field259[var5 - var4];
			var1 = field1313.field187[var3] >> var4 & var6;
		} else if (field1334 != -1) {
			var1 = field1313.field187[field1334];
		}

		if (var1 >= 0 && var1 < field1332.length && field1332[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("WHKCNEXD.a([IZII)LYABPKWWG;")
	public final YABPKWWG method520(int[] arg0, int arg1, int arg2) {
		if (field1332 != null) {
			WHKCNEXD var4 = method518();
			if (var4 == null) {
				return null;
			}

			return var4.method520(arg0, arg1, arg2);
		}

		YABPKWWG var5 = (YABPKWWG) field1330.method525(field1329);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1336.length; var7++) {
				if (!YABPKWWG.method549(field1336[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			YABPKWWG[] var8 = new YABPKWWG[field1336.length];
			for (int var9 = 0; var9 < field1336.length; var9++) {
				var8[var9] = YABPKWWG.method548(field1336[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new YABPKWWG(var8, var8.length);
			}

			if (field1342 != null) {
				for (int var10 = 0; var10 < field1342.length; var10++) {
					var5.method562(field1342[var10], field1314[var10]);
				}
			}

			var5.method555();
			var5.method565(field1316 + 64, field1345 + 850, -30, -50, -30, true);
			field1330.method526(field1329, var5);
		}

		YABPKWWG var11 = YABPKWWG.field1378;
		var11.method550(var5, HQHBJEDA.method219(arg1) & HQHBJEDA.method219(arg2));

		if (arg1 != -1 && arg2 != -1) {
			var11.method557(arg0, arg2, arg1);
		} else if (arg1 != -1) {
			var11.method556(arg1);
		}

		if (field1339 != 128 || field1346 != 128) {
			var11.method564(field1346, field1339, field1339);
		}

		var11.method552();
		var11.field1415 = null;
		var11.field1414 = null;

		if (field1343 == 1) {
			var11.field1416 = true;
		}

		return var11;
	}

	@ObfuscatedName("WHKCNEXD.d(I)LWHKCNEXD;")
	public static final WHKCNEXD method521(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1335[var1].field1329) {
				return field1335[var1];
			}
		}

		field1325 = (field1325 + 1) % 20;
		WHKCNEXD var2 = field1335[field1325] = new WHKCNEXD();
		field1344.field714 = field1311[arg0];
		var2.field1329 = arg0;
		var2.method523(field1344);
		return var2;
	}

	@ObfuscatedName("WHKCNEXD.a(B)LYABPKWWG;")
	public final YABPKWWG method522() {
		if (field1332 != null) {
			WHKCNEXD var1 = method518();
			if (var1 == null) {
				return null;
			}

			return var1.method522();
		} else if (field1321 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1321.length; var3++) {
				if (!YABPKWWG.method549(field1321[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			YABPKWWG[] var4 = new YABPKWWG[field1321.length];
			for (int var5 = 0; var5 < field1321.length; var5++) {
				var4[var5] = YABPKWWG.method548(field1321[var5]);
			}

			YABPKWWG var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new YABPKWWG(var4, var4.length);
			}

			if (field1342 != null) {
				for (int var7 = 0; var7 < field1342.length; var7++) {
					var6.method562(field1342[var7], field1314[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("WHKCNEXD.a(ILIMUIZRAF;)V")
	public final void method523(IMUIZRAF arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method238();
				field1336 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1336[var4] = arg0.method240();
				}
			} else if (var2 == 2) {
				field1331 = arg0.method245();
			} else if (var2 == 3) {
				field1324 = arg0.method246();
			} else if (var2 == 12) {
				field1343 = arg0.method239();
			} else if (var2 == 13) {
				field1317 = arg0.method240();
			} else if (var2 == 14) {
				field1315 = arg0.method240();
			} else if (var2 == 17) {
				field1315 = arg0.method240();
				field1327 = arg0.method240();
				field1333 = arg0.method240();
				field1319 = arg0.method240();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1347 == null) {
					field1347 = new String[5];
				}

				field1347[var2 - 30] = arg0.method245();
				if (field1347[var2 - 30].equalsIgnoreCase("hidden")) {
					field1347[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method238();
				field1342 = new int[var5];
				field1314 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1342[var6] = arg0.method240();
					field1314[var6] = arg0.method240();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method238();
				field1321 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1321[var8] = arg0.method240();
				}
			} else if (var2 == 90) {
				field1341 = arg0.method240();
			} else if (var2 == 91) {
				field1320 = arg0.method240();
			} else if (var2 == 92) {
				field1326 = arg0.method240();
			} else if (var2 == 93) {
				field1312 = false;
			} else if (var2 == 95) {
				field1322 = arg0.method240();
			} else if (var2 == 97) {
				field1339 = arg0.method240();
			} else if (var2 == 98) {
				field1346 = arg0.method240();
			} else if (var2 == 99) {
				field1318 = true;
			} else if (var2 == 100) {
				field1316 = arg0.method239();
			} else if (var2 == 101) {
				field1345 = arg0.method239() * 5;
			} else if (var2 == 102) {
				field1338 = arg0.method240();
			} else if (var2 == 103) {
				field1323 = arg0.method240();
			} else if (var2 == 106) {
				field1337 = arg0.method240();
				if (field1337 == 0xFFFF) {
					field1337 = -1;
				}

				field1334 = arg0.method240();
				if (field1334 == 0xFFFF) {
					field1334 = -1;
				}

				int var9 = arg0.method238();
				field1332 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1332[var10] = arg0.method240();
					if (field1332[var10] == 0xFFFF) {
						field1332[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1328 = false;
			}
		}
	}
}
