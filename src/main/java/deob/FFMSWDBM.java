package deob;

@ObfuscatedName("FFMSWDBM")
public class FFMSWDBM {

	@ObfuscatedName("FFMSWDBM.i")
	public int[] field606 = new int[5];

	@ObfuscatedName("FFMSWDBM.j")
	public int[] field607 = new int[5];

	@ObfuscatedName("FFMSWDBM.k")
	public int[] field608 = new int[5];

	@ObfuscatedName("FFMSWDBM.m")
	public int field610 = 100;

	@ObfuscatedName("FFMSWDBM.p")
	public int field613 = 500;

	@ObfuscatedName("FFMSWDBM.u")
	public static int[] field618 = new int[5];

	@ObfuscatedName("FFMSWDBM.v")
	public static int[] field619 = new int[5];

	@ObfuscatedName("FFMSWDBM.w")
	public static int[] field620 = new int[5];

	@ObfuscatedName("FFMSWDBM.x")
	public static int[] field621 = new int[5];

	@ObfuscatedName("FFMSWDBM.y")
	public static int[] field622 = new int[5];

	@ObfuscatedName("FFMSWDBM.l")
	public int field609;

	@ObfuscatedName("FFMSWDBM.q")
	public int field614;

	@ObfuscatedName("FFMSWDBM.a")
	public HXORSAZH field598;

	@ObfuscatedName("FFMSWDBM.b")
	public HXORSAZH field599;

	@ObfuscatedName("FFMSWDBM.c")
	public HXORSAZH field600;

	@ObfuscatedName("FFMSWDBM.d")
	public HXORSAZH field601;

	@ObfuscatedName("FFMSWDBM.e")
	public HXORSAZH field602;

	@ObfuscatedName("FFMSWDBM.f")
	public HXORSAZH field603;

	@ObfuscatedName("FFMSWDBM.g")
	public HXORSAZH field604;

	@ObfuscatedName("FFMSWDBM.h")
	public HXORSAZH field605;

	@ObfuscatedName("FFMSWDBM.o")
	public HXORSAZH field612;

	@ObfuscatedName("FFMSWDBM.n")
	public ZENSICXR field611;

	@ObfuscatedName("FFMSWDBM.r")
	public static int[] field615;

	@ObfuscatedName("FFMSWDBM.s")
	public static int[] field616;

	@ObfuscatedName("FFMSWDBM.t")
	public static int[] field617;

