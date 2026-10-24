package deob;

@ObfuscatedName("KHIOJPOB")
public final class KHIOJPOB {

	@ObfuscatedName("KHIOJPOB.c")
	public FFAASUKE field879 = new FFAASUKE();

	@ObfuscatedName("KHIOJPOB.d")
	public FFAASUKE field880;

	public KHIOJPOB() {
		field879.field616 = field879;
		field879.field617 = field879;
	}

	@ObfuscatedName("KHIOJPOB.a(LFFAASUKE;)V")
	public void method331(FFAASUKE arg0) {
		if (arg0.field617 != null) {
			arg0.method300();
		}

		arg0.field617 = field879.field617;
		arg0.field616 = field879;
		arg0.field617.field616 = arg0;
		arg0.field616.field617 = arg0;
	}

	@ObfuscatedName("KHIOJPOB.a()LFFAASUKE;")
	public FFAASUKE method332() {
		FFAASUKE var1 = field879.field616;
		if (field879 == var1) {
			return null;
		} else {
			var1.method300();
			return var1;
		}
	}

	@ObfuscatedName("KHIOJPOB.b()LFFAASUKE;")
	public FFAASUKE method333() {
		FFAASUKE var1 = field879.field616;
		if (field879 == var1) {
			field880 = null;
			return null;
		} else {
			field880 = var1.field616;
			return var1;
		}
	}

	@ObfuscatedName("KHIOJPOB.a(I)LFFAASUKE;")
	public FFAASUKE method334() {
		FFAASUKE var1 = field880;
		if (field879 == var1) {
			field880 = null;
			return null;
		} else {
			field880 = var1.field616;
			return var1;
		}
	}

	@ObfuscatedName("KHIOJPOB.c()I")
	public int method335() {
		int var1 = 0;
		for (FFAASUKE var2 = field879.field616; var2 != field879; var2 = var2.field616) {
			var1++;
		}

		return var1;
	}
}
