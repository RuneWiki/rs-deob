package deob;

@ObfuscatedName("RLHOXRLU")
public class RLHOXRLU {

	@ObfuscatedName("RLHOXRLU.l")
	public int[] field1187 = new int[5];

	@ObfuscatedName("RLHOXRLU.m")
	public int[] field1188 = new int[5];

	@ObfuscatedName("RLHOXRLU.n")
	public int[] field1189 = new int[5];

	@ObfuscatedName("RLHOXRLU.p")
	public int field1191 = 100;

	@ObfuscatedName("RLHOXRLU.s")
	public int field1194 = 500;

	@ObfuscatedName("RLHOXRLU.x")
	public static int[] field1199 = new int[5];

	@ObfuscatedName("RLHOXRLU.y")
	public static int[] field1200 = new int[5];

	@ObfuscatedName("RLHOXRLU.z")
	public static int[] field1201 = new int[5];

	@ObfuscatedName("RLHOXRLU.A")
	public static int[] field1202 = new int[5];

	@ObfuscatedName("RLHOXRLU.B")
	public static int[] field1203 = new int[5];

	@ObfuscatedName("RLHOXRLU.o")
	public int field1190;

	@ObfuscatedName("RLHOXRLU.t")
	public int field1195;

	@ObfuscatedName("RLHOXRLU.q")
	public RFLXBNRG field1192;

	@ObfuscatedName("RLHOXRLU.d")
	public VJXKRAVR field1179;

	@ObfuscatedName("RLHOXRLU.e")
	public VJXKRAVR field1180;

	@ObfuscatedName("RLHOXRLU.f")
	public VJXKRAVR field1181;

	@ObfuscatedName("RLHOXRLU.g")
	public VJXKRAVR field1182;

	@ObfuscatedName("RLHOXRLU.h")
	public VJXKRAVR field1183;

	@ObfuscatedName("RLHOXRLU.i")
	public VJXKRAVR field1184;

	@ObfuscatedName("RLHOXRLU.j")
	public VJXKRAVR field1185;

	@ObfuscatedName("RLHOXRLU.k")
	public VJXKRAVR field1186;

	@ObfuscatedName("RLHOXRLU.r")
	public VJXKRAVR field1193;

	@ObfuscatedName("RLHOXRLU.u")
	public static int[] field1196;

	@ObfuscatedName("RLHOXRLU.v")
	public static int[] field1197;

	@ObfuscatedName("RLHOXRLU.w")
	public static int[] field1198;

