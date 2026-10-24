package deob;

@ObfuscatedName("EPJTEXKD")
public class EPJTEXKD {

	@ObfuscatedName("EPJTEXKD.f")
	public int field538 = -1;

	@ObfuscatedName("EPJTEXKD.g")
	public boolean field539 = false;

	@ObfuscatedName("EPJTEXKD.h")
	public boolean field540 = true;

	@ObfuscatedName("EPJTEXKD.b")
	public static int field534;

	@ObfuscatedName("EPJTEXKD.e")
	public int field537;

	@ObfuscatedName("EPJTEXKD.i")
	public int field541;

	@ObfuscatedName("EPJTEXKD.j")
	public int field542;

	@ObfuscatedName("EPJTEXKD.k")
	public int field543;

	@ObfuscatedName("EPJTEXKD.l")
	public int field544;

	@ObfuscatedName("EPJTEXKD.m")
	public int field545;

	@ObfuscatedName("EPJTEXKD.n")
	public int field546;

	@ObfuscatedName("EPJTEXKD.d")
	public String field536;

	@ObfuscatedName("EPJTEXKD.c")
	public static EPJTEXKD[] field535;

	@ObfuscatedName("EPJTEXKD.a(LWEMOPWVJ;I)V")
	public static void method171(WEMOPWVJ arg0) {
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("flo.dat", null));
		field534 = var1.method463();
		if (field535 == null) {
			field535 = new EPJTEXKD[field534];
		}

		for (int var2 = 0; var2 < field534; var2++) {
			if (field535[var2] == null) {
				field535[var2] = new EPJTEXKD();
			}

			field535[var2].method172(var1);
		}
	}

	@ObfuscatedName("EPJTEXKD.a(ILSVWJKJVI;)V")
	public void method172(SVWJKJVI arg0) {
		while (true) {
			int var2 = arg0.method461();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field537 = arg0.method465();
				method173(field537);
			} else if (var2 == 2) {
				field538 = arg0.method461();
			} else if (var2 == 3) {
				field539 = true;
			} else if (var2 == 5) {
				field540 = false;
			} else if (var2 == 6) {
				field536 = arg0.method468();
			} else if (var2 == 7) {
				int var3 = field541;
				int var4 = field542;
				int var5 = field543;
				int var6 = field544;
				int var7 = arg0.method465();
				method173(var7);
				field541 = var3;
				field542 = var4;
				field543 = var5;
				field544 = var6;
				field545 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("EPJTEXKD.a(II)V")
	public void method173(int arg0) {
		if (arg0 == 0xFF00FF) {
			arg0 = 0;
		}

		double var2 = (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		field541 = (int) (var12 * 256.0D);
		field542 = (int) (var14 * 256.0D);
		field543 = (int) (var16 * 256.0D);

		if (field542 < 0) {
			field542 = 0;
		} else if (field542 > 255) {
			field542 = 255;
		}

		if (field543 < 0) {
			field543 = 0;
		} else if (field543 > 255) {
			field543 = 255;
		}

		if (var16 > 0.5D) {
			field545 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field545 = (int) (var14 * var16 * 512.0D);
		}

		if (field545 < 1) {
			field545 = 1;
		}

		field544 = (int) (field545 * var12);
		int var18 = field541 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field542 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field543 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field546 = method174(var18, var19, var20);
	}

	@ObfuscatedName("EPJTEXKD.a(III)I")
	public final int method174(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}

		if (arg2 > 192) {
			arg1 /= 2;
		}

		if (arg2 > 217) {
			arg1 /= 2;
		}

		if (arg2 > 243) {
			arg1 /= 2;
		}

		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}
}
