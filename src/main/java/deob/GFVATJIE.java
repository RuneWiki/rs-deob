package deob;

@ObfuscatedName("GFVATJIE")
public final class GFVATJIE {

	@ObfuscatedName("GFVATJIE.k")
	public boolean field717 = true;

	@ObfuscatedName("GFVATJIE.l")
	public int field718;

	@ObfuscatedName("GFVATJIE.m")
	public int field719;

	@ObfuscatedName("GFVATJIE.n")
	public int field720;

	@ObfuscatedName("GFVATJIE.o")
	public int field721;

	@ObfuscatedName("GFVATJIE.a")
	public int[] field707;

	@ObfuscatedName("GFVATJIE.b")
	public int[] field708;

	@ObfuscatedName("GFVATJIE.c")
	public int[] field709;

	@ObfuscatedName("GFVATJIE.g")
	public int[] field713;

	@ObfuscatedName("GFVATJIE.h")
	public int[] field714;

	@ObfuscatedName("GFVATJIE.i")
	public int[] field715;

	@ObfuscatedName("GFVATJIE.d")
	public int[] field710;

	@ObfuscatedName("GFVATJIE.e")
	public int[] field711;

	@ObfuscatedName("GFVATJIE.f")
	public int[] field712;

	@ObfuscatedName("GFVATJIE.j")
	public int[] field716;

	@ObfuscatedName("GFVATJIE.p")
	public static int[] field722 = new int[6];

	@ObfuscatedName("GFVATJIE.q")
	public static int[] field723 = new int[6];

	@ObfuscatedName("GFVATJIE.r")
	public static int[] field724 = new int[6];

	@ObfuscatedName("GFVATJIE.s")
	public static int[] field725 = new int[6];

	@ObfuscatedName("GFVATJIE.t")
	public static int[] field726 = new int[6];

	@ObfuscatedName("GFVATJIE.u")
	public static int[] field727 = new int[] { 1, 0 };

	@ObfuscatedName("GFVATJIE.v")
	public static int[] field728 = new int[] { 2, 1 };

	@ObfuscatedName("GFVATJIE.w")
	public static int[] field729 = new int[] { 3, 3 };

	@ObfuscatedName("GFVATJIE.x")
	public static final int[][] field730 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("GFVATJIE.y")
	public static final int[][] field731 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public GFVATJIE(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg8 != arg18 || arg7 != arg8 || arg0 != arg8) {
			field717 = false;
		}

		field718 = arg12;
		field719 = arg1;
		field720 = arg14;
		field721 = arg11;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field730[arg12];
		int var25 = var24.length;
		field707 = new int[var25];
		field708 = new int[var25];
		field709 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg2 * var20;
		int var29 = arg9 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg1 - arg1 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg1 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg1 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg8;
				var35 = arg13;
				var36 = arg10;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg8 + arg18 >> 1;
				var35 = arg13 + arg15 >> 1;
				var36 = arg6 + arg10 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg18;
				var35 = arg15;
				var36 = arg6;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg18 >> 1;
				var35 = arg5 + arg15 >> 1;
				var36 = arg4 + arg6 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg7;
				var35 = arg5;
				var36 = arg4;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg0 + arg7 >> 1;
				var35 = arg5 + arg16 >> 1;
				var36 = arg3 + arg4 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg0;
				var35 = arg16;
				var36 = arg3;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg8 >> 1;
				var35 = arg13 + arg16 >> 1;
				var36 = arg3 + arg10 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg8 + arg18 >> 1;
				var35 = arg13 + arg15 >> 1;
				var36 = arg6 + arg10 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg18 >> 1;
				var35 = arg5 + arg15 >> 1;
				var36 = arg4 + arg6 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg0 + arg7 >> 1;
				var35 = arg5 + arg16 >> 1;
				var36 = arg3 + arg4 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg8 >> 1;
				var35 = arg13 + arg16 >> 1;
				var36 = arg3 + arg10 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg8;
				var35 = arg13;
				var36 = arg10;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg18;
				var35 = arg15;
				var36 = arg6;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg7;
				var35 = arg5;
				var36 = arg4;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg0;
				var35 = arg16;
				var36 = arg3;
			}

			field707[var30] = var32;
			field708[var30] = var34;
			field709[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field731[arg12];
		int var38 = var37.length / 4;
		field713 = new int[var38];
		field714 = new int[var38];
		field715 = new int[var38];
		field710 = new int[var38];
		field711 = new int[var38];
		field712 = new int[var38];

		if (arg17 != -1) {
			field716 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg1 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg1 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg1 & 0x3;
			}

			field713[var40] = var42;
			field714[var40] = var43;
			field715[var40] = var44;

			if (var41 == 0) {
				field710[var40] = var26[var42];
				field711[var40] = var26[var43];
				field712[var40] = var26[var44];

				if (field716 != null) {
					field716[var40] = -1;
				}
			} else {
				field710[var40] = var27[var42];
				field711[var40] = var27[var43];
				field712[var40] = var27[var44];

				if (field716 != null) {
					field716[var40] = arg17;
				}
			}
		}

		int var45 = arg8;
		int var46 = arg18;

		if (arg18 < arg8) {
			var45 = arg18;
		}

		if (arg18 > arg18) {
			var46 = arg18;
		}

		if (arg7 < var45) {
			var45 = arg7;
		}

		if (arg7 > var46) {
			var46 = arg7;
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
