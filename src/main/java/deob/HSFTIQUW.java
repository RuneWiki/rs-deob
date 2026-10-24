package deob;

@ObfuscatedName("HSFTIQUW")
public final class HSFTIQUW extends MQTIFFLX {

	@ObfuscatedName("HSFTIQUW.w")
	public boolean field651 = false;

	@ObfuscatedName("HSFTIQUW.u")
	public PMDEXOWJ field650;

	@ObfuscatedName("HSFTIQUW.p")
	public int field646;

	@ObfuscatedName("HSFTIQUW.q")
	public int field647;

	@ObfuscatedName("HSFTIQUW.r")
	public int field648;

	@ObfuscatedName("HSFTIQUW.s")
	public int field649;

	@ObfuscatedName("HSFTIQUW.l")
	public int field643;

	@ObfuscatedName("HSFTIQUW.m")
	public int field644;

	@ObfuscatedName("HSFTIQUW.n")
	public int field645;

	@ObfuscatedName("HSFTIQUW.a(Z)LWEVRTBOZ;")
	public final WEVRTBOZ method225() {
		WEVRTBOZ var1 = field650.method404();
		if (var1 == null) {
			return null;
		}

		int var2 = field650.field1090.field1114[field644];
		WEVRTBOZ var3 = new WEVRTBOZ(var1, HJEXDJAH.method218(var2), false, true);
		if (!field651) {
			var3.method532();
			var3.method533(var2);
			var3.field1395 = null;
			var3.field1394 = null;
		}

		if (field650.field1093 != 128 || field650.field1094 != 128) {
			var3.method541(field650.field1093, field650.field1093, field650.field1094);
		}

		if (field650.field1095 != 0) {
			if (field650.field1095 == 90) {
				var3.method536();
			}

			if (field650.field1095 == 180) {
				var3.method536();
				var3.method536();
			}

			if (field650.field1095 == 270) {
				var3.method536();
				var3.method536();
				var3.method536();
			}
		}

		var3.method542(field650.field1096 + 64, field650.field1097 + 850, -30, -50, -30, true);
		return var3;
	}

	public HSFTIQUW(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field650 = PMDEXOWJ.field1086[arg6];
		field646 = arg2;
		field647 = arg0;
		field648 = arg5;
		field649 = arg4;
		field643 = arg1 + arg3;
		field651 = false;
	}

	@ObfuscatedName("HSFTIQUW.a(BI)V")
	public final void method226(int arg0) {
		field645 += arg0;
		while (field645 > field650.field1090.method414(field644)) {
			field645 -= field650.field1090.method414(field644) + 1;
			field644++;
			if (field644 >= field650.field1090.field1113 && (field644 < 0 || field644 >= field650.field1090.field1113)) {
				field644 = 0;
				field651 = true;
			}
		}
	}
}
