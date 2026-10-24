package deob;

@ObfuscatedName("XWNQXFLX")
public class XWNQXFLX extends PJUTMHMD {

	@ObfuscatedName("XWNQXFLX.t")
	public int field1426;

	@ObfuscatedName("XWNQXFLX.u")
	public int field1427;

	@ObfuscatedName("XWNQXFLX.v")
	public int field1428;

	@ObfuscatedName("XWNQXFLX.m")
	public int field1419;

	@ObfuscatedName("XWNQXFLX.n")
	public int field1420;

	@ObfuscatedName("XWNQXFLX.o")
	public int field1421;

	@ObfuscatedName("XWNQXFLX.p")
	public int field1422;

	@ObfuscatedName("XWNQXFLX.y")
	public WLHKAARP field1431;

	@ObfuscatedName("XWNQXFLX.l")
	public int field1418;

	@ObfuscatedName("XWNQXFLX.w")
	public int field1429;

	@ObfuscatedName("XWNQXFLX.q")
	public int field1423;

	@ObfuscatedName("XWNQXFLX.r")
	public int field1424;

	@ObfuscatedName("XWNQXFLX.s")
	public int[] field1425;

	@ObfuscatedName("XWNQXFLX.x")
	public static client field1430;

	@ObfuscatedName("XWNQXFLX.b(I)LRFUKTMBK;")
	public final RFUKTMBK method582() {
		int var1 = -1;
		if (field1423 != -1) {
			ZIUDVZAI var2 = ZIUDVZAI.field1480[field1423];
			int var3 = var2.field1482;
			int var4 = var2.field1483;
			int var5 = var2.field1484;
			int var6 = client.field518[var5 - var4];
			var1 = field1430.field450[var3] >> var4 & var6;
		} else if (field1424 != -1) {
			var1 = field1430.field450[field1424];
		}

		if (var1 >= 0 && var1 < field1425.length && field1425[var1] != -1) {
			return RFUKTMBK.method472(field1425[var1]);
		}

		return null;
	}

	public XWNQXFLX(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
		field1426 = arg8;
		field1427 = arg0;
		field1428 = arg6;
		field1419 = arg2;
		field1420 = arg1;
		field1421 = arg3;
		field1422 = arg7;

		if (arg5 != -1) {
			field1431 = WLHKAARP.field1323[arg5];
			field1418 = 0;
			field1429 = client.field307;
			if (arg4 && field1431.field1328 != -1) {
				field1418 = (int) (Math.random() * field1431.field1324);
				field1429 -= (int) (Math.random() * field1431.method549(field1418));
			}
		}

		RFUKTMBK var10 = RFUKTMBK.method472(field1426);
		field1423 = var10.field1057;
		field1424 = var10.field1036;
		field1425 = var10.field1055;
	}

	@ObfuscatedName("XWNQXFLX.a(I)LVHYCWIPJ;")
	public final VHYCWIPJ method217() {
		int var1 = -1;
		if (field1431 != null) {
			int var2 = client.field307 - field1429;
			if (var2 > 100 && field1431.field1328 > 0) {
				var2 = 100;
			}

			while (var2 > field1431.method549(field1418)) {
				var2 -= field1431.method549(field1418);
				field1418++;
				if (field1418 >= field1431.field1324) {
					field1418 -= field1431.field1328;
					if (field1418 < 0 || field1418 >= field1431.field1324) {
						break;
					}
				}
			}

			field1431 = null;
			field1429 = client.field307 - var2;

			if (field1431 != null) {
				var1 = field1431.field1325[field1418];
			}
		}

		RFUKTMBK var3;
		if (field1425 == null) {
			var3 = RFUKTMBK.method472(field1426);
		} else {
			var3 = method582();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method462(field1427, field1428, field1419, field1420, field1421, field1422, var1);
	}
}
