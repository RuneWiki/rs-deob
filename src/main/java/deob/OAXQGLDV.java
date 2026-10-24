package deob;

@ObfuscatedName("OAXQGLDV")
public final class OAXQGLDV {

	@ObfuscatedName("OAXQGLDV.e")
	public int field961;

	@ObfuscatedName("OAXQGLDV.f")
	public OKDOXVFL[] field962;

	public OAXQGLDV(int arg0) {
		field961 = arg0;
		field962 = new OKDOXVFL[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			OKDOXVFL var3 = field962[var2] = new OKDOXVFL();
			var3.field1029 = var3;
			var3.field1030 = var3;
		}
	}

	@ObfuscatedName("OAXQGLDV.a(J)LOKDOXVFL;")
	public OKDOXVFL method339(long arg0) {
		OKDOXVFL var3 = field962[(int) (arg0 & field961 - 1)];
		for (OKDOXVFL var4 = var3.field1029; var4 != var3; var4 = var4.field1029) {
			if (var4.field1028 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("OAXQGLDV.a(JLOKDOXVFL;I)V")
	public void method340(long arg0, OKDOXVFL arg1) {
		if (arg1.field1030 != null) {
			arg1.method398();
		}

		OKDOXVFL var4 = field962[(int) (arg0 & field961 - 1)];
		arg1.field1030 = var4.field1030;
		arg1.field1029 = var4;
		arg1.field1030.field1029 = arg1;
		arg1.field1029.field1030 = arg1;
		arg1.field1028 = arg0;
	}
}
