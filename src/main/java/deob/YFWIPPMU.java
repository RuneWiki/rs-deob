package deob;

@ObfuscatedName("YFWIPPMU")
public final class YFWIPPMU {

	@ObfuscatedName("YFWIPPMU.d")
	public int field1478;

	@ObfuscatedName("YFWIPPMU.e")
	public KMUPFLXI[] field1479;

	public YFWIPPMU(int arg0) {
		field1478 = arg0;
		field1479 = new KMUPFLXI[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			KMUPFLXI var3 = field1479[var2] = new KMUPFLXI();
			var3.field842 = var3;
			var3.field843 = var3;
		}
	}

	@ObfuscatedName("YFWIPPMU.a(J)LKMUPFLXI;")
	public KMUPFLXI method582(long arg0) {
		KMUPFLXI var3 = field1479[(int) (arg0 & field1478 - 1)];
		for (KMUPFLXI var4 = var3.field842; var4 != var3; var4 = var4.field842) {
			if (var4.field841 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("YFWIPPMU.a(IJLKMUPFLXI;)V")
	public void method583(long arg0, KMUPFLXI arg1) {
		if (arg1.field843 != null) {
			arg1.method272();
		}

		KMUPFLXI var4 = field1479[(int) (arg0 & field1478 - 1)];
		arg1.field843 = var4.field843;
		arg1.field842 = var4;
		arg1.field843.field842 = arg1;
		arg1.field842.field843 = arg1;
		arg1.field841 = arg0;
	}
}
