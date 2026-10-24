package deob;

@ObfuscatedName("RJKJAFAI")
public final class RJKJAFAI {

	@ObfuscatedName("RJKJAFAI.m")
	public boolean field1211 = true;

	@ObfuscatedName("RJKJAFAI.n")
	public int field1212;

	@ObfuscatedName("RJKJAFAI.o")
	public int field1213;

	@ObfuscatedName("RJKJAFAI.p")
	public int field1214;

	@ObfuscatedName("RJKJAFAI.q")
	public int field1215;

	@ObfuscatedName("RJKJAFAI.c")
	public int[] field1201;

	@ObfuscatedName("RJKJAFAI.d")
	public int[] field1202;

	@ObfuscatedName("RJKJAFAI.e")
	public int[] field1203;

	@ObfuscatedName("RJKJAFAI.i")
	public int[] field1207;

	@ObfuscatedName("RJKJAFAI.j")
	public int[] field1208;

	@ObfuscatedName("RJKJAFAI.k")
	public int[] field1209;

	@ObfuscatedName("RJKJAFAI.f")
	public int[] field1204;

	@ObfuscatedName("RJKJAFAI.g")
	public int[] field1205;

	@ObfuscatedName("RJKJAFAI.h")
	public int[] field1206;

	@ObfuscatedName("RJKJAFAI.l")
	public int[] field1210;

	@ObfuscatedName("RJKJAFAI.r")
	public static int[] field1216 = new int[6];

	@ObfuscatedName("RJKJAFAI.s")
	public static int[] field1217 = new int[6];

	@ObfuscatedName("RJKJAFAI.t")
	public static int[] field1218 = new int[6];

	@ObfuscatedName("RJKJAFAI.u")
	public static int[] field1219 = new int[6];

	@ObfuscatedName("RJKJAFAI.v")
	public static int[] field1220 = new int[6];

	@ObfuscatedName("RJKJAFAI.w")
	public static int[] field1221 = new int[] { 1, 0 };

	@ObfuscatedName("RJKJAFAI.x")
	public static int[] field1222 = new int[] { 2, 1 };

	@ObfuscatedName("RJKJAFAI.y")
	public static int[] field1223 = new int[] { 3, 3 };

	@ObfuscatedName("RJKJAFAI.z")
	public static final int[][] field1224 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("RJKJAFAI.A")
	public static final int[][] field1225 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public RJKJAFAI(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg1 != arg7 || arg7 != arg8 || arg7 != arg11) {
			field1211 = false;
		}

		field1212 = arg15;
		field1213 = arg2;
		field1214 = arg13;
		field1215 = arg6;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1224[arg15];
		int var25 = var24.length;
		field1201 = new int[var25];
		field1202 = new int[var25];
		field1203 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg18 * var20;
		int var29 = arg9 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg2 - arg2 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg2 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg2 - 13 & 0x3) + 13;
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
				var36 = arg17;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg1 + arg7 >> 1;
				var35 = arg5 + arg16 >> 1;
				var36 = arg3 + arg17 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg1;
				var35 = arg5;
				var36 = arg3;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg8 >> 1;
				var35 = arg0 + arg5 >> 1;
				var36 = arg3 + arg10 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg0;
				var36 = arg10;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg8 + arg11 >> 1;
				var35 = arg0 + arg4 >> 1;
				var36 = arg10 + arg14 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg11;
				var35 = arg4;
				var36 = arg14;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg7 + arg11 >> 1;
				var35 = arg4 + arg16 >> 1;
				var36 = arg14 + arg17 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg1 + arg7 >> 1;
				var35 = arg5 + arg16 >> 1;
				var36 = arg3 + arg17 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg8 >> 1;
				var35 = arg0 + arg5 >> 1;
				var36 = arg3 + arg10 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg8 + arg11 >> 1;
				var35 = arg0 + arg4 >> 1;
				var36 = arg10 + arg14 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg11 >> 1;
				var35 = arg4 + arg16 >> 1;
				var36 = arg14 + arg17 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg7;
				var35 = arg16;
				var36 = arg17;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg5;
				var36 = arg3;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg0;
				var36 = arg10;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg11;
				var35 = arg4;
				var36 = arg14;
			}

			field1201[var30] = var32;
			field1202[var30] = var34;
			field1203[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1225[arg15];
		int var38 = var37.length / 4;
		field1207 = new int[var38];
		field1208 = new int[var38];
		field1209 = new int[var38];
		field1204 = new int[var38];
		field1205 = new int[var38];
		field1206 = new int[var38];

		if (arg12 != -1) {
			field1210 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg2 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg2 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg2 & 0x3;
			}

			field1207[var40] = var42;
			field1208[var40] = var43;
			field1209[var40] = var44;

			if (var41 == 0) {
				field1204[var40] = var26[var42];
				field1205[var40] = var26[var43];
				field1206[var40] = var26[var44];

				if (field1210 != null) {
					field1210[var40] = -1;
				}
			} else {
				field1204[var40] = var27[var42];
				field1205[var40] = var27[var43];
				field1206[var40] = var27[var44];

				if (field1210 != null) {
					field1210[var40] = arg12;
				}
			}
		}

		int var45 = arg7;
		int var46 = arg1;

		if (arg1 < arg7) {
			var45 = arg1;
		}

		if (arg1 > arg1) {
			var46 = arg1;
		}

		if (arg8 < var45) {
			var45 = arg8;
		}

		if (arg8 > var46) {
			var46 = arg8;
		}

		if (arg11 < var45) {
			var45 = arg11;
		}

		if (arg11 > var46) {
			var46 = arg11;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
