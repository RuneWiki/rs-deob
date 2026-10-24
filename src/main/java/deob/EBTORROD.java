package deob;

@ObfuscatedName("EBTORROD")
public class EBTORROD {

	@ObfuscatedName("EBTORROD.k")
	public int[] field735 = new int[5];

	@ObfuscatedName("EBTORROD.l")
	public int[] field736 = new int[5];

	@ObfuscatedName("EBTORROD.m")
	public int[] field737 = new int[5];

	@ObfuscatedName("EBTORROD.o")
	public int field739 = 100;

	@ObfuscatedName("EBTORROD.r")
	public int field742 = 500;

	@ObfuscatedName("EBTORROD.w")
	public static int[] field747 = new int[5];

	@ObfuscatedName("EBTORROD.x")
	public static int[] field748 = new int[5];

	@ObfuscatedName("EBTORROD.y")
	public static int[] field749 = new int[5];

	@ObfuscatedName("EBTORROD.z")
	public static int[] field750 = new int[5];

	@ObfuscatedName("EBTORROD.A")
	public static int[] field751 = new int[5];

	@ObfuscatedName("EBTORROD.n")
	public int field738;

	@ObfuscatedName("EBTORROD.s")
	public int field743;

	@ObfuscatedName("EBTORROD.p")
	public TUODRVGB field740;

	@ObfuscatedName("EBTORROD.c")
	public XCOYGYOS field727;

	@ObfuscatedName("EBTORROD.d")
	public XCOYGYOS field728;

	@ObfuscatedName("EBTORROD.e")
	public XCOYGYOS field729;

	@ObfuscatedName("EBTORROD.f")
	public XCOYGYOS field730;

	@ObfuscatedName("EBTORROD.g")
	public XCOYGYOS field731;

	@ObfuscatedName("EBTORROD.h")
	public XCOYGYOS field732;

	@ObfuscatedName("EBTORROD.i")
	public XCOYGYOS field733;

	@ObfuscatedName("EBTORROD.j")
	public XCOYGYOS field734;

	@ObfuscatedName("EBTORROD.q")
	public XCOYGYOS field741;

	@ObfuscatedName("EBTORROD.t")
	public static int[] field744;

	@ObfuscatedName("EBTORROD.u")
	public static int[] field745;

	@ObfuscatedName("EBTORROD.v")
	public static int[] field746;

