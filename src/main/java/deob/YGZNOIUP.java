package deob;

@ObfuscatedName("YGZNOIUP")
public class YGZNOIUP {

	@ObfuscatedName("YGZNOIUP.d")
	public int field1504;

	@ObfuscatedName("YGZNOIUP.f")
	public int field1506;

	@ObfuscatedName("YGZNOIUP.e")
	public ZJUVOWSB field1505;

	@ObfuscatedName("YGZNOIUP.g")
	public int[] field1507;

	@ObfuscatedName("YGZNOIUP.h")
	public int[] field1508;

	@ObfuscatedName("YGZNOIUP.i")
	public int[] field1509;

	@ObfuscatedName("YGZNOIUP.j")
	public int[] field1510;

	@ObfuscatedName("YGZNOIUP.c")
	public static YGZNOIUP[] field1503;

	@ObfuscatedName("YGZNOIUP.k")
	public static boolean[] field1511;

	@ObfuscatedName("YGZNOIUP.a(I)V")
	public static void method595(int arg0) {
		field1503 = new YGZNOIUP[arg0 + 1];
		field1511 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1511[var1] = true;
		}
	}

	@ObfuscatedName("YGZNOIUP.a(B[B)V")
	public static void method596(byte[] arg0) {
		LZWRHABP var1 = new LZWRHABP(arg0);
		var1.field1139 = arg0.length - 8;
		int var2 = var1.method465();
		int var3 = var1.method465();
		int var4 = var1.method465();
		int var5 = var1.method465();
		int var6 = 0;
		LZWRHABP var7 = new LZWRHABP(arg0);
		var7.field1139 = var6;
		var6 += var2 + 2;
		LZWRHABP var8 = new LZWRHABP(arg0);
		var8.field1139 = var6;
		var6 += var3;
		LZWRHABP var9 = new LZWRHABP(arg0);
		var9.field1139 = var6;
		var6 += var4;
		LZWRHABP var10 = new LZWRHABP(arg0);
		var10.field1139 = var6;
		var6 += var5;
		LZWRHABP var11 = new LZWRHABP(arg0);
		var11.field1139 = var6;
		ZJUVOWSB var12 = new ZJUVOWSB(var11);
		int var13 = var7.method465();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method465();
			YGZNOIUP var20 = field1503[var19] = new YGZNOIUP();
			var20.field1504 = var10.method463();
			var20.field1505 = var12;
			int var21 = var7.method463();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method463();
				if (var25 > 0) {
					if (var12.field1515[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1515[var26] == 0) {
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
					if (var12.field1515[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method476();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method476();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method476();
					}

					var22 = var24;
					var23++;

					if (var12.field1515[var24] == 5) {
						field1511[var19] = false;
					}
				}
			}

			var20.field1506 = var23;
			var20.field1507 = new int[var23];
			var20.field1508 = new int[var23];
			var20.field1509 = new int[var23];
			var20.field1510 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1507[var28] = var14[var28];
				var20.field1508[var28] = var15[var28];
				var20.field1509[var28] = var16[var28];
				var20.field1510[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("YGZNOIUP.a(B)V")
	public static void method597() {
		field1503 = null;
	}

	@ObfuscatedName("YGZNOIUP.b(I)LYGZNOIUP;")
	public static YGZNOIUP method598(int arg0) {
		if (field1503 == null) {
			return null;
		}

		return field1503[arg0];
	}

	@ObfuscatedName("YGZNOIUP.a(IB)Z")
	public static boolean method599(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
