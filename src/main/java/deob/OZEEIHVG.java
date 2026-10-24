package deob;

@ObfuscatedName("OZEEIHVG")
public class OZEEIHVG {

	@ObfuscatedName("OZEEIHVG.k")
	public int[] field1172 = new int[5];

	@ObfuscatedName("OZEEIHVG.l")
	public int[] field1173 = new int[5];

	@ObfuscatedName("OZEEIHVG.m")
	public int[] field1174 = new int[5];

	@ObfuscatedName("OZEEIHVG.o")
	public int field1176 = 100;

	@ObfuscatedName("OZEEIHVG.r")
	public int field1179 = 500;

	@ObfuscatedName("OZEEIHVG.w")
	public static int[] field1184 = new int[5];

	@ObfuscatedName("OZEEIHVG.x")
	public static int[] field1185 = new int[5];

	@ObfuscatedName("OZEEIHVG.y")
	public static int[] field1186 = new int[5];

	@ObfuscatedName("OZEEIHVG.z")
	public static int[] field1187 = new int[5];

	@ObfuscatedName("OZEEIHVG.A")
	public static int[] field1188 = new int[5];

	@ObfuscatedName("OZEEIHVG.n")
	public int field1175;

	@ObfuscatedName("OZEEIHVG.s")
	public int field1180;

	@ObfuscatedName("OZEEIHVG.c")
	public SHSBXUIJ field1164;

	@ObfuscatedName("OZEEIHVG.d")
	public SHSBXUIJ field1165;

	@ObfuscatedName("OZEEIHVG.e")
	public SHSBXUIJ field1166;

	@ObfuscatedName("OZEEIHVG.f")
	public SHSBXUIJ field1167;

	@ObfuscatedName("OZEEIHVG.g")
	public SHSBXUIJ field1168;

	@ObfuscatedName("OZEEIHVG.h")
	public SHSBXUIJ field1169;

	@ObfuscatedName("OZEEIHVG.i")
	public SHSBXUIJ field1170;

	@ObfuscatedName("OZEEIHVG.j")
	public SHSBXUIJ field1171;

	@ObfuscatedName("OZEEIHVG.q")
	public SHSBXUIJ field1178;

	@ObfuscatedName("OZEEIHVG.p")
	public VLRTJGOX field1177;

	@ObfuscatedName("OZEEIHVG.t")
	public static int[] field1181;

	@ObfuscatedName("OZEEIHVG.u")
	public static int[] field1182;

	@ObfuscatedName("OZEEIHVG.v")
	public static int[] field1183;

