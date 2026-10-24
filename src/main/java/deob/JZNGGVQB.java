package deob;

@ObfuscatedName("JZNGGVQB")
public class JZNGGVQB {

	@ObfuscatedName("JZNGGVQB.h")
	public int field751 = -1;

	@ObfuscatedName("JZNGGVQB.i")
	public boolean field752 = false;

	@ObfuscatedName("JZNGGVQB.j")
	public boolean field753 = true;

	@ObfuscatedName("JZNGGVQB.d")
	public static int field747;

	@ObfuscatedName("JZNGGVQB.g")
	public int field750;

	@ObfuscatedName("JZNGGVQB.k")
	public int field754;

	@ObfuscatedName("JZNGGVQB.l")
	public int field755;

	@ObfuscatedName("JZNGGVQB.m")
	public int field756;

	@ObfuscatedName("JZNGGVQB.n")
	public int field757;

	@ObfuscatedName("JZNGGVQB.o")
	public int field758;

	@ObfuscatedName("JZNGGVQB.p")
	public int field759;

	@ObfuscatedName("JZNGGVQB.f")
	public String field749;

	@ObfuscatedName("JZNGGVQB.e")
	public static JZNGGVQB[] field748;

	@ObfuscatedName("JZNGGVQB.a(BLSXKKBWPU;)V")
	public static void method238(SXKKBWPU arg0) {
		TQYMAXSO var1 = new TQYMAXSO(arg0.method442("flo.dat", null));
		field747 = var1.method470();
		if (field748 == null) {
			field748 = new JZNGGVQB[field747];
		}

		for (int var2 = 0; var2 < field747; var2++) {
			if (field748[var2] == null) {
				field748[var2] = new JZNGGVQB();
			}

			field748[var2].method239(var1);
		}
	}

	@ObfuscatedName("JZNGGVQB.a(ILTQYMAXSO;)V")
	public void method239(TQYMAXSO arg0) {
		while (true) {
			int var2 = arg0.method468();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field750 = arg0.method472();
				method240(field750);
			} else if (var2 == 2) {
				field751 = arg0.method468();
			} else if (var2 == 3) {
				field752 = true;
			} else if (var2 == 5) {
				field753 = false;
			} else if (var2 == 6) {
				field749 = arg0.method475();
			} else if (var2 == 7) {
				int var3 = field754;
				int var4 = field755;
				int var5 = field756;
				int var6 = field757;
				int var7 = arg0.method472();
				method240(var7);
				field754 = var3;
				field755 = var4;
				field756 = var5;
				field757 = var6;
				field758 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("JZNGGVQB.a(II)V")
	public void method240(int arg0) {
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
		field754 = (int) (var12 * 256.0D);
		field755 = (int) (var14 * 256.0D);
		field756 = (int) (var16 * 256.0D);

		if (field755 < 0) {
			field755 = 0;
		} else if (field755 > 255) {
			field755 = 255;
		}

		if (field756 < 0) {
			field756 = 0;
		} else if (field756 > 255) {
			field756 = 255;
		}

		if (var16 > 0.5D) {
			field758 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field758 = (int) (var14 * var16 * 512.0D);
		}

		if (field758 < 1) {
			field758 = 1;
		}

		field757 = (int) (field758 * var12);
		int var18 = field754 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field755 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field756 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field759 = method241(var18, var19, var20);
	}

	@ObfuscatedName("JZNGGVQB.a(III)I")
	public final int method241(int arg0, int arg1, int arg2) {
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
