package deob;

@ObfuscatedName("CEEJCAVA")
public final class CEEJCAVA {

	@ObfuscatedName("CEEJCAVA.f")
	public SSWDZUWQ field62 = new SSWDZUWQ();

	@ObfuscatedName("CEEJCAVA.g")
	public SSWDZUWQ field63;

	public CEEJCAVA() {
		field62.field1377 = field62;
		field62.field1378 = field62;
	}

	@ObfuscatedName("CEEJCAVA.a(LSSWDZUWQ;)V")
	public void method30(SSWDZUWQ arg0) {
		if (arg0.field1378 != null) {
			arg0.method505();
		}

		arg0.field1378 = field62.field1378;
		arg0.field1377 = field62;
		arg0.field1378.field1377 = arg0;
		arg0.field1377.field1378 = arg0;
	}

	@ObfuscatedName("CEEJCAVA.a(LSSWDZUWQ;B)V")
	public void method31(SSWDZUWQ arg0) {
		if (arg0.field1378 != null) {
			arg0.method505();
		}

		arg0.field1378 = field62;
		arg0.field1377 = field62.field1377;
		arg0.field1378.field1377 = arg0;
		arg0.field1377.field1378 = arg0;
	}

	@ObfuscatedName("CEEJCAVA.a()LSSWDZUWQ;")
	public SSWDZUWQ method32() {
		SSWDZUWQ var1 = field62.field1377;
		if (field62 == var1) {
			return null;
		} else {
			var1.method505();
			return var1;
		}
	}

	@ObfuscatedName("CEEJCAVA.b()LSSWDZUWQ;")
	public SSWDZUWQ method33() {
		SSWDZUWQ var1 = field62.field1377;
		if (field62 == var1) {
			field63 = null;
			return null;
		} else {
			field63 = var1.field1377;
			return var1;
		}
	}

	@ObfuscatedName("CEEJCAVA.a(I)LSSWDZUWQ;")
	public SSWDZUWQ method34() {
		SSWDZUWQ var1 = field62.field1378;
		if (field62 == var1) {
			field63 = null;
			return null;
		} else {
			field63 = var1.field1378;
			return var1;
		}
	}

	@ObfuscatedName("CEEJCAVA.a(B)LSSWDZUWQ;")
	public SSWDZUWQ method35() {
		SSWDZUWQ var1 = field63;
		if (field62 == var1) {
			field63 = null;
			return null;
		} else {
			field63 = var1.field1377;
			return var1;
		}
	}

	@ObfuscatedName("CEEJCAVA.b(I)LSSWDZUWQ;")
	public SSWDZUWQ method36() {
		SSWDZUWQ var1 = field63;
		if (field62 == var1) {
			field63 = null;
			return null;
		} else {
			field63 = var1.field1378;
			return var1;
		}
	}

	@ObfuscatedName("CEEJCAVA.c()V")
	public void method37() {
		if (field62.field1377 != field62) {
			while (true) {
				SSWDZUWQ var1 = field62.field1377;
				if (field62 == var1) {
					return;
				}

				var1.method505();
			}
		}
	}
}
