package deob;

@ObfuscatedName("UXVWESOT")
public class UXVWESOT {

	@ObfuscatedName("UXVWESOT.e")
	public int field1191;

	@ObfuscatedName("UXVWESOT.g")
	public int field1193;

	@ObfuscatedName("UXVWESOT.f")
	public AZLXGPCM field1192;

	@ObfuscatedName("UXVWESOT.h")
	public int[] field1194;

	@ObfuscatedName("UXVWESOT.i")
	public int[] field1195;

	@ObfuscatedName("UXVWESOT.j")
	public int[] field1196;

	@ObfuscatedName("UXVWESOT.k")
	public int[] field1197;

	@ObfuscatedName("UXVWESOT.d")
	public static UXVWESOT[] field1190;

	@ObfuscatedName("UXVWESOT.l")
	public static boolean[] field1198;

	@ObfuscatedName("UXVWESOT.a(I)V")
	public static void method451(int arg0) {
		field1190 = new UXVWESOT[arg0 + 1];
		field1198 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1198[var1] = true;
		}
	}

	@ObfuscatedName("UXVWESOT.a(I[B)V")
	public static void method452(byte[] arg0) {
		YOXDZEVD var1 = new YOXDZEVD(arg0);
		var1.field1393 = arg0.length - 8;
		int var2 = var1.method551();
		int var3 = var1.method551();
		int var4 = var1.method551();
		int var5 = var1.method551();
		int var6 = 0;
		YOXDZEVD var7 = new YOXDZEVD(arg0);
		var7.field1393 = var6;
		var6 += var2 + 2;
		YOXDZEVD var8 = new YOXDZEVD(arg0);
		var8.field1393 = var6;
		var6 += var3;
		YOXDZEVD var9 = new YOXDZEVD(arg0);
		var9.field1393 = var6;
		var6 += var4;
		YOXDZEVD var10 = new YOXDZEVD(arg0);
		var10.field1393 = var6;
		var6 += var5;
		YOXDZEVD var11 = new YOXDZEVD(arg0);
		var11.field1393 = var6;
		AZLXGPCM var12 = new AZLXGPCM(var11);
		int var13 = var7.method551();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method551();
			UXVWESOT var20 = field1190[var19] = new UXVWESOT();
			var20.field1191 = var10.method549();
			var20.field1192 = var12;
			int var21 = var7.method549();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method549();
				if (var25 > 0) {
					if (var12.field118[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field118[var26] == 0) {
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
					if (var12.field118[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method562();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method562();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method562();
					}

					var22 = var24;
					var23++;

					if (var12.field118[var24] == 5) {
						field1198[var19] = false;
					}
				}
			}

			var20.field1193 = var23;
			var20.field1194 = new int[var23];
			var20.field1195 = new int[var23];
			var20.field1196 = new int[var23];
			var20.field1197 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1194[var28] = var14[var28];
				var20.field1195[var28] = var15[var28];
				var20.field1196[var28] = var16[var28];
				var20.field1197[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("UXVWESOT.a(Z)V")
	public static void method453() {
		field1190 = null;
	}

	@ObfuscatedName("UXVWESOT.a(ZI)LUXVWESOT;")
	public static UXVWESOT method454(int arg0) {
		if (field1190 == null) {
			return null;
		}

		return field1190[arg0];
	}

	@ObfuscatedName("UXVWESOT.b(ZI)Z")
	public static boolean method455(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
