package deob;

@ObfuscatedName("AQBPXQWT")
public class AQBPXQWT {

	@ObfuscatedName("AQBPXQWT.i")
	public int[] field10 = new int[5];

	@ObfuscatedName("AQBPXQWT.j")
	public int[] field11 = new int[5];

	@ObfuscatedName("AQBPXQWT.k")
	public int[] field12 = new int[5];

	@ObfuscatedName("AQBPXQWT.m")
	public int field14 = 100;

	@ObfuscatedName("AQBPXQWT.p")
	public int field17 = 500;

	@ObfuscatedName("AQBPXQWT.u")
	public static int[] field22 = new int[5];

	@ObfuscatedName("AQBPXQWT.v")
	public static int[] field23 = new int[5];

	@ObfuscatedName("AQBPXQWT.w")
	public static int[] field24 = new int[5];

	@ObfuscatedName("AQBPXQWT.x")
	public static int[] field25 = new int[5];

	@ObfuscatedName("AQBPXQWT.y")
	public static int[] field26 = new int[5];

	@ObfuscatedName("AQBPXQWT.l")
	public int field13;

	@ObfuscatedName("AQBPXQWT.q")
	public int field18;

	@ObfuscatedName("AQBPXQWT.n")
	public CGCAZMIE field15;

	@ObfuscatedName("AQBPXQWT.o")
	public QOBPOZUC field16;

	@ObfuscatedName("AQBPXQWT.a")
	public QOBPOZUC field2;

	@ObfuscatedName("AQBPXQWT.b")
	public QOBPOZUC field3;

	@ObfuscatedName("AQBPXQWT.c")
	public QOBPOZUC field4;

	@ObfuscatedName("AQBPXQWT.d")
	public QOBPOZUC field5;

	@ObfuscatedName("AQBPXQWT.e")
	public QOBPOZUC field6;

	@ObfuscatedName("AQBPXQWT.f")
	public QOBPOZUC field7;

	@ObfuscatedName("AQBPXQWT.g")
	public QOBPOZUC field8;

	@ObfuscatedName("AQBPXQWT.h")
	public QOBPOZUC field9;

	@ObfuscatedName("AQBPXQWT.r")
	public static int[] field19;

	@ObfuscatedName("AQBPXQWT.s")
	public static int[] field20;

	@ObfuscatedName("AQBPXQWT.t")
	public static int[] field21;

