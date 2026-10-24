package deob;

@ObfuscatedName("IWTQKRSS")
public class IWTQKRSS {

	@ObfuscatedName("IWTQKRSS.f")
	public int field824 = -1;

	@ObfuscatedName("IWTQKRSS.g")
	public boolean field825 = false;

	@ObfuscatedName("IWTQKRSS.h")
	public boolean field826 = true;

	@ObfuscatedName("IWTQKRSS.b")
	public static int field820;

	@ObfuscatedName("IWTQKRSS.e")
	public int field823;

	@ObfuscatedName("IWTQKRSS.i")
	public int field827;

	@ObfuscatedName("IWTQKRSS.j")
	public int field828;

	@ObfuscatedName("IWTQKRSS.k")
	public int field829;

	@ObfuscatedName("IWTQKRSS.l")
	public int field830;

	@ObfuscatedName("IWTQKRSS.m")
	public int field831;

	@ObfuscatedName("IWTQKRSS.n")
	public int field832;

	@ObfuscatedName("IWTQKRSS.d")
	public String field822;

	@ObfuscatedName("IWTQKRSS.c")
	public static IWTQKRSS[] field821;

	@ObfuscatedName("IWTQKRSS.a(ZLXMRRKSSB;)V")
	public static void method264(XMRRKSSB arg0) {
		XQPFGONL var1 = new XQPFGONL(arg0.method465("flo.dat", null));
		field820 = var1.method480();
		if (field821 == null) {
			field821 = new IWTQKRSS[field820];
		}

		for (int var2 = 0; var2 < field820; var2++) {
			if (field821[var2] == null) {
				field821[var2] = new IWTQKRSS();
			}

			field821[var2].method265(var1);
		}
	}

	@ObfuscatedName("IWTQKRSS.a(LXQPFGONL;I)V")
	public void method265(XQPFGONL arg0) {
		while (true) {
			int var2 = arg0.method478();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field823 = arg0.method482();
				method266(field823);
			} else if (var2 == 2) {
				field824 = arg0.method478();
			} else if (var2 == 3) {
				field825 = true;
			} else if (var2 == 5) {
				field826 = false;
			} else if (var2 == 6) {
				field822 = arg0.method485();
			} else if (var2 == 7) {
				int var3 = field827;
				int var4 = field828;
				int var5 = field829;
				int var6 = field830;
				int var7 = arg0.method482();
				method266(var7);
				field827 = var3;
				field828 = var4;
				field829 = var5;
				field830 = var6;
				field831 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("IWTQKRSS.a(ZI)V")
	public void method266(int arg0) {
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
		field827 = (int) (var12 * 256.0D);
		field828 = (int) (var14 * 256.0D);
		field829 = (int) (var16 * 256.0D);

		if (field828 < 0) {
			field828 = 0;
		} else if (field828 > 255) {
			field828 = 255;
		}

		if (field829 < 0) {
			field829 = 0;
		} else if (field829 > 255) {
			field829 = 255;
		}

		if (var16 > 0.5D) {
			field831 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field831 = (int) (var14 * var16 * 512.0D);
		}

		if (field831 < 1) {
			field831 = 1;
		}

		field830 = (int) (field831 * var12);
		int var18 = field827 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field828 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field829 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field832 = method267(var18, var19, var20);
	}

	@ObfuscatedName("IWTQKRSS.a(III)I")
	public final int method267(int arg0, int arg1, int arg2) {
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
