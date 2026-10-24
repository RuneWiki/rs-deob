package deob;

@ObfuscatedName("XWMRKIHQ")
public final class XWMRKIHQ {

	@ObfuscatedName("XWMRKIHQ.c")
	public int field1415;

	@ObfuscatedName("XWMRKIHQ.d")
	public MRGQMKFG[] field1416;

	public XWMRKIHQ(int arg0) {
		field1415 = arg0;
		field1416 = new MRGQMKFG[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			MRGQMKFG var3 = field1416[var2] = new MRGQMKFG();
			var3.field962 = var3;
			var3.field963 = var3;
		}
	}

	@ObfuscatedName("XWMRKIHQ.a(J)LMRGQMKFG;")
	public MRGQMKFG method554(long arg0) {
		MRGQMKFG var3 = field1416[(int) (arg0 & field1415 - 1)];
		for (MRGQMKFG var4 = var3.field962; var4 != var3; var4 = var4.field962) {
			if (var4.field961 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("XWMRKIHQ.a(BLMRGQMKFG;J)V")
	public void method555(MRGQMKFG arg0, long arg1) {
		if (arg0.field963 != null) {
			arg0.method336();
		}

		MRGQMKFG var4 = field1416[(int) (arg1 & field1415 - 1)];
		arg0.field963 = var4.field963;
		arg0.field962 = var4;
		arg0.field963.field962 = arg0;
		arg0.field962.field963 = arg0;
		arg0.field961 = arg1;
	}
}
