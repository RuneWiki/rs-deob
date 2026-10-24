package deob;

@ObfuscatedName("JNEMXYFJ")
public final class JNEMXYFJ {

	@ObfuscatedName("JNEMXYFJ.k")
	public boolean field984 = true;

	@ObfuscatedName("JNEMXYFJ.l")
	public int field985;

	@ObfuscatedName("JNEMXYFJ.m")
	public int field986;

	@ObfuscatedName("JNEMXYFJ.n")
	public int field987;

	@ObfuscatedName("JNEMXYFJ.o")
	public int field988;

	@ObfuscatedName("JNEMXYFJ.a")
	public int[] field974;

	@ObfuscatedName("JNEMXYFJ.b")
	public int[] field975;

	@ObfuscatedName("JNEMXYFJ.c")
	public int[] field976;

	@ObfuscatedName("JNEMXYFJ.g")
	public int[] field980;

	@ObfuscatedName("JNEMXYFJ.h")
	public int[] field981;

	@ObfuscatedName("JNEMXYFJ.i")
	public int[] field982;

	@ObfuscatedName("JNEMXYFJ.d")
	public int[] field977;

	@ObfuscatedName("JNEMXYFJ.e")
	public int[] field978;

	@ObfuscatedName("JNEMXYFJ.f")
	public int[] field979;

	@ObfuscatedName("JNEMXYFJ.j")
	public int[] field983;

	@ObfuscatedName("JNEMXYFJ.p")
	public static int[] field989 = new int[6];

	@ObfuscatedName("JNEMXYFJ.q")
	public static int[] field990 = new int[6];

	@ObfuscatedName("JNEMXYFJ.r")
	public static int[] field991 = new int[6];

	@ObfuscatedName("JNEMXYFJ.s")
	public static int[] field992 = new int[6];

	@ObfuscatedName("JNEMXYFJ.t")
	public static int[] field993 = new int[6];

	@ObfuscatedName("JNEMXYFJ.u")
	public static int[] field994 = new int[] { 1, 0 };

	@ObfuscatedName("JNEMXYFJ.v")
	public static int[] field995 = new int[] { 2, 1 };

	@ObfuscatedName("JNEMXYFJ.w")
	public static int[] field996 = new int[] { 3, 3 };

	@ObfuscatedName("JNEMXYFJ.x")
	public static final int[][] field997 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("JNEMXYFJ.y")
	public static final int[][] field998 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public JNEMXYFJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg14 != arg18 || arg14 != arg17 || arg0 != arg14) {
			field984 = false;
		}

		field985 = arg6;
		field986 = arg3;
		field987 = arg7;
		field988 = arg12;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field997[arg6];
		int var25 = var24.length;
		field974 = new int[var25];
		field975 = new int[var25];
		field976 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg9 * var20;
		int var29 = arg16 * var20;
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
				var34 = arg14;
				var35 = arg2;
				var36 = arg11;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg14 + arg18 >> 1;
				var35 = arg2 + arg4 >> 1;
				var36 = arg11 + arg13 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg18;
				var35 = arg4;
				var36 = arg13;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg17 + arg18 >> 1;
				var35 = arg4 + arg15 >> 1;
				var36 = arg5 + arg13 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg17;
				var35 = arg15;
				var36 = arg5;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg0 + arg17 >> 1;
				var35 = arg8 + arg15 >> 1;
				var36 = arg1 + arg5 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg0;
				var35 = arg8;
				var36 = arg1;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg14 >> 1;
				var35 = arg2 + arg8 >> 1;
				var36 = arg1 + arg11 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg14 + arg18 >> 1;
				var35 = arg2 + arg4 >> 1;
				var36 = arg11 + arg13 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg17 + arg18 >> 1;
				var35 = arg4 + arg15 >> 1;
				var36 = arg5 + arg13 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg0 + arg17 >> 1;
				var35 = arg8 + arg15 >> 1;
				var36 = arg1 + arg5 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg14 >> 1;
				var35 = arg2 + arg8 >> 1;
				var36 = arg1 + arg11 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg14;
				var35 = arg2;
				var36 = arg11;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg18;
				var35 = arg4;
				var36 = arg13;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg17;
				var35 = arg15;
				var36 = arg5;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg0;
				var35 = arg8;
				var36 = arg1;
			}

			field974[var30] = var32;
			field975[var30] = var34;
			field976[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field998[arg6];
		int var38 = var37.length / 4;
		field980 = new int[var38];
		field981 = new int[var38];
		field982 = new int[var38];
		field977 = new int[var38];
		field978 = new int[var38];
		field979 = new int[var38];

		if (arg10 != -1) {
			field983 = new int[var38];
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

			field980[var40] = var42;
			field981[var40] = var43;
			field982[var40] = var44;

			if (var41 == 0) {
				field977[var40] = var26[var42];
				field978[var40] = var26[var43];
				field979[var40] = var26[var44];

				if (field983 != null) {
					field983[var40] = -1;
				}
			} else {
				field977[var40] = var27[var42];
				field978[var40] = var27[var43];
				field979[var40] = var27[var44];

				if (field983 != null) {
					field983[var40] = arg10;
				}
			}
		}

		int var45 = arg14;
		int var46 = arg18;

		if (arg18 < arg14) {
			var45 = arg18;
		}

		if (arg18 > arg18) {
			var46 = arg18;
		}

		if (arg17 < var45) {
			var45 = arg17;
		}

		if (arg17 > var46) {
			var46 = arg17;
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
