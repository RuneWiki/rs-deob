package deob;

@ObfuscatedName("KWOZHDOE")
public class KWOZHDOE {

	@ObfuscatedName("KWOZHDOE.k")
	public int[] field920 = new int[5];

	@ObfuscatedName("KWOZHDOE.l")
	public int[] field921 = new int[5];

	@ObfuscatedName("KWOZHDOE.m")
	public int[] field922 = new int[5];

	@ObfuscatedName("KWOZHDOE.o")
	public int field924 = 100;

	@ObfuscatedName("KWOZHDOE.r")
	public int field927 = 500;

	@ObfuscatedName("KWOZHDOE.w")
	public static int[] field932 = new int[5];

	@ObfuscatedName("KWOZHDOE.x")
	public static int[] field933 = new int[5];

	@ObfuscatedName("KWOZHDOE.y")
	public static int[] field934 = new int[5];

	@ObfuscatedName("KWOZHDOE.z")
	public static int[] field935 = new int[5];

	@ObfuscatedName("KWOZHDOE.A")
	public static int[] field936 = new int[5];

	@ObfuscatedName("KWOZHDOE.n")
	public int field923;

	@ObfuscatedName("KWOZHDOE.s")
	public int field928;

	@ObfuscatedName("KWOZHDOE.p")
	public BMQRLUHC field925;

	@ObfuscatedName("KWOZHDOE.c")
	public YJSRODCC field912;

	@ObfuscatedName("KWOZHDOE.d")
	public YJSRODCC field913;

	@ObfuscatedName("KWOZHDOE.e")
	public YJSRODCC field914;

	@ObfuscatedName("KWOZHDOE.f")
	public YJSRODCC field915;

	@ObfuscatedName("KWOZHDOE.g")
	public YJSRODCC field916;

	@ObfuscatedName("KWOZHDOE.h")
	public YJSRODCC field917;

	@ObfuscatedName("KWOZHDOE.i")
	public YJSRODCC field918;

	@ObfuscatedName("KWOZHDOE.j")
	public YJSRODCC field919;

	@ObfuscatedName("KWOZHDOE.q")
	public YJSRODCC field926;

	@ObfuscatedName("KWOZHDOE.t")
	public static int[] field929;

	@ObfuscatedName("KWOZHDOE.u")
	public static int[] field930;

	@ObfuscatedName("KWOZHDOE.v")
	public static int[] field931;

