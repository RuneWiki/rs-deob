package deob;

@ObfuscatedName("WGKWQDPM")
public final class WGKWQDPM {

	@ObfuscatedName("WGKWQDPM.h")
	public int field1307 = -1;

	@ObfuscatedName("WGKWQDPM.b")
	public static boolean field1301 = true;

	@ObfuscatedName("WGKWQDPM.o")
	public static THJKANXW field1314 = new THJKANXW(50);

	@ObfuscatedName("WGKWQDPM.x")
	public static THJKANXW field1323 = new THJKANXW(100);

	@ObfuscatedName("WGKWQDPM.B")
	public byte field1327;

	@ObfuscatedName("WGKWQDPM.I")
	public byte field1334;

	@ObfuscatedName("WGKWQDPM.a")
	public int field1300;

	@ObfuscatedName("WGKWQDPM.c")
	public int field1302;

	@ObfuscatedName("WGKWQDPM.d")
	public int field1303;

	@ObfuscatedName("WGKWQDPM.e")
	public int field1304;

	@ObfuscatedName("WGKWQDPM.f")
	public int field1305;

	@ObfuscatedName("WGKWQDPM.g")
	public int field1306;

	@ObfuscatedName("WGKWQDPM.i")
	public static int field1308;

	@ObfuscatedName("WGKWQDPM.j")
	public int field1309;

	@ObfuscatedName("WGKWQDPM.l")
	public int field1311;

	@ObfuscatedName("WGKWQDPM.m")
	public int field1312;

	@ObfuscatedName("WGKWQDPM.n")
	public int field1313;

	@ObfuscatedName("WGKWQDPM.p")
	public int field1315;

	@ObfuscatedName("WGKWQDPM.q")
	public int field1316;

	@ObfuscatedName("WGKWQDPM.s")
	public int field1318;

	@ObfuscatedName("WGKWQDPM.u")
	public int field1320;

	@ObfuscatedName("WGKWQDPM.y")
	public int field1324;

	@ObfuscatedName("WGKWQDPM.z")
	public int field1325;

	@ObfuscatedName("WGKWQDPM.D")
	public int field1329;

	@ObfuscatedName("WGKWQDPM.H")
	public static int field1333;

	@ObfuscatedName("WGKWQDPM.J")
	public int field1335;

	@ObfuscatedName("WGKWQDPM.K")
	public int field1336;

	@ObfuscatedName("WGKWQDPM.L")
	public int field1337;

	@ObfuscatedName("WGKWQDPM.M")
	public int field1338;

	@ObfuscatedName("WGKWQDPM.N")
	public int field1339;

	@ObfuscatedName("WGKWQDPM.O")
	public int field1340;

	@ObfuscatedName("WGKWQDPM.S")
	public int field1344;

	@ObfuscatedName("WGKWQDPM.T")
	public int field1345;

	@ObfuscatedName("WGKWQDPM.U")
	public int field1346;

	@ObfuscatedName("WGKWQDPM.W")
	public int field1347;

	@ObfuscatedName("WGKWQDPM.v")
	public static LBBVYYXO field1321;

	@ObfuscatedName("WGKWQDPM.Q")
	public String field1342;

	@ObfuscatedName("WGKWQDPM.F")
	public boolean field1331;

	@ObfuscatedName("WGKWQDPM.R")
	public boolean field1343;

	@ObfuscatedName("WGKWQDPM.w")
	public byte[] field1322;

	@ObfuscatedName("WGKWQDPM.t")
	public int[] field1319;

	@ObfuscatedName("WGKWQDPM.A")
	public int[] field1326;

	@ObfuscatedName("WGKWQDPM.E")
	public static int[] field1330;

	@ObfuscatedName("WGKWQDPM.G")
	public int[] field1332;

	@ObfuscatedName("WGKWQDPM.P")
	public int[] field1341;

	@ObfuscatedName("WGKWQDPM.r")
	public static WGKWQDPM[] field1317;

	@ObfuscatedName("WGKWQDPM.k")
	public String[] field1310;

	@ObfuscatedName("WGKWQDPM.C")
	public String[] field1328;

