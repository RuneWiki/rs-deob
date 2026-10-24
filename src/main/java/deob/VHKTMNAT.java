package deob;

@ObfuscatedName("VHKTMNAT")
public final class VHKTMNAT {

	@ObfuscatedName("VHKTMNAT.b")
	public WLTWEDNK field1256 = new WLTWEDNK();

	@ObfuscatedName("VHKTMNAT.c")
	public WLTWEDNK field1257;

	public VHKTMNAT() {
		field1256.field1348 = field1256;
		field1256.field1349 = field1256;
	}

	@ObfuscatedName("VHKTMNAT.a(LWLTWEDNK;)V")
	public void method489(WLTWEDNK arg0) {
		if (arg0.field1349 != null) {
			arg0.method524();
		}

		arg0.field1349 = field1256.field1349;
		arg0.field1348 = field1256;
		arg0.field1349.field1348 = arg0;
		arg0.field1348.field1349 = arg0;
	}

	@ObfuscatedName("VHKTMNAT.a()LWLTWEDNK;")
	public WLTWEDNK method490() {
		WLTWEDNK var1 = field1256.field1348;
		if (field1256 == var1) {
			return null;
		} else {
			var1.method524();
			return var1;
		}
	}

	@ObfuscatedName("VHKTMNAT.b()LWLTWEDNK;")
	public WLTWEDNK method491() {
		WLTWEDNK var1 = field1256.field1348;
		if (field1256 == var1) {
			field1257 = null;
			return null;
		} else {
			field1257 = var1.field1348;
			return var1;
		}
	}

	@ObfuscatedName("VHKTMNAT.a(B)LWLTWEDNK;")
	public WLTWEDNK method492() {
		WLTWEDNK var1 = field1257;
		if (field1256 == var1) {
			field1257 = null;
			return null;
		} else {
			field1257 = var1.field1348;
			return var1;
		}
	}

	@ObfuscatedName("VHKTMNAT.c()I")
	public int method493() {
		int var1 = 0;
		for (WLTWEDNK var2 = field1256.field1348; var2 != field1256; var2 = var2.field1348) {
			var1++;
		}

		return var1;
	}
}
