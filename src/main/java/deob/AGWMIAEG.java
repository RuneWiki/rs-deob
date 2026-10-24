package deob;

@ObfuscatedName("AGWMIAEG")
public final class AGWMIAEG {

	@ObfuscatedName("AGWMIAEG.k")
	public boolean field36 = true;

	@ObfuscatedName("AGWMIAEG.l")
	public int field37;

	@ObfuscatedName("AGWMIAEG.m")
	public int field38;

	@ObfuscatedName("AGWMIAEG.n")
	public int field39;

	@ObfuscatedName("AGWMIAEG.o")
	public int field40;

	@ObfuscatedName("AGWMIAEG.a")
	public int[] field26;

	@ObfuscatedName("AGWMIAEG.b")
	public int[] field27;

	@ObfuscatedName("AGWMIAEG.c")
	public int[] field28;

	@ObfuscatedName("AGWMIAEG.g")
	public int[] field32;

	@ObfuscatedName("AGWMIAEG.h")
	public int[] field33;

	@ObfuscatedName("AGWMIAEG.i")
	public int[] field34;

	@ObfuscatedName("AGWMIAEG.d")
	public int[] field29;

	@ObfuscatedName("AGWMIAEG.e")
	public int[] field30;

	@ObfuscatedName("AGWMIAEG.f")
	public int[] field31;

	@ObfuscatedName("AGWMIAEG.j")
	public int[] field35;

	@ObfuscatedName("AGWMIAEG.p")
	public static int[] field41 = new int[6];

	@ObfuscatedName("AGWMIAEG.q")
	public static int[] field42 = new int[6];

	@ObfuscatedName("AGWMIAEG.r")
	public static int[] field43 = new int[6];

	@ObfuscatedName("AGWMIAEG.s")
	public static int[] field44 = new int[6];

	@ObfuscatedName("AGWMIAEG.t")
	public static int[] field45 = new int[6];

	@ObfuscatedName("AGWMIAEG.u")
	public static int[] field46 = new int[] { 1, 0 };

	@ObfuscatedName("AGWMIAEG.v")
	public static int[] field47 = new int[] { 2, 1 };

	@ObfuscatedName("AGWMIAEG.w")
	public static int[] field48 = new int[] { 3, 3 };

	@ObfuscatedName("AGWMIAEG.x")
	public static final int[][] field49 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("AGWMIAEG.y")
	public static final int[][] field50 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public AGWMIAEG(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg9 != arg14 || arg8 != arg9 || arg6 != arg9) {
			field36 = false;
		}

		field37 = arg10;
		field38 = arg2;
		field39 = arg15;
		field40 = arg13;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field49[arg10];
		int var25 = var24.length;
		field26 = new int[var25];
		field27 = new int[var25];
		field28 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg16 * var20;
		int var29 = arg5 * var20;
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
				var34 = arg9;
				var35 = arg0;
				var36 = arg4;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg9 + arg14 >> 1;
				var35 = arg0 + arg18 >> 1;
				var36 = arg4 + arg17 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg14;
				var35 = arg18;
				var36 = arg17;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg14 >> 1;
				var35 = arg1 + arg18 >> 1;
				var36 = arg3 + arg17 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg1;
				var36 = arg3;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg6 + arg8 >> 1;
				var35 = arg1 + arg11 >> 1;
				var36 = arg3 + arg12 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg6;
				var35 = arg11;
				var36 = arg12;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg6 + arg9 >> 1;
				var35 = arg0 + arg11 >> 1;
				var36 = arg4 + arg12 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg9 + arg14 >> 1;
				var35 = arg0 + arg18 >> 1;
				var36 = arg4 + arg17 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg14 >> 1;
				var35 = arg1 + arg18 >> 1;
				var36 = arg3 + arg17 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg6 + arg8 >> 1;
				var35 = arg1 + arg11 >> 1;
				var36 = arg3 + arg12 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg9 >> 1;
				var35 = arg0 + arg11 >> 1;
				var36 = arg4 + arg12 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg9;
				var35 = arg0;
				var36 = arg4;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg14;
				var35 = arg18;
				var36 = arg17;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg1;
				var36 = arg3;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg6;
				var35 = arg11;
				var36 = arg12;
			}

			field26[var30] = var32;
			field27[var30] = var34;
			field28[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field50[arg10];
		int var38 = var37.length / 4;
		field32 = new int[var38];
		field33 = new int[var38];
		field34 = new int[var38];
		field29 = new int[var38];
		field30 = new int[var38];
		field31 = new int[var38];

		if (arg7 != -1) {
			field35 = new int[var38];
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

			field32[var40] = var42;
			field33[var40] = var43;
			field34[var40] = var44;

			if (var41 == 0) {
				field29[var40] = var26[var42];
				field30[var40] = var26[var43];
				field31[var40] = var26[var44];

				if (field35 != null) {
					field35[var40] = -1;
				}
			} else {
				field29[var40] = var27[var42];
				field30[var40] = var27[var43];
				field31[var40] = var27[var44];

				if (field35 != null) {
					field35[var40] = arg7;
				}
			}
		}

		int var45 = arg9;
		int var46 = arg14;

		if (arg14 < arg9) {
			var45 = arg14;
		}

		if (arg14 > arg14) {
			var46 = arg14;
		}

		if (arg8 < var45) {
			var45 = arg8;
		}

		if (arg8 > var46) {
			var46 = arg8;
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
