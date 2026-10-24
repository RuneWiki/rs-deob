package deob;

@ObfuscatedName("GKKCGDRZ")
public final class GKKCGDRZ {

	@ObfuscatedName("GKKCGDRZ.l")
	public boolean field661 = true;

	@ObfuscatedName("GKKCGDRZ.m")
	public int field662;

	@ObfuscatedName("GKKCGDRZ.n")
	public int field663;

	@ObfuscatedName("GKKCGDRZ.o")
	public int field664;

	@ObfuscatedName("GKKCGDRZ.p")
	public int field665;

	@ObfuscatedName("GKKCGDRZ.b")
	public int[] field651;

	@ObfuscatedName("GKKCGDRZ.c")
	public int[] field652;

	@ObfuscatedName("GKKCGDRZ.d")
	public int[] field653;

	@ObfuscatedName("GKKCGDRZ.h")
	public int[] field657;

	@ObfuscatedName("GKKCGDRZ.i")
	public int[] field658;

	@ObfuscatedName("GKKCGDRZ.j")
	public int[] field659;

	@ObfuscatedName("GKKCGDRZ.e")
	public int[] field654;

	@ObfuscatedName("GKKCGDRZ.f")
	public int[] field655;

	@ObfuscatedName("GKKCGDRZ.g")
	public int[] field656;

	@ObfuscatedName("GKKCGDRZ.k")
	public int[] field660;

	@ObfuscatedName("GKKCGDRZ.q")
	public static int[] field666 = new int[6];

	@ObfuscatedName("GKKCGDRZ.r")
	public static int[] field667 = new int[6];

	@ObfuscatedName("GKKCGDRZ.s")
	public static int[] field668 = new int[6];

	@ObfuscatedName("GKKCGDRZ.t")
	public static int[] field669 = new int[6];

	@ObfuscatedName("GKKCGDRZ.u")
	public static int[] field670 = new int[6];

	@ObfuscatedName("GKKCGDRZ.v")
	public static int[] field671 = new int[] { 1, 0 };

	@ObfuscatedName("GKKCGDRZ.w")
	public static int[] field672 = new int[] { 2, 1 };

	@ObfuscatedName("GKKCGDRZ.x")
	public static int[] field673 = new int[] { 3, 3 };

	@ObfuscatedName("GKKCGDRZ.y")
	public static final int[][] field674 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("GKKCGDRZ.z")
	public static final int[][] field675 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public GKKCGDRZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg0 != arg5 || arg0 != arg13 || arg0 != arg8) {
			field661 = false;
		}

		field662 = arg3;
		field663 = arg12;
		field664 = arg9;
		field665 = arg15;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field674[arg3];
		int var25 = var24.length;
		field651 = new int[var25];
		field652 = new int[var25];
		field653 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg16 * var20;
		int var29 = arg4 * var20;
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
				var34 = arg0;
				var35 = arg6;
				var36 = arg18;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg0 + arg5 >> 1;
				var35 = arg6 + arg11 >> 1;
				var36 = arg2 + arg18 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg5;
				var35 = arg11;
				var36 = arg2;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg13 >> 1;
				var35 = arg1 + arg11 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg13;
				var35 = arg1;
				var36 = arg10;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg8 + arg13 >> 1;
				var35 = arg1 + arg7 >> 1;
				var36 = arg10 + arg17 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg7;
				var36 = arg17;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg8 >> 1;
				var35 = arg6 + arg7 >> 1;
				var36 = arg17 + arg18 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg0 + arg5 >> 1;
				var35 = arg6 + arg11 >> 1;
				var36 = arg2 + arg18 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg13 >> 1;
				var35 = arg1 + arg11 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg8 + arg13 >> 1;
				var35 = arg1 + arg7 >> 1;
				var36 = arg10 + arg17 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg8 >> 1;
				var35 = arg6 + arg7 >> 1;
				var36 = arg17 + arg18 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg0;
				var35 = arg6;
				var36 = arg18;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg5;
				var35 = arg11;
				var36 = arg2;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg13;
				var35 = arg1;
				var36 = arg10;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg7;
				var36 = arg17;
			}

			field651[var30] = var32;
			field652[var30] = var34;
			field653[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field675[arg3];
		int var38 = var37.length / 4;
		field657 = new int[var38];
		field658 = new int[var38];
		field659 = new int[var38];
		field654 = new int[var38];
		field655 = new int[var38];
		field656 = new int[var38];

		if (arg14 != -1) {
			field660 = new int[var38];
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

			field657[var40] = var42;
			field658[var40] = var43;
			field659[var40] = var44;

			if (var41 == 0) {
				field654[var40] = var26[var42];
				field655[var40] = var26[var43];
				field656[var40] = var26[var44];

				if (field660 != null) {
					field660[var40] = -1;
				}
			} else {
				field654[var40] = var27[var42];
				field655[var40] = var27[var43];
				field656[var40] = var27[var44];

				if (field660 != null) {
					field660[var40] = arg14;
				}
			}
		}

		int var45 = arg0;
		int var46 = arg5;

		if (arg5 < arg0) {
			var45 = arg5;
		}

		if (arg5 > arg5) {
			var46 = arg5;
		}

		if (arg13 < var45) {
			var45 = arg13;
		}

		if (arg13 > var46) {
			var46 = arg13;
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
