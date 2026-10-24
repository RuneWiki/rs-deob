package deob;

@ObfuscatedName("CRZPTUPR")
public final class CRZPTUPR {

	@ObfuscatedName("CRZPTUPR.d")
	public KMUPFLXI field526 = new KMUPFLXI();

	@ObfuscatedName("CRZPTUPR.e")
	public KMUPFLXI field527;

	public CRZPTUPR() {
		field526.field842 = field526;
		field526.field843 = field526;
	}

	@ObfuscatedName("CRZPTUPR.a(LKMUPFLXI;)V")
	public void method176(KMUPFLXI arg0) {
		if (arg0.field843 != null) {
			arg0.method272();
		}

		arg0.field843 = field526.field843;
		arg0.field842 = field526;
		arg0.field843.field842 = arg0;
		arg0.field842.field843 = arg0;
	}

	@ObfuscatedName("CRZPTUPR.a(LKMUPFLXI;I)V")
	public void method177(KMUPFLXI arg0) {
		if (arg0.field843 != null) {
			arg0.method272();
		}

		arg0.field843 = field526;
		arg0.field842 = field526.field842;
		arg0.field843.field842 = arg0;
		arg0.field842.field843 = arg0;
	}

	@ObfuscatedName("CRZPTUPR.a()LKMUPFLXI;")
	public KMUPFLXI method178() {
		KMUPFLXI var1 = field526.field842;
		if (field526 == var1) {
			return null;
		} else {
			var1.method272();
			return var1;
		}
	}

	@ObfuscatedName("CRZPTUPR.b()LKMUPFLXI;")
	public KMUPFLXI method179() {
		KMUPFLXI var1 = field526.field842;
		if (field526 == var1) {
			field527 = null;
			return null;
		} else {
			field527 = var1.field842;
			return var1;
		}
	}

	@ObfuscatedName("CRZPTUPR.a(B)LKMUPFLXI;")
	public KMUPFLXI method180() {
		KMUPFLXI var1 = field526.field843;
		if (field526 == var1) {
			field527 = null;
			return null;
		} else {
			field527 = var1.field843;
			return var1;
		}
	}

	@ObfuscatedName("CRZPTUPR.b(B)LKMUPFLXI;")
	public KMUPFLXI method181() {
		KMUPFLXI var1 = field527;
		if (field526 == var1) {
			field527 = null;
			return null;
		} else {
			field527 = var1.field842;
			return var1;
		}
	}

	@ObfuscatedName("CRZPTUPR.a(Z)LKMUPFLXI;")
	public KMUPFLXI method182() {
		KMUPFLXI var1 = field527;
		if (field526 == var1) {
			field527 = null;
			return null;
		} else {
			field527 = var1.field843;
			return var1;
		}
	}

	@ObfuscatedName("CRZPTUPR.c()V")
	public void method183() {
		if (field526.field842 != field526) {
			while (true) {
				KMUPFLXI var1 = field526.field842;
				if (field526 == var1) {
					return;
				}

				var1.method272();
			}
		}
	}
}
