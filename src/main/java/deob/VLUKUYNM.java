package deob;

@ObfuscatedName("VLUKUYNM")
public final class VLUKUYNM {

	@ObfuscatedName("VLUKUYNM.c")
	public OWNYSRQV field1170 = new OWNYSRQV();

	@ObfuscatedName("VLUKUYNM.d")
	public OWNYSRQV field1171;

	public VLUKUYNM() {
		field1170.field1143 = field1170;
		field1170.field1144 = field1170;
	}

	@ObfuscatedName("VLUKUYNM.a(LOWNYSRQV;)V")
	public void method358(OWNYSRQV arg0) {
		if (arg0.field1144 != null) {
			arg0.method334();
		}

		arg0.field1144 = field1170.field1144;
		arg0.field1143 = field1170;
		arg0.field1144.field1143 = arg0;
		arg0.field1143.field1144 = arg0;
	}

	@ObfuscatedName("VLUKUYNM.a(LOWNYSRQV;I)V")
	public void method359(OWNYSRQV arg0) {
		if (arg0.field1144 != null) {
			arg0.method334();
		}

		arg0.field1144 = field1170;
		arg0.field1143 = field1170.field1143;
		arg0.field1144.field1143 = arg0;
		arg0.field1143.field1144 = arg0;
	}

	@ObfuscatedName("VLUKUYNM.a()LOWNYSRQV;")
	public OWNYSRQV method360() {
		OWNYSRQV var1 = field1170.field1143;
		if (field1170 == var1) {
			return null;
		} else {
			var1.method334();
			return var1;
		}
	}

	@ObfuscatedName("VLUKUYNM.b()LOWNYSRQV;")
	public OWNYSRQV method361() {
		OWNYSRQV var1 = field1170.field1143;
		if (field1170 == var1) {
			field1171 = null;
			return null;
		} else {
			field1171 = var1.field1143;
			return var1;
		}
	}

	@ObfuscatedName("VLUKUYNM.a(I)LOWNYSRQV;")
	public OWNYSRQV method362() {
		OWNYSRQV var1 = field1170.field1144;
		if (field1170 == var1) {
			field1171 = null;
			return null;
		} else {
			field1171 = var1.field1144;
			return var1;
		}
	}

	@ObfuscatedName("VLUKUYNM.b(I)LOWNYSRQV;")
	public OWNYSRQV method363() {
		OWNYSRQV var1 = field1171;
		if (field1170 == var1) {
			field1171 = null;
			return null;
		} else {
			field1171 = var1.field1143;
			return var1;
		}
	}

	@ObfuscatedName("VLUKUYNM.c(I)LOWNYSRQV;")
	public OWNYSRQV method364() {
		OWNYSRQV var1 = field1171;
		if (field1170 == var1) {
			field1171 = null;
			return null;
		} else {
			field1171 = var1.field1144;
			return var1;
		}
	}

	@ObfuscatedName("VLUKUYNM.c()V")
	public void method365() {
		if (field1170.field1143 != field1170) {
			while (true) {
				OWNYSRQV var1 = field1170.field1143;
				if (field1170 == var1) {
					return;
				}

				var1.method334();
			}
		}
	}
}
