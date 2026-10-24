package deob;

@ObfuscatedName("QEZQDRNH")
public final class QEZQDRNH extends DVAULXJA {

	@ObfuscatedName("QEZQDRNH.n")
	public boolean field1014 = false;

	@ObfuscatedName("QEZQDRNH.p")
	public SDNQJNMP field1015;

	@ObfuscatedName("QEZQDRNH.t")
	public int field1018;

	@ObfuscatedName("QEZQDRNH.u")
	public int field1019;

	@ObfuscatedName("QEZQDRNH.v")
	public int field1020;

	@ObfuscatedName("QEZQDRNH.w")
	public int field1021;

	@ObfuscatedName("QEZQDRNH.x")
	public int field1022;

	@ObfuscatedName("QEZQDRNH.r")
	public int field1016;

	@ObfuscatedName("QEZQDRNH.s")
	public int field1017;

	public QEZQDRNH(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1015 = SDNQJNMP.field1127[arg1];
		field1018 = arg0;
		field1019 = arg2;
		field1020 = arg4;
		field1021 = arg3;
		field1022 = arg5 + arg6;
		field1014 = false;
	}

	@ObfuscatedName("QEZQDRNH.a(I)LIEHKDFMR;")
	public final IEHKDFMR method24() {
		IEHKDFMR var1 = field1015.method396();
		if (var1 == null) {
			return null;
		}

		int var2 = field1015.field1131.field1275[field1016];
		IEHKDFMR var3 = new IEHKDFMR(false, NXEWQQJO.method337(var2), var1, true);
		if (!field1014) {
			var3.method274();
			var3.method275(var2);
			var3.field694 = null;
			var3.field693 = null;
		}

		if (field1015.field1134 != 128 || field1015.field1135 != 128) {
			var3.method283(field1015.field1134, field1015.field1135, field1015.field1134);
		}

		if (field1015.field1136 != 0) {
			if (field1015.field1136 == 90) {
				var3.method278();
			}

			if (field1015.field1136 == 180) {
				var3.method278();
				var3.method278();
			}

			if (field1015.field1136 == 270) {
				var3.method278();
				var3.method278();
				var3.method278();
			}
		}

		var3.method284(field1015.field1137 + 64, field1015.field1138 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("QEZQDRNH.a(IB)V")
	public final void method367(int arg0) {
		field1017 += arg0;
		while (field1017 > field1015.field1131.method459(field1016)) {
			field1017 -= field1015.field1131.method459(field1016) + 1;
			field1016++;
			if (field1016 >= field1015.field1131.field1274 && (field1016 < 0 || field1016 >= field1015.field1131.field1274)) {
				field1016 = 0;
				field1014 = true;
			}
		}
	}
}
