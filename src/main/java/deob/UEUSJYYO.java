package deob;

@ObfuscatedName("UEUSJYYO")
public class UEUSJYYO {

	@ObfuscatedName("UEUSJYYO.f")
	public int field1143;

	@ObfuscatedName("UEUSJYYO.h")
	public int field1145;

	@ObfuscatedName("UEUSJYYO.g")
	public ETJKXQLD field1144;

	@ObfuscatedName("UEUSJYYO.i")
	public int[] field1146;

	@ObfuscatedName("UEUSJYYO.j")
	public int[] field1147;

	@ObfuscatedName("UEUSJYYO.k")
	public int[] field1148;

	@ObfuscatedName("UEUSJYYO.l")
	public int[] field1149;

	@ObfuscatedName("UEUSJYYO.e")
	public static UEUSJYYO[] field1142;

	@ObfuscatedName("UEUSJYYO.m")
	public static boolean[] field1150;

	@ObfuscatedName("UEUSJYYO.a(I)V")
	public static void method532(int arg0) {
		field1142 = new UEUSJYYO[arg0 + 1];
		field1150 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1150[var1] = true;
		}
	}

	@ObfuscatedName("UEUSJYYO.a(B[B)V")
	public static void method533(byte[] arg0) {
		LDILQFVA var1 = new LDILQFVA(arg0);
		var1.field902 = arg0.length - 8;
		int var2 = var1.method404();
		int var3 = var1.method404();
		int var4 = var1.method404();
		int var5 = var1.method404();
		int var6 = 0;
		LDILQFVA var7 = new LDILQFVA(arg0);
		var7.field902 = var6;
		var6 += var2 + 2;
		LDILQFVA var8 = new LDILQFVA(arg0);
		var8.field902 = var6;
		var6 += var3;
		LDILQFVA var9 = new LDILQFVA(arg0);
		var9.field902 = var6;
		var6 += var4;
		LDILQFVA var10 = new LDILQFVA(arg0);
		var10.field902 = var6;
		var6 += var5;
		LDILQFVA var11 = new LDILQFVA(arg0);
		var11.field902 = var6;
		ETJKXQLD var12 = new ETJKXQLD(var11);
		int var13 = var7.method404();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method404();
			UEUSJYYO var20 = field1142[var19] = new UEUSJYYO();
			var20.field1143 = var10.method402();
			var20.field1144 = var12;
			int var21 = var7.method402();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method402();
				if (var25 > 0) {
					if (var12.field609[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field609[var26] == 0) {
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
					if (var12.field609[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method415();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method415();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method415();
					}

					var22 = var24;
					var23++;

					if (var12.field609[var24] == 5) {
						field1150[var19] = false;
					}
				}
			}

			var20.field1145 = var23;
			var20.field1146 = new int[var23];
			var20.field1147 = new int[var23];
			var20.field1148 = new int[var23];
			var20.field1149 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1146[var28] = var14[var28];
				var20.field1147[var28] = var15[var28];
				var20.field1148[var28] = var16[var28];
				var20.field1149[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("UEUSJYYO.b(I)V")
	public static void method534() {
		field1142 = null;
	}

	@ObfuscatedName("UEUSJYYO.a(IB)LUEUSJYYO;")
	public static UEUSJYYO method535(int arg0) {
		if (field1142 == null) {
			return null;
		}

		return field1142[arg0];
	}

	@ObfuscatedName("UEUSJYYO.a(II)Z")
	public static boolean method536(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
