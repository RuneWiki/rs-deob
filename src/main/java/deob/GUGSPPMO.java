package deob;

@ObfuscatedName("GUGSPPMO")
public final class GUGSPPMO {

	@ObfuscatedName("GUGSPPMO.c")
	public int field577;

	@ObfuscatedName("GUGSPPMO.d")
	public QEPVMESX[] field578;

	public GUGSPPMO(int arg0) {
		field577 = arg0;
		field578 = new QEPVMESX[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			QEPVMESX var3 = field578[var2] = new QEPVMESX();
			var3.field1024 = var3;
			var3.field1025 = var3;
		}
	}

	@ObfuscatedName("GUGSPPMO.a(J)LQEPVMESX;")
	public QEPVMESX method292(long arg0) {
		QEPVMESX var3 = field578[(int) (arg0 & field577 - 1)];
		for (QEPVMESX var4 = var3.field1024; var4 != var3; var4 = var4.field1024) {
			if (var4.field1023 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("GUGSPPMO.a(LQEPVMESX;JI)V")
	public void method293(QEPVMESX arg0, long arg1) {
		if (arg0.field1025 != null) {
			arg0.method418();
		}

		QEPVMESX var4 = field578[(int) (arg1 & field577 - 1)];
		arg0.field1025 = var4.field1025;
		arg0.field1024 = var4;
		arg0.field1025.field1024 = arg0;
		arg0.field1024.field1025 = arg0;
		arg0.field1023 = arg1;
	}
}
