package deob;

@ObfuscatedName("XXVZSHBT")
public final class XXVZSHBT {

	@ObfuscatedName("XXVZSHBT.l")
	public boolean field1430 = true;

	@ObfuscatedName("XXVZSHBT.m")
	public int field1431;

	@ObfuscatedName("XXVZSHBT.n")
	public int field1432;

	@ObfuscatedName("XXVZSHBT.o")
	public int field1433;

	@ObfuscatedName("XXVZSHBT.p")
	public int field1434;

	@ObfuscatedName("XXVZSHBT.b")
	public int[] field1420;

	@ObfuscatedName("XXVZSHBT.c")
	public int[] field1421;

	@ObfuscatedName("XXVZSHBT.d")
	public int[] field1422;

	@ObfuscatedName("XXVZSHBT.h")
	public int[] field1426;

	@ObfuscatedName("XXVZSHBT.i")
	public int[] field1427;

	@ObfuscatedName("XXVZSHBT.j")
	public int[] field1428;

	@ObfuscatedName("XXVZSHBT.e")
	public int[] field1423;

	@ObfuscatedName("XXVZSHBT.f")
	public int[] field1424;

	@ObfuscatedName("XXVZSHBT.g")
	public int[] field1425;

	@ObfuscatedName("XXVZSHBT.k")
	public int[] field1429;

	@ObfuscatedName("XXVZSHBT.q")
	public static int[] field1435 = new int[6];

	@ObfuscatedName("XXVZSHBT.r")
	public static int[] field1436 = new int[6];

	@ObfuscatedName("XXVZSHBT.s")
	public static int[] field1437 = new int[6];

	@ObfuscatedName("XXVZSHBT.t")
	public static int[] field1438 = new int[6];

	@ObfuscatedName("XXVZSHBT.u")
	public static int[] field1439 = new int[6];

	@ObfuscatedName("XXVZSHBT.v")
	public static int[] field1440 = new int[] { 1, 0 };

	@ObfuscatedName("XXVZSHBT.w")
	public static int[] field1441 = new int[] { 2, 1 };

	@ObfuscatedName("XXVZSHBT.x")
	public static int[] field1442 = new int[] { 3, 3 };

	@ObfuscatedName("XXVZSHBT.y")
	public static final int[][] field1443 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("XXVZSHBT.z")
	public static final int[][] field1444 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public XXVZSHBT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg0 != arg15 || arg5 != arg15 || arg7 != arg15) {
			field1430 = false;
		}

		field1431 = arg10;
		field1432 = arg4;
		field1433 = arg6;
		field1434 = arg13;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1443[arg10];
		int var25 = var24.length;
		field1420 = new int[var25];
		field1421 = new int[var25];
		field1422 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg12 * var20;
		int var29 = arg14 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg4 - arg4 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg4 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg4 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg15;
				var35 = arg17;
				var36 = arg11;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg0 + arg15 >> 1;
				var35 = arg2 + arg17 >> 1;
				var36 = arg3 + arg11 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg0;
				var35 = arg2;
				var36 = arg3;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg5 >> 1;
				var35 = arg2 + arg8 >> 1;
				var36 = arg3 + arg9 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg5;
				var35 = arg8;
				var36 = arg9;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg5 + arg7 >> 1;
				var35 = arg8 + arg18 >> 1;
				var36 = arg9 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg7;
				var35 = arg18;
				var36 = arg16;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg7 + arg15 >> 1;
				var35 = arg17 + arg18 >> 1;
				var36 = arg11 + arg16 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg0 + arg15 >> 1;
				var35 = arg2 + arg17 >> 1;
				var36 = arg3 + arg11 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg5 >> 1;
				var35 = arg2 + arg8 >> 1;
				var36 = arg3 + arg9 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg5 + arg7 >> 1;
				var35 = arg8 + arg18 >> 1;
				var36 = arg9 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg15 >> 1;
				var35 = arg17 + arg18 >> 1;
				var36 = arg11 + arg16 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg15;
				var35 = arg17;
				var36 = arg11;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg0;
				var35 = arg2;
				var36 = arg3;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg5;
				var35 = arg8;
				var36 = arg9;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg7;
				var35 = arg18;
				var36 = arg16;
			}

			field1420[var30] = var32;
			field1421[var30] = var34;
			field1422[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1444[arg10];
		int var38 = var37.length / 4;
		field1426 = new int[var38];
		field1427 = new int[var38];
		field1428 = new int[var38];
		field1423 = new int[var38];
		field1424 = new int[var38];
		field1425 = new int[var38];

		if (arg1 != -1) {
			field1429 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg4 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg4 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg4 & 0x3;
			}

			field1426[var40] = var42;
			field1427[var40] = var43;
			field1428[var40] = var44;

			if (var41 == 0) {
				field1423[var40] = var26[var42];
				field1424[var40] = var26[var43];
				field1425[var40] = var26[var44];

				if (field1429 != null) {
					field1429[var40] = -1;
				}
			} else {
				field1423[var40] = var27[var42];
				field1424[var40] = var27[var43];
				field1425[var40] = var27[var44];

				if (field1429 != null) {
					field1429[var40] = arg1;
				}
			}
		}

		int var45 = arg15;
		int var46 = arg0;

		if (arg0 < arg15) {
			var45 = arg0;
		}

		if (arg0 > arg0) {
			var46 = arg0;
		}

		if (arg5 < var45) {
			var45 = arg5;
		}

		if (arg5 > var46) {
			var46 = arg5;
		}

		if (arg7 < var45) {
			var45 = arg7;
		}

		if (arg7 > var46) {
			var46 = arg7;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
