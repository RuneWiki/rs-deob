package deob;

@ObfuscatedName("XTGOQLGZ")
public final class XTGOQLGZ extends VIVVOUFY {

	@ObfuscatedName("XTGOQLGZ.s")
	public boolean field1361 = false;

	@ObfuscatedName("XTGOQLGZ.t")
	public ZSSCYSIO field1362;

	@ObfuscatedName("XTGOQLGZ.l")
	public int field1354;

	@ObfuscatedName("XTGOQLGZ.m")
	public int field1355;

	@ObfuscatedName("XTGOQLGZ.n")
	public int field1356;

	@ObfuscatedName("XTGOQLGZ.o")
	public int field1357;

	@ObfuscatedName("XTGOQLGZ.p")
	public int field1358;

	@ObfuscatedName("XTGOQLGZ.q")
	public int field1359;

	@ObfuscatedName("XTGOQLGZ.r")
	public int field1360;

	@ObfuscatedName("XTGOQLGZ.a(B)LCCYECDYX;")
	public final CCYECDYX method181() {
		CCYECDYX var1 = field1362.method590();
		if (var1 == null) {
			return null;
		}

		int var2 = field1362.field1480.field788[field1359];
		CCYECDYX var3 = new CCYECDYX(RKTGZGSS.method383(var2), var1, false, true);
		if (!field1361) {
			var3.method18();
			var3.method19(var2);
			var3.field59 = null;
			var3.field58 = null;
		}

		if (field1362.field1483 != 128 || field1362.field1484 != 128) {
			var3.method27(field1362.field1483, field1362.field1484, field1362.field1483);
		}

		if (field1362.field1485 != 0) {
			if (field1362.field1485 == 90) {
				var3.method22();
			}

			if (field1362.field1485 == 180) {
				var3.method22();
				var3.method22();
			}

			if (field1362.field1485 == 270) {
				var3.method22();
				var3.method22();
				var3.method22();
			}
		}

		var3.method28(field1362.field1486 + 64, field1362.field1487 + 850, -30, -50, -30, true);
		return var3;
	}

	public XTGOQLGZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1362 = ZSSCYSIO.field1476[arg1];
		field1354 = arg0;
		field1355 = arg2;
		field1356 = arg5;
		field1357 = arg4;
		field1358 = arg3 + arg6;
		field1361 = false;
	}

	@ObfuscatedName("XTGOQLGZ.a(II)V")
	public final void method496(int arg0) {
		field1360 += arg0;
		while (field1360 > field1362.field1480.method226(field1359)) {
			field1360 -= field1362.field1480.method226(field1359) + 1;
			field1359++;
			if (field1359 >= field1362.field1480.field787 && (field1359 < 0 || field1359 >= field1362.field1480.field787)) {
				field1359 = 0;
				field1361 = true;
			}
		}
	}
}
