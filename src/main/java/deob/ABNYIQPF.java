package deob;

@ObfuscatedName("ABNYIQPF")
public final class ABNYIQPF {

	@ObfuscatedName("ABNYIQPF.c")
	public IOXDUYYH field4 = new IOXDUYYH();

	@ObfuscatedName("ABNYIQPF.d")
	public IOXDUYYH field5;

	public ABNYIQPF() {
		field4.field759 = field4;
		field4.field760 = field4;
	}

	@ObfuscatedName("ABNYIQPF.a(LIOXDUYYH;)V")
	public void method2(IOXDUYYH arg0) {
		if (arg0.field760 != null) {
			arg0.method304();
		}

		arg0.field760 = field4.field760;
		arg0.field759 = field4;
		arg0.field760.field759 = arg0;
		arg0.field759.field760 = arg0;
	}

	@ObfuscatedName("ABNYIQPF.a()LIOXDUYYH;")
	public IOXDUYYH method3() {
		IOXDUYYH var1 = field4.field759;
		if (field4 == var1) {
			return null;
		} else {
			var1.method304();
			return var1;
		}
	}

	@ObfuscatedName("ABNYIQPF.b()LIOXDUYYH;")
	public IOXDUYYH method4() {
		IOXDUYYH var1 = field4.field759;
		if (field4 == var1) {
			field5 = null;
			return null;
		} else {
			field5 = var1.field759;
			return var1;
		}
	}

	@ObfuscatedName("ABNYIQPF.a(Z)LIOXDUYYH;")
	public IOXDUYYH method5() {
		IOXDUYYH var1 = field5;
		if (field4 == var1) {
			field5 = null;
			return null;
		} else {
			field5 = var1.field759;
			return var1;
		}
	}

	@ObfuscatedName("ABNYIQPF.c()I")
	public int method6() {
		int var1 = 0;
		for (IOXDUYYH var2 = field4.field759; var2 != field4; var2 = var2.field759) {
			var1++;
		}

		return var1;
	}
}
