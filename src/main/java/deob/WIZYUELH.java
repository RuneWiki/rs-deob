package deob;

@ObfuscatedName("WIZYUELH")
public final class WIZYUELH {

	@ObfuscatedName("WIZYUELH.b")
	public int field1274;

	@ObfuscatedName("WIZYUELH.c")
	public CSUKQTYW[] field1275;

	public WIZYUELH(int arg0) {
		field1274 = arg0;
		field1275 = new CSUKQTYW[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			CSUKQTYW var3 = field1275[var2] = new CSUKQTYW();
			var3.field537 = var3;
			var3.field538 = var3;
		}
	}

	@ObfuscatedName("WIZYUELH.a(J)LCSUKQTYW;")
	public CSUKQTYW method523(long arg0) {
		CSUKQTYW var3 = field1275[(int) (arg0 & field1274 - 1)];
		for (CSUKQTYW var4 = var3.field537; var4 != var3; var4 = var4.field537) {
			if (var4.field536 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("WIZYUELH.a(LCSUKQTYW;JI)V")
	public void method524(CSUKQTYW arg0, long arg1) {
		if (arg0.field538 != null) {
			arg0.method221();
		}

		CSUKQTYW var4 = field1275[(int) (arg1 & field1274 - 1)];
		arg0.field538 = var4.field538;
		arg0.field537 = var4;
		arg0.field538.field537 = arg0;
		arg0.field537.field538 = arg0;
		arg0.field536 = arg1;
	}
}
