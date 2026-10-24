package deob;

@ObfuscatedName("EQSIBNHW")
public final class EQSIBNHW {

	@ObfuscatedName("EQSIBNHW.e")
	public APQXVAYL field549 = new APQXVAYL();

	@ObfuscatedName("EQSIBNHW.i")
	public LKYWDMZN field553 = new LKYWDMZN();

	@ObfuscatedName("EQSIBNHW.f")
	public int field550;

	@ObfuscatedName("EQSIBNHW.g")
	public int field551;

	@ObfuscatedName("EQSIBNHW.h")
	public OWFJUUFC field552;

	@ObfuscatedName("EQSIBNHW.c")
	public int field547;

	@ObfuscatedName("EQSIBNHW.d")
	public int field548;

	public EQSIBNHW(int arg0) {
		field550 = arg0;
		field551 = arg0;
		field552 = new OWFJUUFC(1024);
	}

	@ObfuscatedName("EQSIBNHW.a(J)LAPQXVAYL;")
	public APQXVAYL method175(long arg0) {
		APQXVAYL var3 = (APQXVAYL) field552.method378(arg0);
		if (var3 == null) {
			field547++;
		} else {
			field553.method326(var3);
			field548++;
		}

		return var3;
	}

	@ObfuscatedName("EQSIBNHW.a(IJLAPQXVAYL;)V")
	public void method176(long arg0, APQXVAYL arg1) {
		if (field551 == 0) {
			APQXVAYL var4 = field553.method327();
			var4.method331();
			var4.method4();

			if (field549 == var4) {
				APQXVAYL var5 = field553.method327();
				var5.method331();
				var5.method4();
			}
		} else {
			field551--;
		}

		field552.method379(arg0, arg1);
		field553.method326(arg1);
	}

	@ObfuscatedName("EQSIBNHW.a()V")
	public void method177() {
		while (true) {
			APQXVAYL var1 = field553.method327();
			if (var1 == null) {
				field551 = field550;
				return;
			}

			var1.method331();
			var1.method4();
		}
	}
}