	@ObfuscatedName("RLHOXRLU.a()V")
	public static final void method441() {
		field1197 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1197[var0] = 1;
			} else {
				field1197[var0] = -1;
			}
		}

		field1198 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1198[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1196 = new int[220500];
	}

	@ObfuscatedName("RLHOXRLU.a(II)[I")
	public final int[] method442(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1196[var3] = 0;
		}

		if (arg1 < 10) {
			return field1196;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1179.method566();
		field1180.method566();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1181 != null) {
			field1181.method566();
			field1182.method566();
			var6 = (int) ((field1181.field1377 - field1181.field1376) * 32.768D / var4);
			var7 = (int) (field1181.field1376 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1183 != null) {
			field1183.method566();
			field1184.method566();
			var9 = (int) ((field1183.field1377 - field1183.field1376) * 32.768D / var4);
			var10 = (int) (field1183.field1376 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1187[var12] != 0) {
				field1199[var12] = 0;
				field1200[var12] = (int) (field1189[var12] * var4);
				field1201[var12] = (field1187[var12] << 14) / 100;
				field1202[var12] = (int) ((field1179.field1377 - field1179.field1376) * 32.768D * Math.pow(1.0057929410678534D, field1188[var12]) / var4);
				field1203[var12] = (int) (field1179.field1376 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1179.method567(arg0);
			int var15 = field1180.method567(arg0);

			if (field1181 != null) {
				int var16 = field1181.method567(arg0);
				int var17 = field1182.method567(arg0);
				var14 += method443(field1181.field1378, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1183 != null) {
				int var18 = field1183.method567(arg0);
				int var19 = field1184.method567(arg0);
				var15 = var15 * ((method443(field1183.field1378, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1187[var20] != 0) {
					int var21 = field1200[var20] + var13;
					if (var21 < arg0) {
						field1196[var21] += method443(field1179.field1378, field1201[var20] * var15 >> 15, field1199[var20]);
						field1199[var20] += (field1202[var20] * var14 >> 16) + field1203[var20];
					}
				}
			}
		}

		if (field1185 != null) {
			field1185.method566();
			field1186.method566();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1185.method567(arg0);
				int var27 = field1186.method567(arg0);
				int var28;
				if (var24) {
					var28 = ((field1185.field1377 - field1185.field1376) * var26 >> 8) + field1185.field1376;
				} else {
					var28 = ((field1185.field1377 - field1185.field1376) * var27 >> 8) + field1185.field1376;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1196[var25] = 0;
				}
			}
		}

		if (field1190 > 0 && field1191 > 0) {
			int var29 = (int) (field1190 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1196[var30] += field1196[var30 - var29] * field1191 / 100;
			}
		}

		if (field1192.field1153[0] > 0 || field1192.field1153[1] > 0) {
			field1193.method566();
			int var31 = field1193.method567(arg0 + 1);
			int var32 = field1192.method439(0, var31 / 65536.0F);
			int var33 = field1192.method439(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1196[var32 + var34] * (long) RFLXBNRG.field1160 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1196[var32 + var34 - var37 - 1] * (long) RFLXBNRG.field1158[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1196[var34 - var38 - 1] * (long) RFLXBNRG.field1158[1][var38] >> 16);
					}

					field1196[var34] = var36;
					var31 = field1193.method567(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1196[var32 + var34] * (long) RFLXBNRG.field1160 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1196[var32 + var34 - var42 - 1] * (long) RFLXBNRG.field1158[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1196[var34 - var43 - 1] * (long) RFLXBNRG.field1158[1][var43] >> 16);
						}

						field1196[var34] = var41;
						var31 = field1193.method567(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1192.method439(0, var31 / 65536.0F);
					var33 = field1192.method439(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1196[var32 + var34 - var45 - 1] * (long) RFLXBNRG.field1158[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1196[var34 - var46 - 1] * (long) RFLXBNRG.field1158[1][var46] >> 16);
					}

					field1196[var34] = var44;
					field1193.method567(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1196[var48] < -32768) {
				field1196[var48] = -32768;
			}

			if (field1196[var48] > 32767) {
				field1196[var48] = 32767;
			}
		}

		return field1196;
	}

	@ObfuscatedName("RLHOXRLU.a(IIII)I")
	public final int method443(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field1198[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field1197[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("RLHOXRLU.a(LMLYYHULT;B)V")
	public final void method444(MLYYHULT arg0) {
		field1179 = new VJXKRAVR();
		field1179.method564(arg0);
		field1180 = new VJXKRAVR();
		field1180.method564(arg0);
		int var2 = arg0.method296();
		if (var2 != 0) {
			arg0.field963--;
			field1181 = new VJXKRAVR();
			field1181.method564(arg0);
			field1182 = new VJXKRAVR();
			field1182.method564(arg0);
		}

		int var3 = arg0.method296();
		if (var3 != 0) {
			arg0.field963--;
			field1183 = new VJXKRAVR();
			field1183.method564(arg0);
			field1184 = new VJXKRAVR();
			field1184.method564(arg0);
		}

		int var4 = arg0.method296();
		if (var4 != 0) {
			arg0.field963--;
			field1185 = new VJXKRAVR();
			field1185.method564(arg0);
			field1186 = new VJXKRAVR();
			field1186.method564(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method310();
			if (var6 == 0) {
				break;
			}

			field1187[var5] = var6;
			field1188[var5] = arg0.method309();
			field1189[var5] = arg0.method310();
		}

		field1190 = arg0.method310();
		field1191 = arg0.method310();
		field1194 = arg0.method298();
		field1195 = arg0.method298();
		field1192 = new RFLXBNRG();
		field1193 = new VJXKRAVR();
		field1192.method440(field1193, arg0);
	}
}
