package deob;

@ObfuscatedName("YGFSYDKK")
public final class YGFSYDKK extends ACEAAIDL {

	@ObfuscatedName("YGFSYDKK.s")
	public boolean field1439 = false;

	@ObfuscatedName("YGFSYDKK.x")
	public JEPDVFCL field1442;

	@ObfuscatedName("YGFSYDKK.n")
	public int field1435;

	@ObfuscatedName("YGFSYDKK.o")
	public int field1436;

	@ObfuscatedName("YGFSYDKK.p")
	public int field1437;

	@ObfuscatedName("YGFSYDKK.q")
	public int field1438;

	@ObfuscatedName("YGFSYDKK.m")
	public int field1434;

	@ObfuscatedName("YGFSYDKK.t")
	public int field1440;

	@ObfuscatedName("YGFSYDKK.u")
	public int field1441;

	@ObfuscatedName("YGFSYDKK.a(II)V")
	public final void method585(int arg0) {
		field1441 += arg0;
		while (field1441 > field1442.field797.method583(field1440)) {
			field1441 -= field1442.field797.method583(field1440) + 1;
			field1440++;
			if (field1440 >= field1442.field797.field1419 && (field1440 < 0 || field1440 >= field1442.field797.field1419)) {
				field1440 = 0;
				field1439 = true;
			}
		}
	}

	public YGFSYDKK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1442 = JEPDVFCL.field793[arg1];
		field1435 = arg3;
		field1436 = arg6;
		field1437 = arg5;
		field1438 = arg0;
		field1434 = arg2 + arg4;
		field1439 = false;
	}

	@ObfuscatedName("YGFSYDKK.a(Z)LGCSAWSJV;")
	public final GCSAWSJV method8() {
		GCSAWSJV var1 = field1442.method332();
		if (var1 == null) {
			return null;
		}

		int var2 = field1442.field797.field1420[field1440];
		GCSAWSJV var3 = new GCSAWSJV(var1, true, RLONYBCF.method436(var2), false);
		if (!field1439) {
			var3.method267();
			var3.method268(var2);
			var3.field624 = null;
			var3.field623 = null;
		}

		if (field1442.field800 != 128 || field1442.field801 != 128) {
			var3.method276(field1442.field800, field1442.field800, field1442.field801);
		}

		if (field1442.field802 != 0) {
			if (field1442.field802 == 90) {
				var3.method271();
			}

			if (field1442.field802 == 180) {
				var3.method271();
				var3.method271();
			}

			if (field1442.field802 == 270) {
				var3.method271();
				var3.method271();
				var3.method271();
			}
		}

		var3.method277(field1442.field803 + 64, field1442.field804 + 850, -30, -50, -30, true);
		return var3;
	}
}
