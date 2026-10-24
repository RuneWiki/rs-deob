package deob;

@ObfuscatedName("PJPXFVTH")
public class PJPXFVTH {

	@ObfuscatedName("PJPXFVTH.k")
	public int[] field988 = new int[5];

	@ObfuscatedName("PJPXFVTH.l")
	public int[] field989 = new int[5];

	@ObfuscatedName("PJPXFVTH.m")
	public int[] field990 = new int[5];

	@ObfuscatedName("PJPXFVTH.o")
	public int field992 = 100;

	@ObfuscatedName("PJPXFVTH.r")
	public int field995 = 500;

	@ObfuscatedName("PJPXFVTH.w")
	public static int[] field1000 = new int[5];

	@ObfuscatedName("PJPXFVTH.x")
	public static int[] field1001 = new int[5];

	@ObfuscatedName("PJPXFVTH.y")
	public static int[] field1002 = new int[5];

	@ObfuscatedName("PJPXFVTH.z")
	public static int[] field1003 = new int[5];

	@ObfuscatedName("PJPXFVTH.A")
	public static int[] field1004 = new int[5];

	@ObfuscatedName("PJPXFVTH.n")
	public int field991;

	@ObfuscatedName("PJPXFVTH.s")
	public int field996;

	@ObfuscatedName("PJPXFVTH.c")
	public LSSFLBMP field980;

	@ObfuscatedName("PJPXFVTH.d")
	public LSSFLBMP field981;

	@ObfuscatedName("PJPXFVTH.e")
	public LSSFLBMP field982;

	@ObfuscatedName("PJPXFVTH.f")
	public LSSFLBMP field983;

	@ObfuscatedName("PJPXFVTH.g")
	public LSSFLBMP field984;

	@ObfuscatedName("PJPXFVTH.h")
	public LSSFLBMP field985;

	@ObfuscatedName("PJPXFVTH.i")
	public LSSFLBMP field986;

	@ObfuscatedName("PJPXFVTH.j")
	public LSSFLBMP field987;

	@ObfuscatedName("PJPXFVTH.q")
	public LSSFLBMP field994;

	@ObfuscatedName("PJPXFVTH.p")
	public QPYZEWVW field993;

	@ObfuscatedName("PJPXFVTH.t")
	public static int[] field997;

	@ObfuscatedName("PJPXFVTH.u")
	public static int[] field998;

	@ObfuscatedName("PJPXFVTH.v")
	public static int[] field999;

