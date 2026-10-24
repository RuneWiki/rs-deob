package deob;

@ObfuscatedName("QFWUSXIS")
public class QFWUSXIS {

	@ObfuscatedName("QFWUSXIS.f")
	public int field1001 = -1;

	@ObfuscatedName("QFWUSXIS.g")
	public boolean field1002 = false;

	@ObfuscatedName("QFWUSXIS.h")
	public boolean field1003 = true;

	@ObfuscatedName("QFWUSXIS.e")
	public int field1000;

	@ObfuscatedName("QFWUSXIS.i")
	public int field1004;

	@ObfuscatedName("QFWUSXIS.j")
	public int field1005;

	@ObfuscatedName("QFWUSXIS.k")
	public int field1006;

	@ObfuscatedName("QFWUSXIS.l")
	public int field1007;

	@ObfuscatedName("QFWUSXIS.m")
	public int field1008;

	@ObfuscatedName("QFWUSXIS.n")
	public int field1009;

	@ObfuscatedName("QFWUSXIS.b")
	public static int field997;

	@ObfuscatedName("QFWUSXIS.d")
	public String field999;

	@ObfuscatedName("QFWUSXIS.c")
	public static QFWUSXIS[] field998;

	@ObfuscatedName("QFWUSXIS.a(LRSPRYUFS;I)V")
	public static void method416(RSPRYUFS arg0) {
		NQUAUMDT var1 = new NQUAUMDT(arg0.method427("flo.dat", null));
		field997 = var1.method341();
		if (field998 == null) {
			field998 = new QFWUSXIS[field997];
		}

		for (int var2 = 0; var2 < field997; var2++) {
			if (field998[var2] == null) {
				field998[var2] = new QFWUSXIS();
			}

			field998[var2].method417(var1);
		}
	}

	@ObfuscatedName("QFWUSXIS.a(BLNQUAUMDT;)V")
	public void method417(NQUAUMDT arg0) {
		while (true) {
			int var2 = arg0.method339();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1000 = arg0.method343();
				method418(field1000);
			} else if (var2 == 2) {
				field1001 = arg0.method339();
			} else if (var2 == 3) {
				field1002 = true;
			} else if (var2 == 5) {
				field1003 = false;
			} else if (var2 == 6) {
				field999 = arg0.method346();
			} else if (var2 == 7) {
				int var3 = field1004;
				int var4 = field1005;
				int var5 = field1006;
				int var6 = field1007;
				int var7 = arg0.method343();
				method418(var7);
				field1004 = var3;
				field1005 = var4;
				field1006 = var5;
				field1007 = var6;
				field1008 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("QFWUSXIS.a(IZ)V")
	public void method418(int arg0) {
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
		field1004 = (int) (var12 * 256.0D);
		field1005 = (int) (var14 * 256.0D);
		field1006 = (int) (var16 * 256.0D);

		if (field1005 < 0) {
			field1005 = 0;
		} else if (field1005 > 255) {
			field1005 = 255;
		}

		if (field1006 < 0) {
			field1006 = 0;
		} else if (field1006 > 255) {
			field1006 = 255;
		}

		if (var16 > 0.5D) {
			field1008 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1008 = (int) (var14 * var16 * 512.0D);
		}

		if (field1008 < 1) {
			field1008 = 1;
		}

		field1007 = (int) (field1008 * var12);
		int var18 = field1004 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1005 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1006 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1009 = method419(var18, var19, var20);
	}

	@ObfuscatedName("QFWUSXIS.a(III)I")
	public final int method419(int arg0, int arg1, int arg2) {
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
