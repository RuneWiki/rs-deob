package deob;

@ObfuscatedName("SIDDBHEA")
public class SIDDBHEA extends BBIXHJOC {

	@ObfuscatedName("SIDDBHEA.z")
	public int field1322;

	@ObfuscatedName("SIDDBHEA.A")
	public int field1323;

	@ObfuscatedName("SIDDBHEA.B")
	public int field1324;

	@ObfuscatedName("SIDDBHEA.p")
	public int field1313;

	@ObfuscatedName("SIDDBHEA.q")
	public int field1314;

	@ObfuscatedName("SIDDBHEA.r")
	public int field1315;

	@ObfuscatedName("SIDDBHEA.s")
	public int field1316;

	@ObfuscatedName("SIDDBHEA.w")
	public OXBPHQKK field1320;

	@ObfuscatedName("SIDDBHEA.v")
	public int field1319;

	@ObfuscatedName("SIDDBHEA.m")
	public int field1311;

	@ObfuscatedName("SIDDBHEA.t")
	public int field1317;

	@ObfuscatedName("SIDDBHEA.u")
	public int field1318;

	@ObfuscatedName("SIDDBHEA.n")
	public int[] field1312;

	@ObfuscatedName("SIDDBHEA.x")
	public static client field1321;

	@ObfuscatedName("SIDDBHEA.a(I)LJLNSJQDR;")
	public final JLNSJQDR method2() {
		int var1 = -1;
		if (field1320 != null) {
			int var2 = client.field239 - field1311;
			if (var2 > 100 && field1320.field1157 > 0) {
				var2 = 100;
			}

			while (var2 > field1320.method457(field1319)) {
				var2 -= field1320.method457(field1319);
				field1319++;
				if (field1319 >= field1320.field1153) {
					field1319 -= field1320.field1157;
					if (field1319 < 0 || field1319 >= field1320.field1153) {
						break;
					}
				}
			}

			field1320 = null;
			field1311 = client.field239 - var2;

			if (field1320 != null) {
				var1 = field1320.field1154[field1319];
			}
		}

		KZRNPNVL var3;
		if (field1312 == null) {
			var3 = KZRNPNVL.method401(field1322);
		} else {
			var3 = method489();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method406(field1323, field1324, field1313, field1314, field1315, field1316, var1);
	}

	@ObfuscatedName("SIDDBHEA.b(I)LKZRNPNVL;")
	public final KZRNPNVL method489() {
		int var1 = -1;
		if (field1317 != -1) {
			BUYMNSFH var2 = BUYMNSFH.field20[field1317];
			int var3 = var2.field22;
			int var4 = var2.field23;
			int var5 = var2.field24;
			int var6 = client.field123[var5 - var4];
			var1 = field1321.field41[var3] >> var4 & var6;
		} else if (field1318 != -1) {
			var1 = field1321.field41[field1318];
		}

		if (var1 >= 0 && var1 < field1312.length && field1312[var1] != -1) {
			return KZRNPNVL.method401(field1312[var1]);
		}

		return null;
	}

	public SIDDBHEA(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
		field1322 = arg6;
		field1323 = arg3;
		field1324 = arg4;
		field1313 = arg0;
		field1314 = arg7;
		field1315 = arg8;
		field1316 = arg1;

		if (arg2 != -1) {
			field1320 = OXBPHQKK.field1152[arg2];
			field1319 = 0;
			field1311 = client.field239;
			if (arg5 && field1320.field1157 != -1) {
				field1319 = (int) (Math.random() * field1320.field1153);
				field1311 -= (int) (Math.random() * field1320.method457(field1319));
			}
		}

		KZRNPNVL var10 = KZRNPNVL.method401(field1322);
		field1317 = var10.field963;
		field1318 = var10.field951;
		field1312 = var10.field945;
	}
}
