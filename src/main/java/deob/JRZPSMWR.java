package deob;

@ObfuscatedName("JRZPSMWR")
public class JRZPSMWR {

	@ObfuscatedName("JRZPSMWR.j")
	public int[] field796 = new int[5];

	@ObfuscatedName("JRZPSMWR.k")
	public int[] field797 = new int[5];

	@ObfuscatedName("JRZPSMWR.l")
	public int[] field798 = new int[5];

	@ObfuscatedName("JRZPSMWR.n")
	public int field800 = 100;

	@ObfuscatedName("JRZPSMWR.q")
	public int field803 = 500;

	@ObfuscatedName("JRZPSMWR.v")
	public static int[] field808 = new int[5];

	@ObfuscatedName("JRZPSMWR.w")
	public static int[] field809 = new int[5];

	@ObfuscatedName("JRZPSMWR.x")
	public static int[] field810 = new int[5];

	@ObfuscatedName("JRZPSMWR.y")
	public static int[] field811 = new int[5];

	@ObfuscatedName("JRZPSMWR.z")
	public static int[] field812 = new int[5];

	@ObfuscatedName("JRZPSMWR.m")
	public int field799;

	@ObfuscatedName("JRZPSMWR.r")
	public int field804;

	@ObfuscatedName("JRZPSMWR.b")
	public ISLGIOFS field788;

	@ObfuscatedName("JRZPSMWR.c")
	public ISLGIOFS field789;

	@ObfuscatedName("JRZPSMWR.d")
	public ISLGIOFS field790;

	@ObfuscatedName("JRZPSMWR.e")
	public ISLGIOFS field791;

	@ObfuscatedName("JRZPSMWR.f")
	public ISLGIOFS field792;

	@ObfuscatedName("JRZPSMWR.g")
	public ISLGIOFS field793;

	@ObfuscatedName("JRZPSMWR.h")
	public ISLGIOFS field794;

	@ObfuscatedName("JRZPSMWR.i")
	public ISLGIOFS field795;

	@ObfuscatedName("JRZPSMWR.p")
	public ISLGIOFS field802;

	@ObfuscatedName("JRZPSMWR.o")
	public QMCMKVTF field801;

	@ObfuscatedName("JRZPSMWR.s")
	public static int[] field805;

	@ObfuscatedName("JRZPSMWR.t")
	public static int[] field806;

	@ObfuscatedName("JRZPSMWR.u")
	public static int[] field807;

