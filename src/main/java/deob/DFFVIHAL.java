package deob;

@ObfuscatedName("DFFVIHAL")
public final class DFFVIHAL {

	@ObfuscatedName("DFFVIHAL.l")
	public boolean field529 = true;

	@ObfuscatedName("DFFVIHAL.m")
	public int field530;

	@ObfuscatedName("DFFVIHAL.n")
	public int field531;

	@ObfuscatedName("DFFVIHAL.o")
	public int field532;

	@ObfuscatedName("DFFVIHAL.p")
	public int field533;

	@ObfuscatedName("DFFVIHAL.b")
	public int[] field519;

	@ObfuscatedName("DFFVIHAL.c")
	public int[] field520;

	@ObfuscatedName("DFFVIHAL.d")
	public int[] field521;

	@ObfuscatedName("DFFVIHAL.h")
	public int[] field525;

	@ObfuscatedName("DFFVIHAL.i")
	public int[] field526;

	@ObfuscatedName("DFFVIHAL.j")
	public int[] field527;

	@ObfuscatedName("DFFVIHAL.e")
	public int[] field522;

	@ObfuscatedName("DFFVIHAL.f")
	public int[] field523;

	@ObfuscatedName("DFFVIHAL.g")
	public int[] field524;

	@ObfuscatedName("DFFVIHAL.k")
	public int[] field528;

	@ObfuscatedName("DFFVIHAL.q")
	public static int[] field534 = new int[6];

	@ObfuscatedName("DFFVIHAL.r")
	public static int[] field535 = new int[6];

	@ObfuscatedName("DFFVIHAL.s")
	public static int[] field536 = new int[6];

	@ObfuscatedName("DFFVIHAL.t")
	public static int[] field537 = new int[6];

	@ObfuscatedName("DFFVIHAL.u")
	public static int[] field538 = new int[6];

	@ObfuscatedName("DFFVIHAL.v")
	public static int[] field539 = new int[] { 1, 0 };

	@ObfuscatedName("DFFVIHAL.w")
	public static int[] field540 = new int[] { 2, 1 };

	@ObfuscatedName("DFFVIHAL.x")
	public static int[] field541 = new int[] { 3, 3 };

	@ObfuscatedName("DFFVIHAL.y")
	public static final int[][] field542 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("DFFVIHAL.z")
	public static final int[][] field543 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public DFFVIHAL(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg9 != arg13 || arg7 != arg9 || arg8 != arg9) {
			field529 = false;
		}

		field530 = arg2;
		field531 = arg0;
		field532 = arg15;
		field533 = arg3;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field542[arg2];
		int var25 = var24.length;
		field519 = new int[var25];
		field520 = new int[var25];
		field521 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg17 * var20;
		int var29 = arg12 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg0 - arg0 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg0 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg0 - 13 & 0x3) + 13;
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
				var35 = arg11;
				var36 = arg5;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg9 + arg13 >> 1;
				var35 = arg10 + arg11 >> 1;
				var36 = arg4 + arg5 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg13;
				var35 = arg10;
				var36 = arg4;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg13 >> 1;
				var35 = arg10 + arg18 >> 1;
				var36 = arg1 + arg4 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg7;
				var35 = arg18;
				var36 = arg1;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg7 + arg8 >> 1;
				var35 = arg14 + arg18 >> 1;
				var36 = arg1 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg14;
				var36 = arg16;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg8 + arg9 >> 1;
				var35 = arg11 + arg14 >> 1;
				var36 = arg5 + arg16 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg9 + arg13 >> 1;
				var35 = arg10 + arg11 >> 1;
				var36 = arg4 + arg5 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg13 >> 1;
				var35 = arg10 + arg18 >> 1;
				var36 = arg1 + arg4 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg7 + arg8 >> 1;
				var35 = arg14 + arg18 >> 1;
				var36 = arg1 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg9 >> 1;
				var35 = arg11 + arg14 >> 1;
				var36 = arg5 + arg16 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg9;
				var35 = arg11;
				var36 = arg5;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg13;
				var35 = arg10;
				var36 = arg4;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg7;
				var35 = arg18;
				var36 = arg1;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg14;
				var36 = arg16;
			}

			field519[var30] = var32;
			field520[var30] = var34;
			field521[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field543[arg2];
		int var38 = var37.length / 4;
		field525 = new int[var38];
		field526 = new int[var38];
		field527 = new int[var38];
		field522 = new int[var38];
		field523 = new int[var38];
		field524 = new int[var38];

		if (arg6 != -1) {
			field528 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg0 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg0 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg0 & 0x3;
			}

			field525[var40] = var42;
			field526[var40] = var43;
			field527[var40] = var44;

			if (var41 == 0) {
				field522[var40] = var26[var42];
				field523[var40] = var26[var43];
				field524[var40] = var26[var44];

				if (field528 != null) {
					field528[var40] = -1;
				}
			} else {
				field522[var40] = var27[var42];
				field523[var40] = var27[var43];
				field524[var40] = var27[var44];

				if (field528 != null) {
					field528[var40] = arg6;
				}
			}
		}

		int var45 = arg9;
		int var46 = arg13;

		if (arg13 < arg9) {
			var45 = arg13;
		}

		if (arg13 > arg13) {
			var46 = arg13;
		}

		if (arg7 < var45) {
			var45 = arg7;
		}

		if (arg7 > var46) {
			var46 = arg7;
		}

		if (arg8 < var45) {
			var45 = arg8;
		}

		if (arg8 > var46) {
			var46 = arg8;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