	@ObfuscatedName("KWOZHDOE.a()V")
	public static final void method373() {
		field930 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field930[var0] = 1;
			} else {
				field930[var0] = -1;
			}
		}

		field931 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field931[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field929 = new int[220500];
	}

	@ObfuscatedName("KWOZHDOE.a(II)[I")
	public final int[] method374(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field929[var3] = 0;
		}

		if (arg1 < 10) {
			return field929;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field912.method573();
		field913.method573();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field914 != null) {
			field914.method573();
			field915.method573();
			var6 = (int) ((field914.field1408 - field914.field1407) * 32.768D / var4);
			var7 = (int) (field914.field1407 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field916 != null) {
			field916.method573();
			field917.method573();
			var9 = (int) ((field916.field1408 - field916.field1407) * 32.768D / var4);
			var10 = (int) (field916.field1407 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field920[var12] != 0) {
				field932[var12] = 0;
				field933[var12] = (int) (field922[var12] * var4);
				field934[var12] = (field920[var12] << 14) / 100;
				field935[var12] = (int) ((field912.field1408 - field912.field1407) * 32.768D * Math.pow(1.0057929410678534D, field921[var12]) / var4);
				field936[var12] = (int) (field912.field1407 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field912.method574(arg0);
			int var15 = field913.method574(arg0);

			if (field914 != null) {
				int var16 = field914.method574(arg0);
				int var17 = field915.method574(arg0);
				var14 += method375(field914.field1409, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field916 != null) {
				int var18 = field916.method574(arg0);
				int var19 = field917.method574(arg0);
				var15 = var15 * ((method375(field916.field1409, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field920[var20] != 0) {
					int var21 = field933[var20] + var13;
					if (var21 < arg0) {
						field929[var21] += method375(field912.field1409, field934[var20] * var15 >> 15, field932[var20]);
						field932[var20] += (field935[var20] * var14 >> 16) + field936[var20];
					}
				}
			}
		}

		if (field918 != null) {
			field918.method573();
			field919.method573();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field918.method574(arg0);
				int var27 = field919.method574(arg0);
				int var28;
				if (var24) {
					var28 = ((field918.field1408 - field918.field1407) * var26 >> 8) + field918.field1407;
				} else {
					var28 = ((field918.field1408 - field918.field1407) * var27 >> 8) + field918.field1407;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field929[var25] = 0;
				}
			}
		}

		if (field923 > 0 && field924 > 0) {
			int var29 = (int) (field923 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field929[var30] += field929[var30 - var29] * field924 / 100;
			}
		}

		if (field925.field21[0] > 0 || field925.field21[1] > 0) {
			field926.method573();
			int var31 = field926.method574(arg0 + 1);
			int var32 = field925.method58(var31 / 65536.0F, 0);
			int var33 = field925.method58(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field929[var32 + var34] * (long) BMQRLUHC.field28 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field929[var32 + var34 - var37 - 1] * (long) BMQRLUHC.field26[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field929[var34 - var38 - 1] * (long) BMQRLUHC.field26[1][var38] >> 16);
					}

					field929[var34] = var36;
					var31 = field926.method574(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field929[var32 + var34] * (long) BMQRLUHC.field28 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field929[var32 + var34 - var42 - 1] * (long) BMQRLUHC.field26[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field929[var34 - var43 - 1] * (long) BMQRLUHC.field26[1][var43] >> 16);
						}

						field929[var34] = var41;
						var31 = field926.method574(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field925.method58(var31 / 65536.0F, 0);
					var33 = field925.method58(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field929[var32 + var34 - var45 - 1] * (long) BMQRLUHC.field26[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field929[var34 - var46 - 1] * (long) BMQRLUHC.field26[1][var46] >> 16);
					}

					field929[var34] = var44;
					field926.method574(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field929[var48] < -32768) {
				field929[var48] = -32768;
			}

			if (field929[var48] > 32767) {
				field929[var48] = 32767;
			}
		}

		return field929;
	}

	@ObfuscatedName("KWOZHDOE.a(IIII)I")
	public final int method375(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field931[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field930[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("KWOZHDOE.a(LPGNBHFUF;I)V")
	public final void method376(PGNBHFUF arg0) {
		field912 = new YJSRODCC();
		field912.method571(arg0);
		field913 = new YJSRODCC();
		field913.method571(arg0);
		int var2 = arg0.method420();
		if (var2 != 0) {
			arg0.field1082--;
			field914 = new YJSRODCC();
			field914.method571(arg0);
			field915 = new YJSRODCC();
			field915.method571(arg0);
		}

		int var3 = arg0.method420();
		if (var3 != 0) {
			arg0.field1082--;
			field916 = new YJSRODCC();
			field916.method571(arg0);
			field917 = new YJSRODCC();
			field917.method571(arg0);
		}

		int var4 = arg0.method420();
		if (var4 != 0) {
			arg0.field1082--;
			field918 = new YJSRODCC();
			field918.method571(arg0);
			field919 = new YJSRODCC();
			field919.method571(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method434();
			if (var6 == 0) {
				break;
			}

			field920[var5] = var6;
			field921[var5] = arg0.method433();
			field922[var5] = arg0.method434();
		}

		field923 = arg0.method434();
		field924 = arg0.method434();
		field927 = arg0.method422();
		field928 = arg0.method422();
		field925 = new BMQRLUHC();
		field926 = new YJSRODCC();
		field925.method59(arg0, field926);
	}
}
