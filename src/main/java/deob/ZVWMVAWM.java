package deob;

@ObfuscatedName("ZVWMVAWM")
public class ZVWMVAWM {

	@ObfuscatedName("ZVWMVAWM.e")
	public int field1505 = -1;

	@ObfuscatedName("ZVWMVAWM.f")
	public boolean field1506 = false;

	@ObfuscatedName("ZVWMVAWM.g")
	public boolean field1507 = true;

	@ObfuscatedName("ZVWMVAWM.a")
	public static int field1501;

	@ObfuscatedName("ZVWMVAWM.d")
	public int field1504;

	@ObfuscatedName("ZVWMVAWM.h")
	public int field1508;

	@ObfuscatedName("ZVWMVAWM.i")
	public int field1509;

	@ObfuscatedName("ZVWMVAWM.j")
	public int field1510;

	@ObfuscatedName("ZVWMVAWM.k")
	public int field1511;

	@ObfuscatedName("ZVWMVAWM.l")
	public int field1512;

	@ObfuscatedName("ZVWMVAWM.m")
	public int field1513;

	@ObfuscatedName("ZVWMVAWM.c")
	public String field1503;

	@ObfuscatedName("ZVWMVAWM.b")
	public static ZVWMVAWM[] field1502;

	@ObfuscatedName("ZVWMVAWM.a(ZLFXNTEMPE;)V")
	public static void method601(FXNTEMPE arg0) {
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("flo.dat", null));
		field1501 = var1.method390();
		if (field1502 == null) {
			field1502 = new ZVWMVAWM[field1501];
		}

		for (int var2 = 0; var2 < field1501; var2++) {
			if (field1502[var2] == null) {
				field1502[var2] = new ZVWMVAWM();
			}

			field1502[var2].method602(var1);
		}
	}

	@ObfuscatedName("ZVWMVAWM.a(LRSWRPCHR;B)V")
	public void method602(RSWRPCHR arg0) {
		while (true) {
			int var2 = arg0.method388();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1504 = arg0.method392();
				method603(field1504);
			} else if (var2 == 2) {
				field1505 = arg0.method388();
			} else if (var2 == 3) {
				field1506 = true;
			} else if (var2 == 5) {
				field1507 = false;
			} else if (var2 == 6) {
				field1503 = arg0.method395();
			} else if (var2 == 7) {
				int var3 = field1508;
				int var4 = field1509;
				int var5 = field1510;
				int var6 = field1511;
				int var7 = arg0.method392();
				method603(var7);
				field1508 = var3;
				field1509 = var4;
				field1510 = var5;
				field1511 = var6;
				field1512 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("ZVWMVAWM.a(IZ)V")
	public void method603(int arg0) {
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
		field1508 = (int) (var12 * 256.0D);
		field1509 = (int) (var14 * 256.0D);
		field1510 = (int) (var16 * 256.0D);

		if (field1509 < 0) {
			field1509 = 0;
		} else if (field1509 > 255) {
			field1509 = 255;
		}

		if (field1510 < 0) {
			field1510 = 0;
		} else if (field1510 > 255) {
			field1510 = 255;
		}

		if (var16 > 0.5D) {
			field1512 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1512 = (int) (var14 * var16 * 512.0D);
		}

		if (field1512 < 1) {
			field1512 = 1;
		}

		field1511 = (int) (field1512 * var12);
		int var18 = field1508 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1509 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1510 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1513 = method604(var18, var19, var20);
	}

	@ObfuscatedName("ZVWMVAWM.a(III)I")
	public final int method604(int arg0, int arg1, int arg2) {
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