	@ObfuscatedName("AQBPXQWT.a()V")
	public static final void method4() {
		field20 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field20[var0] = 1;
			} else {
				field20[var0] = -1;
			}
		}

		field21 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field21[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field19 = new int[220500];
	}

	@ObfuscatedName("AQBPXQWT.a(II)[I")
	public final int[] method5(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field19[var3] = 0;
		}

		if (arg1 < 10) {
			return field19;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field2.method392();
		field3.method392();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field4 != null) {
			field4.method392();
			field5.method392();
			var6 = (int) ((field4.field1047 - field4.field1046) * 32.768D / var4);
			var7 = (int) (field4.field1046 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field6 != null) {
			field6.method392();
			field7.method392();
			var9 = (int) ((field6.field1047 - field6.field1046) * 32.768D / var4);
			var10 = (int) (field6.field1046 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field10[var12] != 0) {
				field22[var12] = 0;
				field23[var12] = (int) (field12[var12] * var4);
				field24[var12] = (field10[var12] << 14) / 100;
				field25[var12] = (int) ((field2.field1047 - field2.field1046) * 32.768D * Math.pow(1.0057929410678534D, field11[var12]) / var4);
				field26[var12] = (int) (field2.field1046 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field2.method393(arg0);
			int var15 = field3.method393(arg0);

			if (field4 != null) {
				int var16 = field4.method393(arg0);
				int var17 = field5.method393(arg0);
				var14 += method6(field4.field1048, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field6 != null) {
				int var18 = field6.method393(arg0);
				int var19 = field7.method393(arg0);
				var15 = var15 * ((method6(field6.field1048, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field10[var20] != 0) {
					int var21 = field23[var20] + var13;
					if (var21 < arg0) {
						field19[var21] += method6(field2.field1048, field22[var20], field24[var20] * var15 >> 15);
						field22[var20] += (field25[var20] * var14 >> 16) + field26[var20];
					}
				}
			}
		}

		if (field8 != null) {
			field8.method392();
			field9.method392();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field8.method393(arg0);
				int var27 = field9.method393(arg0);
				int var28;
				if (var24) {
					var28 = ((field8.field1047 - field8.field1046) * var26 >> 8) + field8.field1046;
				} else {
					var28 = ((field8.field1047 - field8.field1046) * var27 >> 8) + field8.field1046;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field19[var25] = 0;
				}
			}
		}

		if (field13 > 0 && field14 > 0) {
			int var29 = (int) (field13 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field19[var30] += field19[var30 - var29] * field14 / 100;
			}
		}

		if (field15.field53[0] > 0 || field15.field53[1] > 0) {
			field16.method392();
			int var31 = field16.method393(arg0 + 1);
			int var32 = field15.method30(var31 / 65536.0F, 0);
			int var33 = field15.method30(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field19[var32 + var34] * (long) CGCAZMIE.field60 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field19[var32 + var34 - var37 - 1] * (long) CGCAZMIE.field58[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field19[var34 - var38 - 1] * (long) CGCAZMIE.field58[1][var38] >> 16);
					}

					field19[var34] = var36;
					var31 = field16.method393(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field19[var32 + var34] * (long) CGCAZMIE.field60 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field19[var32 + var34 - var42 - 1] * (long) CGCAZMIE.field58[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field19[var34 - var43 - 1] * (long) CGCAZMIE.field58[1][var43] >> 16);
						}

						field19[var34] = var41;
						var31 = field16.method393(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field15.method30(var31 / 65536.0F, 0);
					var33 = field15.method30(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field19[var32 + var34 - var45 - 1] * (long) CGCAZMIE.field58[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field19[var34 - var46 - 1] * (long) CGCAZMIE.field58[1][var46] >> 16);
					}

					field19[var34] = var44;
					field16.method393(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field19[var48] < -32768) {
				field19[var48] = -32768;
			}

			if (field19[var48] > 32767) {
				field19[var48] = 32767;
			}
		}

		return field19;
	}

	@ObfuscatedName("AQBPXQWT.a(IIII)I")
	public final int method6(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return field21[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return field20[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("AQBPXQWT.a(LXQPFGONL;I)V")
	public final void method7(XQPFGONL arg0) {
		field2 = new QOBPOZUC();
		field2.method390(arg0);
		field3 = new QOBPOZUC();
		field3.method390(arg0);
		int var2 = arg0.method478();
		if (var2 != 0) {
			arg0.field1335--;
			field4 = new QOBPOZUC();
			field4.method390(arg0);
			field5 = new QOBPOZUC();
			field5.method390(arg0);
		}

		int var3 = arg0.method478();
		if (var3 != 0) {
			arg0.field1335--;
			field6 = new QOBPOZUC();
			field6.method390(arg0);
			field7 = new QOBPOZUC();
			field7.method390(arg0);
		}

		int var4 = arg0.method478();
		if (var4 != 0) {
			arg0.field1335--;
			field8 = new QOBPOZUC();
			field8.method390(arg0);
			field9 = new QOBPOZUC();
			field9.method390(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method492();
			if (var6 == 0) {
				break;
			}

			field10[var5] = var6;
			field11[var5] = arg0.method491();
			field12[var5] = arg0.method492();
		}

		field13 = arg0.method492();
		field14 = arg0.method492();
		field17 = arg0.method480();
		field18 = arg0.method480();
		field15 = new CGCAZMIE();
		field16 = new QOBPOZUC();
		field15.method31(arg0, field16);
	}
}
