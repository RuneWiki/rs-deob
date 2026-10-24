package deob;

@ObfuscatedName("ACLAPANL")
public class ACLAPANL {

	@ObfuscatedName("ACLAPANL.j")
	public int[] field19 = new int[5];

	@ObfuscatedName("ACLAPANL.k")
	public int[] field20 = new int[5];

	@ObfuscatedName("ACLAPANL.l")
	public int[] field21 = new int[5];

	@ObfuscatedName("ACLAPANL.n")
	public int field23 = 100;

	@ObfuscatedName("ACLAPANL.q")
	public int field26 = 500;

	@ObfuscatedName("ACLAPANL.v")
	public static int[] field31 = new int[5];

	@ObfuscatedName("ACLAPANL.w")
	public static int[] field32 = new int[5];

	@ObfuscatedName("ACLAPANL.x")
	public static int[] field33 = new int[5];

	@ObfuscatedName("ACLAPANL.y")
	public static int[] field34 = new int[5];

	@ObfuscatedName("ACLAPANL.z")
	public static int[] field35 = new int[5];

	@ObfuscatedName("ACLAPANL.m")
	public int field22;

	@ObfuscatedName("ACLAPANL.r")
	public int field27;

	@ObfuscatedName("ACLAPANL.b")
	public BJPHZZMM field11;

	@ObfuscatedName("ACLAPANL.c")
	public BJPHZZMM field12;

	@ObfuscatedName("ACLAPANL.d")
	public BJPHZZMM field13;

	@ObfuscatedName("ACLAPANL.e")
	public BJPHZZMM field14;

	@ObfuscatedName("ACLAPANL.f")
	public BJPHZZMM field15;

	@ObfuscatedName("ACLAPANL.g")
	public BJPHZZMM field16;

	@ObfuscatedName("ACLAPANL.h")
	public BJPHZZMM field17;

	@ObfuscatedName("ACLAPANL.i")
	public BJPHZZMM field18;

	@ObfuscatedName("ACLAPANL.p")
	public BJPHZZMM field25;

	@ObfuscatedName("ACLAPANL.o")
	public FCAOQJWY field24;

	@ObfuscatedName("ACLAPANL.s")
	public static int[] field28;

	@ObfuscatedName("ACLAPANL.t")
	public static int[] field29;

	@ObfuscatedName("ACLAPANL.u")
	public static int[] field30;

