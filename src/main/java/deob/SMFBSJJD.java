package deob;

@ObfuscatedName("SMFBSJJD")
public final class SMFBSJJD {

	@ObfuscatedName("SMFBSJJD.c")
	public int field1374;

	@ObfuscatedName("SMFBSJJD.d")
	public SSWDZUWQ[] field1375;

	public SMFBSJJD(int arg0) {
		field1374 = arg0;
		field1375 = new SSWDZUWQ[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			SSWDZUWQ var3 = field1375[var2] = new SSWDZUWQ();
			var3.field1377 = var3;
			var3.field1378 = var3;
		}
	}

	@ObfuscatedName("SMFBSJJD.a(J)LSSWDZUWQ;")
	public SSWDZUWQ method503(long arg0) {
		SSWDZUWQ var3 = field1375[(int) (arg0 & field1374 - 1)];
		for (SSWDZUWQ var4 = var3.field1377; var4 != var3; var4 = var4.field1377) {
			if (var4.field1376 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("SMFBSJJD.a(JLSSWDZUWQ;Z)V")
	public void method504(long arg0, SSWDZUWQ arg1) {
		if (arg1.field1378 != null) {
			arg1.method505();
		}

		SSWDZUWQ var4 = field1375[(int) (arg0 & field1374 - 1)];
		arg1.field1378 = var4.field1378;
		arg1.field1377 = var4;
		arg1.field1378.field1377 = arg1;
		arg1.field1377.field1378 = arg1;
		arg1.field1376 = arg0;
	}
}
