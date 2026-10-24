package deob;

@ObfuscatedName("ROXEPOUC")
public final class ROXEPOUC {

	@ObfuscatedName("ROXEPOUC.d")
	public DLMMHADP field1166 = new DLMMHADP();

	@ObfuscatedName("ROXEPOUC.e")
	public DLMMHADP field1167;

	public ROXEPOUC() {
		field1166.field643 = field1166;
		field1166.field644 = field1166;
	}

	@ObfuscatedName("ROXEPOUC.a(LDLMMHADP;)V")
	public void method424(DLMMHADP arg0) {
		if (arg0.field644 != null) {
			arg0.method234();
		}

		arg0.field644 = field1166.field644;
		arg0.field643 = field1166;
		arg0.field644.field643 = arg0;
		arg0.field643.field644 = arg0;
	}

	@ObfuscatedName("ROXEPOUC.a(ILDLMMHADP;)V")
	public void method425(DLMMHADP arg0) {
		if (arg0.field644 != null) {
			arg0.method234();
		}

		arg0.field644 = field1166;
		arg0.field643 = field1166.field643;
		arg0.field644.field643 = arg0;
		arg0.field643.field644 = arg0;
	}

	@ObfuscatedName("ROXEPOUC.a()LDLMMHADP;")
	public DLMMHADP method426() {
		DLMMHADP var1 = field1166.field643;
		if (field1166 == var1) {
			return null;
		} else {
			var1.method234();
			return var1;
		}
	}

	@ObfuscatedName("ROXEPOUC.b()LDLMMHADP;")
	public DLMMHADP method427() {
		DLMMHADP var1 = field1166.field643;
		if (field1166 == var1) {
			field1167 = null;
			return null;
		} else {
			field1167 = var1.field643;
			return var1;
		}
	}

	@ObfuscatedName("ROXEPOUC.a(I)LDLMMHADP;")
	public DLMMHADP method428() {
		DLMMHADP var1 = field1166.field644;
		if (field1166 == var1) {
			field1167 = null;
			return null;
		} else {
			field1167 = var1.field644;
			return var1;
		}
	}

	@ObfuscatedName("ROXEPOUC.b(I)LDLMMHADP;")
	public DLMMHADP method429() {
		DLMMHADP var1 = field1167;
		if (field1166 == var1) {
			field1167 = null;
			return null;
		} else {
			field1167 = var1.field643;
			return var1;
		}
	}

	@ObfuscatedName("ROXEPOUC.a(Z)LDLMMHADP;")
	public DLMMHADP method430() {
		DLMMHADP var1 = field1167;
		if (field1166 == var1) {
			field1167 = null;
			return null;
		} else {
			field1167 = var1.field644;
			return var1;
		}
	}

	@ObfuscatedName("ROXEPOUC.c()V")
	public void method431() {
		if (field1166.field643 != field1166) {
			while (true) {
				DLMMHADP var1 = field1166.field643;
				if (field1166 == var1) {
					return;
				}

				var1.method234();
			}
		}
	}
}
