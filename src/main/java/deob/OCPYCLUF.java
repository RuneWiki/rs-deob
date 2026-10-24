package deob;

@ObfuscatedName("OCPYCLUF")
public final class OCPYCLUF {

	@ObfuscatedName("OCPYCLUF.e")
	public MRGQMKFG field1034 = new MRGQMKFG();

	@ObfuscatedName("OCPYCLUF.f")
	public MRGQMKFG field1035;

	public OCPYCLUF() {
		field1034.field962 = field1034;
		field1034.field963 = field1034;
	}

	@ObfuscatedName("OCPYCLUF.a(LMRGQMKFG;)V")
	public void method411(MRGQMKFG arg0) {
		if (arg0.field963 != null) {
			arg0.method336();
		}

		arg0.field963 = field1034.field963;
		arg0.field962 = field1034;
		arg0.field963.field962 = arg0;
		arg0.field962.field963 = arg0;
	}

	@ObfuscatedName("OCPYCLUF.a(LMRGQMKFG;B)V")
	public void method412(MRGQMKFG arg0) {
		if (arg0.field963 != null) {
			arg0.method336();
		}

		arg0.field963 = field1034;
		arg0.field962 = field1034.field962;
		arg0.field963.field962 = arg0;
		arg0.field962.field963 = arg0;
	}

	@ObfuscatedName("OCPYCLUF.a()LMRGQMKFG;")
	public MRGQMKFG method413() {
		MRGQMKFG var1 = field1034.field962;
		if (field1034 == var1) {
			return null;
		} else {
			var1.method336();
			return var1;
		}
	}

	@ObfuscatedName("OCPYCLUF.b()LMRGQMKFG;")
	public MRGQMKFG method414() {
		MRGQMKFG var1 = field1034.field962;
		if (field1034 == var1) {
			field1035 = null;
			return null;
		} else {
			field1035 = var1.field962;
			return var1;
		}
	}

	@ObfuscatedName("OCPYCLUF.a(I)LMRGQMKFG;")
	public MRGQMKFG method415() {
		MRGQMKFG var1 = field1034.field963;
		if (field1034 == var1) {
			field1035 = null;
			return null;
		} else {
			field1035 = var1.field963;
			return var1;
		}
	}

	@ObfuscatedName("OCPYCLUF.b(I)LMRGQMKFG;")
	public MRGQMKFG method416() {
		MRGQMKFG var1 = field1035;
		if (field1034 == var1) {
			field1035 = null;
			return null;
		} else {
			field1035 = var1.field962;
			return var1;
		}
	}

	@ObfuscatedName("OCPYCLUF.a(Z)LMRGQMKFG;")
	public MRGQMKFG method417() {
		MRGQMKFG var1 = field1035;
		if (field1034 == var1) {
			field1035 = null;
			return null;
		} else {
			field1035 = var1.field963;
			return var1;
		}
	}

	@ObfuscatedName("OCPYCLUF.c()V")
	public void method418() {
		if (field1034.field962 != field1034) {
			while (true) {
				MRGQMKFG var1 = field1034.field962;
				if (field1034 == var1) {
					return;
				}

				var1.method336();
			}
		}
	}
}
