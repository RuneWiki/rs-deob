package deob;

@ObfuscatedName("XZZTWOGF")
public class XZZTWOGF {

	@ObfuscatedName("XZZTWOGF.c")
	public int field1442;

	@ObfuscatedName("XZZTWOGF.e")
	public int field1444;

	@ObfuscatedName("XZZTWOGF.d")
	public TJOELOUM field1443;

	@ObfuscatedName("XZZTWOGF.f")
	public int[] field1445;

	@ObfuscatedName("XZZTWOGF.g")
	public int[] field1446;

	@ObfuscatedName("XZZTWOGF.h")
	public int[] field1447;

	@ObfuscatedName("XZZTWOGF.i")
	public int[] field1448;

	@ObfuscatedName("XZZTWOGF.b")
	public static XZZTWOGF[] field1441;

	@ObfuscatedName("XZZTWOGF.j")
	public static boolean[] field1449;

	@ObfuscatedName("XZZTWOGF.a(I)V")
	public static void method578(int arg0) {
		field1441 = new XZZTWOGF[arg0 + 1];
		field1449 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1449[var1] = true;
		}
	}

	@ObfuscatedName("XZZTWOGF.a([BI)V")
	public static void method579(byte[] arg0) {
		GHHPHSRU var1 = new GHHPHSRU(arg0);
		var1.field667 = arg0.length - 8;
		int var2 = var1.method204();
		int var3 = var1.method204();
		int var4 = var1.method204();
		int var5 = var1.method204();
		int var6 = 0;
		GHHPHSRU var7 = new GHHPHSRU(arg0);
		var7.field667 = var6;
		var6 += var2 + 2;
		GHHPHSRU var8 = new GHHPHSRU(arg0);
		var8.field667 = var6;
		var6 += var3;
		GHHPHSRU var9 = new GHHPHSRU(arg0);
		var9.field667 = var6;
		var6 += var4;
		GHHPHSRU var10 = new GHHPHSRU(arg0);
		var10.field667 = var6;
		var6 += var5;
		GHHPHSRU var11 = new GHHPHSRU(arg0);
		var11.field667 = var6;
		TJOELOUM var12 = new TJOELOUM(var11);
		int var13 = var7.method204();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method204();
			XZZTWOGF var20 = field1441[var19] = new XZZTWOGF();
			var20.field1442 = var10.method202();
			var20.field1443 = var12;
			int var21 = var7.method202();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method202();
				if (var25 > 0) {
					if (var12.field1265[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1265[var26] == 0) {
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
					if (var12.field1265[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method215();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method215();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method215();
					}

					var22 = var24;
					var23++;

					if (var12.field1265[var24] == 5) {
						field1449[var19] = false;
					}
				}
			}

			var20.field1444 = var23;
			var20.field1445 = new int[var23];
			var20.field1446 = new int[var23];
			var20.field1447 = new int[var23];
			var20.field1448 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1445[var28] = var14[var28];
				var20.field1446[var28] = var15[var28];
				var20.field1447[var28] = var16[var28];
				var20.field1448[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("XZZTWOGF.b(I)V")
	public static void method580() {
		field1441 = null;
	}

	@ObfuscatedName("XZZTWOGF.c(I)LXZZTWOGF;")
	public static XZZTWOGF method581(int arg0) {
		if (field1441 == null) {
			return null;
		}

		return field1441[arg0];
	}

	@ObfuscatedName("XZZTWOGF.a(II)Z")
	public static boolean method582(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
