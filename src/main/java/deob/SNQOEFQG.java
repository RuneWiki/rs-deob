package deob;

@ObfuscatedName("SNQOEFQG")
public class SNQOEFQG {

	@ObfuscatedName("SNQOEFQG.j")
	public int[] field1141 = new int[5];

	@ObfuscatedName("SNQOEFQG.k")
	public int[] field1142 = new int[5];

	@ObfuscatedName("SNQOEFQG.l")
	public int[] field1143 = new int[5];

	@ObfuscatedName("SNQOEFQG.n")
	public int field1145 = 100;

	@ObfuscatedName("SNQOEFQG.q")
	public int field1148 = 500;

	@ObfuscatedName("SNQOEFQG.v")
	public static int[] field1153 = new int[5];

	@ObfuscatedName("SNQOEFQG.w")
	public static int[] field1154 = new int[5];

	@ObfuscatedName("SNQOEFQG.x")
	public static int[] field1155 = new int[5];

	@ObfuscatedName("SNQOEFQG.y")
	public static int[] field1156 = new int[5];

	@ObfuscatedName("SNQOEFQG.z")
	public static int[] field1157 = new int[5];

	@ObfuscatedName("SNQOEFQG.m")
	public int field1144;

	@ObfuscatedName("SNQOEFQG.r")
	public int field1149;

	@ObfuscatedName("SNQOEFQG.o")
	public ADELCBNY field1146;

	@ObfuscatedName("SNQOEFQG.b")
	public TDXKKGZV field1133;

	@ObfuscatedName("SNQOEFQG.c")
	public TDXKKGZV field1134;

	@ObfuscatedName("SNQOEFQG.d")
	public TDXKKGZV field1135;

	@ObfuscatedName("SNQOEFQG.e")
	public TDXKKGZV field1136;

	@ObfuscatedName("SNQOEFQG.f")
	public TDXKKGZV field1137;

	@ObfuscatedName("SNQOEFQG.g")
	public TDXKKGZV field1138;

	@ObfuscatedName("SNQOEFQG.h")
	public TDXKKGZV field1139;

	@ObfuscatedName("SNQOEFQG.i")
	public TDXKKGZV field1140;

	@ObfuscatedName("SNQOEFQG.p")
	public TDXKKGZV field1147;

	@ObfuscatedName("SNQOEFQG.s")
	public static int[] field1150;

	@ObfuscatedName("SNQOEFQG.t")
	public static int[] field1151;

	@ObfuscatedName("SNQOEFQG.u")
	public static int[] field1152;

