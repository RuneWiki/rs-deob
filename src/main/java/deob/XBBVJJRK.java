package deob;

@ObfuscatedName("XBBVJJRK")
public final class XBBVJJRK {

	@ObfuscatedName("XBBVJJRK.b")
	public HSUOZGYX field1425 = new HSUOZGYX();

	@ObfuscatedName("XBBVJJRK.c")
	public HSUOZGYX field1426;

	public XBBVJJRK() {
		field1425.field744 = field1425;
		field1425.field745 = field1425;
	}

	@ObfuscatedName("XBBVJJRK.a(LHSUOZGYX;)V")
	public void method533(HSUOZGYX arg0) {
		if (arg0.field745 != null) {
			arg0.method298();
		}

		arg0.field745 = field1425.field745;
		arg0.field744 = field1425;
		arg0.field745.field744 = arg0;
		arg0.field744.field745 = arg0;
	}

	@ObfuscatedName("XBBVJJRK.a()LHSUOZGYX;")
	public HSUOZGYX method534() {
		HSUOZGYX var1 = field1425.field744;
		if (field1425 == var1) {
			return null;
		} else {
			var1.method298();
			return var1;
		}
	}

	@ObfuscatedName("XBBVJJRK.b()LHSUOZGYX;")
	public HSUOZGYX method535() {
		HSUOZGYX var1 = field1425.field744;
		if (field1425 == var1) {
			field1426 = null;
			return null;
		} else {
			field1426 = var1.field744;
			return var1;
		}
	}

	@ObfuscatedName("XBBVJJRK.a(B)LHSUOZGYX;")
	public HSUOZGYX method536() {
		HSUOZGYX var1 = field1426;
		if (field1425 == var1) {
			field1426 = null;
			return null;
		} else {
			field1426 = var1.field744;
			return var1;
		}
	}

	@ObfuscatedName("XBBVJJRK.c()I")
	public int method537() {
		int var1 = 0;
		for (HSUOZGYX var2 = field1425.field744; var2 != field1425; var2 = var2.field744) {
			var1++;
		}

		return var1;
	}
}
