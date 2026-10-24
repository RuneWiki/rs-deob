package deob;

@ObfuscatedName("GJMFUMBP")
public final class GJMFUMBP extends GHXFOOXU {

	@ObfuscatedName("GJMFUMBP.m")
	public boolean field788 = false;

	@ObfuscatedName("GJMFUMBP.w")
	public OKJTNJLE field796;

	@ObfuscatedName("GJMFUMBP.r")
	public int field792;

	@ObfuscatedName("GJMFUMBP.s")
	public int field793;

	@ObfuscatedName("GJMFUMBP.t")
	public int field794;

	@ObfuscatedName("GJMFUMBP.u")
	public int field795;

	@ObfuscatedName("GJMFUMBP.n")
	public int field789;

	@ObfuscatedName("GJMFUMBP.o")
	public int field790;

	@ObfuscatedName("GJMFUMBP.p")
	public int field791;

	@ObfuscatedName("GJMFUMBP.a(B)LFLXAIVEA;")
	public final FLXAIVEA method190() {
		FLXAIVEA var1 = field796.method305();
		if (var1 == null) {
			return null;
		}

		int var2 = field796.field1050.field77[field790];
		FLXAIVEA var3 = new FLXAIVEA(var1, NFWEZFJY.method302(var2), true, false);
		if (!field788) {
			var3.method225();
			var3.method226(var2);
			var3.field716 = null;
			var3.field715 = null;
		}

		if (field796.field1053 != 128 || field796.field1054 != 128) {
			var3.method234(field796.field1053, field796.field1053, field796.field1054);
		}

		if (field796.field1055 != 0) {
			if (field796.field1055 == 90) {
				var3.method229();
			}

			if (field796.field1055 == 180) {
				var3.method229();
				var3.method229();
			}

			if (field796.field1055 == 270) {
				var3.method229();
				var3.method229();
				var3.method229();
			}
		}

		var3.method235(field796.field1056 + 64, field796.field1057 + 850, -30, -50, -30, true);
		return var3;
	}

	public GJMFUMBP(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field796 = OKJTNJLE.field1046[arg1];
		field792 = arg3;
		field793 = arg2;
		field794 = arg6;
		field795 = arg5;
		field789 = arg0 + arg4;
		field788 = false;
	}

	@ObfuscatedName("GJMFUMBP.a(II)V")
	public final void method256(int arg0) {
		field791 += arg0;
		while (field791 > field796.field1050.method12(field790)) {
			field791 -= field796.field1050.method12(field790);
			field790++;
			if (field790 >= field796.field1050.field76 && (field790 < 0 || field790 >= field796.field1050.field76)) {
				field790 = 0;
				field788 = true;
			}
		}
	}
}
