package deob;

@ObfuscatedName("TGBMMCBD")
public class TGBMMCBD extends DPCHFTTD {

	@ObfuscatedName("TGBMMCBD.m")
	public int field1261;

	@ObfuscatedName("TGBMMCBD.n")
	public int field1262;

	@ObfuscatedName("TGBMMCBD.o")
	public int field1263;

	@ObfuscatedName("TGBMMCBD.p")
	public int field1264;

	@ObfuscatedName("TGBMMCBD.q")
	public int field1265;

	@ObfuscatedName("TGBMMCBD.r")
	public int field1266;

	@ObfuscatedName("TGBMMCBD.s")
	public int field1267;

	@ObfuscatedName("TGBMMCBD.y")
	public EJHGNUGE field1272;

	@ObfuscatedName("TGBMMCBD.z")
	public int field1273;

	@ObfuscatedName("TGBMMCBD.l")
	public int field1260;

	@ObfuscatedName("TGBMMCBD.v")
	public int field1270;

	@ObfuscatedName("TGBMMCBD.w")
	public int field1271;

	@ObfuscatedName("TGBMMCBD.t")
	public int[] field1268;

	@ObfuscatedName("TGBMMCBD.u")
	public static client field1269;

	public TGBMMCBD(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field1261 = arg0;
		field1262 = arg1;
		field1263 = arg7;
		field1264 = arg2;
		field1265 = arg5;
		field1266 = arg4;
		field1267 = arg3;

		if (arg8 != -1) {
			field1272 = EJHGNUGE.field604[arg8];
			field1273 = 0;
			field1260 = client.field420;
			if (arg6 && field1272.field609 != -1) {
				field1273 = (int) (Math.random() * field1272.field605);
				field1260 -= (int) (Math.random() * field1272.method241(field1273));
			}
		}

		RUJAIVBH var10 = RUJAIVBH.method512(field1261);
		field1270 = var10.field1148;
		field1271 = var10.field1156;
		field1268 = var10.field1168;
	}

	@ObfuscatedName("TGBMMCBD.a(I)LRUJAIVBH;")
	public final RUJAIVBH method552() {
		int var1 = -1;
		if (field1270 != -1) {
			GAQBLBTP var2 = GAQBLBTP.field700[field1270];
			int var3 = var2.field702;
			int var4 = var2.field703;
			int var5 = var2.field704;
			int var6 = client.field480[var5 - var4];
			var1 = field1269.field257[var3] >> var4 & var6;
		} else if (field1271 != -1) {
			var1 = field1269.field257[field1271];
		}

		if (var1 >= 0 && var1 < field1268.length && field1268[var1] != -1) {
			return RUJAIVBH.method512(field1268[var1]);
		}

		return null;
	}

	@ObfuscatedName("TGBMMCBD.a(B)LGEUHTGZJ;")
	public final GEUHTGZJ method221() {
		int var1 = -1;
		if (field1272 != null) {
			int var2 = client.field420 - field1260;
			if (var2 > 100 && field1272.field609 > 0) {
				var2 = 100;
			}

			while (var2 > field1272.method241(field1273)) {
				var2 -= field1272.method241(field1273);
				field1273++;
				if (field1273 >= field1272.field605) {
					field1273 -= field1272.field609;
					if (field1273 < 0 || field1273 >= field1272.field605) {
						break;
					}
				}
			}

			field1272 = null;
			field1260 = client.field420 - var2;

			if (field1272 != null) {
				var1 = field1272.field606[field1273];
			}
		}

		RUJAIVBH var3;
		if (field1268 == null) {
			var3 = RUJAIVBH.method512(field1261);
		} else {
			var3 = method552();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method505(field1262, field1263, field1264, field1265, field1266, field1267, var1);
	}
}
