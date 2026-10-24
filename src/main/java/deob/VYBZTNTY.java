package deob;

@ObfuscatedName("VYBZTNTY")
public final class VYBZTNTY {

	@ObfuscatedName("VYBZTNTY.e")
	public CDEGFOQA field1336 = new CDEGFOQA();

	@ObfuscatedName("VYBZTNTY.f")
	public CDEGFOQA field1337;

	public VYBZTNTY() {
		field1336.field48 = field1336;
		field1336.field49 = field1336;
	}

	@ObfuscatedName("VYBZTNTY.a(LCDEGFOQA;)V")
	public void method516(CDEGFOQA arg0) {
		if (arg0.field49 != null) {
			arg0.method19();
		}

		arg0.field49 = field1336.field49;
		arg0.field48 = field1336;
		arg0.field49.field48 = arg0;
		arg0.field48.field49 = arg0;
	}

	@ObfuscatedName("VYBZTNTY.a(LCDEGFOQA;B)V")
	public void method517(CDEGFOQA arg0) {
		if (arg0.field49 != null) {
			arg0.method19();
		}

		arg0.field49 = field1336;
		arg0.field48 = field1336.field48;
		arg0.field49.field48 = arg0;
		arg0.field48.field49 = arg0;
	}

	@ObfuscatedName("VYBZTNTY.a()LCDEGFOQA;")
	public CDEGFOQA method518() {
		CDEGFOQA var1 = field1336.field48;
		if (field1336 == var1) {
			return null;
		} else {
			var1.method19();
			return var1;
		}
	}

	@ObfuscatedName("VYBZTNTY.b()LCDEGFOQA;")
	public CDEGFOQA method519() {
		CDEGFOQA var1 = field1336.field48;
		if (field1336 == var1) {
			field1337 = null;
			return null;
		} else {
			field1337 = var1.field48;
			return var1;
		}
	}

	@ObfuscatedName("VYBZTNTY.a(I)LCDEGFOQA;")
	public CDEGFOQA method520() {
		CDEGFOQA var1 = field1336.field49;
		if (field1336 == var1) {
			field1337 = null;
			return null;
		} else {
			field1337 = var1.field49;
			return var1;
		}
	}

	@ObfuscatedName("VYBZTNTY.b(I)LCDEGFOQA;")
	public CDEGFOQA method521() {
		CDEGFOQA var1 = field1337;
		if (field1336 == var1) {
			field1337 = null;
			return null;
		} else {
			field1337 = var1.field48;
			return var1;
		}
	}

	@ObfuscatedName("VYBZTNTY.a(B)LCDEGFOQA;")
	public CDEGFOQA method522() {
		CDEGFOQA var1 = field1337;
		if (field1336 == var1) {
			field1337 = null;
			return null;
		} else {
			field1337 = var1.field49;
			return var1;
		}
	}

	@ObfuscatedName("VYBZTNTY.c()V")
	public void method523() {
		if (field1336.field48 != field1336) {
			while (true) {
				CDEGFOQA var1 = field1336.field48;
				if (field1336 == var1) {
					return;
				}

				var1.method19();
			}
		}
	}
}