	@ObfuscatedName("SNQOEFQG.a()V")
	public static final void method458() {
		field1151 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1151[var0] = 1;
			} else {
				field1151[var0] = -1;
			}
		}

		field1152 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1152[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1150 = new int[220500];
	}

	@ObfuscatedName("SNQOEFQG.a(II)[I")
	public final int[] method459(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1150[var3] = 0;
		}

		if (arg1 < 10) {
			return field1150;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1133.method487();
		field1134.method487();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1135 != null) {
			field1135.method487();
			field1136.method487();
			var6 = (int) ((field1135.field1217 - field1135.field1216) * 32.768D / var4);
			var7 = (int) (field1135.field1216 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1137 != null) {
			field1137.method487();
			field1138.method487();
			var9 = (int) ((field1137.field1217 - field1137.field1216) * 32.768D / var4);
			var10 = (int) (field1137.field1216 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1141[var12] != 0) {
				field1153[var12] = 0;
				field1154[var12] = (int) (field1143[var12] * var4);
				field1155[var12] = (field1141[var12] << 14) / 100;
				field1156[var12] = (int) ((field1133.field1217 - field1133.field1216) * 32.768D * Math.pow(1.0057929410678534D, field1142[var12]) / var4);
				field1157[var12] = (int) (field1133.field1216 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1133.method488(arg0);
			int var15 = field1134.method488(arg0);

			if (field1135 != null) {
				int var16 = field1135.method488(arg0);
				int var17 = field1136.method488(arg0);
				var14 += method460(var17, field1135.field1218, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1137 != null) {
				int var18 = field1137.method488(arg0);
				int var19 = field1138.method488(arg0);
				var15 = var15 * ((method460(var19, field1137.field1218, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1141[var20] != 0) {
					int var21 = field1154[var20] + var13;
					if (var21 < arg0) {
						field1150[var21] += method460(field1155[var20] * var15 >> 15, field1133.field1218, field1153[var20]);
						field1153[var20] += (field1156[var20] * var14 >> 16) + field1157[var20];
					}
				}
			}
		}

		if (field1139 != null) {
			field1139.method487();
			field1140.method487();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1139.method488(arg0);
				int var27 = field1140.method488(arg0);
				int var28;
				if (var24) {
					var28 = ((field1139.field1217 - field1139.field1216) * var26 >> 8) + field1139.field1216;
				} else {
					var28 = ((field1139.field1217 - field1139.field1216) * var27 >> 8) + field1139.field1216;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1150[var25] = 0;
				}
			}
		}

		if (field1144 > 0 && field1145 > 0) {
			int var29 = (int) (field1144 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1150[var30] += field1150[var30 - var29] * field1145 / 100;
			}
		}

		if (field1146.field1[0] > 0 || field1146.field1[1] > 0) {
			field1147.method487();
			int var31 = field1147.method488(arg0 + 1);
			int var32 = field1146.method4(0, var31 / 65536.0F);
			int var33 = field1146.method4(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1150[var32 + var34] * (long) ADELCBNY.field8 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1150[var32 + var34 - var37 - 1] * (long) ADELCBNY.field6[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1150[var34 - var38 - 1] * (long) ADELCBNY.field6[1][var38] >> 16);
					}

					field1150[var34] = var36;
					var31 = field1147.method488(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1150[var32 + var34] * (long) ADELCBNY.field8 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1150[var32 + var34 - var42 - 1] * (long) ADELCBNY.field6[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1150[var34 - var43 - 1] * (long) ADELCBNY.field6[1][var43] >> 16);
						}

						field1150[var34] = var41;
						var31 = field1147.method488(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1146.method4(0, var31 / 65536.0F);
					var33 = field1146.method4(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1150[var32 + var34 - var45 - 1] * (long) ADELCBNY.field6[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1150[var34 - var46 - 1] * (long) ADELCBNY.field6[1][var46] >> 16);
					}

					field1150[var34] = var44;
					field1147.method488(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1150[var48] < -32768) {
				field1150[var48] = -32768;
			}

			if (field1150[var48] > 32767) {
				field1150[var48] = 32767;
			}
		}

		return field1150;
	}

	@ObfuscatedName("SNQOEFQG.a(IIII)I")
	public final int method460(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field1152[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field1151[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("SNQOEFQG.a(ILIMUIZRAF;)V")
	public final void method461(IMUIZRAF arg0) {
		field1133 = new TDXKKGZV();
		field1133.method485(arg0);
		field1134 = new TDXKKGZV();
		field1134.method485(arg0);
		int var2 = arg0.method238();
		if (var2 != 0) {
			arg0.field714--;
			field1135 = new TDXKKGZV();
			field1135.method485(arg0);
			field1136 = new TDXKKGZV();
			field1136.method485(arg0);
		}

		int var3 = arg0.method238();
		if (var3 != 0) {
			arg0.field714--;
			field1137 = new TDXKKGZV();
			field1137.method485(arg0);
			field1138 = new TDXKKGZV();
			field1138.method485(arg0);
		}

		int var4 = arg0.method238();
		if (var4 != 0) {
			arg0.field714--;
			field1139 = new TDXKKGZV();
			field1139.method485(arg0);
			field1140 = new TDXKKGZV();
			field1140.method485(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method252();
			if (var6 == 0) {
				break;
			}

			field1141[var5] = var6;
			field1142[var5] = arg0.method251();
			field1143[var5] = arg0.method252();
		}

		field1144 = arg0.method252();
		field1145 = arg0.method252();
		field1148 = arg0.method240();
		field1149 = arg0.method240();
		field1146 = new ADELCBNY();
		field1147 = new TDXKKGZV();
		field1146.method5(arg0, field1147);
	}
}
