package deob;

@ObfuscatedName("EOXICPMP")
public final class EOXICPMP {

	@ObfuscatedName("EOXICPMP.c")
	public EEYSIGWL field569 = new EEYSIGWL();

	@ObfuscatedName("EOXICPMP.d")
	public EEYSIGWL field570;

	public EOXICPMP() {
		field569.field564 = field569;
		field569.field565 = field569;
	}

	@ObfuscatedName("EOXICPMP.a(LEEYSIGWL;)V")
	public void method219(EEYSIGWL arg0) {
		if (arg0.field565 != null) {
			arg0.method215();
		}

		arg0.field565 = field569.field565;
		arg0.field564 = field569;
		arg0.field565.field564 = arg0;
		arg0.field564.field565 = arg0;
	}

	@ObfuscatedName("EOXICPMP.a()LEEYSIGWL;")
	public EEYSIGWL method220() {
		EEYSIGWL var1 = field569.field564;
		if (field569 == var1) {
			return null;
		} else {
			var1.method215();
			return var1;
		}
	}

	@ObfuscatedName("EOXICPMP.b()LEEYSIGWL;")
	public EEYSIGWL method221() {
		EEYSIGWL var1 = field569.field564;
		if (field569 == var1) {
			field570 = null;
			return null;
		} else {
			field570 = var1.field564;
			return var1;
		}
	}

	@ObfuscatedName("EOXICPMP.a(I)LEEYSIGWL;")
	public EEYSIGWL method222() {
		EEYSIGWL var1 = field570;
		if (field569 == var1) {
			field570 = null;
			return null;
		} else {
			field570 = var1.field564;
			return var1;
		}
	}

	@ObfuscatedName("EOXICPMP.c()I")
	public int method223() {
		int var1 = 0;
		for (EEYSIGWL var2 = field569.field564; var2 != field569; var2 = var2.field564) {
			var1++;
		}

		return var1;
	}
}
