package deob;

@ObfuscatedName("VWODEXFW")
public final class VWODEXFW {

	@ObfuscatedName("VWODEXFW.k")
	public boolean field1276 = true;

	@ObfuscatedName("VWODEXFW.l")
	public int field1277;

	@ObfuscatedName("VWODEXFW.m")
	public int field1278;

	@ObfuscatedName("VWODEXFW.n")
	public int field1279;

	@ObfuscatedName("VWODEXFW.o")
	public int field1280;

	@ObfuscatedName("VWODEXFW.a")
	public int[] field1266;

	@ObfuscatedName("VWODEXFW.b")
	public int[] field1267;

	@ObfuscatedName("VWODEXFW.c")
	public int[] field1268;

	@ObfuscatedName("VWODEXFW.g")
	public int[] field1272;

	@ObfuscatedName("VWODEXFW.h")
	public int[] field1273;

	@ObfuscatedName("VWODEXFW.i")
	public int[] field1274;

	@ObfuscatedName("VWODEXFW.d")
	public int[] field1269;

	@ObfuscatedName("VWODEXFW.e")
	public int[] field1270;

	@ObfuscatedName("VWODEXFW.f")
	public int[] field1271;

	@ObfuscatedName("VWODEXFW.j")
	public int[] field1275;

	@ObfuscatedName("VWODEXFW.p")
	public static int[] field1281 = new int[6];

	@ObfuscatedName("VWODEXFW.q")
	public static int[] field1282 = new int[6];

	@ObfuscatedName("VWODEXFW.r")
	public static int[] field1283 = new int[6];

	@ObfuscatedName("VWODEXFW.s")
	public static int[] field1284 = new int[6];

	@ObfuscatedName("VWODEXFW.t")
	public static int[] field1285 = new int[6];

	@ObfuscatedName("VWODEXFW.u")
	public static int[] field1286 = new int[] { 1, 0 };

	@ObfuscatedName("VWODEXFW.v")
	public static int[] field1287 = new int[] { 2, 1 };

	@ObfuscatedName("VWODEXFW.w")
	public static int[] field1288 = new int[] { 3, 3 };

	@ObfuscatedName("VWODEXFW.x")
	public static final int[][] field1289 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("VWODEXFW.y")
	public static final int[][] field1290 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public VWODEXFW(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg17 != arg18 || arg12 != arg17 || arg11 != arg17) {
			field1276 = false;
		}

		field1277 = arg1;
		field1278 = arg6;
		field1279 = arg7;
		field1280 = arg10;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1289[arg1];
		int var25 = var24.length;
		field1266 = new int[var25];
		field1267 = new int[var25];
		field1268 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg16 * var20;
		int var29 = arg9 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg6 - arg6 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg6 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg6 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg17;
				var35 = arg2;
				var36 = arg4;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg17 + arg18 >> 1;
				var35 = arg2 + arg15 >> 1;
				var36 = arg3 + arg4 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg18;
				var35 = arg15;
				var36 = arg3;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg12 + arg18 >> 1;
				var35 = arg14 + arg15 >> 1;
				var36 = arg0 + arg3 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg12;
				var35 = arg14;
				var36 = arg0;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg11 + arg12 >> 1;
				var35 = arg8 + arg14 >> 1;
				var36 = arg0 + arg5 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg11;
				var35 = arg8;
				var36 = arg5;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg11 + arg17 >> 1;
				var35 = arg2 + arg8 >> 1;
				var36 = arg4 + arg5 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg17 + arg18 >> 1;
				var35 = arg2 + arg15 >> 1;
				var36 = arg3 + arg4 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg12 + arg18 >> 1;
				var35 = arg14 + arg15 >> 1;
				var36 = arg0 + arg3 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg11 + arg12 >> 1;
				var35 = arg8 + arg14 >> 1;
				var36 = arg0 + arg5 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg11 + arg17 >> 1;
				var35 = arg2 + arg8 >> 1;
				var36 = arg4 + arg5 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg17;
				var35 = arg2;
				var36 = arg4;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg18;
				var35 = arg15;
				var36 = arg3;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg12;
				var35 = arg14;
				var36 = arg0;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg11;
				var35 = arg8;
				var36 = arg5;
			}

			field1266[var30] = var32;
			field1267[var30] = var34;
			field1268[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1290[arg1];
		int var38 = var37.length / 4;
		field1272 = new int[var38];
		field1273 = new int[var38];
		field1274 = new int[var38];
		field1269 = new int[var38];
		field1270 = new int[var38];
		field1271 = new int[var38];

		if (arg13 != -1) {
			field1275 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg6 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg6 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg6 & 0x3;
			}

			field1272[var40] = var42;
			field1273[var40] = var43;
			field1274[var40] = var44;

			if (var41 == 0) {
				field1269[var40] = var26[var42];
				field1270[var40] = var26[var43];
				field1271[var40] = var26[var44];

				if (field1275 != null) {
					field1275[var40] = -1;
				}
			} else {
				field1269[var40] = var27[var42];
				field1270[var40] = var27[var43];
				field1271[var40] = var27[var44];

				if (field1275 != null) {
					field1275[var40] = arg13;
				}
			}
		}

		int var45 = arg17;
		int var46 = arg18;

		if (arg18 < arg17) {
			var45 = arg18;
		}

		if (arg18 > arg18) {
			var46 = arg18;
		}

		if (arg12 < var45) {
			var45 = arg12;
		}

		if (arg12 > var46) {
			var46 = arg12;
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
