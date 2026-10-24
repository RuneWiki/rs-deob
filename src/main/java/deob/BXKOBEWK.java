package deob;

@ObfuscatedName("BXKOBEWK")
public class BXKOBEWK {

	@ObfuscatedName("BXKOBEWK.g")
	public int field7 = -1;

	@ObfuscatedName("BXKOBEWK.h")
	public boolean field8 = false;

	@ObfuscatedName("BXKOBEWK.i")
	public boolean field9 = true;

	@ObfuscatedName("BXKOBEWK.j")
	public int field10;

	@ObfuscatedName("BXKOBEWK.k")
	public int field11;

	@ObfuscatedName("BXKOBEWK.l")
	public int field12;

	@ObfuscatedName("BXKOBEWK.m")
	public int field13;

	@ObfuscatedName("BXKOBEWK.n")
	public int field14;

	@ObfuscatedName("BXKOBEWK.o")
	public int field15;

	@ObfuscatedName("BXKOBEWK.c")
	public static int field3;

	@ObfuscatedName("BXKOBEWK.f")
	public int field6;

	@ObfuscatedName("BXKOBEWK.e")
	public String field5;

	@ObfuscatedName("BXKOBEWK.d")
	public static BXKOBEWK[] field4;

	@ObfuscatedName("BXKOBEWK.a(LCXFTMSCH;B)V")
	public static void method3(CXFTMSCH arg0) {
		MQZHAILV var1 = new MQZHAILV(arg0.method176("flo.dat", null));
		field3 = var1.method327();
		if (field4 == null) {
			field4 = new BXKOBEWK[field3];
		}

		for (int var2 = 0; var2 < field3; var2++) {
			if (field4[var2] == null) {
				field4[var2] = new BXKOBEWK();
			}

			field4[var2].method4(var1);
		}
	}

	@ObfuscatedName("BXKOBEWK.a(LMQZHAILV;I)V")
	public void method4(MQZHAILV arg0) {
		while (true) {
			int var2 = arg0.method325();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field6 = arg0.method329();
				method5(field6);
			} else if (var2 == 2) {
				field7 = arg0.method325();
			} else if (var2 == 3) {
				field8 = true;
			} else if (var2 == 5) {
				field9 = false;
			} else if (var2 == 6) {
				field5 = arg0.method332();
			} else if (var2 == 7) {
				int var3 = field10;
				int var4 = field11;
				int var5 = field12;
				int var6 = field13;
				int var7 = arg0.method329();
				method5(var7);
				field10 = var3;
				field11 = var4;
				field12 = var5;
				field13 = var6;
				field14 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BXKOBEWK.a(IZ)V")
	public void method5(int arg0) {
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
		field10 = (int) (var12 * 256.0D);
		field11 = (int) (var14 * 256.0D);
		field12 = (int) (var16 * 256.0D);

		if (field11 < 0) {
			field11 = 0;
		} else if (field11 > 255) {
			field11 = 255;
		}

		if (field12 < 0) {
			field12 = 0;
		} else if (field12 > 255) {
			field12 = 255;
		}

		if (var16 > 0.5D) {
			field14 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field14 = (int) (var14 * var16 * 512.0D);
		}

		if (field14 < 1) {
			field14 = 1;
		}

		field13 = (int) (field14 * var12);
		int var18 = field10 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field11 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field12 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field15 = method6(var18, var19, var20);
	}

	@ObfuscatedName("BXKOBEWK.a(III)I")
	public final int method6(int arg0, int arg1, int arg2) {
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
