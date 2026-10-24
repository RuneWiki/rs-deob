package deob;

@ObfuscatedName("FLJWGVEY")
public final class FLJWGVEY {

	@ObfuscatedName("FLJWGVEY.b")
	public JJVWTXNE field704 = new JJVWTXNE();

	@ObfuscatedName("FLJWGVEY.c")
	public JJVWTXNE field705;

	public FLJWGVEY() {
		field704.field865 = field704;
		field704.field866 = field704;
	}

	@ObfuscatedName("FLJWGVEY.a(LJJVWTXNE;)V")
	public void method272(JJVWTXNE arg0) {
		if (arg0.field866 != null) {
			arg0.method334();
		}

		arg0.field866 = field704.field866;
		arg0.field865 = field704;
		arg0.field866.field865 = arg0;
		arg0.field865.field866 = arg0;
	}

	@ObfuscatedName("FLJWGVEY.a(ILJJVWTXNE;)V")
	public void method273(JJVWTXNE arg0) {
		if (arg0.field866 != null) {
			arg0.method334();
		}

		arg0.field866 = field704;
		arg0.field865 = field704.field865;
		arg0.field866.field865 = arg0;
		arg0.field865.field866 = arg0;
	}

	@ObfuscatedName("FLJWGVEY.a()LJJVWTXNE;")
	public JJVWTXNE method274() {
		JJVWTXNE var1 = field704.field865;
		if (field704 == var1) {
			return null;
		} else {
			var1.method334();
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.b()LJJVWTXNE;")
	public JJVWTXNE method275() {
		JJVWTXNE var1 = field704.field865;
		if (field704 == var1) {
			field705 = null;
			return null;
		} else {
			field705 = var1.field865;
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.a(I)LJJVWTXNE;")
	public JJVWTXNE method276() {
		JJVWTXNE var1 = field704.field866;
		if (field704 == var1) {
			field705 = null;
			return null;
		} else {
			field705 = var1.field866;
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.b(I)LJJVWTXNE;")
	public JJVWTXNE method277() {
		JJVWTXNE var1 = field705;
		if (field704 == var1) {
			field705 = null;
			return null;
		} else {
			field705 = var1.field865;
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.a(B)LJJVWTXNE;")
	public JJVWTXNE method278() {
		JJVWTXNE var1 = field705;
		if (field704 == var1) {
			field705 = null;
			return null;
		} else {
			field705 = var1.field866;
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.c()V")
	public void method279() {
		if (field704.field865 != field704) {
			while (true) {
				JJVWTXNE var1 = field704.field865;
				if (field704 == var1) {
					return;
				}

				var1.method334();
			}
		}
	}
}
