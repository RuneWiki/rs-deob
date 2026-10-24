package deob;

@ObfuscatedName("VGFLNLXH")
public final class VGFLNLXH {

	@ObfuscatedName("VGFLNLXH.e")
	public CZLFLPZK field1351 = new CZLFLPZK();

	@ObfuscatedName("VGFLNLXH.f")
	public CZLFLPZK field1352;

	public VGFLNLXH() {
		field1351.field563 = field1351;
		field1351.field564 = field1351;
	}

	@ObfuscatedName("VGFLNLXH.a(LCZLFLPZK;)V")
	public void method529(CZLFLPZK arg0) {
		if (arg0.field564 != null) {
			arg0.method163();
		}

		arg0.field564 = field1351.field564;
		arg0.field563 = field1351;
		arg0.field564.field563 = arg0;
		arg0.field563.field564 = arg0;
	}

	@ObfuscatedName("VGFLNLXH.a(LCZLFLPZK;Z)V")
	public void method530(CZLFLPZK arg0) {
		if (arg0.field564 != null) {
			arg0.method163();
		}

		arg0.field564 = field1351;
		arg0.field563 = field1351.field563;
		arg0.field564.field563 = arg0;
		arg0.field563.field564 = arg0;
	}

	@ObfuscatedName("VGFLNLXH.a()LCZLFLPZK;")
	public CZLFLPZK method531() {
		CZLFLPZK var1 = field1351.field563;
		if (field1351 == var1) {
			return null;
		} else {
			var1.method163();
			return var1;
		}
	}

	@ObfuscatedName("VGFLNLXH.b()LCZLFLPZK;")
	public CZLFLPZK method532() {
		CZLFLPZK var1 = field1351.field563;
		if (field1351 == var1) {
			field1352 = null;
			return null;
		} else {
			field1352 = var1.field563;
			return var1;
		}
	}

	@ObfuscatedName("VGFLNLXH.a(B)LCZLFLPZK;")
	public CZLFLPZK method533() {
		CZLFLPZK var1 = field1351.field564;
		if (field1351 == var1) {
			field1352 = null;
			return null;
		} else {
			field1352 = var1.field564;
			return var1;
		}
	}

	@ObfuscatedName("VGFLNLXH.a(I)LCZLFLPZK;")
	public CZLFLPZK method534() {
		CZLFLPZK var1 = field1352;
		if (field1351 == var1) {
			field1352 = null;
			return null;
		} else {
			field1352 = var1.field563;
			return var1;
		}
	}

	@ObfuscatedName("VGFLNLXH.b(B)LCZLFLPZK;")
	public CZLFLPZK method535() {
		CZLFLPZK var1 = field1352;
		if (field1351 == var1) {
			field1352 = null;
			return null;
		} else {
			field1352 = var1.field564;
			return var1;
		}
	}

	@ObfuscatedName("VGFLNLXH.c()V")
	public void method536() {
		if (field1351.field563 != field1351) {
			while (true) {
				CZLFLPZK var1 = field1351.field563;
				if (field1351 == var1) {
					return;
				}

				var1.method163();
			}
		}
	}
}
