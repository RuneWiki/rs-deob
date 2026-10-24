package deob;

@ObfuscatedName("HGKRJZKS")
public final class HGKRJZKS {

	@ObfuscatedName("HGKRJZKS.e")
	public KTAHMSMP field746 = new KTAHMSMP();

	@ObfuscatedName("HGKRJZKS.i")
	public LAPJVQGB field750 = new LAPJVQGB();

	@ObfuscatedName("HGKRJZKS.f")
	public int field747;

	@ObfuscatedName("HGKRJZKS.g")
	public int field748;

	@ObfuscatedName("HGKRJZKS.h")
	public FXRMRSFD field749;

	@ObfuscatedName("HGKRJZKS.c")
	public int field744;

	@ObfuscatedName("HGKRJZKS.d")
	public int field745;

	public HGKRJZKS(int arg0) {
		field747 = arg0;
		field748 = arg0;
		field749 = new FXRMRSFD(1024);
	}

	@ObfuscatedName("HGKRJZKS.a(J)LKTAHMSMP;")
	public KTAHMSMP method285(long arg0) {
		KTAHMSMP var3 = (KTAHMSMP) field749.method219(arg0);
		if (var3 == null) {
			field744++;
		} else {
			field750.method346(var3);
			field745++;
		}

		return var3;
	}

	@ObfuscatedName("HGKRJZKS.a(IJLKTAHMSMP;)V")
	public void method286(long arg0, KTAHMSMP arg1) {
		if (field748 == 0) {
			KTAHMSMP var4 = field750.method347();
			var4.method555();
			var4.method342();

			if (field746 == var4) {
				KTAHMSMP var5 = field750.method347();
				var5.method555();
				var5.method342();
			}
		} else {
			field748--;
		}

		field749.method220(arg0, arg1);
		field750.method346(arg1);
	}

	@ObfuscatedName("HGKRJZKS.a()V")
	public void method287() {
		while (true) {
			KTAHMSMP var1 = field750.method347();
			if (var1 == null) {
				field748 = field747;
				return;
			}

			var1.method555();
			var1.method342();
		}
	}
}
