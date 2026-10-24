package deob;

@ObfuscatedName("UGHJOVKI")
public class UGHJOVKI {

	@ObfuscatedName("UGHJOVKI.e")
	public int field1426 = -1;

	@ObfuscatedName("UGHJOVKI.f")
	public boolean field1427 = false;

	@ObfuscatedName("UGHJOVKI.g")
	public boolean field1428 = true;

	@ObfuscatedName("UGHJOVKI.a")
	public static int field1422;

	@ObfuscatedName("UGHJOVKI.d")
	public int field1425;

	@ObfuscatedName("UGHJOVKI.h")
	public int field1429;

	@ObfuscatedName("UGHJOVKI.i")
	public int field1430;

	@ObfuscatedName("UGHJOVKI.j")
	public int field1431;

	@ObfuscatedName("UGHJOVKI.k")
	public int field1432;

	@ObfuscatedName("UGHJOVKI.l")
	public int field1433;

	@ObfuscatedName("UGHJOVKI.m")
	public int field1434;

	@ObfuscatedName("UGHJOVKI.c")
	public String field1424;

	@ObfuscatedName("UGHJOVKI.b")
	public static UGHJOVKI[] field1423;

	@ObfuscatedName("UGHJOVKI.a(BLESUFCMYV;)V")
	public static void method552(ESUFCMYV arg0) {
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("flo.dat", null));
		field1422 = var1.method457();
		if (field1423 == null) {
			field1423 = new UGHJOVKI[field1422];
		}

		for (int var2 = 0; var2 < field1422; var2++) {
			if (field1423[var2] == null) {
				field1423[var2] = new UGHJOVKI();
			}

			field1423[var2].method553(var1);
		}
	}

	@ObfuscatedName("UGHJOVKI.a(ILRGCGKKUR;)V")
	public void method553(RGCGKKUR arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1425 = arg0.method459();
				method554(field1425);
			} else if (var2 == 2) {
				field1426 = arg0.method455();
			} else if (var2 == 3) {
				field1427 = true;
			} else if (var2 == 5) {
				field1428 = false;
			} else if (var2 == 6) {
				field1424 = arg0.method462();
			} else if (var2 == 7) {
				int var3 = field1429;
				int var4 = field1430;
				int var5 = field1431;
				int var6 = field1432;
				int var7 = arg0.method459();
				method554(var7);
				field1429 = var3;
				field1430 = var4;
				field1431 = var5;
				field1432 = var6;
				field1433 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("UGHJOVKI.a(II)V")
	public void method554(int arg0) {
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
		field1429 = (int) (var12 * 256.0D);
		field1430 = (int) (var14 * 256.0D);
		field1431 = (int) (var16 * 256.0D);

		if (field1430 < 0) {
			field1430 = 0;
		} else if (field1430 > 255) {
			field1430 = 255;
		}

		if (field1431 < 0) {
			field1431 = 0;
		} else if (field1431 > 255) {
			field1431 = 255;
		}

		if (var16 > 0.5D) {
			field1433 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1433 = (int) (var14 * var16 * 512.0D);
		}

		if (field1433 < 1) {
			field1433 = 1;
		}

		field1432 = (int) (field1433 * var12);
		int var18 = field1429 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1430 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1431 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1434 = method555(var18, var19, var20);
	}

	@ObfuscatedName("UGHJOVKI.a(III)I")
	public final int method555(int arg0, int arg1, int arg2) {
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
