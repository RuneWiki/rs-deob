package deob;

@ObfuscatedName("TDFMBTLA")
public class TDFMBTLA {

	@ObfuscatedName("TDFMBTLA.c")
	public int field1233;

	@ObfuscatedName("TDFMBTLA.e")
	public int field1235;

	@ObfuscatedName("TDFMBTLA.d")
	public VLFCQHDE field1234;

	@ObfuscatedName("TDFMBTLA.f")
	public int[] field1236;

	@ObfuscatedName("TDFMBTLA.g")
	public int[] field1237;

	@ObfuscatedName("TDFMBTLA.h")
	public int[] field1238;

	@ObfuscatedName("TDFMBTLA.i")
	public int[] field1239;

	@ObfuscatedName("TDFMBTLA.b")
	public static TDFMBTLA[] field1232;

	@ObfuscatedName("TDFMBTLA.j")
	public static boolean[] field1240;

	@ObfuscatedName("TDFMBTLA.a(I)V")
	public static void method487(int arg0) {
		field1232 = new TDFMBTLA[arg0 + 1];
		field1240 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1240[var1] = true;
		}
	}

	@ObfuscatedName("TDFMBTLA.a(I[B)V")
	public static void method488(byte[] arg0) {
		MUKVLYLC var1 = new MUKVLYLC(arg0);
		var1.field812 = arg0.length - 8;
		int var2 = var1.method294();
		int var3 = var1.method294();
		int var4 = var1.method294();
		int var5 = var1.method294();
		int var6 = 0;
		MUKVLYLC var7 = new MUKVLYLC(arg0);
		var7.field812 = var6;
		var6 += var2 + 2;
		MUKVLYLC var8 = new MUKVLYLC(arg0);
		var8.field812 = var6;
		var6 += var3;
		MUKVLYLC var9 = new MUKVLYLC(arg0);
		var9.field812 = var6;
		var6 += var4;
		MUKVLYLC var10 = new MUKVLYLC(arg0);
		var10.field812 = var6;
		var6 += var5;
		MUKVLYLC var11 = new MUKVLYLC(arg0);
		var11.field812 = var6;
		VLFCQHDE var12 = new VLFCQHDE(var11);
		int var13 = var7.method294();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method294();
			TDFMBTLA var20 = field1232[var19] = new TDFMBTLA();
			var20.field1233 = var10.method292();
			var20.field1234 = var12;
			int var21 = var7.method292();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method292();
				if (var25 > 0) {
					if (var12.field1419[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1419[var26] == 0) {
								var14[var23] = var26;
								var15[var23] = 0;
								var16[var23] = 0;
								var17[var23] = 0;
								var23++;
								break;
							}
						}
					}

					var14[var23] = var24;
					short var27 = 0;
					if (var12.field1419[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method305();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method305();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method305();
					}

					var22 = var24;
					var23++;

					if (var12.field1419[var24] == 5) {
						field1240[var19] = false;
					}
				}
			}

			var20.field1235 = var23;
			var20.field1236 = new int[var23];
			var20.field1237 = new int[var23];
			var20.field1238 = new int[var23];
			var20.field1239 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1236[var28] = var14[var28];
				var20.field1237[var28] = var15[var28];
				var20.field1238[var28] = var16[var28];
				var20.field1239[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("TDFMBTLA.b(I)V")
	public static void method489() {
		field1232 = null;
	}

	@ObfuscatedName("TDFMBTLA.a(II)LTDFMBTLA;")
	public static TDFMBTLA method490(int arg0) {
		if (field1232 == null) {
			return null;
		}

		return field1232[arg0];
	}

	@ObfuscatedName("TDFMBTLA.b(II)Z")
	public static boolean method491(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
