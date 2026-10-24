package deob;

@ObfuscatedName("TTZHVWEG")
public class TTZHVWEG {

	@ObfuscatedName("TTZHVWEG.e")
	public int field1100;

	@ObfuscatedName("TTZHVWEG.g")
	public int field1102;

	@ObfuscatedName("TTZHVWEG.f")
	public AECNGNXZ field1101;

	@ObfuscatedName("TTZHVWEG.h")
	public int[] field1103;

	@ObfuscatedName("TTZHVWEG.i")
	public int[] field1104;

	@ObfuscatedName("TTZHVWEG.j")
	public int[] field1105;

	@ObfuscatedName("TTZHVWEG.k")
	public int[] field1106;

	@ObfuscatedName("TTZHVWEG.d")
	public static TTZHVWEG[] field1099;

	@ObfuscatedName("TTZHVWEG.l")
	public static boolean[] field1107;

	@ObfuscatedName("TTZHVWEG.a(I)V")
	public static void method485(int arg0) {
		field1099 = new TTZHVWEG[arg0 + 1];
		field1107 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1107[var1] = true;
		}
	}

	@ObfuscatedName("TTZHVWEG.a(Z[B)V")
	public static void method486(byte[] arg0) {
		GLMIQHJI var1 = new GLMIQHJI(arg0);
		var1.field709 = arg0.length - 8;
		int var2 = var1.method246();
		int var3 = var1.method246();
		int var4 = var1.method246();
		int var5 = var1.method246();
		int var6 = 0;
		GLMIQHJI var7 = new GLMIQHJI(arg0);
		var7.field709 = var6;
		var6 += var2 + 2;
		GLMIQHJI var8 = new GLMIQHJI(arg0);
		var8.field709 = var6;
		var6 += var3;
		GLMIQHJI var9 = new GLMIQHJI(arg0);
		var9.field709 = var6;
		var6 += var4;
		GLMIQHJI var10 = new GLMIQHJI(arg0);
		var10.field709 = var6;
		var6 += var5;
		GLMIQHJI var11 = new GLMIQHJI(arg0);
		var11.field709 = var6;
		AECNGNXZ var12 = new AECNGNXZ(var11);
		int var13 = var7.method246();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method246();
			TTZHVWEG var20 = field1099[var19] = new TTZHVWEG();
			var20.field1100 = var10.method244();
			var20.field1101 = var12;
			int var21 = var7.method244();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method244();
				if (var25 > 0) {
					if (var12.field2[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field2[var26] == 0) {
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
					if (var12.field2[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method257();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method257();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method257();
					}

					var22 = var24;
					var23++;

					if (var12.field2[var24] == 5) {
						field1107[var19] = false;
					}
				}
			}

			var20.field1102 = var23;
			var20.field1103 = new int[var23];
			var20.field1104 = new int[var23];
			var20.field1105 = new int[var23];
			var20.field1106 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1103[var28] = var14[var28];
				var20.field1104[var28] = var15[var28];
				var20.field1105[var28] = var16[var28];
				var20.field1106[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("TTZHVWEG.b(I)V")
	public static void method487() {
		field1099 = null;
	}

	@ObfuscatedName("TTZHVWEG.a(BI)LTTZHVWEG;")
	public static TTZHVWEG method488(int arg0) {
		if (field1099 == null) {
			return null;
		}

		return field1099[arg0];
	}

	@ObfuscatedName("TTZHVWEG.a(IB)Z")
	public static boolean method489(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