	@ObfuscatedName("PJPXFVTH.a()V")
	public static final void method385() {
		field998 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field998[var0] = 1;
			} else {
				field998[var0] = -1;
			}
		}

		field999 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field999[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field997 = new int[220500];
	}

	@ObfuscatedName("PJPXFVTH.a(II)[I")
	public final int[] method386(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field997[var3] = 0;
		}

		if (arg1 < 10) {
			return field997;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field980.method325();
		field981.method325();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field982 != null) {
			field982.method325();
			field983.method325();
			var6 = (int) ((field982.field821 - field982.field820) * 32.768D / var4);
			var7 = (int) (field982.field820 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field984 != null) {
			field984.method325();
			field985.method325();
			var9 = (int) ((field984.field821 - field984.field820) * 32.768D / var4);
			var10 = (int) (field984.field820 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field988[var12] != 0) {
				field1000[var12] = 0;
				field1001[var12] = (int) (field990[var12] * var4);
				field1002[var12] = (field988[var12] << 14) / 100;
				field1003[var12] = (int) ((field980.field821 - field980.field820) * 32.768D * Math.pow(1.0057929410678534D, field989[var12]) / var4);
				field1004[var12] = (int) (field980.field820 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field980.method326(arg0);
			int var15 = field981.method326(arg0);

			if (field982 != null) {
				int var16 = field982.method326(arg0);
				int var17 = field983.method326(arg0);
				var14 += method387(field982.field822, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field984 != null) {
				int var18 = field984.method326(arg0);
				int var19 = field985.method326(arg0);
				var15 = var15 * ((method387(field984.field822, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field988[var20] != 0) {
					int var21 = field1001[var20] + var13;
					if (var21 < arg0) {
						field997[var21] += method387(field980.field822, field1002[var20] * var15 >> 15, field1000[var20]);
						field1000[var20] += (field1003[var20] * var14 >> 16) + field1004[var20];
					}
				}
			}
		}

		if (field986 != null) {
			field986.method325();
			field987.method325();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field986.method326(arg0);
				int var27 = field987.method326(arg0);
				int var28;
				if (var24) {
					var28 = ((field986.field821 - field986.field820) * var26 >> 8) + field986.field820;
				} else {
					var28 = ((field986.field821 - field986.field820) * var27 >> 8) + field986.field820;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field997[var25] = 0;
				}
			}
		}

		if (field991 > 0 && field992 > 0) {
			int var29 = (int) (field991 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field997[var30] += field997[var30 - var29] * field992 / 100;
			}
		}

		if (field993.field1045[0] > 0 || field993.field1045[1] > 0) {
			field994.method325();
			int var31 = field994.method326(arg0 + 1);
			int var32 = field993.method395(var31 / 65536.0F, 0);
			int var33 = field993.method395(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field997[var32 + var34] * (long) QPYZEWVW.field1052 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field997[var32 + var34 - var37 - 1] * (long) QPYZEWVW.field1050[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field997[var34 - var38 - 1] * (long) QPYZEWVW.field1050[1][var38] >> 16);
					}

					field997[var34] = var36;
					var31 = field994.method326(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field997[var32 + var34] * (long) QPYZEWVW.field1052 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field997[var32 + var34 - var42 - 1] * (long) QPYZEWVW.field1050[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field997[var34 - var43 - 1] * (long) QPYZEWVW.field1050[1][var43] >> 16);
						}

						field997[var34] = var41;
						var31 = field994.method326(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field993.method395(var31 / 65536.0F, 0);
					var33 = field993.method395(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field997[var32 + var34 - var45 - 1] * (long) QPYZEWVW.field1050[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field997[var34 - var46 - 1] * (long) QPYZEWVW.field1050[1][var46] >> 16);
					}

					field997[var34] = var44;
					field994.method326(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field997[var48] < -32768) {
				field997[var48] = -32768;
			}

			if (field997[var48] > 32767) {
				field997[var48] = 32767;
			}
		}

		return field997;
	}

	@ObfuscatedName("PJPXFVTH.a(IIII)I")
	public final int method387(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field999[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field998[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("PJPXFVTH.a(ILWNCFPLWV;)V")
	public final void method388(WNCFPLWV arg0) {
		field980 = new LSSFLBMP();
		field980.method323(arg0);
		field981 = new LSSFLBMP();
		field981.method323(arg0);
		int var2 = arg0.method502();
		if (var2 != 0) {
			arg0.field1375--;
			field982 = new LSSFLBMP();
			field982.method323(arg0);
			field983 = new LSSFLBMP();
			field983.method323(arg0);
		}

		int var3 = arg0.method502();
		if (var3 != 0) {
			arg0.field1375--;
			field984 = new LSSFLBMP();
			field984.method323(arg0);
			field985 = new LSSFLBMP();
			field985.method323(arg0);
		}

		int var4 = arg0.method502();
		if (var4 != 0) {
			arg0.field1375--;
			field986 = new LSSFLBMP();
			field986.method323(arg0);
			field987 = new LSSFLBMP();
			field987.method323(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method516();
			if (var6 == 0) {
				break;
			}

			field988[var5] = var6;
			field989[var5] = arg0.method515();
			field990[var5] = arg0.method516();
		}

		field991 = arg0.method516();
		field992 = arg0.method516();
		field995 = arg0.method504();
		field996 = arg0.method504();
		field993 = new QPYZEWVW();
		field994 = new LSSFLBMP();
		field993.method396(field994, arg0);
	}
}
