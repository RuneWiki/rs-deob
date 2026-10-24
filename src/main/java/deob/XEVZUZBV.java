package deob;

@ObfuscatedName("XEVZUZBV")
public class XEVZUZBV extends DKQKXOQO {

	@ObfuscatedName("XEVZUZBV.x")
	public int field1499;

	@ObfuscatedName("XEVZUZBV.y")
	public int field1500;

	@ObfuscatedName("XEVZUZBV.z")
	public int field1501;

	@ObfuscatedName("XEVZUZBV.p")
	public int field1493;

	@ObfuscatedName("XEVZUZBV.q")
	public int field1494;

	@ObfuscatedName("XEVZUZBV.r")
	public int field1495;

	@ObfuscatedName("XEVZUZBV.s")
	public int field1496;

	@ObfuscatedName("XEVZUZBV.C")
	public XETSOHUA field1503;

	@ObfuscatedName("XEVZUZBV.w")
	public int field1498;

	@ObfuscatedName("XEVZUZBV.t")
	public int field1497;

	@ObfuscatedName("XEVZUZBV.m")
	public int field1490;

	@ObfuscatedName("XEVZUZBV.n")
	public int field1491;

	@ObfuscatedName("XEVZUZBV.o")
	public int[] field1492;

	@ObfuscatedName("XEVZUZBV.B")
	public static client field1502;

	@ObfuscatedName("XEVZUZBV.a(I)LFCIDIKVY;")
	public final FCIDIKVY method187() {
		int var1 = -1;
		if (field1503 != null) {
			int var2 = client.field552 - field1497;
			if (var2 > 100 && field1503.field1479 > 0) {
				var2 = 100;
			}

			while (var2 > field1503.method567(field1498)) {
				var2 -= field1503.method567(field1498);
				field1498++;
				if (field1498 >= field1503.field1475) {
					field1498 -= field1503.field1479;
					if (field1498 < 0 || field1498 >= field1503.field1475) {
						break;
					}
				}
			}

			field1503 = null;
			field1497 = client.field552 - var2;

			if (field1503 != null) {
				var1 = field1503.field1476[field1498];
			}
		}

		FUIMNWOZ var3;
		if (field1492 == null) {
			var3 = FUIMNWOZ.method246(field1499);
		} else {
			var3 = method569();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method244(field1500, field1501, field1493, field1494, field1495, field1496, var1);
	}

	@ObfuscatedName("XEVZUZBV.b(I)LFUIMNWOZ;")
	public final FUIMNWOZ method569() {
		int var1 = -1;
		if (field1490 != -1) {
			UDOLPBTU var2 = UDOLPBTU.field1382[field1490];
			int var3 = var2.field1384;
			int var4 = var2.field1385;
			int var5 = var2.field1386;
			int var6 = client.field264[var5 - var4];
			var1 = field1502.field626[var3] >> var4 & var6;
		} else if (field1491 != -1) {
			var1 = field1502.field626[field1491];
		}

		if (var1 >= 0 && var1 < field1492.length && field1492[var1] != -1) {
			return FUIMNWOZ.method246(field1492[var1]);
		}

		return null;
	}

	public XEVZUZBV(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field1499 = arg2;
		field1500 = arg8;
		field1501 = arg6;
		field1493 = arg5;
		field1494 = arg0;
		field1495 = arg7;
		field1496 = arg4;

		if (arg3 != -1) {
			field1503 = XETSOHUA.field1474[arg3];
			field1498 = 0;
			field1497 = client.field552;
			if (arg1 && field1503.field1479 != -1) {
				field1498 = (int) (Math.random() * field1503.field1475);
				field1497 -= (int) (Math.random() * field1503.method567(field1498));
			}
		}

		FUIMNWOZ var10 = FUIMNWOZ.method246(field1499);
		field1490 = var10.field811;
		field1491 = var10.field798;
		field1492 = var10.field771;
	}
}
