package deob;

@ObfuscatedName("SCIASJXX")
public class SCIASJXX {

	@ObfuscatedName("SCIASJXX.b")
	public int field1109;

	@ObfuscatedName("SCIASJXX.d")
	public int field1111;

	@ObfuscatedName("SCIASJXX.c")
	public YRWSITPW field1110;

	@ObfuscatedName("SCIASJXX.e")
	public int[] field1112;

	@ObfuscatedName("SCIASJXX.f")
	public int[] field1113;

	@ObfuscatedName("SCIASJXX.g")
	public int[] field1114;

	@ObfuscatedName("SCIASJXX.h")
	public int[] field1115;

	@ObfuscatedName("SCIASJXX.a")
	public static SCIASJXX[] field1108;

	@ObfuscatedName("SCIASJXX.i")
	public static boolean[] field1116;

	@ObfuscatedName("SCIASJXX.a(I)V")
	public static void method397(int arg0) {
		field1108 = new SCIASJXX[arg0 + 1];
		field1116 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field1116[var1] = true;
		}
	}

	@ObfuscatedName("SCIASJXX.a(Z[B)V")
	public static void method398(byte[] arg0) {
		XQPFGONL var1 = new XQPFGONL(arg0);
		var1.field1335 = arg0.length - 8;
		int var2 = var1.method480();
		int var3 = var1.method480();
		int var4 = var1.method480();
		int var5 = var1.method480();
		int var6 = 0;
		XQPFGONL var7 = new XQPFGONL(arg0);
		var7.field1335 = var6;
		var6 += var2 + 2;
		XQPFGONL var8 = new XQPFGONL(arg0);
		var8.field1335 = var6;
		var6 += var3;
		XQPFGONL var9 = new XQPFGONL(arg0);
		var9.field1335 = var6;
		var6 += var4;
		XQPFGONL var10 = new XQPFGONL(arg0);
		var10.field1335 = var6;
		var6 += var5;
		XQPFGONL var11 = new XQPFGONL(arg0);
		var11.field1335 = var6;
		YRWSITPW var12 = new YRWSITPW(var11);
		int var13 = var7.method480();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method480();
			SCIASJXX var20 = field1108[var19] = new SCIASJXX();
			var20.field1109 = var10.method478();
			var20.field1110 = var12;
			int var21 = var7.method478();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method478();
				if (var25 > 0) {
					if (var12.field1407[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field1407[var26] == 0) {
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
					if (var12.field1407[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method491();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method491();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method491();
					}

					var22 = var24;
					var23++;

					if (var12.field1407[var24] == 5) {
						field1116[var19] = false;
					}
				}
			}

			var20.field1111 = var23;
			var20.field1112 = new int[var23];
			var20.field1113 = new int[var23];
			var20.field1114 = new int[var23];
			var20.field1115 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field1112[var28] = var14[var28];
				var20.field1113[var28] = var15[var28];
				var20.field1114[var28] = var16[var28];
				var20.field1115[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("SCIASJXX.b(I)V")
	public static void method399() {
		field1108 = null;
	}

	@ObfuscatedName("SCIASJXX.a(BI)LSCIASJXX;")
	public static SCIASJXX method400(int arg0) {
		if (field1108 == null) {
			return null;
		}

		return field1108[arg0];
	}

	@ObfuscatedName("SCIASJXX.a(II)Z")
	public static boolean method401(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
