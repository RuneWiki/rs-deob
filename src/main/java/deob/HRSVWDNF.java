package deob;

@ObfuscatedName("HRSVWDNF")
public final class HRSVWDNF {

	@ObfuscatedName("HRSVWDNF.c")
	public YCAZQYJA field838 = new YCAZQYJA();

	@ObfuscatedName("HRSVWDNF.d")
	public YCAZQYJA field839;

	public HRSVWDNF() {
		field838.field1490 = field838;
		field838.field1491 = field838;
	}

	@ObfuscatedName("HRSVWDNF.a(LYCAZQYJA;)V")
	public void method356(YCAZQYJA arg0) {
		if (arg0.field1491 != null) {
			arg0.method583();
		}

		arg0.field1491 = field838.field1491;
		arg0.field1490 = field838;
		arg0.field1491.field1490 = arg0;
		arg0.field1490.field1491 = arg0;
	}

	@ObfuscatedName("HRSVWDNF.a()LYCAZQYJA;")
	public YCAZQYJA method357() {
		YCAZQYJA var1 = field838.field1490;
		if (field838 == var1) {
			return null;
		} else {
			var1.method583();
			return var1;
		}
	}

	@ObfuscatedName("HRSVWDNF.b()LYCAZQYJA;")
	public YCAZQYJA method358() {
		YCAZQYJA var1 = field838.field1490;
		if (field838 == var1) {
			field839 = null;
			return null;
		} else {
			field839 = var1.field1490;
			return var1;
		}
	}

	@ObfuscatedName("HRSVWDNF.a(I)LYCAZQYJA;")
	public YCAZQYJA method359() {
		YCAZQYJA var1 = field839;
		if (field838 == var1) {
			field839 = null;
			return null;
		} else {
			field839 = var1.field1490;
			return var1;
		}
	}

	@ObfuscatedName("HRSVWDNF.c()I")
	public int method360() {
		int var1 = 0;
		for (YCAZQYJA var2 = field838.field1490; var2 != field838; var2 = var2.field1490) {
			var1++;
		}

		return var1;
	}
}
