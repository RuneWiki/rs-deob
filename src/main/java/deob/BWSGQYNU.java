package deob;

@ObfuscatedName("BWSGQYNU")
public class BWSGQYNU {

	@ObfuscatedName("BWSGQYNU.c")
	public int field36;

	@ObfuscatedName("BWSGQYNU.e")
	public int field38;

	@ObfuscatedName("BWSGQYNU.d")
	public JRQJNVRC field37;

	@ObfuscatedName("BWSGQYNU.f")
	public int[] field39;

	@ObfuscatedName("BWSGQYNU.g")
	public int[] field40;

	@ObfuscatedName("BWSGQYNU.h")
	public int[] field41;

	@ObfuscatedName("BWSGQYNU.i")
	public int[] field42;

	@ObfuscatedName("BWSGQYNU.b")
	public static BWSGQYNU[] field35;

	@ObfuscatedName("BWSGQYNU.j")
	public static boolean[] field43;

	@ObfuscatedName("BWSGQYNU.a(I)V")
	public static void method12(int arg0) {
		field35 = new BWSGQYNU[arg0 + 1];
		field43 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field43[var1] = true;
		}
	}

	@ObfuscatedName("BWSGQYNU.a([BZ)V")
	public static void method13(byte[] arg0) {
		INLHDAGO var1 = new INLHDAGO(arg0);
		var1.field969 = arg0.length - 8;
		int var2 = var1.method310();
		int var3 = var1.method310();
		int var4 = var1.method310();
		int var5 = var1.method310();
		int var6 = 0;
		INLHDAGO var7 = new INLHDAGO(arg0);
		var7.field969 = var6;
		var6 += var2 + 2;
		INLHDAGO var8 = new INLHDAGO(arg0);
		var8.field969 = var6;
		var6 += var3;
		INLHDAGO var9 = new INLHDAGO(arg0);
		var9.field969 = var6;
		var6 += var4;
		INLHDAGO var10 = new INLHDAGO(arg0);
		var10.field969 = var6;
		var6 += var5;
		INLHDAGO var11 = new INLHDAGO(arg0);
		var11.field969 = var6;
		JRQJNVRC var12 = new JRQJNVRC(var11);
		int var13 = var7.method310();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method310();
			BWSGQYNU var20 = field35[var19] = new BWSGQYNU();
			var20.field36 = var10.method308();
			var20.field37 = var12;
			int var21 = var7.method308();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method308();
				if (var25 > 0) {
					if (var12.field1054[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1054[var26] == 0) {
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
					if (var12.field1054[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method321();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method321();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method321();
					}

					var22 = var24;
					var23++;

					if (var12.field1054[var24] == 5) {
						field43[var19] = false;
					}
				}
			}

			var20.field38 = var23;
			var20.field39 = new int[var23];
			var20.field40 = new int[var23];
			var20.field41 = new int[var23];
			var20.field42 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field39[var28] = var14[var28];
				var20.field40[var28] = var15[var28];
				var20.field41[var28] = var16[var28];
				var20.field42[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("BWSGQYNU.a(Z)V")
	public static void method14() {
		field35 = null;
	}

	@ObfuscatedName("BWSGQYNU.a(II)LBWSGQYNU;")
	public static BWSGQYNU method15(int arg0) {
		if (field35 == null) {
			return null;
		}

		return field35[arg0];
	}

	@ObfuscatedName("BWSGQYNU.a(IZ)Z")
	public static boolean method16(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
