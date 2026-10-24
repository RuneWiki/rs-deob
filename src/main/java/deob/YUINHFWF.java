package deob;

@ObfuscatedName("YUINHFWF")
public class YUINHFWF extends TFGCPINZ {

	@ObfuscatedName("YUINHFWF.m")
	public int field1468;

	@ObfuscatedName("YUINHFWF.n")
	public int field1469;

	@ObfuscatedName("YUINHFWF.o")
	public int field1470;

	@ObfuscatedName("YUINHFWF.v")
	public int field1475;

	@ObfuscatedName("YUINHFWF.w")
	public int field1476;

	@ObfuscatedName("YUINHFWF.x")
	public int field1477;

	@ObfuscatedName("YUINHFWF.y")
	public int field1478;

	@ObfuscatedName("YUINHFWF.u")
	public XTKQUJNF field1474;

	@ObfuscatedName("YUINHFWF.A")
	public int field1480;

	@ObfuscatedName("YUINHFWF.B")
	public int field1481;

	@ObfuscatedName("YUINHFWF.q")
	public int field1471;

	@ObfuscatedName("YUINHFWF.r")
	public int field1472;

	@ObfuscatedName("YUINHFWF.z")
	public int[] field1479;

	@ObfuscatedName("YUINHFWF.s")
	public static client field1473;

	@ObfuscatedName("YUINHFWF.b(B)LMCFQOEAW;")
	public final MCFQOEAW method576() {
		int var1 = -1;
		if (field1471 != -1) {
			EHPXVLSO var2 = EHPXVLSO.field623[field1471];
			int var3 = var2.field625;
			int var4 = var2.field626;
			int var5 = var2.field627;
			int var6 = client.field291[var5 - var4];
			var1 = field1473.field142[var3] >> var4 & var6;
		} else if (field1472 != -1) {
			var1 = field1473.field142[field1472];
		}

		if (var1 >= 0 && var1 < field1479.length && field1479[var1] != -1) {
			return MCFQOEAW.method341(field1479[var1]);
		}

		return null;
	}

	public YUINHFWF(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
		field1468 = arg7;
		field1469 = arg3;
		field1470 = arg8;
		field1475 = arg6;
		field1476 = arg5;
		field1477 = arg1;
		field1478 = arg0;

		if (arg2 != -1) {
			field1474 = XTKQUJNF.field1432[arg2];
			field1480 = 0;
			field1481 = client.field292 - 1;
			if (arg4 && field1474.field1437 != -1) {
				field1480 = (int) (Math.random() * field1474.field1433);
				field1481 -= (int) (Math.random() * field1474.method532(field1480));
			}
		}

		MCFQOEAW var10 = MCFQOEAW.method341(field1468);
		field1471 = var10.field940;
		field1472 = var10.field941;
		field1479 = var10.field922;
	}

	@ObfuscatedName("YUINHFWF.a(B)LJJMVUSJJ;")
	public final JJMVUSJJ method214() {
		int var1 = -1;
		if (field1474 != null) {
			int var2 = client.field292 - field1481;
			if (var2 > 100 && field1474.field1437 > 0) {
				var2 = 100;
			}

			while (var2 > field1474.method532(field1480)) {
				var2 -= field1474.method532(field1480);
				field1480++;
				if (field1480 >= field1474.field1433) {
					field1480 -= field1474.field1437;
					if (field1480 < 0 || field1480 >= field1474.field1433) {
						break;
					}
				}
			}

			field1474 = null;
			field1481 = client.field292 - var2;

			if (field1474 != null) {
				var1 = field1474.field1434[field1480];
			}
		}

		MCFQOEAW var3;
		if (field1479 == null) {
			var3 = MCFQOEAW.method341(field1468);
		} else {
			var3 = method576();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method338(field1469, field1470, field1475, field1476, field1477, field1478, var1);
	}
}
