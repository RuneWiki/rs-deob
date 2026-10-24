package deob;

@ObfuscatedName("UFAEFFVJ")
public class UFAEFFVJ {

	@ObfuscatedName("UFAEFFVJ.l")
	public int[] field1205 = new int[5];

	@ObfuscatedName("UFAEFFVJ.m")
	public int[] field1206 = new int[5];

	@ObfuscatedName("UFAEFFVJ.n")
	public int[] field1207 = new int[5];

	@ObfuscatedName("UFAEFFVJ.p")
	public int field1209 = 100;

	@ObfuscatedName("UFAEFFVJ.s")
	public int field1212 = 500;

	@ObfuscatedName("UFAEFFVJ.x")
	public static int[] field1217 = new int[5];

	@ObfuscatedName("UFAEFFVJ.y")
	public static int[] field1218 = new int[5];

	@ObfuscatedName("UFAEFFVJ.z")
	public static int[] field1219 = new int[5];

	@ObfuscatedName("UFAEFFVJ.A")
	public static int[] field1220 = new int[5];

	@ObfuscatedName("UFAEFFVJ.B")
	public static int[] field1221 = new int[5];

	@ObfuscatedName("UFAEFFVJ.o")
	public int field1208;

	@ObfuscatedName("UFAEFFVJ.t")
	public int field1213;

	@ObfuscatedName("UFAEFFVJ.q")
	public IIXKZWNC field1210;

	@ObfuscatedName("UFAEFFVJ.d")
	public VQRBOQUI field1197;

	@ObfuscatedName("UFAEFFVJ.e")
	public VQRBOQUI field1198;

	@ObfuscatedName("UFAEFFVJ.f")
	public VQRBOQUI field1199;

	@ObfuscatedName("UFAEFFVJ.g")
	public VQRBOQUI field1200;

	@ObfuscatedName("UFAEFFVJ.h")
	public VQRBOQUI field1201;

	@ObfuscatedName("UFAEFFVJ.i")
	public VQRBOQUI field1202;

	@ObfuscatedName("UFAEFFVJ.j")
	public VQRBOQUI field1203;

	@ObfuscatedName("UFAEFFVJ.k")
	public VQRBOQUI field1204;

	@ObfuscatedName("UFAEFFVJ.r")
	public VQRBOQUI field1211;

	@ObfuscatedName("UFAEFFVJ.u")
	public static int[] field1214;

	@ObfuscatedName("UFAEFFVJ.v")
	public static int[] field1215;

	@ObfuscatedName("UFAEFFVJ.w")
	public static int[] field1216;

