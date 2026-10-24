package deob;

@ObfuscatedName("j")
public final class class10 {

	@ObfuscatedName("j.a")
	public int[] field149;

	@ObfuscatedName("j.b")
	public int[] field150;

	@ObfuscatedName("j.c")
	public int[] field151;

	@ObfuscatedName("j.d")
	public int[] field152;

	@ObfuscatedName("j.e")
	public int[] field153;

	@ObfuscatedName("j.f")
	public int[] field154;

	@ObfuscatedName("j.g")
	public int[] field155;

	@ObfuscatedName("j.h")
	public int[] field156;

	@ObfuscatedName("j.i")
	public int[] field157;

	@ObfuscatedName("j.j")
	public int[] field158;

	@ObfuscatedName("j.k")
	public boolean field159 = true;

	@ObfuscatedName("j.l")
	public int field160;

	@ObfuscatedName("j.m")
	public int field161;

	@ObfuscatedName("j.n")
	public int field162;

	@ObfuscatedName("j.o")
	public int field163;

	@ObfuscatedName("j.p")
	public static int[] field164 = new int[6];

	@ObfuscatedName("j.q")
	public static int[] field165 = new int[6];

	@ObfuscatedName("j.r")
	public static int[] field166 = new int[6];

	@ObfuscatedName("j.s")
	public static int[] field167 = new int[6];

	@ObfuscatedName("j.t")
	public static int[] field168 = new int[6];

	@ObfuscatedName("j.u")
	public static int[] field169 = new int[] { 1, 0 };

	@ObfuscatedName("j.v")
	public static int[] field170 = new int[] { 2, 1 };

	@ObfuscatedName("j.w")
	public static int[] field171 = new int[] { 3, 3 };

	@ObfuscatedName("j.x")
	public static final int[][] field172 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("j.y")
	public static final int[][] field173 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg6 != arg8 || arg6 != arg16 || arg5 != arg6) {
			field159 = false;
		}

		field160 = arg13;
		field161 = arg0;
		field162 = arg12;
		field163 = arg18;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field172[arg13];
		int var25 = var24.length;
		field149 = new int[var25];
		field150 = new int[var25];
		field151 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg1 * var20;
		int var29 = arg4 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg0 - arg0 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg0 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg0 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg6;
				var35 = arg15;
				var36 = arg2;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg6 + arg8 >> 1;
				var35 = arg9 + arg15 >> 1;
				var36 = arg2 + arg7 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg8;
				var35 = arg9;
				var36 = arg7;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg16 >> 1;
				var35 = arg9 + arg10 >> 1;
				var36 = arg7 + arg17 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg16;
				var35 = arg10;
				var36 = arg17;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg5 + arg16 >> 1;
				var35 = arg3 + arg10 >> 1;
				var36 = arg14 + arg17 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg5;
				var35 = arg3;
				var36 = arg14;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg5 + arg6 >> 1;
				var35 = arg3 + arg15 >> 1;
				var36 = arg2 + arg14 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg6 + arg8 >> 1;
				var35 = arg9 + arg15 >> 1;
				var36 = arg2 + arg7 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg16 >> 1;
				var35 = arg9 + arg10 >> 1;
				var36 = arg7 + arg17 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg5 + arg16 >> 1;
				var35 = arg3 + arg10 >> 1;
				var36 = arg14 + arg17 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg6 >> 1;
				var35 = arg3 + arg15 >> 1;
				var36 = arg2 + arg14 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg6;
				var35 = arg15;
				var36 = arg2;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg8;
				var35 = arg9;
				var36 = arg7;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg16;
				var35 = arg10;
				var36 = arg17;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg5;
				var35 = arg3;
				var36 = arg14;
			}

			field149[var30] = var32;
			field150[var30] = var34;
			field151[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field173[arg13];
		int var38 = var37.length / 4;
		field155 = new int[var38];
		field156 = new int[var38];
		field157 = new int[var38];
		field152 = new int[var38];
		field153 = new int[var38];
		field154 = new int[var38];

		if (arg11 != -1) {
			field158 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg0 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg0 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg0 & 0x3;
			}

			field155[var40] = var42;
			field156[var40] = var43;
			field157[var40] = var44;

			if (var41 == 0) {
				field152[var40] = var26[var42];
				field153[var40] = var26[var43];
				field154[var40] = var26[var44];

				if (field158 != null) {
					field158[var40] = -1;
				}
			} else {
				field152[var40] = var27[var42];
				field153[var40] = var27[var43];
				field154[var40] = var27[var44];

				if (field158 != null) {
					field158[var40] = arg11;
				}
			}
		}

		int var45 = arg6;
		int var46 = arg8;

		if (arg8 < arg6) {
			var45 = arg8;
		}

		if (arg8 > arg8) {
			var46 = arg8;
		}

		if (arg16 < var45) {
			var45 = arg16;
		}

		if (arg16 > var46) {
			var46 = arg16;
		}

		if (arg5 < var45) {
			var45 = arg5;
		}

		if (arg5 > var46) {
			var46 = arg5;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
