package deob;

@ObfuscatedName("LSQNLJTA")
public final class LSQNLJTA {

	@ObfuscatedName("LSQNLJTA.f")
	public UXRJCYSS field923 = new UXRJCYSS();

	@ObfuscatedName("LSQNLJTA.j")
	public BGEXEDZG field927 = new BGEXEDZG();

	@ObfuscatedName("LSQNLJTA.g")
	public int field924;

	@ObfuscatedName("LSQNLJTA.h")
	public int field925;

	@ObfuscatedName("LSQNLJTA.i")
	public LJCRDSKE field926;

	@ObfuscatedName("LSQNLJTA.d")
	public int field921;

	@ObfuscatedName("LSQNLJTA.e")
	public int field922;

	public LSQNLJTA(int arg0) {
		field924 = arg0;
		field925 = arg0;
		field926 = new LJCRDSKE(1024);
	}

	@ObfuscatedName("LSQNLJTA.a(J)LUXRJCYSS;")
	public UXRJCYSS method369(long arg0) {
		UXRJCYSS var3 = (UXRJCYSS) field926.method366(arg0);
		if (var3 == null) {
			field921++;
		} else {
			field927.method4(var3);
			field922++;
		}

		return var3;
	}

	@ObfuscatedName("LSQNLJTA.a(LUXRJCYSS;IJ)V")
	public void method370(UXRJCYSS arg0, long arg1) {
		if (field925 == 0) {
			UXRJCYSS var4 = field927.method5();
			var4.method582();
			var4.method564();

			if (field923 == var4) {
				UXRJCYSS var5 = field927.method5();
				var5.method582();
				var5.method564();
			}
		} else {
			field925--;
		}

		field926.method367(arg0, arg1);
		field927.method4(arg0);
	}

	@ObfuscatedName("LSQNLJTA.a()V")
	public void method371() {
		while (true) {
			UXRJCYSS var1 = field927.method5();
			if (var1 == null) {
				field925 = field924;
				return;
			}

			var1.method582();
			var1.method564();
		}
	}
}
