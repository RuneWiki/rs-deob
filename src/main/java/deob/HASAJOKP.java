package deob;

@ObfuscatedName("HASAJOKP")
public final class HASAJOKP {

	@ObfuscatedName("HASAJOKP.c")
	public FRLKXEIS field850 = new FRLKXEIS();

	@ObfuscatedName("HASAJOKP.d")
	public FRLKXEIS field851;

	public HASAJOKP() {
		field850.field736 = field850;
		field850.field737 = field850;
	}

	@ObfuscatedName("HASAJOKP.a(LFRLKXEIS;)V")
	public void method370(FRLKXEIS arg0) {
		if (arg0.field737 != null) {
			arg0.method292();
		}

		arg0.field737 = field850.field737;
		arg0.field736 = field850;
		arg0.field737.field736 = arg0;
		arg0.field736.field737 = arg0;
	}

	@ObfuscatedName("HASAJOKP.a()LFRLKXEIS;")
	public FRLKXEIS method371() {
		FRLKXEIS var1 = field850.field736;
		if (field850 == var1) {
			return null;
		} else {
			var1.method292();
			return var1;
		}
	}

	@ObfuscatedName("HASAJOKP.b()LFRLKXEIS;")
	public FRLKXEIS method372() {
		FRLKXEIS var1 = field850.field736;
		if (field850 == var1) {
			field851 = null;
			return null;
		} else {
			field851 = var1.field736;
			return var1;
		}
	}

	@ObfuscatedName("HASAJOKP.a(I)LFRLKXEIS;")
	public FRLKXEIS method373() {
		FRLKXEIS var1 = field851;
		if (field850 == var1) {
			field851 = null;
			return null;
		} else {
			field851 = var1.field736;
			return var1;
		}
	}

	@ObfuscatedName("HASAJOKP.c()I")
	public int method374() {
		int var1 = 0;
		for (FRLKXEIS var2 = field850.field736; var2 != field850; var2 = var2.field736) {
			var1++;
		}

		return var1;
	}
}
