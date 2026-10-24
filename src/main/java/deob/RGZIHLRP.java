package deob;

@ObfuscatedName("RGZIHLRP")
public final class RGZIHLRP {

	@ObfuscatedName("RGZIHLRP.e")
	public MXUYAYVV field1265 = new MXUYAYVV();

	@ObfuscatedName("RGZIHLRP.f")
	public MXUYAYVV field1266;

	public RGZIHLRP() {
		field1265.field1077 = field1265;
		field1265.field1078 = field1265;
	}

	@ObfuscatedName("RGZIHLRP.a(LMXUYAYVV;)V")
	public void method468(MXUYAYVV arg0) {
		if (arg0.field1078 != null) {
			arg0.method430();
		}

		arg0.field1078 = field1265.field1078;
		arg0.field1077 = field1265;
		arg0.field1078.field1077 = arg0;
		arg0.field1077.field1078 = arg0;
	}

	@ObfuscatedName("RGZIHLRP.a(ILMXUYAYVV;)V")
	public void method469(MXUYAYVV arg0) {
		if (arg0.field1078 != null) {
			arg0.method430();
		}

		arg0.field1078 = field1265;
		arg0.field1077 = field1265.field1077;
		arg0.field1078.field1077 = arg0;
		arg0.field1077.field1078 = arg0;
	}

	@ObfuscatedName("RGZIHLRP.a()LMXUYAYVV;")
	public MXUYAYVV method470() {
		MXUYAYVV var1 = field1265.field1077;
		if (field1265 == var1) {
			return null;
		} else {
			var1.method430();
			return var1;
		}
	}

	@ObfuscatedName("RGZIHLRP.b()LMXUYAYVV;")
	public MXUYAYVV method471() {
		MXUYAYVV var1 = field1265.field1077;
		if (field1265 == var1) {
			field1266 = null;
			return null;
		} else {
			field1266 = var1.field1077;
			return var1;
		}
	}

	@ObfuscatedName("RGZIHLRP.a(I)LMXUYAYVV;")
	public MXUYAYVV method472() {
		MXUYAYVV var1 = field1265.field1078;
		if (field1265 == var1) {
			field1266 = null;
			return null;
		} else {
			field1266 = var1.field1078;
			return var1;
		}
	}

	@ObfuscatedName("RGZIHLRP.a(B)LMXUYAYVV;")
	public MXUYAYVV method473() {
		MXUYAYVV var1 = field1266;
		if (field1265 == var1) {
			field1266 = null;
			return null;
		} else {
			field1266 = var1.field1077;
			return var1;
		}
	}

	@ObfuscatedName("RGZIHLRP.b(B)LMXUYAYVV;")
	public MXUYAYVV method474() {
		MXUYAYVV var1 = field1266;
		if (field1265 == var1) {
			field1266 = null;
			return null;
		} else {
			field1266 = var1.field1078;
			return var1;
		}
	}

	@ObfuscatedName("RGZIHLRP.c()V")
	public void method475() {
		if (field1265.field1077 != field1265) {
			while (true) {
				MXUYAYVV var1 = field1265.field1077;
				if (field1265 == var1) {
					return;
				}

				var1.method430();
			}
		}
	}
}
