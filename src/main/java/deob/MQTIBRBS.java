package deob;

@ObfuscatedName("MQTIBRBS")
public final class MQTIBRBS {

	@ObfuscatedName("MQTIBRBS.l")
	public boolean field1096 = true;

	@ObfuscatedName("MQTIBRBS.m")
	public int field1097;

	@ObfuscatedName("MQTIBRBS.n")
	public int field1098;

	@ObfuscatedName("MQTIBRBS.o")
	public int field1099;

	@ObfuscatedName("MQTIBRBS.p")
	public int field1100;

	@ObfuscatedName("MQTIBRBS.b")
	public int[] field1086;

	@ObfuscatedName("MQTIBRBS.c")
	public int[] field1087;

	@ObfuscatedName("MQTIBRBS.d")
	public int[] field1088;

	@ObfuscatedName("MQTIBRBS.h")
	public int[] field1092;

	@ObfuscatedName("MQTIBRBS.i")
	public int[] field1093;

	@ObfuscatedName("MQTIBRBS.j")
	public int[] field1094;

	@ObfuscatedName("MQTIBRBS.e")
	public int[] field1089;

	@ObfuscatedName("MQTIBRBS.f")
	public int[] field1090;

	@ObfuscatedName("MQTIBRBS.g")
	public int[] field1091;

	@ObfuscatedName("MQTIBRBS.k")
	public int[] field1095;

	@ObfuscatedName("MQTIBRBS.q")
	public static int[] field1101 = new int[6];

	@ObfuscatedName("MQTIBRBS.r")
	public static int[] field1102 = new int[6];

	@ObfuscatedName("MQTIBRBS.s")
	public static int[] field1103 = new int[6];

	@ObfuscatedName("MQTIBRBS.t")
	public static int[] field1104 = new int[6];

	@ObfuscatedName("MQTIBRBS.u")
	public static int[] field1105 = new int[6];

	@ObfuscatedName("MQTIBRBS.v")
	public static int[] field1106 = new int[] { 1, 0 };

	@ObfuscatedName("MQTIBRBS.w")
	public static int[] field1107 = new int[] { 2, 1 };

	@ObfuscatedName("MQTIBRBS.x")
	public static int[] field1108 = new int[] { 3, 3 };

	@ObfuscatedName("MQTIBRBS.y")
	public static final int[][] field1109 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("MQTIBRBS.z")
	public static final int[][] field1110 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public MQTIBRBS(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg7 != arg18 || arg5 != arg7 || arg7 != arg12) {
			field1096 = false;
		}

		field1097 = arg0;
		field1098 = arg13;
		field1099 = arg15;
		field1100 = arg3;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1109[arg0];
		int var25 = var24.length;
		field1086 = new int[var25];
		field1087 = new int[var25];
		field1088 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg6 * var20;
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
				var34 = arg7;
				var35 = arg16;
				var36 = arg11;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg7 + arg18 >> 1;
				var35 = arg16 + arg17 >> 1;
				var36 = arg10 + arg11 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg18;
				var35 = arg17;
				var36 = arg10;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg18 >> 1;
				var35 = arg8 + arg17 >> 1;
				var36 = arg10 + arg14 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg5;
				var35 = arg8;
				var36 = arg14;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg5 + arg12 >> 1;
				var35 = arg8 + arg9 >> 1;
				var36 = arg1 + arg14 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg12;
				var35 = arg9;
				var36 = arg1;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg7 + arg12 >> 1;
				var35 = arg9 + arg16 >> 1;
				var36 = arg1 + arg11 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg7 + arg18 >> 1;
				var35 = arg16 + arg17 >> 1;
				var36 = arg10 + arg11 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg18 >> 1;
				var35 = arg8 + arg17 >> 1;
				var36 = arg10 + arg14 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg5 + arg12 >> 1;
				var35 = arg8 + arg9 >> 1;
				var36 = arg1 + arg14 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg12 >> 1;
				var35 = arg9 + arg16 >> 1;
				var36 = arg1 + arg11 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg7;
				var35 = arg16;
				var36 = arg11;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg18;
				var35 = arg17;
				var36 = arg10;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg5;
				var35 = arg8;
				var36 = arg14;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg12;
				var35 = arg9;
				var36 = arg1;
			}

			field1086[var30] = var32;
			field1087[var30] = var34;
			field1088[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1110[arg0];
		int var38 = var37.length / 4;
		field1092 = new int[var38];
		field1093 = new int[var38];
		field1094 = new int[var38];
		field1089 = new int[var38];
		field1090 = new int[var38];
		field1091 = new int[var38];

		if (arg4 != -1) {
			field1095 = new int[var38];
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

			field1092[var40] = var42;
			field1093[var40] = var43;
			field1094[var40] = var44;

			if (var41 == 0) {
				field1089[var40] = var26[var42];
				field1090[var40] = var26[var43];
				field1091[var40] = var26[var44];

				if (field1095 != null) {
					field1095[var40] = -1;
				}
			} else {
				field1089[var40] = var27[var42];
				field1090[var40] = var27[var43];
				field1091[var40] = var27[var44];

				if (field1095 != null) {
					field1095[var40] = arg4;
				}
			}
		}

		int var45 = arg7;
		int var46 = arg18;

		if (arg18 < arg7) {
			var45 = arg18;
		}

		if (arg18 > arg18) {
			var46 = arg18;
		}

		if (arg5 < var45) {
			var45 = arg5;
		}

		if (arg5 > var46) {
			var46 = arg5;
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
