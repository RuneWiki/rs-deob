package deob;

@ObfuscatedName("JBYEFPCA")
public class JBYEFPCA extends MQTIFFLX {

	@ObfuscatedName("JBYEFPCA.l")
	public int field699;

	@ObfuscatedName("JBYEFPCA.m")
	public int field700;

	@ObfuscatedName("JBYEFPCA.n")
	public int field701;

	@ObfuscatedName("JBYEFPCA.r")
	public int field705;

	@ObfuscatedName("JBYEFPCA.s")
	public int field706;

	@ObfuscatedName("JBYEFPCA.t")
	public int field707;

	@ObfuscatedName("JBYEFPCA.u")
	public int field708;

	@ObfuscatedName("JBYEFPCA.A")
	public RIUJHZLL field712;

	@ObfuscatedName("JBYEFPCA.o")
	public int field702;

	@ObfuscatedName("JBYEFPCA.p")
	public int field703;

	@ObfuscatedName("JBYEFPCA.v")
	public int field709;

	@ObfuscatedName("JBYEFPCA.w")
	public int field710;

	@ObfuscatedName("JBYEFPCA.x")
	public int[] field711;

	@ObfuscatedName("JBYEFPCA.q")
	public static client field704;

	@ObfuscatedName("JBYEFPCA.a(I)LBQKZHFKO;")
	public final BQKZHFKO method277() {
		int var1 = -1;
		if (field709 != -1) {
			UNSYPSHF var2 = UNSYPSHF.field1291[field709];
			int var3 = var2.field1293;
			int var4 = var2.field1294;
			int var5 = var2.field1295;
			int var6 = client.field158[var5 - var4];
			var1 = field704.field251[var3] >> var4 & var6;
		} else if (field710 != -1) {
			var1 = field704.field251[field710];
		}

		if (var1 >= 0 && var1 < field711.length && field711[var1] != -1) {
			return BQKZHFKO.method24(field711[var1]);
		}

		return null;
	}

	@ObfuscatedName("JBYEFPCA.a(Z)LWEVRTBOZ;")
	public final WEVRTBOZ method225() {
		int var1 = -1;
		if (field712 != null) {
			int var2 = client.field306 - field703;
			if (var2 > 100 && field712.field1117 > 0) {
				var2 = 100;
			}

			while (var2 > field712.method414(field702)) {
				var2 -= field712.method414(field702);
				field702++;
				if (field702 >= field712.field1113) {
					field702 -= field712.field1117;
					if (field702 < 0 || field702 >= field712.field1113) {
						break;
					}
				}
			}

			field712 = null;
			field703 = client.field306 - var2;

			if (field712 != null) {
				var1 = field712.field1114[field702];
			}
		}

		BQKZHFKO var3;
		if (field711 == null) {
			var3 = BQKZHFKO.method24(field699);
		} else {
			var3 = method277();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method20(field700, field701, field705, field706, field707, field708, var1);
	}

	public JBYEFPCA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		field699 = arg3;
		field700 = arg5;
		field701 = arg6;
		field705 = arg7;
		field706 = arg0;
		field707 = arg4;
		field708 = arg2;

		if (arg1 != -1) {
			field712 = RIUJHZLL.field1112[arg1];
			field702 = 0;
			field703 = client.field306;
			if (arg8 && field712.field1117 != -1) {
				field702 = (int) (Math.random() * field712.field1113);
				field703 -= (int) (Math.random() * field712.method414(field702));
			}
		}

		BQKZHFKO var10 = BQKZHFKO.method24(field699);
		field709 = var10.field55;
		field710 = var10.field61;
		field711 = var10.field37;
	}
}
