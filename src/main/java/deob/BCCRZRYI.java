package deob;

@ObfuscatedName("BCCRZRYI")
public final class BCCRZRYI {

	@ObfuscatedName("BCCRZRYI.c")
	public int field121;

	@ObfuscatedName("BCCRZRYI.d")
	public BEBSUZBY[] field122;

	public BCCRZRYI(int arg0) {
		field121 = arg0;
		field122 = new BEBSUZBY[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			BEBSUZBY var3 = field122[var2] = new BEBSUZBY();
			var3.field124 = var3;
			var3.field125 = var3;
		}
	}

	@ObfuscatedName("BCCRZRYI.a(J)LBEBSUZBY;")
	public BEBSUZBY method39(long arg0) {
		BEBSUZBY var3 = field122[(int) (arg0 & field121 - 1)];
		for (BEBSUZBY var4 = var3.field124; var4 != var3; var4 = var4.field124) {
			if (var4.field123 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("BCCRZRYI.a(JBLBEBSUZBY;)V")
	public void method40(long arg0, BEBSUZBY arg1) {
		if (arg1.field125 != null) {
			arg1.method41();
		}

		BEBSUZBY var4 = field122[(int) (arg0 & field121 - 1)];
		arg1.field125 = var4.field125;
		arg1.field124 = var4;
		arg1.field125.field124 = arg1;
		arg1.field124.field125 = arg1;
		arg1.field123 = arg0;
	}
}
