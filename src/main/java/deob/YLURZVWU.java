package deob;

@ObfuscatedName("YLURZVWU")
public final class YLURZVWU {

	@ObfuscatedName("YLURZVWU.c")
	public ZSZDCWXM field1334 = new ZSZDCWXM();

	@ObfuscatedName("YLURZVWU.d")
	public ZSZDCWXM field1335;

	public YLURZVWU() {
		field1334.field1486 = field1334;
		field1334.field1487 = field1334;
	}

	@ObfuscatedName("YLURZVWU.a(LZSZDCWXM;)V")
	public void method525(ZSZDCWXM arg0) {
		if (arg0.field1487 != null) {
			arg0.method589();
		}

		arg0.field1487 = field1334.field1487;
		arg0.field1486 = field1334;
		arg0.field1487.field1486 = arg0;
		arg0.field1486.field1487 = arg0;
	}

	@ObfuscatedName("YLURZVWU.a(LZSZDCWXM;I)V")
	public void method526(ZSZDCWXM arg0) {
		if (arg0.field1487 != null) {
			arg0.method589();
		}

		arg0.field1487 = field1334;
		arg0.field1486 = field1334.field1486;
		arg0.field1487.field1486 = arg0;
		arg0.field1486.field1487 = arg0;
	}

	@ObfuscatedName("YLURZVWU.a()LZSZDCWXM;")
	public ZSZDCWXM method527() {
		ZSZDCWXM var1 = field1334.field1486;
		if (field1334 == var1) {
			return null;
		} else {
			var1.method589();
			return var1;
		}
	}

	@ObfuscatedName("YLURZVWU.b()LZSZDCWXM;")
	public ZSZDCWXM method528() {
		ZSZDCWXM var1 = field1334.field1486;
		if (field1334 == var1) {
			field1335 = null;
			return null;
		} else {
			field1335 = var1.field1486;
			return var1;
		}
	}

	@ObfuscatedName("YLURZVWU.a(I)LZSZDCWXM;")
	public ZSZDCWXM method529() {
		ZSZDCWXM var1 = field1334.field1487;
		if (field1334 == var1) {
			field1335 = null;
			return null;
		} else {
			field1335 = var1.field1487;
			return var1;
		}
	}

	@ObfuscatedName("YLURZVWU.a(Z)LZSZDCWXM;")
	public ZSZDCWXM method530() {
		ZSZDCWXM var1 = field1335;
		if (field1334 == var1) {
			field1335 = null;
			return null;
		} else {
			field1335 = var1.field1486;
			return var1;
		}
	}

	@ObfuscatedName("YLURZVWU.b(I)LZSZDCWXM;")
	public ZSZDCWXM method531() {
		ZSZDCWXM var1 = field1335;
		if (field1334 == var1) {
			field1335 = null;
			return null;
		} else {
			field1335 = var1.field1487;
			return var1;
		}
	}

	@ObfuscatedName("YLURZVWU.c()V")
	public void method532() {
		if (field1334.field1486 != field1334) {
			while (true) {
				ZSZDCWXM var1 = field1334.field1486;
				if (field1334 == var1) {
					return;
				}

				var1.method589();
			}
		}
	}
}
