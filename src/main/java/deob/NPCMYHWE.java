package deob;

@ObfuscatedName("NPCMYHWE")
public class NPCMYHWE {

	@ObfuscatedName("NPCMYHWE.g")
	public int field920 = -1;

	@ObfuscatedName("NPCMYHWE.h")
	public boolean field921 = false;

	@ObfuscatedName("NPCMYHWE.i")
	public boolean field922 = true;

	@ObfuscatedName("NPCMYHWE.c")
	public static int field916;

	@ObfuscatedName("NPCMYHWE.f")
	public int field919;

	@ObfuscatedName("NPCMYHWE.j")
	public int field923;

	@ObfuscatedName("NPCMYHWE.k")
	public int field924;

	@ObfuscatedName("NPCMYHWE.l")
	public int field925;

	@ObfuscatedName("NPCMYHWE.m")
	public int field926;

	@ObfuscatedName("NPCMYHWE.n")
	public int field927;

	@ObfuscatedName("NPCMYHWE.o")
	public int field928;

	@ObfuscatedName("NPCMYHWE.e")
	public String field918;

	@ObfuscatedName("NPCMYHWE.d")
	public static NPCMYHWE[] field917;

	@ObfuscatedName("NPCMYHWE.a(ZLXRWUKRPO;)V")
	public static void method389(XRWUKRPO arg0) {
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("flo.dat", null));
		field916 = var1.method246();
		if (field917 == null) {
			field917 = new NPCMYHWE[field916];
		}

		for (int var2 = 0; var2 < field916; var2++) {
			if (field917[var2] == null) {
				field917[var2] = new NPCMYHWE();
			}

			field917[var2].method390(var1);
		}
	}

	@ObfuscatedName("NPCMYHWE.a(BLGLMIQHJI;)V")
	public void method390(GLMIQHJI arg0) {
		while (true) {
			int var2 = arg0.method244();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field919 = arg0.method248();
				method391(field919);
			} else if (var2 == 2) {
				field920 = arg0.method244();
			} else if (var2 == 3) {
				field921 = true;
			} else if (var2 == 5) {
				field922 = false;
			} else if (var2 == 6) {
				field918 = arg0.method251();
			} else if (var2 == 7) {
				int var3 = field923;
				int var4 = field924;
				int var5 = field925;
				int var6 = field926;
				int var7 = arg0.method248();
				method391(var7);
				field923 = var3;
				field924 = var4;
				field925 = var5;
				field926 = var6;
				field927 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("NPCMYHWE.a(IZ)V")
	public void method391(int arg0) {
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
		field923 = (int) (var12 * 256.0D);
		field924 = (int) (var14 * 256.0D);
		field925 = (int) (var16 * 256.0D);

		if (field924 < 0) {
			field924 = 0;
		} else if (field924 > 255) {
			field924 = 255;
		}

		if (field925 < 0) {
			field925 = 0;
		} else if (field925 > 255) {
			field925 = 255;
		}

		if (var16 > 0.5D) {
			field927 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field927 = (int) (var14 * var16 * 512.0D);
		}

		if (field927 < 1) {
			field927 = 1;
		}

		field926 = (int) (field927 * var12);
		int var18 = field923 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field924 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field925 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field928 = method392(var18, var19, var20);
	}

	@ObfuscatedName("NPCMYHWE.a(III)I")
	public final int method392(int arg0, int arg1, int arg2) {
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
