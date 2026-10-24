package deob;

@ObfuscatedName("ILFXQDER")
public class ILFXQDER {

	@ObfuscatedName("ILFXQDER.l")
	public int[] field753 = new int[5];

	@ObfuscatedName("ILFXQDER.m")
	public int[] field754 = new int[5];

	@ObfuscatedName("ILFXQDER.n")
	public int[] field755 = new int[5];

	@ObfuscatedName("ILFXQDER.p")
	public int field757 = 100;

	@ObfuscatedName("ILFXQDER.s")
	public int field760 = 500;

	@ObfuscatedName("ILFXQDER.x")
	public static int[] field765 = new int[5];

	@ObfuscatedName("ILFXQDER.y")
	public static int[] field766 = new int[5];

	@ObfuscatedName("ILFXQDER.z")
	public static int[] field767 = new int[5];

	@ObfuscatedName("ILFXQDER.A")
	public static int[] field768 = new int[5];

	@ObfuscatedName("ILFXQDER.B")
	public static int[] field769 = new int[5];

	@ObfuscatedName("ILFXQDER.o")
	public int field756;

	@ObfuscatedName("ILFXQDER.t")
	public int field761;

	@ObfuscatedName("ILFXQDER.d")
	public UHTSXKVU field745;

	@ObfuscatedName("ILFXQDER.e")
	public UHTSXKVU field746;

	@ObfuscatedName("ILFXQDER.f")
	public UHTSXKVU field747;

	@ObfuscatedName("ILFXQDER.g")
	public UHTSXKVU field748;

	@ObfuscatedName("ILFXQDER.h")
	public UHTSXKVU field749;

	@ObfuscatedName("ILFXQDER.i")
	public UHTSXKVU field750;

	@ObfuscatedName("ILFXQDER.j")
	public UHTSXKVU field751;

	@ObfuscatedName("ILFXQDER.k")
	public UHTSXKVU field752;

	@ObfuscatedName("ILFXQDER.r")
	public UHTSXKVU field759;

	@ObfuscatedName("ILFXQDER.q")
	public XSKZRAYI field758;

	@ObfuscatedName("ILFXQDER.u")
	public static int[] field762;

	@ObfuscatedName("ILFXQDER.v")
	public static int[] field763;

	@ObfuscatedName("ILFXQDER.w")
	public static int[] field764;

