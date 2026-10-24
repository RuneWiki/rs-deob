package deob;

@ObfuscatedName("LQCMEXCE")
public class LQCMEXCE {

	@ObfuscatedName("LQCMEXCE.j")
	public int[] field981 = new int[5];

	@ObfuscatedName("LQCMEXCE.k")
	public int[] field982 = new int[5];

	@ObfuscatedName("LQCMEXCE.l")
	public int[] field983 = new int[5];

	@ObfuscatedName("LQCMEXCE.n")
	public int field985 = 100;

	@ObfuscatedName("LQCMEXCE.q")
	public int field988 = 500;

	@ObfuscatedName("LQCMEXCE.v")
	public static int[] field993 = new int[5];

	@ObfuscatedName("LQCMEXCE.w")
	public static int[] field994 = new int[5];

	@ObfuscatedName("LQCMEXCE.x")
	public static int[] field995 = new int[5];

	@ObfuscatedName("LQCMEXCE.y")
	public static int[] field996 = new int[5];

	@ObfuscatedName("LQCMEXCE.z")
	public static int[] field997 = new int[5];

	@ObfuscatedName("LQCMEXCE.m")
	public int field984;

	@ObfuscatedName("LQCMEXCE.r")
	public int field989;

	@ObfuscatedName("LQCMEXCE.b")
	public JDDBCSRY field973;

	@ObfuscatedName("LQCMEXCE.c")
	public JDDBCSRY field974;

	@ObfuscatedName("LQCMEXCE.d")
	public JDDBCSRY field975;

	@ObfuscatedName("LQCMEXCE.e")
	public JDDBCSRY field976;

	@ObfuscatedName("LQCMEXCE.f")
	public JDDBCSRY field977;

	@ObfuscatedName("LQCMEXCE.g")
	public JDDBCSRY field978;

	@ObfuscatedName("LQCMEXCE.h")
	public JDDBCSRY field979;

	@ObfuscatedName("LQCMEXCE.i")
	public JDDBCSRY field980;

	@ObfuscatedName("LQCMEXCE.p")
	public JDDBCSRY field987;

	@ObfuscatedName("LQCMEXCE.o")
	public QPCNAGNU field986;

	@ObfuscatedName("LQCMEXCE.s")
	public static int[] field990;

	@ObfuscatedName("LQCMEXCE.t")
	public static int[] field991;

	@ObfuscatedName("LQCMEXCE.u")
	public static int[] field992;

