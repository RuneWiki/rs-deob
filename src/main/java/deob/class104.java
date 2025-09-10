package deob;

@ObfuscatedName("do")
public class class104 extends class105 {

	@ObfuscatedName("do.af")
	public int field1408;

	@ObfuscatedName("do.aw")
	public int field1392;

	@ObfuscatedName("do.at")
	public int field1391;

	@ObfuscatedName("do.ac")
	public int field1399;

	@ObfuscatedName("do.ap")
	public int field1395;

	@ObfuscatedName("do.aq")
	public int field1396;

	@ObfuscatedName("do.ao")
	public int field1397;

	@ObfuscatedName("do.as")
	public int field1398;

	@ObfuscatedName("do.al")
	public int field1401;

	@ObfuscatedName("do.au")
	public int field1400;

	@ObfuscatedName("do.ai")
	public boolean field1409;

	@ObfuscatedName("do.aa")
	public int field1407;

	@ObfuscatedName("do.am")
	public int field1402;

	@ObfuscatedName("do.an")
	public int field1403;

	@ObfuscatedName("do.ar")
	public int field1405;

	@ObfuscatedName("do.ae")
	public class338 field1406 = class338.field3854;

	@ObfuscatedName("do.ay")
	public long field1394 = 0L;

	@ObfuscatedName("do.ad")
	public int field1393 = 0;

	@ObfuscatedName("do.ag")
	public int field1404 = 0;

	@ObfuscatedName("do.av")
	public int field1410 = 0;

	public class104(class96 arg0, int arg1, int arg2) {
		this.field1413 = arg0;
		this.field1401 = arg0.field1324;
		this.field1400 = arg0.field1327;
		this.field1409 = arg0.field1322;
		this.field1392 = arg1;
		this.field1391 = arg2;
		this.field1399 = 8192;
		this.field1408 = 0;
		this.method3086();
	}

	public class104(class96 arg0, int arg1, int arg2, int arg3) {
		this.field1413 = arg0;
		this.field1401 = arg0.field1324;
		this.field1400 = arg0.field1327;
		this.field1409 = arg0.field1322;
		this.field1392 = arg1;
		this.field1391 = arg2;
		this.field1399 = arg3;
		this.field1408 = 0;
		this.method3086();
	}

