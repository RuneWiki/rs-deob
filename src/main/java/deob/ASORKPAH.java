package deob;

@ObfuscatedName("ASORKPAH")
public final class ASORKPAH {

	@ObfuscatedName("ASORKPAH.g")
	public FRLKXEIS field26 = new FRLKXEIS();

	@ObfuscatedName("ASORKPAH.k")
	public HASAJOKP field30 = new HASAJOKP();

	@ObfuscatedName("ASORKPAH.h")
	public int field27;

	@ObfuscatedName("ASORKPAH.i")
	public int field28;

	@ObfuscatedName("ASORKPAH.j")
	public LLGCDMZG field29;

	@ObfuscatedName("ASORKPAH.e")
	public int field24;

	@ObfuscatedName("ASORKPAH.f")
	public int field25;

	public ASORKPAH(int arg0) {
		field27 = arg0;
		field28 = arg0;
		field29 = new LLGCDMZG(1024);
	}

	@ObfuscatedName("ASORKPAH.a(J)LFRLKXEIS;")
	public FRLKXEIS method1(long arg0) {
		FRLKXEIS var3 = (FRLKXEIS) field29.method447(arg0);
		if (var3 == null) {
			field24++;
		} else {
			field30.method370(var3);
			field25++;
		}

		return var3;
	}

	@ObfuscatedName("ASORKPAH.a(IJLFRLKXEIS;)V")
	public void method2(long arg0, FRLKXEIS arg1) {
		if (field28 == 0) {
			FRLKXEIS var4 = field30.method371();
			var4.method450();
			var4.method292();

			if (field26 == var4) {
				FRLKXEIS var5 = field30.method371();
				var5.method450();
				var5.method292();
			}
		} else {
			field28--;
		}

		field29.method448(arg1, arg0);
		field30.method370(arg1);
	}

	@ObfuscatedName("ASORKPAH.a()V")
	public void method3() {
		while (true) {
			FRLKXEIS var1 = field30.method371();
			if (var1 == null) {
				field28 = field27;
				return;
			}

			var1.method450();
			var1.method292();
		}
	}
}
