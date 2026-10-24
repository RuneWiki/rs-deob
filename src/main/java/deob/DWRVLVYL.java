package deob;

@ObfuscatedName("DWRVLVYL")
public class DWRVLVYL {

	@ObfuscatedName("DWRVLVYL.j")
	public int[] field638 = new int[5];

	@ObfuscatedName("DWRVLVYL.k")
	public int[] field639 = new int[5];

	@ObfuscatedName("DWRVLVYL.l")
	public int[] field640 = new int[5];

	@ObfuscatedName("DWRVLVYL.n")
	public int field642 = 100;

	@ObfuscatedName("DWRVLVYL.q")
	public int field645 = 500;

	@ObfuscatedName("DWRVLVYL.v")
	public static int[] field650 = new int[5];

	@ObfuscatedName("DWRVLVYL.w")
	public static int[] field651 = new int[5];

	@ObfuscatedName("DWRVLVYL.x")
	public static int[] field652 = new int[5];

	@ObfuscatedName("DWRVLVYL.y")
	public static int[] field653 = new int[5];

	@ObfuscatedName("DWRVLVYL.z")
	public static int[] field654 = new int[5];

	@ObfuscatedName("DWRVLVYL.m")
	public int field641;

	@ObfuscatedName("DWRVLVYL.r")
	public int field646;

	@ObfuscatedName("DWRVLVYL.o")
	public EWUYFKZT field643;

	@ObfuscatedName("DWRVLVYL.b")
	public VRTTZTTM field630;

	@ObfuscatedName("DWRVLVYL.c")
	public VRTTZTTM field631;

	@ObfuscatedName("DWRVLVYL.d")
	public VRTTZTTM field632;

	@ObfuscatedName("DWRVLVYL.e")
	public VRTTZTTM field633;

	@ObfuscatedName("DWRVLVYL.f")
	public VRTTZTTM field634;

	@ObfuscatedName("DWRVLVYL.g")
	public VRTTZTTM field635;

	@ObfuscatedName("DWRVLVYL.h")
	public VRTTZTTM field636;

	@ObfuscatedName("DWRVLVYL.i")
	public VRTTZTTM field637;

	@ObfuscatedName("DWRVLVYL.p")
	public VRTTZTTM field644;

	@ObfuscatedName("DWRVLVYL.s")
	public static int[] field647;

	@ObfuscatedName("DWRVLVYL.t")
	public static int[] field648;

	@ObfuscatedName("DWRVLVYL.u")
	public static int[] field649;

