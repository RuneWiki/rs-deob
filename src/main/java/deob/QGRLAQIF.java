package deob;

@ObfuscatedName("QGRLAQIF")
public class QGRLAQIF {

	@ObfuscatedName("QGRLAQIF.b")
	public int field1140;

	@ObfuscatedName("QGRLAQIF.d")
	public int field1142;

	@ObfuscatedName("QGRLAQIF.c")
	public QZXSFRVC field1141;

	@ObfuscatedName("QGRLAQIF.e")
	public int[] field1143;

	@ObfuscatedName("QGRLAQIF.f")
	public int[] field1144;

	@ObfuscatedName("QGRLAQIF.g")
	public int[] field1145;

	@ObfuscatedName("QGRLAQIF.h")
	public int[] field1146;

	@ObfuscatedName("QGRLAQIF.a")
	public static QGRLAQIF[] field1139;

	@ObfuscatedName("QGRLAQIF.i")
	public static boolean[] field1147;

	@ObfuscatedName("QGRLAQIF.a(I)V")
	public static void method465(int arg0) {
		field1139 = new QGRLAQIF[arg0 + 1];
		field1147 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1147[var1] = true;
		}
	}

	@ObfuscatedName("QGRLAQIF.a([BB)V")
	public static void method466(byte[] arg0) {
		LBBVYYXO var1 = new LBBVYYXO(arg0);
		var1.field882 = arg0.length - 8;
		int var2 = var1.method371();
		int var3 = var1.method371();
		int var4 = var1.method371();
		int var5 = var1.method371();
		int var6 = 0;
		LBBVYYXO var7 = new LBBVYYXO(arg0);
		var7.field882 = var6;
		var6 += var2 + 2;
		LBBVYYXO var8 = new LBBVYYXO(arg0);
		var8.field882 = var6;
		var6 += var3;
		LBBVYYXO var9 = new LBBVYYXO(arg0);
		var9.field882 = var6;
		var6 += var4;
		LBBVYYXO var10 = new LBBVYYXO(arg0);
		var10.field882 = var6;
		var6 += var5;
		LBBVYYXO var11 = new LBBVYYXO(arg0);
		var11.field882 = var6;
		QZXSFRVC var12 = new QZXSFRVC(var11);
		int var13 = var7.method371();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method371();
			QGRLAQIF var20 = field1139[var19] = new QGRLAQIF();
			var20.field1140 = var10.method369();
			var20.field1141 = var12;
			int var21 = var7.method369();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method369();
				if (var25 > 0) {
					if (var12.field1149[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1149[var26] == 0) {
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
					if (var12.field1149[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method382();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method382();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method382();
					}

					var22 = var24;
					var23++;

					if (var12.field1149[var24] == 5) {
						field1147[var19] = false;
					}
				}
			}

			var20.field1142 = var23;
			var20.field1143 = new int[var23];
			var20.field1144 = new int[var23];
			var20.field1145 = new int[var23];
			var20.field1146 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1143[var28] = var14[var28];
				var20.field1144[var28] = var15[var28];
				var20.field1145[var28] = var16[var28];
				var20.field1146[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("QGRLAQIF.a(Z)V")
	public static void method467() {
		field1139 = null;
	}

	@ObfuscatedName("QGRLAQIF.b(I)LQGRLAQIF;")
	public static QGRLAQIF method468(int arg0) {
		if (field1139 == null) {
			return null;
		}

		return field1139[arg0];
	}

	@ObfuscatedName("QGRLAQIF.a(IZ)Z")
	public static boolean method469(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
