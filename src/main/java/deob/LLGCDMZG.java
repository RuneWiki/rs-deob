package deob;

@ObfuscatedName("LLGCDMZG")
public final class LLGCDMZG {

	@ObfuscatedName("LLGCDMZG.d")
	public int field1060;

	@ObfuscatedName("LLGCDMZG.e")
	public OGKECTLC[] field1061;

	public LLGCDMZG(int arg0) {
		field1060 = arg0;
		field1061 = new OGKECTLC[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			OGKECTLC var3 = field1061[var2] = new OGKECTLC();
			var3.field1077 = var3;
			var3.field1078 = var3;
		}
	}

	@ObfuscatedName("LLGCDMZG.a(J)LOGKECTLC;")
	public OGKECTLC method447(long arg0) {
		OGKECTLC var3 = field1061[(int) (arg0 & field1060 - 1)];
		for (OGKECTLC var4 = var3.field1077; var4 != var3; var4 = var4.field1077) {
			if (var4.field1076 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("LLGCDMZG.a(LOGKECTLC;BJ)V")
	public void method448(OGKECTLC arg0, long arg1) {
		if (arg0.field1078 != null) {
			arg0.method450();
		}

		OGKECTLC var4 = field1061[(int) (arg1 & field1060 - 1)];
		arg0.field1078 = var4.field1078;
		arg0.field1077 = var4;
		arg0.field1078.field1077 = arg0;
		arg0.field1077.field1078 = arg0;
		arg0.field1076 = arg1;
	}
}
