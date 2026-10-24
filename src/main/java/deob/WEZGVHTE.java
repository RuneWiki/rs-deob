package deob;

@ObfuscatedName("WEZGVHTE")
public final class WEZGVHTE {

	@ObfuscatedName("WEZGVHTE.d")
	public int field1401;

	@ObfuscatedName("WEZGVHTE.e")
	public AIZKCREI[] field1402;

	public WEZGVHTE(int arg0) {
		field1401 = arg0;
		field1402 = new AIZKCREI[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			AIZKCREI var3 = field1402[var2] = new AIZKCREI();
			var3.field2 = var3;
			var3.field3 = var3;
		}
	}

	@ObfuscatedName("WEZGVHTE.a(J)LAIZKCREI;")
	public AIZKCREI method586(long arg0) {
		AIZKCREI var3 = field1402[(int) (arg0 & field1401 - 1)];
		for (AIZKCREI var4 = var3.field2; var4 != var3; var4 = var4.field2) {
			if (var4.field1 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("WEZGVHTE.a(ILAIZKCREI;J)V")
	public void method587(AIZKCREI arg0, long arg1) {
		if (arg0.field3 != null) {
			arg0.method1();
		}

		AIZKCREI var4 = field1402[(int) (arg1 & field1401 - 1)];
		arg0.field3 = var4.field3;
		arg0.field2 = var4;
		arg0.field3.field2 = arg0;
		arg0.field2.field3 = arg0;
		arg0.field1 = arg1;
	}
}
