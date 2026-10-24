package deob;

@ObfuscatedName("QRKWRHKJ")
public final class QRKWRHKJ extends LDWABQSV {

	@ObfuscatedName("QRKWRHKJ.w")
	public boolean field1083 = false;

	@ObfuscatedName("QRKWRHKJ.y")
	public SNGXEJOJ field1084;

	@ObfuscatedName("QRKWRHKJ.p")
	public int field1077;

	@ObfuscatedName("QRKWRHKJ.q")
	public int field1078;

	@ObfuscatedName("QRKWRHKJ.r")
	public int field1079;

	@ObfuscatedName("QRKWRHKJ.s")
	public int field1080;

	@ObfuscatedName("QRKWRHKJ.n")
	public int field1076;

	@ObfuscatedName("QRKWRHKJ.t")
	public int field1081;

	@ObfuscatedName("QRKWRHKJ.u")
	public int field1082;

	@ObfuscatedName("QRKWRHKJ.a(I)LNJPATAFL;")
	public final NJPATAFL method206() {
		NJPATAFL var1 = field1084.method478();
		if (var1 == null) {
			return null;
		}

		int var2 = field1084.field1221.field1244[field1081];
		NJPATAFL var3 = new NJPATAFL(TDFMBTLA.method491(var2), false, true, var1);
		if (!field1083) {
			var3.method341();
			var3.method342(var2);
			var3.field874 = null;
			var3.field873 = null;
		}

		if (field1084.field1224 != 128 || field1084.field1225 != 128) {
			var3.method350(field1084.field1224, field1084.field1224, field1084.field1225);
		}

		if (field1084.field1226 != 0) {
			if (field1084.field1226 == 90) {
				var3.method345();
			}

			if (field1084.field1226 == 180) {
				var3.method345();
				var3.method345();
			}

			if (field1084.field1226 == 270) {
				var3.method345();
				var3.method345();
				var3.method345();
			}
		}

		var3.method351(field1084.field1227 + 64, field1084.field1228 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("QRKWRHKJ.a(IZ)V")
	public final void method432(int arg0) {
		field1082 += arg0;
		while (field1082 > field1084.field1221.method493(field1081)) {
			field1082 -= field1084.field1221.method493(field1081) + 1;
			field1081++;
			if (field1081 >= field1084.field1221.field1243 && (field1081 < 0 || field1081 >= field1084.field1221.field1243)) {
				field1081 = 0;
				field1083 = true;
			}
		}
	}

	public QRKWRHKJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1084 = SNGXEJOJ.field1217[arg2];
		field1077 = arg5;
		field1078 = arg4;
		field1079 = arg6;
		field1080 = arg0;
		field1076 = arg1 + arg3;
		field1083 = false;
	}
}
