package deob;

@ObfuscatedName("UHNEGZAI")
public class UHNEGZAI {

	@ObfuscatedName("UHNEGZAI.k")
	public int[] field1281 = new int[5];

	@ObfuscatedName("UHNEGZAI.l")
	public int[] field1282 = new int[5];

	@ObfuscatedName("UHNEGZAI.m")
	public int[] field1283 = new int[5];

	@ObfuscatedName("UHNEGZAI.o")
	public int field1285 = 100;

	@ObfuscatedName("UHNEGZAI.r")
	public int field1288 = 500;

	@ObfuscatedName("UHNEGZAI.w")
	public static int[] field1293 = new int[5];

	@ObfuscatedName("UHNEGZAI.x")
	public static int[] field1294 = new int[5];

	@ObfuscatedName("UHNEGZAI.y")
	public static int[] field1295 = new int[5];

	@ObfuscatedName("UHNEGZAI.z")
	public static int[] field1296 = new int[5];

	@ObfuscatedName("UHNEGZAI.A")
	public static int[] field1297 = new int[5];

	@ObfuscatedName("UHNEGZAI.n")
	public int field1284;

	@ObfuscatedName("UHNEGZAI.s")
	public int field1289;

	@ObfuscatedName("UHNEGZAI.c")
	public GJKLDIZT field1273;

	@ObfuscatedName("UHNEGZAI.d")
	public GJKLDIZT field1274;

	@ObfuscatedName("UHNEGZAI.e")
	public GJKLDIZT field1275;

	@ObfuscatedName("UHNEGZAI.f")
	public GJKLDIZT field1276;

	@ObfuscatedName("UHNEGZAI.g")
	public GJKLDIZT field1277;

	@ObfuscatedName("UHNEGZAI.h")
	public GJKLDIZT field1278;

	@ObfuscatedName("UHNEGZAI.i")
	public GJKLDIZT field1279;

	@ObfuscatedName("UHNEGZAI.j")
	public GJKLDIZT field1280;

	@ObfuscatedName("UHNEGZAI.q")
	public GJKLDIZT field1287;

	@ObfuscatedName("UHNEGZAI.p")
	public GLZZOSSI field1286;

	@ObfuscatedName("UHNEGZAI.t")
	public static int[] field1290;

	@ObfuscatedName("UHNEGZAI.u")
	public static int[] field1291;

	@ObfuscatedName("UHNEGZAI.v")
	public static int[] field1292;

