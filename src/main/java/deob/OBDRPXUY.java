package deob;

@ObfuscatedName("OBDRPXUY")
public class OBDRPXUY {

	@ObfuscatedName("OBDRPXUY.k")
	public int[] field1116 = new int[5];

	@ObfuscatedName("OBDRPXUY.l")
	public int[] field1117 = new int[5];

	@ObfuscatedName("OBDRPXUY.m")
	public int[] field1118 = new int[5];

	@ObfuscatedName("OBDRPXUY.o")
	public int field1120 = 100;

	@ObfuscatedName("OBDRPXUY.r")
	public int field1123 = 500;

	@ObfuscatedName("OBDRPXUY.w")
	public static int[] field1128 = new int[5];

	@ObfuscatedName("OBDRPXUY.x")
	public static int[] field1129 = new int[5];

	@ObfuscatedName("OBDRPXUY.y")
	public static int[] field1130 = new int[5];

	@ObfuscatedName("OBDRPXUY.z")
	public static int[] field1131 = new int[5];

	@ObfuscatedName("OBDRPXUY.A")
	public static int[] field1132 = new int[5];

	@ObfuscatedName("OBDRPXUY.n")
	public int field1119;

	@ObfuscatedName("OBDRPXUY.s")
	public int field1124;

	@ObfuscatedName("OBDRPXUY.c")
	public GTUIGVXS field1108;

	@ObfuscatedName("OBDRPXUY.d")
	public GTUIGVXS field1109;

	@ObfuscatedName("OBDRPXUY.e")
	public GTUIGVXS field1110;

	@ObfuscatedName("OBDRPXUY.f")
	public GTUIGVXS field1111;

	@ObfuscatedName("OBDRPXUY.g")
	public GTUIGVXS field1112;

	@ObfuscatedName("OBDRPXUY.h")
	public GTUIGVXS field1113;

	@ObfuscatedName("OBDRPXUY.i")
	public GTUIGVXS field1114;

	@ObfuscatedName("OBDRPXUY.j")
	public GTUIGVXS field1115;

	@ObfuscatedName("OBDRPXUY.q")
	public GTUIGVXS field1122;

	@ObfuscatedName("OBDRPXUY.p")
	public WSKKAWXJ field1121;

	@ObfuscatedName("OBDRPXUY.t")
	public static int[] field1125;

	@ObfuscatedName("OBDRPXUY.u")
	public static int[] field1126;

	@ObfuscatedName("OBDRPXUY.v")
	public static int[] field1127;

