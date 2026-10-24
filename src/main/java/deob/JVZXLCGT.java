package deob;

@ObfuscatedName("JVZXLCGT")
public final class JVZXLCGT {

	@ObfuscatedName("JVZXLCGT.c")
	public int field836;

	@ObfuscatedName("JVZXLCGT.d")
	public ABHGPSRU[] field837;

	public JVZXLCGT(int arg0) {
		field836 = arg0;
		field837 = new ABHGPSRU[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			ABHGPSRU var3 = field837[var2] = new ABHGPSRU();
			var3.field2 = var3;
			var3.field3 = var3;
		}
	}

	@ObfuscatedName("JVZXLCGT.a(J)LABHGPSRU;")
	public ABHGPSRU method341(long arg0) {
		ABHGPSRU var3 = field837[(int) (arg0 & field836 - 1)];
		for (ABHGPSRU var4 = var3.field2; var4 != var3; var4 = var4.field2) {
			if (var4.field1 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("JVZXLCGT.a(ILABHGPSRU;J)V")
	public void method342(ABHGPSRU arg0, long arg1) {
		if (arg0.field3 != null) {
			arg0.method1();
		}

		ABHGPSRU var4 = field837[(int) (arg1 & field836 - 1)];
		arg0.field3 = var4.field3;
		arg0.field2 = var4;
		arg0.field3.field2 = arg0;
		arg0.field2.field3 = arg0;
		arg0.field1 = arg1;
	}
}
