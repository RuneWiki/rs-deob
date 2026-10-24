package deob;

@ObfuscatedName("FOKYUBQV")
public final class FOKYUBQV {

	@ObfuscatedName("FOKYUBQV.d")
	public FLQEGCUY field638 = new FLQEGCUY();

	@ObfuscatedName("FOKYUBQV.e")
	public FLQEGCUY field639;

	public FOKYUBQV() {
		field638.field636 = field638;
		field638.field637 = field638;
	}

	@ObfuscatedName("FOKYUBQV.a(LFLQEGCUY;)V")
	public void method196(FLQEGCUY arg0) {
		if (arg0.field637 != null) {
			arg0.method195();
		}

		arg0.field637 = field638.field637;
		arg0.field636 = field638;
		arg0.field637.field636 = arg0;
		arg0.field636.field637 = arg0;
	}

	@ObfuscatedName("FOKYUBQV.a(ILFLQEGCUY;)V")
	public void method197(FLQEGCUY arg0) {
		if (arg0.field637 != null) {
			arg0.method195();
		}

		arg0.field637 = field638;
		arg0.field636 = field638.field636;
		arg0.field637.field636 = arg0;
		arg0.field636.field637 = arg0;
	}

	@ObfuscatedName("FOKYUBQV.a()LFLQEGCUY;")
	public FLQEGCUY method198() {
		FLQEGCUY var1 = field638.field636;
		if (field638 == var1) {
			return null;
		} else {
			var1.method195();
			return var1;
		}
	}

	@ObfuscatedName("FOKYUBQV.b()LFLQEGCUY;")
	public FLQEGCUY method199() {
		FLQEGCUY var1 = field638.field636;
		if (field638 == var1) {
			field639 = null;
			return null;
		} else {
			field639 = var1.field636;
			return var1;
		}
	}

	@ObfuscatedName("FOKYUBQV.a(I)LFLQEGCUY;")
	public FLQEGCUY method200() {
		FLQEGCUY var1 = field638.field637;
		if (field638 == var1) {
			field639 = null;
			return null;
		} else {
			field639 = var1.field637;
			return var1;
		}
	}

	@ObfuscatedName("FOKYUBQV.b(I)LFLQEGCUY;")
	public FLQEGCUY method201() {
		FLQEGCUY var1 = field639;
		if (field638 == var1) {
			field639 = null;
			return null;
		} else {
			field639 = var1.field636;
			return var1;
		}
	}

	@ObfuscatedName("FOKYUBQV.c(I)LFLQEGCUY;")
	public FLQEGCUY method202() {
		FLQEGCUY var1 = field639;
		if (field638 == var1) {
			field639 = null;
			return null;
		} else {
			field639 = var1.field637;
			return var1;
		}
	}

	@ObfuscatedName("FOKYUBQV.c()V")
	public void method203() {
		if (field638.field636 != field638) {
			while (true) {
				FLQEGCUY var1 = field638.field636;
				if (field638 == var1) {
					return;
				}

				var1.method195();
			}
		}
	}
}
