package deob;

@ObfuscatedName("UJYLHBCS")
public class UJYLHBCS {

	@ObfuscatedName("UJYLHBCS.i")
	public int[] field1274 = new int[5];

	@ObfuscatedName("UJYLHBCS.j")
	public int[] field1275 = new int[5];

	@ObfuscatedName("UJYLHBCS.k")
	public int[] field1276 = new int[5];

	@ObfuscatedName("UJYLHBCS.m")
	public int field1278 = 100;

	@ObfuscatedName("UJYLHBCS.p")
	public int field1281 = 500;

	@ObfuscatedName("UJYLHBCS.u")
	public static int[] field1286 = new int[5];

	@ObfuscatedName("UJYLHBCS.v")
	public static int[] field1287 = new int[5];

	@ObfuscatedName("UJYLHBCS.w")
	public static int[] field1288 = new int[5];

	@ObfuscatedName("UJYLHBCS.x")
	public static int[] field1289 = new int[5];

	@ObfuscatedName("UJYLHBCS.y")
	public static int[] field1290 = new int[5];

	@ObfuscatedName("UJYLHBCS.l")
	public int field1277;

	@ObfuscatedName("UJYLHBCS.q")
	public int field1282;

	@ObfuscatedName("UJYLHBCS.a")
	public ANPSASQF field1266;

	@ObfuscatedName("UJYLHBCS.b")
	public ANPSASQF field1267;

	@ObfuscatedName("UJYLHBCS.c")
	public ANPSASQF field1268;

	@ObfuscatedName("UJYLHBCS.d")
	public ANPSASQF field1269;

	@ObfuscatedName("UJYLHBCS.e")
	public ANPSASQF field1270;

	@ObfuscatedName("UJYLHBCS.f")
	public ANPSASQF field1271;

	@ObfuscatedName("UJYLHBCS.g")
	public ANPSASQF field1272;

	@ObfuscatedName("UJYLHBCS.h")
	public ANPSASQF field1273;

	@ObfuscatedName("UJYLHBCS.o")
	public ANPSASQF field1280;

	@ObfuscatedName("UJYLHBCS.n")
	public IOYFKQTX field1279;

	@ObfuscatedName("UJYLHBCS.r")
	public static int[] field1283;

	@ObfuscatedName("UJYLHBCS.s")
	public static int[] field1284;

	@ObfuscatedName("UJYLHBCS.t")
	public static int[] field1285;

