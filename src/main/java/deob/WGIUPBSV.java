package deob;

@ObfuscatedName("WGIUPBSV")
public final class WGIUPBSV {

	@ObfuscatedName("WGIUPBSV.l")
	public boolean field1307 = true;

	@ObfuscatedName("WGIUPBSV.m")
	public int field1308;

	@ObfuscatedName("WGIUPBSV.n")
	public int field1309;

	@ObfuscatedName("WGIUPBSV.o")
	public int field1310;

	@ObfuscatedName("WGIUPBSV.p")
	public int field1311;

	@ObfuscatedName("WGIUPBSV.b")
	public int[] field1297;

	@ObfuscatedName("WGIUPBSV.c")
	public int[] field1298;

	@ObfuscatedName("WGIUPBSV.d")
	public int[] field1299;

	@ObfuscatedName("WGIUPBSV.h")
	public int[] field1303;

	@ObfuscatedName("WGIUPBSV.i")
	public int[] field1304;

	@ObfuscatedName("WGIUPBSV.j")
	public int[] field1305;

	@ObfuscatedName("WGIUPBSV.e")
	public int[] field1300;

	@ObfuscatedName("WGIUPBSV.f")
	public int[] field1301;

	@ObfuscatedName("WGIUPBSV.g")
	public int[] field1302;

	@ObfuscatedName("WGIUPBSV.k")
	public int[] field1306;

	@ObfuscatedName("WGIUPBSV.q")
	public static int[] field1312 = new int[6];

	@ObfuscatedName("WGIUPBSV.r")
	public static int[] field1313 = new int[6];

	@ObfuscatedName("WGIUPBSV.s")
	public static int[] field1314 = new int[6];

	@ObfuscatedName("WGIUPBSV.t")
	public static int[] field1315 = new int[6];

	@ObfuscatedName("WGIUPBSV.u")
	public static int[] field1316 = new int[6];

	@ObfuscatedName("WGIUPBSV.v")
	public static int[] field1317 = new int[] { 1, 0 };

	@ObfuscatedName("WGIUPBSV.w")
	public static int[] field1318 = new int[] { 2, 1 };

	@ObfuscatedName("WGIUPBSV.x")
	public static int[] field1319 = new int[] { 3, 3 };

	@ObfuscatedName("WGIUPBSV.y")
	public static final int[][] field1320 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("WGIUPBSV.z")
	public static final int[][] field1321 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public WGIUPBSV(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg1 != arg7 || arg1 != arg9 || arg1 != arg14) {
			field1307 = false;
		}

		field1308 = arg11;
		field1309 = arg8;
		field1310 = arg4;
		field1311 = arg2;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1320[arg11];
		int var25 = var24.length;
		field1297 = new int[var25];
		field1298 = new int[var25];
		field1299 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg3 * var20;
		int var29 = arg15 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg8 - arg8 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg8 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg8 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg1;
				var35 = arg13;
				var36 = arg6;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg1 + arg7 >> 1;
				var35 = arg10 + arg13 >> 1;
				var36 = arg0 + arg6 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg7;
				var35 = arg10;
				var36 = arg0;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg9 >> 1;
				var35 = arg5 + arg10 >> 1;
				var36 = arg0 + arg12 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg9;
				var35 = arg5;
				var36 = arg12;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg9 + arg14 >> 1;
				var35 = arg5 + arg17 >> 1;
				var36 = arg12 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg14;
				var35 = arg17;
				var36 = arg16;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg1 + arg14 >> 1;
				var35 = arg13 + arg17 >> 1;
				var36 = arg6 + arg16 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg1 + arg7 >> 1;
				var35 = arg10 + arg13 >> 1;
				var36 = arg0 + arg6 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg9 >> 1;
				var35 = arg5 + arg10 >> 1;
				var36 = arg0 + arg12 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg9 + arg14 >> 1;
				var35 = arg5 + arg17 >> 1;
				var36 = arg12 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg14 >> 1;
				var35 = arg13 + arg17 >> 1;
				var36 = arg6 + arg16 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg13;
				var36 = arg6;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg7;
				var35 = arg10;
				var36 = arg0;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg9;
				var35 = arg5;
				var36 = arg12;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg14;
				var35 = arg17;
				var36 = arg16;
			}

			field1297[var30] = var32;
			field1298[var30] = var34;
			field1299[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1321[arg11];
		int var38 = var37.length / 4;
		field1303 = new int[var38];
		field1304 = new int[var38];
		field1305 = new int[var38];
		field1300 = new int[var38];
		field1301 = new int[var38];
		field1302 = new int[var38];

		if (arg18 != -1) {
			field1306 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg8 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg8 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg8 & 0x3;
			}

			field1303[var40] = var42;
			field1304[var40] = var43;
			field1305[var40] = var44;

			if (var41 == 0) {
				field1300[var40] = var26[var42];
				field1301[var40] = var26[var43];
				field1302[var40] = var26[var44];

				if (field1306 != null) {
					field1306[var40] = -1;
				}
			} else {
				field1300[var40] = var27[var42];
				field1301[var40] = var27[var43];
				field1302[var40] = var27[var44];

				if (field1306 != null) {
					field1306[var40] = arg18;
				}
			}
		}

		int var45 = arg1;
		int var46 = arg7;

		if (arg7 < arg1) {
			var45 = arg7;
		}

		if (arg7 > arg7) {
			var46 = arg7;
		}

		if (arg9 < var45) {
			var45 = arg9;
		}

		if (arg9 > var46) {
			var46 = arg9;
		}

		if (arg14 < var45) {
			var45 = arg14;
		}

		if (arg14 > var46) {
			var46 = arg14;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
