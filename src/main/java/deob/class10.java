package deob;

@ObfuscatedName("j")
public final class class10 {

	@ObfuscatedName("j.a")
	public int[] field158;

	@ObfuscatedName("j.b")
	public int[] field159;

	@ObfuscatedName("j.c")
	public int[] field160;

	@ObfuscatedName("j.d")
	public int[] field161;

	@ObfuscatedName("j.e")
	public int[] field162;

	@ObfuscatedName("j.f")
	public int[] field163;

	@ObfuscatedName("j.g")
	public int[] field164;

	@ObfuscatedName("j.h")
	public int[] field165;

	@ObfuscatedName("j.i")
	public int[] field166;

	@ObfuscatedName("j.j")
	public int[] field167;

	@ObfuscatedName("j.k")
	public boolean field168 = true;

	@ObfuscatedName("j.l")
	public int field169;

	@ObfuscatedName("j.m")
	public int field170;

	@ObfuscatedName("j.n")
	public int field171;

	@ObfuscatedName("j.o")
	public int field172;

	@ObfuscatedName("j.p")
	public static int[] field173 = new int[6];

	@ObfuscatedName("j.q")
	public static int[] field174 = new int[6];

	@ObfuscatedName("j.r")
	public static int[] field175 = new int[6];

	@ObfuscatedName("j.s")
	public static int[] field176 = new int[6];

	@ObfuscatedName("j.t")
	public static int[] field177 = new int[6];

	@ObfuscatedName("j.u")
	public static int[] field178 = new int[] { 1, 0 };

	@ObfuscatedName("j.v")
	public static int[] field179 = new int[] { 2, 1 };

	@ObfuscatedName("j.w")
	public static int[] field180 = new int[] { 3, 3 };

	@ObfuscatedName("j.x")
	public static final int[][] field181 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("j.y")
	public static final int[][] field182 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg1 != arg3 || arg0 != arg1 || arg1 != arg13) {
			field168 = false;
		}

		field169 = arg12;
		field170 = arg11;
		field171 = arg17;
		field172 = arg2;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field181[arg12];
		int var25 = var24.length;
		field158 = new int[var25];
		field159 = new int[var25];
		field160 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg16 * var20;
		int var29 = arg6 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg11 - arg11 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg11 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg11 - 13 & 0x3) + 13;
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
				var35 = arg5;
				var36 = arg9;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg1 + arg3 >> 1;
				var35 = arg5 + arg10 >> 1;
				var36 = arg8 + arg9 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg3;
				var35 = arg10;
				var36 = arg8;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg3 >> 1;
				var35 = arg10 + arg15 >> 1;
				var36 = arg8 + arg14 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg0;
				var35 = arg15;
				var36 = arg14;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg0 + arg13 >> 1;
				var35 = arg7 + arg15 >> 1;
				var36 = arg4 + arg14 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg13;
				var35 = arg7;
				var36 = arg4;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg1 + arg13 >> 1;
				var35 = arg5 + arg7 >> 1;
				var36 = arg4 + arg9 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg1 + arg3 >> 1;
				var35 = arg5 + arg10 >> 1;
				var36 = arg8 + arg9 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg3 >> 1;
				var35 = arg10 + arg15 >> 1;
				var36 = arg8 + arg14 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg0 + arg13 >> 1;
				var35 = arg7 + arg15 >> 1;
				var36 = arg4 + arg14 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg13 >> 1;
				var35 = arg5 + arg7 >> 1;
				var36 = arg4 + arg9 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg5;
				var36 = arg9;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg3;
				var35 = arg10;
				var36 = arg8;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg0;
				var35 = arg15;
				var36 = arg14;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg13;
				var35 = arg7;
				var36 = arg4;
			}

			field158[var30] = var32;
			field159[var30] = var34;
			field160[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field182[arg12];
		int var38 = var37.length / 4;
		field164 = new int[var38];
		field165 = new int[var38];
		field166 = new int[var38];
		field161 = new int[var38];
		field162 = new int[var38];
		field163 = new int[var38];

		if (arg18 != -1) {
			field167 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg11 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg11 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg11 & 0x3;
			}

			field164[var40] = var42;
			field165[var40] = var43;
			field166[var40] = var44;

			if (var41 == 0) {
				field161[var40] = var26[var42];
				field162[var40] = var26[var43];
				field163[var40] = var26[var44];

				if (field167 != null) {
					field167[var40] = -1;
				}
			} else {
				field161[var40] = var27[var42];
				field162[var40] = var27[var43];
				field163[var40] = var27[var44];

				if (field167 != null) {
					field167[var40] = arg18;
				}
			}
		}

		int var45 = arg1;
		int var46 = arg3;

		if (arg3 < arg1) {
			var45 = arg3;
		}

		if (arg3 > arg3) {
			var46 = arg3;
		}

		if (arg0 < var45) {
			var45 = arg0;
		}

		if (arg0 > var46) {
			var46 = arg0;
		}

		if (arg13 < var45) {
			var45 = arg13;
		}

		if (arg13 > var46) {
			var46 = arg13;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