	@ObfuscatedName("ILFXQDER.a()V")
	public static final void method224() {
		field763 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field763[var0] = 1;
			} else {
				field763[var0] = -1;
			}
		}

		field764 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field764[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field762 = new int[220500];
	}

	@ObfuscatedName("ILFXQDER.a(II)[I")
	public final int[] method225(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field762[var3] = 0;
		}

		if (arg1 < 10) {
			return field762;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field745.method447();
		field746.method447();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field747 != null) {
			field747.method447();
			field748.method447();
			var6 = (int) ((field747.field1138 - field747.field1137) * 32.768D / var4);
			var7 = (int) (field747.field1137 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field749 != null) {
			field749.method447();
			field750.method447();
			var9 = (int) ((field749.field1138 - field749.field1137) * 32.768D / var4);
			var10 = (int) (field749.field1137 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field753[var12] != 0) {
				field765[var12] = 0;
				field766[var12] = (int) (field755[var12] * var4);
				field767[var12] = (field753[var12] << 14) / 100;
				field768[var12] = (int) ((field745.field1138 - field745.field1137) * 32.768D * Math.pow(1.0057929410678534D, field754[var12]) / var4);
				field769[var12] = (int) (field745.field1137 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field745.method448(arg0);
			int var15 = field746.method448(arg0);

			if (field747 != null) {
				int var16 = field747.method448(arg0);
				int var17 = field748.method448(arg0);
				var14 += method226(var17, var8, field747.field1139) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field749 != null) {
				int var18 = field749.method448(arg0);
				int var19 = field750.method448(arg0);
				var15 = var15 * ((method226(var19, var11, field749.field1139) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field753[var20] != 0) {
					int var21 = field766[var20] + var13;
					if (var21 < arg0) {
						field762[var21] += method226(field767[var20] * var15 >> 15, field765[var20], field745.field1139);
						field765[var20] += (field768[var20] * var14 >> 16) + field769[var20];
					}
				}
			}
		}

		if (field751 != null) {
			field751.method447();
			field752.method447();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field751.method448(arg0);
				int var27 = field752.method448(arg0);
				int var28;
				if (var24) {
					var28 = ((field751.field1138 - field751.field1137) * var26 >> 8) + field751.field1137;
				} else {
					var28 = ((field751.field1138 - field751.field1137) * var27 >> 8) + field751.field1137;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field762[var25] = 0;
				}
			}
		}

		if (field756 > 0 && field757 > 0) {
			int var29 = (int) (field756 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field762[var30] += field762[var30 - var29] * field757 / 100;
			}
		}

		if (field758.field1344[0] > 0 || field758.field1344[1] > 0) {
			field759.method447();
			int var31 = field759.method448(arg0 + 1);
			int var32 = field758.method534(0, var31 / 65536.0F);
			int var33 = field758.method534(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field762[var32 + var34] * (long) XSKZRAYI.field1351 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field762[var32 + var34 - var37 - 1] * (long) XSKZRAYI.field1349[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field762[var34 - var38 - 1] * (long) XSKZRAYI.field1349[1][var38] >> 16);
					}

					field762[var34] = var36;
					var31 = field759.method448(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field762[var32 + var34] * (long) XSKZRAYI.field1351 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field762[var32 + var34 - var42 - 1] * (long) XSKZRAYI.field1349[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field762[var34 - var43 - 1] * (long) XSKZRAYI.field1349[1][var43] >> 16);
						}

						field762[var34] = var41;
						var31 = field759.method448(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field758.method534(0, var31 / 65536.0F);
					var33 = field758.method534(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field762[var32 + var34 - var45 - 1] * (long) XSKZRAYI.field1349[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field762[var34 - var46 - 1] * (long) XSKZRAYI.field1349[1][var46] >> 16);
					}

					field762[var34] = var44;
					field759.method448(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field762[var48] < -32768) {
				field762[var48] = -32768;
			}

			if (field762[var48] > 32767) {
				field762[var48] = 32767;
			}
		}

		return field762;
	}

	@ObfuscatedName("ILFXQDER.a(IIIB)I")
	public final int method226(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return field764[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return field763[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("ILFXQDER.a(LRSWRPCHR;B)V")
	public final void method227(RSWRPCHR arg0) {
		field745 = new UHTSXKVU();
		field745.method445(arg0);
		field746 = new UHTSXKVU();
		field746.method445(arg0);
		int var2 = arg0.method388();
		if (var2 != 0) {
			arg0.field1038--;
			field747 = new UHTSXKVU();
			field747.method445(arg0);
			field748 = new UHTSXKVU();
			field748.method445(arg0);
		}

		int var3 = arg0.method388();
		if (var3 != 0) {
			arg0.field1038--;
			field749 = new UHTSXKVU();
			field749.method445(arg0);
			field750 = new UHTSXKVU();
			field750.method445(arg0);
		}

		int var4 = arg0.method388();
		if (var4 != 0) {
			arg0.field1038--;
			field751 = new UHTSXKVU();
			field751.method445(arg0);
			field752 = new UHTSXKVU();
			field752.method445(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method402();
			if (var6 == 0) {
				break;
			}

			field753[var5] = var6;
			field754[var5] = arg0.method401();
			field755[var5] = arg0.method402();
		}

		field756 = arg0.method402();
		field757 = arg0.method402();
		field760 = arg0.method390();
		field761 = arg0.method390();
		field758 = new XSKZRAYI();
		field759 = new UHTSXKVU();
		field758.method535(field759, arg0);
	}
}
