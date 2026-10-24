package deob;

@ObfuscatedName("GOLZJDMQ")
public class GOLZJDMQ {

	@ObfuscatedName("GOLZJDMQ.g")
	public int field725 = -1;

	@ObfuscatedName("GOLZJDMQ.h")
	public boolean field726 = false;

	@ObfuscatedName("GOLZJDMQ.i")
	public boolean field727 = true;

	@ObfuscatedName("GOLZJDMQ.c")
	public static int field721;

	@ObfuscatedName("GOLZJDMQ.f")
	public int field724;

	@ObfuscatedName("GOLZJDMQ.j")
	public int field728;

	@ObfuscatedName("GOLZJDMQ.k")
	public int field729;

	@ObfuscatedName("GOLZJDMQ.l")
	public int field730;

	@ObfuscatedName("GOLZJDMQ.m")
	public int field731;

	@ObfuscatedName("GOLZJDMQ.n")
	public int field732;

	@ObfuscatedName("GOLZJDMQ.o")
	public int field733;

	@ObfuscatedName("GOLZJDMQ.e")
	public String field723;

	@ObfuscatedName("GOLZJDMQ.d")
	public static GOLZJDMQ[] field722;

	@ObfuscatedName("GOLZJDMQ.a(ILUUIGNTAD;)V")
	public static void method295(UUIGNTAD arg0) {
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("flo.dat", null));
		field721 = var1.method196();
		if (field722 == null) {
			field722 = new GOLZJDMQ[field721];
		}

		for (int var2 = 0; var2 < field721; var2++) {
			if (field722[var2] == null) {
				field722[var2] = new GOLZJDMQ();
			}

			field722[var2].method296(var1);
		}
	}

	@ObfuscatedName("GOLZJDMQ.a(LCMGGUSPR;I)V")
	public void method296(CMGGUSPR arg0) {
		while (true) {
			int var2 = arg0.method194();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field724 = arg0.method198();
				method297(field724);
			} else if (var2 == 2) {
				field725 = arg0.method194();
			} else if (var2 == 3) {
				field726 = true;
			} else if (var2 == 5) {
				field727 = false;
			} else if (var2 == 6) {
				field723 = arg0.method201();
			} else if (var2 == 7) {
				int var3 = field728;
				int var4 = field729;
				int var5 = field730;
				int var6 = field731;
				int var7 = arg0.method198();
				method297(var7);
				field728 = var3;
				field729 = var4;
				field730 = var5;
				field731 = var6;
				field732 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("GOLZJDMQ.a(II)V")
	public void method297(int arg0) {
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
		field728 = (int) (var12 * 256.0D);
		field729 = (int) (var14 * 256.0D);
		field730 = (int) (var16 * 256.0D);

		if (field729 < 0) {
			field729 = 0;
		} else if (field729 > 255) {
			field729 = 255;
		}

		if (field730 < 0) {
			field730 = 0;
		} else if (field730 > 255) {
			field730 = 255;
		}

		if (var16 > 0.5D) {
			field732 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field732 = (int) (var14 * var16 * 512.0D);
		}

		if (field732 < 1) {
			field732 = 1;
		}

		field731 = (int) (field732 * var12);
		int var18 = field728 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field729 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field730 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field733 = method298(var18, var19, var20);
	}

	@ObfuscatedName("GOLZJDMQ.a(III)I")
	public final int method298(int arg0, int arg1, int arg2) {
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
