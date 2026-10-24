package deob;

@ObfuscatedName("YPPCWCLI")
public class YPPCWCLI {

	@ObfuscatedName("YPPCWCLI.m")
	public int[] field1413 = new int[5];

	@ObfuscatedName("YPPCWCLI.n")
	public int[] field1414 = new int[5];

	@ObfuscatedName("YPPCWCLI.o")
	public int[] field1415 = new int[5];

	@ObfuscatedName("YPPCWCLI.q")
	public int field1417 = 100;

	@ObfuscatedName("YPPCWCLI.t")
	public int field1420 = 500;

	@ObfuscatedName("YPPCWCLI.y")
	public static int[] field1425 = new int[5];

	@ObfuscatedName("YPPCWCLI.z")
	public static int[] field1426 = new int[5];

	@ObfuscatedName("YPPCWCLI.A")
	public static int[] field1427 = new int[5];

	@ObfuscatedName("YPPCWCLI.B")
	public static int[] field1428 = new int[5];

	@ObfuscatedName("YPPCWCLI.C")
	public static int[] field1429 = new int[5];

	@ObfuscatedName("YPPCWCLI.p")
	public int field1416;

	@ObfuscatedName("YPPCWCLI.u")
	public int field1421;

	@ObfuscatedName("YPPCWCLI.r")
	public ECVTLYGP field1418;

	@ObfuscatedName("YPPCWCLI.e")
	public NSRSHTPL field1405;

	@ObfuscatedName("YPPCWCLI.f")
	public NSRSHTPL field1406;

	@ObfuscatedName("YPPCWCLI.g")
	public NSRSHTPL field1407;

	@ObfuscatedName("YPPCWCLI.h")
	public NSRSHTPL field1408;

	@ObfuscatedName("YPPCWCLI.i")
	public NSRSHTPL field1409;

	@ObfuscatedName("YPPCWCLI.j")
	public NSRSHTPL field1410;

	@ObfuscatedName("YPPCWCLI.k")
	public NSRSHTPL field1411;

	@ObfuscatedName("YPPCWCLI.l")
	public NSRSHTPL field1412;

	@ObfuscatedName("YPPCWCLI.s")
	public NSRSHTPL field1419;

	@ObfuscatedName("YPPCWCLI.v")
	public static int[] field1422;

	@ObfuscatedName("YPPCWCLI.w")
	public static int[] field1423;

	@ObfuscatedName("YPPCWCLI.x")
	public static int[] field1424;

