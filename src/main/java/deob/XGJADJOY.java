package deob;

@ObfuscatedName("XGJADJOY")
public final class XGJADJOY extends FRPXDCME {

	@ObfuscatedName("XGJADJOY.v")
	public boolean field1474 = false;

	@ObfuscatedName("XGJADJOY.q")
	public UYLUCQNM field1470;

	@ObfuscatedName("XGJADJOY.m")
	public int field1466;

	@ObfuscatedName("XGJADJOY.n")
	public int field1467;

	@ObfuscatedName("XGJADJOY.o")
	public int field1468;

	@ObfuscatedName("XGJADJOY.p")
	public int field1469;

	@ObfuscatedName("XGJADJOY.r")
	public int field1471;

	@ObfuscatedName("XGJADJOY.s")
	public int field1472;

	@ObfuscatedName("XGJADJOY.t")
	public int field1473;

	@ObfuscatedName("XGJADJOY.a(I)LGFYXEFQY;")
	public final GFYXEFQY method294() {
		GFYXEFQY var1 = field1470.method564();
		if (var1 == null) {
			return null;
		}

		int var2 = field1470.field1368.field1017[field1472];
		GFYXEFQY var3 = new GFYXEFQY(ERVJQNCY.method282(var2), var1, true, false);
		if (!field1474) {
			var3.method348();
			var3.method349(var2);
			var3.field785 = null;
			var3.field784 = null;
		}

		if (field1470.field1371 != 128 || field1470.field1372 != 128) {
			var3.method357(field1470.field1371, field1470.field1371, field1470.field1372);
		}

		if (field1470.field1373 != 0) {
			if (field1470.field1373 == 90) {
				var3.method352();
			}

			if (field1470.field1373 == 180) {
				var3.method352();
				var3.method352();
			}

			if (field1470.field1373 == 270) {
				var3.method352();
				var3.method352();
				var3.method352();
			}
		}

		var3.method358(field1470.field1374 + 64, field1470.field1375 + 850, -30, -50, -30, true);
		return var3;
	}

	public XGJADJOY(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1470 = UYLUCQNM.field1364[arg1];
		field1466 = arg3;
		field1467 = arg4;
		field1468 = arg6;
		field1469 = arg5;
		field1471 = arg0 + arg2;
		field1474 = false;
	}

	@ObfuscatedName("XGJADJOY.a(II)V")
	public final void method590(int arg0) {
		field1473 += arg0;
		while (field1473 > field1470.field1368.method445(field1472)) {
			field1473 -= field1470.field1368.method445(field1472) + 1;
			field1472++;
			if (field1472 >= field1470.field1368.field1016 && (field1472 < 0 || field1472 >= field1470.field1368.field1016)) {
				field1472 = 0;
				field1474 = true;
			}
		}
	}
}
