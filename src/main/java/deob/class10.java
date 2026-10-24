package deob;

@ObfuscatedName("j")
public final class class10 {

	@ObfuscatedName("j.a")
	public int[] field156;

	@ObfuscatedName("j.b")
	public int[] field157;

	@ObfuscatedName("j.c")
	public int[] field158;

	@ObfuscatedName("j.d")
	public int[] field159;

	@ObfuscatedName("j.e")
	public int[] field160;

	@ObfuscatedName("j.f")
	public int[] field161;

	@ObfuscatedName("j.g")
	public int[] field162;

	@ObfuscatedName("j.h")
	public int[] field163;

	@ObfuscatedName("j.i")
	public int[] field164;

	@ObfuscatedName("j.j")
	public int[] field165;

	@ObfuscatedName("j.k")
	public boolean field166 = true;

	@ObfuscatedName("j.l")
	public int field167;

	@ObfuscatedName("j.m")
	public int field168;

	@ObfuscatedName("j.n")
	public int field169;

	@ObfuscatedName("j.o")
	public int field170;

	@ObfuscatedName("j.p")
	public static int[] field171 = new int[6];

	@ObfuscatedName("j.q")
	public static int[] field172 = new int[6];

	@ObfuscatedName("j.r")
	public static int[] field173 = new int[6];

	@ObfuscatedName("j.s")
	public static int[] field174 = new int[6];

	@ObfuscatedName("j.t")
	public static int[] field175 = new int[6];

	@ObfuscatedName("j.u")
	public static int[] field176 = new int[] { 1, 0 };

	@ObfuscatedName("j.v")
	public static int[] field177 = new int[] { 2, 1 };

	@ObfuscatedName("j.w")
	public static int[] field178 = new int[] { 3, 3 };

	@ObfuscatedName("j.x")
	public static final int[][] field179 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("j.y")
	public static final int[][] field180 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public class10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg9 != arg16 || arg4 != arg16 || arg6 != arg16) {
			field166 = false;
		}

		field167 = arg17;
		field168 = arg0;
		field169 = arg5;
		field170 = arg15;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field179[arg17];
		int var25 = var24.length;
		field156 = new int[var25];
		field157 = new int[var25];
		field158 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg8 * var20;
		int var29 = arg2 * var20;
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
				var34 = arg16;
				var35 = arg12;
				var36 = arg1;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg9 + arg16 >> 1;
				var35 = arg10 + arg12 >> 1;
				var36 = arg1 + arg14 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg9;
				var35 = arg10;
				var36 = arg14;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg9 >> 1;
				var35 = arg10 + arg11 >> 1;
				var36 = arg14 + arg18 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg4;
				var35 = arg11;
				var36 = arg18;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg4 + arg6 >> 1;
				var35 = arg3 + arg11 >> 1;
				var36 = arg7 + arg18 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg6;
				var35 = arg3;
				var36 = arg7;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg6 + arg16 >> 1;
				var35 = arg3 + arg12 >> 1;
				var36 = arg1 + arg7 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg9 + arg16 >> 1;
				var35 = arg10 + arg12 >> 1;
				var36 = arg1 + arg14 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg9 >> 1;
				var35 = arg10 + arg11 >> 1;
				var36 = arg14 + arg18 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg4 + arg6 >> 1;
				var35 = arg3 + arg11 >> 1;
				var36 = arg7 + arg18 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg16 >> 1;
				var35 = arg3 + arg12 >> 1;
				var36 = arg1 + arg7 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg16;
				var35 = arg12;
				var36 = arg1;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg9;
				var35 = arg10;
				var36 = arg14;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg4;
				var35 = arg11;
				var36 = arg18;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg6;
				var35 = arg3;
				var36 = arg7;
			}

			field156[var30] = var32;
			field157[var30] = var34;
			field158[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field180[arg17];
		int var38 = var37.length / 4;
		field162 = new int[var38];
		field163 = new int[var38];
		field164 = new int[var38];
		field159 = new int[var38];
		field160 = new int[var38];
		field161 = new int[var38];

		if (arg13 != -1) {
			field165 = new int[var38];
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

			field162[var40] = var42;
			field163[var40] = var43;
			field164[var40] = var44;

			if (var41 == 0) {
				field159[var40] = var26[var42];
				field160[var40] = var26[var43];
				field161[var40] = var26[var44];

				if (field165 != null) {
					field165[var40] = -1;
				}
			} else {
				field159[var40] = var27[var42];
				field160[var40] = var27[var43];
				field161[var40] = var27[var44];

				if (field165 != null) {
					field165[var40] = arg13;
				}
			}
		}

		int var45 = arg16;
		int var46 = arg9;

		if (arg9 < arg16) {
			var45 = arg9;
		}

		if (arg9 > arg9) {
			var46 = arg9;
		}

		if (arg4 < var45) {
			var45 = arg4;
		}

		if (arg4 > var46) {
			var46 = arg4;
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
