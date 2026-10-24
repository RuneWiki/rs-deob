package deob;

@ObfuscatedName("AMMGDAXD")
public final class AMMGDAXD extends CRKDFBCP {

	@ObfuscatedName("AMMGDAXD.l")
	public boolean field7 = false;

	@ObfuscatedName("AMMGDAXD.t")
	public HTOEUNMD field13;

	@ObfuscatedName("AMMGDAXD.m")
	public int field8;

	@ObfuscatedName("AMMGDAXD.n")
	public int field9;

	@ObfuscatedName("AMMGDAXD.o")
	public int field10;

	@ObfuscatedName("AMMGDAXD.p")
	public int field11;

	@ObfuscatedName("AMMGDAXD.q")
	public int field12;

	@ObfuscatedName("AMMGDAXD.u")
	public int field14;

	@ObfuscatedName("AMMGDAXD.v")
	public int field15;

	public AMMGDAXD(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field13 = HTOEUNMD.field772[arg2];
		field8 = arg4;
		field9 = arg6;
		field10 = arg3;
		field11 = arg0;
		field12 = arg1 + arg5;
		field7 = false;
	}

	@ObfuscatedName("AMMGDAXD.a(II)V")
	public final void method4(int arg0) {
		field15 += arg0;
		while (field15 > field13.field776.method375(field14)) {
			field15 -= field13.field776.method375(field14) + 1;
			field14++;
			if (field14 >= field13.field776.field1003 && (field14 < 0 || field14 >= field13.field776.field1003)) {
				field14 = 0;
				field7 = true;
			}
		}
	}

	@ObfuscatedName("AMMGDAXD.a(I)LOGORHYVW;")
	public final OGORHYVW method5() {
		OGORHYVW var1 = field13.method245();
		if (var1 == null) {
			return null;
		}

		int var2 = field13.field776.field1004[field14];
		OGORHYVW var3 = new OGORHYVW(true, var1, OYJABRDD.method467(var2), false);
		if (!field7) {
			var3.method440();
			var3.method441(var2);
			var3.field1140 = null;
			var3.field1139 = null;
		}

		if (field13.field779 != 128 || field13.field780 != 128) {
			var3.method449(field13.field779, field13.field779, field13.field780);
		}

		if (field13.field781 != 0) {
			if (field13.field781 == 90) {
				var3.method444();
			}

			if (field13.field781 == 180) {
				var3.method444();
				var3.method444();
			}

			if (field13.field781 == 270) {
				var3.method444();
				var3.method444();
				var3.method444();
			}
		}

		var3.method450(field13.field782 + 64, field13.field783 + 850, -30, -50, -30, true);
		return var3;
	}
}
