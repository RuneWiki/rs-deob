package deob;

@ObfuscatedName("KMJDCQND")
public class KMJDCQND {

	@ObfuscatedName("KMJDCQND.k")
	public int[] field954 = new int[5];

	@ObfuscatedName("KMJDCQND.l")
	public int[] field955 = new int[5];

	@ObfuscatedName("KMJDCQND.m")
	public int[] field956 = new int[5];

	@ObfuscatedName("KMJDCQND.o")
	public int field958 = 100;

	@ObfuscatedName("KMJDCQND.r")
	public int field961 = 500;

	@ObfuscatedName("KMJDCQND.w")
	public static int[] field966 = new int[5];

	@ObfuscatedName("KMJDCQND.x")
	public static int[] field967 = new int[5];

	@ObfuscatedName("KMJDCQND.y")
	public static int[] field968 = new int[5];

	@ObfuscatedName("KMJDCQND.z")
	public static int[] field969 = new int[5];

	@ObfuscatedName("KMJDCQND.A")
	public static int[] field970 = new int[5];

	@ObfuscatedName("KMJDCQND.n")
	public int field957;

	@ObfuscatedName("KMJDCQND.s")
	public int field962;

	@ObfuscatedName("KMJDCQND.c")
	public KMZLAUEV field946;

	@ObfuscatedName("KMJDCQND.d")
	public KMZLAUEV field947;

	@ObfuscatedName("KMJDCQND.e")
	public KMZLAUEV field948;

	@ObfuscatedName("KMJDCQND.f")
	public KMZLAUEV field949;

	@ObfuscatedName("KMJDCQND.g")
	public KMZLAUEV field950;

	@ObfuscatedName("KMJDCQND.h")
	public KMZLAUEV field951;

	@ObfuscatedName("KMJDCQND.i")
	public KMZLAUEV field952;

	@ObfuscatedName("KMJDCQND.j")
	public KMZLAUEV field953;

	@ObfuscatedName("KMJDCQND.q")
	public KMZLAUEV field960;

	@ObfuscatedName("KMJDCQND.p")
	public QEWPNZTS field959;

	@ObfuscatedName("KMJDCQND.t")
	public static int[] field963;

	@ObfuscatedName("KMJDCQND.u")
	public static int[] field964;

	@ObfuscatedName("KMJDCQND.v")
	public static int[] field965;

