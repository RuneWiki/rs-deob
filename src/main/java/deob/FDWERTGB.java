package deob;

@ObfuscatedName("FDWERTGB")
public class FDWERTGB extends ACEAAIDL {

	@ObfuscatedName("FDWERTGB.n")
	public int field574;

	@ObfuscatedName("FDWERTGB.o")
	public int field575;

	@ObfuscatedName("FDWERTGB.p")
	public int field576;

	@ObfuscatedName("FDWERTGB.w")
	public int field583;

	@ObfuscatedName("FDWERTGB.x")
	public int field584;

	@ObfuscatedName("FDWERTGB.y")
	public int field585;

	@ObfuscatedName("FDWERTGB.z")
	public int field586;

	@ObfuscatedName("FDWERTGB.v")
	public XRDQTWLL field582;

	@ObfuscatedName("FDWERTGB.t")
	public int field580;

	@ObfuscatedName("FDWERTGB.s")
	public int field579;

	@ObfuscatedName("FDWERTGB.q")
	public int field577;

	@ObfuscatedName("FDWERTGB.r")
	public int field578;

	@ObfuscatedName("FDWERTGB.u")
	public int[] field581;

	@ObfuscatedName("FDWERTGB.m")
	public static client field573;

	@ObfuscatedName("FDWERTGB.a(Z)LGCSAWSJV;")
	public final GCSAWSJV method8() {
		int var1 = -1;
		if (field582 != null) {
			int var2 = client.field404 - field579;
			if (var2 > 100 && field582.field1423 > 0) {
				var2 = 100;
			}

			while (var2 > field582.method583(field580)) {
				var2 -= field582.method583(field580);
				field580++;
				if (field580 >= field582.field1419) {
					field580 -= field582.field1423;
					if (field580 < 0 || field580 >= field582.field1419) {
						break;
					}
				}
			}

			field582 = null;
			field579 = client.field404 - var2;

			if (field582 != null) {
				var1 = field582.field1420[field580];
			}
		}

		YJMLCFGC var3;
		if (field581 == null) {
			var3 = YJMLCFGC.method596(field574);
		} else {
			var3 = method255();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method587(field575, field576, field583, field584, field585, field586, var1);
	}

	public FDWERTGB(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
		field574 = arg6;
		field575 = arg5;
		field576 = arg1;
		field583 = arg0;
		field584 = arg3;
		field585 = arg2;
		field586 = arg7;

		if (arg8 != -1) {
			field582 = XRDQTWLL.field1418[arg8];
			field580 = 0;
			field579 = client.field404;
			if (arg4 && field582.field1423 != -1) {
				field580 = (int) (Math.random() * field582.field1419);
				field579 -= (int) (Math.random() * field582.method583(field580));
			}
		}

		YJMLCFGC var10 = YJMLCFGC.method596(field574);
		field577 = var10.field1449;
		field578 = var10.field1470;
		field581 = var10.field1478;
	}

	@ObfuscatedName("FDWERTGB.a(I)LYJMLCFGC;")
	public final YJMLCFGC method255() {
		int var1 = -1;
		if (field577 != -1) {
			RLLHHJLC var2 = RLLHHJLC.field1048[field577];
			int var3 = var2.field1050;
			int var4 = var2.field1051;
			int var5 = var2.field1052;
			int var6 = client.field346[var5 - var4];
			var1 = field573.field226[var3] >> var4 & var6;
		} else if (field578 != -1) {
			var1 = field573.field226[field578];
		}

		if (var1 >= 0 && var1 < field581.length && field581[var1] != -1) {
			return YJMLCFGC.method596(field581[var1]);
		}

		return null;
	}
}