	@ObfuscatedName("do.af(II)I")
	public static int method3065(int arg0, int arg1) {
		return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("do.aw(II)I")
	public static int method3083(int arg0, int arg1) {
		return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("do.at(Ldv;II)Ldo;")
	public static class104 method3067(class96 arg0, int arg1, int arg2) {
		return arg0.field1323 == null || arg0.field1323.length == 0 ? null : new class104(arg0, (int) ((long) arg0.field1326 * 256L * (long) arg1 / (long) (class98.field1357 * 100)), arg2 << 6);
	}

	@ObfuscatedName("do.ac(Ldv;III)Ldo;")
	public static class104 method3068(class96 arg0, int arg1, int arg2, int arg3) {
		return arg0.field1323 == null || arg0.field1323.length == 0 ? null : new class104(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("do.ap([S[IIIIIIILdo;)I")
	public static int method3210(short[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12;
		if ((var12 = arg3 + var10 - var9) > arg6) {
			var12 = arg6;
		}
		var12 -= 3;
		int var10001;
		while (arg3 < var12) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var9++] * var11;
			int var13 = arg3++;
			arg1[var13] += arg0[var9++] * var11;
			int var14 = arg3++;
			arg1[var14] += arg0[var9++] * var11;
			int var15 = arg3++;
			arg1[var15] += arg0[var9++] * var11;
		}
		var12 += 3;
		while (arg3 < var12) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var9++] * var11;
		}
		arg8.field1408 = var9 << 8;
		return arg3;
	}

	@ObfuscatedName("do.au(I[S[IIIIIIIILdo;Z)I")
	public static int method3070(int arg0, short[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, boolean arg11) {
		int var12 = arg3 >> 8;
		int var13 = arg9 >> 8;
		int var14;
		if ((var14 = arg4 + var13 - var12) > arg8) {
			var14 = arg8;
		}
		int var15 = arg4 << 1;
		int var16 = var14 << 1;
		int var27 = var16 - 6;
		int var10001;
		if (arg11) {
			while (var15 < var27) {
				short var17 = arg1[var12++];
				var10001 = var15++;
				arg2[var10001] += arg5 * var17 << 2;
				var10001 = var15++;
				arg2[var10001] += arg6 * var17 << 2;
				short var18 = arg1[var12++];
				var10001 = var15++;
				arg2[var10001] += arg5 * var18 << 2;
				var10001 = var15++;
				arg2[var10001] += arg6 * var18 << 2;
				short var19 = arg1[var12++];
				var10001 = var15++;
				arg2[var10001] += arg5 * var19 << 2;
				var10001 = var15++;
				arg2[var10001] += arg6 * var19 << 2;
				short var20 = arg1[var12++];
				var10001 = var15++;
				arg2[var10001] += arg5 * var20 << 2;
				var10001 = var15++;
				arg2[var10001] += arg6 * var20 << 2;
			}
			var16 = var27 + 6;
			while (var15 < var16) {
				short var21 = arg1[var12++];
				var10001 = var15++;
				arg2[var10001] += arg5 * var21 << 2;
				var10001 = var15++;
				arg2[var10001] += arg6 * var21 << 2;
			}
		} else {
			while (var15 < var27) {
				short var22 = arg1[var12++];
				int var28 = var15++;
				arg2[var28] += arg5 * var22 >> 6;
				int var29 = var15++;
				arg2[var29] += arg6 * var22 >> 6;
				short var23 = arg1[var12++];
				int var31 = var15++;
				arg2[var31] += arg5 * var23 >> 6;
				int var32 = var15++;
				arg2[var32] += arg6 * var23 >> 6;
				short var24 = arg1[var12++];
				int var34 = var15++;
				arg2[var34] += arg5 * var24 >> 6;
				int var35 = var15++;
				arg2[var35] += arg6 * var24 >> 6;
				short var25 = arg1[var12++];
				int var37 = var15++;
				arg2[var37] += arg5 * var25 >> 6;
				int var38 = var15++;
				arg2[var38] += arg6 * var25 >> 6;
			}
			var16 = var27 + 6;
			while (var15 < var16) {
				short var26 = arg1[var12++];
				var10001 = var15++;
				arg2[var10001] += arg5 * var26 >> 6;
				int var39 = var15++;
				arg2[var39] += arg6 * var26 >> 6;
			}
		}
		arg10.field1408 = var12 << 8;
		return var15 >> 1;
	}

	@ObfuscatedName("do.aa([S[IIIIIIILdo;)I")
	public static int method3093(short[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class104 arg8) {
		int var9 = arg2 >> 8;
		int var10 = arg7 >> 8;
		int var11 = arg4 << 2;
		int var12;
		if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
			var12 = arg6;
		}
		var12 -= 3;
		int var10001;
		while (arg3 < var12) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var9--] * var11;
			int var13 = arg3++;
			arg1[var13] += arg0[var9--] * var11;
			int var14 = arg3++;
			arg1[var14] += arg0[var9--] * var11;
			int var15 = arg3++;
			arg1[var15] += arg0[var9--] * var11;
		}
		var12 += 3;
		while (arg3 < var12) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var9--] * var11;
		}
		arg8.field1408 = var9 << 8;
		return arg3;
	}

	@ObfuscatedName("do.am(I[S[IIIIIIIILdo;)I")
	public static int method3071(int arg0, short[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10) {
		int var11 = arg3 >> 8;
		int var12 = arg9 >> 8;
		int var13;
		if ((var13 = arg4 + var11 - (var12 - 1)) > arg8) {
			var13 = arg8;
		}
		int var14 = arg4 << 1;
		int var15 = var13 << 1;
		int var21 = var15 - 6;
		while (var14 < var21) {
			short var16 = arg1[var11--];
			int var22 = var14++;
			arg2[var22] += arg5 * var16 >> 6;
			int var23 = var14++;
			arg2[var23] += arg6 * var16 >> 6;
			short var17 = arg1[var11--];
			int var25 = var14++;
			arg2[var25] += arg5 * var17 >> 6;
			int var26 = var14++;
			arg2[var26] += arg6 * var17 >> 6;
			short var18 = arg1[var11--];
			int var28 = var14++;
			arg2[var28] += arg5 * var18 >> 6;
			int var29 = var14++;
			arg2[var29] += arg6 * var18 >> 6;
			short var19 = arg1[var11--];
			int var31 = var14++;
			arg2[var31] += arg5 * var19 >> 6;
			int var32 = var14++;
			arg2[var32] += arg6 * var19 >> 6;
		}
		var15 = var21 + 6;
		while (var14 < var15) {
			short var20 = arg1[var11--];
			int var10001 = var14++;
			arg2[var10001] += arg5 * var20 >> 6;
			int var33 = var14++;
			arg2[var33] += arg6 * var20 >> 6;
		}
		arg10.field1408 = var11 << 8;
		return var14 >> 1;
	}

	@ObfuscatedName("do.an(II[S[IIIIIIILdo;II)I")
	public static int method3073(int arg0, int arg1, short[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, int arg11, int arg12) {
		int var13;
		if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
			var13 = arg8;
		}
		int var10001;
		while (arg5 < var13) {
			int var14 = arg4 >> 8;
			short var15 = arg2[var14];
			var10001 = arg5++;
			arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
			arg4 += arg11;
		}
		int var16;
		if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
			var16 = arg8;
		}
		int var17 = arg12;
		while (arg5 < var16) {
			short var18 = arg2[arg4 >> 8];
			var10001 = arg5++;
			arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
			arg4 += arg11;
		}
		arg10.field1408 = arg4;
		return arg5;
	}

	@ObfuscatedName("do.ar(II[S[IIIIIIIILdo;II)I")
	public static int method3183(int arg0, int arg1, short[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
		int var14;
		if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
			var14 = arg9;
		}
		int var15 = arg5 << 1;
		int var16 = var14 << 1;
		int var10001;
		while (var15 < var16) {
			int var17 = arg4 >> 8;
			short var18 = arg2[var17];
			int var19 = ((arg4 & 0xFF) * (arg2[var17 + 1] - var18) >> 8) + var18;
			var10001 = var15++;
			arg3[var10001] += arg6 * var19 >> 6;
			int var25 = var15++;
			arg3[var25] += arg7 * var19 >> 6;
			arg4 += arg12;
		}
		int var20;
		if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
			var20 = arg9;
		}
		int var21 = var20 << 1;
		int var22 = arg13;
		while (var15 < var21) {
			short var23 = arg2[arg4 >> 8];
			int var24 = ((arg4 & 0xFF) * (var22 - var23) >> 8) + var23;
			var10001 = var15++;
			arg3[var10001] += arg6 * var24 >> 6;
			var10001 = var15++;
			arg3[var10001] += arg7 * var24 >> 6;
			arg4 += arg12;
		}
		arg11.field1408 = arg4;
		return var15 >> 1;
	}

	@ObfuscatedName("do.ae(II[S[IIIIIIILdo;II)I")
	public static int method3075(int arg0, int arg1, short[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class104 arg10, int arg11, int arg12) {
		int var13;
		if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
			var13 = arg8;
		}
		int var10001;
		while (arg5 < var13) {
			int var14 = arg4 >> 8;
			short var15 = arg2[var14 - 1];
			var10001 = arg5++;
			arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
			arg4 += arg11;
		}
		int var16;
		if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
			var16 = arg8;
		}
		int var17 = arg12;
		int var18 = arg11;
		while (arg5 < var16) {
			var10001 = arg5++;
			arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
			arg4 += var18;
		}
		arg10.field1408 = arg4;
		return arg5;
	}

	@ObfuscatedName("do.ay(II[S[IIIIIIIILdo;II)I")
	public static int method3076(int arg0, int arg1, short[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
		int var14;
		if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
			var14 = arg9;
		}
		int var15 = arg5 << 1;
		int var16 = var14 << 1;
		int var10001;
		while (var15 < var16) {
			int var17 = arg4 >> 8;
			short var18 = arg2[var17 - 1];
			int var19 = ((arg4 & 0xFF) * (arg2[var17] - var18) >> 8) + var18;
			var10001 = var15++;
			arg3[var10001] += arg6 * var19 >> 6;
			int var24 = var15++;
			arg3[var24] += arg7 * var19 >> 6;
			arg4 += arg12;
		}
		int var20;
		if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
			var20 = arg9;
		}
		int var21 = var20 << 1;
		int var22 = arg13;
		while (var15 < var21) {
			int var23 = ((arg4 & 0xFF) * (arg2[arg4 >> 8] - var22) >> 8) + var22;
			var10001 = var15++;
			arg3[var10001] += arg6 * var23 >> 6;
			var10001 = var15++;
			arg3[var10001] += arg7 * var23 >> 6;
			arg4 += arg12;
		}
		arg11.field1408 = arg4;
		return var15 >> 1;
	}

	@ObfuscatedName("do.ad([S[IIIIIIIILdo;)I")
	public static int method3113(short[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class104 arg9) {
		int var10 = arg2 >> 8;
		int var11 = arg8 >> 8;
		int var12 = arg4 << 2;
		int var13 = arg5 << 2;
		int var14;
		if ((var14 = arg3 + var11 - var10) > arg7) {
			var14 = arg7;
		}
		arg9.field1396 += (var14 - arg3) * arg9.field1403;
		arg9.field1397 += (var14 - arg3) * arg9.field1405;
		var14 -= 3;
		int var10001;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var10++] * var12;
			int var15 = var12 + var13;
			int var18 = arg3++;
			arg1[var18] += arg0[var10++] * var15;
			int var16 = var13 + var15;
			int var19 = arg3++;
			arg1[var19] += arg0[var10++] * var16;
			int var17 = var13 + var16;
			int var20 = arg3++;
			arg1[var20] += arg0[var10++] * var17;
			var12 = var13 + var17;
		}
		var14 += 3;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var10++] * var12;
			var12 += var13;
		}
		arg9.field1395 = var12 >> 2;
		arg9.field1408 = var10 << 8;
		return arg3;
	}

	@ObfuscatedName("do.ag(I[S[IIIIIIIIIILdo;)I")
	public static int method3164(int arg0, short[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class104 arg12) {
		int var13 = arg3 >> 8;
		int var14 = arg11 >> 8;
		int var15;
		if ((var15 = arg4 + var14 - var13) > arg10) {
			var15 = arg10;
		}
		arg12.field1395 += (var15 - arg4) * arg12.field1402;
		int var16 = arg4 << 1;
		int var17 = var15 << 1;
		int var29 = var17 - 6;
		while (var16 < var29) {
			short var18 = arg1[var13++];
			int var30 = var16++;
			arg2[var30] += arg5 * var18 >> 6;
			int var19 = arg5 + arg7;
			int var31 = var16++;
			arg2[var31] += arg6 * var18 >> 6;
			int var20 = arg6 + arg8;
			short var21 = arg1[var13++];
			int var33 = var16++;
			arg2[var33] += var19 * var21 >> 6;
			int var22 = arg7 + var19;
			int var34 = var16++;
			arg2[var34] += var20 * var21 >> 6;
			int var23 = arg8 + var20;
			short var24 = arg1[var13++];
			int var36 = var16++;
			arg2[var36] += var22 * var24 >> 6;
			int var25 = arg7 + var22;
			int var37 = var16++;
			arg2[var37] += var23 * var24 >> 6;
			int var26 = arg8 + var23;
			short var27 = arg1[var13++];
			int var39 = var16++;
			arg2[var39] += var25 * var27 >> 6;
			arg5 = arg7 + var25;
			int var40 = var16++;
			arg2[var40] += var26 * var27 >> 6;
			arg6 = arg8 + var26;
		}
		var17 = var29 + 6;
		while (var16 < var17) {
			short var28 = arg1[var13++];
			int var10001 = var16++;
			arg2[var10001] += arg5 * var28 >> 6;
			arg5 += arg7;
			int var41 = var16++;
			arg2[var41] += arg6 * var28 >> 6;
			arg6 += arg8;
		}
		arg12.field1396 = arg5;
		arg12.field1397 = arg6;
		arg12.field1408 = var13 << 8;
		return var16 >> 1;
	}

	@ObfuscatedName("do.av([S[IIIIIIIILdo;)I")
	public static int method3079(short[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class104 arg9) {
		int var10 = arg2 >> 8;
		int var11 = arg8 >> 8;
		int var12 = arg4 << 2;
		int var13 = arg5 << 2;
		int var14;
		if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
			var14 = arg7;
		}
		arg9.field1396 += (var14 - arg3) * arg9.field1403;
		arg9.field1397 += (var14 - arg3) * arg9.field1405;
		var14 -= 3;
		int var10001;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var10--] * var12;
			int var15 = var12 + var13;
			int var18 = arg3++;
			arg1[var18] += arg0[var10--] * var15;
			int var16 = var13 + var15;
			int var19 = arg3++;
			arg1[var19] += arg0[var10--] * var16;
			int var17 = var13 + var16;
			int var20 = arg3++;
			arg1[var20] += arg0[var10--] * var17;
			var12 = var13 + var17;
		}
		var14 += 3;
		while (arg3 < var14) {
			var10001 = arg3++;
			arg1[var10001] += arg0[var10--] * var12;
			var12 += var13;
		}
		arg9.field1395 = var12 >> 2;
		arg9.field1408 = var10 << 8;
		return arg3;
	}

	@ObfuscatedName("do.by(I[S[IIIIIIIIIILdo;)I")
	public static int method3129(int arg0, short[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class104 arg12) {
		int var13 = arg3 >> 8;
		int var14 = arg11 >> 8;
		int var15;
		if ((var15 = arg4 + var13 - (var14 - 1)) > arg10) {
			var15 = arg10;
		}
		arg12.field1395 += (var15 - arg4) * arg12.field1402;
		int var16 = arg4 << 1;
		int var17 = var15 << 1;
		int var29 = var17 - 6;
		while (var16 < var29) {
			short var18 = arg1[var13--];
			int var30 = var16++;
			arg2[var30] += arg5 * var18 >> 6;
			int var19 = arg5 + arg7;
			int var31 = var16++;
			arg2[var31] += arg6 * var18 >> 6;
			int var20 = arg6 + arg8;
			short var21 = arg1[var13--];
			int var33 = var16++;
			arg2[var33] += var19 * var21 >> 6;
			int var22 = arg7 + var19;
			int var34 = var16++;
			arg2[var34] += var20 * var21 >> 6;
			int var23 = arg8 + var20;
			short var24 = arg1[var13--];
			int var36 = var16++;
			arg2[var36] += var22 * var24 >> 6;
			int var25 = arg7 + var22;
			int var37 = var16++;
			arg2[var37] += var23 * var24 >> 6;
			int var26 = arg8 + var23;
			short var27 = arg1[var13--];
			int var39 = var16++;
			arg2[var39] += var25 * var27 >> 6;
			arg5 = arg7 + var25;
			int var40 = var16++;
			arg2[var40] += var26 * var27 >> 6;
			arg6 = arg8 + var26;
		}
		var17 = var29 + 6;
		while (var16 < var17) {
			short var28 = arg1[var13--];
			int var10001 = var16++;
			arg2[var10001] += arg5 * var28 >> 6;
			arg5 += arg7;
			int var41 = var16++;
			arg2[var41] += arg6 * var28 >> 6;
			arg6 += arg8;
		}
		arg12.field1396 = arg5;
		arg12.field1397 = arg6;
		arg12.field1408 = var13 << 8;
		return var16 >> 1;
	}

	@ObfuscatedName("do.bg(II[S[IIIIIIIILdo;II)I")
	public static int method3081(int arg0, int arg1, short[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
		arg11.field1396 -= arg11.field1403 * arg5;
		arg11.field1397 -= arg11.field1405 * arg5;
		int var14;
		if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
			var14 = arg9;
		}
		int var10001;
		while (arg5 < var14) {
			int var15 = arg4 >> 8;
			short var16 = arg2[var15];
			var10001 = arg5++;
			arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		int var17;
		if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
			var17 = arg9;
		}
		int var18 = arg13;
		while (arg5 < var17) {
			short var19 = arg2[arg4 >> 8];
			var10001 = arg5++;
			arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		arg11.field1396 += arg11.field1403 * arg5;
		arg11.field1397 += arg11.field1405 * arg5;
		arg11.field1395 = arg6;
		arg11.field1408 = arg4;
		return arg5;
	}

	@ObfuscatedName("do.bx(II[S[IIIIIIIIIILdo;II)I")
	public static int method3141(int arg0, int arg1, short[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class104 arg13, int arg14, int arg15) {
		arg13.field1395 -= arg13.field1402 * arg5;
		int var16;
		if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
			var16 = arg11;
		}
		int var17 = arg5 << 1;
		int var18 = var16 << 1;
		int var10001;
		while (var17 < var18) {
			int var19 = arg4 >> 8;
			short var20 = arg2[var19];
			int var21 = ((arg4 & 0xFF) * (arg2[var19 + 1] - var20) >> 8) + var20;
			var10001 = var17++;
			arg3[var10001] += arg6 * var21 >> 6;
			arg6 += arg8;
			int var28 = var17++;
			arg3[var28] += arg7 * var21 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		int var22;
		if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
			var22 = arg11;
		}
		int var23 = var22 << 1;
		int var24 = arg15;
		while (var17 < var23) {
			short var25 = arg2[arg4 >> 8];
			int var26 = ((arg4 & 0xFF) * (var24 - var25) >> 8) + var25;
			var10001 = var17++;
			arg3[var10001] += arg6 * var26 >> 6;
			arg6 += arg8;
			var10001 = var17++;
			arg3[var10001] += arg7 * var26 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		int var27 = var17 >> 1;
		arg13.field1395 += arg13.field1402 * var27;
		arg13.field1396 = arg6;
		arg13.field1397 = arg7;
		arg13.field1408 = arg4;
		return var27;
	}

	@ObfuscatedName("do.bq(II[S[IIIIIIIILdo;II)I")
	public static int method3112(int arg0, int arg1, short[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class104 arg11, int arg12, int arg13) {
		arg11.field1396 -= arg11.field1403 * arg5;
		arg11.field1397 -= arg11.field1405 * arg5;
		int var14;
		if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
			var14 = arg9;
		}
		int var10001;
		while (arg5 < var14) {
			int var15 = arg4 >> 8;
			short var16 = arg2[var15 - 1];
			var10001 = arg5++;
			arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		int var17;
		if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
			var17 = arg9;
		}
		int var18 = arg13;
		int var19 = arg12;
		while (arg5 < var17) {
			var10001 = arg5++;
			arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
			arg6 += arg7;
			arg4 += var19;
		}
		arg11.field1396 += arg11.field1403 * arg5;
		arg11.field1397 += arg11.field1405 * arg5;
		arg11.field1395 = arg6;
		arg11.field1408 = arg4;
		return arg5;
	}

	@ObfuscatedName("do.bz(II[S[IIIIIIIIIILdo;II)I")
	public static int method3084(int arg0, int arg1, short[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class104 arg13, int arg14, int arg15) {
		arg13.field1395 -= arg13.field1402 * arg5;
		int var16;
		if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
			var16 = arg11;
		}
		int var17 = arg5 << 1;
		int var18 = var16 << 1;
		int var10001;
		while (var17 < var18) {
			int var19 = arg4 >> 8;
			short var20 = arg2[var19 - 1];
			int var21 = ((arg4 & 0xFF) * (arg2[var19] - var20) >> 8) + var20;
			var10001 = var17++;
			arg3[var10001] += arg6 * var21 >> 6;
			arg6 += arg8;
			int var27 = var17++;
			arg3[var27] += arg7 * var21 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		int var22;
		if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
			var22 = arg11;
		}
		int var23 = var22 << 1;
		int var24 = arg15;
		while (var17 < var23) {
			int var25 = ((arg4 & 0xFF) * (arg2[arg4 >> 8] - var24) >> 8) + var24;
			var10001 = var17++;
			arg3[var10001] += arg6 * var25 >> 6;
			arg6 += arg8;
			var10001 = var17++;
			arg3[var10001] += arg7 * var25 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		int var26 = var17 >> 1;
		arg13.field1395 += arg13.field1402 * var26;
		arg13.field1396 = arg6;
		arg13.field1397 = arg7;
		arg13.field1408 = arg4;
		return var26;
	}

	@ObfuscatedName("do.bn()I")
	public int method3085() {
		int var1 = this.field1395 * 3 >> 6;
		int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
		if (this.field1398 == 0) {
			var2 -= this.field1408 * var2 / (((class96) this.field1413).field1323.length << 8);
		} else if (this.field1398 >= 0) {
			var2 -= this.field1401 * var2 / ((class96) this.field1413).field1323.length;
		}
		return var2 > 255 ? 255 : var2;
	}

	@ObfuscatedName("do.be()V")
	public void method3086() {
		this.field1395 = this.field1391;
		this.field1396 = method3065(this.field1391, this.field1399);
		this.field1397 = method3083(this.field1391, this.field1399);
	}

	@ObfuscatedName("do.bh(I)V")
	public synchronized void method3087(int arg0) {
		this.field1398 = arg0;
	}

	@ObfuscatedName("do.bk(II)V")
	public synchronized void method3088(int arg0, int arg1) {
		this.field1391 = arg0;
		this.field1399 = arg1;
		this.field1407 = 0;
		this.method3086();
	}

	@ObfuscatedName("do.bp()I")
	public synchronized int method3089() {
		return this.field1391 == Integer.MIN_VALUE ? 0 : this.field1391 + 32 >> 6;
	}

	@ObfuscatedName("do.br(I)V")
	public synchronized void method3179(int arg0) {
		this.method3088(arg0 << 6, this.method3177());
	}

	@ObfuscatedName("do.bv()I")
	public synchronized int method3091() {
		return this.field1391 == Integer.MIN_VALUE ? 0 : this.field1391;
	}

	@ObfuscatedName("do.bj(I)V")
	public synchronized void method3126(int arg0) {
		this.method3088(arg0, this.method3177());
	}

	@ObfuscatedName("do.bm()I")
	public synchronized int method3177() {
		return this.field1399 < 0 ? -1 : this.field1399;
	}

	@ObfuscatedName("do.bf()I")
	public int method3069() {
		class96 var1 = (class96) this.field1413;
		return (int) ((double) var1.field1323.length * 1000.0D / (double) var1.field1326);
	}

	@ObfuscatedName("do.bw(I)V")
	public synchronized void method3072(int arg0) {
		int var2 = ((class96) this.field1413).field1323.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > var2) {
			arg0 = var2;
		}
		this.field1408 = arg0;
	}

	@ObfuscatedName("do.bc(Z)V")
	public synchronized void method3095(boolean arg0) {
		this.field1392 = (this.field1392 >>> 31) + (this.field1392 ^ this.field1392 >> 31);
		if (arg0) {
			this.field1392 = -this.field1392;
		}
	}

	@ObfuscatedName("do.cw()V")
	public void method3115() {
		if (this.field1407 == 0) {
			return;
		}
		if (this.field1391 == Integer.MIN_VALUE) {
			this.field1391 = 0;
		}
		this.field1407 = 0;
		this.method3086();
	}

	@ObfuscatedName("do.cz(II)V")
	public synchronized void method3097(int arg0, int arg1) {
		this.method3098(arg0, arg1, this.method3177());
	}

	@ObfuscatedName("do.cf(III)V")
	public synchronized void method3098(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			this.method3088(arg1, arg2);
			return;
		}
		int var4 = method3065(arg1, arg2);
		int var5 = method3083(arg1, arg2);
		if (this.field1396 == var4 && this.field1397 == var5) {
			this.field1407 = 0;
			return;
		}
		int var6 = arg1 - this.field1395;
		if (this.field1395 - arg1 > var6) {
			var6 = this.field1395 - arg1;
		}
		if (var4 - this.field1396 > var6) {
			var6 = var4 - this.field1396;
		}
		if (this.field1396 - var4 > var6) {
			var6 = this.field1396 - var4;
		}
		if (var5 - this.field1397 > var6) {
			var6 = var5 - this.field1397;
		}
		if (this.field1397 - var5 > var6) {
			var6 = this.field1397 - var5;
		}
		if (arg0 > var6) {
			arg0 = var6;
		}
		this.field1407 = arg0;
		this.field1391 = arg1;
		this.field1399 = arg2;
		this.field1402 = (arg1 - this.field1395) / arg0;
		this.field1403 = (var4 - this.field1396) / arg0;
		this.field1405 = (var5 - this.field1397) / arg0;
	}

	@ObfuscatedName("do.cg(I)V")
	public synchronized void method3099(int arg0) {
		if (arg0 == 0) {
			this.method3126(0);
			this.method2234();
		} else if (this.field1396 == 0 && this.field1397 == 0) {
			this.field1407 = 0;
			this.field1391 = 0;
			this.field1395 = 0;
			this.method2234();
		} else {
			int var2 = -this.field1395;
			if (this.field1395 > var2) {
				var2 = this.field1395;
			}
			if (-this.field1396 > var2) {
				var2 = -this.field1396;
			}
			if (this.field1396 > var2) {
				var2 = this.field1396;
			}
			if (-this.field1397 > var2) {
				var2 = -this.field1397;
			}
			if (this.field1397 > var2) {
				var2 = this.field1397;
			}
			if (arg0 > var2) {
				arg0 = var2;
			}
			this.field1407 = arg0;
			this.field1391 = Integer.MIN_VALUE;
			this.field1402 = -this.field1395 / arg0;
			this.field1403 = -this.field1396 / arg0;
			this.field1405 = -this.field1397 / arg0;
		}
	}

	@ObfuscatedName("do.ci()I")
	public synchronized int method3100() {
		return this.field1392 < 0 ? -this.field1392 : this.field1392;
	}

	@ObfuscatedName("do.cp(I)V")
	public synchronized void method3101(int arg0) {
		if (this.field1392 < 0) {
			this.field1392 = -arg0;
		} else {
			this.field1392 = arg0;
		}
	}

	@ObfuscatedName("do.cm()Z")
	public boolean method3102() {
		return this.field1408 < 0 || this.field1408 >= ((class96) this.field1413).field1323.length << 8;
	}

	@ObfuscatedName("do.cc()Z")
	public boolean method3103() {
		return this.field1407 != 0;
	}

	@ObfuscatedName("do.aq()Lef;")
	public class105 method2895() {
		return null;
	}

	@ObfuscatedName("do.ao()Lef;")
	public class105 method2896() {
		return null;
	}

	@ObfuscatedName("do.as()I")
	public int method2915() {
		return this.field1391 == 0 && this.field1407 == 0 ? 0 : 1;
	}

	@ObfuscatedName("do.al([III)V")
	public synchronized void method2899(int[] arg0, int arg1, int arg2) {
		if (this.field1391 == 0 && this.field1407 == 0) {
			this.method2900(arg2);
			return;
		}
		class96 var4 = (class96) this.field1413;
		int var5 = this.field1401 << 8;
		int var6 = this.field1400 << 8;
		int var7 = var4.field1323.length << 8;
		int var8 = var6 - var5;
		if (var8 <= 0) {
			this.field1398 = 0;
		}
		int var9 = arg1;
		int var10 = arg1 + arg2;
		if (this.field1408 < 0) {
			if (this.field1392 <= 0) {
				this.method3115();
				this.method2234();
				return;
			}
			this.field1408 = 0;
		}
		if (this.field1408 >= var7) {
			if (this.field1392 >= 0) {
				this.method3115();
				this.method2234();
				return;
			}
			this.field1408 = var7 - 1;
		}
		if (this.field1398 >= 0) {
			if (this.field1398 > 0) {
				if (this.field1409) {
					label131: {
						if (this.field1392 < 0) {
							var9 = this.method3106(arg0, arg1, var5, var10, var4.field1323[this.field1401]);
							if (this.field1408 >= var5) {
								return;
							}
							this.field1408 = var5 + var5 - 1 - this.field1408;
							this.field1392 = -this.field1392;
							if (--this.field1398 == 0) {
								break label131;
							}
						}
						do {
							var9 = this.method3105(arg0, var9, var6, var10, var4.field1323[this.field1400 - 1]);
							if (this.field1408 < var6) {
								return;
							}
							this.field1408 = var6 + var6 - 1 - this.field1408;
							this.field1392 = -this.field1392;
							if (--this.field1398 == 0) {
								break;
							}
							var9 = this.method3106(arg0, var9, var5, var10, var4.field1323[this.field1401]);
							if (this.field1408 >= var5) {
								return;
							}
							this.field1408 = var5 + var5 - 1 - this.field1408;
							this.field1392 = -this.field1392;
						} while (--this.field1398 != 0);
					}
				} else if (this.field1392 < 0) {
					while (true) {
						var9 = this.method3106(arg0, var9, var5, var10, var4.field1323[this.field1400 - 1]);
						if (this.field1408 >= var5) {
							return;
						}
						int var12 = (var6 - 1 - this.field1408) / var8;
						if (var12 >= this.field1398) {
							this.field1408 += this.field1398 * var8;
							this.field1398 = 0;
							break;
						}
						this.field1408 += var8 * var12;
						this.field1398 -= var12;
					}
				} else {
					while (true) {
						var9 = this.method3105(arg0, var9, var6, var10, var4.field1323[this.field1401]);
						if (this.field1408 < var6) {
							return;
						}
						int var13 = (this.field1408 - var5) / var8;
						if (var13 >= this.field1398) {
							this.field1408 -= this.field1398 * var8;
							this.field1398 = 0;
							break;
						}
						this.field1408 -= var8 * var13;
						this.field1398 -= var13;
					}
				}
			}
			if (this.field1392 < 0) {
				this.method3106(arg0, var9, 0, var10, 0);
				if (this.field1408 < 0) {
					this.field1408 = -1;
					this.method3115();
					this.method2234();
				}
			} else {
				this.method3105(arg0, var9, var7, var10, 0);
				if (this.field1408 >= var7) {
					this.field1408 = var7;
					this.method3115();
					this.method2234();
				}
			}
		} else if (this.field1409) {
			if (this.field1392 < 0) {
				var9 = this.method3106(arg0, arg1, var5, var10, var4.field1323[this.field1401]);
				if (this.field1408 >= var5) {
					return;
				}
				this.field1408 = var5 + var5 - 1 - this.field1408;
				this.field1392 = -this.field1392;
			}
			while (true) {
				int var11 = this.method3105(arg0, var9, var6, var10, var4.field1323[this.field1400 - 1]);
				if (this.field1408 < var6) {
					return;
				}
				this.field1408 = var6 + var6 - 1 - this.field1408;
				this.field1392 = -this.field1392;
				var9 = this.method3106(arg0, var11, var5, var10, var4.field1323[this.field1401]);
				if (this.field1408 >= var5) {
					return;
				}
				this.field1408 = var5 + var5 - 1 - this.field1408;
				this.field1392 = -this.field1392;
			}
		} else if (this.field1392 < 0) {
			while (true) {
				var9 = this.method3106(arg0, var9, var5, var10, var4.field1323[this.field1400 - 1]);
				if (this.field1408 >= var5) {
					return;
				}
				this.field1408 = var6 - 1 - (var6 - 1 - this.field1408) % var8;
			}
		} else {
			while (true) {
				var9 = this.method3105(arg0, var9, var6, var10, var4.field1323[this.field1401]);
				if (this.field1408 < var6) {
					return;
				}
				this.field1408 = (this.field1408 - var5) % var8 + var5;
			}
		}
	}

	@ObfuscatedName("do.ai(I)V")
	public synchronized void method2900(int arg0) {
		if (this.field1407 > 0) {
			if (arg0 >= this.field1407) {
				if (this.field1391 == Integer.MIN_VALUE) {
					this.field1391 = 0;
					this.field1397 = 0;
					this.field1396 = 0;
					this.field1395 = 0;
					this.method2234();
					arg0 = this.field1407;
				}
				this.field1407 = 0;
				this.method3086();
			} else {
				this.field1395 += this.field1402 * arg0;
				this.field1396 += this.field1403 * arg0;
				this.field1397 += this.field1405 * arg0;
				this.field1407 -= arg0;
			}
		}
		class96 var2 = (class96) this.field1413;
		int var3 = this.field1401 << 8;
		int var4 = this.field1400 << 8;
		int var5 = var2.field1323.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field1398 = 0;
		}
		if (this.field1408 < 0) {
			if (this.field1392 <= 0) {
				this.method3115();
				this.method2234();
				return;
			}
			this.field1408 = 0;
		}
		if (this.field1408 >= var5) {
			if (this.field1392 >= 0) {
				this.method3115();
				this.method2234();
				return;
			}
			this.field1408 = var5 - 1;
		}
		this.field1408 += this.field1392 * arg0;
		if (this.field1398 >= 0) {
			if (this.field1398 > 0) {
				if (this.field1409) {
					label121: {
						if (this.field1392 < 0) {
							if (this.field1408 >= var3) {
								return;
							}
							this.field1408 = var3 + var3 - 1 - this.field1408;
							this.field1392 = -this.field1392;
							if (--this.field1398 == 0) {
								break label121;
							}
						}
						do {
							if (this.field1408 < var4) {
								return;
							}
							this.field1408 = var4 + var4 - 1 - this.field1408;
							this.field1392 = -this.field1392;
							if (--this.field1398 == 0) {
								break;
							}
							if (this.field1408 >= var3) {
								return;
							}
							this.field1408 = var3 + var3 - 1 - this.field1408;
							this.field1392 = -this.field1392;
						} while (--this.field1398 != 0);
					}
				} else {
					label153: {
						if (this.field1392 < 0) {
							if (this.field1408 >= var3) {
								return;
							}
							int var7 = (var4 - 1 - this.field1408) / var6;
							if (var7 >= this.field1398) {
								this.field1408 += this.field1398 * var6;
								this.field1398 = 0;
								break label153;
							}
							this.field1408 += var6 * var7;
							this.field1398 -= var7;
						} else if (this.field1408 >= var4) {
							int var8 = (this.field1408 - var3) / var6;
							if (var8 >= this.field1398) {
								this.field1408 -= this.field1398 * var6;
								this.field1398 = 0;
								break label153;
							}
							this.field1408 -= var6 * var8;
							this.field1398 -= var8;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.field1392 < 0) {
				if (this.field1408 < 0) {
					this.field1408 = -1;
					this.method3115();
					this.method2234();
				}
			} else if (this.field1408 >= var5) {
				this.field1408 = var5;
				this.method3115();
				this.method2234();
			}
		} else if (this.field1409) {
			if (this.field1392 < 0) {
				if (this.field1408 >= var3) {
					return;
				}
				this.field1408 = var3 + var3 - 1 - this.field1408;
				this.field1392 = -this.field1392;
			}
			while (this.field1408 >= var4) {
				this.field1408 = var4 + var4 - 1 - this.field1408;
				this.field1392 = -this.field1392;
				if (this.field1408 >= var3) {
					return;
				}
				this.field1408 = var3 + var3 - 1 - this.field1408;
				this.field1392 = -this.field1392;
			}
		} else if (this.field1392 < 0) {
			if (this.field1408 >= var3) {
				return;
			}
			this.field1408 = var4 - 1 - (var4 - 1 - this.field1408) % var6;
		} else if (this.field1408 >= var4) {
			this.field1408 = (this.field1408 - var3) % var6 + var3;
		} else {
			return;
		}
	}

	@ObfuscatedName("do.cj([IIIII)I")
	public int method3105(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		while (true) {
			if (this.field1407 > 0) {
				int var6 = this.field1407 + arg1;
				if (var6 > arg3) {
					var6 = arg3;
				}
				this.field1407 += arg1;
				if (this.field1392 == 256 && (this.field1408 & 0xFF) == 0) {
					if (Statics.field1340) {
						arg1 = method3164(0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1396, this.field1397, this.field1403, this.field1405, 0, var6, arg2, this);
					} else {
						arg1 = method3113(((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1395, this.field1402, 0, var6, arg2, this);
					}
				} else if (Statics.field1340) {
					arg1 = method3141(0, 0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1396, this.field1397, this.field1403, this.field1405, 0, var6, arg2, this, this.field1392, arg4);
				} else {
					arg1 = method3081(0, 0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1395, this.field1402, 0, var6, arg2, this, this.field1392, arg4);
				}
				this.field1407 -= arg1;
				if (this.field1407 != 0) {
					return arg1;
				}
				if (!this.method3082()) {
					continue;
				}
				return arg3;
			}
			if (this.field1392 == 256 && (this.field1408 & 0xFF) == 0) {
				if (Statics.field1340) {
					return method3070(0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1396, this.field1397, 0, arg3, arg2, this, ((class96) this.field1413).method2958());
				}
				return method3210(((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1395, 0, arg3, arg2, this);
			}
			if (Statics.field1340) {
				return method3183(0, 0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1396, this.field1397, 0, arg3, arg2, this, this.field1392, arg4);
			}
			return method3073(0, 0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1395, 0, arg3, arg2, this, this.field1392, arg4);
		}
	}

	@ObfuscatedName("do.ce([IIIII)I")
	public int method3106(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		while (true) {
			if (this.field1407 > 0) {
				int var6 = this.field1407 + arg1;
				if (var6 > arg3) {
					var6 = arg3;
				}
				this.field1407 += arg1;
				if (this.field1392 == -256 && (this.field1408 & 0xFF) == 0) {
					if (Statics.field1340) {
						arg1 = method3129(0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1396, this.field1397, this.field1403, this.field1405, 0, var6, arg2, this);
					} else {
						arg1 = method3079(((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1395, this.field1402, 0, var6, arg2, this);
					}
				} else if (Statics.field1340) {
					arg1 = method3084(0, 0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1396, this.field1397, this.field1403, this.field1405, 0, var6, arg2, this, this.field1392, arg4);
				} else {
					arg1 = method3112(0, 0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1395, this.field1402, 0, var6, arg2, this, this.field1392, arg4);
				}
				this.field1407 -= arg1;
				if (this.field1407 != 0) {
					return arg1;
				}
				if (!this.method3082()) {
					continue;
				}
				return arg3;
			}
			if (this.field1392 == -256 && (this.field1408 & 0xFF) == 0) {
				if (Statics.field1340) {
					return method3071(0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1396, this.field1397, 0, arg3, arg2, this);
				}
				return method3093(((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1395, 0, arg3, arg2, this);
			}
			if (Statics.field1340) {
				return method3076(0, 0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1396, this.field1397, 0, arg3, arg2, this, this.field1392, arg4);
			}
			return method3075(0, 0, ((class96) this.field1413).field1323, arg0, this.field1408, arg1, this.field1395, 0, arg3, arg2, this, this.field1392, arg4);
		}
	}

	@ObfuscatedName("do.cr()Z")
	public boolean method3082() {
		int var1 = this.field1391;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method3065(var1, this.field1399);
			var2 = method3083(var1, this.field1399);
		}
		if (this.field1395 != var1 || this.field1396 != var3 || this.field1397 != var2) {
			if (this.field1395 < var1) {
				this.field1402 = 1;
				this.field1407 = var1 - this.field1395;
			} else if (this.field1395 > var1) {
				this.field1402 = -1;
				this.field1407 = this.field1395 - var1;
			} else {
				this.field1402 = 0;
			}
			if (this.field1396 < var3) {
				this.field1403 = 1;
				if (this.field1407 == 0 || this.field1407 > var3 - this.field1396) {
					this.field1407 = var3 - this.field1396;
				}
			} else if (this.field1396 > var3) {
				this.field1403 = -1;
				if (this.field1407 == 0 || this.field1407 > this.field1396 - var3) {
					this.field1407 = this.field1396 - var3;
				}
			} else {
				this.field1403 = 0;
			}
			if (this.field1397 < var2) {
				this.field1405 = 1;
				if (this.field1407 == 0 || this.field1407 > var2 - this.field1397) {
					this.field1407 = var2 - this.field1397;
				}
			} else if (this.field1397 > var2) {
				this.field1405 = -1;
				if (this.field1407 == 0 || this.field1407 > this.field1397 - var2) {
					this.field1407 = this.field1397 - var2;
				}
			} else {
				this.field1405 = 0;
			}
			return false;
		} else if (this.field1391 == Integer.MIN_VALUE) {
			this.field1391 = 0;
			this.field1397 = 0;
			this.field1396 = 0;
			this.field1395 = 0;
			this.method2234();
			return true;
		} else {
			this.method3086();
			return false;
		}
	}

	public String toString() {
		return super.toString();
	}
}