	@ObfuscatedName("UJYLHBCS.a()V")
	public static final void method527() {
		field1284 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1284[var0] = 1;
			} else {
				field1284[var0] = -1;
			}
		}

		field1285 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1285[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1283 = new int[220500];
	}

	@ObfuscatedName("UJYLHBCS.a(II)[I")
	public final int[] method528(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1283[var3] = 0;
		}

		if (arg1 < 10) {
			return field1283;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1266.method5();
		field1267.method5();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1268 != null) {
			field1268.method5();
			field1269.method5();
			var6 = (int) ((field1268.field14 - field1268.field13) * 32.768D / var4);
			var7 = (int) (field1268.field13 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1270 != null) {
			field1270.method5();
			field1271.method5();
			var9 = (int) ((field1270.field14 - field1270.field13) * 32.768D / var4);
			var10 = (int) (field1270.field13 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1274[var12] != 0) {
				field1286[var12] = 0;
				field1287[var12] = (int) (field1276[var12] * var4);
				field1288[var12] = (field1274[var12] << 14) / 100;
				field1289[var12] = (int) ((field1266.field14 - field1266.field13) * 32.768D * Math.pow(1.0057929410678534D, field1275[var12]) / var4);
				field1290[var12] = (int) (field1266.field13 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1266.method6(arg0);
			int var15 = field1267.method6(arg0);

			if (field1268 != null) {
				int var16 = field1268.method6(arg0);
				int var17 = field1269.method6(arg0);
				var14 += method529(field1268.field15, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1270 != null) {
				int var18 = field1270.method6(arg0);
				int var19 = field1271.method6(arg0);
				var15 = var15 * ((method529(field1270.field15, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1274[var20] != 0) {
					int var21 = field1287[var20] + var13;
					if (var21 < arg0) {
						field1283[var21] += method529(field1266.field15, field1288[var20] * var15 >> 15, field1286[var20]);
						field1286[var20] += (field1289[var20] * var14 >> 16) + field1290[var20];
					}
				}
			}
		}

		if (field1272 != null) {
			field1272.method5();
			field1273.method5();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1272.method6(arg0);
				int var27 = field1273.method6(arg0);
				int var28;
				if (var24) {
					var28 = ((field1272.field14 - field1272.field13) * var26 >> 8) + field1272.field13;
				} else {
					var28 = ((field1272.field14 - field1272.field13) * var27 >> 8) + field1272.field13;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1283[var25] = 0;
				}
			}
		}

		if (field1277 > 0 && field1278 > 0) {
			int var29 = (int) (field1277 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1283[var30] += field1283[var30 - var29] * field1278 / 100;
			}
		}

		if (field1279.field846[0] > 0 || field1279.field846[1] > 0) {
			field1280.method5();
			int var31 = field1280.method6(arg0 + 1);
			int var32 = field1279.method364(0, var31 / 65536.0F);
			int var33 = field1279.method364(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1283[var32 + var34] * (long) IOYFKQTX.field853 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1283[var32 + var34 - var37 - 1] * (long) IOYFKQTX.field851[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1283[var34 - var38 - 1] * (long) IOYFKQTX.field851[1][var38] >> 16);
					}

					field1283[var34] = var36;
					var31 = field1280.method6(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1283[var32 + var34] * (long) IOYFKQTX.field853 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1283[var32 + var34 - var42 - 1] * (long) IOYFKQTX.field851[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1283[var34 - var43 - 1] * (long) IOYFKQTX.field851[1][var43] >> 16);
						}

						field1283[var34] = var41;
						var31 = field1280.method6(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1279.method364(0, var31 / 65536.0F);
					var33 = field1279.method364(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1283[var32 + var34 - var45 - 1] * (long) IOYFKQTX.field851[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1283[var34 - var46 - 1] * (long) IOYFKQTX.field851[1][var46] >> 16);
					}

					field1283[var34] = var44;
					field1280.method6(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1283[var48] < -32768) {
				field1283[var48] = -32768;
			}

			if (field1283[var48] > 32767) {
				field1283[var48] = 32767;
			}
		}

		return field1283;
	}

	@ObfuscatedName("UJYLHBCS.a(IIII)I")
	public final int method529(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field1285[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field1284[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("UJYLHBCS.a(BLEYMNCFMK;)V")
	public final void method530(EYMNCFMK arg0) {
		field1266 = new ANPSASQF();
		field1266.method3(arg0);
		field1267 = new ANPSASQF();
		field1267.method3(arg0);
		int var2 = arg0.method239();
		if (var2 != 0) {
			arg0.field679--;
			field1268 = new ANPSASQF();
			field1268.method3(arg0);
			field1269 = new ANPSASQF();
			field1269.method3(arg0);
		}

		int var3 = arg0.method239();
		if (var3 != 0) {
			arg0.field679--;
			field1270 = new ANPSASQF();
			field1270.method3(arg0);
			field1271 = new ANPSASQF();
			field1271.method3(arg0);
		}

		int var4 = arg0.method239();
		if (var4 != 0) {
			arg0.field679--;
			field1272 = new ANPSASQF();
			field1272.method3(arg0);
			field1273 = new ANPSASQF();
			field1273.method3(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method253();
			if (var6 == 0) {
				break;
			}

			field1274[var5] = var6;
			field1275[var5] = arg0.method252();
			field1276[var5] = arg0.method253();
		}

		field1277 = arg0.method253();
		field1278 = arg0.method253();
		field1281 = arg0.method241();
		field1282 = arg0.method241();
		field1279 = new IOYFKQTX();
		field1280 = new ANPSASQF();
		field1279.method365(field1280, arg0);
	}
}
