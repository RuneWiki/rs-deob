package deob;

@ObfuscatedName("INFJTSRJ")
public class INFJTSRJ extends JNFESWRD {

	@ObfuscatedName("INFJTSRJ.t")
	public int field705;

	@ObfuscatedName("INFJTSRJ.u")
	public int field706;

	@ObfuscatedName("INFJTSRJ.v")
	public int field707;

	@ObfuscatedName("INFJTSRJ.l")
	public int field697;

	@ObfuscatedName("INFJTSRJ.m")
	public int field698;

	@ObfuscatedName("INFJTSRJ.n")
	public int field699;

	@ObfuscatedName("INFJTSRJ.o")
	public int field700;

	@ObfuscatedName("INFJTSRJ.s")
	public KMWMLVIH field704;

	@ObfuscatedName("INFJTSRJ.q")
	public int field702;

	@ObfuscatedName("INFJTSRJ.p")
	public int field701;

	@ObfuscatedName("INFJTSRJ.x")
	public int field709;

	@ObfuscatedName("INFJTSRJ.y")
	public int field710;

	@ObfuscatedName("INFJTSRJ.w")
	public int[] field708;

	@ObfuscatedName("INFJTSRJ.r")
	public static client field703;

	public INFJTSRJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field705 = arg2;
		field706 = arg4;
		field707 = arg5;
		field697 = arg7;
		field698 = arg1;
		field699 = arg0;
		field700 = arg8;

		if (arg3 != -1) {
			field704 = KMWMLVIH.field825[arg3];
			field702 = 0;
			field701 = client.field316;
			if (arg6 && field704.field830 != -1) {
				field702 = (int) (Math.random() * field704.field826);
				field701 -= (int) (Math.random() * field704.method320(field702));
			}
		}

		PXRGLLGB var10 = PXRGLLGB.method417(field705);
		field709 = var10.field1145;
		field710 = var10.field1141;
		field708 = var10.field1138;
	}

	@ObfuscatedName("INFJTSRJ.a(I)LPXRGLLGB;")
	public final PXRGLLGB method265() {
		int var1 = -1;
		if (field709 != -1) {
			GQWQHTHS var2 = GQWQHTHS.field557[field709];
			int var3 = var2.field559;
			int var4 = var2.field560;
			int var5 = var2.field561;
			int var6 = client.field191[var5 - var4];
			var1 = field703.field178[var3] >> var4 & var6;
		} else if (field710 != -1) {
			var1 = field703.field178[field710];
		}

		if (var1 >= 0 && var1 < field708.length && field708[var1] != -1) {
			return PXRGLLGB.method417(field708[var1]);
		}

		return null;
	}

	@ObfuscatedName("INFJTSRJ.a(Z)LIYSWJGDE;")
	public final IYSWJGDE method2() {
		int var1 = -1;
		if (field704 != null) {
			int var2 = client.field316 - field701;
			if (var2 > 100 && field704.field830 > 0) {
				var2 = 100;
			}

			while (var2 > field704.method320(field702)) {
				var2 -= field704.method320(field702);
				field702++;
				if (field702 >= field704.field826) {
					field702 -= field704.field830;
					if (field702 < 0 || field702 >= field704.field826) {
						break;
					}
				}
			}

			field704 = null;
			field701 = client.field316 - var2;

			if (field704 != null) {
				var1 = field704.field827[field702];
			}
		}

		PXRGLLGB var3;
		if (field708 == null) {
			var3 = PXRGLLGB.method417(field705);
		} else {
			var3 = method265();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method414(field706, field707, field697, field698, field699, field700, var1);
	}
}
