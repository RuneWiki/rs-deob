package deob;

@ObfuscatedName("VCSQFXER")
public class VCSQFXER {

	@ObfuscatedName("VCSQFXER.j")
	public int[] field1290 = new int[5];

	@ObfuscatedName("VCSQFXER.k")
	public int[] field1291 = new int[5];

	@ObfuscatedName("VCSQFXER.l")
	public int[] field1292 = new int[5];

	@ObfuscatedName("VCSQFXER.n")
	public int field1294 = 100;

	@ObfuscatedName("VCSQFXER.q")
	public int field1297 = 500;

	@ObfuscatedName("VCSQFXER.v")
	public static int[] field1302 = new int[5];

	@ObfuscatedName("VCSQFXER.w")
	public static int[] field1303 = new int[5];

	@ObfuscatedName("VCSQFXER.x")
	public static int[] field1304 = new int[5];

	@ObfuscatedName("VCSQFXER.y")
	public static int[] field1305 = new int[5];

	@ObfuscatedName("VCSQFXER.z")
	public static int[] field1306 = new int[5];

	@ObfuscatedName("VCSQFXER.m")
	public int field1293;

	@ObfuscatedName("VCSQFXER.r")
	public int field1298;

	@ObfuscatedName("VCSQFXER.b")
	public BJGBRRBX field1282;

	@ObfuscatedName("VCSQFXER.c")
	public BJGBRRBX field1283;

	@ObfuscatedName("VCSQFXER.d")
	public BJGBRRBX field1284;

	@ObfuscatedName("VCSQFXER.e")
	public BJGBRRBX field1285;

	@ObfuscatedName("VCSQFXER.f")
	public BJGBRRBX field1286;

	@ObfuscatedName("VCSQFXER.g")
	public BJGBRRBX field1287;

	@ObfuscatedName("VCSQFXER.h")
	public BJGBRRBX field1288;

	@ObfuscatedName("VCSQFXER.i")
	public BJGBRRBX field1289;

	@ObfuscatedName("VCSQFXER.p")
	public BJGBRRBX field1296;

	@ObfuscatedName("VCSQFXER.o")
	public STQKONHX field1295;

	@ObfuscatedName("VCSQFXER.s")
	public static int[] field1299;

	@ObfuscatedName("VCSQFXER.t")
	public static int[] field1300;

	@ObfuscatedName("VCSQFXER.u")
	public static int[] field1301;

