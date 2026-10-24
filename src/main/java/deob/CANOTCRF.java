package deob;

@ObfuscatedName("CANOTCRF")
public final class CANOTCRF extends CYZGZTKE {

	@ObfuscatedName("CANOTCRF.t")
	public boolean field31 = false;

	@ObfuscatedName("CANOTCRF.u")
	public BRGDZOWQ field32;

	@ObfuscatedName("CANOTCRF.n")
	public int field25;

	@ObfuscatedName("CANOTCRF.o")
	public int field26;

	@ObfuscatedName("CANOTCRF.p")
	public int field27;

	@ObfuscatedName("CANOTCRF.q")
	public int field28;

	@ObfuscatedName("CANOTCRF.v")
	public int field33;

	@ObfuscatedName("CANOTCRF.r")
	public int field29;

	@ObfuscatedName("CANOTCRF.s")
	public int field30;

	public CANOTCRF(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field32 = BRGDZOWQ.field8[arg2];
		field25 = arg6;
		field26 = arg3;
		field27 = arg1;
		field28 = arg0;
		field33 = arg4 + arg5;
		field31 = false;
	}

	@ObfuscatedName("CANOTCRF.a(I)LLFTMDGKK;")
	public final LFTMDGKK method1() {
		LFTMDGKK var1 = field32.method11();
		if (var1 == null) {
			return null;
		}

		int var2 = field32.field12.field684[field29];
		LFTMDGKK var3 = new LFTMDGKK(CANZHIOT.method17(var2), true, var1, false);
		if (!field31) {
			var3.method348();
			var3.method349(var2);
			var3.field852 = null;
			var3.field851 = null;
		}

		if (field32.field15 != 128 || field32.field16 != 128) {
			var3.method357(field32.field16, field32.field15, field32.field15);
		}

		if (field32.field17 != 0) {
			if (field32.field17 == 90) {
				var3.method352();
			}

			if (field32.field17 == 180) {
				var3.method352();
				var3.method352();
			}

			if (field32.field17 == 270) {
				var3.method352();
				var3.method352();
				var3.method352();
			}
		}

		var3.method358(field32.field18 + 64, field32.field19 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("CANOTCRF.a(ZI)V")
	public final void method12(int arg0) {
		field30 += arg0;
		while (field30 > field32.field12.method322(field29)) {
			field30 -= field32.field12.method322(field29) + 1;
			field29++;
			if (field29 >= field32.field12.field683 && (field29 < 0 || field29 >= field32.field12.field683)) {
				field29 = 0;
				field31 = true;
			}
		}
	}
}
