package deob;

@ObfuscatedName("QGBENKJV")
public class QGBENKJV {

	@ObfuscatedName("QGBENKJV.k")
	public int[] field865 = new int[5];

	@ObfuscatedName("QGBENKJV.l")
	public int[] field866 = new int[5];

	@ObfuscatedName("QGBENKJV.m")
	public int[] field867 = new int[5];

	@ObfuscatedName("QGBENKJV.o")
	public int field869 = 100;

	@ObfuscatedName("QGBENKJV.r")
	public int field872 = 500;

	@ObfuscatedName("QGBENKJV.w")
	public static int[] field877 = new int[5];

	@ObfuscatedName("QGBENKJV.x")
	public static int[] field878 = new int[5];

	@ObfuscatedName("QGBENKJV.y")
	public static int[] field879 = new int[5];

	@ObfuscatedName("QGBENKJV.z")
	public static int[] field880 = new int[5];

	@ObfuscatedName("QGBENKJV.A")
	public static int[] field881 = new int[5];

	@ObfuscatedName("QGBENKJV.n")
	public int field868;

	@ObfuscatedName("QGBENKJV.s")
	public int field873;

	@ObfuscatedName("QGBENKJV.p")
	public KVKPXLHS field870;

	@ObfuscatedName("QGBENKJV.c")
	public RPKBYPNF field857;

	@ObfuscatedName("QGBENKJV.d")
	public RPKBYPNF field858;

	@ObfuscatedName("QGBENKJV.e")
	public RPKBYPNF field859;

	@ObfuscatedName("QGBENKJV.f")
	public RPKBYPNF field860;

	@ObfuscatedName("QGBENKJV.g")
	public RPKBYPNF field861;

	@ObfuscatedName("QGBENKJV.h")
	public RPKBYPNF field862;

	@ObfuscatedName("QGBENKJV.i")
	public RPKBYPNF field863;

	@ObfuscatedName("QGBENKJV.j")
	public RPKBYPNF field864;

	@ObfuscatedName("QGBENKJV.q")
	public RPKBYPNF field871;

	@ObfuscatedName("QGBENKJV.t")
	public static int[] field874;

	@ObfuscatedName("QGBENKJV.u")
	public static int[] field875;

	@ObfuscatedName("QGBENKJV.v")
	public static int[] field876;

	@ObfuscatedName("QGBENKJV.a()V")
	public static final void method381() {
		field875 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field875[var0] = 1;
			} else {
				field875[var0] = -1;
			}
		}

		field876 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field876[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field874 = new int[220500];
	}

	@ObfuscatedName("QGBENKJV.a(II)[I")
	public final int[] method382(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field874[var3] = 0;
		}

		if (arg1 < 10) {
			return field874;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field857.method475();
		field858.method475();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field859 != null) {
			field859.method475();
			field860.method475();
			var6 = (int) ((field859.field987 - field859.field986) * 32.768D / var4);
			var7 = (int) (field859.field986 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field861 != null) {
			field861.method475();
			field862.method475();
			var9 = (int) ((field861.field987 - field861.field986) * 32.768D / var4);
			var10 = (int) (field861.field986 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field865[var12] != 0) {
				field877[var12] = 0;
				field878[var12] = (int) (field867[var12] * var4);
				field879[var12] = (field865[var12] << 14) / 100;
				field880[var12] = (int) ((field857.field987 - field857.field986) * 32.768D * Math.pow(1.0057929410678534D, field866[var12]) / var4);
				field881[var12] = (int) (field857.field986 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field857.method476(arg0);
			int var15 = field858.method476(arg0);

			if (field859 != null) {
				int var16 = field859.method476(arg0);
				int var17 = field860.method476(arg0);
				var14 += method383(field859.field988, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field861 != null) {
				int var18 = field861.method476(arg0);
				int var19 = field862.method476(arg0);
				var15 = var15 * ((method383(field861.field988, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field865[var20] != 0) {
					int var21 = field878[var20] + var13;
					if (var21 < arg0) {
						field874[var21] += method383(field857.field988, field877[var20], field879[var20] * var15 >> 15);
						field877[var20] += (field880[var20] * var14 >> 16) + field881[var20];
					}
				}
			}
		}

		if (field863 != null) {
			field863.method475();
			field864.method475();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field863.method476(arg0);
				int var27 = field864.method476(arg0);
				int var28;
				if (var24) {
					var28 = ((field863.field987 - field863.field986) * var26 >> 8) + field863.field986;
				} else {
					var28 = ((field863.field987 - field863.field986) * var27 >> 8) + field863.field986;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field874[var25] = 0;
				}
			}
		}

		if (field868 > 0 && field869 > 0) {
			int var29 = (int) (field868 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field874[var30] += field874[var30 - var29] * field869 / 100;
			}
		}

		if (field870.field725[0] > 0 || field870.field725[1] > 0) {
			field871.method475();
			int var31 = field871.method476(arg0 + 1);
			int var32 = field870.method268(0, var31 / 65536.0F);
			int var33 = field870.method268(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field874[var32 + var34] * (long) KVKPXLHS.field732 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field874[var32 + var34 - var37 - 1] * (long) KVKPXLHS.field730[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field874[var34 - var38 - 1] * (long) KVKPXLHS.field730[1][var38] >> 16);
					}

					field874[var34] = var36;
					var31 = field871.method476(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field874[var32 + var34] * (long) KVKPXLHS.field732 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field874[var32 + var34 - var42 - 1] * (long) KVKPXLHS.field730[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field874[var34 - var43 - 1] * (long) KVKPXLHS.field730[1][var43] >> 16);
						}

						field874[var34] = var41;
						var31 = field871.method476(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field870.method268(0, var31 / 65536.0F);
					var33 = field870.method268(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field874[var32 + var34 - var45 - 1] * (long) KVKPXLHS.field730[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field874[var34 - var46 - 1] * (long) KVKPXLHS.field730[1][var46] >> 16);
					}

					field874[var34] = var44;
					field871.method476(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field874[var48] < -32768) {
				field874[var48] = -32768;
			}

			if (field874[var48] > 32767) {
				field874[var48] = 32767;
			}
		}

		return field874;
	}

	@ObfuscatedName("QGBENKJV.a(IBII)I")
	public final int method383(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return field876[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return field875[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("QGBENKJV.a(LMQZHAILV;I)V")
	public final void method384(MQZHAILV arg0) {
		field857 = new RPKBYPNF();
		field857.method473(arg0);
		field858 = new RPKBYPNF();
		field858.method473(arg0);
		int var2 = arg0.method325();
		if (var2 != 0) {
			arg0.field797--;
			field859 = new RPKBYPNF();
			field859.method473(arg0);
			field860 = new RPKBYPNF();
			field860.method473(arg0);
		}

		int var3 = arg0.method325();
		if (var3 != 0) {
			arg0.field797--;
			field861 = new RPKBYPNF();
			field861.method473(arg0);
			field862 = new RPKBYPNF();
			field862.method473(arg0);
		}

		int var4 = arg0.method325();
		if (var4 != 0) {
			arg0.field797--;
			field863 = new RPKBYPNF();
			field863.method473(arg0);
			field864 = new RPKBYPNF();
			field864.method473(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method339();
			if (var6 == 0) {
				break;
			}

			field865[var5] = var6;
			field866[var5] = arg0.method338();
			field867[var5] = arg0.method339();
		}

		field868 = arg0.method339();
		field869 = arg0.method339();
		field872 = arg0.method327();
		field873 = arg0.method327();
		field870 = new KVKPXLHS();
		field871 = new RPKBYPNF();
		field870.method269(field871, arg0);
	}
}
