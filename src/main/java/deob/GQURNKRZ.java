package deob;

@ObfuscatedName("GQURNKRZ")
public final class GQURNKRZ {

	@ObfuscatedName("GQURNKRZ.l")
	public boolean field669 = true;

	@ObfuscatedName("GQURNKRZ.m")
	public int field670;

	@ObfuscatedName("GQURNKRZ.n")
	public int field671;

	@ObfuscatedName("GQURNKRZ.o")
	public int field672;

	@ObfuscatedName("GQURNKRZ.p")
	public int field673;

	@ObfuscatedName("GQURNKRZ.b")
	public int[] field659;

	@ObfuscatedName("GQURNKRZ.c")
	public int[] field660;

	@ObfuscatedName("GQURNKRZ.d")
	public int[] field661;

	@ObfuscatedName("GQURNKRZ.h")
	public int[] field665;

	@ObfuscatedName("GQURNKRZ.i")
	public int[] field666;

	@ObfuscatedName("GQURNKRZ.j")
	public int[] field667;

	@ObfuscatedName("GQURNKRZ.e")
	public int[] field662;

	@ObfuscatedName("GQURNKRZ.f")
	public int[] field663;

	@ObfuscatedName("GQURNKRZ.g")
	public int[] field664;

	@ObfuscatedName("GQURNKRZ.k")
	public int[] field668;

	@ObfuscatedName("GQURNKRZ.q")
	public static int[] field674 = new int[6];

	@ObfuscatedName("GQURNKRZ.r")
	public static int[] field675 = new int[6];

	@ObfuscatedName("GQURNKRZ.s")
	public static int[] field676 = new int[6];

	@ObfuscatedName("GQURNKRZ.t")
	public static int[] field677 = new int[6];

	@ObfuscatedName("GQURNKRZ.u")
	public static int[] field678 = new int[6];

	@ObfuscatedName("GQURNKRZ.v")
	public static int[] field679 = new int[] { 1, 0 };

	@ObfuscatedName("GQURNKRZ.w")
	public static int[] field680 = new int[] { 2, 1 };

	@ObfuscatedName("GQURNKRZ.x")
	public static int[] field681 = new int[] { 3, 3 };

	@ObfuscatedName("GQURNKRZ.y")
	public static final int[][] field682 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("GQURNKRZ.z")
	public static final int[][] field683 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public GQURNKRZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg0 != arg18 || arg8 != arg18 || arg1 != arg18) {
			field669 = false;
		}

		field670 = arg7;
		field671 = arg12;
		field672 = arg17;
		field673 = arg11;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field682[arg7];
		int var25 = var24.length;
		field659 = new int[var25];
		field660 = new int[var25];
		field661 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg5 * var20;
		int var29 = arg10 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg12 - arg12 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg12 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg12 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg18;
				var35 = arg13;
				var36 = arg4;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg0 + arg18 >> 1;
				var35 = arg13 + arg14 >> 1;
				var36 = arg4 + arg15 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg0;
				var35 = arg14;
				var36 = arg15;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg8 >> 1;
				var35 = arg6 + arg14 >> 1;
				var36 = arg2 + arg15 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg6;
				var36 = arg2;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg1 + arg8 >> 1;
				var35 = arg3 + arg6 >> 1;
				var36 = arg2 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg1;
				var35 = arg3;
				var36 = arg16;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg1 + arg18 >> 1;
				var35 = arg3 + arg13 >> 1;
				var36 = arg4 + arg16 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg0 + arg18 >> 1;
				var35 = arg13 + arg14 >> 1;
				var36 = arg4 + arg15 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg8 >> 1;
				var35 = arg6 + arg14 >> 1;
				var36 = arg2 + arg15 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg1 + arg8 >> 1;
				var35 = arg3 + arg6 >> 1;
				var36 = arg2 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg18 >> 1;
				var35 = arg3 + arg13 >> 1;
				var36 = arg4 + arg16 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg18;
				var35 = arg13;
				var36 = arg4;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg0;
				var35 = arg14;
				var36 = arg15;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg6;
				var36 = arg2;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg1;
				var35 = arg3;
				var36 = arg16;
			}

			field659[var30] = var32;
			field660[var30] = var34;
			field661[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field683[arg7];
		int var38 = var37.length / 4;
		field665 = new int[var38];
		field666 = new int[var38];
		field667 = new int[var38];
		field662 = new int[var38];
		field663 = new int[var38];
		field664 = new int[var38];

		if (arg9 != -1) {
			field668 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg12 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg12 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg12 & 0x3;
			}

			field665[var40] = var42;
			field666[var40] = var43;
			field667[var40] = var44;

			if (var41 == 0) {
				field662[var40] = var26[var42];
				field663[var40] = var26[var43];
				field664[var40] = var26[var44];

				if (field668 != null) {
					field668[var40] = -1;
				}
			} else {
				field662[var40] = var27[var42];
				field663[var40] = var27[var43];
				field664[var40] = var27[var44];

				if (field668 != null) {
					field668[var40] = arg9;
				}
			}
		}

		int var45 = arg18;
		int var46 = arg0;

		if (arg0 < arg18) {
			var45 = arg0;
		}

		if (arg0 > arg0) {
			var46 = arg0;
		}

		if (arg8 < var45) {
			var45 = arg8;
		}

		if (arg8 > var46) {
			var46 = arg8;
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
