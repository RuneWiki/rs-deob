package deob;

@ObfuscatedName("ec")
public class class109 extends class545 {

	@ObfuscatedName("ec.af")
	public class103 field1428;

	public class109() {
		this.field1428 = null;
	}

	public class109(class111 arg0) {
		if (arg0 != null) {
			this.field1428 = new class103(arg0, null);
		}
	}

	public class109(class96 arg0) {
		this.field1428 = new class103(null, arg0);
	}

	@ObfuscatedName("ec.af(I)Z")
	public boolean method3255() {
		return this.field1428 == null;
	}

	@ObfuscatedName("ec.aw(I)Ldv;")
	public class96 method3234() {
		if (this.field1428 == null || !this.field1428.field1389.tryLock()) {
			return null;
		}
		class96 var1;
		try {
			var1 = this.method3254();
		} finally {
			this.field1428.field1389.unlock();
		}
		return var1;
	}

	@ObfuscatedName("ec.at(I)Ldv;")
	public class96 method3237() {
		if (this.field1428 == null) {
			return null;
		}
		this.field1428.field1389.lock();
		class96 var1;
		try {
			var1 = this.method3254();
		} finally {
			this.field1428.field1389.unlock();
		}
		return var1;
	}

	@ObfuscatedName("ec.ac(I)Ldv;")
	public class96 method3254() {
		if (this.field1428.field1388 == null) {
			this.field1428.field1388 = this.field1428.field1387.method3272(null);
			this.field1428.field1387 = null;
		}
		return this.field1428.field1388;
	}
}
