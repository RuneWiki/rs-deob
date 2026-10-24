package deob;

@ObfuscatedName("BGTUCWCI")
public final class BGTUCWCI {

	@ObfuscatedName("BGTUCWCI.b")
	public UCIRENXU field43 = new UCIRENXU();

	@ObfuscatedName("BGTUCWCI.c")
	public UCIRENXU field44;

	public BGTUCWCI() {
		field43.field1082 = field43;
		field43.field1083 = field43;
	}

	@ObfuscatedName("BGTUCWCI.a(LUCIRENXU;)V")
	public void method13(UCIRENXU arg0) {
		if (arg0.field1083 != null) {
			arg0.method456();
		}

		arg0.field1083 = field43.field1083;
		arg0.field1082 = field43;
		arg0.field1083.field1082 = arg0;
		arg0.field1082.field1083 = arg0;
	}

	@ObfuscatedName("BGTUCWCI.a()LUCIRENXU;")
	public UCIRENXU method14() {
		UCIRENXU var1 = field43.field1082;
		if (field43 == var1) {
			return null;
		} else {
			var1.method456();
			return var1;
		}
	}

	@ObfuscatedName("BGTUCWCI.b()LUCIRENXU;")
	public UCIRENXU method15() {
		UCIRENXU var1 = field43.field1082;
		if (field43 == var1) {
			field44 = null;
			return null;
		} else {
			field44 = var1.field1082;
			return var1;
		}
	}

	@ObfuscatedName("BGTUCWCI.a(I)LUCIRENXU;")
	public UCIRENXU method16() {
		UCIRENXU var1 = field44;
		if (field43 == var1) {
			field44 = null;
			return null;
		} else {
			field44 = var1.field1082;
			return var1;
		}
	}

	@ObfuscatedName("BGTUCWCI.c()I")
	public int method17() {
		int var1 = 0;
		for (UCIRENXU var2 = field43.field1082; var2 != field43; var2 = var2.field1082) {
			var1++;
		}

		return var1;
	}
}