	@ObfuscatedName("UHNEGZAI.a()V")
	public static final void method458() {
		field1291 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1291[var0] = 1;
			} else {
				field1291[var0] = -1;
			}
		}

		field1292 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1292[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1290 = new int[220500];
	}

	@ObfuscatedName("UHNEGZAI.a(II)[I")
	public final int[] method459(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1290[var3] = 0;
		}

		if (arg1 < 10) {
			return field1290;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1273.method249();
		field1274.method249();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1275 != null) {
			field1275.method249();
			field1276.method249();
			var6 = (int) ((field1275.field597 - field1275.field596) * 32.768D / var4);
			var7 = (int) (field1275.field596 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1277 != null) {
			field1277.method249();
			field1278.method249();
			var9 = (int) ((field1277.field597 - field1277.field596) * 32.768D / var4);
			var10 = (int) (field1277.field596 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1281[var12] != 0) {
				field1293[var12] = 0;
				field1294[var12] = (int) (field1283[var12] * var4);
				field1295[var12] = (field1281[var12] << 14) / 100;
				field1296[var12] = (int) ((field1273.field597 - field1273.field596) * 32.768D * Math.pow(1.0057929410678534D, field1282[var12]) / var4);
				field1297[var12] = (int) (field1273.field596 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1273.method250(arg0);
			int var15 = field1274.method250(arg0);

			if (field1275 != null) {
				int var16 = field1275.method250(arg0);
				int var17 = field1276.method250(arg0);
				var14 += method460(var17, field1275.field598, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1277 != null) {
				int var18 = field1277.method250(arg0);
				int var19 = field1278.method250(arg0);
				var15 = var15 * ((method460(var19, field1277.field598, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1281[var20] != 0) {
					int var21 = field1294[var20] + var13;
					if (var21 < arg0) {
						field1290[var21] += method460(field1295[var20] * var15 >> 15, field1273.field598, field1293[var20]);
						field1293[var20] += (field1296[var20] * var14 >> 16) + field1297[var20];
					}
				}
			}
		}

		if (field1279 != null) {
			field1279.method249();
			field1280.method249();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1279.method250(arg0);
				int var27 = field1280.method250(arg0);
				int var28;
				if (var24) {
					var28 = ((field1279.field597 - field1279.field596) * var26 >> 8) + field1279.field596;
				} else {
					var28 = ((field1279.field597 - field1279.field596) * var27 >> 8) + field1279.field596;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1290[var25] = 0;
				}
			}
		}

		if (field1284 > 0 && field1285 > 0) {
			int var29 = (int) (field1284 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1290[var30] += field1290[var30 - var29] * field1285 / 100;
			}
		}

		if (field1286.field604[0] > 0 || field1286.field604[1] > 0) {
			field1287.method249();
			int var31 = field1287.method250(arg0 + 1);
			int var32 = field1286.method254(0, var31 / 65536.0F);
			int var33 = field1286.method254(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1290[var32 + var34] * (long) GLZZOSSI.field611 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1290[var32 + var34 - var37 - 1] * (long) GLZZOSSI.field609[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1290[var34 - var38 - 1] * (long) GLZZOSSI.field609[1][var38] >> 16);
					}

					field1290[var34] = var36;
					var31 = field1287.method250(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1290[var32 + var34] * (long) GLZZOSSI.field611 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1290[var32 + var34 - var42 - 1] * (long) GLZZOSSI.field609[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1290[var34 - var43 - 1] * (long) GLZZOSSI.field609[1][var43] >> 16);
						}

						field1290[var34] = var41;
						var31 = field1287.method250(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1286.method254(0, var31 / 65536.0F);
					var33 = field1286.method254(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1290[var32 + var34 - var45 - 1] * (long) GLZZOSSI.field609[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1290[var34 - var46 - 1] * (long) GLZZOSSI.field609[1][var46] >> 16);
					}

					field1290[var34] = var44;
					field1287.method250(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1290[var48] < -32768) {
				field1290[var48] = -32768;
			}

			if (field1290[var48] > 32767) {
				field1290[var48] = 32767;
			}
		}

		return field1290;
	}

	@ObfuscatedName("UHNEGZAI.a(BIII)I")
	public final int method460(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field1292[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field1291[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("UHNEGZAI.a(LDNRIFKTO;I)V")
	public final void method461(DNRIFKTO arg0) {
		field1273 = new GJKLDIZT();
		field1273.method247(arg0);
		field1274 = new GJKLDIZT();
		field1274.method247(arg0);
		int var2 = arg0.method189();
		if (var2 != 0) {
			arg0.field563--;
			field1275 = new GJKLDIZT();
			field1275.method247(arg0);
			field1276 = new GJKLDIZT();
			field1276.method247(arg0);
		}

		int var3 = arg0.method189();
		if (var3 != 0) {
			arg0.field563--;
			field1277 = new GJKLDIZT();
			field1277.method247(arg0);
			field1278 = new GJKLDIZT();
			field1278.method247(arg0);
		}

		int var4 = arg0.method189();
		if (var4 != 0) {
			arg0.field563--;
			field1279 = new GJKLDIZT();
			field1279.method247(arg0);
			field1280 = new GJKLDIZT();
			field1280.method247(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method203();
			if (var6 == 0) {
				break;
			}

			field1281[var5] = var6;
			field1282[var5] = arg0.method202();
			field1283[var5] = arg0.method203();
		}

		field1284 = arg0.method203();
		field1285 = arg0.method203();
		field1288 = arg0.method191();
		field1289 = arg0.method191();
		field1286 = new GLZZOSSI();
		field1287 = new GJKLDIZT();
		field1286.method255(arg0, field1287);
	}
}
