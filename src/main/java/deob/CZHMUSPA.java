package deob;

@ObfuscatedName("CZHMUSPA")
public final class CZHMUSPA {

	@ObfuscatedName("CZHMUSPA.l")
	public boolean field527 = true;

	@ObfuscatedName("CZHMUSPA.m")
	public int field528;

	@ObfuscatedName("CZHMUSPA.n")
	public int field529;

	@ObfuscatedName("CZHMUSPA.o")
	public int field530;

	@ObfuscatedName("CZHMUSPA.p")
	public int field531;

	@ObfuscatedName("CZHMUSPA.b")
	public int[] field517;

	@ObfuscatedName("CZHMUSPA.c")
	public int[] field518;

	@ObfuscatedName("CZHMUSPA.d")
	public int[] field519;

	@ObfuscatedName("CZHMUSPA.h")
	public int[] field523;

	@ObfuscatedName("CZHMUSPA.i")
	public int[] field524;

	@ObfuscatedName("CZHMUSPA.j")
	public int[] field525;

	@ObfuscatedName("CZHMUSPA.e")
	public int[] field520;

	@ObfuscatedName("CZHMUSPA.f")
	public int[] field521;

	@ObfuscatedName("CZHMUSPA.g")
	public int[] field522;

	@ObfuscatedName("CZHMUSPA.k")
	public int[] field526;

	@ObfuscatedName("CZHMUSPA.q")
	public static int[] field532 = new int[6];

	@ObfuscatedName("CZHMUSPA.r")
	public static int[] field533 = new int[6];

	@ObfuscatedName("CZHMUSPA.s")
	public static int[] field534 = new int[6];

	@ObfuscatedName("CZHMUSPA.t")
	public static int[] field535 = new int[6];

	@ObfuscatedName("CZHMUSPA.u")
	public static int[] field536 = new int[6];

	@ObfuscatedName("CZHMUSPA.v")
	public static int[] field537 = new int[] { 1, 0 };

	@ObfuscatedName("CZHMUSPA.w")
	public static int[] field538 = new int[] { 2, 1 };

	@ObfuscatedName("CZHMUSPA.x")
	public static int[] field539 = new int[] { 3, 3 };

	@ObfuscatedName("CZHMUSPA.y")
	public static final int[][] field540 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("CZHMUSPA.z")
	public static final int[][] field541 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public CZHMUSPA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg5 != arg16 || arg9 != arg16 || arg14 != arg16) {
			field527 = false;
		}

		field528 = arg7;
		field529 = arg13;
		field530 = arg15;
		field531 = arg0;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field540[arg7];
		int var25 = var24.length;
		field517 = new int[var25];
		field518 = new int[var25];
		field519 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg3 * var20;
		int var29 = arg2 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg13 - arg13 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg13 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg13 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg16;
				var35 = arg18;
				var36 = arg1;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg5 + arg16 >> 1;
				var35 = arg4 + arg18 >> 1;
				var36 = arg1 + arg8 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg5;
				var35 = arg4;
				var36 = arg8;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg9 >> 1;
				var35 = arg4 + arg11 >> 1;
				var36 = arg8 + arg10 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg9;
				var35 = arg11;
				var36 = arg10;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg9 + arg14 >> 1;
				var35 = arg11 + arg17 >> 1;
				var36 = arg6 + arg10 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg14;
				var35 = arg17;
				var36 = arg6;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg14 + arg16 >> 1;
				var35 = arg17 + arg18 >> 1;
				var36 = arg1 + arg6 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg5 + arg16 >> 1;
				var35 = arg4 + arg18 >> 1;
				var36 = arg1 + arg8 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg9 >> 1;
				var35 = arg4 + arg11 >> 1;
				var36 = arg8 + arg10 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg9 + arg14 >> 1;
				var35 = arg11 + arg17 >> 1;
				var36 = arg6 + arg10 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg14 + arg16 >> 1;
				var35 = arg17 + arg18 >> 1;
				var36 = arg1 + arg6 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg16;
				var35 = arg18;
				var36 = arg1;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg5;
				var35 = arg4;
				var36 = arg8;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg9;
				var35 = arg11;
				var36 = arg10;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg14;
				var35 = arg17;
				var36 = arg6;
			}

			field517[var30] = var32;
			field518[var30] = var34;
			field519[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field541[arg7];
		int var38 = var37.length / 4;
		field523 = new int[var38];
		field524 = new int[var38];
		field525 = new int[var38];
		field520 = new int[var38];
		field521 = new int[var38];
		field522 = new int[var38];

		if (arg12 != -1) {
			field526 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg13 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg13 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg13 & 0x3;
			}

			field523[var40] = var42;
			field524[var40] = var43;
			field525[var40] = var44;

			if (var41 == 0) {
				field520[var40] = var26[var42];
				field521[var40] = var26[var43];
				field522[var40] = var26[var44];

				if (field526 != null) {
					field526[var40] = -1;
				}
			} else {
				field520[var40] = var27[var42];
				field521[var40] = var27[var43];
				field522[var40] = var27[var44];

				if (field526 != null) {
					field526[var40] = arg12;
				}
			}
		}

		int var45 = arg16;
		int var46 = arg5;

		if (arg5 < arg16) {
			var45 = arg5;
		}

		if (arg5 > arg5) {
			var46 = arg5;
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
