package deob;

@ObfuscatedName("HGWWWEIE")
public final class HGWWWEIE extends YDNCHMHU {

	@ObfuscatedName("HGWWWEIE.r")
	public boolean field725 = false;

	@ObfuscatedName("HGWWWEIE.s")
	public IDQQUVDL field726;

	@ObfuscatedName("HGWWWEIE.t")
	public int field727;

	@ObfuscatedName("HGWWWEIE.u")
	public int field728;

	@ObfuscatedName("HGWWWEIE.v")
	public int field729;

	@ObfuscatedName("HGWWWEIE.w")
	public int field730;

	@ObfuscatedName("HGWWWEIE.q")
	public int field724;

	@ObfuscatedName("HGWWWEIE.n")
	public int field722;

	@ObfuscatedName("HGWWWEIE.o")
	public int field723;

	@ObfuscatedName("HGWWWEIE.a(Z)LOIBEFFXI;")
	public final OIBEFFXI method2() {
		OIBEFFXI var1 = field726.method233();
		if (var1 == null) {
			return null;
		}

		int var2 = field726.field742.field152[field722];
		OIBEFFXI var3 = new OIBEFFXI(false, true, var1, UXVWESOT.method455(var2));
		if (!field725) {
			var3.method353();
			var3.method354(var2);
			var3.field985 = null;
			var3.field984 = null;
		}

		if (field726.field745 != 128 || field726.field746 != 128) {
			var3.method362(field726.field746, field726.field745, field726.field745);
		}

		if (field726.field747 != 0) {
			if (field726.field747 == 90) {
				var3.method357();
			}

			if (field726.field747 == 180) {
				var3.method357();
				var3.method357();
			}

			if (field726.field747 == 270) {
				var3.method357();
				var3.method357();
				var3.method357();
			}
		}

		var3.method363(field726.field748 + 64, field726.field749 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("HGWWWEIE.a(II)V")
	public final void method230(int arg0) {
		field723 += arg0;
		while (field723 > field726.field742.method23(field722)) {
			field723 -= field726.field742.method23(field722) + 1;
			field722++;
			if (field722 >= field726.field742.field151 && (field722 < 0 || field722 >= field726.field742.field151)) {
				field722 = 0;
				field725 = true;
			}
		}
	}

	public HGWWWEIE(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field726 = IDQQUVDL.field738[arg3];
		field727 = arg1;
		field728 = arg5;
		field729 = arg4;
		field730 = arg0;
		field724 = arg2 + arg6;
		field725 = false;
	}
}
