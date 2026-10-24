package deob;

@ObfuscatedName("ZVUFACKC")
public final class ZVUFACKC {

	@ObfuscatedName("ZVUFACKC.l")
	public boolean field1474 = true;

	@ObfuscatedName("ZVUFACKC.m")
	public int field1475;

	@ObfuscatedName("ZVUFACKC.n")
	public int field1476;

	@ObfuscatedName("ZVUFACKC.o")
	public int field1477;

	@ObfuscatedName("ZVUFACKC.p")
	public int field1478;

	@ObfuscatedName("ZVUFACKC.b")
	public int[] field1464;

	@ObfuscatedName("ZVUFACKC.c")
	public int[] field1465;

	@ObfuscatedName("ZVUFACKC.d")
	public int[] field1466;

	@ObfuscatedName("ZVUFACKC.h")
	public int[] field1470;

	@ObfuscatedName("ZVUFACKC.i")
	public int[] field1471;

	@ObfuscatedName("ZVUFACKC.j")
	public int[] field1472;

	@ObfuscatedName("ZVUFACKC.e")
	public int[] field1467;

	@ObfuscatedName("ZVUFACKC.f")
	public int[] field1468;

	@ObfuscatedName("ZVUFACKC.g")
	public int[] field1469;

	@ObfuscatedName("ZVUFACKC.k")
	public int[] field1473;

	@ObfuscatedName("ZVUFACKC.q")
	public static int[] field1479 = new int[6];

	@ObfuscatedName("ZVUFACKC.r")
	public static int[] field1480 = new int[6];

	@ObfuscatedName("ZVUFACKC.s")
	public static int[] field1481 = new int[6];

	@ObfuscatedName("ZVUFACKC.t")
	public static int[] field1482 = new int[6];

	@ObfuscatedName("ZVUFACKC.u")
	public static int[] field1483 = new int[6];

	@ObfuscatedName("ZVUFACKC.v")
	public static int[] field1484 = new int[] { 1, 0 };

	@ObfuscatedName("ZVUFACKC.w")
	public static int[] field1485 = new int[] { 2, 1 };

	@ObfuscatedName("ZVUFACKC.x")
	public static int[] field1486 = new int[] { 3, 3 };

	@ObfuscatedName("ZVUFACKC.y")
	public static final int[][] field1487 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("ZVUFACKC.z")
	public static final int[][] field1488 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public ZVUFACKC(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg9 != arg14 || arg9 != arg15 || arg1 != arg9) {
			field1474 = false;
		}

		field1475 = arg0;
		field1476 = arg3;
		field1477 = arg12;
		field1478 = arg13;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1487[arg0];
		int var25 = var24.length;
		field1464 = new int[var25];
		field1465 = new int[var25];
		field1466 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg5 * var20;
		int var29 = arg10 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg3 - arg3 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg3 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg3 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg9;
				var35 = arg18;
				var36 = arg7;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg9 + arg14 >> 1;
				var35 = arg4 + arg18 >> 1;
				var36 = arg6 + arg7 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg14;
				var35 = arg4;
				var36 = arg6;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg14 + arg15 >> 1;
				var35 = arg2 + arg4 >> 1;
				var36 = arg6 + arg17 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg15;
				var35 = arg2;
				var36 = arg17;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg1 + arg15 >> 1;
				var35 = arg2 + arg16 >> 1;
				var36 = arg11 + arg17 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg1;
				var35 = arg16;
				var36 = arg11;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg1 + arg9 >> 1;
				var35 = arg16 + arg18 >> 1;
				var36 = arg7 + arg11 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg9 + arg14 >> 1;
				var35 = arg4 + arg18 >> 1;
				var36 = arg6 + arg7 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg14 + arg15 >> 1;
				var35 = arg2 + arg4 >> 1;
				var36 = arg6 + arg17 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg1 + arg15 >> 1;
				var35 = arg2 + arg16 >> 1;
				var36 = arg11 + arg17 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg9 >> 1;
				var35 = arg16 + arg18 >> 1;
				var36 = arg7 + arg11 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg9;
				var35 = arg18;
				var36 = arg7;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg14;
				var35 = arg4;
				var36 = arg6;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg15;
				var35 = arg2;
				var36 = arg17;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg1;
				var35 = arg16;
				var36 = arg11;
			}

			field1464[var30] = var32;
			field1465[var30] = var34;
			field1466[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1488[arg0];
		int var38 = var37.length / 4;
		field1470 = new int[var38];
		field1471 = new int[var38];
		field1472 = new int[var38];
		field1467 = new int[var38];
		field1468 = new int[var38];
		field1469 = new int[var38];

		if (arg8 != -1) {
			field1473 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg3 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg3 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg3 & 0x3;
			}

			field1470[var40] = var42;
			field1471[var40] = var43;
			field1472[var40] = var44;

			if (var41 == 0) {
				field1467[var40] = var26[var42];
				field1468[var40] = var26[var43];
				field1469[var40] = var26[var44];

				if (field1473 != null) {
					field1473[var40] = -1;
				}
			} else {
				field1467[var40] = var27[var42];
				field1468[var40] = var27[var43];
				field1469[var40] = var27[var44];

				if (field1473 != null) {
					field1473[var40] = arg8;
				}
			}
		}

		int var45 = arg9;
		int var46 = arg14;

		if (arg14 < arg9) {
			var45 = arg14;
		}

		if (arg14 > arg14) {
			var46 = arg14;
		}

		if (arg15 < var45) {
			var45 = arg15;
		}

		if (arg15 > var46) {
			var46 = arg15;
		}

		if (arg1 < var45) {
			var45 = arg1;
		}

		if (arg1 > var46) {
			var46 = arg1;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
