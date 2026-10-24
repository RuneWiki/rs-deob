package deob;

@ObfuscatedName("FIYHSKKC")
public class FIYHSKKC {

	@ObfuscatedName("FIYHSKKC.c")
	public int field631;

	@ObfuscatedName("FIYHSKKC.e")
	public int field633;

	@ObfuscatedName("FIYHSKKC.d")
	public EHKAWURP field632;

	@ObfuscatedName("FIYHSKKC.f")
	public int[] field634;

	@ObfuscatedName("FIYHSKKC.g")
	public int[] field635;

	@ObfuscatedName("FIYHSKKC.h")
	public int[] field636;

	@ObfuscatedName("FIYHSKKC.i")
	public int[] field637;

	@ObfuscatedName("FIYHSKKC.b")
	public static FIYHSKKC[] field630;

	@ObfuscatedName("FIYHSKKC.j")
	public static boolean[] field638;

	@ObfuscatedName("FIYHSKKC.a(I)V")
	public static void method207(int arg0) {
		field630 = new FIYHSKKC[arg0 + 1];
		field638 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field638[var1] = true;
		}
	}

	@ObfuscatedName("FIYHSKKC.a([BB)V")
	public static void method208(byte[] arg0) {
		MNKDCXXG var1 = new MNKDCXXG(arg0);
		var1.field1055 = arg0.length - 8;
		int var2 = var1.method388();
		int var3 = var1.method388();
		int var4 = var1.method388();
		int var5 = var1.method388();
		int var6 = 0;
		MNKDCXXG var7 = new MNKDCXXG(arg0);
		var7.field1055 = var6;
		var6 += var2 + 2;
		MNKDCXXG var8 = new MNKDCXXG(arg0);
		var8.field1055 = var6;
		var6 += var3;
		MNKDCXXG var9 = new MNKDCXXG(arg0);
		var9.field1055 = var6;
		var6 += var4;
		MNKDCXXG var10 = new MNKDCXXG(arg0);
		var10.field1055 = var6;
		var6 += var5;
		MNKDCXXG var11 = new MNKDCXXG(arg0);
		var11.field1055 = var6;
		EHKAWURP var12 = new EHKAWURP(var11);
		int var13 = var7.method388();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method388();
			FIYHSKKC var20 = field630[var19] = new FIYHSKKC();
			var20.field631 = var10.method386();
			var20.field632 = var12;
			int var21 = var7.method386();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method386();
				if (var25 > 0) {
					if (var12.field553[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field553[var26] == 0) {
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
					if (var12.field553[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method399();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method399();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method399();
					}

					var22 = var24;
					var23++;

					if (var12.field553[var24] == 5) {
						field638[var19] = false;
					}
				}
			}

			var20.field633 = var23;
			var20.field634 = new int[var23];
			var20.field635 = new int[var23];
			var20.field636 = new int[var23];
			var20.field637 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field634[var28] = var14[var28];
				var20.field635[var28] = var15[var28];
				var20.field636[var28] = var16[var28];
				var20.field637[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("FIYHSKKC.b(I)V")
	public static void method209() {
		field630 = null;
	}

	@ObfuscatedName("FIYHSKKC.c(I)LFIYHSKKC;")
	public static FIYHSKKC method210(int arg0) {
		if (field630 == null) {
			return null;
		}

		return field630[arg0];
	}

	@ObfuscatedName("FIYHSKKC.a(II)Z")
	public static boolean method211(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
