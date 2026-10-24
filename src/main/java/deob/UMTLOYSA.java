package deob;

@ObfuscatedName("UMTLOYSA")
public final class UMTLOYSA {

	@ObfuscatedName("UMTLOYSA.c")
	public BIJRHVKA field1237 = new BIJRHVKA();

	@ObfuscatedName("UMTLOYSA.d")
	public BIJRHVKA field1238;

	public UMTLOYSA() {
		field1237.field135 = field1237;
		field1237.field136 = field1237;
	}

	@ObfuscatedName("UMTLOYSA.a(LBIJRHVKA;)V")
	public void method466(BIJRHVKA arg0) {
		if (arg0.field136 != null) {
			arg0.method35();
		}

		arg0.field136 = field1237.field136;
		arg0.field135 = field1237;
		arg0.field136.field135 = arg0;
		arg0.field135.field136 = arg0;
	}

	@ObfuscatedName("UMTLOYSA.a()LBIJRHVKA;")
	public BIJRHVKA method467() {
		BIJRHVKA var1 = field1237.field135;
		if (field1237 == var1) {
			return null;
		} else {
			var1.method35();
			return var1;
		}
	}

	@ObfuscatedName("UMTLOYSA.b()LBIJRHVKA;")
	public BIJRHVKA method468() {
		BIJRHVKA var1 = field1237.field135;
		if (field1237 == var1) {
			field1238 = null;
			return null;
		} else {
			field1238 = var1.field135;
			return var1;
		}
	}

	@ObfuscatedName("UMTLOYSA.a(I)LBIJRHVKA;")
	public BIJRHVKA method469() {
		BIJRHVKA var1 = field1238;
		if (field1237 == var1) {
			field1238 = null;
			return null;
		} else {
			field1238 = var1.field135;
			return var1;
		}
	}

	@ObfuscatedName("UMTLOYSA.c()I")
	public int method470() {
		int var1 = 0;
		for (BIJRHVKA var2 = field1237.field135; var2 != field1237; var2 = var2.field135) {
			var1++;
		}

		return var1;
	}
}
