package deob;

@ObfuscatedName("OZAHMTPS")
public class OZAHMTPS {

	@ObfuscatedName("OZAHMTPS.d")
	public int field942;

	@ObfuscatedName("OZAHMTPS.f")
	public int field944;

	@ObfuscatedName("OZAHMTPS.e")
	public LMYEIVWK field943;

	@ObfuscatedName("OZAHMTPS.g")
	public int[] field945;

	@ObfuscatedName("OZAHMTPS.h")
	public int[] field946;

	@ObfuscatedName("OZAHMTPS.i")
	public int[] field947;

	@ObfuscatedName("OZAHMTPS.j")
	public int[] field948;

	@ObfuscatedName("OZAHMTPS.c")
	public static OZAHMTPS[] field941;

	@ObfuscatedName("OZAHMTPS.k")
	public static boolean[] field949;

	@ObfuscatedName("OZAHMTPS.a(I)V")
	public static void method334(int arg0) {
		field941 = new OZAHMTPS[arg0 + 1];
		field949 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field949[var1] = true;
		}
	}

	@ObfuscatedName("OZAHMTPS.a([BI)V")
	public static void method335(byte[] arg0) {
		RSWRPCHR var1 = new RSWRPCHR(arg0);
		var1.field1038 = arg0.length - 8;
		int var2 = var1.method390();
		int var3 = var1.method390();
		int var4 = var1.method390();
		int var5 = var1.method390();
		int var6 = 0;
		RSWRPCHR var7 = new RSWRPCHR(arg0);
		var7.field1038 = var6;
		var6 += var2 + 2;
		RSWRPCHR var8 = new RSWRPCHR(arg0);
		var8.field1038 = var6;
		var6 += var3;
		RSWRPCHR var9 = new RSWRPCHR(arg0);
		var9.field1038 = var6;
		var6 += var4;
		RSWRPCHR var10 = new RSWRPCHR(arg0);
		var10.field1038 = var6;
		var6 += var5;
		RSWRPCHR var11 = new RSWRPCHR(arg0);
		var11.field1038 = var6;
		LMYEIVWK var12 = new LMYEIVWK(var11);
		int var13 = var7.method390();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method390();
			OZAHMTPS var20 = field941[var19] = new OZAHMTPS();
			var20.field942 = var10.method388();
			var20.field943 = var12;
			int var21 = var7.method388();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method388();
				if (var25 > 0) {
					if (var12.field829[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field829[var26] == 0) {
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
					if (var12.field829[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method401();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method401();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method401();
					}

					var22 = var24;
					var23++;

					if (var12.field829[var24] == 5) {
						field949[var19] = false;
					}
				}
			}

			var20.field944 = var23;
			var20.field945 = new int[var23];
			var20.field946 = new int[var23];
			var20.field947 = new int[var23];
			var20.field948 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field945[var28] = var14[var28];
				var20.field946[var28] = var15[var28];
				var20.field947[var28] = var16[var28];
				var20.field948[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("OZAHMTPS.b(I)V")
	public static void method336() {
		field941 = null;
	}

	@ObfuscatedName("OZAHMTPS.c(I)LOZAHMTPS;")
	public static OZAHMTPS method337(int arg0) {
		if (field941 == null) {
			return null;
		}

		return field941[arg0];
	}

	@ObfuscatedName("OZAHMTPS.a(IB)Z")
	public static boolean method338(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