	@ObfuscatedName("KMJDCQND.a()V")
	public static final void method390() {
		field964 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field964[var0] = 1;
			} else {
				field964[var0] = -1;
			}
		}

		field965 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field965[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field963 = new int[220500];
	}

	@ObfuscatedName("KMJDCQND.a(II)[I")
	public final int[] method391(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field963[var3] = 0;
		}

		if (arg1 < 10) {
			return field963;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field946.method396();
		field947.method396();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field948 != null) {
			field948.method396();
			field949.method396();
			var6 = (int) ((field948.field975 - field948.field974) * 32.768D / var4);
			var7 = (int) (field948.field974 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field950 != null) {
			field950.method396();
			field951.method396();
			var9 = (int) ((field950.field975 - field950.field974) * 32.768D / var4);
			var10 = (int) (field950.field974 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field954[var12] != 0) {
				field966[var12] = 0;
				field967[var12] = (int) (field956[var12] * var4);
				field968[var12] = (field954[var12] << 14) / 100;
				field969[var12] = (int) ((field946.field975 - field946.field974) * 32.768D * Math.pow(1.0057929410678534D, field955[var12]) / var4);
				field970[var12] = (int) (field946.field974 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field946.method397(arg0);
			int var15 = field947.method397(arg0);

			if (field948 != null) {
				int var16 = field948.method397(arg0);
				int var17 = field949.method397(arg0);
				var14 += method392(var8, var17, field948.field976) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field950 != null) {
				int var18 = field950.method397(arg0);
				int var19 = field951.method397(arg0);
				var15 = var15 * ((method392(var11, var19, field950.field976) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field954[var20] != 0) {
					int var21 = field967[var20] + var13;
					if (var21 < arg0) {
						field963[var21] += method392(field966[var20], field968[var20] * var15 >> 15, field946.field976);
						field966[var20] += (field969[var20] * var14 >> 16) + field970[var20];
					}
				}
			}
		}

		if (field952 != null) {
			field952.method396();
			field953.method396();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field952.method397(arg0);
				int var27 = field953.method397(arg0);
				int var28;
				if (var24) {
					var28 = ((field952.field975 - field952.field974) * var26 >> 8) + field952.field974;
				} else {
					var28 = ((field952.field975 - field952.field974) * var27 >> 8) + field952.field974;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field963[var25] = 0;
				}
			}
		}

		if (field957 > 0 && field958 > 0) {
			int var29 = (int) (field957 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field963[var30] += field963[var30 - var29] * field958 / 100;
			}
		}

		if (field959.field1117[0] > 0 || field959.field1117[1] > 0) {
			field960.method396();
			int var31 = field960.method397(arg0 + 1);
			int var32 = field959.method498(var31 / 65536.0F, 0);
			int var33 = field959.method498(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field963[var32 + var34] * (long) QEWPNZTS.field1124 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field963[var32 + var34 - var37 - 1] * (long) QEWPNZTS.field1122[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field963[var34 - var38 - 1] * (long) QEWPNZTS.field1122[1][var38] >> 16);
					}

					field963[var34] = var36;
					var31 = field960.method397(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field963[var32 + var34] * (long) QEWPNZTS.field1124 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field963[var32 + var34 - var42 - 1] * (long) QEWPNZTS.field1122[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field963[var34 - var43 - 1] * (long) QEWPNZTS.field1122[1][var43] >> 16);
						}

						field963[var34] = var41;
						var31 = field960.method397(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field959.method498(var31 / 65536.0F, 0);
					var33 = field959.method498(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field963[var32 + var34 - var45 - 1] * (long) QEWPNZTS.field1122[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field963[var34 - var46 - 1] * (long) QEWPNZTS.field1122[1][var46] >> 16);
					}

					field963[var34] = var44;
					field960.method397(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field963[var48] < -32768) {
				field963[var48] = -32768;
			}

			if (field963[var48] > 32767) {
				field963[var48] = 32767;
			}
		}

		return field963;
	}

	@ObfuscatedName("KMJDCQND.a(IIII)I")
	public final int method392(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg2 == 2) {
			return field965[arg0 & 0x7FFF] * arg1 >> 14;
		}

		if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg2 == 4) {
			return field964[arg0 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("KMJDCQND.a(LKHOMSBHW;I)V")
	public final void method393(KHOMSBHW arg0) {
		field946 = new KMZLAUEV();
		field946.method394(arg0);
		field947 = new KMZLAUEV();
		field947.method394(arg0);
		int var2 = arg0.method349();
		if (var2 != 0) {
			arg0.field934--;
			field948 = new KMZLAUEV();
			field948.method394(arg0);
			field949 = new KMZLAUEV();
			field949.method394(arg0);
		}

		int var3 = arg0.method349();
		if (var3 != 0) {
			arg0.field934--;
			field950 = new KMZLAUEV();
			field950.method394(arg0);
			field951 = new KMZLAUEV();
			field951.method394(arg0);
		}

		int var4 = arg0.method349();
		if (var4 != 0) {
			arg0.field934--;
			field952 = new KMZLAUEV();
			field952.method394(arg0);
			field953 = new KMZLAUEV();
			field953.method394(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method363();
			if (var6 == 0) {
				break;
			}

			field954[var5] = var6;
			field955[var5] = arg0.method362();
			field956[var5] = arg0.method363();
		}

		field957 = arg0.method363();
		field958 = arg0.method363();
		field961 = arg0.method351();
		field962 = arg0.method351();
		field959 = new QEWPNZTS();
		field960 = new KMZLAUEV();
		field959.method499(field960, arg0);
	}
}
