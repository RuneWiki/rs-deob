package deob;

@ObfuscatedName("PQRCEBTR")
public class PQRCEBTR {

	@ObfuscatedName("PQRCEBTR.e")
	public int field1132 = -1;

	@ObfuscatedName("PQRCEBTR.f")
	public boolean field1133 = false;

	@ObfuscatedName("PQRCEBTR.g")
	public boolean field1134 = true;

	@ObfuscatedName("PQRCEBTR.a")
	public static int field1128;

	@ObfuscatedName("PQRCEBTR.d")
	public int field1131;

	@ObfuscatedName("PQRCEBTR.h")
	public int field1135;

	@ObfuscatedName("PQRCEBTR.i")
	public int field1136;

	@ObfuscatedName("PQRCEBTR.j")
	public int field1137;

	@ObfuscatedName("PQRCEBTR.k")
	public int field1138;

	@ObfuscatedName("PQRCEBTR.l")
	public int field1139;

	@ObfuscatedName("PQRCEBTR.m")
	public int field1140;

	@ObfuscatedName("PQRCEBTR.c")
	public String field1130;

	@ObfuscatedName("PQRCEBTR.b")
	public static PQRCEBTR[] field1129;

	@ObfuscatedName("PQRCEBTR.a(LDTIATKJO;I)V")
	public static void method443(DTIATKJO arg0) {
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("flo.dat", null));
		field1128 = var1.method204();
		if (field1129 == null) {
			field1129 = new PQRCEBTR[field1128];
		}

		for (int var2 = 0; var2 < field1128; var2++) {
			if (field1129[var2] == null) {
				field1129[var2] = new PQRCEBTR();
			}

			field1129[var2].method444(var1);
		}
	}

	@ObfuscatedName("PQRCEBTR.a(LGHHPHSRU;I)V")
	public void method444(GHHPHSRU arg0) {
		while (true) {
			int var2 = arg0.method202();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1131 = arg0.method206();
				method445(field1131);
			} else if (var2 == 2) {
				field1132 = arg0.method202();
			} else if (var2 == 3) {
				field1133 = true;
			} else if (var2 == 5) {
				field1134 = false;
			} else if (var2 == 6) {
				field1130 = arg0.method209();
			} else if (var2 == 7) {
				int var3 = field1135;
				int var4 = field1136;
				int var5 = field1137;
				int var6 = field1138;
				int var7 = arg0.method206();
				method445(var7);
				field1135 = var3;
				field1136 = var4;
				field1137 = var5;
				field1138 = var6;
				field1139 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("PQRCEBTR.a(II)V")
	public void method445(int arg0) {
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
		field1135 = (int) (var12 * 256.0D);
		field1136 = (int) (var14 * 256.0D);
		field1137 = (int) (var16 * 256.0D);

		if (field1136 < 0) {
			field1136 = 0;
		} else if (field1136 > 255) {
			field1136 = 255;
		}

		if (field1137 < 0) {
			field1137 = 0;
		} else if (field1137 > 255) {
			field1137 = 255;
		}

		if (var16 > 0.5D) {
			field1139 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1139 = (int) (var14 * var16 * 512.0D);
		}

		if (field1139 < 1) {
			field1139 = 1;
		}

		field1138 = (int) (field1139 * var12);
		int var18 = field1135 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1136 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1137 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1140 = method446(var18, var19, var20);
	}

	@ObfuscatedName("PQRCEBTR.a(III)I")
	public final int method446(int arg0, int arg1, int arg2) {
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
