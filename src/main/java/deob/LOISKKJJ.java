package deob;

@ObfuscatedName("LOISKKJJ")
public final class LOISKKJJ {

	@ObfuscatedName("LOISKKJJ.g")
	public DJXGSHIT field922 = new DJXGSHIT();

	@ObfuscatedName("LOISKKJJ.h")
	public DJXGSHIT field923;

	public LOISKKJJ() {
		field922.field475 = field922;
		field922.field476 = field922;
	}

	@ObfuscatedName("LOISKKJJ.a(LDJXGSHIT;)V")
	public void method448(DJXGSHIT arg0) {
		if (arg0.field476 != null) {
			arg0.method156();
		}

		arg0.field476 = field922.field476;
		arg0.field475 = field922;
		arg0.field476.field475 = arg0;
		arg0.field475.field476 = arg0;
	}

	@ObfuscatedName("LOISKKJJ.a(LDJXGSHIT;Z)V")
	public void method449(DJXGSHIT arg0) {
		if (arg0.field476 != null) {
			arg0.method156();
		}

		arg0.field476 = field922;
		arg0.field475 = field922.field475;
		arg0.field476.field475 = arg0;
		arg0.field475.field476 = arg0;
	}

	@ObfuscatedName("LOISKKJJ.a()LDJXGSHIT;")
	public DJXGSHIT method450() {
		DJXGSHIT var1 = field922.field475;
		if (field922 == var1) {
			return null;
		} else {
			var1.method156();
			return var1;
		}
	}

	@ObfuscatedName("LOISKKJJ.b()LDJXGSHIT;")
	public DJXGSHIT method451() {
		DJXGSHIT var1 = field922.field475;
		if (field922 == var1) {
			field923 = null;
			return null;
		} else {
			field923 = var1.field475;
			return var1;
		}
	}

	@ObfuscatedName("LOISKKJJ.a(B)LDJXGSHIT;")
	public DJXGSHIT method452() {
		DJXGSHIT var1 = field922.field476;
		if (field922 == var1) {
			field923 = null;
			return null;
		} else {
			field923 = var1.field476;
			return var1;
		}
	}

	@ObfuscatedName("LOISKKJJ.b(B)LDJXGSHIT;")
	public DJXGSHIT method453() {
		DJXGSHIT var1 = field923;
		if (field922 == var1) {
			field923 = null;
			return null;
		} else {
			field923 = var1.field475;
			return var1;
		}
	}

	@ObfuscatedName("LOISKKJJ.c(B)LDJXGSHIT;")
	public DJXGSHIT method454() {
		DJXGSHIT var1 = field923;
		if (field922 == var1) {
			field923 = null;
			return null;
		} else {
			field923 = var1.field476;
			return var1;
		}
	}

	@ObfuscatedName("LOISKKJJ.c()V")
	public void method455() {
		if (field922.field475 != field922) {
			while (true) {
				DJXGSHIT var1 = field922.field475;
				if (field922 == var1) {
					return;
				}

				var1.method156();
			}
		}
	}
}
