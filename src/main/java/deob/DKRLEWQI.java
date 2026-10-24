package deob;

@ObfuscatedName("DKRLEWQI")
public final class DKRLEWQI {

	@ObfuscatedName("DKRLEWQI.d")
	public int field556;

	@ObfuscatedName("DKRLEWQI.e")
	public OZVKRYKO[] field557;

	public DKRLEWQI(int arg0) {
		field556 = arg0;
		field557 = new OZVKRYKO[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			OZVKRYKO var3 = field557[var2] = new OZVKRYKO();
			var3.field1054 = var3;
			var3.field1055 = var3;
		}
	}

	@ObfuscatedName("DKRLEWQI.a(J)LOZVKRYKO;")
	public OZVKRYKO method168(long arg0) {
		OZVKRYKO var3 = field557[(int) (arg0 & field556 - 1)];
		for (OZVKRYKO var4 = var3.field1054; var4 != var3; var4 = var4.field1054) {
			if (var4.field1053 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("DKRLEWQI.a(IJLOZVKRYKO;)V")
	public void method169(long arg0, OZVKRYKO arg1) {
		if (arg1.field1055 != null) {
			arg1.method396();
		}

		OZVKRYKO var4 = field557[(int) (arg0 & field556 - 1)];
		arg1.field1055 = var4.field1055;
		arg1.field1054 = var4;
		arg1.field1055.field1054 = arg1;
		arg1.field1054.field1055 = arg1;
		arg1.field1053 = arg0;
	}
}
