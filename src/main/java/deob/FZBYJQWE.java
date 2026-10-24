package deob;

@ObfuscatedName("FZBYJQWE")
public final class FZBYJQWE {

	@ObfuscatedName("FZBYJQWE.k")
	public boolean field789 = true;

	@ObfuscatedName("FZBYJQWE.l")
	public int field790;

	@ObfuscatedName("FZBYJQWE.m")
	public int field791;

	@ObfuscatedName("FZBYJQWE.n")
	public int field792;

	@ObfuscatedName("FZBYJQWE.o")
	public int field793;

	@ObfuscatedName("FZBYJQWE.a")
	public int[] field779;

	@ObfuscatedName("FZBYJQWE.b")
	public int[] field780;

	@ObfuscatedName("FZBYJQWE.c")
	public int[] field781;

	@ObfuscatedName("FZBYJQWE.g")
	public int[] field785;

	@ObfuscatedName("FZBYJQWE.h")
	public int[] field786;

	@ObfuscatedName("FZBYJQWE.i")
	public int[] field787;

	@ObfuscatedName("FZBYJQWE.d")
	public int[] field782;

	@ObfuscatedName("FZBYJQWE.e")
	public int[] field783;

	@ObfuscatedName("FZBYJQWE.f")
	public int[] field784;

	@ObfuscatedName("FZBYJQWE.j")
	public int[] field788;

	@ObfuscatedName("FZBYJQWE.p")
	public static int[] field794 = new int[6];

	@ObfuscatedName("FZBYJQWE.q")
	public static int[] field795 = new int[6];

	@ObfuscatedName("FZBYJQWE.r")
	public static int[] field796 = new int[6];

	@ObfuscatedName("FZBYJQWE.s")
	public static int[] field797 = new int[6];

	@ObfuscatedName("FZBYJQWE.t")
	public static int[] field798 = new int[6];

	@ObfuscatedName("FZBYJQWE.u")
	public static int[] field799 = new int[] { 1, 0 };

	@ObfuscatedName("FZBYJQWE.v")
	public static int[] field800 = new int[] { 2, 1 };

	@ObfuscatedName("FZBYJQWE.w")
	public static int[] field801 = new int[] { 3, 3 };

	@ObfuscatedName("FZBYJQWE.x")
	public static final int[][] field802 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("FZBYJQWE.y")
	public static final int[][] field803 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public FZBYJQWE(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg2 != arg11 || arg11 != arg17 || arg11 != arg15) {
			field789 = false;
		}

		field790 = arg5;
		field791 = arg9;
		field792 = arg3;
		field793 = arg1;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field802[arg5];
		int var25 = var24.length;
		field779 = new int[var25];
		field780 = new int[var25];
		field781 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg4 * var20;
		int var29 = arg14 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg9 - arg9 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg9 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg9 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg11;
				var35 = arg10;
				var36 = arg7;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg2 + arg11 >> 1;
				var35 = arg8 + arg10 >> 1;
				var36 = arg7 + arg16 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg2;
				var35 = arg8;
				var36 = arg16;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg17 >> 1;
				var35 = arg8 + arg18 >> 1;
				var36 = arg13 + arg16 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg17;
				var35 = arg18;
				var36 = arg13;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg15 + arg17 >> 1;
				var35 = arg0 + arg18 >> 1;
				var36 = arg6 + arg13 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg15;
				var35 = arg0;
				var36 = arg6;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg11 + arg15 >> 1;
				var35 = arg0 + arg10 >> 1;
				var36 = arg6 + arg7 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg2 + arg11 >> 1;
				var35 = arg8 + arg10 >> 1;
				var36 = arg7 + arg16 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg17 >> 1;
				var35 = arg8 + arg18 >> 1;
				var36 = arg13 + arg16 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg15 + arg17 >> 1;
				var35 = arg0 + arg18 >> 1;
				var36 = arg6 + arg13 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg11 + arg15 >> 1;
				var35 = arg0 + arg10 >> 1;
				var36 = arg6 + arg7 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg11;
				var35 = arg10;
				var36 = arg7;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg2;
				var35 = arg8;
				var36 = arg16;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg17;
				var35 = arg18;
				var36 = arg13;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg15;
				var35 = arg0;
				var36 = arg6;
			}

			field779[var30] = var32;
			field780[var30] = var34;
			field781[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field803[arg5];
		int var38 = var37.length / 4;
		field785 = new int[var38];
		field786 = new int[var38];
		field787 = new int[var38];
		field782 = new int[var38];
		field783 = new int[var38];
		field784 = new int[var38];

		if (arg12 != -1) {
			field788 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg9 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg9 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg9 & 0x3;
			}

			field785[var40] = var42;
			field786[var40] = var43;
			field787[var40] = var44;

			if (var41 == 0) {
				field782[var40] = var26[var42];
				field783[var40] = var26[var43];
				field784[var40] = var26[var44];

				if (field788 != null) {
					field788[var40] = -1;
				}
			} else {
				field782[var40] = var27[var42];
				field783[var40] = var27[var43];
				field784[var40] = var27[var44];

				if (field788 != null) {
					field788[var40] = arg12;
				}
			}
		}

		int var45 = arg11;
		int var46 = arg2;

		if (arg2 < arg11) {
			var45 = arg2;
		}

		if (arg2 > arg2) {
			var46 = arg2;
		}

		if (arg17 < var45) {
			var45 = arg17;
		}

		if (arg17 > var46) {
			var46 = arg17;
		}

		if (arg15 < var45) {
			var45 = arg15;
		}

		if (arg15 > var46) {
			var46 = arg15;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
