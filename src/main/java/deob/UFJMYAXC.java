package deob;

@ObfuscatedName("UFJMYAXC")
public class UFJMYAXC {

	@ObfuscatedName("UFJMYAXC.g")
	public int field1242 = -1;

	@ObfuscatedName("UFJMYAXC.h")
	public boolean field1243 = false;

	@ObfuscatedName("UFJMYAXC.i")
	public boolean field1244 = true;

	@ObfuscatedName("UFJMYAXC.c")
	public static int field1238;

	@ObfuscatedName("UFJMYAXC.f")
	public int field1241;

	@ObfuscatedName("UFJMYAXC.j")
	public int field1245;

	@ObfuscatedName("UFJMYAXC.k")
	public int field1246;

	@ObfuscatedName("UFJMYAXC.l")
	public int field1247;

	@ObfuscatedName("UFJMYAXC.m")
	public int field1248;

	@ObfuscatedName("UFJMYAXC.n")
	public int field1249;

	@ObfuscatedName("UFJMYAXC.o")
	public int field1250;

	@ObfuscatedName("UFJMYAXC.e")
	public String field1240;

	@ObfuscatedName("UFJMYAXC.d")
	public static UFJMYAXC[] field1239;

	@ObfuscatedName("UFJMYAXC.a(ILQDHHNYHL;)V")
	public static void method519(QDHHNYHL arg0) {
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("flo.dat", null));
		field1238 = var1.method422();
		if (field1239 == null) {
			field1239 = new UFJMYAXC[field1238];
		}

		for (int var2 = 0; var2 < field1238; var2++) {
			if (field1239[var2] == null) {
				field1239[var2] = new UFJMYAXC();
			}

			field1239[var2].method520(var1);
		}
	}

	@ObfuscatedName("UFJMYAXC.a(LPGNBHFUF;I)V")
	public void method520(PGNBHFUF arg0) {
		while (true) {
			int var2 = arg0.method420();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1241 = arg0.method424();
				method521(field1241);
			} else if (var2 == 2) {
				field1242 = arg0.method420();
			} else if (var2 == 3) {
				field1243 = true;
			} else if (var2 == 5) {
				field1244 = false;
			} else if (var2 == 6) {
				field1240 = arg0.method427();
			} else if (var2 == 7) {
				int var3 = field1245;
				int var4 = field1246;
				int var5 = field1247;
				int var6 = field1248;
				int var7 = arg0.method424();
				method521(var7);
				field1245 = var3;
				field1246 = var4;
				field1247 = var5;
				field1248 = var6;
				field1249 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("UFJMYAXC.a(II)V")
	public void method521(int arg0) {
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
		field1245 = (int) (var12 * 256.0D);
		field1246 = (int) (var14 * 256.0D);
		field1247 = (int) (var16 * 256.0D);

		if (field1246 < 0) {
			field1246 = 0;
		} else if (field1246 > 255) {
			field1246 = 255;
		}

		if (field1247 < 0) {
			field1247 = 0;
		} else if (field1247 > 255) {
			field1247 = 255;
		}

		if (var16 > 0.5D) {
			field1249 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1249 = (int) (var14 * var16 * 512.0D);
		}

		if (field1249 < 1) {
			field1249 = 1;
		}

		field1248 = (int) (field1249 * var12);
		int var18 = field1245 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1246 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1247 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1250 = method522(var18, var19, var20);
	}

	@ObfuscatedName("UFJMYAXC.a(III)I")
	public final int method522(int arg0, int arg1, int arg2) {
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
