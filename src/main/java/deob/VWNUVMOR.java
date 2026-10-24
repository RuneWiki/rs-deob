package deob;

@ObfuscatedName("VWNUVMOR")
public final class VWNUVMOR {

	@ObfuscatedName("VWNUVMOR.b")
	public int field1314;

	@ObfuscatedName("VWNUVMOR.c")
	public JZLLDEPM[] field1315;

	public VWNUVMOR(int arg0) {
		field1314 = arg0;
		field1315 = new JZLLDEPM[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			JZLLDEPM var3 = field1315[var2] = new JZLLDEPM();
			var3.field875 = var3;
			var3.field876 = var3;
		}
	}

	@ObfuscatedName("VWNUVMOR.a(J)LJZLLDEPM;")
	public JZLLDEPM method527(long arg0) {
		JZLLDEPM var3 = field1315[(int) (arg0 & field1314 - 1)];
		for (JZLLDEPM var4 = var3.field875; var4 != var3; var4 = var4.field875) {
			if (var4.field874 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("VWNUVMOR.a(ZLJZLLDEPM;J)V")
	public void method528(JZLLDEPM arg0, long arg1) {
		if (arg0.field876 != null) {
			arg0.method329();
		}

		JZLLDEPM var4 = field1315[(int) (arg1 & field1314 - 1)];
		arg0.field876 = var4.field876;
		arg0.field875 = var4;
		arg0.field876.field875 = arg0;
		arg0.field875.field876 = arg0;
		arg0.field874 = arg1;
	}
}
