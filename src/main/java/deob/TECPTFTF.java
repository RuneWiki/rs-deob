package deob;

@ObfuscatedName("TECPTFTF")
public final class TECPTFTF {

	@ObfuscatedName("TECPTFTF.k")
	public boolean field1340 = true;

	@ObfuscatedName("TECPTFTF.l")
	public int field1341;

	@ObfuscatedName("TECPTFTF.m")
	public int field1342;

	@ObfuscatedName("TECPTFTF.n")
	public int field1343;

	@ObfuscatedName("TECPTFTF.o")
	public int field1344;

	@ObfuscatedName("TECPTFTF.a")
	public int[] field1330;

	@ObfuscatedName("TECPTFTF.b")
	public int[] field1331;

	@ObfuscatedName("TECPTFTF.c")
	public int[] field1332;

	@ObfuscatedName("TECPTFTF.g")
	public int[] field1336;

	@ObfuscatedName("TECPTFTF.h")
	public int[] field1337;

	@ObfuscatedName("TECPTFTF.i")
	public int[] field1338;

	@ObfuscatedName("TECPTFTF.d")
	public int[] field1333;

	@ObfuscatedName("TECPTFTF.e")
	public int[] field1334;

	@ObfuscatedName("TECPTFTF.f")
	public int[] field1335;

	@ObfuscatedName("TECPTFTF.j")
	public int[] field1339;

	@ObfuscatedName("TECPTFTF.p")
	public static int[] field1345 = new int[6];

	@ObfuscatedName("TECPTFTF.q")
	public static int[] field1346 = new int[6];

	@ObfuscatedName("TECPTFTF.r")
	public static int[] field1347 = new int[6];

	@ObfuscatedName("TECPTFTF.s")
	public static int[] field1348 = new int[6];

	@ObfuscatedName("TECPTFTF.t")
	public static int[] field1349 = new int[6];

	@ObfuscatedName("TECPTFTF.u")
	public static int[] field1350 = new int[] { 1, 0 };

	@ObfuscatedName("TECPTFTF.v")
	public static int[] field1351 = new int[] { 2, 1 };

	@ObfuscatedName("TECPTFTF.w")
	public static int[] field1352 = new int[] { 3, 3 };

	@ObfuscatedName("TECPTFTF.x")
	public static final int[][] field1353 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("TECPTFTF.y")
	public static final int[][] field1354 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public TECPTFTF(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg6 != arg13 || arg3 != arg13 || arg13 != arg14) {
			field1340 = false;
		}

		field1341 = arg8;
		field1342 = arg5;
		field1343 = arg4;
		field1344 = arg7;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1353[arg8];
		int var25 = var24.length;
		field1330 = new int[var25];
		field1331 = new int[var25];
		field1332 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg16 * var20;
		int var29 = arg9 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg5 - arg5 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg5 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg5 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg13;
				var35 = arg2;
				var36 = arg18;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg6 + arg13 >> 1;
				var35 = arg0 + arg2 >> 1;
				var36 = arg10 + arg18 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg6;
				var35 = arg0;
				var36 = arg10;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg3 + arg6 >> 1;
				var35 = arg0 + arg15 >> 1;
				var36 = arg10 + arg12 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg3;
				var35 = arg15;
				var36 = arg12;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg3 + arg14 >> 1;
				var35 = arg15 + arg17 >> 1;
				var36 = arg1 + arg12 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg14;
				var35 = arg17;
				var36 = arg1;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg13 + arg14 >> 1;
				var35 = arg2 + arg17 >> 1;
				var36 = arg1 + arg18 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg6 + arg13 >> 1;
				var35 = arg0 + arg2 >> 1;
				var36 = arg10 + arg18 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg3 + arg6 >> 1;
				var35 = arg0 + arg15 >> 1;
				var36 = arg10 + arg12 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg3 + arg14 >> 1;
				var35 = arg15 + arg17 >> 1;
				var36 = arg1 + arg12 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg13 + arg14 >> 1;
				var35 = arg2 + arg17 >> 1;
				var36 = arg1 + arg18 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg13;
				var35 = arg2;
				var36 = arg18;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg6;
				var35 = arg0;
				var36 = arg10;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg3;
				var35 = arg15;
				var36 = arg12;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg14;
				var35 = arg17;
				var36 = arg1;
			}

			field1330[var30] = var32;
			field1331[var30] = var34;
			field1332[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1354[arg8];
		int var38 = var37.length / 4;
		field1336 = new int[var38];
		field1337 = new int[var38];
		field1338 = new int[var38];
		field1333 = new int[var38];
		field1334 = new int[var38];
		field1335 = new int[var38];

		if (arg11 != -1) {
			field1339 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg5 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg5 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg5 & 0x3;
			}

			field1336[var40] = var42;
			field1337[var40] = var43;
			field1338[var40] = var44;

			if (var41 == 0) {
				field1333[var40] = var26[var42];
				field1334[var40] = var26[var43];
				field1335[var40] = var26[var44];

				if (field1339 != null) {
					field1339[var40] = -1;
				}
			} else {
				field1333[var40] = var27[var42];
				field1334[var40] = var27[var43];
				field1335[var40] = var27[var44];

				if (field1339 != null) {
					field1339[var40] = arg11;
				}
			}
		}

		int var45 = arg13;
		int var46 = arg6;

		if (arg6 < arg13) {
			var45 = arg6;
		}

		if (arg6 > arg6) {
			var46 = arg6;
		}

		if (arg3 < var45) {
			var45 = arg3;
		}

		if (arg3 > var46) {
			var46 = arg3;
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
