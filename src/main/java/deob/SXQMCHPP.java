package deob;

@ObfuscatedName("SXQMCHPP")
public final class SXQMCHPP {

	@ObfuscatedName("SXQMCHPP.c")
	public YNSWJIIM field1328 = new YNSWJIIM();

	@ObfuscatedName("SXQMCHPP.d")
	public YNSWJIIM field1329;

	public SXQMCHPP() {
		field1328.field1465 = field1328;
		field1328.field1466 = field1328;
	}

	@ObfuscatedName("SXQMCHPP.a(LYNSWJIIM;)V")
	public void method506(YNSWJIIM arg0) {
		if (arg0.field1466 != null) {
			arg0.method588();
		}

		arg0.field1466 = field1328.field1466;
		arg0.field1465 = field1328;
		arg0.field1466.field1465 = arg0;
		arg0.field1465.field1466 = arg0;
	}

	@ObfuscatedName("SXQMCHPP.a(LYNSWJIIM;I)V")
	public void method507(YNSWJIIM arg0) {
		if (arg0.field1466 != null) {
			arg0.method588();
		}

		arg0.field1466 = field1328;
		arg0.field1465 = field1328.field1465;
		arg0.field1466.field1465 = arg0;
		arg0.field1465.field1466 = arg0;
	}

	@ObfuscatedName("SXQMCHPP.a()LYNSWJIIM;")
	public YNSWJIIM method508() {
		YNSWJIIM var1 = field1328.field1465;
		if (field1328 == var1) {
			return null;
		} else {
			var1.method588();
			return var1;
		}
	}

	@ObfuscatedName("SXQMCHPP.b()LYNSWJIIM;")
	public YNSWJIIM method509() {
		YNSWJIIM var1 = field1328.field1465;
		if (field1328 == var1) {
			field1329 = null;
			return null;
		} else {
			field1329 = var1.field1465;
			return var1;
		}
	}

	@ObfuscatedName("SXQMCHPP.a(B)LYNSWJIIM;")
	public YNSWJIIM method510() {
		YNSWJIIM var1 = field1328.field1466;
		if (field1328 == var1) {
			field1329 = null;
			return null;
		} else {
			field1329 = var1.field1466;
			return var1;
		}
	}

	@ObfuscatedName("SXQMCHPP.a(I)LYNSWJIIM;")
	public YNSWJIIM method511() {
		YNSWJIIM var1 = field1329;
		if (field1328 == var1) {
			field1329 = null;
			return null;
		} else {
			field1329 = var1.field1465;
			return var1;
		}
	}

	@ObfuscatedName("SXQMCHPP.b(B)LYNSWJIIM;")
	public YNSWJIIM method512() {
		YNSWJIIM var1 = field1329;
		if (field1328 == var1) {
			field1329 = null;
			return null;
		} else {
			field1329 = var1.field1466;
			return var1;
		}
	}

	@ObfuscatedName("SXQMCHPP.c()V")
	public void method513() {
		if (field1328.field1465 != field1328) {
			while (true) {
				YNSWJIIM var1 = field1328.field1465;
				if (field1328 == var1) {
					return;
				}

				var1.method588();
			}
		}
	}
}
