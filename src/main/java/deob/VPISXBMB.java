package deob;

@ObfuscatedName("VPISXBMB")
public class VPISXBMB {

	@ObfuscatedName("VPISXBMB.c")
	public int field1212;

	@ObfuscatedName("VPISXBMB.e")
	public int field1214;

	@ObfuscatedName("VPISXBMB.d")
	public PCSJGLYB field1213;

	@ObfuscatedName("VPISXBMB.f")
	public int[] field1215;

	@ObfuscatedName("VPISXBMB.g")
	public int[] field1216;

	@ObfuscatedName("VPISXBMB.h")
	public int[] field1217;

	@ObfuscatedName("VPISXBMB.i")
	public int[] field1218;

	@ObfuscatedName("VPISXBMB.b")
	public static VPISXBMB[] field1211;

	@ObfuscatedName("VPISXBMB.j")
	public static boolean[] field1219;

	@ObfuscatedName("VPISXBMB.a(I)V")
	public static void method509(int arg0) {
		field1211 = new VPISXBMB[arg0 + 1];
		field1219 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1219[var1] = true;
		}
	}

	@ObfuscatedName("VPISXBMB.a(I[B)V")
	public static void method510(byte[] arg0) {
		MQZHAILV var1 = new MQZHAILV(arg0);
		var1.field797 = arg0.length - 8;
		int var2 = var1.method327();
		int var3 = var1.method327();
		int var4 = var1.method327();
		int var5 = var1.method327();
		int var6 = 0;
		MQZHAILV var7 = new MQZHAILV(arg0);
		var7.field797 = var6;
		var6 += var2 + 2;
		MQZHAILV var8 = new MQZHAILV(arg0);
		var8.field797 = var6;
		var6 += var3;
		MQZHAILV var9 = new MQZHAILV(arg0);
		var9.field797 = var6;
		var6 += var4;
		MQZHAILV var10 = new MQZHAILV(arg0);
		var10.field797 = var6;
		var6 += var5;
		MQZHAILV var11 = new MQZHAILV(arg0);
		var11.field797 = var6;
		PCSJGLYB var12 = new PCSJGLYB(var11);
		int var13 = var7.method327();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method327();
			VPISXBMB var20 = field1211[var19] = new VPISXBMB();
			var20.field1212 = var10.method325();
			var20.field1213 = var12;
			int var21 = var7.method325();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method325();
				if (var25 > 0) {
					if (var12.field831[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field831[var26] == 0) {
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
					if (var12.field831[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method338();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method338();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method338();
					}

					var22 = var24;
					var23++;

					if (var12.field831[var24] == 5) {
						field1219[var19] = false;
					}
				}
			}

			var20.field1214 = var23;
			var20.field1215 = new int[var23];
			var20.field1216 = new int[var23];
			var20.field1217 = new int[var23];
			var20.field1218 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1215[var28] = var14[var28];
				var20.field1216[var28] = var15[var28];
				var20.field1217[var28] = var16[var28];
				var20.field1218[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("VPISXBMB.a(B)V")
	public static void method511() {
		field1211 = null;
	}

	@ObfuscatedName("VPISXBMB.a(II)LVPISXBMB;")
	public static VPISXBMB method512(int arg0) {
		if (field1211 == null) {
			return null;
		}

		return field1211[arg0];
	}

	@ObfuscatedName("VPISXBMB.b(II)Z")
	public static boolean method513(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
