package deob;

@ObfuscatedName("FEIPMYNH")
public final class FEIPMYNH {

	@ObfuscatedName("FEIPMYNH.c")
	public TVKHSKYG field566 = new TVKHSKYG();

	@ObfuscatedName("FEIPMYNH.d")
	public TVKHSKYG field567;

	public FEIPMYNH() {
		field566.field1307 = field566;
		field566.field1308 = field566;
	}

	@ObfuscatedName("FEIPMYNH.a(LTVKHSKYG;)V")
	public void method297(TVKHSKYG arg0) {
		if (arg0.field1308 != null) {
			arg0.method518();
		}

		arg0.field1308 = field566.field1308;
		arg0.field1307 = field566;
		arg0.field1308.field1307 = arg0;
		arg0.field1307.field1308 = arg0;
	}

	@ObfuscatedName("FEIPMYNH.a(ZLTVKHSKYG;)V")
	public void method298(TVKHSKYG arg0) {
		if (arg0.field1308 != null) {
			arg0.method518();
		}

		arg0.field1308 = field566;
		arg0.field1307 = field566.field1307;
		arg0.field1308.field1307 = arg0;
		arg0.field1307.field1308 = arg0;
	}

	@ObfuscatedName("FEIPMYNH.a()LTVKHSKYG;")
	public TVKHSKYG method299() {
		TVKHSKYG var1 = field566.field1307;
		if (field566 == var1) {
			return null;
		} else {
			var1.method518();
			return var1;
		}
	}

	@ObfuscatedName("FEIPMYNH.b()LTVKHSKYG;")
	public TVKHSKYG method300() {
		TVKHSKYG var1 = field566.field1307;
		if (field566 == var1) {
			field567 = null;
			return null;
		} else {
			field567 = var1.field1307;
			return var1;
		}
	}

	@ObfuscatedName("FEIPMYNH.a(I)LTVKHSKYG;")
	public TVKHSKYG method301() {
		TVKHSKYG var1 = field566.field1308;
		if (field566 == var1) {
			field567 = null;
			return null;
		} else {
			field567 = var1.field1308;
			return var1;
		}
	}

	@ObfuscatedName("FEIPMYNH.a(Z)LTVKHSKYG;")
	public TVKHSKYG method302() {
		TVKHSKYG var1 = field567;
		if (field566 == var1) {
			field567 = null;
			return null;
		} else {
			field567 = var1.field1307;
			return var1;
		}
	}

	@ObfuscatedName("FEIPMYNH.b(I)LTVKHSKYG;")
	public TVKHSKYG method303() {
		TVKHSKYG var1 = field567;
		if (field566 == var1) {
			field567 = null;
			return null;
		} else {
			field567 = var1.field1308;
			return var1;
		}
	}

	@ObfuscatedName("FEIPMYNH.c()V")
	public void method304() {
		if (field566.field1307 != field566) {
			while (true) {
				TVKHSKYG var1 = field566.field1307;
				if (field566 == var1) {
					return;
				}

				var1.method518();
			}
		}
	}
}
