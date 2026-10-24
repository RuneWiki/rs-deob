package deob;

@ObfuscatedName("WGMBOAQO")
public final class WGMBOAQO {

	@ObfuscatedName("WGMBOAQO.c")
	public int field1445;

	@ObfuscatedName("WGMBOAQO.d")
	public YNSWJIIM[] field1446;

	public WGMBOAQO(int arg0) {
		field1445 = arg0;
		field1446 = new YNSWJIIM[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			YNSWJIIM var3 = field1446[var2] = new YNSWJIIM();
			var3.field1465 = var3;
			var3.field1466 = var3;
		}
	}

	@ObfuscatedName("WGMBOAQO.a(J)LYNSWJIIM;")
	public YNSWJIIM method586(long arg0) {
		YNSWJIIM var3 = field1446[(int) (arg0 & field1445 - 1)];
		for (YNSWJIIM var4 = var3.field1465; var4 != var3; var4 = var4.field1465) {
			if (var4.field1464 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("WGMBOAQO.a(JBLYNSWJIIM;)V")
	public void method587(long arg0, YNSWJIIM arg1) {
		if (arg1.field1466 != null) {
			arg1.method588();
		}

		YNSWJIIM var4 = field1446[(int) (arg0 & field1445 - 1)];
		arg1.field1466 = var4.field1466;
		arg1.field1465 = var4;
		arg1.field1466.field1465 = arg1;
		arg1.field1465.field1466 = arg1;
		arg1.field1464 = arg0;
	}
}