	@ObfuscatedName("DWRVLVYL.a()V")
	public static final void method188() {
		field648 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field648[var0] = 1;
			} else {
				field648[var0] = -1;
			}
		}

		field649 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field649[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field647 = new int[220500];
	}

	@ObfuscatedName("DWRVLVYL.a(II)[I")
	public final int[] method189(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field647[var3] = 0;
		}

		if (arg1 < 10) {
			return field647;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field630.method584();
		field631.method584();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field632 != null) {
			field632.method584();
			field633.method584();
			var6 = (int) ((field632.field1420 - field632.field1419) * 32.768D / var4);
			var7 = (int) (field632.field1419 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field634 != null) {
			field634.method584();
			field635.method584();
			var9 = (int) ((field634.field1420 - field634.field1419) * 32.768D / var4);
			var10 = (int) (field634.field1419 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field638[var12] != 0) {
				field650[var12] = 0;
				field651[var12] = (int) (field640[var12] * var4);
				field652[var12] = (field638[var12] << 14) / 100;
				field653[var12] = (int) ((field630.field1420 - field630.field1419) * 32.768D * Math.pow(1.0057929410678534D, field639[var12]) / var4);
				field654[var12] = (int) (field630.field1419 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field630.method585(arg0);
			int var15 = field631.method585(arg0);

			if (field632 != null) {
				int var16 = field632.method585(arg0);
				int var17 = field633.method585(arg0);
				var14 += method190(field632.field1421, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field634 != null) {
				int var18 = field634.method585(arg0);
				int var19 = field635.method585(arg0);
				var15 = var15 * ((method190(field634.field1421, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field638[var20] != 0) {
					int var21 = field651[var20] + var13;
					if (var21 < arg0) {
						field647[var21] += method190(field630.field1421, field652[var20] * var15 >> 15, field650[var20]);
						field650[var20] += (field653[var20] * var14 >> 16) + field654[var20];
					}
				}
			}
		}

		if (field636 != null) {
			field636.method584();
			field637.method584();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field636.method585(arg0);
				int var27 = field637.method585(arg0);
				int var28;
				if (var24) {
					var28 = ((field636.field1420 - field636.field1419) * var26 >> 8) + field636.field1419;
				} else {
					var28 = ((field636.field1420 - field636.field1419) * var27 >> 8) + field636.field1419;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field647[var25] = 0;
				}
			}
		}

		if (field641 > 0 && field642 > 0) {
			int var29 = (int) (field641 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field647[var30] += field647[var30 - var29] * field642 / 100;
			}
		}

		if (field643.field671[0] > 0 || field643.field671[1] > 0) {
			field644.method584();
			int var31 = field644.method585(arg0 + 1);
			int var32 = field643.method195(0, var31 / 65536.0F);
			int var33 = field643.method195(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field647[var32 + var34] * (long) EWUYFKZT.field678 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field647[var32 + var34 - var37 - 1] * (long) EWUYFKZT.field676[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field647[var34 - var38 - 1] * (long) EWUYFKZT.field676[1][var38] >> 16);
					}

					field647[var34] = var36;
					var31 = field644.method585(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field647[var32 + var34] * (long) EWUYFKZT.field678 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field647[var32 + var34 - var42 - 1] * (long) EWUYFKZT.field676[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field647[var34 - var43 - 1] * (long) EWUYFKZT.field676[1][var43] >> 16);
						}

						field647[var34] = var41;
						var31 = field644.method585(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field643.method195(0, var31 / 65536.0F);
					var33 = field643.method195(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field647[var32 + var34 - var45 - 1] * (long) EWUYFKZT.field676[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field647[var34 - var46 - 1] * (long) EWUYFKZT.field676[1][var46] >> 16);
					}

					field647[var34] = var44;
					field644.method585(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field647[var48] < -32768) {
				field647[var48] = -32768;
			}

			if (field647[var48] > 32767) {
				field647[var48] = 32767;
			}
		}

		return field647;
	}

	@ObfuscatedName("DWRVLVYL.a(IIZI)I")
	public final int method190(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field649[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field648[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("DWRVLVYL.a(LTKPFKOXP;B)V")
	public final void method191(TKPFKOXP arg0) {
		field630 = new VRTTZTTM();
		field630.method582(arg0);
		field631 = new VRTTZTTM();
		field631.method582(arg0);
		int var2 = arg0.method529();
		if (var2 != 0) {
			arg0.field1382--;
			field632 = new VRTTZTTM();
			field632.method582(arg0);
			field633 = new VRTTZTTM();
			field633.method582(arg0);
		}

		int var3 = arg0.method529();
		if (var3 != 0) {
			arg0.field1382--;
			field634 = new VRTTZTTM();
			field634.method582(arg0);
			field635 = new VRTTZTTM();
			field635.method582(arg0);
		}

		int var4 = arg0.method529();
		if (var4 != 0) {
			arg0.field1382--;
			field636 = new VRTTZTTM();
			field636.method582(arg0);
			field637 = new VRTTZTTM();
			field637.method582(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method543();
			if (var6 == 0) {
				break;
			}

			field638[var5] = var6;
			field639[var5] = arg0.method542();
			field640[var5] = arg0.method543();
		}

		field641 = arg0.method543();
		field642 = arg0.method543();
		field645 = arg0.method531();
		field646 = arg0.method531();
		field643 = new EWUYFKZT();
		field644 = new VRTTZTTM();
		field643.method196(arg0, field644);
	}
}
