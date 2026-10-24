package deob;

@ObfuscatedName("SBGQSXPV")
public class SBGQSXPV extends QLYZESGB {

	@ObfuscatedName("SBGQSXPV.w")
	public int field1269;

	@ObfuscatedName("SBGQSXPV.x")
	public int field1270;

	@ObfuscatedName("SBGQSXPV.y")
	public int field1271;

	@ObfuscatedName("SBGQSXPV.o")
	public int field1262;

	@ObfuscatedName("SBGQSXPV.p")
	public int field1263;

	@ObfuscatedName("SBGQSXPV.q")
	public int field1264;

	@ObfuscatedName("SBGQSXPV.r")
	public int field1265;

	@ObfuscatedName("SBGQSXPV.s")
	public JZQVOFSF field1266;

	@ObfuscatedName("SBGQSXPV.E")
	public int field1274;

	@ObfuscatedName("SBGQSXPV.n")
	public int field1261;

	@ObfuscatedName("SBGQSXPV.t")
	public int field1267;

	@ObfuscatedName("SBGQSXPV.u")
	public int field1268;

	@ObfuscatedName("SBGQSXPV.A")
	public int[] field1272;

	@ObfuscatedName("SBGQSXPV.C")
	public static client field1273;

	@ObfuscatedName("SBGQSXPV.a(I)LRUROEYEG;")
	public final RUROEYEG method504() {
		int var1 = -1;
		if (field1267 != -1) {
			DUEJVLYB var2 = DUEJVLYB.field550[field1267];
			int var3 = var2.field552;
			int var4 = var2.field553;
			int var5 = var2.field554;
			int var6 = client.field238[var5 - var4];
			var1 = field1273.field148[var3] >> var4 & var6;
		} else if (field1268 != -1) {
			var1 = field1273.field148[field1268];
		}

		if (var1 >= 0 && var1 < field1272.length && field1272[var1] != -1) {
			return RUROEYEG.method494(field1272[var1]);
		}

		return null;
	}

	@ObfuscatedName("SBGQSXPV.a(B)LRMLAXPMV;")
	public final RMLAXPMV method344() {
		int var1 = -1;
		if (field1266 != null) {
			int var2 = client.field322 - field1261;
			if (var2 > 100 && field1266.field762 > 0) {
				var2 = 100;
			}

			while (var2 > field1266.method342(field1274)) {
				var2 -= field1266.method342(field1274);
				field1274++;
				if (field1274 >= field1266.field758) {
					field1274 -= field1266.field762;
					if (field1274 < 0 || field1274 >= field1266.field758) {
						break;
					}
				}
			}

			field1266 = null;
			field1261 = client.field322 - var2;

			if (field1266 != null) {
				var1 = field1266.field759[field1274];
			}
		}

		RUROEYEG var3;
		if (field1272 == null) {
			var3 = RUROEYEG.method494(field1269);
		} else {
			var3 = method504();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method492(field1270, field1271, field1262, field1263, field1264, field1265, var1);
	}

	public SBGQSXPV(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
		field1269 = arg2;
		field1270 = arg3;
		field1271 = arg1;
		field1262 = arg8;
		field1263 = arg7;
		field1264 = arg0;
		field1265 = arg6;

		if (arg4 != -1) {
			field1266 = JZQVOFSF.field757[arg4];
			field1274 = 0;
			field1261 = client.field322 - 1;
			if (arg5 && field1266.field762 != -1) {
				field1274 = (int) (Math.random() * field1266.field758);
				field1261 -= (int) (Math.random() * field1266.method342(field1274));
			}
		}

		RUROEYEG var10 = RUROEYEG.method494(field1269);
		field1267 = var10.field1236;
		field1268 = var10.field1231;
		field1272 = var10.field1233;
	}
}
