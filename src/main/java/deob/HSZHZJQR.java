package deob;

@ObfuscatedName("HSZHZJQR")
public final class HSZHZJQR {

	@ObfuscatedName("HSZHZJQR.c")
	public int field738;

	@ObfuscatedName("HSZHZJQR.d")
	public IHAIACWA[] field739;

	public HSZHZJQR(int arg0) {
		field738 = arg0;
		field739 = new IHAIACWA[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			IHAIACWA var3 = field739[var2] = new IHAIACWA();
			var3.field846 = var3;
			var3.field847 = var3;
		}
	}

	@ObfuscatedName("HSZHZJQR.a(J)LIHAIACWA;")
	public IHAIACWA method343(long arg0) {
		IHAIACWA var3 = field739[(int) (arg0 & field738 - 1)];
		for (IHAIACWA var4 = var3.field846; var4 != var3; var4 = var4.field846) {
			if (var4.field845 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("HSZHZJQR.a(BJLIHAIACWA;)V")
	public void method344(long arg0, IHAIACWA arg1) {
		if (arg1.field847 != null) {
			arg1.method379();
		}

		IHAIACWA var4 = field739[(int) (arg0 & field738 - 1)];
		arg1.field847 = var4.field847;
		arg1.field846 = var4;
		arg1.field847.field846 = arg1;
		arg1.field846.field847 = arg1;
		arg1.field845 = arg0;
	}
}
