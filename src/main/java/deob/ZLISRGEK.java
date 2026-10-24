package deob;

@ObfuscatedName("ZLISRGEK")
public final class ZLISRGEK {

	@ObfuscatedName("ZLISRGEK.e")
	public DRKSBDQX field1512 = new DRKSBDQX();

	@ObfuscatedName("ZLISRGEK.f")
	public DRKSBDQX field1513;

	public ZLISRGEK() {
		field1512.field618 = field1512;
		field1512.field619 = field1512;
	}

	@ObfuscatedName("ZLISRGEK.a(LDRKSBDQX;)V")
	public void method592(DRKSBDQX arg0) {
		if (arg0.field619 != null) {
			arg0.method217();
		}

		arg0.field619 = field1512.field619;
		arg0.field618 = field1512;
		arg0.field619.field618 = arg0;
		arg0.field618.field619 = arg0;
	}

	@ObfuscatedName("ZLISRGEK.a()LDRKSBDQX;")
	public DRKSBDQX method593() {
		DRKSBDQX var1 = field1512.field618;
		if (field1512 == var1) {
			return null;
		} else {
			var1.method217();
			return var1;
		}
	}

	@ObfuscatedName("ZLISRGEK.b()LDRKSBDQX;")
	public DRKSBDQX method594() {
		DRKSBDQX var1 = field1512.field618;
		if (field1512 == var1) {
			field1513 = null;
			return null;
		} else {
			field1513 = var1.field618;
			return var1;
		}
	}

	@ObfuscatedName("ZLISRGEK.a(B)LDRKSBDQX;")
	public DRKSBDQX method595() {
		DRKSBDQX var1 = field1513;
		if (field1512 == var1) {
			field1513 = null;
			return null;
		} else {
			field1513 = var1.field618;
			return var1;
		}
	}

	@ObfuscatedName("ZLISRGEK.c()I")
	public int method596() {
		int var1 = 0;
		for (DRKSBDQX var2 = field1512.field618; var2 != field1512; var2 = var2.field618) {
			var1++;
		}

		return var1;
	}
}
