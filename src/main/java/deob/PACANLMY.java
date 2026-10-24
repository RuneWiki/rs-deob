package deob;

@ObfuscatedName("PACANLMY")
public final class PACANLMY {

	@ObfuscatedName("PACANLMY.c")
	public PXORWIXO field1055 = new PXORWIXO();

	@ObfuscatedName("PACANLMY.d")
	public PXORWIXO field1056;

	public PACANLMY() {
		field1055.field1137 = field1055;
		field1055.field1138 = field1055;
	}

	@ObfuscatedName("PACANLMY.a(LPXORWIXO;)V")
	public void method446(PXORWIXO arg0) {
		if (arg0.field1138 != null) {
			arg0.method464();
		}

		arg0.field1138 = field1055.field1138;
		arg0.field1137 = field1055;
		arg0.field1138.field1137 = arg0;
		arg0.field1137.field1138 = arg0;
	}

	@ObfuscatedName("PACANLMY.a(ILPXORWIXO;)V")
	public void method447(PXORWIXO arg0) {
		if (arg0.field1138 != null) {
			arg0.method464();
		}

		arg0.field1138 = field1055;
		arg0.field1137 = field1055.field1137;
		arg0.field1138.field1137 = arg0;
		arg0.field1137.field1138 = arg0;
	}

	@ObfuscatedName("PACANLMY.a()LPXORWIXO;")
	public PXORWIXO method448() {
		PXORWIXO var1 = field1055.field1137;
		if (field1055 == var1) {
			return null;
		} else {
			var1.method464();
			return var1;
		}
	}

	@ObfuscatedName("PACANLMY.b()LPXORWIXO;")
	public PXORWIXO method449() {
		PXORWIXO var1 = field1055.field1137;
		if (field1055 == var1) {
			field1056 = null;
			return null;
		} else {
			field1056 = var1.field1137;
			return var1;
		}
	}

	@ObfuscatedName("PACANLMY.a(B)LPXORWIXO;")
	public PXORWIXO method450() {
		PXORWIXO var1 = field1055.field1138;
		if (field1055 == var1) {
			field1056 = null;
			return null;
		} else {
			field1056 = var1.field1138;
			return var1;
		}
	}

	@ObfuscatedName("PACANLMY.a(I)LPXORWIXO;")
	public PXORWIXO method451() {
		PXORWIXO var1 = field1056;
		if (field1055 == var1) {
			field1056 = null;
			return null;
		} else {
			field1056 = var1.field1137;
			return var1;
		}
	}

	@ObfuscatedName("PACANLMY.b(I)LPXORWIXO;")
	public PXORWIXO method452() {
		PXORWIXO var1 = field1056;
		if (field1055 == var1) {
			field1056 = null;
			return null;
		} else {
			field1056 = var1.field1138;
			return var1;
		}
	}

	@ObfuscatedName("PACANLMY.c()V")
	public void method453() {
		if (field1055.field1137 != field1055) {
			while (true) {
				PXORWIXO var1 = field1055.field1137;
				if (field1055 == var1) {
					return;
				}

				var1.method464();
			}
		}
	}
}
