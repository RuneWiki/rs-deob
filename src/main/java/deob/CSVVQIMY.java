package deob;

@ObfuscatedName("CSVVQIMY")
public final class CSVVQIMY extends UPHLHIWQ {

	@ObfuscatedName("CSVVQIMY.p")
	public boolean field562 = false;

	@ObfuscatedName("CSVVQIMY.u")
	public HTWOTIWO field566;

	@ObfuscatedName("CSVVQIMY.l")
	public int field558;

	@ObfuscatedName("CSVVQIMY.m")
	public int field559;

	@ObfuscatedName("CSVVQIMY.n")
	public int field560;

	@ObfuscatedName("CSVVQIMY.o")
	public int field561;

	@ObfuscatedName("CSVVQIMY.s")
	public int field565;

	@ObfuscatedName("CSVVQIMY.q")
	public int field563;

	@ObfuscatedName("CSVVQIMY.r")
	public int field564;

	@ObfuscatedName("CSVVQIMY.a(IB)V")
	public final void method195(int arg0) {
		field564 += arg0;
		while (field564 > field566.field782.method215(field563)) {
			field564 -= field566.field782.method215(field563) + 1;
			field563++;
			if (field563 >= field566.field782.field587 && (field563 < 0 || field563 >= field566.field782.field587)) {
				field563 = 0;
				field562 = true;
			}
		}
	}

	public CSVVQIMY(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field566 = HTWOTIWO.field778[arg1];
		field558 = arg6;
		field559 = arg5;
		field560 = arg2;
		field561 = arg3;
		field565 = arg0 + arg4;
		field562 = false;
	}

	@ObfuscatedName("CSVVQIMY.a(I)LPSGMMDJS;")
	public final PSGMMDJS method196() {
		PSGMMDJS var1 = field566.method251();
		if (var1 == null) {
			return null;
		}

		int var2 = field566.field782.field588[field563];
		PSGMMDJS var3 = new PSGMMDJS(var1, AOFTXYIM.method5(var2), true, false);
		if (!field562) {
			var3.method417();
			var3.method418(var2);
			var3.field1028 = null;
			var3.field1027 = null;
		}

		if (field566.field785 != 128 || field566.field786 != 128) {
			var3.method426(field566.field786, field566.field785, field566.field785);
		}

		if (field566.field787 != 0) {
			if (field566.field787 == 90) {
				var3.method421();
			}

			if (field566.field787 == 180) {
				var3.method421();
				var3.method421();
			}

			if (field566.field787 == 270) {
				var3.method421();
				var3.method421();
				var3.method421();
			}
		}

		var3.method427(field566.field788 + 64, field566.field789 + 850, -30, -50, -30, true);
		return var3;
	}
}
