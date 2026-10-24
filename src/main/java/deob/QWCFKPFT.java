package deob;

@ObfuscatedName("QWCFKPFT")
public class QWCFKPFT {

	@ObfuscatedName("QWCFKPFT.e")
	public int field1126;

	@ObfuscatedName("QWCFKPFT.g")
	public int field1128;

	@ObfuscatedName("QWCFKPFT.f")
	public OSKYDPYJ field1127;

	@ObfuscatedName("QWCFKPFT.h")
	public int[] field1129;

	@ObfuscatedName("QWCFKPFT.i")
	public int[] field1130;

	@ObfuscatedName("QWCFKPFT.j")
	public int[] field1131;

	@ObfuscatedName("QWCFKPFT.k")
	public int[] field1132;

	@ObfuscatedName("QWCFKPFT.d")
	public static QWCFKPFT[] field1125;

	@ObfuscatedName("QWCFKPFT.l")
	public static boolean[] field1133;

	@ObfuscatedName("QWCFKPFT.a(I)V")
	public static void method500(int arg0) {
		field1125 = new QWCFKPFT[arg0 + 1];
		field1133 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1133[var1] = true;
		}
	}

	@ObfuscatedName("QWCFKPFT.a(Z[B)V")
	public static void method501(byte[] arg0) {
		KHOMSBHW var1 = new KHOMSBHW(arg0);
		var1.field934 = arg0.length - 8;
		int var2 = var1.method351();
		int var3 = var1.method351();
		int var4 = var1.method351();
		int var5 = var1.method351();
		int var6 = 0;
		KHOMSBHW var7 = new KHOMSBHW(arg0);
		var7.field934 = var6;
		var6 += var2 + 2;
		KHOMSBHW var8 = new KHOMSBHW(arg0);
		var8.field934 = var6;
		var6 += var3;
		KHOMSBHW var9 = new KHOMSBHW(arg0);
		var9.field934 = var6;
		var6 += var4;
		KHOMSBHW var10 = new KHOMSBHW(arg0);
		var10.field934 = var6;
		var6 += var5;
		KHOMSBHW var11 = new KHOMSBHW(arg0);
		var11.field934 = var6;
		OSKYDPYJ var12 = new OSKYDPYJ(var11);
		int var13 = var7.method351();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method351();
			QWCFKPFT var20 = field1125[var19] = new QWCFKPFT();
			var20.field1126 = var10.method349();
			var20.field1127 = var12;
			int var21 = var7.method349();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method349();
				if (var25 > 0) {
					if (var12.field1060[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1060[var26] == 0) {
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
					if (var12.field1060[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method362();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method362();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method362();
					}

					var22 = var24;
					var23++;

					if (var12.field1060[var24] == 5) {
						field1133[var19] = false;
					}
				}
			}

			var20.field1128 = var23;
			var20.field1129 = new int[var23];
			var20.field1130 = new int[var23];
			var20.field1131 = new int[var23];
			var20.field1132 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1129[var28] = var14[var28];
				var20.field1130[var28] = var15[var28];
				var20.field1131[var28] = var16[var28];
				var20.field1132[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("QWCFKPFT.b(I)V")
	public static void method502() {
		field1125 = null;
	}

	@ObfuscatedName("QWCFKPFT.a(II)LQWCFKPFT;")
	public static QWCFKPFT method503(int arg0) {
		if (field1125 == null) {
			return null;
		}

		return field1125[arg0];
	}

	@ObfuscatedName("QWCFKPFT.b(II)Z")
	public static boolean method504(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