	@ObfuscatedName("JRZPSMWR.a()V")
	public static final void method300() {
		field806 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field806[var0] = 1;
			} else {
				field806[var0] = -1;
			}
		}

		field807 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field807[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field805 = new int[220500];
	}

	@ObfuscatedName("JRZPSMWR.a(II)[I")
	public final int[] method301(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field805[var3] = 0;
		}

		if (arg1 < 10) {
			return field805;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field788.method297();
		field789.method297();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field790 != null) {
			field790.method297();
			field791.method297();
			var6 = (int) ((field790.field752 - field790.field751) * 32.768D / var4);
			var7 = (int) (field790.field751 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field792 != null) {
			field792.method297();
			field793.method297();
			var9 = (int) ((field792.field752 - field792.field751) * 32.768D / var4);
			var10 = (int) (field792.field751 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field796[var12] != 0) {
				field808[var12] = 0;
				field809[var12] = (int) (field798[var12] * var4);
				field810[var12] = (field796[var12] << 14) / 100;
				field811[var12] = (int) ((field788.field752 - field788.field751) * 32.768D * Math.pow(1.0057929410678534D, field797[var12]) / var4);
				field812[var12] = (int) (field788.field751 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field788.method298(arg0);
			int var15 = field789.method298(arg0);

			if (field790 != null) {
				int var16 = field790.method298(arg0);
				int var17 = field791.method298(arg0);
				var14 += method302(var17, field790.field753, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field792 != null) {
				int var18 = field792.method298(arg0);
				int var19 = field793.method298(arg0);
				var15 = var15 * ((method302(var19, field792.field753, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field796[var20] != 0) {
					int var21 = field809[var20] + var13;
					if (var21 < arg0) {
						field805[var21] += method302(field810[var20] * var15 >> 15, field788.field753, field808[var20]);
						field808[var20] += (field811[var20] * var14 >> 16) + field812[var20];
					}
				}
			}
		}

		if (field794 != null) {
			field794.method297();
			field795.method297();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field794.method298(arg0);
				int var27 = field795.method298(arg0);
				int var28;
				if (var24) {
					var28 = ((field794.field752 - field794.field751) * var26 >> 8) + field794.field751;
				} else {
					var28 = ((field794.field752 - field794.field751) * var27 >> 8) + field794.field751;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field805[var25] = 0;
				}
			}
		}

		if (field799 > 0 && field800 > 0) {
			int var29 = (int) (field799 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field805[var30] += field805[var30 - var29] * field800 / 100;
			}
		}

		if (field801.field1023[0] > 0 || field801.field1023[1] > 0) {
			field802.method297();
			int var31 = field802.method298(arg0 + 1);
			int var32 = field801.method371(0, var31 / 65536.0F);
			int var33 = field801.method371(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field805[var32 + var34] * (long) QMCMKVTF.field1030 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field805[var32 + var34 - var37 - 1] * (long) QMCMKVTF.field1028[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field805[var34 - var38 - 1] * (long) QMCMKVTF.field1028[1][var38] >> 16);
					}

					field805[var34] = var36;
					var31 = field802.method298(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field805[var32 + var34] * (long) QMCMKVTF.field1030 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field805[var32 + var34 - var42 - 1] * (long) QMCMKVTF.field1028[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field805[var34 - var43 - 1] * (long) QMCMKVTF.field1028[1][var43] >> 16);
						}

						field805[var34] = var41;
						var31 = field802.method298(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field801.method371(0, var31 / 65536.0F);
					var33 = field801.method371(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field805[var32 + var34 - var45 - 1] * (long) QMCMKVTF.field1028[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field805[var34 - var46 - 1] * (long) QMCMKVTF.field1028[1][var46] >> 16);
					}

					field805[var34] = var44;
					field802.method298(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field805[var48] < -32768) {
				field805[var48] = -32768;
			}

			if (field805[var48] > 32767) {
				field805[var48] = 32767;
			}
		}

		return field805;
	}

	@ObfuscatedName("JRZPSMWR.a(IIIZ)I")
	public final int method302(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field807[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field806[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("JRZPSMWR.a(ILEMWAMCXW;)V")
	public final void method303(EMWAMCXW arg0) {
		field788 = new ISLGIOFS();
		field788.method295(arg0);
		field789 = new ISLGIOFS();
		field789.method295(arg0);
		int var2 = arg0.method217();
		if (var2 != 0) {
			arg0.field617--;
			field790 = new ISLGIOFS();
			field790.method295(arg0);
			field791 = new ISLGIOFS();
			field791.method295(arg0);
		}

		int var3 = arg0.method217();
		if (var3 != 0) {
			arg0.field617--;
			field792 = new ISLGIOFS();
			field792.method295(arg0);
			field793 = new ISLGIOFS();
			field793.method295(arg0);
		}

		int var4 = arg0.method217();
		if (var4 != 0) {
			arg0.field617--;
			field794 = new ISLGIOFS();
			field794.method295(arg0);
			field795 = new ISLGIOFS();
			field795.method295(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method231();
			if (var6 == 0) {
				break;
			}

			field796[var5] = var6;
			field797[var5] = arg0.method230();
			field798[var5] = arg0.method231();
		}

		field799 = arg0.method231();
		field800 = arg0.method231();
		field803 = arg0.method219();
		field804 = arg0.method219();
		field801 = new QMCMKVTF();
		field802 = new ISLGIOFS();
		field801.method372(arg0, field802);
	}
}
