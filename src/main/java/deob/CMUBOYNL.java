package deob;

@ObfuscatedName("CMUBOYNL")
public class CMUBOYNL {

	@ObfuscatedName("CMUBOYNL.f")
	public int field534 = -1;

	@ObfuscatedName("CMUBOYNL.g")
	public boolean field535 = false;

	@ObfuscatedName("CMUBOYNL.h")
	public boolean field536 = true;

	@ObfuscatedName("CMUBOYNL.b")
	public static int field530;

	@ObfuscatedName("CMUBOYNL.e")
	public int field533;

	@ObfuscatedName("CMUBOYNL.i")
	public int field537;

	@ObfuscatedName("CMUBOYNL.j")
	public int field538;

	@ObfuscatedName("CMUBOYNL.k")
	public int field539;

	@ObfuscatedName("CMUBOYNL.l")
	public int field540;

	@ObfuscatedName("CMUBOYNL.m")
	public int field541;

	@ObfuscatedName("CMUBOYNL.n")
	public int field542;

	@ObfuscatedName("CMUBOYNL.d")
	public String field532;

	@ObfuscatedName("CMUBOYNL.c")
	public static CMUBOYNL[] field531;

	@ObfuscatedName("CMUBOYNL.a(ZLEAXVDNXA;)V")
	public static void method225(EAXVDNXA arg0) {
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("flo.dat", null));
		field530 = var1.method46();
		if (field531 == null) {
			field531 = new CMUBOYNL[field530];
		}

		for (int var2 = 0; var2 < field530; var2++) {
			if (field531[var2] == null) {
				field531[var2] = new CMUBOYNL();
			}

			field531[var2].method226(var1);
		}
	}

	@ObfuscatedName("CMUBOYNL.a(BLCKBTFRZM;)V")
	public void method226(CKBTFRZM arg0) {
		while (true) {
			int var2 = arg0.method44();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field533 = arg0.method48();
				method227(field533);
			} else if (var2 == 2) {
				field534 = arg0.method44();
			} else if (var2 == 3) {
				field535 = true;
			} else if (var2 == 5) {
				field536 = false;
			} else if (var2 == 6) {
				field532 = arg0.method51();
			} else if (var2 == 7) {
				int var3 = field537;
				int var4 = field538;
				int var5 = field539;
				int var6 = field540;
				int var7 = arg0.method48();
				method227(var7);
				field537 = var3;
				field538 = var4;
				field539 = var5;
				field540 = var6;
				field541 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("CMUBOYNL.a(II)V")
	public void method227(int arg0) {
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
		field537 = (int) (var12 * 256.0D);
		field538 = (int) (var14 * 256.0D);
		field539 = (int) (var16 * 256.0D);

		if (field538 < 0) {
			field538 = 0;
		} else if (field538 > 255) {
			field538 = 255;
		}

		if (field539 < 0) {
			field539 = 0;
		} else if (field539 > 255) {
			field539 = 255;
		}

		if (var16 > 0.5D) {
			field541 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field541 = (int) (var14 * var16 * 512.0D);
		}

		if (field541 < 1) {
			field541 = 1;
		}

		field540 = (int) (field541 * var12);
		int var18 = field537 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field538 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field539 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field542 = method228(var18, var19, var20);
	}

	@ObfuscatedName("CMUBOYNL.a(III)I")
	public final int method228(int arg0, int arg1, int arg2) {
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
