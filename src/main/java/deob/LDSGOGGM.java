package deob;

@ObfuscatedName("LDSGOGGM")
public class LDSGOGGM {

	@ObfuscatedName("LDSGOGGM.f")
	public int field1007 = -1;

	@ObfuscatedName("LDSGOGGM.g")
	public boolean field1008 = false;

	@ObfuscatedName("LDSGOGGM.h")
	public boolean field1009 = true;

	@ObfuscatedName("LDSGOGGM.b")
	public static int field1003;

	@ObfuscatedName("LDSGOGGM.e")
	public int field1006;

	@ObfuscatedName("LDSGOGGM.i")
	public int field1010;

	@ObfuscatedName("LDSGOGGM.j")
	public int field1011;

	@ObfuscatedName("LDSGOGGM.k")
	public int field1012;

	@ObfuscatedName("LDSGOGGM.l")
	public int field1013;

	@ObfuscatedName("LDSGOGGM.m")
	public int field1014;

	@ObfuscatedName("LDSGOGGM.n")
	public int field1015;

	@ObfuscatedName("LDSGOGGM.d")
	public String field1005;

	@ObfuscatedName("LDSGOGGM.c")
	public static LDSGOGGM[] field1004;

	@ObfuscatedName("LDSGOGGM.a(BLXOJZVVDK;)V")
	public static void method276(XOJZVVDK arg0) {
		PQBRPYKE var1 = new PQBRPYKE(arg0.method560("flo.dat", null));
		field1003 = var1.method342();
		if (field1004 == null) {
			field1004 = new LDSGOGGM[field1003];
		}

		for (int var2 = 0; var2 < field1003; var2++) {
			if (field1004[var2] == null) {
				field1004[var2] = new LDSGOGGM();
			}

			field1004[var2].method277(var1);
		}
	}

	@ObfuscatedName("LDSGOGGM.a(LPQBRPYKE;Z)V")
	public void method277(PQBRPYKE arg0) {
		while (true) {
			int var2 = arg0.method340();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1006 = arg0.method344();
				method278(field1006);
			} else if (var2 == 2) {
				field1007 = arg0.method340();
			} else if (var2 == 3) {
				field1008 = true;
			} else if (var2 == 5) {
				field1009 = false;
			} else if (var2 == 6) {
				field1005 = arg0.method347();
			} else if (var2 == 7) {
				int var3 = field1010;
				int var4 = field1011;
				int var5 = field1012;
				int var6 = field1013;
				int var7 = arg0.method344();
				method278(var7);
				field1010 = var3;
				field1011 = var4;
				field1012 = var5;
				field1013 = var6;
				field1014 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("LDSGOGGM.a(BI)V")
	public void method278(int arg0) {
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
		field1010 = (int) (var12 * 256.0D);
		field1011 = (int) (var14 * 256.0D);
		field1012 = (int) (var16 * 256.0D);

		if (field1011 < 0) {
			field1011 = 0;
		} else if (field1011 > 255) {
			field1011 = 255;
		}

		if (field1012 < 0) {
			field1012 = 0;
		} else if (field1012 > 255) {
			field1012 = 255;
		}

		if (var16 > 0.5D) {
			field1014 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1014 = (int) (var14 * var16 * 512.0D);
		}

		if (field1014 < 1) {
			field1014 = 1;
		}

		field1013 = (int) (field1014 * var12);
		int var18 = field1010 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1011 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1012 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1015 = method279(var18, var19, var20);
	}

	@ObfuscatedName("LDSGOGGM.a(III)I")
	public final int method279(int arg0, int arg1, int arg2) {
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
