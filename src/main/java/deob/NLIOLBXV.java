package deob;

@ObfuscatedName("NLIOLBXV")
public class NLIOLBXV {

	@ObfuscatedName("NLIOLBXV.e")
	public int field1004;

	@ObfuscatedName("NLIOLBXV.g")
	public int field1006;

	@ObfuscatedName("NLIOLBXV.f")
	public HSGACJOH field1005;

	@ObfuscatedName("NLIOLBXV.h")
	public int[] field1007;

	@ObfuscatedName("NLIOLBXV.i")
	public int[] field1008;

	@ObfuscatedName("NLIOLBXV.j")
	public int[] field1009;

	@ObfuscatedName("NLIOLBXV.k")
	public int[] field1010;

	@ObfuscatedName("NLIOLBXV.d")
	public static NLIOLBXV[] field1003;

	@ObfuscatedName("NLIOLBXV.l")
	public static boolean[] field1011;

	@ObfuscatedName("NLIOLBXV.a(I)V")
	public static void method352(int arg0) {
		field1003 = new NLIOLBXV[arg0 + 1];
		field1011 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1011[var1] = true;
		}
	}

	@ObfuscatedName("NLIOLBXV.a(I[B)V")
	public static void method353(byte[] arg0) {
		DNRIFKTO var1 = new DNRIFKTO(arg0);
		var1.field563 = arg0.length - 8;
		int var2 = var1.method191();
		int var3 = var1.method191();
		int var4 = var1.method191();
		int var5 = var1.method191();
		int var6 = 0;
		DNRIFKTO var7 = new DNRIFKTO(arg0);
		var7.field563 = var6;
		var6 += var2 + 2;
		DNRIFKTO var8 = new DNRIFKTO(arg0);
		var8.field563 = var6;
		var6 += var3;
		DNRIFKTO var9 = new DNRIFKTO(arg0);
		var9.field563 = var6;
		var6 += var4;
		DNRIFKTO var10 = new DNRIFKTO(arg0);
		var10.field563 = var6;
		var6 += var5;
		DNRIFKTO var11 = new DNRIFKTO(arg0);
		var11.field563 = var6;
		HSGACJOH var12 = new HSGACJOH(var11);
		int var13 = var7.method191();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method191();
			NLIOLBXV var20 = field1003[var19] = new NLIOLBXV();
			var20.field1004 = var10.method189();
			var20.field1005 = var12;
			int var21 = var7.method189();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method189();
				if (var25 > 0) {
					if (var12.field714[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field714[var26] == 0) {
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
					if (var12.field714[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method202();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method202();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method202();
					}

					var22 = var24;
					var23++;

					if (var12.field714[var24] == 5) {
						field1011[var19] = false;
					}
				}
			}

			var20.field1006 = var23;
			var20.field1007 = new int[var23];
			var20.field1008 = new int[var23];
			var20.field1009 = new int[var23];
			var20.field1010 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1007[var28] = var14[var28];
				var20.field1008[var28] = var15[var28];
				var20.field1009[var28] = var16[var28];
				var20.field1010[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("NLIOLBXV.b(I)V")
	public static void method354() {
		field1003 = null;
	}

	@ObfuscatedName("NLIOLBXV.c(I)LNLIOLBXV;")
	public static NLIOLBXV method355(int arg0) {
		if (field1003 == null) {
			return null;
		}

		return field1003[arg0];
	}

	@ObfuscatedName("NLIOLBXV.a(BI)Z")
	public static boolean method356(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
