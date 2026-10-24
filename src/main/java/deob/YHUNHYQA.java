package deob;

@ObfuscatedName("YHUNHYQA")
public final class YHUNHYQA {

	@ObfuscatedName("YHUNHYQA.k")
	public boolean field1445 = true;

	@ObfuscatedName("YHUNHYQA.l")
	public int field1446;

	@ObfuscatedName("YHUNHYQA.m")
	public int field1447;

	@ObfuscatedName("YHUNHYQA.n")
	public int field1448;

	@ObfuscatedName("YHUNHYQA.o")
	public int field1449;

	@ObfuscatedName("YHUNHYQA.a")
	public int[] field1435;

	@ObfuscatedName("YHUNHYQA.b")
	public int[] field1436;

	@ObfuscatedName("YHUNHYQA.c")
	public int[] field1437;

	@ObfuscatedName("YHUNHYQA.g")
	public int[] field1441;

	@ObfuscatedName("YHUNHYQA.h")
	public int[] field1442;

	@ObfuscatedName("YHUNHYQA.i")
	public int[] field1443;

	@ObfuscatedName("YHUNHYQA.d")
	public int[] field1438;

	@ObfuscatedName("YHUNHYQA.e")
	public int[] field1439;

	@ObfuscatedName("YHUNHYQA.f")
	public int[] field1440;

	@ObfuscatedName("YHUNHYQA.j")
	public int[] field1444;

	@ObfuscatedName("YHUNHYQA.p")
	public static int[] field1450 = new int[6];

	@ObfuscatedName("YHUNHYQA.q")
	public static int[] field1451 = new int[6];

	@ObfuscatedName("YHUNHYQA.r")
	public static int[] field1452 = new int[6];

	@ObfuscatedName("YHUNHYQA.s")
	public static int[] field1453 = new int[6];

	@ObfuscatedName("YHUNHYQA.t")
	public static int[] field1454 = new int[6];

	@ObfuscatedName("YHUNHYQA.u")
	public static int[] field1455 = new int[] { 1, 0 };

	@ObfuscatedName("YHUNHYQA.v")
	public static int[] field1456 = new int[] { 2, 1 };

	@ObfuscatedName("YHUNHYQA.w")
	public static int[] field1457 = new int[] { 3, 3 };

	@ObfuscatedName("YHUNHYQA.x")
	public static final int[][] field1458 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("YHUNHYQA.y")
	public static final int[][] field1459 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public YHUNHYQA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg14 != arg17 || arg3 != arg17 || arg0 != arg17) {
			field1445 = false;
		}

		field1446 = arg15;
		field1447 = arg6;
		field1448 = arg2;
		field1449 = arg16;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1458[arg15];
		int var25 = var24.length;
		field1435 = new int[var25];
		field1436 = new int[var25];
		field1437 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg4 * var20;
		int var29 = arg7 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg6 - arg6 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg6 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg6 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg17;
				var35 = arg8;
				var36 = arg10;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg14 + arg17 >> 1;
				var35 = arg8 + arg12 >> 1;
				var36 = arg10 + arg11 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg14;
				var35 = arg12;
				var36 = arg11;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg3 + arg14 >> 1;
				var35 = arg9 + arg12 >> 1;
				var36 = arg1 + arg11 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg3;
				var35 = arg9;
				var36 = arg1;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg0 + arg3 >> 1;
				var35 = arg9 + arg18 >> 1;
				var36 = arg1 + arg5 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg0;
				var35 = arg18;
				var36 = arg5;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg17 >> 1;
				var35 = arg8 + arg18 >> 1;
				var36 = arg5 + arg10 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg14 + arg17 >> 1;
				var35 = arg8 + arg12 >> 1;
				var36 = arg10 + arg11 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg3 + arg14 >> 1;
				var35 = arg9 + arg12 >> 1;
				var36 = arg1 + arg11 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg0 + arg3 >> 1;
				var35 = arg9 + arg18 >> 1;
				var36 = arg1 + arg5 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg17 >> 1;
				var35 = arg8 + arg18 >> 1;
				var36 = arg5 + arg10 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg17;
				var35 = arg8;
				var36 = arg10;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg14;
				var35 = arg12;
				var36 = arg11;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg3;
				var35 = arg9;
				var36 = arg1;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg0;
				var35 = arg18;
				var36 = arg5;
			}

			field1435[var30] = var32;
			field1436[var30] = var34;
			field1437[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1459[arg15];
		int var38 = var37.length / 4;
		field1441 = new int[var38];
		field1442 = new int[var38];
		field1443 = new int[var38];
		field1438 = new int[var38];
		field1439 = new int[var38];
		field1440 = new int[var38];

		if (arg13 != -1) {
			field1444 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg6 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg6 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg6 & 0x3;
			}

			field1441[var40] = var42;
			field1442[var40] = var43;
			field1443[var40] = var44;

			if (var41 == 0) {
				field1438[var40] = var26[var42];
				field1439[var40] = var26[var43];
				field1440[var40] = var26[var44];

				if (field1444 != null) {
					field1444[var40] = -1;
				}
			} else {
				field1438[var40] = var27[var42];
				field1439[var40] = var27[var43];
				field1440[var40] = var27[var44];

				if (field1444 != null) {
					field1444[var40] = arg13;
				}
			}
		}

		int var45 = arg17;
		int var46 = arg14;

		if (arg14 < arg17) {
			var45 = arg14;
		}

		if (arg14 > arg14) {
			var46 = arg14;
		}

		if (arg3 < var45) {
			var45 = arg3;
		}

		if (arg3 > var46) {
			var46 = arg3;
		}

		if (arg0 < var45) {
			var45 = arg0;
		}

		if (arg0 > var46) {
			var46 = arg0;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
