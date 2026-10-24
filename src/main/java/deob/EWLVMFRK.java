package deob;

@ObfuscatedName("EWLVMFRK")
public final class EWLVMFRK {

	@ObfuscatedName("EWLVMFRK.e")
	public OZVKRYKO field599 = new OZVKRYKO();

	@ObfuscatedName("EWLVMFRK.f")
	public OZVKRYKO field600;

	public EWLVMFRK() {
		field599.field1054 = field599;
		field599.field1055 = field599;
	}

	@ObfuscatedName("EWLVMFRK.a(LOZVKRYKO;)V")
	public void method198(OZVKRYKO arg0) {
		if (arg0.field1055 != null) {
			arg0.method396();
		}

		arg0.field1055 = field599.field1055;
		arg0.field1054 = field599;
		arg0.field1055.field1054 = arg0;
		arg0.field1054.field1055 = arg0;
	}

	@ObfuscatedName("EWLVMFRK.a(ILOZVKRYKO;)V")
	public void method199(OZVKRYKO arg0) {
		if (arg0.field1055 != null) {
			arg0.method396();
		}

		arg0.field1055 = field599;
		arg0.field1054 = field599.field1054;
		arg0.field1055.field1054 = arg0;
		arg0.field1054.field1055 = arg0;
	}

	@ObfuscatedName("EWLVMFRK.a()LOZVKRYKO;")
	public OZVKRYKO method200() {
		OZVKRYKO var1 = field599.field1054;
		if (field599 == var1) {
			return null;
		} else {
			var1.method396();
			return var1;
		}
	}

	@ObfuscatedName("EWLVMFRK.b()LOZVKRYKO;")
	public OZVKRYKO method201() {
		OZVKRYKO var1 = field599.field1054;
		if (field599 == var1) {
			field600 = null;
			return null;
		} else {
			field600 = var1.field1054;
			return var1;
		}
	}

	@ObfuscatedName("EWLVMFRK.a(I)LOZVKRYKO;")
	public OZVKRYKO method202() {
		OZVKRYKO var1 = field599.field1055;
		if (field599 == var1) {
			field600 = null;
			return null;
		} else {
			field600 = var1.field1055;
			return var1;
		}
	}

	@ObfuscatedName("EWLVMFRK.a(B)LOZVKRYKO;")
	public OZVKRYKO method203() {
		OZVKRYKO var1 = field600;
		if (field599 == var1) {
			field600 = null;
			return null;
		} else {
			field600 = var1.field1054;
			return var1;
		}
	}

	@ObfuscatedName("EWLVMFRK.b(B)LOZVKRYKO;")
	public OZVKRYKO method204() {
		OZVKRYKO var1 = field600;
		if (field599 == var1) {
			field600 = null;
			return null;
		} else {
			field600 = var1.field1055;
			return var1;
		}
	}

	@ObfuscatedName("EWLVMFRK.c()V")
	public void method205() {
		if (field599.field1054 != field599) {
			while (true) {
				OZVKRYKO var1 = field599.field1054;
				if (field599 == var1) {
					return;
				}

				var1.method396();
			}
		}
	}
}
