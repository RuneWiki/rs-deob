package deob;

@ObfuscatedName("LLJZJXBB")
public class LLJZJXBB {

	@ObfuscatedName("LLJZJXBB.j")
	public int[] field964 = new int[5];

	@ObfuscatedName("LLJZJXBB.k")
	public int[] field965 = new int[5];

	@ObfuscatedName("LLJZJXBB.l")
	public int[] field966 = new int[5];

	@ObfuscatedName("LLJZJXBB.n")
	public int field968 = 100;

	@ObfuscatedName("LLJZJXBB.q")
	public int field971 = 500;

	@ObfuscatedName("LLJZJXBB.v")
	public static int[] field976 = new int[5];

	@ObfuscatedName("LLJZJXBB.w")
	public static int[] field977 = new int[5];

	@ObfuscatedName("LLJZJXBB.x")
	public static int[] field978 = new int[5];

	@ObfuscatedName("LLJZJXBB.y")
	public static int[] field979 = new int[5];

	@ObfuscatedName("LLJZJXBB.z")
	public static int[] field980 = new int[5];

	@ObfuscatedName("LLJZJXBB.m")
	public int field967;

	@ObfuscatedName("LLJZJXBB.r")
	public int field972;

	@ObfuscatedName("LLJZJXBB.b")
	public UPKVWWFD field956;

	@ObfuscatedName("LLJZJXBB.c")
	public UPKVWWFD field957;

	@ObfuscatedName("LLJZJXBB.d")
	public UPKVWWFD field958;

	@ObfuscatedName("LLJZJXBB.e")
	public UPKVWWFD field959;

	@ObfuscatedName("LLJZJXBB.f")
	public UPKVWWFD field960;

	@ObfuscatedName("LLJZJXBB.g")
	public UPKVWWFD field961;

	@ObfuscatedName("LLJZJXBB.h")
	public UPKVWWFD field962;

	@ObfuscatedName("LLJZJXBB.i")
	public UPKVWWFD field963;

	@ObfuscatedName("LLJZJXBB.p")
	public UPKVWWFD field970;

	@ObfuscatedName("LLJZJXBB.o")
	public YSFPJPXV field969;

	@ObfuscatedName("LLJZJXBB.s")
	public static int[] field973;

	@ObfuscatedName("LLJZJXBB.t")
	public static int[] field974;

	@ObfuscatedName("LLJZJXBB.u")
	public static int[] field975;

