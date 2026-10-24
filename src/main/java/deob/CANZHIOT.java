package deob;

@ObfuscatedName("CANZHIOT")
public class CANZHIOT {

	@ObfuscatedName("CANZHIOT.c")
	public int field35;

	@ObfuscatedName("CANZHIOT.e")
	public int field37;

	@ObfuscatedName("CANZHIOT.d")
	public AQXKJVRI field36;

	@ObfuscatedName("CANZHIOT.f")
	public int[] field38;

	@ObfuscatedName("CANZHIOT.g")
	public int[] field39;

	@ObfuscatedName("CANZHIOT.h")
	public int[] field40;

	@ObfuscatedName("CANZHIOT.i")
	public int[] field41;

	@ObfuscatedName("CANZHIOT.b")
	public static CANZHIOT[] field34;

	@ObfuscatedName("CANZHIOT.j")
	public static boolean[] field42;

	@ObfuscatedName("CANZHIOT.a(I)V")
	public static void method13(int arg0) {
		field34 = new CANZHIOT[arg0 + 1];
		field42 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field42[var1] = true;
		}
	}

	@ObfuscatedName("CANZHIOT.a(I[B)V")
	public static void method14(byte[] arg0) {
		CFARFRSG var1 = new CFARFRSG(arg0);
		var1.field44 = arg0.length - 8;
		int var2 = var1.method32();
		int var3 = var1.method32();
		int var4 = var1.method32();
		int var5 = var1.method32();
		int var6 = 0;
		CFARFRSG var7 = new CFARFRSG(arg0);
		var7.field44 = var6;
		var6 += var2 + 2;
		CFARFRSG var8 = new CFARFRSG(arg0);
		var8.field44 = var6;
		var6 += var3;
		CFARFRSG var9 = new CFARFRSG(arg0);
		var9.field44 = var6;
		var6 += var4;
		CFARFRSG var10 = new CFARFRSG(arg0);
		var10.field44 = var6;
		var6 += var5;
		CFARFRSG var11 = new CFARFRSG(arg0);
		var11.field44 = var6;
		AQXKJVRI var12 = new AQXKJVRI(var11);
		int var13 = var7.method32();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method32();
			CANZHIOT var20 = field34[var19] = new CANZHIOT();
			var20.field35 = var10.method30();
			var20.field36 = var12;
			int var21 = var7.method30();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method30();
				if (var25 > 0) {
					if (var12.field3[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field3[var26] == 0) {
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
					if (var12.field3[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method43();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method43();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method43();
					}

					var22 = var24;
					var23++;

					if (var12.field3[var24] == 5) {
						field42[var19] = false;
					}
				}
			}

			var20.field37 = var23;
			var20.field38 = new int[var23];
			var20.field39 = new int[var23];
			var20.field40 = new int[var23];
			var20.field41 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field38[var28] = var14[var28];
				var20.field39[var28] = var15[var28];
				var20.field40[var28] = var16[var28];
				var20.field41[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("CANZHIOT.a(Z)V")
	public static void method15() {
		field34 = null;
	}

	@ObfuscatedName("CANZHIOT.a(II)LCANZHIOT;")
	public static CANZHIOT method16(int arg0) {
		if (field34 == null) {
			return null;
		}

		return field34[arg0];
	}

	@ObfuscatedName("CANZHIOT.a(IZ)Z")
	public static boolean method17(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
