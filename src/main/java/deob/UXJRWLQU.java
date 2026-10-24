package deob;

@ObfuscatedName("UXJRWLQU")
public class UXJRWLQU {

	@ObfuscatedName("UXJRWLQU.j")
	public int[] field1268 = new int[5];

	@ObfuscatedName("UXJRWLQU.k")
	public int[] field1269 = new int[5];

	@ObfuscatedName("UXJRWLQU.l")
	public int[] field1270 = new int[5];

	@ObfuscatedName("UXJRWLQU.n")
	public int field1272 = 100;

	@ObfuscatedName("UXJRWLQU.q")
	public int field1275 = 500;

	@ObfuscatedName("UXJRWLQU.v")
	public static int[] field1280 = new int[5];

	@ObfuscatedName("UXJRWLQU.w")
	public static int[] field1281 = new int[5];

	@ObfuscatedName("UXJRWLQU.x")
	public static int[] field1282 = new int[5];

	@ObfuscatedName("UXJRWLQU.y")
	public static int[] field1283 = new int[5];

	@ObfuscatedName("UXJRWLQU.z")
	public static int[] field1284 = new int[5];

	@ObfuscatedName("UXJRWLQU.m")
	public int field1271;

	@ObfuscatedName("UXJRWLQU.r")
	public int field1276;

	@ObfuscatedName("UXJRWLQU.o")
	public KEQJLHXN field1273;

	@ObfuscatedName("UXJRWLQU.b")
	public ZBHVITZX field1260;

	@ObfuscatedName("UXJRWLQU.c")
	public ZBHVITZX field1261;

	@ObfuscatedName("UXJRWLQU.d")
	public ZBHVITZX field1262;

	@ObfuscatedName("UXJRWLQU.e")
	public ZBHVITZX field1263;

	@ObfuscatedName("UXJRWLQU.f")
	public ZBHVITZX field1264;

	@ObfuscatedName("UXJRWLQU.g")
	public ZBHVITZX field1265;

	@ObfuscatedName("UXJRWLQU.h")
	public ZBHVITZX field1266;

	@ObfuscatedName("UXJRWLQU.i")
	public ZBHVITZX field1267;

	@ObfuscatedName("UXJRWLQU.p")
	public ZBHVITZX field1274;

	@ObfuscatedName("UXJRWLQU.s")
	public static int[] field1277;

	@ObfuscatedName("UXJRWLQU.t")
	public static int[] field1278;

	@ObfuscatedName("UXJRWLQU.u")
	public static int[] field1279;

