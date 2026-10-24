package deob;

@ObfuscatedName("GCVPDIUI")
public class GCVPDIUI {

	@ObfuscatedName("GCVPDIUI.i")
	public int[] field667 = new int[5];

	@ObfuscatedName("GCVPDIUI.j")
	public int[] field668 = new int[5];

	@ObfuscatedName("GCVPDIUI.k")
	public int[] field669 = new int[5];

	@ObfuscatedName("GCVPDIUI.m")
	public int field671 = 100;

	@ObfuscatedName("GCVPDIUI.p")
	public int field674 = 500;

	@ObfuscatedName("GCVPDIUI.u")
	public static int[] field679 = new int[5];

	@ObfuscatedName("GCVPDIUI.v")
	public static int[] field680 = new int[5];

	@ObfuscatedName("GCVPDIUI.w")
	public static int[] field681 = new int[5];

	@ObfuscatedName("GCVPDIUI.x")
	public static int[] field682 = new int[5];

	@ObfuscatedName("GCVPDIUI.y")
	public static int[] field683 = new int[5];

	@ObfuscatedName("GCVPDIUI.l")
	public int field670;

	@ObfuscatedName("GCVPDIUI.q")
	public int field675;

	@ObfuscatedName("GCVPDIUI.n")
	public GKDFAZFL field672;

	@ObfuscatedName("GCVPDIUI.a")
	public JOBKQXED field659;

	@ObfuscatedName("GCVPDIUI.b")
	public JOBKQXED field660;

	@ObfuscatedName("GCVPDIUI.c")
	public JOBKQXED field661;

	@ObfuscatedName("GCVPDIUI.d")
	public JOBKQXED field662;

	@ObfuscatedName("GCVPDIUI.e")
	public JOBKQXED field663;

	@ObfuscatedName("GCVPDIUI.f")
	public JOBKQXED field664;

	@ObfuscatedName("GCVPDIUI.g")
	public JOBKQXED field665;

	@ObfuscatedName("GCVPDIUI.h")
	public JOBKQXED field666;

	@ObfuscatedName("GCVPDIUI.o")
	public JOBKQXED field673;

	@ObfuscatedName("GCVPDIUI.r")
	public static int[] field676;

	@ObfuscatedName("GCVPDIUI.s")
	public static int[] field677;

	@ObfuscatedName("GCVPDIUI.t")
	public static int[] field678;

