package deob;

@ObfuscatedName("QWSZQDKL")
public class QWSZQDKL {

	@ObfuscatedName("QWSZQDKL.i")
	public int[] field1150 = new int[5];

	@ObfuscatedName("QWSZQDKL.j")
	public int[] field1151 = new int[5];

	@ObfuscatedName("QWSZQDKL.k")
	public int[] field1152 = new int[5];

	@ObfuscatedName("QWSZQDKL.m")
	public int field1154 = 100;

	@ObfuscatedName("QWSZQDKL.p")
	public int field1157 = 500;

	@ObfuscatedName("QWSZQDKL.u")
	public static int[] field1162 = new int[5];

	@ObfuscatedName("QWSZQDKL.v")
	public static int[] field1163 = new int[5];

	@ObfuscatedName("QWSZQDKL.w")
	public static int[] field1164 = new int[5];

	@ObfuscatedName("QWSZQDKL.x")
	public static int[] field1165 = new int[5];

	@ObfuscatedName("QWSZQDKL.y")
	public static int[] field1166 = new int[5];

	@ObfuscatedName("QWSZQDKL.l")
	public int field1153;

	@ObfuscatedName("QWSZQDKL.q")
	public int field1158;

	@ObfuscatedName("QWSZQDKL.a")
	public KEEMQUKU field1142;

	@ObfuscatedName("QWSZQDKL.b")
	public KEEMQUKU field1143;

	@ObfuscatedName("QWSZQDKL.c")
	public KEEMQUKU field1144;

	@ObfuscatedName("QWSZQDKL.d")
	public KEEMQUKU field1145;

	@ObfuscatedName("QWSZQDKL.e")
	public KEEMQUKU field1146;

	@ObfuscatedName("QWSZQDKL.f")
	public KEEMQUKU field1147;

	@ObfuscatedName("QWSZQDKL.g")
	public KEEMQUKU field1148;

	@ObfuscatedName("QWSZQDKL.h")
	public KEEMQUKU field1149;

	@ObfuscatedName("QWSZQDKL.o")
	public KEEMQUKU field1156;

	@ObfuscatedName("QWSZQDKL.n")
	public OYVSGGSR field1155;

	@ObfuscatedName("QWSZQDKL.r")
	public static int[] field1159;

	@ObfuscatedName("QWSZQDKL.s")
	public static int[] field1160;

	@ObfuscatedName("QWSZQDKL.t")
	public static int[] field1161;

