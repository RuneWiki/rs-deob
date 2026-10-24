package deob;

@ObfuscatedName("SOYNUDRE")
public final class SOYNUDRE {

	@ObfuscatedName("SOYNUDRE.c")
	public int field1106;

	@ObfuscatedName("SOYNUDRE.d")
	public BRISMNPP[] field1107;

	public SOYNUDRE(int arg0) {
		field1106 = arg0;
		field1107 = new BRISMNPP[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			BRISMNPP var3 = field1107[var2] = new BRISMNPP();
			var3.field100 = var3;
			var3.field101 = var3;
		}
	}

	@ObfuscatedName("SOYNUDRE.a(J)LBRISMNPP;")
	public BRISMNPP method440(long arg0) {
		BRISMNPP var3 = field1107[(int) (arg0 & field1106 - 1)];
		for (BRISMNPP var4 = var3.field100; var4 != var3; var4 = var4.field100) {
			if (var4.field99 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("SOYNUDRE.a(ZLBRISMNPP;J)V")
	public void method441(BRISMNPP arg0, long arg1) {
		if (arg0.field101 != null) {
			arg0.method20();
		}

		BRISMNPP var4 = field1107[(int) (arg1 & field1106 - 1)];
		arg0.field101 = var4.field101;
		arg0.field100 = var4;
		arg0.field101.field100 = arg0;
		arg0.field100.field101 = arg0;
		arg0.field99 = arg1;
	}
}
