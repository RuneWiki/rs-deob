package deob;

@ObfuscatedName("EIBTXPJE")
public class EIBTXPJE {

	@ObfuscatedName("EIBTXPJE.g")
	public int field559 = -1;

	@ObfuscatedName("EIBTXPJE.h")
	public boolean field560 = false;

	@ObfuscatedName("EIBTXPJE.i")
	public boolean field561 = true;

	@ObfuscatedName("EIBTXPJE.c")
	public static int field555;

	@ObfuscatedName("EIBTXPJE.f")
	public int field558;

	@ObfuscatedName("EIBTXPJE.j")
	public int field562;

	@ObfuscatedName("EIBTXPJE.k")
	public int field563;

	@ObfuscatedName("EIBTXPJE.l")
	public int field564;

	@ObfuscatedName("EIBTXPJE.m")
	public int field565;

	@ObfuscatedName("EIBTXPJE.n")
	public int field566;

	@ObfuscatedName("EIBTXPJE.o")
	public int field567;

	@ObfuscatedName("EIBTXPJE.e")
	public String field557;

	@ObfuscatedName("EIBTXPJE.d")
	public static EIBTXPJE[] field556;

	@ObfuscatedName("EIBTXPJE.a(LNXFIIFAD;I)V")
	public static void method187(NXFIIFAD arg0) {
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("flo.dat", null));
		field555 = var1.method388();
		if (field556 == null) {
			field556 = new EIBTXPJE[field555];
		}

		for (int var2 = 0; var2 < field555; var2++) {
			if (field556[var2] == null) {
				field556[var2] = new EIBTXPJE();
			}

			field556[var2].method188(var1);
		}
	}

	@ObfuscatedName("EIBTXPJE.a(LMNKDCXXG;I)V")
	public void method188(MNKDCXXG arg0) {
		while (true) {
			int var2 = arg0.method386();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field558 = arg0.method390();
				method189(field558);
			} else if (var2 == 2) {
				field559 = arg0.method386();
			} else if (var2 == 3) {
				field560 = true;
			} else if (var2 == 5) {
				field561 = false;
			} else if (var2 == 6) {
				field557 = arg0.method393();
			} else if (var2 == 7) {
				int var3 = field562;
				int var4 = field563;
				int var5 = field564;
				int var6 = field565;
				int var7 = arg0.method390();
				method189(var7);
				field562 = var3;
				field563 = var4;
				field564 = var5;
				field565 = var6;
				field566 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("EIBTXPJE.a(BI)V")
	public void method189(int arg0) {
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
		field562 = (int) (var12 * 256.0D);
		field563 = (int) (var14 * 256.0D);
		field564 = (int) (var16 * 256.0D);

		if (field563 < 0) {
			field563 = 0;
		} else if (field563 > 255) {
			field563 = 255;
		}

		if (field564 < 0) {
			field564 = 0;
		} else if (field564 > 255) {
			field564 = 255;
		}

		if (var16 > 0.5D) {
			field566 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field566 = (int) (var14 * var16 * 512.0D);
		}

		if (field566 < 1) {
			field566 = 1;
		}

		field565 = (int) (field566 * var12);
		int var18 = field562 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field563 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field564 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field567 = method190(var18, var19, var20);
	}

	@ObfuscatedName("EIBTXPJE.a(III)I")
	public final int method190(int arg0, int arg1, int arg2) {
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
