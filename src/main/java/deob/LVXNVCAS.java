package deob;

@ObfuscatedName("LVXNVCAS")
public final class LVXNVCAS {

	@ObfuscatedName("LVXNVCAS.a")
	public int field973;

	@ObfuscatedName("LVXNVCAS.b")
	public FLQEGCUY[] field974;

	public LVXNVCAS(int arg0) {
		field973 = arg0;
		field974 = new FLQEGCUY[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			FLQEGCUY var3 = field974[var2] = new FLQEGCUY();
			var3.field636 = var3;
			var3.field637 = var3;
		}
	}

	@ObfuscatedName("LVXNVCAS.a(J)LFLQEGCUY;")
	public FLQEGCUY method362(long arg0) {
		FLQEGCUY var3 = field974[(int) (arg0 & field973 - 1)];
		for (FLQEGCUY var4 = var3.field636; var4 != var3; var4 = var4.field636) {
			if (var4.field635 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("LVXNVCAS.a(IJLFLQEGCUY;)V")
	public void method363(long arg0, FLQEGCUY arg1) {
		if (arg1.field637 != null) {
			arg1.method195();
		}

		FLQEGCUY var4 = field974[(int) (arg0 & field973 - 1)];
		arg1.field637 = var4.field637;
		arg1.field636 = var4;
		arg1.field637.field636 = arg1;
		arg1.field636.field637 = arg1;
		arg1.field635 = arg0;
	}
}
