package deob;

@ObfuscatedName("QQLOBHZP")
public final class QQLOBHZP {

	@ObfuscatedName("QQLOBHZP.l")
	public boolean field1062 = true;

	@ObfuscatedName("QQLOBHZP.m")
	public int field1063;

	@ObfuscatedName("QQLOBHZP.n")
	public int field1064;

	@ObfuscatedName("QQLOBHZP.o")
	public int field1065;

	@ObfuscatedName("QQLOBHZP.p")
	public int field1066;

	@ObfuscatedName("QQLOBHZP.b")
	public int[] field1052;

	@ObfuscatedName("QQLOBHZP.c")
	public int[] field1053;

	@ObfuscatedName("QQLOBHZP.d")
	public int[] field1054;

	@ObfuscatedName("QQLOBHZP.h")
	public int[] field1058;

	@ObfuscatedName("QQLOBHZP.i")
	public int[] field1059;

	@ObfuscatedName("QQLOBHZP.j")
	public int[] field1060;

	@ObfuscatedName("QQLOBHZP.e")
	public int[] field1055;

	@ObfuscatedName("QQLOBHZP.f")
	public int[] field1056;

	@ObfuscatedName("QQLOBHZP.g")
	public int[] field1057;

	@ObfuscatedName("QQLOBHZP.k")
	public int[] field1061;

	@ObfuscatedName("QQLOBHZP.q")
	public static int[] field1067 = new int[6];

	@ObfuscatedName("QQLOBHZP.r")
	public static int[] field1068 = new int[6];

	@ObfuscatedName("QQLOBHZP.s")
	public static int[] field1069 = new int[6];

	@ObfuscatedName("QQLOBHZP.t")
	public static int[] field1070 = new int[6];

	@ObfuscatedName("QQLOBHZP.u")
	public static int[] field1071 = new int[6];

	@ObfuscatedName("QQLOBHZP.v")
	public static int[] field1072 = new int[] { 1, 0 };

	@ObfuscatedName("QQLOBHZP.w")
	public static int[] field1073 = new int[] { 2, 1 };

	@ObfuscatedName("QQLOBHZP.x")
	public static int[] field1074 = new int[] { 3, 3 };

	@ObfuscatedName("QQLOBHZP.y")
	public static final int[][] field1075 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("QQLOBHZP.z")
	public static final int[][] field1076 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public QQLOBHZP(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg8 != arg16 || arg7 != arg8 || arg8 != arg12) {
			field1062 = false;
		}

		field1063 = arg15;
		field1064 = arg18;
		field1065 = arg17;
		field1066 = arg13;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1075[arg15];
		int var25 = var24.length;
		field1052 = new int[var25];
		field1053 = new int[var25];
		field1054 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg14 * var20;
		int var29 = arg6 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg18 - arg18 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg18 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg18 - 13 & 0x3) + 13;
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
				var35 = arg9;
				var36 = arg2;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg8 + arg16 >> 1;
				var35 = arg0 + arg9 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg16;
				var35 = arg0;
				var36 = arg10;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg16 >> 1;
				var35 = arg0 + arg5 >> 1;
				var36 = arg10 + arg11 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg7;
				var35 = arg5;
				var36 = arg11;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg7 + arg12 >> 1;
				var35 = arg1 + arg5 >> 1;
				var36 = arg3 + arg11 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg12;
				var35 = arg1;
				var36 = arg3;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg8 + arg12 >> 1;
				var35 = arg1 + arg9 >> 1;
				var36 = arg2 + arg3 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg8 + arg16 >> 1;
				var35 = arg0 + arg9 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg16 >> 1;
				var35 = arg0 + arg5 >> 1;
				var36 = arg10 + arg11 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg7 + arg12 >> 1;
				var35 = arg1 + arg5 >> 1;
				var36 = arg3 + arg11 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg12 >> 1;
				var35 = arg1 + arg9 >> 1;
				var36 = arg2 + arg3 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg8;
				var35 = arg9;
				var36 = arg2;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg16;
				var35 = arg0;
				var36 = arg10;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg7;
				var35 = arg5;
				var36 = arg11;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg12;
				var35 = arg1;
				var36 = arg3;
			}

			field1052[var30] = var32;
			field1053[var30] = var34;
			field1054[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1076[arg15];
		int var38 = var37.length / 4;
		field1058 = new int[var38];
		field1059 = new int[var38];
		field1060 = new int[var38];
		field1055 = new int[var38];
		field1056 = new int[var38];
		field1057 = new int[var38];

		if (arg4 != -1) {
			field1061 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg18 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg18 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg18 & 0x3;
			}

			field1058[var40] = var42;
			field1059[var40] = var43;
			field1060[var40] = var44;

			if (var41 == 0) {
				field1055[var40] = var26[var42];
				field1056[var40] = var26[var43];
				field1057[var40] = var26[var44];

				if (field1061 != null) {
					field1061[var40] = -1;
				}
			} else {
				field1055[var40] = var27[var42];
				field1056[var40] = var27[var43];
				field1057[var40] = var27[var44];

				if (field1061 != null) {
					field1061[var40] = arg4;
				}
			}
		}

		int var45 = arg8;
		int var46 = arg16;

		if (arg16 < arg8) {
			var45 = arg16;
		}

		if (arg16 > arg16) {
			var46 = arg16;
		}

		if (arg7 < var45) {
			var45 = arg7;
		}

		if (arg7 > var46) {
			var46 = arg7;
		}

		if (arg12 < var45) {
			var45 = arg12;
		}

		if (arg12 > var46) {
			var46 = arg12;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