	@ObfuscatedName("LQCMEXCE.a()V")
	public static final void method310() {
		field991 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field991[var0] = 1;
			} else {
				field991[var0] = -1;
			}
		}

		field992 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field992[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field990 = new int[220500];
	}

	@ObfuscatedName("LQCMEXCE.a(II)[I")
	public final int[] method311(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field990[var3] = 0;
		}

		if (arg1 < 10) {
			return field990;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field973.method259();
		field974.method259();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field975 != null) {
			field975.method259();
			field976.method259();
			var6 = (int) ((field975.field819 - field975.field818) * 32.768D / var4);
			var7 = (int) (field975.field818 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field977 != null) {
			field977.method259();
			field978.method259();
			var9 = (int) ((field977.field819 - field977.field818) * 32.768D / var4);
			var10 = (int) (field977.field818 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field981[var12] != 0) {
				field993[var12] = 0;
				field994[var12] = (int) (field983[var12] * var4);
				field995[var12] = (field981[var12] << 14) / 100;
				field996[var12] = (int) ((field973.field819 - field973.field818) * 32.768D * Math.pow(1.0057929410678534D, field982[var12]) / var4);
				field997[var12] = (int) (field973.field818 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field973.method260(arg0);
			int var15 = field974.method260(arg0);

			if (field975 != null) {
				int var16 = field975.method260(arg0);
				int var17 = field976.method260(arg0);
				var14 += method312(field975.field820, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field977 != null) {
				int var18 = field977.method260(arg0);
				int var19 = field978.method260(arg0);
				var15 = var15 * ((method312(field977.field820, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field981[var20] != 0) {
					int var21 = field994[var20] + var13;
					if (var21 < arg0) {
						field990[var21] += method312(field973.field820, field993[var20], field995[var20] * var15 >> 15);
						field993[var20] += (field996[var20] * var14 >> 16) + field997[var20];
					}
				}
			}
		}

		if (field979 != null) {
			field979.method259();
			field980.method259();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field979.method260(arg0);
				int var27 = field980.method260(arg0);
				int var28;
				if (var24) {
					var28 = ((field979.field819 - field979.field818) * var26 >> 8) + field979.field818;
				} else {
					var28 = ((field979.field819 - field979.field818) * var27 >> 8) + field979.field818;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field990[var25] = 0;
				}
			}
		}

		if (field984 > 0 && field985 > 0) {
			int var29 = (int) (field984 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field990[var30] += field990[var30 - var29] * field985 / 100;
			}
		}

		if (field986.field1152[0] > 0 || field986.field1152[1] > 0) {
			field987.method259();
			int var31 = field987.method260(arg0 + 1);
			int var32 = field986.method351(0, var31 / 65536.0F);
			int var33 = field986.method351(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field990[var32 + var34] * (long) QPCNAGNU.field1159 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field990[var32 + var34 - var37 - 1] * (long) QPCNAGNU.field1157[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field990[var34 - var38 - 1] * (long) QPCNAGNU.field1157[1][var38] >> 16);
					}

					field990[var34] = var36;
					var31 = field987.method260(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field990[var32 + var34] * (long) QPCNAGNU.field1159 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field990[var32 + var34 - var42 - 1] * (long) QPCNAGNU.field1157[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field990[var34 - var43 - 1] * (long) QPCNAGNU.field1157[1][var43] >> 16);
						}

						field990[var34] = var41;
						var31 = field987.method260(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field986.method351(0, var31 / 65536.0F);
					var33 = field986.method351(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field990[var32 + var34 - var45 - 1] * (long) QPCNAGNU.field1157[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field990[var34 - var46 - 1] * (long) QPCNAGNU.field1157[1][var46] >> 16);
					}

					field990[var34] = var44;
					field987.method260(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field990[var48] < -32768) {
				field990[var48] = -32768;
			}

			if (field990[var48] > 32767) {
				field990[var48] = 32767;
			}
		}

		return field990;
	}

	@ObfuscatedName("LQCMEXCE.a(IIII)I")
	public final int method312(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return field992[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return field991[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("LQCMEXCE.a(ZLXGRGMPUQ;)V")
	public final void method313(XGRGMPUQ arg0) {
		field973 = new JDDBCSRY();
		field973.method257(arg0);
		field974 = new JDDBCSRY();
		field974.method257(arg0);
		int var2 = arg0.method465();
		if (var2 != 0) {
			arg0.field1432--;
			field975 = new JDDBCSRY();
			field975.method257(arg0);
			field976 = new JDDBCSRY();
			field976.method257(arg0);
		}

		int var3 = arg0.method465();
		if (var3 != 0) {
			arg0.field1432--;
			field977 = new JDDBCSRY();
			field977.method257(arg0);
			field978 = new JDDBCSRY();
			field978.method257(arg0);
		}

		int var4 = arg0.method465();
		if (var4 != 0) {
			arg0.field1432--;
			field979 = new JDDBCSRY();
			field979.method257(arg0);
			field980 = new JDDBCSRY();
			field980.method257(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method479();
			if (var6 == 0) {
				break;
			}

			field981[var5] = var6;
			field982[var5] = arg0.method478();
			field983[var5] = arg0.method479();
		}

		field984 = arg0.method479();
		field985 = arg0.method479();
		field988 = arg0.method467();
		field989 = arg0.method467();
		field986 = new QPCNAGNU();
		field987 = new JDDBCSRY();
		field986.method352(field987, arg0);
	}
}