	@ObfuscatedName("OZEEIHVG.a()V")
	public static final void method415() {
		field1182 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1182[var0] = 1;
			} else {
				field1182[var0] = -1;
			}
		}

		field1183 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1183[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1181 = new int[220500];
	}

	@ObfuscatedName("OZEEIHVG.a(II)[I")
	public final int[] method416(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1181[var3] = 0;
		}

		if (arg1 < 10) {
			return field1181;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1164.method495();
		field1165.method495();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1166 != null) {
			field1166.method495();
			field1167.method495();
			var6 = (int) ((field1166.field1366 - field1166.field1365) * 32.768D / var4);
			var7 = (int) (field1166.field1365 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1168 != null) {
			field1168.method495();
			field1169.method495();
			var9 = (int) ((field1168.field1366 - field1168.field1365) * 32.768D / var4);
			var10 = (int) (field1168.field1365 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1172[var12] != 0) {
				field1184[var12] = 0;
				field1185[var12] = (int) (field1174[var12] * var4);
				field1186[var12] = (field1172[var12] << 14) / 100;
				field1187[var12] = (int) ((field1164.field1366 - field1164.field1365) * 32.768D * Math.pow(1.0057929410678534D, field1173[var12]) / var4);
				field1188[var12] = (int) (field1164.field1365 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1164.method496(arg0);
			int var15 = field1165.method496(arg0);

			if (field1166 != null) {
				int var16 = field1166.method496(arg0);
				int var17 = field1167.method496(arg0);
				var14 += method417(var17, field1166.field1367, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1168 != null) {
				int var18 = field1168.method496(arg0);
				int var19 = field1169.method496(arg0);
				var15 = var15 * ((method417(var19, field1168.field1367, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1172[var20] != 0) {
					int var21 = field1185[var20] + var13;
					if (var21 < arg0) {
						field1181[var21] += method417(field1186[var20] * var15 >> 15, field1164.field1367, field1184[var20]);
						field1184[var20] += (field1187[var20] * var14 >> 16) + field1188[var20];
					}
				}
			}
		}

		if (field1170 != null) {
			field1170.method495();
			field1171.method495();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1170.method496(arg0);
				int var27 = field1171.method496(arg0);
				int var28;
				if (var24) {
					var28 = ((field1170.field1366 - field1170.field1365) * var26 >> 8) + field1170.field1365;
				} else {
					var28 = ((field1170.field1366 - field1170.field1365) * var27 >> 8) + field1170.field1365;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1181[var25] = 0;
				}
			}
		}

		if (field1175 > 0 && field1176 > 0) {
			int var29 = (int) (field1175 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1181[var30] += field1181[var30 - var29] * field1176 / 100;
			}
		}

		if (field1177.field1435[0] > 0 || field1177.field1435[1] > 0) {
			field1178.method495();
			int var31 = field1178.method496(arg0 + 1);
			int var32 = field1177.method559(0, var31 / 65536.0F);
			int var33 = field1177.method559(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1181[var32 + var34] * (long) VLRTJGOX.field1442 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1181[var32 + var34 - var37 - 1] * (long) VLRTJGOX.field1440[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1181[var34 - var38 - 1] * (long) VLRTJGOX.field1440[1][var38] >> 16);
					}

					field1181[var34] = var36;
					var31 = field1178.method496(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1181[var32 + var34] * (long) VLRTJGOX.field1442 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1181[var32 + var34 - var42 - 1] * (long) VLRTJGOX.field1440[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1181[var34 - var43 - 1] * (long) VLRTJGOX.field1440[1][var43] >> 16);
						}

						field1181[var34] = var41;
						var31 = field1178.method496(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1177.method559(0, var31 / 65536.0F);
					var33 = field1177.method559(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1181[var32 + var34 - var45 - 1] * (long) VLRTJGOX.field1440[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1181[var34 - var46 - 1] * (long) VLRTJGOX.field1440[1][var46] >> 16);
					}

					field1181[var34] = var44;
					field1178.method496(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1181[var48] < -32768) {
				field1181[var48] = -32768;
			}

			if (field1181[var48] > 32767) {
				field1181[var48] = 32767;
			}
		}

		return field1181;
	}

	@ObfuscatedName("OZEEIHVG.a(IIII)I")
	public final int method417(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field1183[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field1182[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("OZEEIHVG.a(ILRGCGKKUR;)V")
	public final void method418(RGCGKKUR arg0) {
		field1164 = new SHSBXUIJ();
		field1164.method493(arg0);
		field1165 = new SHSBXUIJ();
		field1165.method493(arg0);
		int var2 = arg0.method455();
		if (var2 != 0) {
			arg0.field1350--;
			field1166 = new SHSBXUIJ();
			field1166.method493(arg0);
			field1167 = new SHSBXUIJ();
			field1167.method493(arg0);
		}

		int var3 = arg0.method455();
		if (var3 != 0) {
			arg0.field1350--;
			field1168 = new SHSBXUIJ();
			field1168.method493(arg0);
			field1169 = new SHSBXUIJ();
			field1169.method493(arg0);
		}

		int var4 = arg0.method455();
		if (var4 != 0) {
			arg0.field1350--;
			field1170 = new SHSBXUIJ();
			field1170.method493(arg0);
			field1171 = new SHSBXUIJ();
			field1171.method493(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method469();
			if (var6 == 0) {
				break;
			}

			field1172[var5] = var6;
			field1173[var5] = arg0.method468();
			field1174[var5] = arg0.method469();
		}

		field1175 = arg0.method469();
		field1176 = arg0.method469();
		field1179 = arg0.method457();
		field1180 = arg0.method457();
		field1177 = new VLRTJGOX();
		field1178 = new SHSBXUIJ();
		field1177.method560(arg0, field1178);
	}
}