	@ObfuscatedName("FFMSWDBM.a()V")
	public static final void method195() {
		field616 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field616[var0] = 1;
			} else {
				field616[var0] = -1;
			}
		}

		field617 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field617[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field615 = new int[220500];
	}

	@ObfuscatedName("FFMSWDBM.a(II)[I")
	public final int[] method196(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field615[var3] = 0;
		}

		if (arg1 < 10) {
			return field615;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field598.method224();
		field599.method224();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field600 != null) {
			field600.method224();
			field601.method224();
			var6 = (int) ((field600.field675 - field600.field674) * 32.768D / var4);
			var7 = (int) (field600.field674 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field602 != null) {
			field602.method224();
			field603.method224();
			var9 = (int) ((field602.field675 - field602.field674) * 32.768D / var4);
			var10 = (int) (field602.field674 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field606[var12] != 0) {
				field618[var12] = 0;
				field619[var12] = (int) (field608[var12] * var4);
				field620[var12] = (field606[var12] << 14) / 100;
				field621[var12] = (int) ((field598.field675 - field598.field674) * 32.768D * Math.pow(1.0057929410678534D, field607[var12]) / var4);
				field622[var12] = (int) (field598.field674 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field598.method225(arg0);
			int var15 = field599.method225(arg0);

			if (field600 != null) {
				int var16 = field600.method225(arg0);
				int var17 = field601.method225(arg0);
				var14 += method197(field600.field676, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field602 != null) {
				int var18 = field602.method225(arg0);
				int var19 = field603.method225(arg0);
				var15 = var15 * ((method197(field602.field676, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field606[var20] != 0) {
					int var21 = field619[var20] + var13;
					if (var21 < arg0) {
						field615[var21] += method197(field598.field676, field618[var20], field620[var20] * var15 >> 15);
						field618[var20] += (field621[var20] * var14 >> 16) + field622[var20];
					}
				}
			}
		}

		if (field604 != null) {
			field604.method224();
			field605.method224();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field604.method225(arg0);
				int var27 = field605.method225(arg0);
				int var28;
				if (var24) {
					var28 = ((field604.field675 - field604.field674) * var26 >> 8) + field604.field674;
				} else {
					var28 = ((field604.field675 - field604.field674) * var27 >> 8) + field604.field674;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field615[var25] = 0;
				}
			}
		}

		if (field609 > 0 && field610 > 0) {
			int var29 = (int) (field609 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field615[var30] += field615[var30 - var29] * field610 / 100;
			}
		}

		if (field611.field1494[0] > 0 || field611.field1494[1] > 0) {
			field612.method224();
			int var31 = field612.method225(arg0 + 1);
			int var32 = field611.method587(0, var31 / 65536.0F);
			int var33 = field611.method587(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field615[var32 + var34] * (long) ZENSICXR.field1501 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field615[var32 + var34 - var37 - 1] * (long) ZENSICXR.field1499[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field615[var34 - var38 - 1] * (long) ZENSICXR.field1499[1][var38] >> 16);
					}

					field615[var34] = var36;
					var31 = field612.method225(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field615[var32 + var34] * (long) ZENSICXR.field1501 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field615[var32 + var34 - var42 - 1] * (long) ZENSICXR.field1499[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field615[var34 - var43 - 1] * (long) ZENSICXR.field1499[1][var43] >> 16);
						}

						field615[var34] = var41;
						var31 = field612.method225(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field611.method587(0, var31 / 65536.0F);
					var33 = field611.method587(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field615[var32 + var34 - var45 - 1] * (long) ZENSICXR.field1499[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field615[var34 - var46 - 1] * (long) ZENSICXR.field1499[1][var46] >> 16);
					}

					field615[var34] = var44;
					field612.method225(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field615[var48] < -32768) {
				field615[var48] = -32768;
			}

			if (field615[var48] > 32767) {
				field615[var48] = 32767;
			}
		}

		return field615;
	}

	@ObfuscatedName("FFMSWDBM.a(IIII)I")
	public final int method197(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return field617[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return field616[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("FFMSWDBM.a(ILTQYMAXSO;)V")
	public final void method198(TQYMAXSO arg0) {
		field598 = new HXORSAZH();
		field598.method222(arg0);
		field599 = new HXORSAZH();
		field599.method222(arg0);
		int var2 = arg0.method468();
		if (var2 != 0) {
			arg0.field1263--;
			field600 = new HXORSAZH();
			field600.method222(arg0);
			field601 = new HXORSAZH();
			field601.method222(arg0);
		}

		int var3 = arg0.method468();
		if (var3 != 0) {
			arg0.field1263--;
			field602 = new HXORSAZH();
			field602.method222(arg0);
			field603 = new HXORSAZH();
			field603.method222(arg0);
		}

		int var4 = arg0.method468();
		if (var4 != 0) {
			arg0.field1263--;
			field604 = new HXORSAZH();
			field604.method222(arg0);
			field605 = new HXORSAZH();
			field605.method222(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method482();
			if (var6 == 0) {
				break;
			}

			field606[var5] = var6;
			field607[var5] = arg0.method481();
			field608[var5] = arg0.method482();
		}

		field609 = arg0.method482();
		field610 = arg0.method482();
		field613 = arg0.method470();
		field614 = arg0.method470();
		field611 = new ZENSICXR();
		field612 = new HXORSAZH();
		field611.method588(field612, arg0);
	}
}
