package deob;

@ObfuscatedName("NSOTQYBG")
public final class NSOTQYBG {

	@ObfuscatedName("NSOTQYBG.l")
	public boolean field1022 = true;

	@ObfuscatedName("NSOTQYBG.m")
	public int field1023;

	@ObfuscatedName("NSOTQYBG.n")
	public int field1024;

	@ObfuscatedName("NSOTQYBG.o")
	public int field1025;

	@ObfuscatedName("NSOTQYBG.p")
	public int field1026;

	@ObfuscatedName("NSOTQYBG.b")
	public int[] field1012;

	@ObfuscatedName("NSOTQYBG.c")
	public int[] field1013;

	@ObfuscatedName("NSOTQYBG.d")
	public int[] field1014;

	@ObfuscatedName("NSOTQYBG.h")
	public int[] field1018;

	@ObfuscatedName("NSOTQYBG.i")
	public int[] field1019;

	@ObfuscatedName("NSOTQYBG.j")
	public int[] field1020;

	@ObfuscatedName("NSOTQYBG.e")
	public int[] field1015;

	@ObfuscatedName("NSOTQYBG.f")
	public int[] field1016;

	@ObfuscatedName("NSOTQYBG.g")
	public int[] field1017;

	@ObfuscatedName("NSOTQYBG.k")
	public int[] field1021;

	@ObfuscatedName("NSOTQYBG.q")
	public static int[] field1027 = new int[6];

	@ObfuscatedName("NSOTQYBG.r")
	public static int[] field1028 = new int[6];

	@ObfuscatedName("NSOTQYBG.s")
	public static int[] field1029 = new int[6];

	@ObfuscatedName("NSOTQYBG.t")
	public static int[] field1030 = new int[6];

	@ObfuscatedName("NSOTQYBG.u")
	public static int[] field1031 = new int[6];

	@ObfuscatedName("NSOTQYBG.v")
	public static int[] field1032 = new int[] { 1, 0 };

	@ObfuscatedName("NSOTQYBG.w")
	public static int[] field1033 = new int[] { 2, 1 };

	@ObfuscatedName("NSOTQYBG.x")
	public static int[] field1034 = new int[] { 3, 3 };

	@ObfuscatedName("NSOTQYBG.y")
	public static final int[][] field1035 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("NSOTQYBG.z")
	public static final int[][] field1036 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public NSOTQYBG(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg1 != arg10 || arg10 != arg14 || arg10 != arg17) {
			field1022 = false;
		}

		field1023 = arg2;
		field1024 = arg8;
		field1025 = arg9;
		field1026 = arg6;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1035[arg2];
		int var25 = var24.length;
		field1012 = new int[var25];
		field1013 = new int[var25];
		field1014 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg12 * var20;
		int var29 = arg4 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg8 - arg8 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg8 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg8 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg10;
				var35 = arg15;
				var36 = arg18;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg1 + arg10 >> 1;
				var35 = arg11 + arg15 >> 1;
				var36 = arg13 + arg18 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg1;
				var35 = arg11;
				var36 = arg13;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg14 >> 1;
				var35 = arg11 + arg16 >> 1;
				var36 = arg0 + arg13 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg14;
				var35 = arg16;
				var36 = arg0;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg14 + arg17 >> 1;
				var35 = arg5 + arg16 >> 1;
				var36 = arg0 + arg7 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg17;
				var35 = arg5;
				var36 = arg7;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg10 + arg17 >> 1;
				var35 = arg5 + arg15 >> 1;
				var36 = arg7 + arg18 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg1 + arg10 >> 1;
				var35 = arg11 + arg15 >> 1;
				var36 = arg13 + arg18 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg14 >> 1;
				var35 = arg11 + arg16 >> 1;
				var36 = arg0 + arg13 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg14 + arg17 >> 1;
				var35 = arg5 + arg16 >> 1;
				var36 = arg0 + arg7 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg10 + arg17 >> 1;
				var35 = arg5 + arg15 >> 1;
				var36 = arg7 + arg18 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg10;
				var35 = arg15;
				var36 = arg18;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg11;
				var36 = arg13;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg14;
				var35 = arg16;
				var36 = arg0;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg17;
				var35 = arg5;
				var36 = arg7;
			}

			field1012[var30] = var32;
			field1013[var30] = var34;
			field1014[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1036[arg2];
		int var38 = var37.length / 4;
		field1018 = new int[var38];
		field1019 = new int[var38];
		field1020 = new int[var38];
		field1015 = new int[var38];
		field1016 = new int[var38];
		field1017 = new int[var38];

		if (arg3 != -1) {
			field1021 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg8 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg8 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg8 & 0x3;
			}

			field1018[var40] = var42;
			field1019[var40] = var43;
			field1020[var40] = var44;

			if (var41 == 0) {
				field1015[var40] = var26[var42];
				field1016[var40] = var26[var43];
				field1017[var40] = var26[var44];

				if (field1021 != null) {
					field1021[var40] = -1;
				}
			} else {
				field1015[var40] = var27[var42];
				field1016[var40] = var27[var43];
				field1017[var40] = var27[var44];

				if (field1021 != null) {
					field1021[var40] = arg3;
				}
			}
		}

		int var45 = arg10;
		int var46 = arg1;

		if (arg1 < arg10) {
			var45 = arg1;
		}

		if (arg1 > arg1) {
			var46 = arg1;
		}

		if (arg14 < var45) {
			var45 = arg14;
		}

		if (arg14 > var46) {
			var46 = arg14;
		}

		if (arg17 < var45) {
			var45 = arg17;
		}

		if (arg17 > var46) {
			var46 = arg17;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
