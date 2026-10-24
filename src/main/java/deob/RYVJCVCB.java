package deob;

@ObfuscatedName("RYVJCVCB")
public class RYVJCVCB {

	@ObfuscatedName("RYVJCVCB.d")
	public int field1159;

	@ObfuscatedName("RYVJCVCB.f")
	public int field1161;

	@ObfuscatedName("RYVJCVCB.e")
	public ANHDGPPA field1160;

	@ObfuscatedName("RYVJCVCB.g")
	public int[] field1162;

	@ObfuscatedName("RYVJCVCB.h")
	public int[] field1163;

	@ObfuscatedName("RYVJCVCB.i")
	public int[] field1164;

	@ObfuscatedName("RYVJCVCB.j")
	public int[] field1165;

	@ObfuscatedName("RYVJCVCB.c")
	public static RYVJCVCB[] field1158;

	@ObfuscatedName("RYVJCVCB.k")
	public static boolean[] field1166;

	@ObfuscatedName("RYVJCVCB.a(I)V")
	public static void method424(int arg0) {
		field1158 = new RYVJCVCB[arg0 + 1];
		field1166 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1166[var1] = true;
		}
	}

	@ObfuscatedName("RYVJCVCB.a([BI)V")
	public static void method425(byte[] arg0) {
		XJCNBMKS var1 = new XJCNBMKS(arg0);
		var1.field1403 = arg0.length - 8;
		int var2 = var1.method536();
		int var3 = var1.method536();
		int var4 = var1.method536();
		int var5 = var1.method536();
		int var6 = 0;
		XJCNBMKS var7 = new XJCNBMKS(arg0);
		var7.field1403 = var6;
		var6 += var2 + 2;
		XJCNBMKS var8 = new XJCNBMKS(arg0);
		var8.field1403 = var6;
		var6 += var3;
		XJCNBMKS var9 = new XJCNBMKS(arg0);
		var9.field1403 = var6;
		var6 += var4;
		XJCNBMKS var10 = new XJCNBMKS(arg0);
		var10.field1403 = var6;
		var6 += var5;
		XJCNBMKS var11 = new XJCNBMKS(arg0);
		var11.field1403 = var6;
		ANHDGPPA var12 = new ANHDGPPA(var11);
		int var13 = var7.method536();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method536();
			RYVJCVCB var20 = field1158[var19] = new RYVJCVCB();
			var20.field1159 = var10.method534();
			var20.field1160 = var12;
			int var21 = var7.method534();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method534();
				if (var25 > 0) {
					if (var12.field32[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field32[var26] == 0) {
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
					if (var12.field32[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method547();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method547();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method547();
					}

					var22 = var24;
					var23++;

					if (var12.field32[var24] == 5) {
						field1166[var19] = false;
					}
				}
			}

			var20.field1161 = var23;
			var20.field1162 = new int[var23];
			var20.field1163 = new int[var23];
			var20.field1164 = new int[var23];
			var20.field1165 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1162[var28] = var14[var28];
				var20.field1163[var28] = var15[var28];
				var20.field1164[var28] = var16[var28];
				var20.field1165[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("RYVJCVCB.b(I)V")
	public static void method426() {
		field1158 = null;
	}

	@ObfuscatedName("RYVJCVCB.a(ZI)LRYVJCVCB;")
	public static RYVJCVCB method427(int arg0) {
		if (field1158 == null) {
			return null;
		}

		return field1158[arg0];
	}

	@ObfuscatedName("RYVJCVCB.a(II)Z")
	public static boolean method428(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
