package deob;

@ObfuscatedName("FKJJZUKP")
public final class FKJJZUKP {

	@ObfuscatedName("FKJJZUKP.l")
	public boolean field702 = true;

	@ObfuscatedName("FKJJZUKP.m")
	public int field703;

	@ObfuscatedName("FKJJZUKP.n")
	public int field704;

	@ObfuscatedName("FKJJZUKP.o")
	public int field705;

	@ObfuscatedName("FKJJZUKP.p")
	public int field706;

	@ObfuscatedName("FKJJZUKP.b")
	public int[] field692;

	@ObfuscatedName("FKJJZUKP.c")
	public int[] field693;

	@ObfuscatedName("FKJJZUKP.d")
	public int[] field694;

	@ObfuscatedName("FKJJZUKP.h")
	public int[] field698;

	@ObfuscatedName("FKJJZUKP.i")
	public int[] field699;

	@ObfuscatedName("FKJJZUKP.j")
	public int[] field700;

	@ObfuscatedName("FKJJZUKP.e")
	public int[] field695;

	@ObfuscatedName("FKJJZUKP.f")
	public int[] field696;

	@ObfuscatedName("FKJJZUKP.g")
	public int[] field697;

	@ObfuscatedName("FKJJZUKP.k")
	public int[] field701;

	@ObfuscatedName("FKJJZUKP.q")
	public static int[] field707 = new int[6];

	@ObfuscatedName("FKJJZUKP.r")
	public static int[] field708 = new int[6];

	@ObfuscatedName("FKJJZUKP.s")
	public static int[] field709 = new int[6];

	@ObfuscatedName("FKJJZUKP.t")
	public static int[] field710 = new int[6];

	@ObfuscatedName("FKJJZUKP.u")
	public static int[] field711 = new int[6];

	@ObfuscatedName("FKJJZUKP.v")
	public static int[] field712 = new int[] { 1, 0 };

	@ObfuscatedName("FKJJZUKP.w")
	public static int[] field713 = new int[] { 2, 1 };

	@ObfuscatedName("FKJJZUKP.x")
	public static int[] field714 = new int[] { 3, 3 };

	@ObfuscatedName("FKJJZUKP.y")
	public static final int[][] field715 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("FKJJZUKP.z")
	public static final int[][] field716 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public FKJJZUKP(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg1 != arg8 || arg1 != arg16 || arg1 != arg3) {
			field702 = false;
		}

		field703 = arg11;
		field704 = arg14;
		field705 = arg17;
		field706 = arg0;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field715[arg11];
		int var25 = var24.length;
		field692 = new int[var25];
		field693 = new int[var25];
		field694 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg12 * var20;
		int var29 = arg15 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg14 - arg14 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg14 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg14 - 13 & 0x3) + 13;
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
				var36 = arg4;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg1 + arg8 >> 1;
				var35 = arg5 + arg18 >> 1;
				var36 = arg4 + arg6 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg8;
				var35 = arg5;
				var36 = arg6;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg16 >> 1;
				var35 = arg2 + arg5 >> 1;
				var36 = arg6 + arg9 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg16;
				var35 = arg2;
				var36 = arg9;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg3 + arg16 >> 1;
				var35 = arg2 + arg7 >> 1;
				var36 = arg9 + arg10 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg3;
				var35 = arg7;
				var36 = arg10;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg1 + arg3 >> 1;
				var35 = arg7 + arg18 >> 1;
				var36 = arg4 + arg10 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg1 + arg8 >> 1;
				var35 = arg5 + arg18 >> 1;
				var36 = arg4 + arg6 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg16 >> 1;
				var35 = arg2 + arg5 >> 1;
				var36 = arg6 + arg9 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg3 + arg16 >> 1;
				var35 = arg2 + arg7 >> 1;
				var36 = arg9 + arg10 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg3 >> 1;
				var35 = arg7 + arg18 >> 1;
				var36 = arg4 + arg10 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg18;
				var36 = arg4;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg8;
				var35 = arg5;
				var36 = arg6;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg16;
				var35 = arg2;
				var36 = arg9;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg3;
				var35 = arg7;
				var36 = arg10;
			}

			field692[var30] = var32;
			field693[var30] = var34;
			field694[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field716[arg11];
		int var38 = var37.length / 4;
		field698 = new int[var38];
		field699 = new int[var38];
		field700 = new int[var38];
		field695 = new int[var38];
		field696 = new int[var38];
		field697 = new int[var38];

		if (arg13 != -1) {
			field701 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg14 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg14 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg14 & 0x3;
			}

			field698[var40] = var42;
			field699[var40] = var43;
			field700[var40] = var44;

			if (var41 == 0) {
				field695[var40] = var26[var42];
				field696[var40] = var26[var43];
				field697[var40] = var26[var44];

				if (field701 != null) {
					field701[var40] = -1;
				}
			} else {
				field695[var40] = var27[var42];
				field696[var40] = var27[var43];
				field697[var40] = var27[var44];

				if (field701 != null) {
					field701[var40] = arg13;
				}
			}
		}

		int var45 = arg1;
		int var46 = arg8;

		if (arg8 < arg1) {
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

		if (arg3 < var45) {
			var45 = arg3;
		}

		if (arg3 > var46) {
			var46 = arg3;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