	@ObfuscatedName("OBDRPXUY.a()V")
	public static final void method347() {
		field1126 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1126[var0] = 1;
			} else {
				field1126[var0] = -1;
			}
		}

		field1127 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1127[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1125 = new int[220500];
	}

	@ObfuscatedName("OBDRPXUY.a(II)[I")
	public final int[] method348(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1125[var3] = 0;
		}

		if (arg1 < 10) {
			return field1125;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1108.method271();
		field1109.method271();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1110 != null) {
			field1110.method271();
			field1111.method271();
			var6 = (int) ((field1110.field850 - field1110.field849) * 32.768D / var4);
			var7 = (int) (field1110.field849 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1112 != null) {
			field1112.method271();
			field1113.method271();
			var9 = (int) ((field1112.field850 - field1112.field849) * 32.768D / var4);
			var10 = (int) (field1112.field849 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1116[var12] != 0) {
				field1128[var12] = 0;
				field1129[var12] = (int) (field1118[var12] * var4);
				field1130[var12] = (field1116[var12] << 14) / 100;
				field1131[var12] = (int) ((field1108.field850 - field1108.field849) * 32.768D * Math.pow(1.0057929410678534D, field1117[var12]) / var4);
				field1132[var12] = (int) (field1108.field849 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1108.method272(arg0);
			int var15 = field1109.method272(arg0);

			if (field1110 != null) {
				int var16 = field1110.method272(arg0);
				int var17 = field1111.method272(arg0);
				var14 += method349(var8, field1110.field851, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1112 != null) {
				int var18 = field1112.method272(arg0);
				int var19 = field1113.method272(arg0);
				var15 = var15 * ((method349(var11, field1112.field851, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1116[var20] != 0) {
					int var21 = field1129[var20] + var13;
					if (var21 < arg0) {
						field1125[var21] += method349(field1128[var20], field1108.field851, field1130[var20] * var15 >> 15);
						field1128[var20] += (field1131[var20] * var14 >> 16) + field1132[var20];
					}
				}
			}
		}

		if (field1114 != null) {
			field1114.method271();
			field1115.method271();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1114.method272(arg0);
				int var27 = field1115.method272(arg0);
				int var28;
				if (var24) {
					var28 = ((field1114.field850 - field1114.field849) * var26 >> 8) + field1114.field849;
				} else {
					var28 = ((field1114.field850 - field1114.field849) * var27 >> 8) + field1114.field849;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1125[var25] = 0;
				}
			}
		}

		if (field1119 > 0 && field1120 > 0) {
			int var29 = (int) (field1119 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1125[var30] += field1125[var30 - var29] * field1120 / 100;
			}
		}

		if (field1121.field1413[0] > 0 || field1121.field1413[1] > 0) {
			field1122.method271();
			int var31 = field1122.method272(arg0 + 1);
			int var32 = field1121.method556(var31 / 65536.0F, 0);
			int var33 = field1121.method556(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1125[var32 + var34] * (long) WSKKAWXJ.field1420 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1125[var32 + var34 - var37 - 1] * (long) WSKKAWXJ.field1418[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1125[var34 - var38 - 1] * (long) WSKKAWXJ.field1418[1][var38] >> 16);
					}

					field1125[var34] = var36;
					var31 = field1122.method272(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1125[var32 + var34] * (long) WSKKAWXJ.field1420 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1125[var32 + var34 - var42 - 1] * (long) WSKKAWXJ.field1418[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1125[var34 - var43 - 1] * (long) WSKKAWXJ.field1418[1][var43] >> 16);
						}

						field1125[var34] = var41;
						var31 = field1122.method272(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1121.method556(var31 / 65536.0F, 0);
					var33 = field1121.method556(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1125[var32 + var34 - var45 - 1] * (long) WSKKAWXJ.field1418[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1125[var34 - var46 - 1] * (long) WSKKAWXJ.field1418[1][var46] >> 16);
					}

					field1125[var34] = var44;
					field1122.method272(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1125[var48] < -32768) {
				field1125[var48] = -32768;
			}

			if (field1125[var48] > 32767) {
				field1125[var48] = 32767;
			}
		}

		return field1125;
	}

	@ObfuscatedName("OBDRPXUY.a(IIII)I")
	public final int method349(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field1127[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field1126[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("OBDRPXUY.a(LWBEWPIXO;I)V")
	public final void method350(WBEWPIXO arg0) {
		field1108 = new GTUIGVXS();
		field1108.method269(arg0);
		field1109 = new GTUIGVXS();
		field1109.method269(arg0);
		int var2 = arg0.method515();
		if (var2 != 0) {
			arg0.field1401--;
			field1110 = new GTUIGVXS();
			field1110.method269(arg0);
			field1111 = new GTUIGVXS();
			field1111.method269(arg0);
		}

		int var3 = arg0.method515();
		if (var3 != 0) {
			arg0.field1401--;
			field1112 = new GTUIGVXS();
			field1112.method269(arg0);
			field1113 = new GTUIGVXS();
			field1113.method269(arg0);
		}

		int var4 = arg0.method515();
		if (var4 != 0) {
			arg0.field1401--;
			field1114 = new GTUIGVXS();
			field1114.method269(arg0);
			field1115 = new GTUIGVXS();
			field1115.method269(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method529();
			if (var6 == 0) {
				break;
			}

			field1116[var5] = var6;
			field1117[var5] = arg0.method528();
			field1118[var5] = arg0.method529();
		}

		field1119 = arg0.method529();
		field1120 = arg0.method529();
		field1123 = arg0.method517();
		field1124 = arg0.method517();
		field1121 = new WSKKAWXJ();
		field1122 = new GTUIGVXS();
		field1121.method557(arg0, field1122);
	}
}
