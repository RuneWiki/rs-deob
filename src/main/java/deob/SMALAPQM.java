package deob;

@ObfuscatedName("SMALAPQM")
public class SMALAPQM {

	@ObfuscatedName("SMALAPQM.j")
	public int[] field1195 = new int[5];

	@ObfuscatedName("SMALAPQM.k")
	public int[] field1196 = new int[5];

	@ObfuscatedName("SMALAPQM.l")
	public int[] field1197 = new int[5];

	@ObfuscatedName("SMALAPQM.n")
	public int field1199 = 100;

	@ObfuscatedName("SMALAPQM.q")
	public int field1202 = 500;

	@ObfuscatedName("SMALAPQM.v")
	public static int[] field1207 = new int[5];

	@ObfuscatedName("SMALAPQM.w")
	public static int[] field1208 = new int[5];

	@ObfuscatedName("SMALAPQM.x")
	public static int[] field1209 = new int[5];

	@ObfuscatedName("SMALAPQM.y")
	public static int[] field1210 = new int[5];

	@ObfuscatedName("SMALAPQM.z")
	public static int[] field1211 = new int[5];

	@ObfuscatedName("SMALAPQM.m")
	public int field1198;

	@ObfuscatedName("SMALAPQM.r")
	public int field1203;

	@ObfuscatedName("SMALAPQM.b")
	public AUPOWMGG field1187;

	@ObfuscatedName("SMALAPQM.c")
	public AUPOWMGG field1188;

	@ObfuscatedName("SMALAPQM.d")
	public AUPOWMGG field1189;

	@ObfuscatedName("SMALAPQM.e")
	public AUPOWMGG field1190;

	@ObfuscatedName("SMALAPQM.f")
	public AUPOWMGG field1191;

	@ObfuscatedName("SMALAPQM.g")
	public AUPOWMGG field1192;

	@ObfuscatedName("SMALAPQM.h")
	public AUPOWMGG field1193;

	@ObfuscatedName("SMALAPQM.i")
	public AUPOWMGG field1194;

	@ObfuscatedName("SMALAPQM.p")
	public AUPOWMGG field1201;

	@ObfuscatedName("SMALAPQM.o")
	public PKLJDULJ field1200;

	@ObfuscatedName("SMALAPQM.s")
	public static int[] field1204;

	@ObfuscatedName("SMALAPQM.t")
	public static int[] field1205;

	@ObfuscatedName("SMALAPQM.u")
	public static int[] field1206;