	@ObfuscatedName("LLJZJXBB.a()V")
	public static final void method465() {
		field974 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field974[var0] = 1;
			} else {
				field974[var0] = -1;
			}
		}

		field975 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field975[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field973 = new int[220500];
	}

	@ObfuscatedName("LLJZJXBB.a(II)[I")
	public final int[] method466(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field973[var3] = 0;
		}

		if (arg1 < 10) {
			return field973;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field956.method551();
		field957.method551();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field958 != null) {
			field958.method551();
			field959.method551();
			var6 = (int) ((field958.field1340 - field958.field1339) * 32.768D / var4);
			var7 = (int) (field958.field1339 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field960 != null) {
			field960.method551();
			field961.method551();
			var9 = (int) ((field960.field1340 - field960.field1339) * 32.768D / var4);
			var10 = (int) (field960.field1339 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field964[var12] != 0) {
				field976[var12] = 0;
				field977[var12] = (int) (field966[var12] * var4);
				field978[var12] = (field964[var12] << 14) / 100;
				field979[var12] = (int) ((field956.field1340 - field956.field1339) * 32.768D * Math.pow(1.0057929410678534D, field965[var12]) / var4);
				field980[var12] = (int) (field956.field1339 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field956.method552(arg0);
			int var15 = field957.method552(arg0);

			if (field958 != null) {
				int var16 = field958.method552(arg0);
				int var17 = field959.method552(arg0);
				var14 += method467(var17, field958.field1341, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field960 != null) {
				int var18 = field960.method552(arg0);
				int var19 = field961.method552(arg0);
				var15 = var15 * ((method467(var19, field960.field1341, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field964[var20] != 0) {
					int var21 = field977[var20] + var13;
					if (var21 < arg0) {
						field973[var21] += method467(field978[var20] * var15 >> 15, field956.field1341, field976[var20]);
						field976[var20] += (field979[var20] * var14 >> 16) + field980[var20];
					}
				}
			}
		}

		if (field962 != null) {
			field962.method551();
			field963.method551();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field962.method552(arg0);
				int var27 = field963.method552(arg0);
				int var28;
				if (var24) {
					var28 = ((field962.field1340 - field962.field1339) * var26 >> 8) + field962.field1339;
				} else {
					var28 = ((field962.field1340 - field962.field1339) * var27 >> 8) + field962.field1339;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field973[var25] = 0;
				}
			}
		}

		if (field967 > 0 && field968 > 0) {
			int var29 = (int) (field967 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field973[var30] += field973[var30 - var29] * field968 / 100;
			}
		}

		if (field969.field1440[0] > 0 || field969.field1440[1] > 0) {
			field970.method551();
			int var31 = field970.method552(arg0 + 1);
			int var32 = field969.method586(0, var31 / 65536.0F);
			int var33 = field969.method586(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field973[var32 + var34] * (long) YSFPJPXV.field1447 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field973[var32 + var34 - var37 - 1] * (long) YSFPJPXV.field1445[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field973[var34 - var38 - 1] * (long) YSFPJPXV.field1445[1][var38] >> 16);
					}

					field973[var34] = var36;
					var31 = field970.method552(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field973[var32 + var34] * (long) YSFPJPXV.field1447 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field973[var32 + var34 - var42 - 1] * (long) YSFPJPXV.field1445[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field973[var34 - var43 - 1] * (long) YSFPJPXV.field1445[1][var43] >> 16);
						}

						field973[var34] = var41;
						var31 = field970.method552(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field969.method586(0, var31 / 65536.0F);
					var33 = field969.method586(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field973[var32 + var34 - var45 - 1] * (long) YSFPJPXV.field1445[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field973[var34 - var46 - 1] * (long) YSFPJPXV.field1445[1][var46] >> 16);
					}

					field973[var34] = var44;
					field970.method552(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field973[var48] < -32768) {
				field973[var48] = -32768;
			}

			if (field973[var48] > 32767) {
				field973[var48] = 32767;
			}
		}

		return field973;
	}

	@ObfuscatedName("LLJZJXBB.a(IIII)I")
	public final int method467(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field975[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field974[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("LLJZJXBB.a(LEGCCHUZS;Z)V")
	public final void method468(EGCCHUZS arg0) {
		field956 = new UPKVWWFD();
		field956.method549(arg0);
		field957 = new UPKVWWFD();
		field957.method549(arg0);
		int var2 = arg0.method261();
		if (var2 != 0) {
			arg0.field589--;
			field958 = new UPKVWWFD();
			field958.method549(arg0);
			field959 = new UPKVWWFD();
			field959.method549(arg0);
		}

		int var3 = arg0.method261();
		if (var3 != 0) {
			arg0.field589--;
			field960 = new UPKVWWFD();
			field960.method549(arg0);
			field961 = new UPKVWWFD();
			field961.method549(arg0);
		}

		int var4 = arg0.method261();
		if (var4 != 0) {
			arg0.field589--;
			field962 = new UPKVWWFD();
			field962.method549(arg0);
			field963 = new UPKVWWFD();
			field963.method549(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method275();
			if (var6 == 0) {
				break;
			}

			field964[var5] = var6;
			field965[var5] = arg0.method274();
			field966[var5] = arg0.method275();
		}

		field967 = arg0.method275();
		field968 = arg0.method275();
		field971 = arg0.method263();
		field972 = arg0.method263();
		field969 = new YSFPJPXV();
		field970 = new UPKVWWFD();
		field969.method587(arg0, field970);
	}
}
