package deob;

@ObfuscatedName("MCCUMEPE")
public final class MCCUMEPE {

	@ObfuscatedName("MCCUMEPE.f")
	public int field1011;

	@ObfuscatedName("MCCUMEPE.g")
	public OWNYSRQV[] field1012;

	public MCCUMEPE(int arg0) {
		field1011 = arg0;
		field1012 = new OWNYSRQV[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			OWNYSRQV var3 = field1012[var2] = new OWNYSRQV();
			var3.field1143 = var3;
			var3.field1144 = var3;
		}
	}

	@ObfuscatedName("MCCUMEPE.a(J)LOWNYSRQV;")
	public OWNYSRQV method314(long arg0) {
		OWNYSRQV var3 = field1012[(int) (arg0 & field1011 - 1)];
		for (OWNYSRQV var4 = var3.field1143; var4 != var3; var4 = var4.field1143) {
			if (var4.field1142 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("MCCUMEPE.a(BLOWNYSRQV;J)V")
	public void method315(OWNYSRQV arg0, long arg1) {
		if (arg0.field1144 != null) {
			arg0.method334();
		}

		OWNYSRQV var4 = field1012[(int) (arg1 & field1011 - 1)];
		arg0.field1144 = var4.field1144;
		arg0.field1143 = var4;
		arg0.field1144.field1143 = arg0;
		arg0.field1143.field1144 = arg0;
		arg0.field1142 = arg1;
	}
}
