package deob;

@ObfuscatedName("KMFVYEKJ")
public final class KMFVYEKJ {

	@ObfuscatedName("KMFVYEKJ.c")
	public MOVYLKVL field1056 = new MOVYLKVL();

	@ObfuscatedName("KMFVYEKJ.d")
	public MOVYLKVL field1057;

	public KMFVYEKJ() {
		field1056.field1084 = field1056;
		field1056.field1085 = field1056;
	}

	@ObfuscatedName("KMFVYEKJ.a(LMOVYLKVL;)V")
	public void method371(MOVYLKVL arg0) {
		if (arg0.field1085 != null) {
			arg0.method379();
		}

		arg0.field1085 = field1056.field1085;
		arg0.field1084 = field1056;
		arg0.field1085.field1084 = arg0;
		arg0.field1084.field1085 = arg0;
	}

	@ObfuscatedName("KMFVYEKJ.a()LMOVYLKVL;")
	public MOVYLKVL method372() {
		MOVYLKVL var1 = field1056.field1084;
		if (field1056 == var1) {
			return null;
		} else {
			var1.method379();
			return var1;
		}
	}

	@ObfuscatedName("KMFVYEKJ.b()LMOVYLKVL;")
	public MOVYLKVL method373() {
		MOVYLKVL var1 = field1056.field1084;
		if (field1056 == var1) {
			field1057 = null;
			return null;
		} else {
			field1057 = var1.field1084;
			return var1;
		}
	}

	@ObfuscatedName("KMFVYEKJ.a(I)LMOVYLKVL;")
	public MOVYLKVL method374() {
		MOVYLKVL var1 = field1057;
		if (field1056 == var1) {
			field1057 = null;
			return null;
		} else {
			field1057 = var1.field1084;
			return var1;
		}
	}

	@ObfuscatedName("KMFVYEKJ.c()I")
	public int method375() {
		int var1 = 0;
		for (MOVYLKVL var2 = field1056.field1084; var2 != field1056; var2 = var2.field1084) {
			var1++;
		}

		return var1;
	}
}
