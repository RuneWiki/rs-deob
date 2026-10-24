package deob;

@ObfuscatedName("PWBAIXUA")
public final class PWBAIXUA {

	@ObfuscatedName("PWBAIXUA.k")
	public boolean field1084 = true;

	@ObfuscatedName("PWBAIXUA.l")
	public int field1085;

	@ObfuscatedName("PWBAIXUA.m")
	public int field1086;

	@ObfuscatedName("PWBAIXUA.n")
	public int field1087;

	@ObfuscatedName("PWBAIXUA.o")
	public int field1088;

	@ObfuscatedName("PWBAIXUA.a")
	public int[] field1074;

	@ObfuscatedName("PWBAIXUA.b")
	public int[] field1075;

	@ObfuscatedName("PWBAIXUA.c")
	public int[] field1076;

	@ObfuscatedName("PWBAIXUA.g")
	public int[] field1080;

	@ObfuscatedName("PWBAIXUA.h")
	public int[] field1081;

	@ObfuscatedName("PWBAIXUA.i")
	public int[] field1082;

	@ObfuscatedName("PWBAIXUA.d")
	public int[] field1077;

	@ObfuscatedName("PWBAIXUA.e")
	public int[] field1078;

	@ObfuscatedName("PWBAIXUA.f")
	public int[] field1079;

	@ObfuscatedName("PWBAIXUA.j")
	public int[] field1083;

	@ObfuscatedName("PWBAIXUA.p")
	public static int[] field1089 = new int[6];

	@ObfuscatedName("PWBAIXUA.q")
	public static int[] field1090 = new int[6];

	@ObfuscatedName("PWBAIXUA.r")
	public static int[] field1091 = new int[6];

	@ObfuscatedName("PWBAIXUA.s")
	public static int[] field1092 = new int[6];

	@ObfuscatedName("PWBAIXUA.t")
	public static int[] field1093 = new int[6];

	@ObfuscatedName("PWBAIXUA.u")
	public static int[] field1094 = new int[] { 1, 0 };

	@ObfuscatedName("PWBAIXUA.v")
	public static int[] field1095 = new int[] { 2, 1 };

	@ObfuscatedName("PWBAIXUA.w")
	public static int[] field1096 = new int[] { 3, 3 };

	@ObfuscatedName("PWBAIXUA.x")
	public static final int[][] field1097 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("PWBAIXUA.y")
	public static final int[][] field1098 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public PWBAIXUA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg5 != arg6 || arg5 != arg14 || arg5 != arg15) {
			field1084 = false;
		}

		field1085 = arg13;
		field1086 = arg7;
		field1087 = arg12;
		field1088 = arg1;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1097[arg13];
		int var25 = var24.length;
		field1074 = new int[var25];
		field1075 = new int[var25];
		field1076 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg11 * var20;
		int var29 = arg8 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg7 - arg7 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg7 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg7 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg5;
				var35 = arg0;
				var36 = arg17;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg5 + arg6 >> 1;
				var35 = arg0 + arg3 >> 1;
				var36 = arg2 + arg17 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg6;
				var35 = arg3;
				var36 = arg2;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg14 >> 1;
				var35 = arg3 + arg4 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg14;
				var35 = arg4;
				var36 = arg10;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg14 + arg15 >> 1;
				var35 = arg4 + arg18 >> 1;
				var36 = arg9 + arg10 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg15;
				var35 = arg18;
				var36 = arg9;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg5 + arg15 >> 1;
				var35 = arg0 + arg18 >> 1;
				var36 = arg9 + arg17 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg5 + arg6 >> 1;
				var35 = arg0 + arg3 >> 1;
				var36 = arg2 + arg17 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg14 >> 1;
				var35 = arg3 + arg4 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg14 + arg15 >> 1;
				var35 = arg4 + arg18 >> 1;
				var36 = arg9 + arg10 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg15 >> 1;
				var35 = arg0 + arg18 >> 1;
				var36 = arg9 + arg17 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg5;
				var35 = arg0;
				var36 = arg17;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg6;
				var35 = arg3;
				var36 = arg2;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg14;
				var35 = arg4;
				var36 = arg10;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg15;
				var35 = arg18;
				var36 = arg9;
			}

			field1074[var30] = var32;
			field1075[var30] = var34;
			field1076[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1098[arg13];
		int var38 = var37.length / 4;
		field1080 = new int[var38];
		field1081 = new int[var38];
		field1082 = new int[var38];
		field1077 = new int[var38];
		field1078 = new int[var38];
		field1079 = new int[var38];

		if (arg16 != -1) {
			field1083 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg7 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg7 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg7 & 0x3;
			}

			field1080[var40] = var42;
			field1081[var40] = var43;
			field1082[var40] = var44;

			if (var41 == 0) {
				field1077[var40] = var26[var42];
				field1078[var40] = var26[var43];
				field1079[var40] = var26[var44];

				if (field1083 != null) {
					field1083[var40] = -1;
				}
			} else {
				field1077[var40] = var27[var42];
				field1078[var40] = var27[var43];
				field1079[var40] = var27[var44];

				if (field1083 != null) {
					field1083[var40] = arg16;
				}
			}
		}

		int var45 = arg5;
		int var46 = arg6;

		if (arg6 < arg5) {
			var45 = arg6;
		}

		if (arg6 > arg6) {
			var46 = arg6;
		}

		if (arg14 < var45) {
			var45 = arg14;
		}

		if (arg14 > var46) {
			var46 = arg14;
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
