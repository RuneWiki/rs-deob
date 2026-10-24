package deob;

@ObfuscatedName("JQSVNFRT")
public final class JQSVNFRT {

	@ObfuscatedName("JQSVNFRT.f")
	public IHAIACWA field860 = new IHAIACWA();

	@ObfuscatedName("JQSVNFRT.g")
	public IHAIACWA field861;

	public JQSVNFRT() {
		field860.field846 = field860;
		field860.field847 = field860;
	}

	@ObfuscatedName("JQSVNFRT.a(LIHAIACWA;)V")
	public void method392(IHAIACWA arg0) {
		if (arg0.field847 != null) {
			arg0.method379();
		}

		arg0.field847 = field860.field847;
		arg0.field846 = field860;
		arg0.field847.field846 = arg0;
		arg0.field846.field847 = arg0;
	}

	@ObfuscatedName("JQSVNFRT.a(LIHAIACWA;I)V")
	public void method393(IHAIACWA arg0) {
		if (arg0.field847 != null) {
			arg0.method379();
		}

		arg0.field847 = field860;
		arg0.field846 = field860.field846;
		arg0.field847.field846 = arg0;
		arg0.field846.field847 = arg0;
	}

	@ObfuscatedName("JQSVNFRT.a()LIHAIACWA;")
	public IHAIACWA method394() {
		IHAIACWA var1 = field860.field846;
		if (field860 == var1) {
			return null;
		} else {
			var1.method379();
			return var1;
		}
	}

	@ObfuscatedName("JQSVNFRT.b()LIHAIACWA;")
	public IHAIACWA method395() {
		IHAIACWA var1 = field860.field846;
		if (field860 == var1) {
			field861 = null;
			return null;
		} else {
			field861 = var1.field846;
			return var1;
		}
	}

	@ObfuscatedName("JQSVNFRT.a(I)LIHAIACWA;")
	public IHAIACWA method396() {
		IHAIACWA var1 = field860.field847;
		if (field860 == var1) {
			field861 = null;
			return null;
		} else {
			field861 = var1.field847;
			return var1;
		}
	}

	@ObfuscatedName("JQSVNFRT.b(I)LIHAIACWA;")
	public IHAIACWA method397() {
		IHAIACWA var1 = field861;
		if (field860 == var1) {
			field861 = null;
			return null;
		} else {
			field861 = var1.field846;
			return var1;
		}
	}

	@ObfuscatedName("JQSVNFRT.a(B)LIHAIACWA;")
	public IHAIACWA method398() {
		IHAIACWA var1 = field861;
		if (field860 == var1) {
			field861 = null;
			return null;
		} else {
			field861 = var1.field847;
			return var1;
		}
	}

	@ObfuscatedName("JQSVNFRT.c()V")
	public void method399() {
		if (field860.field846 != field860) {
			while (true) {
				IHAIACWA var1 = field860.field846;
				if (field860 == var1) {
					return;
				}

				var1.method379();
			}
		}
	}
}
