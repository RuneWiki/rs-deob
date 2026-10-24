package deob;

@ObfuscatedName("ICYGYVTE")
public class ICYGYVTE {

	@ObfuscatedName("ICYGYVTE.c")
	public int field764;

	@ObfuscatedName("ICYGYVTE.e")
	public int field766;

	@ObfuscatedName("ICYGYVTE.d")
	public OAUECDUZ field765;

	@ObfuscatedName("ICYGYVTE.f")
	public int[] field767;

	@ObfuscatedName("ICYGYVTE.g")
	public int[] field768;

	@ObfuscatedName("ICYGYVTE.h")
	public int[] field769;

	@ObfuscatedName("ICYGYVTE.i")
	public int[] field770;

	@ObfuscatedName("ICYGYVTE.b")
	public static ICYGYVTE[] field763;

	@ObfuscatedName("ICYGYVTE.j")
	public static boolean[] field771;

	@ObfuscatedName("ICYGYVTE.a(I)V")
	public static void method345(int arg0) {
		field763 = new ICYGYVTE[arg0 + 1];
		field771 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field771[var1] = true;
		}
	}

	@ObfuscatedName("ICYGYVTE.a(I[B)V")
	public static void method346(byte[] arg0) {
		EGCCHUZS var1 = new EGCCHUZS(arg0);
		var1.field589 = arg0.length - 8;
		int var2 = var1.method263();
		int var3 = var1.method263();
		int var4 = var1.method263();
		int var5 = var1.method263();
		int var6 = 0;
		EGCCHUZS var7 = new EGCCHUZS(arg0);
		var7.field589 = var6;
		var6 += var2 + 2;
		EGCCHUZS var8 = new EGCCHUZS(arg0);
		var8.field589 = var6;
		var6 += var3;
		EGCCHUZS var9 = new EGCCHUZS(arg0);
		var9.field589 = var6;
		var6 += var4;
		EGCCHUZS var10 = new EGCCHUZS(arg0);
		var10.field589 = var6;
		var6 += var5;
		EGCCHUZS var11 = new EGCCHUZS(arg0);
		var11.field589 = var6;
		OAUECDUZ var12 = new OAUECDUZ(var11);
		int var13 = var7.method263();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method263();
			ICYGYVTE var20 = field763[var19] = new ICYGYVTE();
			var20.field764 = var10.method261();
			var20.field765 = var12;
			int var21 = var7.method261();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method261();
				if (var25 > 0) {
					if (var12.field1108[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1108[var26] == 0) {
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
					if (var12.field1108[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method274();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method274();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method274();
					}

					var22 = var24;
					var23++;

					if (var12.field1108[var24] == 5) {
						field771[var19] = false;
					}
				}
			}

			var20.field766 = var23;
			var20.field767 = new int[var23];
			var20.field768 = new int[var23];
			var20.field769 = new int[var23];
			var20.field770 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field767[var28] = var14[var28];
				var20.field768[var28] = var15[var28];
				var20.field769[var28] = var16[var28];
				var20.field770[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("ICYGYVTE.a(B)V")
	public static void method347() {
		field763 = null;
	}

	@ObfuscatedName("ICYGYVTE.b(I)LICYGYVTE;")
	public static ICYGYVTE method348(int arg0) {
		if (field763 == null) {
			return null;
		}

		return field763[arg0];
	}

	@ObfuscatedName("ICYGYVTE.a(II)Z")
	public static boolean method349(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
