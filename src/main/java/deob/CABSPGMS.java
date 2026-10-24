package deob;

@ObfuscatedName("CABSPGMS")
public final class CABSPGMS {

	@ObfuscatedName("CABSPGMS.b")
	public int field57;

	@ObfuscatedName("CABSPGMS.c")
	public ZMCAQRHG[] field58;

	public CABSPGMS(int arg0) {
		field57 = arg0;
		field58 = new ZMCAQRHG[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			ZMCAQRHG var3 = field58[var2] = new ZMCAQRHG();
			var3.field1508 = var3;
			var3.field1509 = var3;
		}
	}

	@ObfuscatedName("CABSPGMS.a(J)LZMCAQRHG;")
	public ZMCAQRHG method45(long arg0) {
		ZMCAQRHG var3 = field58[(int) (arg0 & field57 - 1)];
		for (ZMCAQRHG var4 = var3.field1508; var4 != var3; var4 = var4.field1508) {
			if (var4.field1507 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("CABSPGMS.a(LZMCAQRHG;JI)V")
	public void method46(ZMCAQRHG arg0, long arg1) {
		if (arg0.field1509 != null) {
			arg0.method602();
		}

		ZMCAQRHG var4 = field58[(int) (arg1 & field57 - 1)];
		arg0.field1509 = var4.field1509;
		arg0.field1508 = var4;
		arg0.field1509.field1508 = arg0;
		arg0.field1508.field1509 = arg0;
		arg0.field1507 = arg1;
	}
}
