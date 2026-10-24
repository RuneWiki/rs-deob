package deob;

@ObfuscatedName("NYZQPNXB")
public final class NYZQPNXB {

	@ObfuscatedName("NYZQPNXB.e")
	public BEBSUZBY field1082 = new BEBSUZBY();

	@ObfuscatedName("NYZQPNXB.f")
	public BEBSUZBY field1083;

	public NYZQPNXB() {
		field1082.field124 = field1082;
		field1082.field125 = field1082;
	}

	@ObfuscatedName("NYZQPNXB.a(LBEBSUZBY;)V")
	public void method337(BEBSUZBY arg0) {
		if (arg0.field125 != null) {
			arg0.method41();
		}

		arg0.field125 = field1082.field125;
		arg0.field124 = field1082;
		arg0.field125.field124 = arg0;
		arg0.field124.field125 = arg0;
	}

	@ObfuscatedName("NYZQPNXB.a(ILBEBSUZBY;)V")
	public void method338(BEBSUZBY arg0) {
		if (arg0.field125 != null) {
			arg0.method41();
		}

		arg0.field125 = field1082;
		arg0.field124 = field1082.field124;
		arg0.field125.field124 = arg0;
		arg0.field124.field125 = arg0;
	}

	@ObfuscatedName("NYZQPNXB.a()LBEBSUZBY;")
	public BEBSUZBY method339() {
		BEBSUZBY var1 = field1082.field124;
		if (field1082 == var1) {
			return null;
		} else {
			var1.method41();
			return var1;
		}
	}

	@ObfuscatedName("NYZQPNXB.b()LBEBSUZBY;")
	public BEBSUZBY method340() {
		BEBSUZBY var1 = field1082.field124;
		if (field1082 == var1) {
			field1083 = null;
			return null;
		} else {
			field1083 = var1.field124;
			return var1;
		}
	}

	@ObfuscatedName("NYZQPNXB.a(B)LBEBSUZBY;")
	public BEBSUZBY method341() {
		BEBSUZBY var1 = field1082.field125;
		if (field1082 == var1) {
			field1083 = null;
			return null;
		} else {
			field1083 = var1.field125;
			return var1;
		}
	}

	@ObfuscatedName("NYZQPNXB.a(I)LBEBSUZBY;")
	public BEBSUZBY method342() {
		BEBSUZBY var1 = field1083;
		if (field1082 == var1) {
			field1083 = null;
			return null;
		} else {
			field1083 = var1.field124;
			return var1;
		}
	}

	@ObfuscatedName("NYZQPNXB.b(I)LBEBSUZBY;")
	public BEBSUZBY method343() {
		BEBSUZBY var1 = field1083;
		if (field1082 == var1) {
			field1083 = null;
			return null;
		} else {
			field1083 = var1.field125;
			return var1;
		}
	}

	@ObfuscatedName("NYZQPNXB.c()V")
	public void method344() {
		if (field1082.field124 != field1082) {
			while (true) {
				BEBSUZBY var1 = field1082.field124;
				if (field1082 == var1) {
					return;
				}

				var1.method41();
			}
		}
	}
}
