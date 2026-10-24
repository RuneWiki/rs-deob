package deob;

@ObfuscatedName("RXQASTJV")
public final class RXQASTJV {

	@ObfuscatedName("RXQASTJV.a")
	public int field1088;

	@ObfuscatedName("RXQASTJV.b")
	public DJXGSHIT[] field1089;

	public RXQASTJV(int arg0) {
		field1088 = arg0;
		field1089 = new DJXGSHIT[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			DJXGSHIT var3 = field1089[var2] = new DJXGSHIT();
			var3.field475 = var3;
			var3.field476 = var3;
		}
	}

	@ObfuscatedName("RXQASTJV.a(J)LDJXGSHIT;")
	public DJXGSHIT method508(long arg0) {
		DJXGSHIT var3 = field1089[(int) (arg0 & field1088 - 1)];
		for (DJXGSHIT var4 = var3.field475; var4 != var3; var4 = var4.field475) {
			if (var4.field474 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("RXQASTJV.a(ILDJXGSHIT;J)V")
	public void method509(DJXGSHIT arg0, long arg1) {
		if (arg0.field476 != null) {
			arg0.method156();
		}

		DJXGSHIT var4 = field1089[(int) (arg1 & field1088 - 1)];
		arg0.field476 = var4.field476;
		arg0.field475 = var4;
		arg0.field476.field475 = arg0;
		arg0.field475.field476 = arg0;
		arg0.field474 = arg1;
	}
}
