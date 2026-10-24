package deob;

@ObfuscatedName("SLPOTSAU")
public class SLPOTSAU extends UPHLHIWQ {

	@ObfuscatedName("SLPOTSAU.r")
	public int field1227;

	@ObfuscatedName("SLPOTSAU.s")
	public int field1228;

	@ObfuscatedName("SLPOTSAU.t")
	public int field1229;

	@ObfuscatedName("SLPOTSAU.m")
	public int field1222;

	@ObfuscatedName("SLPOTSAU.n")
	public int field1223;

	@ObfuscatedName("SLPOTSAU.o")
	public int field1224;

	@ObfuscatedName("SLPOTSAU.p")
	public int field1225;

	@ObfuscatedName("SLPOTSAU.z")
	public DWUJPTWU field1235;

	@ObfuscatedName("SLPOTSAU.x")
	public int field1233;

	@ObfuscatedName("SLPOTSAU.q")
	public int field1226;

	@ObfuscatedName("SLPOTSAU.u")
	public int field1230;

	@ObfuscatedName("SLPOTSAU.v")
	public int field1231;

	@ObfuscatedName("SLPOTSAU.w")
	public int[] field1232;

	@ObfuscatedName("SLPOTSAU.y")
	public static client field1234;

	@ObfuscatedName("SLPOTSAU.b(I)LLWJTLDAE;")
	public final LWJTLDAE method475() {
		int var1 = -1;
		if (field1230 != -1) {
			BCUFZZFO var2 = BCUFZZFO.field27[field1230];
			int var3 = var2.field29;
			int var4 = var2.field30;
			int var5 = var2.field31;
			int var6 = client.field178[var5 - var4];
			var1 = field1234.field165[var3] >> var4 & var6;
		} else if (field1231 != -1) {
			var1 = field1234.field165[field1231];
		}

		if (var1 >= 0 && var1 < field1232.length && field1232[var1] != -1) {
			return LWJTLDAE.method290(field1232[var1]);
		}

		return null;
	}

	@ObfuscatedName("SLPOTSAU.a(I)LPSGMMDJS;")
	public final PSGMMDJS method196() {
		int var1 = -1;
		if (field1235 != null) {
			int var2 = client.field468 - field1226;
			if (var2 > 100 && field1235.field591 > 0) {
				var2 = 100;
			}

			while (var2 > field1235.method215(field1233)) {
				var2 -= field1235.method215(field1233);
				field1233++;
				if (field1233 >= field1235.field587) {
					field1233 -= field1235.field591;
					if (field1233 < 0 || field1233 >= field1235.field587) {
						break;
					}
				}
			}

			field1235 = null;
			field1226 = client.field468 - var2;

			if (field1235 != null) {
				var1 = field1235.field588[field1233];
			}
		}

		LWJTLDAE var3;
		if (field1232 == null) {
			var3 = LWJTLDAE.method290(field1227);
		} else {
			var3 = method475();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method295(field1228, field1229, field1222, field1223, field1224, field1225, var1);
	}

	public SLPOTSAU(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field1227 = arg0;
		field1228 = arg6;
		field1229 = arg1;
		field1222 = arg4;
		field1223 = arg5;
		field1224 = arg3;
		field1225 = arg7;

		if (arg8 != -1) {
			field1235 = DWUJPTWU.field586[arg8];
			field1233 = 0;
			field1226 = client.field468;
			if (arg2 && field1235.field591 != -1) {
				field1233 = (int) (Math.random() * field1235.field587);
				field1226 -= (int) (Math.random() * field1235.method215(field1233));
			}
		}

		LWJTLDAE var10 = LWJTLDAE.method290(field1227);
		field1230 = var10.field907;
		field1231 = var10.field913;
		field1232 = var10.field901;
	}
}