	@ObfuscatedName("VCSQFXER.a()V")
	public static final void method521() {
		field1300 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1300[var0] = 1;
			} else {
				field1300[var0] = -1;
			}
		}

		field1301 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1301[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1299 = new int[220500];
	}

	@ObfuscatedName("VCSQFXER.a(II)[I")
	public final int[] method522(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1299[var3] = 0;
		}

		if (arg1 < 10) {
			return field1299;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1282.method93();
		field1283.method93();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1284 != null) {
			field1284.method93();
			field1285.method93();
			var6 = (int) ((field1284.field26 - field1284.field25) * 32.768D / var4);
			var7 = (int) (field1284.field25 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1286 != null) {
			field1286.method93();
			field1287.method93();
			var9 = (int) ((field1286.field26 - field1286.field25) * 32.768D / var4);
			var10 = (int) (field1286.field25 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1290[var12] != 0) {
				field1302[var12] = 0;
				field1303[var12] = (int) (field1292[var12] * var4);
				field1304[var12] = (field1290[var12] << 14) / 100;
				field1305[var12] = (int) ((field1282.field26 - field1282.field25) * 32.768D * Math.pow(1.0057929410678534D, field1291[var12]) / var4);
				field1306[var12] = (int) (field1282.field25 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1282.method94(arg0);
			int var15 = field1283.method94(arg0);

			if (field1284 != null) {
				int var16 = field1284.method94(arg0);
				int var17 = field1285.method94(arg0);
				var14 += method523(var8, var17, field1284.field27) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1286 != null) {
				int var18 = field1286.method94(arg0);
				int var19 = field1287.method94(arg0);
				var15 = var15 * ((method523(var11, var19, field1286.field27) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1290[var20] != 0) {
					int var21 = field1303[var20] + var13;
					if (var21 < arg0) {
						field1299[var21] += method523(field1302[var20], field1304[var20] * var15 >> 15, field1282.field27);
						field1302[var20] += (field1305[var20] * var14 >> 16) + field1306[var20];
					}
				}
			}
		}

		if (field1288 != null) {
			field1288.method93();
			field1289.method93();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1288.method94(arg0);
				int var27 = field1289.method94(arg0);
				int var28;
				if (var24) {
					var28 = ((field1288.field26 - field1288.field25) * var26 >> 8) + field1288.field25;
				} else {
					var28 = ((field1288.field26 - field1288.field25) * var27 >> 8) + field1288.field25;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1299[var25] = 0;
				}
			}
		}

		if (field1293 > 0 && field1294 > 0) {
			int var29 = (int) (field1293 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1299[var30] += field1299[var30 - var29] * field1294 / 100;
			}
		}

		if (field1295.field1192[0] > 0 || field1295.field1192[1] > 0) {
			field1296.method93();
			int var31 = field1296.method94(arg0 + 1);
			int var32 = field1295.method512(0, var31 / 65536.0F);
			int var33 = field1295.method512(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1299[var32 + var34] * (long) STQKONHX.field1199 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1299[var32 + var34 - var37 - 1] * (long) STQKONHX.field1197[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1299[var34 - var38 - 1] * (long) STQKONHX.field1197[1][var38] >> 16);
					}

					field1299[var34] = var36;
					var31 = field1296.method94(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1299[var32 + var34] * (long) STQKONHX.field1199 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1299[var32 + var34 - var42 - 1] * (long) STQKONHX.field1197[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1299[var34 - var43 - 1] * (long) STQKONHX.field1197[1][var43] >> 16);
						}

						field1299[var34] = var41;
						var31 = field1296.method94(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1295.method512(0, var31 / 65536.0F);
					var33 = field1295.method512(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1299[var32 + var34 - var45 - 1] * (long) STQKONHX.field1197[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1299[var34 - var46 - 1] * (long) STQKONHX.field1197[1][var46] >> 16);
					}

					field1299[var34] = var44;
					field1296.method94(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1299[var48] < -32768) {
				field1299[var48] = -32768;
			}

			if (field1299[var48] > 32767) {
				field1299[var48] = 32767;
			}
		}

		return field1299;
	}

	@ObfuscatedName("VCSQFXER.a(IIII)I")
	public final int method523(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg2 == 2) {
			return field1301[arg0 & 0x7FFF] * arg1 >> 14;
		}

		if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg2 == 4) {
			return field1300[arg0 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("VCSQFXER.a(BLBFQIDHPO;)V")
	public final void method524(BFQIDHPO arg0) {
		field1282 = new BJGBRRBX();
		field1282.method91(arg0);
		field1283 = new BJGBRRBX();
		field1283.method91(arg0);
		int var2 = arg0.method54();
		if (var2 != 0) {
			arg0.field10--;
			field1284 = new BJGBRRBX();
			field1284.method91(arg0);
			field1285 = new BJGBRRBX();
			field1285.method91(arg0);
		}

		int var3 = arg0.method54();
		if (var3 != 0) {
			arg0.field10--;
			field1286 = new BJGBRRBX();
			field1286.method91(arg0);
			field1287 = new BJGBRRBX();
			field1287.method91(arg0);
		}

		int var4 = arg0.method54();
		if (var4 != 0) {
			arg0.field10--;
			field1288 = new BJGBRRBX();
			field1288.method91(arg0);
			field1289 = new BJGBRRBX();
			field1289.method91(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method68();
			if (var6 == 0) {
				break;
			}

			field1290[var5] = var6;
			field1291[var5] = arg0.method67();
			field1292[var5] = arg0.method68();
		}

		field1293 = arg0.method68();
		field1294 = arg0.method68();
		field1297 = arg0.method56();
		field1298 = arg0.method56();
		field1295 = new STQKONHX();
		field1296 = new BJGBRRBX();
		field1295.method513(field1296, arg0);
	}
}
