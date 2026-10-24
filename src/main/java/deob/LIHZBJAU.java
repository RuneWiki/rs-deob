package deob;

@ObfuscatedName("LIHZBJAU")
public final class LIHZBJAU {

	@ObfuscatedName("LIHZBJAU.c")
	public PFQOGDTY field806 = new PFQOGDTY();

	@ObfuscatedName("LIHZBJAU.d")
	public PFQOGDTY field807;

	public LIHZBJAU() {
		field806.field1244 = field806;
		field806.field1245 = field806;
	}

	@ObfuscatedName("LIHZBJAU.a(LPFQOGDTY;)V")
	public void method265(PFQOGDTY arg0) {
		if (arg0.field1245 != null) {
			arg0.method423();
		}

		arg0.field1245 = field806.field1245;
		arg0.field1244 = field806;
		arg0.field1245.field1244 = arg0;
		arg0.field1244.field1245 = arg0;
	}

	@ObfuscatedName("LIHZBJAU.a()LPFQOGDTY;")
	public PFQOGDTY method266() {
		PFQOGDTY var1 = field806.field1244;
		if (field806 == var1) {
			return null;
		} else {
			var1.method423();
			return var1;
		}
	}

	@ObfuscatedName("LIHZBJAU.b()LPFQOGDTY;")
	public PFQOGDTY method267() {
		PFQOGDTY var1 = field806.field1244;
		if (field806 == var1) {
			field807 = null;
			return null;
		} else {
			field807 = var1.field1244;
			return var1;
		}
	}

	@ObfuscatedName("LIHZBJAU.a(B)LPFQOGDTY;")
	public PFQOGDTY method268() {
		PFQOGDTY var1 = field807;
		if (field806 == var1) {
			field807 = null;
			return null;
		} else {
			field807 = var1.field1244;
			return var1;
		}
	}

	@ObfuscatedName("LIHZBJAU.c()I")
	public int method269() {
		int var1 = 0;
		for (PFQOGDTY var2 = field806.field1244; var2 != field806; var2 = var2.field1244) {
			var1++;
		}

		return var1;
	}
}
