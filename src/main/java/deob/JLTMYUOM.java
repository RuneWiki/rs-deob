package deob;

@ObfuscatedName("JLTMYUOM")
public final class JLTMYUOM {

	@ObfuscatedName("JLTMYUOM.e")
	public LMGYBGQR field755 = new LMGYBGQR();

	@ObfuscatedName("JLTMYUOM.i")
	public RKSMLTCN field759 = new RKSMLTCN();

	@ObfuscatedName("JLTMYUOM.f")
	public int field756;

	@ObfuscatedName("JLTMYUOM.g")
	public int field757;

	@ObfuscatedName("JLTMYUOM.h")
	public DKRLEWQI field758;

	@ObfuscatedName("JLTMYUOM.c")
	public int field753;

	@ObfuscatedName("JLTMYUOM.d")
	public int field754;

	public JLTMYUOM(int arg0) {
		field756 = arg0;
		field757 = arg0;
		field758 = new DKRLEWQI(1024);
	}

	@ObfuscatedName("JLTMYUOM.a(J)LLMGYBGQR;")
	public LMGYBGQR method297(long arg0) {
		LMGYBGQR var3 = (LMGYBGQR) field758.method168(arg0);
		if (var3 == null) {
			field753++;
		} else {
			field759.method405(var3);
			field754++;
		}

		return var3;
	}

	@ObfuscatedName("JLTMYUOM.a(IJLLMGYBGQR;)V")
	public void method298(long arg0, LMGYBGQR arg1) {
		if (field757 == 0) {
			LMGYBGQR var4 = field759.method406();
			var4.method396();
			var4.method357();

			if (field755 == var4) {
				LMGYBGQR var5 = field759.method406();
				var5.method396();
				var5.method357();
			}
		} else {
			field757--;
		}

		field758.method169(arg0, arg1);
		field759.method405(arg1);
	}

	@ObfuscatedName("JLTMYUOM.a()V")
	public void method299() {
		while (true) {
			LMGYBGQR var1 = field759.method406();
			if (var1 == null) {
				field757 = field756;
				return;
			}

			var1.method396();
			var1.method357();
		}
	}
}
