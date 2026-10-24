package deob;

@ObfuscatedName("OYJABRDD")
public class OYJABRDD {

	@ObfuscatedName("OYJABRDD.d")
	public int field1176;

	@ObfuscatedName("OYJABRDD.f")
	public int field1178;

	@ObfuscatedName("OYJABRDD.e")
	public FGDIESUZ field1177;

	@ObfuscatedName("OYJABRDD.g")
	public int[] field1179;

	@ObfuscatedName("OYJABRDD.h")
	public int[] field1180;

	@ObfuscatedName("OYJABRDD.i")
	public int[] field1181;

	@ObfuscatedName("OYJABRDD.j")
	public int[] field1182;

	@ObfuscatedName("OYJABRDD.c")
	public static OYJABRDD[] field1175;

	@ObfuscatedName("OYJABRDD.k")
	public static boolean[] field1183;

	@ObfuscatedName("OYJABRDD.a(I)V")
	public static void method463(int arg0) {
		field1175 = new OYJABRDD[arg0 + 1];
		field1183 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1183[var1] = true;
		}
	}

	@ObfuscatedName("OYJABRDD.a([BI)V")
	public static void method464(byte[] arg0) {
		TKPFKOXP var1 = new TKPFKOXP(arg0);
		var1.field1382 = arg0.length - 8;
		int var2 = var1.method531();
		int var3 = var1.method531();
		int var4 = var1.method531();
		int var5 = var1.method531();
		int var6 = 0;
		TKPFKOXP var7 = new TKPFKOXP(arg0);
		var7.field1382 = var6;
		var6 += var2 + 2;
		TKPFKOXP var8 = new TKPFKOXP(arg0);
		var8.field1382 = var6;
		var6 += var3;
		TKPFKOXP var9 = new TKPFKOXP(arg0);
		var9.field1382 = var6;
		var6 += var4;
		TKPFKOXP var10 = new TKPFKOXP(arg0);
		var10.field1382 = var6;
		var6 += var5;
		TKPFKOXP var11 = new TKPFKOXP(arg0);
		var11.field1382 = var6;
		FGDIESUZ var12 = new FGDIESUZ(var11);
		int var13 = var7.method531();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method531();
			OYJABRDD var20 = field1175[var19] = new OYJABRDD();
			var20.field1176 = var10.method529();
			var20.field1177 = var12;
			int var21 = var7.method529();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method529();
				if (var25 > 0) {
					if (var12.field693[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field693[var26] == 0) {
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
					if (var12.field693[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method542();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method542();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method542();
					}

					var22 = var24;
					var23++;

					if (var12.field693[var24] == 5) {
						field1183[var19] = false;
					}
				}
			}

			var20.field1178 = var23;
			var20.field1179 = new int[var23];
			var20.field1180 = new int[var23];
			var20.field1181 = new int[var23];
			var20.field1182 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1179[var28] = var14[var28];
				var20.field1180[var28] = var15[var28];
				var20.field1181[var28] = var16[var28];
				var20.field1182[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("OYJABRDD.a(B)V")
	public static void method465() {
		field1175 = null;
	}

	@ObfuscatedName("OYJABRDD.b(I)LOYJABRDD;")
	public static OYJABRDD method466(int arg0) {
		if (field1175 == null) {
			return null;
		}

		return field1175[arg0];
	}

	@ObfuscatedName("OYJABRDD.a(BI)Z")
	public static boolean method467(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
