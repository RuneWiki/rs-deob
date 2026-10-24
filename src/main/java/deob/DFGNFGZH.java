package deob;

@ObfuscatedName("DFGNFGZH")
public class DFGNFGZH {

	@ObfuscatedName("DFGNFGZH.b")
	public int field610;

	@ObfuscatedName("DFGNFGZH.d")
	public int field612;

	@ObfuscatedName("DFGNFGZH.c")
	public BIWBGZXL field611;

	@ObfuscatedName("DFGNFGZH.e")
	public int[] field613;

	@ObfuscatedName("DFGNFGZH.f")
	public int[] field614;

	@ObfuscatedName("DFGNFGZH.g")
	public int[] field615;

	@ObfuscatedName("DFGNFGZH.h")
	public int[] field616;

	@ObfuscatedName("DFGNFGZH.a")
	public static DFGNFGZH[] field609;

	@ObfuscatedName("DFGNFGZH.i")
	public static boolean[] field617;

	@ObfuscatedName("DFGNFGZH.a(I)V")
	public static void method211(int arg0) {
		field609 = new DFGNFGZH[arg0 + 1];
		field617 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field617[var1] = true;
		}
	}

	@ObfuscatedName("DFGNFGZH.a(I[B)V")
	public static void method212(byte[] arg0) {
		MLYYHULT var1 = new MLYYHULT(arg0);
		var1.field963 = arg0.length - 8;
		int var2 = var1.method298();
		int var3 = var1.method298();
		int var4 = var1.method298();
		int var5 = var1.method298();
		int var6 = 0;
		MLYYHULT var7 = new MLYYHULT(arg0);
		var7.field963 = var6;
		var6 += var2 + 2;
		MLYYHULT var8 = new MLYYHULT(arg0);
		var8.field963 = var6;
		var6 += var3;
		MLYYHULT var9 = new MLYYHULT(arg0);
		var9.field963 = var6;
		var6 += var4;
		MLYYHULT var10 = new MLYYHULT(arg0);
		var10.field963 = var6;
		var6 += var5;
		MLYYHULT var11 = new MLYYHULT(arg0);
		var11.field963 = var6;
		BIWBGZXL var12 = new BIWBGZXL(var11);
		int var13 = var7.method298();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method298();
			DFGNFGZH var20 = field609[var19] = new DFGNFGZH();
			var20.field610 = var10.method296();
			var20.field611 = var12;
			int var21 = var7.method296();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method296();
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
						var15[var23] = var9.method309();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method309();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method309();
					}

					var22 = var24;
					var23++;

					if (var12.field2[var24] == 5) {
						field617[var19] = false;
					}
				}
			}

			var20.field612 = var23;
			var20.field613 = new int[var23];
			var20.field614 = new int[var23];
			var20.field615 = new int[var23];
			var20.field616 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field613[var28] = var14[var28];
				var20.field614[var28] = var15[var28];
				var20.field615[var28] = var16[var28];
				var20.field616[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("DFGNFGZH.b(I)V")
	public static void method213() {
		field609 = null;
	}

	@ObfuscatedName("DFGNFGZH.c(I)LDFGNFGZH;")
	public static DFGNFGZH method214(int arg0) {
		if (field609 == null) {
			return null;
		}

		return field609[arg0];
	}

	@ObfuscatedName("DFGNFGZH.a(ZI)Z")
	public static boolean method215(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