	@ObfuscatedName("UXJRWLQU.a()V")
	public static final void method532() {
		field1278 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1278[var0] = 1;
			} else {
				field1278[var0] = -1;
			}
		}

		field1279 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1279[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1277 = new int[220500];
	}

	@ObfuscatedName("UXJRWLQU.a(II)[I")
	public final int[] method533(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1277[var3] = 0;
		}

		if (arg1 < 10) {
			return field1277;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1260.method579();
		field1261.method579();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1262 != null) {
			field1262.method579();
			field1263.method579();
			var6 = (int) ((field1262.field1419 - field1262.field1418) * 32.768D / var4);
			var7 = (int) (field1262.field1418 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1264 != null) {
			field1264.method579();
			field1265.method579();
			var9 = (int) ((field1264.field1419 - field1264.field1418) * 32.768D / var4);
			var10 = (int) (field1264.field1418 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1268[var12] != 0) {
				field1280[var12] = 0;
				field1281[var12] = (int) (field1270[var12] * var4);
				field1282[var12] = (field1268[var12] << 14) / 100;
				field1283[var12] = (int) ((field1260.field1419 - field1260.field1418) * 32.768D * Math.pow(1.0057929410678534D, field1269[var12]) / var4);
				field1284[var12] = (int) (field1260.field1418 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1260.method580(arg0);
			int var15 = field1261.method580(arg0);

			if (field1262 != null) {
				int var16 = field1262.method580(arg0);
				int var17 = field1263.method580(arg0);
				var14 += method534(var17, field1262.field1420, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1264 != null) {
				int var18 = field1264.method580(arg0);
				int var19 = field1265.method580(arg0);
				var15 = var15 * ((method534(var19, field1264.field1420, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1268[var20] != 0) {
					int var21 = field1281[var20] + var13;
					if (var21 < arg0) {
						field1277[var21] += method534(field1282[var20] * var15 >> 15, field1260.field1420, field1280[var20]);
						field1280[var20] += (field1283[var20] * var14 >> 16) + field1284[var20];
					}
				}
			}
		}

		if (field1266 != null) {
			field1266.method579();
			field1267.method579();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1266.method580(arg0);
				int var27 = field1267.method580(arg0);
				int var28;
				if (var24) {
					var28 = ((field1266.field1419 - field1266.field1418) * var26 >> 8) + field1266.field1418;
				} else {
					var28 = ((field1266.field1419 - field1266.field1418) * var27 >> 8) + field1266.field1418;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1277[var25] = 0;
				}
			}
		}

		if (field1271 > 0 && field1272 > 0) {
			int var29 = (int) (field1271 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1277[var30] += field1277[var30 - var29] * field1272 / 100;
			}
		}

		if (field1273.field864[0] > 0 || field1273.field864[1] > 0) {
			field1274.method579();
			int var31 = field1274.method580(arg0 + 1);
			int var32 = field1273.method350(var31 / 65536.0F, 0);
			int var33 = field1273.method350(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1277[var32 + var34] * (long) KEQJLHXN.field871 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1277[var32 + var34 - var37 - 1] * (long) KEQJLHXN.field869[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1277[var34 - var38 - 1] * (long) KEQJLHXN.field869[1][var38] >> 16);
					}

					field1277[var34] = var36;
					var31 = field1274.method580(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1277[var32 + var34] * (long) KEQJLHXN.field871 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1277[var32 + var34 - var42 - 1] * (long) KEQJLHXN.field869[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1277[var34 - var43 - 1] * (long) KEQJLHXN.field869[1][var43] >> 16);
						}

						field1277[var34] = var41;
						var31 = field1274.method580(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1273.method350(var31 / 65536.0F, 0);
					var33 = field1273.method350(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1277[var32 + var34 - var45 - 1] * (long) KEQJLHXN.field869[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1277[var34 - var46 - 1] * (long) KEQJLHXN.field869[1][var46] >> 16);
					}

					field1277[var34] = var44;
					field1274.method580(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1277[var48] < -32768) {
				field1277[var48] = -32768;
			}

			if (field1277[var48] > 32767) {
				field1277[var48] = 32767;
			}
		}

		return field1277;
	}

	@ObfuscatedName("UXJRWLQU.a(IIII)I")
	public final int method534(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field1279[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field1278[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("UXJRWLQU.a(LLBBVYYXO;B)V")
	public final void method535(LBBVYYXO arg0) {
		field1260 = new ZBHVITZX();
		field1260.method577(arg0);
		field1261 = new ZBHVITZX();
		field1261.method577(arg0);
		int var2 = arg0.method369();
		if (var2 != 0) {
			arg0.field882--;
			field1262 = new ZBHVITZX();
			field1262.method577(arg0);
			field1263 = new ZBHVITZX();
			field1263.method577(arg0);
		}

		int var3 = arg0.method369();
		if (var3 != 0) {
			arg0.field882--;
			field1264 = new ZBHVITZX();
			field1264.method577(arg0);
			field1265 = new ZBHVITZX();
			field1265.method577(arg0);
		}

		int var4 = arg0.method369();
		if (var4 != 0) {
			arg0.field882--;
			field1266 = new ZBHVITZX();
			field1266.method577(arg0);
			field1267 = new ZBHVITZX();
			field1267.method577(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method383();
			if (var6 == 0) {
				break;
			}

			field1268[var5] = var6;
			field1269[var5] = arg0.method382();
			field1270[var5] = arg0.method383();
		}

		field1271 = arg0.method383();
		field1272 = arg0.method383();
		field1275 = arg0.method371();
		field1276 = arg0.method371();
		field1273 = new KEQJLHXN();
		field1274 = new ZBHVITZX();
		field1273.method351(arg0, field1274);
	}
}
