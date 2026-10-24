package deob;

@ObfuscatedName("QBCJVLJJ")
public final class QBCJVLJJ extends FKSXNQOK {

	@ObfuscatedName("QBCJVLJJ.u")
	public boolean field944 = false;

	@ObfuscatedName("QBCJVLJJ.n")
	public UAVNMKVJ field938;

	@ObfuscatedName("QBCJVLJJ.p")
	public int field940;

	@ObfuscatedName("QBCJVLJJ.q")
	public int field941;

	@ObfuscatedName("QBCJVLJJ.r")
	public int field942;

	@ObfuscatedName("QBCJVLJJ.s")
	public int field943;

	@ObfuscatedName("QBCJVLJJ.o")
	public int field939;

	@ObfuscatedName("QBCJVLJJ.w")
	public int field945;

	@ObfuscatedName("QBCJVLJJ.x")
	public int field946;

	@ObfuscatedName("QBCJVLJJ.a(I)LRTQSBWRH;")
	public final RTQSBWRH method199() {
		RTQSBWRH var1 = field938.method502();
		if (var1 == null) {
			return null;
		}

		int var2 = field938.field1337.field797[field945];
		RTQSBWRH var3 = new RTQSBWRH(true, EMBMBPSC.method229(var2), var1, false);
		if (!field944) {
			var3.method461();
			var3.method462(var2);
			var3.field1127 = null;
			var3.field1126 = null;
		}

		if (field938.field1340 != 128 || field938.field1341 != 128) {
			var3.method470(field938.field1341, field938.field1340, field938.field1340);
		}

		if (field938.field1342 != 0) {
			if (field938.field1342 == 90) {
				var3.method465();
			}

			if (field938.field1342 == 180) {
				var3.method465();
				var3.method465();
			}

			if (field938.field1342 == 270) {
				var3.method465();
				var3.method465();
				var3.method465();
			}
		}

		var3.method471(field938.field1343 + 64, field938.field1344 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("QBCJVLJJ.a(II)V")
	public final void method412(int arg0) {
		field946 += arg0;
		while (field946 > field938.field1337.method361(field945)) {
			field946 -= field938.field1337.method361(field945) + 1;
			field945++;
			if (field945 >= field938.field1337.field796 && (field945 < 0 || field945 >= field938.field1337.field796)) {
				field945 = 0;
				field944 = true;
			}
		}
	}

	public QBCJVLJJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field938 = UAVNMKVJ.field1333[arg4];
		field940 = arg6;
		field941 = arg3;
		field942 = arg0;
		field943 = arg2;
		field939 = arg1 + arg5;
		field944 = false;
	}
}
