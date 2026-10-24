package deob;

@ObfuscatedName("WMYPWVZI")
public final class WMYPWVZI {

	@ObfuscatedName("WMYPWVZI.d")
	public WLTWEDNK field1352 = new WLTWEDNK();

	@ObfuscatedName("WMYPWVZI.h")
	public VHKTMNAT field1356 = new VHKTMNAT();

	@ObfuscatedName("WMYPWVZI.e")
	public int field1353;

	@ObfuscatedName("WMYPWVZI.f")
	public int field1354;

	@ObfuscatedName("WMYPWVZI.g")
	public SAEPCADT field1355;

	@ObfuscatedName("WMYPWVZI.b")
	public int field1350;

	@ObfuscatedName("WMYPWVZI.c")
	public int field1351;

	public WMYPWVZI(int arg0) {
		field1353 = arg0;
		field1354 = arg0;
		field1355 = new SAEPCADT(1024);
	}

	@ObfuscatedName("WMYPWVZI.a(J)LWLTWEDNK;")
	public WLTWEDNK method525(long arg0) {
		WLTWEDNK var3 = (WLTWEDNK) field1355.method431(arg0);
		if (var3 == null) {
			field1350++;
		} else {
			field1356.method489(var3);
			field1351++;
		}

		return var3;
	}

	@ObfuscatedName("WMYPWVZI.a(JILWLTWEDNK;)V")
	public void method526(long arg0, WLTWEDNK arg1) {
		if (field1354 == 0) {
			WLTWEDNK var4 = field1356.method490();
			var4.method540();
			var4.method524();

			if (field1352 == var4) {
				WLTWEDNK var5 = field1356.method490();
				var5.method540();
				var5.method524();
			}
		} else {
			field1354--;
		}

		field1355.method432(arg0, arg1);
		field1356.method489(arg1);
	}

	@ObfuscatedName("WMYPWVZI.a()V")
	public void method527() {
		while (true) {
			WLTWEDNK var1 = field1356.method490();
			if (var1 == null) {
				field1354 = field1353;
				return;
			}

			var1.method540();
			var1.method524();
		}
	}
}
