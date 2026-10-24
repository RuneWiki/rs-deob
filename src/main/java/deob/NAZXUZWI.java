package deob;

@ObfuscatedName("NAZXUZWI")
public final class NAZXUZWI {

	@ObfuscatedName("NAZXUZWI.d")
	public RZDMTEAZ field958 = new RZDMTEAZ();

	@ObfuscatedName("NAZXUZWI.e")
	public RZDMTEAZ field959;

	public NAZXUZWI() {
		field958.field1222 = field958;
		field958.field1223 = field958;
	}

	@ObfuscatedName("NAZXUZWI.a(LRZDMTEAZ;)V")
	public void method388(RZDMTEAZ arg0) {
		if (arg0.field1223 != null) {
			arg0.method495();
		}

		arg0.field1223 = field958.field1223;
		arg0.field1222 = field958;
		arg0.field1223.field1222 = arg0;
		arg0.field1222.field1223 = arg0;
	}

	@ObfuscatedName("NAZXUZWI.a()LRZDMTEAZ;")
	public RZDMTEAZ method389() {
		RZDMTEAZ var1 = field958.field1222;
		if (field958 == var1) {
			return null;
		} else {
			var1.method495();
			return var1;
		}
	}

	@ObfuscatedName("NAZXUZWI.b()LRZDMTEAZ;")
	public RZDMTEAZ method390() {
		RZDMTEAZ var1 = field958.field1222;
		if (field958 == var1) {
			field959 = null;
			return null;
		} else {
			field959 = var1.field1222;
			return var1;
		}
	}

	@ObfuscatedName("NAZXUZWI.a(I)LRZDMTEAZ;")
	public RZDMTEAZ method391() {
		RZDMTEAZ var1 = field959;
		if (field958 == var1) {
			field959 = null;
			return null;
		} else {
			field959 = var1.field1222;
			return var1;
		}
	}

	@ObfuscatedName("NAZXUZWI.c()I")
	public int method392() {
		int var1 = 0;
		for (RZDMTEAZ var2 = field958.field1222; var2 != field958; var2 = var2.field1222) {
			var1++;
		}

		return var1;
	}
}
