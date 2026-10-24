package deob;

@ObfuscatedName("YDUFKDFX")
public class YDUFKDFX {

	@ObfuscatedName("YDUFKDFX.g")
	public int field1459 = -1;

	@ObfuscatedName("YDUFKDFX.h")
	public boolean field1460 = false;

	@ObfuscatedName("YDUFKDFX.i")
	public boolean field1461 = true;

	@ObfuscatedName("YDUFKDFX.c")
	public static int field1455;

	@ObfuscatedName("YDUFKDFX.f")
	public int field1458;

	@ObfuscatedName("YDUFKDFX.j")
	public int field1462;

	@ObfuscatedName("YDUFKDFX.k")
	public int field1463;

	@ObfuscatedName("YDUFKDFX.l")
	public int field1464;

	@ObfuscatedName("YDUFKDFX.m")
	public int field1465;

	@ObfuscatedName("YDUFKDFX.n")
	public int field1466;

	@ObfuscatedName("YDUFKDFX.o")
	public int field1467;

	@ObfuscatedName("YDUFKDFX.e")
	public String field1457;

	@ObfuscatedName("YDUFKDFX.d")
	public static YDUFKDFX[] field1456;

	@ObfuscatedName("YDUFKDFX.a(LAWEEREDT;I)V")
	public static void method572(AWEEREDT arg0) {
		IUVBENCV var1 = new IUVBENCV(arg0.method14("flo.dat", null));
		field1455 = var1.method247();
		if (field1456 == null) {
			field1456 = new YDUFKDFX[field1455];
		}

		for (int var2 = 0; var2 < field1455; var2++) {
			if (field1456[var2] == null) {
				field1456[var2] = new YDUFKDFX();
			}

			field1456[var2].method573(var1);
		}
	}

	@ObfuscatedName("YDUFKDFX.a(LIUVBENCV;B)V")
	public void method573(IUVBENCV arg0) {
		while (true) {
			int var2 = arg0.method245();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1458 = arg0.method249();
				method574(field1458);
			} else if (var2 == 2) {
				field1459 = arg0.method245();
			} else if (var2 == 3) {
				field1460 = true;
			} else if (var2 == 5) {
				field1461 = false;
			} else if (var2 == 6) {
				field1457 = arg0.method252();
			} else if (var2 == 7) {
				int var3 = field1462;
				int var4 = field1463;
				int var5 = field1464;
				int var6 = field1465;
				int var7 = arg0.method249();
				method574(var7);
				field1462 = var3;
				field1463 = var4;
				field1464 = var5;
				field1465 = var6;
				field1466 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("YDUFKDFX.a(II)V")
	public void method574(int arg0) {
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
		field1462 = (int) (var12 * 256.0D);
		field1463 = (int) (var14 * 256.0D);
		field1464 = (int) (var16 * 256.0D);

		if (field1463 < 0) {
			field1463 = 0;
		} else if (field1463 > 255) {
			field1463 = 255;
		}

		if (field1464 < 0) {
			field1464 = 0;
		} else if (field1464 > 255) {
			field1464 = 255;
		}

		if (var16 > 0.5D) {
			field1466 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1466 = (int) (var14 * var16 * 512.0D);
		}

		if (field1466 < 1) {
			field1466 = 1;
		}

		field1465 = (int) (field1466 * var12);
		int var18 = field1462 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1463 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1464 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1467 = method575(var18, var19, var20);
	}

	@ObfuscatedName("YDUFKDFX.a(III)I")
	public final int method575(int arg0, int arg1, int arg2) {
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
