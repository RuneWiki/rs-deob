package deob;

@ObfuscatedName("HZUGKGVT")
public final class HZUGKGVT {

	@ObfuscatedName("HZUGKGVT.a")
	public int field656;

	@ObfuscatedName("HZUGKGVT.b")
	public TSSAWEFF[] field657;

	public HZUGKGVT(int arg0) {
		field656 = arg0;
		field657 = new TSSAWEFF[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			TSSAWEFF var3 = field657[var2] = new TSSAWEFF();
			var3.field1137 = var3;
			var3.field1138 = var3;
		}
	}

	@ObfuscatedName("HZUGKGVT.a(J)LTSSAWEFF;")
	public TSSAWEFF method248(long arg0) {
		TSSAWEFF var3 = field657[(int) (arg0 & field656 - 1)];
		for (TSSAWEFF var4 = var3.field1137; var4 != var3; var4 = var4.field1137) {
			if (var4.field1136 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("HZUGKGVT.a(JZLTSSAWEFF;)V")
	public void method249(long arg0, TSSAWEFF arg1) {
		if (arg1.field1138 != null) {
			arg1.method492();
		}

		TSSAWEFF var4 = field657[(int) (arg0 & field656 - 1)];
		arg1.field1138 = var4.field1138;
		arg1.field1137 = var4;
		arg1.field1138.field1137 = arg1;
		arg1.field1137.field1138 = arg1;
		arg1.field1136 = arg0;
	}
}
