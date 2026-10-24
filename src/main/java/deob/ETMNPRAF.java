package deob;

@ObfuscatedName("ETMNPRAF")
public final class ETMNPRAF {

	@ObfuscatedName("ETMNPRAF.e")
	public LXNKZOGX field554 = new LXNKZOGX();

	@ObfuscatedName("ETMNPRAF.f")
	public LXNKZOGX field555;

	public ETMNPRAF() {
		field554.field881 = field554;
		field554.field882 = field554;
	}

	@ObfuscatedName("ETMNPRAF.a(LLXNKZOGX;)V")
	public void method178(LXNKZOGX arg0) {
		if (arg0.field882 != null) {
			arg0.method331();
		}

		arg0.field882 = field554.field882;
		arg0.field881 = field554;
		arg0.field882.field881 = arg0;
		arg0.field881.field882 = arg0;
	}

	@ObfuscatedName("ETMNPRAF.a(LLXNKZOGX;I)V")
	public void method179(LXNKZOGX arg0) {
		if (arg0.field882 != null) {
			arg0.method331();
		}

		arg0.field882 = field554;
		arg0.field881 = field554.field881;
		arg0.field882.field881 = arg0;
		arg0.field881.field882 = arg0;
	}

	@ObfuscatedName("ETMNPRAF.a()LLXNKZOGX;")
	public LXNKZOGX method180() {
		LXNKZOGX var1 = field554.field881;
		if (field554 == var1) {
			return null;
		} else {
			var1.method331();
			return var1;
		}
	}

	@ObfuscatedName("ETMNPRAF.b()LLXNKZOGX;")
	public LXNKZOGX method181() {
		LXNKZOGX var1 = field554.field881;
		if (field554 == var1) {
			field555 = null;
			return null;
		} else {
			field555 = var1.field881;
			return var1;
		}
	}

	@ObfuscatedName("ETMNPRAF.a(I)LLXNKZOGX;")
	public LXNKZOGX method182() {
		LXNKZOGX var1 = field554.field882;
		if (field554 == var1) {
			field555 = null;
			return null;
		} else {
			field555 = var1.field882;
			return var1;
		}
	}

	@ObfuscatedName("ETMNPRAF.a(B)LLXNKZOGX;")
	public LXNKZOGX method183() {
		LXNKZOGX var1 = field555;
		if (field554 == var1) {
			field555 = null;
			return null;
		} else {
			field555 = var1.field881;
			return var1;
		}
	}

	@ObfuscatedName("ETMNPRAF.a(Z)LLXNKZOGX;")
	public LXNKZOGX method184() {
		LXNKZOGX var1 = field555;
		if (field554 == var1) {
			field555 = null;
			return null;
		} else {
			field555 = var1.field882;
			return var1;
		}
	}

	@ObfuscatedName("ETMNPRAF.c()V")
	public void method185() {
		if (field554.field881 != field554) {
			while (true) {
				LXNKZOGX var1 = field554.field881;
				if (field554 == var1) {
					return;
				}

				var1.method331();
			}
		}
	}
}
