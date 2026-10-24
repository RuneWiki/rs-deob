package deob;

@ObfuscatedName("APJPJMYV")
public class APJPJMYV {

	@ObfuscatedName("APJPJMYV.b")
	public int field12;

	@ObfuscatedName("APJPJMYV.d")
	public int field14;

	@ObfuscatedName("APJPJMYV.c")
	public MOLQXLMB field13;

	@ObfuscatedName("APJPJMYV.e")
	public int[] field15;

	@ObfuscatedName("APJPJMYV.f")
	public int[] field16;

	@ObfuscatedName("APJPJMYV.g")
	public int[] field17;

	@ObfuscatedName("APJPJMYV.h")
	public int[] field18;

	@ObfuscatedName("APJPJMYV.a")
	public static APJPJMYV[] field11;

	@ObfuscatedName("APJPJMYV.i")
	public static boolean[] field19;

	@ObfuscatedName("APJPJMYV.a(I)V")
	public static void method7(int arg0) {
		field11 = new APJPJMYV[arg0 + 1];
		field19 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field19[var1] = true;
		}
	}

	@ObfuscatedName("APJPJMYV.a(Z[B)V")
	public static void method8(byte[] arg0) {
		XGRGMPUQ var1 = new XGRGMPUQ(arg0);
		var1.field1432 = arg0.length - 8;
		int var2 = var1.method467();
		int var3 = var1.method467();
		int var4 = var1.method467();
		int var5 = var1.method467();
		int var6 = 0;
		XGRGMPUQ var7 = new XGRGMPUQ(arg0);
		var7.field1432 = var6;
		var6 += var2 + 2;
		XGRGMPUQ var8 = new XGRGMPUQ(arg0);
		var8.field1432 = var6;
		var6 += var3;
		XGRGMPUQ var9 = new XGRGMPUQ(arg0);
		var9.field1432 = var6;
		var6 += var4;
		XGRGMPUQ var10 = new XGRGMPUQ(arg0);
		var10.field1432 = var6;
		var6 += var5;
		XGRGMPUQ var11 = new XGRGMPUQ(arg0);
		var11.field1432 = var6;
		MOLQXLMB var12 = new MOLQXLMB(var11);
		int var13 = var7.method467();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method467();
			APJPJMYV var20 = field11[var19] = new APJPJMYV();
			var20.field12 = var10.method465();
			var20.field13 = var12;
			int var21 = var7.method465();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method465();
				if (var25 > 0) {
					if (var12.field1061[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1061[var26] == 0) {
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
					if (var12.field1061[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method478();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method478();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method478();
					}

					var22 = var24;
					var23++;

					if (var12.field1061[var24] == 5) {
						field19[var19] = false;
					}
				}
			}

			var20.field14 = var23;
			var20.field15 = new int[var23];
			var20.field16 = new int[var23];
			var20.field17 = new int[var23];
			var20.field18 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field15[var28] = var14[var28];
				var20.field16[var28] = var15[var28];
				var20.field17[var28] = var16[var28];
				var20.field18[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("APJPJMYV.a(B)V")
	public static void method9() {
		field11 = null;
	}

	@ObfuscatedName("APJPJMYV.b(I)LAPJPJMYV;")
	public static APJPJMYV method10(int arg0) {
		if (field11 == null) {
			return null;
		}

		return field11[arg0];
	}

	@ObfuscatedName("APJPJMYV.a(BI)Z")
	public static boolean method11(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
