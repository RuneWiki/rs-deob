package deob;

@ObfuscatedName("QDVRTZST")
public class QDVRTZST {

	@ObfuscatedName("QDVRTZST.e")
	public int field1218 = -1;

	@ObfuscatedName("QDVRTZST.f")
	public boolean field1219 = false;

	@ObfuscatedName("QDVRTZST.g")
	public boolean field1220 = true;

	@ObfuscatedName("QDVRTZST.a")
	public static int field1214;

	@ObfuscatedName("QDVRTZST.d")
	public int field1217;

	@ObfuscatedName("QDVRTZST.h")
	public int field1221;

	@ObfuscatedName("QDVRTZST.i")
	public int field1222;

	@ObfuscatedName("QDVRTZST.j")
	public int field1223;

	@ObfuscatedName("QDVRTZST.k")
	public int field1224;

	@ObfuscatedName("QDVRTZST.l")
	public int field1225;

	@ObfuscatedName("QDVRTZST.m")
	public int field1226;

	@ObfuscatedName("QDVRTZST.c")
	public String field1216;

	@ObfuscatedName("QDVRTZST.b")
	public static QDVRTZST[] field1215;

	@ObfuscatedName("QDVRTZST.a(BLIEMHZJLX;)V")
	public static void method479(IEMHZJLX arg0) {
		MVHXDWGI var1 = new MVHXDWGI(arg0.method242("flo.dat", null));
		field1214 = var1.method359();
		if (field1215 == null) {
			field1215 = new QDVRTZST[field1214];
		}

		for (int var2 = 0; var2 < field1214; var2++) {
			if (field1215[var2] == null) {
				field1215[var2] = new QDVRTZST();
			}

			field1215[var2].method480(var1);
		}
	}

	@ObfuscatedName("QDVRTZST.a(ILMVHXDWGI;)V")
	public void method480(MVHXDWGI arg0) {
		while (true) {
			int var2 = arg0.method357();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1217 = arg0.method361();
				method481(field1217);
			} else if (var2 == 2) {
				field1218 = arg0.method357();
			} else if (var2 == 3) {
				field1219 = true;
			} else if (var2 == 5) {
				field1220 = false;
			} else if (var2 == 6) {
				field1216 = arg0.method364();
			} else if (var2 == 7) {
				int var3 = field1221;
				int var4 = field1222;
				int var5 = field1223;
				int var6 = field1224;
				int var7 = arg0.method361();
				method481(var7);
				field1221 = var3;
				field1222 = var4;
				field1223 = var5;
				field1224 = var6;
				field1225 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("QDVRTZST.a(IZ)V")
	public void method481(int arg0) {
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
		field1221 = (int) (var12 * 256.0D);
		field1222 = (int) (var14 * 256.0D);
		field1223 = (int) (var16 * 256.0D);

		if (field1222 < 0) {
			field1222 = 0;
		} else if (field1222 > 255) {
			field1222 = 255;
		}

		if (field1223 < 0) {
			field1223 = 0;
		} else if (field1223 > 255) {
			field1223 = 255;
		}

		if (var16 > 0.5D) {
			field1225 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1225 = (int) (var14 * var16 * 512.0D);
		}

		if (field1225 < 1) {
			field1225 = 1;
		}

		field1224 = (int) (field1225 * var12);
		int var18 = field1221 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1222 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1223 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1226 = method482(var18, var19, var20);
	}

	@ObfuscatedName("QDVRTZST.a(III)I")
	public final int method482(int arg0, int arg1, int arg2) {
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
