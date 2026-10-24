package deob;

@ObfuscatedName("FYVRCFGT")
public final class FYVRCFGT {

	@ObfuscatedName("FYVRCFGT.c")
	public NQPZRHXK field632 = new NQPZRHXK();

	@ObfuscatedName("FYVRCFGT.d")
	public NQPZRHXK field633;

	public FYVRCFGT() {
		field632.field926 = field632;
		field632.field927 = field632;
	}

	@ObfuscatedName("FYVRCFGT.a(LNQPZRHXK;)V")
	public void method197(NQPZRHXK arg0) {
		if (arg0.field927 != null) {
			arg0.method326();
		}

		arg0.field927 = field632.field927;
		arg0.field926 = field632;
		arg0.field927.field926 = arg0;
		arg0.field926.field927 = arg0;
	}

	@ObfuscatedName("FYVRCFGT.a(LNQPZRHXK;I)V")
	public void method198(NQPZRHXK arg0) {
		if (arg0.field927 != null) {
			arg0.method326();
		}

		arg0.field927 = field632;
		arg0.field926 = field632.field926;
		arg0.field927.field926 = arg0;
		arg0.field926.field927 = arg0;
	}

	@ObfuscatedName("FYVRCFGT.a()LNQPZRHXK;")
	public NQPZRHXK method199() {
		NQPZRHXK var1 = field632.field926;
		if (field632 == var1) {
			return null;
		} else {
			var1.method326();
			return var1;
		}
	}

	@ObfuscatedName("FYVRCFGT.b()LNQPZRHXK;")
	public NQPZRHXK method200() {
		NQPZRHXK var1 = field632.field926;
		if (field632 == var1) {
			field633 = null;
			return null;
		} else {
			field633 = var1.field926;
			return var1;
		}
	}

	@ObfuscatedName("FYVRCFGT.a(B)LNQPZRHXK;")
	public NQPZRHXK method201() {
		NQPZRHXK var1 = field632.field927;
		if (field632 == var1) {
			field633 = null;
			return null;
		} else {
			field633 = var1.field927;
			return var1;
		}
	}

	@ObfuscatedName("FYVRCFGT.a(I)LNQPZRHXK;")
	public NQPZRHXK method202() {
		NQPZRHXK var1 = field633;
		if (field632 == var1) {
			field633 = null;
			return null;
		} else {
			field633 = var1.field926;
			return var1;
		}
	}

	@ObfuscatedName("FYVRCFGT.b(B)LNQPZRHXK;")
	public NQPZRHXK method203() {
		NQPZRHXK var1 = field633;
		if (field632 == var1) {
			field633 = null;
			return null;
		} else {
			field633 = var1.field927;
			return var1;
		}
	}

	@ObfuscatedName("FYVRCFGT.c()V")
	public void method204() {
		if (field632.field926 != field632) {
			while (true) {
				NQPZRHXK var1 = field632.field926;
				if (field632 == var1) {
					return;
				}

				var1.method326();
			}
		}
	}
}
