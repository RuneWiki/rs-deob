package deob;

@ObfuscatedName("LKYWDMZN")
public final class LKYWDMZN {

	@ObfuscatedName("LKYWDMZN.c")
	public APQXVAYL field876 = new APQXVAYL();

	@ObfuscatedName("LKYWDMZN.d")
	public APQXVAYL field877;

	public LKYWDMZN() {
		field876.field25 = field876;
		field876.field26 = field876;
	}

	@ObfuscatedName("LKYWDMZN.a(LAPQXVAYL;)V")
	public void method326(APQXVAYL arg0) {
		if (arg0.field26 != null) {
			arg0.method4();
		}

		arg0.field26 = field876.field26;
		arg0.field25 = field876;
		arg0.field26.field25 = arg0;
		arg0.field25.field26 = arg0;
	}

	@ObfuscatedName("LKYWDMZN.a()LAPQXVAYL;")
	public APQXVAYL method327() {
		APQXVAYL var1 = field876.field25;
		if (field876 == var1) {
			return null;
		} else {
			var1.method4();
			return var1;
		}
	}

	@ObfuscatedName("LKYWDMZN.b()LAPQXVAYL;")
	public APQXVAYL method328() {
		APQXVAYL var1 = field876.field25;
		if (field876 == var1) {
			field877 = null;
			return null;
		} else {
			field877 = var1.field25;
			return var1;
		}
	}

	@ObfuscatedName("LKYWDMZN.a(B)LAPQXVAYL;")
	public APQXVAYL method329() {
		APQXVAYL var1 = field877;
		if (field876 == var1) {
			field877 = null;
			return null;
		} else {
			field877 = var1.field25;
			return var1;
		}
	}

	@ObfuscatedName("LKYWDMZN.c()I")
	public int method330() {
		int var1 = 0;
		for (APQXVAYL var2 = field876.field25; var2 != field876; var2 = var2.field25) {
			var1++;
		}

		return var1;
	}
}