	@ObfuscatedName("SMALAPQM.a()V")
	public static final void method444() {
		field1205 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1205[var0] = 1;
			} else {
				field1205[var0] = -1;
			}
		}

		field1206 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1206[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1204 = new int[220500];
	}

	@ObfuscatedName("SMALAPQM.a(II)[I")
	public final int[] method445(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1204[var3] = 0;
		}

		if (arg1 < 10) {
			return field1204;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1187.method3();
		field1188.method3();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1189 != null) {
			field1189.method3();
			field1190.method3();
			var6 = (int) ((field1189.field5 - field1189.field4) * 32.768D / var4);
			var7 = (int) (field1189.field4 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1191 != null) {
			field1191.method3();
			field1192.method3();
			var9 = (int) ((field1191.field5 - field1191.field4) * 32.768D / var4);
			var10 = (int) (field1191.field4 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1195[var12] != 0) {
				field1207[var12] = 0;
				field1208[var12] = (int) (field1197[var12] * var4);
				field1209[var12] = (field1195[var12] << 14) / 100;
				field1210[var12] = (int) ((field1187.field5 - field1187.field4) * 32.768D * Math.pow(1.0057929410678534D, field1196[var12]) / var4);
				field1211[var12] = (int) (field1187.field4 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1187.method4(arg0);
			int var15 = field1188.method4(arg0);

			if (field1189 != null) {
				int var16 = field1189.method4(arg0);
				int var17 = field1190.method4(arg0);
				var14 += method446(var17, var8, field1189.field6) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1191 != null) {
				int var18 = field1191.method4(arg0);
				int var19 = field1192.method4(arg0);
				var15 = var15 * ((method446(var19, var11, field1191.field6) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1195[var20] != 0) {
					int var21 = field1208[var20] + var13;
					if (var21 < arg0) {
						field1204[var21] += method446(field1209[var20] * var15 >> 15, field1207[var20], field1187.field6);
						field1207[var20] += (field1210[var20] * var14 >> 16) + field1211[var20];
					}
				}
			}
		}

		if (field1193 != null) {
			field1193.method3();
			field1194.method3();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1193.method4(arg0);
				int var27 = field1194.method4(arg0);
				int var28;
				if (var24) {
					var28 = ((field1193.field5 - field1193.field4) * var26 >> 8) + field1193.field4;
				} else {
					var28 = ((field1193.field5 - field1193.field4) * var27 >> 8) + field1193.field4;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1204[var25] = 0;
				}
			}
		}

		if (field1198 > 0 && field1199 > 0) {
			int var29 = (int) (field1198 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1204[var30] += field1204[var30 - var29] * field1199 / 100;
			}
		}

		if (field1200.field1049[0] > 0 || field1200.field1049[1] > 0) {
			field1201.method3();
			int var31 = field1201.method4(arg0 + 1);
			int var32 = field1200.method424(var31 / 65536.0F, 0);
			int var33 = field1200.method424(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1204[var32 + var34] * (long) PKLJDULJ.field1056 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1204[var32 + var34 - var37 - 1] * (long) PKLJDULJ.field1054[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1204[var34 - var38 - 1] * (long) PKLJDULJ.field1054[1][var38] >> 16);
					}

					field1204[var34] = var36;
					var31 = field1201.method4(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1204[var32 + var34] * (long) PKLJDULJ.field1056 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1204[var32 + var34 - var42 - 1] * (long) PKLJDULJ.field1054[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1204[var34 - var43 - 1] * (long) PKLJDULJ.field1054[1][var43] >> 16);
						}

						field1204[var34] = var41;
						var31 = field1201.method4(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1200.method424(var31 / 65536.0F, 0);
					var33 = field1200.method424(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1204[var32 + var34 - var45 - 1] * (long) PKLJDULJ.field1054[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1204[var34 - var46 - 1] * (long) PKLJDULJ.field1054[1][var46] >> 16);
					}

					field1204[var34] = var44;
					field1201.method4(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1204[var48] < -32768) {
				field1204[var48] = -32768;
			}

			if (field1204[var48] > 32767) {
				field1204[var48] = 32767;
			}
		}

		return field1204;
	}

	@ObfuscatedName("SMALAPQM.a(BIII)I")
	public final int method446(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return field1206[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return field1205[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("SMALAPQM.a(ZLNHEPCMLW;)V")
	public final void method447(NHEPCMLW arg0) {
		field1187 = new AUPOWMGG();
		field1187.method1(arg0);
		field1188 = new AUPOWMGG();
		field1188.method1(arg0);
		int var2 = arg0.method349();
		if (var2 != 0) {
			arg0.field965--;
			field1189 = new AUPOWMGG();
			field1189.method1(arg0);
			field1190 = new AUPOWMGG();
			field1190.method1(arg0);
		}

		int var3 = arg0.method349();
		if (var3 != 0) {
			arg0.field965--;
			field1191 = new AUPOWMGG();
			field1191.method1(arg0);
			field1192 = new AUPOWMGG();
			field1192.method1(arg0);
		}

		int var4 = arg0.method349();
		if (var4 != 0) {
			arg0.field965--;
			field1193 = new AUPOWMGG();
			field1193.method1(arg0);
			field1194 = new AUPOWMGG();
			field1194.method1(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method363();
			if (var6 == 0) {
				break;
			}

			field1195[var5] = var6;
			field1196[var5] = arg0.method362();
			field1197[var5] = arg0.method363();
		}

		field1198 = arg0.method363();
		field1199 = arg0.method363();
		field1202 = arg0.method351();
		field1203 = arg0.method351();
		field1200 = new PKLJDULJ();
		field1201 = new AUPOWMGG();
		field1200.method425(arg0, field1201);
	}
}
