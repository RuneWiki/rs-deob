package deob;

@ObfuscatedName("IRCSYKHE")
public class IRCSYKHE {

	@ObfuscatedName("IRCSYKHE.j")
	public int[] field759 = new int[5];

	@ObfuscatedName("IRCSYKHE.k")
	public int[] field760 = new int[5];

	@ObfuscatedName("IRCSYKHE.l")
	public int[] field761 = new int[5];

	@ObfuscatedName("IRCSYKHE.n")
	public int field763 = 100;

	@ObfuscatedName("IRCSYKHE.q")
	public int field766 = 500;

	@ObfuscatedName("IRCSYKHE.v")
	public static int[] field771 = new int[5];

	@ObfuscatedName("IRCSYKHE.w")
	public static int[] field772 = new int[5];

	@ObfuscatedName("IRCSYKHE.x")
	public static int[] field773 = new int[5];

	@ObfuscatedName("IRCSYKHE.y")
	public static int[] field774 = new int[5];

	@ObfuscatedName("IRCSYKHE.z")
	public static int[] field775 = new int[5];

	@ObfuscatedName("IRCSYKHE.m")
	public int field762;

	@ObfuscatedName("IRCSYKHE.r")
	public int field767;

	@ObfuscatedName("IRCSYKHE.o")
	public OKKLRABS field764;

	@ObfuscatedName("IRCSYKHE.b")
	public XJOITHUI field751;

	@ObfuscatedName("IRCSYKHE.c")
	public XJOITHUI field752;

	@ObfuscatedName("IRCSYKHE.d")
	public XJOITHUI field753;

	@ObfuscatedName("IRCSYKHE.e")
	public XJOITHUI field754;

	@ObfuscatedName("IRCSYKHE.f")
	public XJOITHUI field755;

	@ObfuscatedName("IRCSYKHE.g")
	public XJOITHUI field756;

	@ObfuscatedName("IRCSYKHE.h")
	public XJOITHUI field757;

	@ObfuscatedName("IRCSYKHE.i")
	public XJOITHUI field758;

	@ObfuscatedName("IRCSYKHE.p")
	public XJOITHUI field765;

	@ObfuscatedName("IRCSYKHE.s")
	public static int[] field768;

	@ObfuscatedName("IRCSYKHE.t")
	public static int[] field769;

	@ObfuscatedName("IRCSYKHE.u")
	public static int[] field770;