	@ObfuscatedName("EBTORROD.a()V")
	public static final void method208() {
		field745 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field745[var0] = 1;
			} else {
				field745[var0] = -1;
			}
		}

		field746 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field746[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field744 = new int[220500];
	}

	@ObfuscatedName("EBTORROD.a(II)[I")
	public final int[] method209(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field744[var3] = 0;
		}

		if (arg1 < 10) {
			return field744;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field727.method456();
		field728.method456();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field729 != null) {
			field729.method456();
			field730.method456();
			var6 = (int) ((field729.field1340 - field729.field1339) * 32.768D / var4);
			var7 = (int) (field729.field1339 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field731 != null) {
			field731.method456();
			field732.method456();
			var9 = (int) ((field731.field1340 - field731.field1339) * 32.768D / var4);
			var10 = (int) (field731.field1339 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field735[var12] != 0) {
				field747[var12] = 0;
				field748[var12] = (int) (field737[var12] * var4);
				field749[var12] = (field735[var12] << 14) / 100;
				field750[var12] = (int) ((field727.field1340 - field727.field1339) * 32.768D * Math.pow(1.0057929410678534D, field736[var12]) / var4);
				field751[var12] = (int) (field727.field1339 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field727.method457(arg0);
			int var15 = field728.method457(arg0);

			if (field729 != null) {
				int var16 = field729.method457(arg0);
				int var17 = field730.method457(arg0);
				var14 += method210(var8, field729.field1341, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field731 != null) {
				int var18 = field731.method457(arg0);
				int var19 = field732.method457(arg0);
				var15 = var15 * ((method210(var11, field731.field1341, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field735[var20] != 0) {
					int var21 = field748[var20] + var13;
					if (var21 < arg0) {
						field744[var21] += method210(field747[var20], field727.field1341, field749[var20] * var15 >> 15);
						field747[var20] += (field750[var20] * var14 >> 16) + field751[var20];
					}
				}
			}
		}

		if (field733 != null) {
			field733.method456();
			field734.method456();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field733.method457(arg0);
				int var27 = field734.method457(arg0);
				int var28;
				if (var24) {
					var28 = ((field733.field1340 - field733.field1339) * var26 >> 8) + field733.field1339;
				} else {
					var28 = ((field733.field1340 - field733.field1339) * var27 >> 8) + field733.field1339;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field744[var25] = 0;
				}
			}
		}

		if (field738 > 0 && field739 > 0) {
			int var29 = (int) (field738 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field744[var30] += field744[var30 - var29] * field739 / 100;
			}
		}

		if (field740.field1266[0] > 0 || field740.field1266[1] > 0) {
			field741.method456();
			int var31 = field741.method457(arg0 + 1);
			int var32 = field740.method446(0, var31 / 65536.0F);
			int var33 = field740.method446(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field744[var32 + var34] * (long) TUODRVGB.field1273 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field744[var32 + var34 - var37 - 1] * (long) TUODRVGB.field1271[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field744[var34 - var38 - 1] * (long) TUODRVGB.field1271[1][var38] >> 16);
					}

					field744[var34] = var36;
					var31 = field741.method457(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field744[var32 + var34] * (long) TUODRVGB.field1273 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field744[var32 + var34 - var42 - 1] * (long) TUODRVGB.field1271[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field744[var34 - var43 - 1] * (long) TUODRVGB.field1271[1][var43] >> 16);
						}

						field744[var34] = var41;
						var31 = field741.method457(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field740.method446(0, var31 / 65536.0F);
					var33 = field740.method446(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field744[var32 + var34 - var45 - 1] * (long) TUODRVGB.field1271[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field744[var34 - var46 - 1] * (long) TUODRVGB.field1271[1][var46] >> 16);
					}

					field744[var34] = var44;
					field741.method457(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field744[var48] < -32768) {
				field744[var48] = -32768;
			}

			if (field744[var48] > 32767) {
				field744[var48] = 32767;
			}
		}

		return field744;
	}

	@ObfuscatedName("EBTORROD.a(IIIB)I")
	public final int method210(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field746[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field745[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("EBTORROD.a(LZOMNSJJM;B)V")
	public final void method211(ZOMNSJJM arg0) {
		field727 = new XCOYGYOS();
		field727.method454(arg0);
		field728 = new XCOYGYOS();
		field728.method454(arg0);
		int var2 = arg0.method547();
		if (var2 != 0) {
			arg0.field1457--;
			field729 = new XCOYGYOS();
			field729.method454(arg0);
			field730 = new XCOYGYOS();
			field730.method454(arg0);
		}

		int var3 = arg0.method547();
		if (var3 != 0) {
			arg0.field1457--;
			field731 = new XCOYGYOS();
			field731.method454(arg0);
			field732 = new XCOYGYOS();
			field732.method454(arg0);
		}

		int var4 = arg0.method547();
		if (var4 != 0) {
			arg0.field1457--;
			field733 = new XCOYGYOS();
			field733.method454(arg0);
			field734 = new XCOYGYOS();
			field734.method454(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method561();
			if (var6 == 0) {
				break;
			}

			field735[var5] = var6;
			field736[var5] = arg0.method560();
			field737[var5] = arg0.method561();
		}

		field738 = arg0.method561();
		field739 = arg0.method561();
		field742 = arg0.method549();
		field743 = arg0.method549();
		field740 = new TUODRVGB();
		field741 = new XCOYGYOS();
		field740.method447(field741, arg0);
	}
}