	@ObfuscatedName("UFAEFFVJ.a()V")
	public static final void method502() {
		field1215 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1215[var0] = 1;
			} else {
				field1215[var0] = -1;
			}
		}

		field1216 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1216[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1214 = new int[220500];
	}

	@ObfuscatedName("UFAEFFVJ.a(II)[I")
	public final int[] method503(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1214[var3] = 0;
		}

		if (arg1 < 10) {
			return field1214;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1197.method580();
		field1198.method580();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1199 != null) {
			field1199.method580();
			field1200.method580();
			var6 = (int) ((field1199.field1453 - field1199.field1452) * 32.768D / var4);
			var7 = (int) (field1199.field1452 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1201 != null) {
			field1201.method580();
			field1202.method580();
			var9 = (int) ((field1201.field1453 - field1201.field1452) * 32.768D / var4);
			var10 = (int) (field1201.field1452 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1205[var12] != 0) {
				field1217[var12] = 0;
				field1218[var12] = (int) (field1207[var12] * var4);
				field1219[var12] = (field1205[var12] << 14) / 100;
				field1220[var12] = (int) ((field1197.field1453 - field1197.field1452) * 32.768D * Math.pow(1.0057929410678534D, field1206[var12]) / var4);
				field1221[var12] = (int) (field1197.field1452 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1197.method581(arg0);
			int var15 = field1198.method581(arg0);

			if (field1199 != null) {
				int var16 = field1199.method581(arg0);
				int var17 = field1200.method581(arg0);
				var14 += method504(var17, var8, field1199.field1454) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1201 != null) {
				int var18 = field1201.method581(arg0);
				int var19 = field1202.method581(arg0);
				var15 = var15 * ((method504(var19, var11, field1201.field1454) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1205[var20] != 0) {
					int var21 = field1218[var20] + var13;
					if (var21 < arg0) {
						field1214[var21] += method504(field1219[var20] * var15 >> 15, field1217[var20], field1197.field1454);
						field1217[var20] += (field1220[var20] * var14 >> 16) + field1221[var20];
					}
				}
			}
		}

		if (field1203 != null) {
			field1203.method580();
			field1204.method580();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1203.method581(arg0);
				int var27 = field1204.method581(arg0);
				int var28;
				if (var24) {
					var28 = ((field1203.field1453 - field1203.field1452) * var26 >> 8) + field1203.field1452;
				} else {
					var28 = ((field1203.field1453 - field1203.field1452) * var27 >> 8) + field1203.field1452;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1214[var25] = 0;
				}
			}
		}

		if (field1208 > 0 && field1209 > 0) {
			int var29 = (int) (field1208 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1214[var30] += field1214[var30 - var29] * field1209 / 100;
			}
		}

		if (field1210.field925[0] > 0 || field1210.field925[1] > 0) {
			field1211.method580();
			int var31 = field1211.method581(arg0 + 1);
			int var32 = field1210.method397(var31 / 65536.0F, 0);
			int var33 = field1210.method397(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1214[var32 + var34] * (long) IIXKZWNC.field932 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1214[var32 + var34 - var37 - 1] * (long) IIXKZWNC.field930[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1214[var34 - var38 - 1] * (long) IIXKZWNC.field930[1][var38] >> 16);
					}

					field1214[var34] = var36;
					var31 = field1211.method581(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1214[var32 + var34] * (long) IIXKZWNC.field932 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1214[var32 + var34 - var42 - 1] * (long) IIXKZWNC.field930[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1214[var34 - var43 - 1] * (long) IIXKZWNC.field930[1][var43] >> 16);
						}

						field1214[var34] = var41;
						var31 = field1211.method581(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1210.method397(var31 / 65536.0F, 0);
					var33 = field1210.method397(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1214[var32 + var34 - var45 - 1] * (long) IIXKZWNC.field930[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1214[var34 - var46 - 1] * (long) IIXKZWNC.field930[1][var46] >> 16);
					}

					field1214[var34] = var44;
					field1211.method581(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1214[var48] < -32768) {
				field1214[var48] = -32768;
			}

			if (field1214[var48] > 32767) {
				field1214[var48] = 32767;
			}
		}

		return field1214;
	}

	@ObfuscatedName("UFAEFFVJ.a(IIII)I")
	public final int method504(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return field1216[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return field1215[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("UFAEFFVJ.a(BLCKBTFRZM;)V")
	public final void method505(CKBTFRZM arg0) {
		field1197 = new VQRBOQUI();
		field1197.method578(arg0);
		field1198 = new VQRBOQUI();
		field1198.method578(arg0);
		int var2 = arg0.method44();
		if (var2 != 0) {
			arg0.field92--;
			field1199 = new VQRBOQUI();
			field1199.method578(arg0);
			field1200 = new VQRBOQUI();
			field1200.method578(arg0);
		}

		int var3 = arg0.method44();
		if (var3 != 0) {
			arg0.field92--;
			field1201 = new VQRBOQUI();
			field1201.method578(arg0);
			field1202 = new VQRBOQUI();
			field1202.method578(arg0);
		}

		int var4 = arg0.method44();
		if (var4 != 0) {
			arg0.field92--;
			field1203 = new VQRBOQUI();
			field1203.method578(arg0);
			field1204 = new VQRBOQUI();
			field1204.method578(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method58();
			if (var6 == 0) {
				break;
			}

			field1205[var5] = var6;
			field1206[var5] = arg0.method57();
			field1207[var5] = arg0.method58();
		}

		field1208 = arg0.method58();
		field1209 = arg0.method58();
		field1212 = arg0.method46();
		field1213 = arg0.method46();
		field1210 = new IIXKZWNC();
		field1211 = new VQRBOQUI();
		field1210.method398(field1211, arg0);
	}
}
