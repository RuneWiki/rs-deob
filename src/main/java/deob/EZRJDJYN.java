package deob;

@ObfuscatedName("EZRJDJYN")
public final class EZRJDJYN {

	@ObfuscatedName("EZRJDJYN.c")
	public OZZFMONJ field677 = new OZZFMONJ();

	@ObfuscatedName("EZRJDJYN.d")
	public OZZFMONJ field678;

	public EZRJDJYN() {
		field677.field1148 = field677;
		field677.field1149 = field677;
	}

	@ObfuscatedName("EZRJDJYN.a(LOZZFMONJ;)V")
	public void method190(OZZFMONJ arg0) {
		if (arg0.field1149 != null) {
			arg0.method371();
		}

		arg0.field1149 = field677.field1149;
		arg0.field1148 = field677;
		arg0.field1149.field1148 = arg0;
		arg0.field1148.field1149 = arg0;
	}

	@ObfuscatedName("EZRJDJYN.a()LOZZFMONJ;")
	public OZZFMONJ method191() {
		OZZFMONJ var1 = field677.field1148;
		if (field677 == var1) {
			return null;
		} else {
			var1.method371();
			return var1;
		}
	}

	@ObfuscatedName("EZRJDJYN.b()LOZZFMONJ;")
	public OZZFMONJ method192() {
		OZZFMONJ var1 = field677.field1148;
		if (field677 == var1) {
			field678 = null;
			return null;
		} else {
			field678 = var1.field1148;
			return var1;
		}
	}

	@ObfuscatedName("EZRJDJYN.a(I)LOZZFMONJ;")
	public OZZFMONJ method193() {
		OZZFMONJ var1 = field678;
		if (field677 == var1) {
			field678 = null;
			return null;
		} else {
			field678 = var1.field1148;
			return var1;
		}
	}

	@ObfuscatedName("EZRJDJYN.c()I")
	public int method194() {
		int var1 = 0;
		for (OZZFMONJ var2 = field677.field1148; var2 != field677; var2 = var2.field1148) {
			var1++;
		}

		return var1;
	}
}