	@ObfuscatedName("GCVPDIUI.a()V")
	public static final void method286() {
		field677 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field677[var0] = 1;
			} else {
				field677[var0] = -1;
			}
		}

		field678 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field678[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field676 = new int[220500];
	}

	@ObfuscatedName("GCVPDIUI.a(II)[I")
	public final int[] method287(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field676[var3] = 0;
		}

		if (arg1 < 10) {
			return field676;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field659.method339();
		field660.method339();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field661 != null) {
			field661.method339();
			field662.method339();
			var6 = (int) ((field661.field829 - field661.field828) * 32.768D / var4);
			var7 = (int) (field661.field828 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field663 != null) {
			field663.method339();
			field664.method339();
			var9 = (int) ((field663.field829 - field663.field828) * 32.768D / var4);
			var10 = (int) (field663.field828 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field667[var12] != 0) {
				field679[var12] = 0;
				field680[var12] = (int) (field669[var12] * var4);
				field681[var12] = (field667[var12] << 14) / 100;
				field682[var12] = (int) ((field659.field829 - field659.field828) * 32.768D * Math.pow(1.0057929410678534D, field668[var12]) / var4);
				field683[var12] = (int) (field659.field828 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field659.method340(arg0);
			int var15 = field660.method340(arg0);

			if (field661 != null) {
				int var16 = field661.method340(arg0);
				int var17 = field662.method340(arg0);
				var14 += method288(var17, field661.field830, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field663 != null) {
				int var18 = field663.method340(arg0);
				int var19 = field664.method340(arg0);
				var15 = var15 * ((method288(var19, field663.field830, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field667[var20] != 0) {
					int var21 = field680[var20] + var13;
					if (var21 < arg0) {
						field676[var21] += method288(field681[var20] * var15 >> 15, field659.field830, field679[var20]);
						field679[var20] += (field682[var20] * var14 >> 16) + field683[var20];
					}
				}
			}
		}

		if (field665 != null) {
			field665.method339();
			field666.method339();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field665.method340(arg0);
				int var27 = field666.method340(arg0);
				int var28;
				if (var24) {
					var28 = ((field665.field829 - field665.field828) * var26 >> 8) + field665.field828;
				} else {
					var28 = ((field665.field829 - field665.field828) * var27 >> 8) + field665.field828;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field676[var25] = 0;
				}
			}
		}

		if (field670 > 0 && field671 > 0) {
			int var29 = (int) (field670 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field676[var30] += field676[var30 - var29] * field671 / 100;
			}
		}

		if (field672.field713[0] > 0 || field672.field713[1] > 0) {
			field673.method339();
			int var31 = field673.method340(arg0 + 1);
			int var32 = field672.method293(var31 / 65536.0F, 0);
			int var33 = field672.method293(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field676[var32 + var34] * (long) GKDFAZFL.field720 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field676[var32 + var34 - var37 - 1] * (long) GKDFAZFL.field718[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field676[var34 - var38 - 1] * (long) GKDFAZFL.field718[1][var38] >> 16);
					}

					field676[var34] = var36;
					var31 = field673.method340(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field676[var32 + var34] * (long) GKDFAZFL.field720 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field676[var32 + var34 - var42 - 1] * (long) GKDFAZFL.field718[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field676[var34 - var43 - 1] * (long) GKDFAZFL.field718[1][var43] >> 16);
						}

						field676[var34] = var41;
						var31 = field673.method340(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field672.method293(var31 / 65536.0F, 0);
					var33 = field672.method293(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field676[var32 + var34 - var45 - 1] * (long) GKDFAZFL.field718[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field676[var34 - var46 - 1] * (long) GKDFAZFL.field718[1][var46] >> 16);
					}

					field676[var34] = var44;
					field673.method340(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field676[var48] < -32768) {
				field676[var48] = -32768;
			}

			if (field676[var48] > 32767) {
				field676[var48] = 32767;
			}
		}

		return field676;
	}

	@ObfuscatedName("GCVPDIUI.a(IZII)I")
	public final int method288(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field678[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field677[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("GCVPDIUI.a(LCMGGUSPR;I)V")
	public final void method289(CMGGUSPR arg0) {
		field659 = new JOBKQXED();
		field659.method337(arg0);
		field660 = new JOBKQXED();
		field660.method337(arg0);
		int var2 = arg0.method194();
		if (var2 != 0) {
			arg0.field540--;
			field661 = new JOBKQXED();
			field661.method337(arg0);
			field662 = new JOBKQXED();
			field662.method337(arg0);
		}

		int var3 = arg0.method194();
		if (var3 != 0) {
			arg0.field540--;
			field663 = new JOBKQXED();
			field663.method337(arg0);
			field664 = new JOBKQXED();
			field664.method337(arg0);
		}

		int var4 = arg0.method194();
		if (var4 != 0) {
			arg0.field540--;
			field665 = new JOBKQXED();
			field665.method337(arg0);
			field666 = new JOBKQXED();
			field666.method337(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method208();
			if (var6 == 0) {
				break;
			}

			field667[var5] = var6;
			field668[var5] = arg0.method207();
			field669[var5] = arg0.method208();
		}

		field670 = arg0.method208();
		field671 = arg0.method208();
		field674 = arg0.method196();
		field675 = arg0.method196();
		field672 = new GKDFAZFL();
		field673 = new JOBKQXED();
		field672.method294(arg0, field673);
	}
}
