package deob;

@ObfuscatedName("RKTGZGSS")
public class RKTGZGSS {

	@ObfuscatedName("RKTGZGSS.d")
	public int field1130;

	@ObfuscatedName("RKTGZGSS.f")
	public int field1132;

	@ObfuscatedName("RKTGZGSS.e")
	public DIQFKGVT field1131;

	@ObfuscatedName("RKTGZGSS.g")
	public int[] field1133;

	@ObfuscatedName("RKTGZGSS.h")
	public int[] field1134;

	@ObfuscatedName("RKTGZGSS.i")
	public int[] field1135;

	@ObfuscatedName("RKTGZGSS.j")
	public int[] field1136;

	@ObfuscatedName("RKTGZGSS.c")
	public static RKTGZGSS[] field1129;

	@ObfuscatedName("RKTGZGSS.k")
	public static boolean[] field1137;

	@ObfuscatedName("RKTGZGSS.a(I)V")
	public static void method379(int arg0) {
		field1129 = new RKTGZGSS[arg0 + 1];
		field1137 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1137[var1] = true;
		}
	}

	@ObfuscatedName("RKTGZGSS.a([BZ)V")
	public static void method380(byte[] arg0) {
		ZOMNSJJM var1 = new ZOMNSJJM(arg0);
		var1.field1457 = arg0.length - 8;
		int var2 = var1.method549();
		int var3 = var1.method549();
		int var4 = var1.method549();
		int var5 = var1.method549();
		int var6 = 0;
		ZOMNSJJM var7 = new ZOMNSJJM(arg0);
		var7.field1457 = var6;
		var6 += var2 + 2;
		ZOMNSJJM var8 = new ZOMNSJJM(arg0);
		var8.field1457 = var6;
		var6 += var3;
		ZOMNSJJM var9 = new ZOMNSJJM(arg0);
		var9.field1457 = var6;
		var6 += var4;
		ZOMNSJJM var10 = new ZOMNSJJM(arg0);
		var10.field1457 = var6;
		var6 += var5;
		ZOMNSJJM var11 = new ZOMNSJJM(arg0);
		var11.field1457 = var6;
		DIQFKGVT var12 = new DIQFKGVT(var11);
		int var13 = var7.method549();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method549();
			RKTGZGSS var20 = field1129[var19] = new RKTGZGSS();
			var20.field1130 = var10.method547();
			var20.field1131 = var12;
			int var21 = var7.method547();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method547();
				if (var25 > 0) {
					if (var12.field638[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field638[var26] == 0) {
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
					if (var12.field638[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method560();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method560();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method560();
					}

					var22 = var24;
					var23++;

					if (var12.field638[var24] == 5) {
						field1137[var19] = false;
					}
				}
			}

			var20.field1132 = var23;
			var20.field1133 = new int[var23];
			var20.field1134 = new int[var23];
			var20.field1135 = new int[var23];
			var20.field1136 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1133[var28] = var14[var28];
				var20.field1134[var28] = var15[var28];
				var20.field1135[var28] = var16[var28];
				var20.field1136[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("RKTGZGSS.a(B)V")
	public static void method381() {
		field1129 = null;
	}

	@ObfuscatedName("RKTGZGSS.a(II)LRKTGZGSS;")
	public static RKTGZGSS method382(int arg0) {
		if (field1129 == null) {
			return null;
		}

		return field1129[arg0];
	}

	@ObfuscatedName("RKTGZGSS.a(IB)Z")
	public static boolean method383(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