	@ObfuscatedName("IRCSYKHE.a()V")
	public static final void method311() {
		field769 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field769[var0] = 1;
			} else {
				field769[var0] = -1;
			}
		}

		field770 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field770[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field768 = new int[220500];
	}

	@ObfuscatedName("IRCSYKHE.a(II)[I")
	public final int[] method312(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field768[var3] = 0;
		}

		if (arg1 < 10) {
			return field768;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field751.method540();
		field752.method540();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field753 != null) {
			field753.method540();
			field754.method540();
			var6 = (int) ((field753.field1431 - field753.field1430) * 32.768D / var4);
			var7 = (int) (field753.field1430 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field755 != null) {
			field755.method540();
			field756.method540();
			var9 = (int) ((field755.field1431 - field755.field1430) * 32.768D / var4);
			var10 = (int) (field755.field1430 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field759[var12] != 0) {
				field771[var12] = 0;
				field772[var12] = (int) (field761[var12] * var4);
				field773[var12] = (field759[var12] << 14) / 100;
				field774[var12] = (int) ((field751.field1431 - field751.field1430) * 32.768D * Math.pow(1.0057929410678534D, field760[var12]) / var4);
				field775[var12] = (int) (field751.field1430 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field751.method541(arg0);
			int var15 = field752.method541(arg0);

			if (field753 != null) {
				int var16 = field753.method541(arg0);
				int var17 = field754.method541(arg0);
				var14 += method313(var8, field753.field1432, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field755 != null) {
				int var18 = field755.method541(arg0);
				int var19 = field756.method541(arg0);
				var15 = var15 * ((method313(var11, field755.field1432, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field759[var20] != 0) {
					int var21 = field772[var20] + var13;
					if (var21 < arg0) {
						field768[var21] += method313(field771[var20], field751.field1432, field773[var20] * var15 >> 15);
						field771[var20] += (field774[var20] * var14 >> 16) + field775[var20];
					}
				}
			}
		}

		if (field757 != null) {
			field757.method540();
			field758.method540();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field757.method541(arg0);
				int var27 = field758.method541(arg0);
				int var28;
				if (var24) {
					var28 = ((field757.field1431 - field757.field1430) * var26 >> 8) + field757.field1430;
				} else {
					var28 = ((field757.field1431 - field757.field1430) * var27 >> 8) + field757.field1430;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field768[var25] = 0;
				}
			}
		}

		if (field762 > 0 && field763 > 0) {
			int var29 = (int) (field762 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field768[var30] += field768[var30 - var29] * field763 / 100;
			}
		}

		if (field764.field1143[0] > 0 || field764.field1143[1] > 0) {
			field765.method540();
			int var31 = field765.method541(arg0 + 1);
			int var32 = field764.method454(var31 / 65536.0F, 0);
			int var33 = field764.method454(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field768[var32 + var34] * (long) OKKLRABS.field1150 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field768[var32 + var34 - var37 - 1] * (long) OKKLRABS.field1148[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field768[var34 - var38 - 1] * (long) OKKLRABS.field1148[1][var38] >> 16);
					}

					field768[var34] = var36;
					var31 = field765.method541(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field768[var32 + var34] * (long) OKKLRABS.field1150 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field768[var32 + var34 - var42 - 1] * (long) OKKLRABS.field1148[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field768[var34 - var43 - 1] * (long) OKKLRABS.field1148[1][var43] >> 16);
						}

						field768[var34] = var41;
						var31 = field765.method541(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field764.method454(var31 / 65536.0F, 0);
					var33 = field764.method454(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field768[var32 + var34 - var45 - 1] * (long) OKKLRABS.field1148[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field768[var34 - var46 - 1] * (long) OKKLRABS.field1148[1][var46] >> 16);
					}

					field768[var34] = var44;
					field765.method541(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field768[var48] < -32768) {
				field768[var48] = -32768;
			}

			if (field768[var48] > 32767) {
				field768[var48] = 32767;
			}
		}

		return field768;
	}

	@ObfuscatedName("IRCSYKHE.a(IIII)I")
	public final int method313(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field770[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field769[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("IRCSYKHE.a(ILBJPWOXRJ;)V")
	public final void method314(BJPWOXRJ arg0) {
		field751 = new XJOITHUI();
		field751.method538(arg0);
		field752 = new XJOITHUI();
		field752.method538(arg0);
		int var2 = arg0.method15();
		if (var2 != 0) {
			arg0.field5--;
			field753 = new XJOITHUI();
			field753.method538(arg0);
			field754 = new XJOITHUI();
			field754.method538(arg0);
		}

		int var3 = arg0.method15();
		if (var3 != 0) {
			arg0.field5--;
			field755 = new XJOITHUI();
			field755.method538(arg0);
			field756 = new XJOITHUI();
			field756.method538(arg0);
		}

		int var4 = arg0.method15();
		if (var4 != 0) {
			arg0.field5--;
			field757 = new XJOITHUI();
			field757.method538(arg0);
			field758 = new XJOITHUI();
			field758.method538(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method29();
			if (var6 == 0) {
				break;
			}

			field759[var5] = var6;
			field760[var5] = arg0.method28();
			field761[var5] = arg0.method29();
		}

		field762 = arg0.method29();
		field763 = arg0.method29();
		field766 = arg0.method17();
		field767 = arg0.method17();
		field764 = new OKKLRABS();
		field765 = new XJOITHUI();
		field764.method455(arg0, field765);
	}
}
