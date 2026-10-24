package deob;

@ObfuscatedName("QUHNUHWS")
public final class QUHNUHWS {

	@ObfuscatedName("QUHNUHWS.b")
	public NFNHZJTP field1111 = new NFNHZJTP();

	@ObfuscatedName("QUHNUHWS.c")
	public NFNHZJTP field1112;

	public QUHNUHWS() {
		field1111.field983 = field1111;
		field1111.field984 = field1111;
	}

	@ObfuscatedName("QUHNUHWS.a(LNFNHZJTP;)V")
	public void method393(NFNHZJTP arg0) {
		if (arg0.field984 != null) {
			arg0.method348();
		}

		arg0.field984 = field1111.field984;
		arg0.field983 = field1111;
		arg0.field984.field983 = arg0;
		arg0.field983.field984 = arg0;
	}

	@ObfuscatedName("QUHNUHWS.a()LNFNHZJTP;")
	public NFNHZJTP method394() {
		NFNHZJTP var1 = field1111.field983;
		if (field1111 == var1) {
			return null;
		} else {
			var1.method348();
			return var1;
		}
	}

	@ObfuscatedName("QUHNUHWS.b()LNFNHZJTP;")
	public NFNHZJTP method395() {
		NFNHZJTP var1 = field1111.field983;
		if (field1111 == var1) {
			field1112 = null;
			return null;
		} else {
			field1112 = var1.field983;
			return var1;
		}
	}

	@ObfuscatedName("QUHNUHWS.a(I)LNFNHZJTP;")
	public NFNHZJTP method396() {
		NFNHZJTP var1 = field1112;
		if (field1111 == var1) {
			field1112 = null;
			return null;
		} else {
			field1112 = var1.field983;
			return var1;
		}
	}

	@ObfuscatedName("QUHNUHWS.c()I")
	public int method397() {
		int var1 = 0;
		for (NFNHZJTP var2 = field1111.field983; var2 != field1111; var2 = var2.field983) {
			var1++;
		}

		return var1;
	}
}
