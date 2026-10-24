package deob;

@ObfuscatedName("IBCKUTPD")
public class IBCKUTPD {

	@ObfuscatedName("IBCKUTPD.c")
	public int field751;

	@ObfuscatedName("IBCKUTPD.e")
	public int field753;

	@ObfuscatedName("IBCKUTPD.d")
	public MXTMAEWO field752;

	@ObfuscatedName("IBCKUTPD.f")
	public int[] field754;

	@ObfuscatedName("IBCKUTPD.g")
	public int[] field755;

	@ObfuscatedName("IBCKUTPD.h")
	public int[] field756;

	@ObfuscatedName("IBCKUTPD.i")
	public int[] field757;

	@ObfuscatedName("IBCKUTPD.b")
	public static IBCKUTPD[] field750;

	@ObfuscatedName("IBCKUTPD.j")
	public static boolean[] field758;

	@ObfuscatedName("IBCKUTPD.a(I)V")
	public static void method305(int arg0) {
		field750 = new IBCKUTPD[arg0 + 1];
		field758 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field758[var1] = true;
		}
	}

	@ObfuscatedName("IBCKUTPD.a(B[B)V")
	public static void method306(byte[] arg0) {
		EILHLJCE var1 = new EILHLJCE(arg0);
		var1.field684 = arg0.length - 8;
		int var2 = var1.method226();
		int var3 = var1.method226();
		int var4 = var1.method226();
		int var5 = var1.method226();
		int var6 = 0;
		EILHLJCE var7 = new EILHLJCE(arg0);
		var7.field684 = var6;
		var6 += var2 + 2;
		EILHLJCE var8 = new EILHLJCE(arg0);
		var8.field684 = var6;
		var6 += var3;
		EILHLJCE var9 = new EILHLJCE(arg0);
		var9.field684 = var6;
		var6 += var4;
		EILHLJCE var10 = new EILHLJCE(arg0);
		var10.field684 = var6;
		var6 += var5;
		EILHLJCE var11 = new EILHLJCE(arg0);
		var11.field684 = var6;
		MXTMAEWO var12 = new MXTMAEWO(var11);
		int var13 = var7.method226();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method226();
			IBCKUTPD var20 = field750[var19] = new IBCKUTPD();
			var20.field751 = var10.method224();
			var20.field752 = var12;
			int var21 = var7.method224();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method224();
				if (var25 > 0) {
					if (var12.field976[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field976[var26] == 0) {
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
					if (var12.field976[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method237();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method237();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method237();
					}

					var22 = var24;
					var23++;

					if (var12.field976[var24] == 5) {
						field758[var19] = false;
					}
				}
			}

			var20.field753 = var23;
			var20.field754 = new int[var23];
			var20.field755 = new int[var23];
			var20.field756 = new int[var23];
			var20.field757 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field754[var28] = var14[var28];
				var20.field755[var28] = var15[var28];
				var20.field756[var28] = var16[var28];
				var20.field757[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("IBCKUTPD.b(I)V")
	public static void method307() {
		field750 = null;
	}

	@ObfuscatedName("IBCKUTPD.c(I)LIBCKUTPD;")
	public static IBCKUTPD method308(int arg0) {
		if (field750 == null) {
			return null;
		}

		return field750[arg0];
	}

	@ObfuscatedName("IBCKUTPD.a(IZ)Z")
	public static boolean method309(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