	@ObfuscatedName("YPPCWCLI.a()V")
	public static final void method585() {
		field1423 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1423[var0] = 1;
			} else {
				field1423[var0] = -1;
			}
		}

		field1424 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1424[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1422 = new int[220500];
	}

	@ObfuscatedName("YPPCWCLI.a(II)[I")
	public final int[] method586(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1422[var3] = 0;
		}

		if (arg1 < 10) {
			return field1422;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1405.method340();
		field1406.method340();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1407 != null) {
			field1407.method340();
			field1408.method340();
			var6 = (int) ((field1407.field940 - field1407.field939) * 32.768D / var4);
			var7 = (int) (field1407.field939 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1409 != null) {
			field1409.method340();
			field1410.method340();
			var9 = (int) ((field1409.field940 - field1409.field939) * 32.768D / var4);
			var10 = (int) (field1409.field939 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1413[var12] != 0) {
				field1425[var12] = 0;
				field1426[var12] = (int) (field1415[var12] * var4);
				field1427[var12] = (field1413[var12] << 14) / 100;
				field1428[var12] = (int) ((field1405.field940 - field1405.field939) * 32.768D * Math.pow(1.0057929410678534D, field1414[var12]) / var4);
				field1429[var12] = (int) (field1405.field939 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1405.method341(arg0);
			int var15 = field1406.method341(arg0);

			if (field1407 != null) {
				int var16 = field1407.method341(arg0);
				int var17 = field1408.method341(arg0);
				var14 += method587(var8, field1407.field941, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1409 != null) {
				int var18 = field1409.method341(arg0);
				int var19 = field1410.method341(arg0);
				var15 = var15 * ((method587(var11, field1409.field941, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1413[var20] != 0) {
					int var21 = field1426[var20] + var13;
					if (var21 < arg0) {
						field1422[var21] += method587(field1425[var20], field1405.field941, field1427[var20] * var15 >> 15);
						field1425[var20] += (field1428[var20] * var14 >> 16) + field1429[var20];
					}
				}
			}
		}

		if (field1411 != null) {
			field1411.method340();
			field1412.method340();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1411.method341(arg0);
				int var27 = field1412.method341(arg0);
				int var28;
				if (var24) {
					var28 = ((field1411.field940 - field1411.field939) * var26 >> 8) + field1411.field939;
				} else {
					var28 = ((field1411.field940 - field1411.field939) * var27 >> 8) + field1411.field939;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1422[var25] = 0;
				}
			}
		}

		if (field1416 > 0 && field1417 > 0) {
			int var29 = (int) (field1416 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1422[var30] += field1422[var30 - var29] * field1417 / 100;
			}
		}

		if (field1418.field632[0] > 0 || field1418.field632[1] > 0) {
			field1419.method340();
			int var31 = field1419.method341(arg0 + 1);
			int var32 = field1418.method197(0, var31 / 65536.0F);
			int var33 = field1418.method197(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1422[var32 + var34] * (long) ECVTLYGP.field639 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1422[var32 + var34 - var37 - 1] * (long) ECVTLYGP.field637[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1422[var34 - var38 - 1] * (long) ECVTLYGP.field637[1][var38] >> 16);
					}

					field1422[var34] = var36;
					var31 = field1419.method341(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1422[var32 + var34] * (long) ECVTLYGP.field639 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1422[var32 + var34 - var42 - 1] * (long) ECVTLYGP.field637[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1422[var34 - var43 - 1] * (long) ECVTLYGP.field637[1][var43] >> 16);
						}

						field1422[var34] = var41;
						var31 = field1419.method341(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1418.method197(0, var31 / 65536.0F);
					var33 = field1418.method197(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1422[var32 + var34 - var45 - 1] * (long) ECVTLYGP.field637[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1422[var34 - var46 - 1] * (long) ECVTLYGP.field637[1][var46] >> 16);
					}

					field1422[var34] = var44;
					field1419.method341(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1422[var48] < -32768) {
				field1422[var48] = -32768;
			}

			if (field1422[var48] > 32767) {
				field1422[var48] = 32767;
			}
		}

		return field1422;
	}

	@ObfuscatedName("YPPCWCLI.a(IIII)I")
	public final int method587(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field1424[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field1423[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("YPPCWCLI.a(BLYOXDZEVD;)V")
	public final void method588(YOXDZEVD arg0) {
		field1405 = new NSRSHTPL();
		field1405.method338(arg0);
		field1406 = new NSRSHTPL();
		field1406.method338(arg0);
		int var2 = arg0.method549();
		if (var2 != 0) {
			arg0.field1393--;
			field1407 = new NSRSHTPL();
			field1407.method338(arg0);
			field1408 = new NSRSHTPL();
			field1408.method338(arg0);
		}

		int var3 = arg0.method549();
		if (var3 != 0) {
			arg0.field1393--;
			field1409 = new NSRSHTPL();
			field1409.method338(arg0);
			field1410 = new NSRSHTPL();
			field1410.method338(arg0);
		}

		int var4 = arg0.method549();
		if (var4 != 0) {
			arg0.field1393--;
			field1411 = new NSRSHTPL();
			field1411.method338(arg0);
			field1412 = new NSRSHTPL();
			field1412.method338(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method563();
			if (var6 == 0) {
				break;
			}

			field1413[var5] = var6;
			field1414[var5] = arg0.method562();
			field1415[var5] = arg0.method563();
		}

		field1416 = arg0.method563();
		field1417 = arg0.method563();
		field1420 = arg0.method551();
		field1421 = arg0.method551();
		field1418 = new ECVTLYGP();
		field1419 = new NSRSHTPL();
		field1418.method198(arg0, field1419);
	}
}
