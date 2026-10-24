package deob;

@ObfuscatedName("JCEXAOBP")
public final class JCEXAOBP {

	@ObfuscatedName("JCEXAOBP.b")
	public ORGNKIAP field750 = new ORGNKIAP();

	@ObfuscatedName("JCEXAOBP.c")
	public ORGNKIAP field751;

	public JCEXAOBP() {
		field750.field948 = field750;
		field750.field949 = field750;
	}

	@ObfuscatedName("JCEXAOBP.a(LORGNKIAP;)V")
	public void method249(ORGNKIAP arg0) {
		if (arg0.field949 != null) {
			arg0.method400();
		}

		arg0.field949 = field750.field949;
		arg0.field948 = field750;
		arg0.field949.field948 = arg0;
		arg0.field948.field949 = arg0;
	}

	@ObfuscatedName("JCEXAOBP.a()LORGNKIAP;")
	public ORGNKIAP method250() {
		ORGNKIAP var1 = field750.field948;
		if (field750 == var1) {
			return null;
		} else {
			var1.method400();
			return var1;
		}
	}

	@ObfuscatedName("JCEXAOBP.b()LORGNKIAP;")
	public ORGNKIAP method251() {
		ORGNKIAP var1 = field750.field948;
		if (field750 == var1) {
			field751 = null;
			return null;
		} else {
			field751 = var1.field948;
			return var1;
		}
	}

	@ObfuscatedName("JCEXAOBP.a(I)LORGNKIAP;")
	public ORGNKIAP method252() {
		ORGNKIAP var1 = field751;
		if (field750 == var1) {
			field751 = null;
			return null;
		} else {
			field751 = var1.field948;
			return var1;
		}
	}

	@ObfuscatedName("JCEXAOBP.c()I")
	public int method253() {
		int var1 = 0;
		for (ORGNKIAP var2 = field750.field948; var2 != field750; var2 = var2.field948) {
			var1++;
		}

		return var1;
	}
}
