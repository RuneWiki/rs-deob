package deob;

@ObfuscatedName("JTFJPMGL")
public final class JTFJPMGL {

	@ObfuscatedName("JTFJPMGL.b")
	public HZZJZIMV field790 = new HZZJZIMV();

	@ObfuscatedName("JTFJPMGL.c")
	public HZZJZIMV field791;

	public JTFJPMGL() {
		field790.field670 = field790;
		field790.field671 = field790;
	}

	@ObfuscatedName("JTFJPMGL.a(LHZZJZIMV;)V")
	public void method270(HZZJZIMV arg0) {
		if (arg0.field671 != null) {
			arg0.method213();
		}

		arg0.field671 = field790.field671;
		arg0.field670 = field790;
		arg0.field671.field670 = arg0;
		arg0.field670.field671 = arg0;
	}

	@ObfuscatedName("JTFJPMGL.a()LHZZJZIMV;")
	public HZZJZIMV method271() {
		HZZJZIMV var1 = field790.field670;
		if (field790 == var1) {
			return null;
		} else {
			var1.method213();
			return var1;
		}
	}

	@ObfuscatedName("JTFJPMGL.b()LHZZJZIMV;")
	public HZZJZIMV method272() {
		HZZJZIMV var1 = field790.field670;
		if (field790 == var1) {
			field791 = null;
			return null;
		} else {
			field791 = var1.field670;
			return var1;
		}
	}

	@ObfuscatedName("JTFJPMGL.a(I)LHZZJZIMV;")
	public HZZJZIMV method273() {
		HZZJZIMV var1 = field791;
		if (field790 == var1) {
			field791 = null;
			return null;
		} else {
			field791 = var1.field670;
			return var1;
		}
	}

	@ObfuscatedName("JTFJPMGL.c()I")
	public int method274() {
		int var1 = 0;
		for (HZZJZIMV var2 = field790.field670; var2 != field790; var2 = var2.field670) {
			var1++;
		}

		return var1;
	}
}
