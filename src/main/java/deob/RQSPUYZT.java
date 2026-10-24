package deob;

@ObfuscatedName("RQSPUYZT")
public final class RQSPUYZT {

	@ObfuscatedName("RQSPUYZT.k")
	public boolean field1184 = true;

	@ObfuscatedName("RQSPUYZT.l")
	public int field1185;

	@ObfuscatedName("RQSPUYZT.m")
	public int field1186;

	@ObfuscatedName("RQSPUYZT.n")
	public int field1187;

	@ObfuscatedName("RQSPUYZT.o")
	public int field1188;

	@ObfuscatedName("RQSPUYZT.a")
	public int[] field1174;

	@ObfuscatedName("RQSPUYZT.b")
	public int[] field1175;

	@ObfuscatedName("RQSPUYZT.c")
	public int[] field1176;

	@ObfuscatedName("RQSPUYZT.g")
	public int[] field1180;

	@ObfuscatedName("RQSPUYZT.h")
	public int[] field1181;

	@ObfuscatedName("RQSPUYZT.i")
	public int[] field1182;

	@ObfuscatedName("RQSPUYZT.d")
	public int[] field1177;

	@ObfuscatedName("RQSPUYZT.e")
	public int[] field1178;

	@ObfuscatedName("RQSPUYZT.f")
	public int[] field1179;

	@ObfuscatedName("RQSPUYZT.j")
	public int[] field1183;

	@ObfuscatedName("RQSPUYZT.p")
	public static int[] field1189 = new int[6];

	@ObfuscatedName("RQSPUYZT.q")
	public static int[] field1190 = new int[6];

	@ObfuscatedName("RQSPUYZT.r")
	public static int[] field1191 = new int[6];

	@ObfuscatedName("RQSPUYZT.s")
	public static int[] field1192 = new int[6];

	@ObfuscatedName("RQSPUYZT.t")
	public static int[] field1193 = new int[6];

	@ObfuscatedName("RQSPUYZT.u")
	public static int[] field1194 = new int[] { 1, 0 };

	@ObfuscatedName("RQSPUYZT.v")
	public static int[] field1195 = new int[] { 2, 1 };

	@ObfuscatedName("RQSPUYZT.w")
	public static int[] field1196 = new int[] { 3, 3 };

	@ObfuscatedName("RQSPUYZT.x")
	public static final int[][] field1197 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("RQSPUYZT.y")
	public static final int[][] field1198 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public RQSPUYZT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg15 != arg16 || arg11 != arg15 || arg13 != arg15) {
			field1184 = false;
		}

		field1185 = arg2;
		field1186 = arg14;
		field1187 = arg6;
		field1188 = arg9;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1197[arg2];
		int var25 = var24.length;
		field1174 = new int[var25];
		field1175 = new int[var25];
		field1176 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg8 * var20;
		int var29 = arg3 * var20;
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
				var34 = arg15;
				var35 = arg18;
				var36 = arg17;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg15 + arg16 >> 1;
				var35 = arg10 + arg18 >> 1;
				var36 = arg0 + arg17 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg16;
				var35 = arg10;
				var36 = arg0;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg11 + arg16 >> 1;
				var35 = arg4 + arg10 >> 1;
				var36 = arg0 + arg5 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg11;
				var35 = arg4;
				var36 = arg5;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg11 + arg13 >> 1;
				var35 = arg1 + arg4 >> 1;
				var36 = arg5 + arg12 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg13;
				var35 = arg1;
				var36 = arg12;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg13 + arg15 >> 1;
				var35 = arg1 + arg18 >> 1;
				var36 = arg12 + arg17 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg15 + arg16 >> 1;
				var35 = arg10 + arg18 >> 1;
				var36 = arg0 + arg17 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg11 + arg16 >> 1;
				var35 = arg4 + arg10 >> 1;
				var36 = arg0 + arg5 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg11 + arg13 >> 1;
				var35 = arg1 + arg4 >> 1;
				var36 = arg5 + arg12 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg13 + arg15 >> 1;
				var35 = arg1 + arg18 >> 1;
				var36 = arg12 + arg17 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg15;
				var35 = arg18;
				var36 = arg17;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg16;
				var35 = arg10;
				var36 = arg0;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg11;
				var35 = arg4;
				var36 = arg5;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg13;
				var35 = arg1;
				var36 = arg12;
			}

			field1174[var30] = var32;
			field1175[var30] = var34;
			field1176[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1198[arg2];
		int var38 = var37.length / 4;
		field1180 = new int[var38];
		field1181 = new int[var38];
		field1182 = new int[var38];
		field1177 = new int[var38];
		field1178 = new int[var38];
		field1179 = new int[var38];

		if (arg7 != -1) {
			field1183 = new int[var38];
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

			field1180[var40] = var42;
			field1181[var40] = var43;
			field1182[var40] = var44;

			if (var41 == 0) {
				field1177[var40] = var26[var42];
				field1178[var40] = var26[var43];
				field1179[var40] = var26[var44];

				if (field1183 != null) {
					field1183[var40] = -1;
				}
			} else {
				field1177[var40] = var27[var42];
				field1178[var40] = var27[var43];
				field1179[var40] = var27[var44];

				if (field1183 != null) {
					field1183[var40] = arg7;
				}
			}
		}

		int var45 = arg15;
		int var46 = arg16;

		if (arg16 < arg15) {
			var45 = arg16;
		}

		if (arg16 > arg16) {
			var46 = arg16;
		}

		if (arg11 < var45) {
			var45 = arg11;
		}

		if (arg11 > var46) {
			var46 = arg11;
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