	@ObfuscatedName("ACLAPANL.a()V")
	public static final void method7() {
		field29 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field29[var0] = 1;
			} else {
				field29[var0] = -1;
			}
		}

		field30 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field30[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field28 = new int[220500];
	}

	@ObfuscatedName("ACLAPANL.a(II)[I")
	public final int[] method8(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field28[var3] = 0;
		}

		if (arg1 < 10) {
			return field28;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field11.method32();
		field12.method32();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field13 != null) {
			field13.method32();
			field14.method32();
			var6 = (int) ((field13.field50 - field13.field49) * 32.768D / var4);
			var7 = (int) (field13.field49 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field15 != null) {
			field15.method32();
			field16.method32();
			var9 = (int) ((field15.field50 - field15.field49) * 32.768D / var4);
			var10 = (int) (field15.field49 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field19[var12] != 0) {
				field31[var12] = 0;
				field32[var12] = (int) (field21[var12] * var4);
				field33[var12] = (field19[var12] << 14) / 100;
				field34[var12] = (int) ((field11.field50 - field11.field49) * 32.768D * Math.pow(1.0057929410678534D, field20[var12]) / var4);
				field35[var12] = (int) (field11.field49 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field11.method33(arg0);
			int var15 = field12.method33(arg0);

			if (field13 != null) {
				int var16 = field13.method33(arg0);
				int var17 = field14.method33(arg0);
				var14 += method9(var8, field13.field51, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field15 != null) {
				int var18 = field15.method33(arg0);
				int var19 = field16.method33(arg0);
				var15 = var15 * ((method9(var11, field15.field51, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field19[var20] != 0) {
					int var21 = field32[var20] + var13;
					if (var21 < arg0) {
						field28[var21] += method9(field31[var20], field11.field51, field33[var20] * var15 >> 15);
						field31[var20] += (field34[var20] * var14 >> 16) + field35[var20];
					}
				}
			}
		}

		if (field17 != null) {
			field17.method32();
			field18.method32();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field17.method33(arg0);
				int var27 = field18.method33(arg0);
				int var28;
				if (var24) {
					var28 = ((field17.field50 - field17.field49) * var26 >> 8) + field17.field49;
				} else {
					var28 = ((field17.field50 - field17.field49) * var27 >> 8) + field17.field49;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field28[var25] = 0;
				}
			}
		}

		if (field22 > 0 && field23 > 0) {
			int var29 = (int) (field22 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field28[var30] += field28[var30 - var29] * field23 / 100;
			}
		}

		if (field24.field595[0] > 0 || field24.field595[1] > 0) {
			field25.method32();
			int var31 = field25.method33(arg0 + 1);
			int var32 = field24.method227(var31 / 65536.0F, 0);
			int var33 = field24.method227(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field28[var32 + var34] * (long) FCAOQJWY.field602 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field28[var32 + var34 - var37 - 1] * (long) FCAOQJWY.field600[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field28[var34 - var38 - 1] * (long) FCAOQJWY.field600[1][var38] >> 16);
					}

					field28[var34] = var36;
					var31 = field25.method33(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field28[var32 + var34] * (long) FCAOQJWY.field602 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field28[var32 + var34 - var42 - 1] * (long) FCAOQJWY.field600[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field28[var34 - var43 - 1] * (long) FCAOQJWY.field600[1][var43] >> 16);
						}

						field28[var34] = var41;
						var31 = field25.method33(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field24.method227(var31 / 65536.0F, 0);
					var33 = field24.method227(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field28[var32 + var34 - var45 - 1] * (long) FCAOQJWY.field600[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field28[var34 - var46 - 1] * (long) FCAOQJWY.field600[1][var46] >> 16);
					}

					field28[var34] = var44;
					field25.method33(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field28[var48] < -32768) {
				field28[var48] = -32768;
			}

			if (field28[var48] > 32767) {
				field28[var48] = 32767;
			}
		}

		return field28;
	}

	@ObfuscatedName("ACLAPANL.a(IIII)I")
	public final int method9(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field30[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field29[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("ACLAPANL.a(BLXOUQUKZW;)V")
	public final void method10(XOUQUKZW arg0) {
		field11 = new BJPHZZMM();
		field11.method30(arg0);
		field12 = new BJPHZZMM();
		field12.method30(arg0);
		int var2 = arg0.method521();
		if (var2 != 0) {
			arg0.field1367--;
			field13 = new BJPHZZMM();
			field13.method30(arg0);
			field14 = new BJPHZZMM();
			field14.method30(arg0);
		}

		int var3 = arg0.method521();
		if (var3 != 0) {
			arg0.field1367--;
			field15 = new BJPHZZMM();
			field15.method30(arg0);
			field16 = new BJPHZZMM();
			field16.method30(arg0);
		}

		int var4 = arg0.method521();
		if (var4 != 0) {
			arg0.field1367--;
			field17 = new BJPHZZMM();
			field17.method30(arg0);
			field18 = new BJPHZZMM();
			field18.method30(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method535();
			if (var6 == 0) {
				break;
			}

			field19[var5] = var6;
			field20[var5] = arg0.method534();
			field21[var5] = arg0.method535();
		}

		field22 = arg0.method535();
		field23 = arg0.method535();
		field26 = arg0.method523();
		field27 = arg0.method523();
		field24 = new FCAOQJWY();
		field25 = new BJPHZZMM();
		field24.method228(field25, arg0);
	}
}
