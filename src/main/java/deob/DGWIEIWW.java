package deob;

@ObfuscatedName("DGWIEIWW")
public final class DGWIEIWW {

	@ObfuscatedName("DGWIEIWW.l")
	public boolean field579 = true;

	@ObfuscatedName("DGWIEIWW.m")
	public int field580;

	@ObfuscatedName("DGWIEIWW.n")
	public int field581;

	@ObfuscatedName("DGWIEIWW.o")
	public int field582;

	@ObfuscatedName("DGWIEIWW.p")
	public int field583;

	@ObfuscatedName("DGWIEIWW.b")
	public int[] field569;

	@ObfuscatedName("DGWIEIWW.c")
	public int[] field570;

	@ObfuscatedName("DGWIEIWW.d")
	public int[] field571;

	@ObfuscatedName("DGWIEIWW.h")
	public int[] field575;

	@ObfuscatedName("DGWIEIWW.i")
	public int[] field576;

	@ObfuscatedName("DGWIEIWW.j")
	public int[] field577;

	@ObfuscatedName("DGWIEIWW.e")
	public int[] field572;

	@ObfuscatedName("DGWIEIWW.f")
	public int[] field573;

	@ObfuscatedName("DGWIEIWW.g")
	public int[] field574;

	@ObfuscatedName("DGWIEIWW.k")
	public int[] field578;

	@ObfuscatedName("DGWIEIWW.q")
	public static int[] field584 = new int[6];

	@ObfuscatedName("DGWIEIWW.r")
	public static int[] field585 = new int[6];

	@ObfuscatedName("DGWIEIWW.s")
	public static int[] field586 = new int[6];

	@ObfuscatedName("DGWIEIWW.t")
	public static int[] field587 = new int[6];

	@ObfuscatedName("DGWIEIWW.u")
	public static int[] field588 = new int[6];

	@ObfuscatedName("DGWIEIWW.v")
	public static int[] field589 = new int[] { 1, 0 };

	@ObfuscatedName("DGWIEIWW.w")
	public static int[] field590 = new int[] { 2, 1 };

	@ObfuscatedName("DGWIEIWW.x")
	public static int[] field591 = new int[] { 3, 3 };

	@ObfuscatedName("DGWIEIWW.y")
	public static final int[][] field592 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("DGWIEIWW.z")
	public static final int[][] field593 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public DGWIEIWW(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg11 != arg12 || arg7 != arg12 || arg12 != arg15) {
			field579 = false;
		}

		field580 = arg1;
		field581 = arg0;
		field582 = arg3;
		field583 = arg13;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field592[arg1];
		int var25 = var24.length;
		field569 = new int[var25];
		field570 = new int[var25];
		field571 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg14 * var20;
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
				var34 = arg12;
				var35 = arg18;
				var36 = arg16;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg11 + arg12 >> 1;
				var35 = arg8 + arg18 >> 1;
				var36 = arg16 + arg17 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg11;
				var35 = arg8;
				var36 = arg17;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg11 >> 1;
				var35 = arg4 + arg8 >> 1;
				var36 = arg5 + arg17 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg7;
				var35 = arg4;
				var36 = arg5;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg7 + arg15 >> 1;
				var35 = arg4 + arg9 >> 1;
				var36 = arg5 + arg10 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg15;
				var35 = arg9;
				var36 = arg10;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg12 + arg15 >> 1;
				var35 = arg9 + arg18 >> 1;
				var36 = arg10 + arg16 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg11 + arg12 >> 1;
				var35 = arg8 + arg18 >> 1;
				var36 = arg16 + arg17 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg11 >> 1;
				var35 = arg4 + arg8 >> 1;
				var36 = arg5 + arg17 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg7 + arg15 >> 1;
				var35 = arg4 + arg9 >> 1;
				var36 = arg5 + arg10 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg12 + arg15 >> 1;
				var35 = arg9 + arg18 >> 1;
				var36 = arg10 + arg16 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg12;
				var35 = arg18;
				var36 = arg16;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg11;
				var35 = arg8;
				var36 = arg17;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg7;
				var35 = arg4;
				var36 = arg5;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg15;
				var35 = arg9;
				var36 = arg10;
			}

			field569[var30] = var32;
			field570[var30] = var34;
			field571[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field593[arg1];
		int var38 = var37.length / 4;
		field575 = new int[var38];
		field576 = new int[var38];
		field577 = new int[var38];
		field572 = new int[var38];
		field573 = new int[var38];
		field574 = new int[var38];

		if (arg6 != -1) {
			field578 = new int[var38];
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

			field575[var40] = var42;
			field576[var40] = var43;
			field577[var40] = var44;

			if (var41 == 0) {
				field572[var40] = var26[var42];
				field573[var40] = var26[var43];
				field574[var40] = var26[var44];

				if (field578 != null) {
					field578[var40] = -1;
				}
			} else {
				field572[var40] = var27[var42];
				field573[var40] = var27[var43];
				field574[var40] = var27[var44];

				if (field578 != null) {
					field578[var40] = arg6;
				}
			}
		}

		int var45 = arg12;
		int var46 = arg11;

		if (arg11 < arg12) {
			var45 = arg11;
		}

		if (arg11 > arg11) {
			var46 = arg11;
		}

		if (arg7 < var45) {
			var45 = arg7;
		}

		if (arg7 > var46) {
			var46 = arg7;
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
