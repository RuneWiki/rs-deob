package deob;

@ObfuscatedName("YCPCXCIN")
public final class YCPCXCIN {

	@ObfuscatedName("YCPCXCIN.b")
	public int field1455;

	@ObfuscatedName("YCPCXCIN.c")
	public DLMMHADP[] field1456;

	public YCPCXCIN(int arg0) {
		field1455 = arg0;
		field1456 = new DLMMHADP[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			DLMMHADP var3 = field1456[var2] = new DLMMHADP();
			var3.field643 = var3;
			var3.field644 = var3;
		}
	}

	@ObfuscatedName("YCPCXCIN.a(J)LDLMMHADP;")
	public DLMMHADP method578(long arg0) {
		DLMMHADP var3 = field1456[(int) (arg0 & field1455 - 1)];
		for (DLMMHADP var4 = var3.field643; var4 != var3; var4 = var4.field643) {
			if (var4.field642 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("YCPCXCIN.a(LDLMMHADP;JB)V")
	public void method579(DLMMHADP arg0, long arg1) {
		if (arg0.field644 != null) {
			arg0.method234();
		}

		DLMMHADP var4 = field1456[(int) (arg1 & field1455 - 1)];
		arg0.field644 = var4.field644;
		arg0.field643 = var4;
		arg0.field644.field643 = arg0;
		arg0.field643.field644 = arg0;
		arg0.field642 = arg1;
	}
}
