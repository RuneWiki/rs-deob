package deob;

@ObfuscatedName("FXRMRSFD")
public final class FXRMRSFD {

	@ObfuscatedName("FXRMRSFD.b")
	public int field678;

	@ObfuscatedName("FXRMRSFD.c")
	public WWONSPNF[] field679;

	public FXRMRSFD(int arg0) {
		field678 = arg0;
		field679 = new WWONSPNF[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			WWONSPNF var3 = field679[var2] = new WWONSPNF();
			var3.field1371 = var3;
			var3.field1372 = var3;
		}
	}

	@ObfuscatedName("FXRMRSFD.a(J)LWWONSPNF;")
	public WWONSPNF method219(long arg0) {
		WWONSPNF var3 = field679[(int) (arg0 & field678 - 1)];
		for (WWONSPNF var4 = var3.field1371; var4 != var3; var4 = var4.field1371) {
			if (var4.field1370 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("FXRMRSFD.a(JLWWONSPNF;I)V")
	public void method220(long arg0, WWONSPNF arg1) {
		if (arg1.field1372 != null) {
			arg1.method555();
		}

		WWONSPNF var4 = field679[(int) (arg0 & field678 - 1)];
		arg1.field1372 = var4.field1372;
		arg1.field1371 = var4;
		arg1.field1372.field1371 = arg1;
		arg1.field1371.field1372 = arg1;
		arg1.field1370 = arg0;
	}
}