	@ObfuscatedName("QWSZQDKL.a()V")
	public static final void method399() {
		field1160 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1160[var0] = 1;
			} else {
				field1160[var0] = -1;
			}
		}

		field1161 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1161[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1159 = new int[220500];
	}

	@ObfuscatedName("QWSZQDKL.a(II)[I")
	public final int[] method400(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1159[var3] = 0;
		}

		if (arg1 < 10) {
			return field1159;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1142.method274();
		field1143.method274();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1144 != null) {
			field1144.method274();
			field1145.method274();
			var6 = (int) ((field1144.field969 - field1144.field968) * 32.768D / var4);
			var7 = (int) (field1144.field968 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1146 != null) {
			field1146.method274();
			field1147.method274();
			var9 = (int) ((field1146.field969 - field1146.field968) * 32.768D / var4);
			var10 = (int) (field1146.field968 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1150[var12] != 0) {
				field1162[var12] = 0;
				field1163[var12] = (int) (field1152[var12] * var4);
				field1164[var12] = (field1150[var12] << 14) / 100;
				field1165[var12] = (int) ((field1142.field969 - field1142.field968) * 32.768D * Math.pow(1.0057929410678534D, field1151[var12]) / var4);
				field1166[var12] = (int) (field1142.field968 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1142.method275(arg0);
			int var15 = field1143.method275(arg0);

			if (field1144 != null) {
				int var16 = field1144.method275(arg0);
				int var17 = field1145.method275(arg0);
				var14 += method401(var17, field1144.field970, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1146 != null) {
				int var18 = field1146.method275(arg0);
				int var19 = field1147.method275(arg0);
				var15 = var15 * ((method401(var19, field1146.field970, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1150[var20] != 0) {
					int var21 = field1163[var20] + var13;
					if (var21 < arg0) {
						field1159[var21] += method401(field1164[var20] * var15 >> 15, field1142.field970, field1162[var20]);
						field1162[var20] += (field1165[var20] * var14 >> 16) + field1166[var20];
					}
				}
			}
		}

		if (field1148 != null) {
			field1148.method274();
			field1149.method274();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1148.method275(arg0);
				int var27 = field1149.method275(arg0);
				int var28;
				if (var24) {
					var28 = ((field1148.field969 - field1148.field968) * var26 >> 8) + field1148.field968;
				} else {
					var28 = ((field1148.field969 - field1148.field968) * var27 >> 8) + field1148.field968;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1159[var25] = 0;
				}
			}
		}

		if (field1153 > 0 && field1154 > 0) {
			int var29 = (int) (field1153 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1159[var30] += field1159[var30 - var29] * field1154 / 100;
			}
		}

		if (field1155.field1082[0] > 0 || field1155.field1082[1] > 0) {
			field1156.method274();
			int var31 = field1156.method275(arg0 + 1);
			int var32 = field1155.method326(0, var31 / 65536.0F);
			int var33 = field1155.method326(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1159[var32 + var34] * (long) OYVSGGSR.field1089 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1159[var32 + var34 - var37 - 1] * (long) OYVSGGSR.field1087[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1159[var34 - var38 - 1] * (long) OYVSGGSR.field1087[1][var38] >> 16);
					}

					field1159[var34] = var36;
					var31 = field1156.method275(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1159[var32 + var34] * (long) OYVSGGSR.field1089 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1159[var32 + var34 - var42 - 1] * (long) OYVSGGSR.field1087[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1159[var34 - var43 - 1] * (long) OYVSGGSR.field1087[1][var43] >> 16);
						}

						field1159[var34] = var41;
						var31 = field1156.method275(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1155.method326(0, var31 / 65536.0F);
					var33 = field1155.method326(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1159[var32 + var34 - var45 - 1] * (long) OYVSGGSR.field1087[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1159[var34 - var46 - 1] * (long) OYVSGGSR.field1087[1][var46] >> 16);
					}

					field1159[var34] = var44;
					field1156.method275(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1159[var48] < -32768) {
				field1159[var48] = -32768;
			}

			if (field1159[var48] > 32767) {
				field1159[var48] = 32767;
			}
		}

		return field1159;
	}

	@ObfuscatedName("QWSZQDKL.a(IIBI)I")
	public final int method401(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field1161[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field1160[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("QWSZQDKL.a(LPQBRPYKE;Z)V")
	public final void method402(PQBRPYKE arg0) {
		field1142 = new KEEMQUKU();
		field1142.method272(arg0);
		field1143 = new KEEMQUKU();
		field1143.method272(arg0);
		int var2 = arg0.method340();
		if (var2 != 0) {
			arg0.field1091--;
			field1144 = new KEEMQUKU();
			field1144.method272(arg0);
			field1145 = new KEEMQUKU();
			field1145.method272(arg0);
		}

		int var3 = arg0.method340();
		if (var3 != 0) {
			arg0.field1091--;
			field1146 = new KEEMQUKU();
			field1146.method272(arg0);
			field1147 = new KEEMQUKU();
			field1147.method272(arg0);
		}

		int var4 = arg0.method340();
		if (var4 != 0) {
			arg0.field1091--;
			field1148 = new KEEMQUKU();
			field1148.method272(arg0);
			field1149 = new KEEMQUKU();
			field1149.method272(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method354();
			if (var6 == 0) {
				break;
			}

			field1150[var5] = var6;
			field1151[var5] = arg0.method353();
			field1152[var5] = arg0.method354();
		}

		field1153 = arg0.method354();
		field1154 = arg0.method354();
		field1157 = arg0.method342();
		field1158 = arg0.method342();
		field1155 = new OYVSGGSR();
		field1156 = new KEEMQUKU();
		field1155.method327(arg0, field1156);
	}
}
