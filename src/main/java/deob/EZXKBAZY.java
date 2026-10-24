package deob;

@ObfuscatedName("EZXKBAZY")
public final class EZXKBAZY {

	@ObfuscatedName("EZXKBAZY.c")
	public BRISMNPP field636 = new BRISMNPP();

	@ObfuscatedName("EZXKBAZY.d")
	public BRISMNPP field637;

	public EZXKBAZY() {
		field636.field100 = field636;
		field636.field101 = field636;
	}

	@ObfuscatedName("EZXKBAZY.a(LBRISMNPP;)V")
	public void method203(BRISMNPP arg0) {
		if (arg0.field101 != null) {
			arg0.method20();
		}

		arg0.field101 = field636.field101;
		arg0.field100 = field636;
		arg0.field101.field100 = arg0;
		arg0.field100.field101 = arg0;
	}

	@ObfuscatedName("EZXKBAZY.a(ILBRISMNPP;)V")
	public void method204(BRISMNPP arg0) {
		if (arg0.field101 != null) {
			arg0.method20();
		}

		arg0.field101 = field636;
		arg0.field100 = field636.field100;
		arg0.field101.field100 = arg0;
		arg0.field100.field101 = arg0;
	}

	@ObfuscatedName("EZXKBAZY.a()LBRISMNPP;")
	public BRISMNPP method205() {
		BRISMNPP var1 = field636.field100;
		if (field636 == var1) {
			return null;
		} else {
			var1.method20();
			return var1;
		}
	}

	@ObfuscatedName("EZXKBAZY.b()LBRISMNPP;")
	public BRISMNPP method206() {
		BRISMNPP var1 = field636.field100;
		if (field636 == var1) {
			field637 = null;
			return null;
		} else {
			field637 = var1.field100;
			return var1;
		}
	}

	@ObfuscatedName("EZXKBAZY.a(Z)LBRISMNPP;")
	public BRISMNPP method207() {
		BRISMNPP var1 = field636.field101;
		if (field636 == var1) {
			field637 = null;
			return null;
		} else {
			field637 = var1.field101;
			return var1;
		}
	}

	@ObfuscatedName("EZXKBAZY.a(I)LBRISMNPP;")
	public BRISMNPP method208() {
		BRISMNPP var1 = field637;
		if (field636 == var1) {
			field637 = null;
			return null;
		} else {
			field637 = var1.field100;
			return var1;
		}
	}

	@ObfuscatedName("EZXKBAZY.b(Z)LBRISMNPP;")
	public BRISMNPP method209() {
		BRISMNPP var1 = field637;
		if (field636 == var1) {
			field637 = null;
			return null;
		} else {
			field637 = var1.field101;
			return var1;
		}
	}

	@ObfuscatedName("EZXKBAZY.c()V")
	public void method210() {
		if (field636.field100 != field636) {
			while (true) {
				BRISMNPP var1 = field636.field100;
				if (field636 == var1) {
					return;
				}

				var1.method20();
			}
		}
	}
}
