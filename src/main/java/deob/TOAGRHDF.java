package deob;

@ObfuscatedName("TOAGRHDF")
public final class TOAGRHDF {

	@ObfuscatedName("TOAGRHDF.d")
	public IZSDUVJF field1168 = new IZSDUVJF();

	@ObfuscatedName("TOAGRHDF.e")
	public IZSDUVJF field1169;

	public TOAGRHDF() {
		field1168.field811 = field1168;
		field1168.field812 = field1168;
	}

	@ObfuscatedName("TOAGRHDF.a(LIZSDUVJF;)V")
	public void method353(IZSDUVJF arg0) {
		if (arg0.field812 != null) {
			arg0.method256();
		}

		arg0.field812 = field1168.field812;
		arg0.field811 = field1168;
		arg0.field812.field811 = arg0;
		arg0.field811.field812 = arg0;
	}

	@ObfuscatedName("TOAGRHDF.a()LIZSDUVJF;")
	public IZSDUVJF method354() {
		IZSDUVJF var1 = field1168.field811;
		if (field1168 == var1) {
			return null;
		} else {
			var1.method256();
			return var1;
		}
	}

	@ObfuscatedName("TOAGRHDF.b()LIZSDUVJF;")
	public IZSDUVJF method355() {
		IZSDUVJF var1 = field1168.field811;
		if (field1168 == var1) {
			field1169 = null;
			return null;
		} else {
			field1169 = var1.field811;
			return var1;
		}
	}

	@ObfuscatedName("TOAGRHDF.a(I)LIZSDUVJF;")
	public IZSDUVJF method356() {
		IZSDUVJF var1 = field1169;
		if (field1168 == var1) {
			field1169 = null;
			return null;
		} else {
			field1169 = var1.field811;
			return var1;
		}
	}

	@ObfuscatedName("TOAGRHDF.c()I")
	public int method357() {
		int var1 = 0;
		for (IZSDUVJF var2 = field1168.field811; var2 != field1168; var2 = var2.field811) {
			var1++;
		}

		return var1;
	}
}
