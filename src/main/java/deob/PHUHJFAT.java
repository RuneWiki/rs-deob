package deob;

@ObfuscatedName("PHUHJFAT")
public final class PHUHJFAT {

	@ObfuscatedName("PHUHJFAT.l")
	public boolean field1170 = true;

	@ObfuscatedName("PHUHJFAT.m")
	public int field1171;

	@ObfuscatedName("PHUHJFAT.n")
	public int field1172;

	@ObfuscatedName("PHUHJFAT.o")
	public int field1173;

	@ObfuscatedName("PHUHJFAT.p")
	public int field1174;

	@ObfuscatedName("PHUHJFAT.b")
	public int[] field1160;

	@ObfuscatedName("PHUHJFAT.c")
	public int[] field1161;

	@ObfuscatedName("PHUHJFAT.d")
	public int[] field1162;

	@ObfuscatedName("PHUHJFAT.h")
	public int[] field1166;

	@ObfuscatedName("PHUHJFAT.i")
	public int[] field1167;

	@ObfuscatedName("PHUHJFAT.j")
	public int[] field1168;

	@ObfuscatedName("PHUHJFAT.e")
	public int[] field1163;

	@ObfuscatedName("PHUHJFAT.f")
	public int[] field1164;

	@ObfuscatedName("PHUHJFAT.g")
	public int[] field1165;

	@ObfuscatedName("PHUHJFAT.k")
	public int[] field1169;

	@ObfuscatedName("PHUHJFAT.q")
	public static int[] field1175 = new int[6];

	@ObfuscatedName("PHUHJFAT.r")
	public static int[] field1176 = new int[6];

	@ObfuscatedName("PHUHJFAT.s")
	public static int[] field1177 = new int[6];

	@ObfuscatedName("PHUHJFAT.t")
	public static int[] field1178 = new int[6];

	@ObfuscatedName("PHUHJFAT.u")
	public static int[] field1179 = new int[6];

	@ObfuscatedName("PHUHJFAT.v")
	public static int[] field1180 = new int[] { 1, 0 };

	@ObfuscatedName("PHUHJFAT.w")
	public static int[] field1181 = new int[] { 2, 1 };

	@ObfuscatedName("PHUHJFAT.x")
	public static int[] field1182 = new int[] { 3, 3 };

	@ObfuscatedName("PHUHJFAT.y")
	public static final int[][] field1183 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("PHUHJFAT.z")
	public static final int[][] field1184 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public PHUHJFAT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg0 != arg1 || arg1 != arg10 || arg1 != arg6) {
			field1170 = false;
		}

		field1171 = arg3;
		field1172 = arg17;
		field1173 = arg9;
		field1174 = arg8;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1183[arg3];
		int var25 = var24.length;
		field1160 = new int[var25];
		field1161 = new int[var25];
		field1162 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg11 * var20;
		int var29 = arg16 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg17 - arg17 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg17 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg17 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg1;
				var35 = arg18;
				var36 = arg2;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg0 + arg1 >> 1;
				var35 = arg14 + arg18 >> 1;
				var36 = arg2 + arg13 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg0;
				var35 = arg14;
				var36 = arg13;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg10 >> 1;
				var35 = arg5 + arg14 >> 1;
				var36 = arg7 + arg13 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg10;
				var35 = arg5;
				var36 = arg7;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg6 + arg10 >> 1;
				var35 = arg5 + arg15 >> 1;
				var36 = arg4 + arg7 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg6;
				var35 = arg15;
				var36 = arg4;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg1 + arg6 >> 1;
				var35 = arg15 + arg18 >> 1;
				var36 = arg2 + arg4 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg0 + arg1 >> 1;
				var35 = arg14 + arg18 >> 1;
				var36 = arg2 + arg13 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg10 >> 1;
				var35 = arg5 + arg14 >> 1;
				var36 = arg7 + arg13 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg6 + arg10 >> 1;
				var35 = arg5 + arg15 >> 1;
				var36 = arg4 + arg7 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg6 >> 1;
				var35 = arg15 + arg18 >> 1;
				var36 = arg2 + arg4 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg18;
				var36 = arg2;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg0;
				var35 = arg14;
				var36 = arg13;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg10;
				var35 = arg5;
				var36 = arg7;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg6;
				var35 = arg15;
				var36 = arg4;
			}

			field1160[var30] = var32;
			field1161[var30] = var34;
			field1162[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1184[arg3];
		int var38 = var37.length / 4;
		field1166 = new int[var38];
		field1167 = new int[var38];
		field1168 = new int[var38];
		field1163 = new int[var38];
		field1164 = new int[var38];
		field1165 = new int[var38];

		if (arg12 != -1) {
			field1169 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg17 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg17 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg17 & 0x3;
			}

			field1166[var40] = var42;
			field1167[var40] = var43;
			field1168[var40] = var44;

			if (var41 == 0) {
				field1163[var40] = var26[var42];
				field1164[var40] = var26[var43];
				field1165[var40] = var26[var44];

				if (field1169 != null) {
					field1169[var40] = -1;
				}
			} else {
				field1163[var40] = var27[var42];
				field1164[var40] = var27[var43];
				field1165[var40] = var27[var44];

				if (field1169 != null) {
					field1169[var40] = arg12;
				}
			}
		}

		int var45 = arg1;
		int var46 = arg0;

		if (arg0 < arg1) {
			var45 = arg0;
		}

		if (arg0 > arg0) {
			var46 = arg0;
		}

		if (arg10 < var45) {
			var45 = arg10;
		}

		if (arg10 > var46) {
			var46 = arg10;
		}

		if (arg6 < var45) {
			var45 = arg6;
		}

		if (arg6 > var46) {
			var46 = arg6;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
