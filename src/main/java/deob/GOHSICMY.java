package deob;

@ObfuscatedName("GOHSICMY")
public final class GOHSICMY extends XBYIDFVN {

	@ObfuscatedName("GOHSICMY.l")
	public boolean field676 = false;

	@ObfuscatedName("GOHSICMY.m")
	public MBSSGBHW field677;

	@ObfuscatedName("GOHSICMY.n")
	public int field678;

	@ObfuscatedName("GOHSICMY.o")
	public int field679;

	@ObfuscatedName("GOHSICMY.p")
	public int field680;

	@ObfuscatedName("GOHSICMY.q")
	public int field681;

	@ObfuscatedName("GOHSICMY.t")
	public int field684;

	@ObfuscatedName("GOHSICMY.r")
	public int field682;

	@ObfuscatedName("GOHSICMY.s")
	public int field683;

	@ObfuscatedName("GOHSICMY.a(II)V")
	public final void method221(int arg0) {
		field683 += arg0;
		while (field683 > field677.field931.method308(field682)) {
			field683 -= field677.field931.method308(field682) + 1;
			field682++;
			if (field682 >= field677.field931.field842 && (field682 < 0 || field682 >= field677.field931.field842)) {
				field682 = 0;
				field676 = true;
			}
		}
	}

	public GOHSICMY(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field677 = MBSSGBHW.field927[arg1];
		field678 = arg0;
		field679 = arg4;
		field680 = arg3;
		field681 = arg6;
		field684 = arg2 + arg5;
		field676 = false;
	}

	@ObfuscatedName("GOHSICMY.a(B)LPDVZPZLT;")
	public final PDVZPZLT method3() {
		PDVZPZLT var1 = field677.method343();
		if (var1 == null) {
			return null;
		}

		int var2 = field677.field931.field843[field682];
		PDVZPZLT var3 = new PDVZPZLT(var1, true, YPRWORMV.method602(var2), false);
		if (!field676) {
			var3.method421();
			var3.method422(var2);
			var3.field1166 = null;
			var3.field1165 = null;
		}

		if (field677.field934 != 128 || field677.field935 != 128) {
			var3.method430(field677.field934, field677.field935, field677.field934);
		}

		if (field677.field936 != 0) {
			if (field677.field936 == 90) {
				var3.method425();
			}

			if (field677.field936 == 180) {
				var3.method425();
				var3.method425();
			}

			if (field677.field936 == 270) {
				var3.method425();
				var3.method425();
				var3.method425();
			}
		}

		var3.method431(field677.field937 + 64, field677.field938 + 850, -30, -50, -30, true);
		return var3;
	}
}