	@ObfuscatedName("WGKWQDPM.a(BI)LCYPZUKMB;")
	public final CYPZUKMB method549(int arg0) {
		int var2 = field1313;
		int var3 = field1316;
		if (arg0 == 1) {
			var2 = field1339;
			var3 = field1315;
		}

		if (var2 == -1) {
			return null;
		}

		CYPZUKMB var4 = CYPZUKMB.method196(var2);
		if (var3 != -1) {
			CYPZUKMB var5 = CYPZUKMB.method196(var3);
			CYPZUKMB[] var6 = new CYPZUKMB[] { var4, var5 };
			var4 = new CYPZUKMB(var6, 2);
		}

		if (field1332 != null) {
			for (int var7 = 0; var7 < field1332.length; var7++) {
				var4.method210(field1332[var7], field1326[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("WGKWQDPM.a(II)Z")
	public final boolean method550(int arg0) {
		int var2 = field1347;
		int var3 = field1340;
		int var4 = field1346;
		if (arg0 == 1) {
			var2 = field1344;
			var3 = field1300;
			var4 = field1305;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!CYPZUKMB.method197(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !CYPZUKMB.method197(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !CYPZUKMB.method197(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("WGKWQDPM.a(I)LCYPZUKMB;")
	public final CYPZUKMB method551(int arg0) {
		if (field1319 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1341[var3] && field1341[var3] != 0) {
					var2 = field1319[var3];
				}
			}

			if (var2 != -1) {
				return method554(var2).method551(1);
			}
		}

		CYPZUKMB var4 = (CYPZUKMB) field1314.method529(field1307);
		if (var4 != null) {
			return var4;
		}

		CYPZUKMB var5 = CYPZUKMB.method196(field1306);
		if (var5 == null) {
			return null;
		}

		if (field1324 != 128 || field1304 != 128 || field1320 != 128) {
			var5.method212(field1324, field1304, field1320);
		}

		if (field1332 != null) {
			for (int var6 = 0; var6 < field1332.length; var6++) {
				var5.method210(field1332[var6], field1326[var6]);
			}
		}

		var5.method213(field1309 + 64, field1329 + 768, -50, -10, -50, true);
		var5.field575 = true;
		field1314.method530(field1307, var5);
		return var5;
	}

	@ObfuscatedName("WGKWQDPM.a()V")
	public final void method552() {
		field1306 = 0;
		field1342 = null;
		field1322 = null;
		field1332 = null;
		field1326 = null;
		field1303 = 2000;
		field1338 = 0;
		field1325 = 0;
		field1336 = 0;
		field1335 = 0;
		field1318 = 0;
		field1345 = -1;
		field1343 = false;
		field1312 = 1;
		field1331 = false;
		field1328 = null;
		field1310 = null;
		field1347 = -1;
		field1340 = -1;
		field1327 = 0;
		field1344 = -1;
		field1300 = -1;
		field1334 = 0;
		field1346 = -1;
		field1305 = -1;
		field1313 = -1;
		field1316 = -1;
		field1339 = -1;
		field1315 = -1;
		field1319 = null;
		field1341 = null;
		field1311 = -1;
		field1337 = -1;
		field1324 = 128;
		field1304 = 128;
		field1320 = 128;
		field1309 = 0;
		field1329 = 0;
		field1302 = 0;
	}

	@ObfuscatedName("WGKWQDPM.a(IIII)LVZJVQLEE;")
	public static final VZJVQLEE method553(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			VZJVQLEE var3 = (VZJVQLEE) field1323.method529(arg1);
			if (var3 != null && var3.field1299 != arg0 && var3.field1299 != -1) {
				var3.method464();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		WGKWQDPM var4 = method554(arg1);
		if (var4.field1319 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field1341[var6] && var4.field1341[var6] != 0) {
					var5 = var4.field1319[var6];
				}
			}

			if (var5 != -1) {
				var4 = method554(var5);
			}
		}

		CYPZUKMB var7 = var4.method551(1);
		if (var7 == null) {
			return null;
		}

		VZJVQLEE var8 = null;
		if (var4.field1337 != -1) {
			var8 = method553(10, var4.field1311, -1);
			if (var8 == null) {
				return null;
			}
		}

		VZJVQLEE var9 = new VZJVQLEE(32, 32);
		int var10 = CUNPUNFW.field511;
		int var11 = CUNPUNFW.field512;
		int[] var12 = CUNPUNFW.field517;
		int[] var13 = GBJWVQAY.field820;
		int var14 = GBJWVQAY.field821;
		int var15 = GBJWVQAY.field822;
		int var16 = GBJWVQAY.field825;
		int var17 = GBJWVQAY.field826;
		int var18 = GBJWVQAY.field823;
		int var19 = GBJWVQAY.field824;
		CUNPUNFW.field509 = false;
		GBJWVQAY.method284(32, 32, var9.field1293);
		GBJWVQAY.method289(32, 0, 0, 0, 32);
		CUNPUNFW.method170();
		int var20 = var4.field1303;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = CUNPUNFW.field515[var4.field1338] * var20 >> 16;
		int var22 = CUNPUNFW.field516[var4.field1338] * var20 >> 16;
		var7.method217(0, var4.field1325, var4.field1336, var4.field1338, var4.field1335, var7.field1247 / 2 + var21 + var4.field1318, var4.field1318 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1293[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1293[var24 * 32 + var23 - 1] > 1) {
						var9.field1293[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1293[(var24 - 1) * 32 + var23] > 1) {
						var9.field1293[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1293[var24 * 32 + var23 + 1] > 1) {
						var9.field1293[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1293[(var24 + 1) * 32 + var23] > 1) {
						var9.field1293[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1293[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1293[var26 * 32 + var25 - 1] == 1) {
							var9.field1293[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field1293[(var26 - 1) * 32 + var25] == 1) {
							var9.field1293[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field1293[var26 * 32 + var25 + 1] == 1) {
							var9.field1293[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field1293[(var26 + 1) * 32 + var25] == 1) {
							var9.field1293[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1293[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1293[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1293[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1337 != -1) {
			int var29 = var8.field1298;
			int var30 = var8.field1299;
			var8.field1298 = 32;
			var8.field1299 = 32;
			var8.method541(0, 0);
			var8.field1298 = var29;
			var8.field1299 = var30;
		}

		if (arg2 == 0) {
			field1323.method530(arg1, var9);
		}

		GBJWVQAY.method284(var15, var14, var13);
		GBJWVQAY.method286(var18, var16, var17, var19);
		CUNPUNFW.field511 = var10;
		CUNPUNFW.field512 = var11;
		CUNPUNFW.field517 = var12;
		CUNPUNFW.field509 = true;

		if (var4.field1343) {
			var9.field1298 = 33;
		} else {
			var9.field1298 = 32;
		}

		var9.field1299 = arg0;
		return var9;
	}

	@ObfuscatedName("WGKWQDPM.b(I)LWGKWQDPM;")
	public static final WGKWQDPM method554(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1317[var1].field1307 == arg0) {
				return field1317[var1];
			}
		}

		field1333 = (field1333 + 1) % 10;
		WGKWQDPM var2 = field1317[field1333];
		field1321.field882 = field1330[arg0];
		var2.field1307 = arg0;
		var2.method552();
		var2.method560(field1321);

		if (var2.field1337 != -1) {
			var2.method558();
		}

		if (!field1301 && var2.field1331) {
			var2.field1342 = "Members Object";
			var2.field1322 = "Login to a members' server to use this object.".getBytes();
			var2.field1328 = null;
			var2.field1310 = null;
			var2.field1302 = 0;
		}

		return var2;
	}

	@ObfuscatedName("WGKWQDPM.a(LFUZJMGZB;)V")
	public static final void method555(FUZJMGZB arg0) {
		field1321 = new LBBVYYXO(arg0.method277("obj.dat", null));
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("obj.idx", null));
		field1308 = var1.method371();
		field1330 = new int[field1308];
		int var2 = 2;
		for (int var3 = 0; var3 < field1308; var3++) {
			field1330[var3] = var2;
			var2 += var1.method371();
		}

		field1317 = new WGKWQDPM[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1317[var4] = new WGKWQDPM();
		}
	}

	@ObfuscatedName("WGKWQDPM.a(Z)V")
	public static final void method556() {
		field1314 = null;
		field1323 = null;
		field1330 = null;
		field1317 = null;
		field1321 = null;
	}

	@ObfuscatedName("WGKWQDPM.a(IB)LCYPZUKMB;")
	public final CYPZUKMB method557(int arg0) {
		if (field1319 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1341[var3] && field1341[var3] != 0) {
					var2 = field1319[var3];
				}
			}

			if (var2 != -1) {
				return method554(var2).method557(1);
			}
		}

		CYPZUKMB var4 = CYPZUKMB.method196(field1306);
		if (var4 == null) {
			return null;
		}

		if (field1332 != null) {
			for (int var5 = 0; var5 < field1332.length; var5++) {
				var4.method210(field1332[var5], field1326[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("WGKWQDPM.c(I)V")
	public void method558() {
		WGKWQDPM var1 = method554(field1337);
		field1306 = var1.field1306;
		field1303 = var1.field1303;
		field1338 = var1.field1338;
		field1325 = var1.field1325;
		field1336 = var1.field1336;
		field1335 = var1.field1335;
		field1318 = var1.field1318;
		field1332 = var1.field1332;
		field1326 = var1.field1326;
		WGKWQDPM var2 = method554(field1311);
		field1342 = var2.field1342;
		field1331 = var2.field1331;
		field1312 = var2.field1312;
		String var3 = "a";
		char var4 = var2.field1342.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1322 = ("Swap this note at any bank for " + var3 + " " + var2.field1342 + ".").getBytes();
		field1343 = true;
	}

	@ObfuscatedName("WGKWQDPM.b(BI)LCYPZUKMB;")
	public final CYPZUKMB method559(int arg0) {
		int var2 = field1347;
		int var3 = field1340;
		int var4 = field1346;
		if (arg0 == 1) {
			var2 = field1344;
			var3 = field1300;
			var4 = field1305;
		}

		if (var2 == -1) {
			return null;
		}

		CYPZUKMB var5 = CYPZUKMB.method196(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				CYPZUKMB var9 = CYPZUKMB.method196(var3);
				CYPZUKMB[] var10 = new CYPZUKMB[] { var5, var9 };
				var5 = new CYPZUKMB(var10, 2);
			} else {
				CYPZUKMB var6 = CYPZUKMB.method196(var3);
				CYPZUKMB var7 = CYPZUKMB.method196(var4);
				CYPZUKMB[] var8 = new CYPZUKMB[] { var5, var6, var7 };
				var5 = new CYPZUKMB(var8, 3);
			}
		}

		if (arg0 == 0 && field1327 != 0) {
			var5.method209(0, field1327, 0);
		}

		if (arg0 == 1 && field1334 != 0) {
			var5.method209(0, field1334, 0);
		}

		if (field1332 != null) {
			for (int var11 = 0; var11 < field1332.length; var11++) {
				var5.method210(field1332[var11], field1326[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("WGKWQDPM.a(LLBBVYYXO;B)V")
	public final void method560(LBBVYYXO arg0) {
		while (true) {
			int var2 = arg0.method369();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1306 = arg0.method371();
			} else if (var2 == 2) {
				field1342 = arg0.method376();
			} else if (var2 == 3) {
				field1322 = arg0.method377();
			} else if (var2 == 4) {
				field1303 = arg0.method371();
			} else if (var2 == 5) {
				field1338 = arg0.method371();
			} else if (var2 == 6) {
				field1325 = arg0.method371();
			} else if (var2 == 7) {
				field1335 = arg0.method371();
				if (field1335 > 32767) {
					field1335 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1318 = arg0.method371();
				if (field1318 > 32767) {
					field1318 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1345 = arg0.method371();
			} else if (var2 == 11) {
				field1343 = true;
			} else if (var2 == 12) {
				field1312 = arg0.method374();
			} else if (var2 == 16) {
				field1331 = true;
			} else if (var2 == 23) {
				field1347 = arg0.method371();
				field1327 = arg0.method370();
			} else if (var2 == 24) {
				field1340 = arg0.method371();
			} else if (var2 == 25) {
				field1344 = arg0.method371();
				field1334 = arg0.method370();
			} else if (var2 == 26) {
				field1300 = arg0.method371();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1328 == null) {
					field1328 = new String[5];
				}

				field1328[var2 - 30] = arg0.method376();
				if (field1328[var2 - 30].equalsIgnoreCase("hidden")) {
					field1328[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1310 == null) {
					field1310 = new String[5];
				}

				field1310[var2 - 35] = arg0.method376();
			} else if (var2 == 40) {
				int var3 = arg0.method369();
				field1332 = new int[var3];
				field1326 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1332[var4] = arg0.method371();
					field1326[var4] = arg0.method371();
				}
			} else if (var2 == 78) {
				field1346 = arg0.method371();
			} else if (var2 == 79) {
				field1305 = arg0.method371();
			} else if (var2 == 90) {
				field1313 = arg0.method371();
			} else if (var2 == 91) {
				field1339 = arg0.method371();
			} else if (var2 == 92) {
				field1316 = arg0.method371();
			} else if (var2 == 93) {
				field1315 = arg0.method371();
			} else if (var2 == 95) {
				field1336 = arg0.method371();
			} else if (var2 == 97) {
				field1311 = arg0.method371();
			} else if (var2 == 98) {
				field1337 = arg0.method371();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1319 == null) {
					field1319 = new int[10];
					field1341 = new int[10];
				}

				field1319[var2 - 100] = arg0.method371();
				field1341[var2 - 100] = arg0.method371();
			} else if (var2 == 110) {
				field1324 = arg0.method371();
			} else if (var2 == 111) {
				field1304 = arg0.method371();
			} else if (var2 == 112) {
				field1320 = arg0.method371();
			} else if (var2 == 113) {
				field1309 = arg0.method370();
			} else if (var2 == 114) {
				field1329 = arg0.method370() * 5;
			} else if (var2 == 115) {
				field1302 = arg0.method369();
			}
		}
	}

	@ObfuscatedName("WGKWQDPM.b(II)Z")
	public final boolean method561(int arg0) {
		int var2 = field1313;
		int var3 = field1316;
		if (arg0 == 1) {
			var2 = field1339;
			var3 = field1315;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!CYPZUKMB.method197(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !CYPZUKMB.method197(var3)) {
			var4 = false;
		}

		return var4;
	}
}
