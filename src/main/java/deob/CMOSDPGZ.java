package deob;

@ObfuscatedName("CMOSDPGZ")
public final class CMOSDPGZ extends DKQKXOQO {

	@ObfuscatedName("CMOSDPGZ.n")
	public boolean field642 = false;

	@ObfuscatedName("CMOSDPGZ.q")
	public XBHNZKGU field645;

	@ObfuscatedName("CMOSDPGZ.t")
	public int field646;

	@ObfuscatedName("CMOSDPGZ.u")
	public int field647;

	@ObfuscatedName("CMOSDPGZ.v")
	public int field648;

	@ObfuscatedName("CMOSDPGZ.w")
	public int field649;

	@ObfuscatedName("CMOSDPGZ.x")
	public int field650;

	@ObfuscatedName("CMOSDPGZ.o")
	public int field643;

	@ObfuscatedName("CMOSDPGZ.p")
	public int field644;

	@ObfuscatedName("CMOSDPGZ.a(II)V")
	public final void method186(int arg0) {
		field644 += arg0;
		while (field644 > field645.field1439.method567(field643)) {
			field644 -= field645.field1439.method567(field643) + 1;
			field643++;
			if (field643 >= field645.field1439.field1475 && (field643 < 0 || field643 >= field645.field1439.field1475)) {
				field643 = 0;
				field642 = true;
			}
		}
	}

	@ObfuscatedName("CMOSDPGZ.a(I)LFCIDIKVY;")
	public final FCIDIKVY method187() {
		FCIDIKVY var1 = field645.method563();
		if (var1 == null) {
			return null;
		}

		int var2 = field645.field1439.field1476[field643];
		FCIDIKVY var3 = new FCIDIKVY(false, FGGKJQKK.method235(var2), var1, true);
		if (!field642) {
			var3.method206();
			var3.method207(var2);
			var3.field716 = null;
			var3.field715 = null;
		}

		if (field645.field1442 != 128 || field645.field1443 != 128) {
			var3.method215(field645.field1442, field645.field1442, field645.field1443);
		}

		if (field645.field1444 != 0) {
			if (field645.field1444 == 90) {
				var3.method210();
			}

			if (field645.field1444 == 180) {
				var3.method210();
				var3.method210();
			}

			if (field645.field1444 == 270) {
				var3.method210();
				var3.method210();
				var3.method210();
			}
		}

		var3.method216(field645.field1445 + 64, field645.field1446 + 850, -30, -50, -30, true);
		return var3;
	}

	public CMOSDPGZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field645 = XBHNZKGU.field1435[arg3];
		field646 = arg4;
		field647 = arg1;
		field648 = arg6;
		field649 = arg0;
		field650 = arg2 + arg5;
		field642 = false;
	}
}
