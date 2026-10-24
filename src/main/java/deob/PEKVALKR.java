package deob;

@ObfuscatedName("PEKVALKR")
public final class PEKVALKR extends JNFESWRD {

	@ObfuscatedName("PEKVALKR.t")
	public boolean field1065 = false;

	@ObfuscatedName("PEKVALKR.n")
	public RTDMFIDA field1060;

	@ObfuscatedName("PEKVALKR.o")
	public int field1061;

	@ObfuscatedName("PEKVALKR.p")
	public int field1062;

	@ObfuscatedName("PEKVALKR.q")
	public int field1063;

	@ObfuscatedName("PEKVALKR.r")
	public int field1064;

	@ObfuscatedName("PEKVALKR.k")
	public int field1057;

	@ObfuscatedName("PEKVALKR.l")
	public int field1058;

	@ObfuscatedName("PEKVALKR.m")
	public int field1059;

	@ObfuscatedName("PEKVALKR.a(Z)LIYSWJGDE;")
	public final IYSWJGDE method2() {
		IYSWJGDE var1 = field1060.method448();
		if (var1 == null) {
			return null;
		}

		int var2 = field1060.field1205.field827[field1058];
		IYSWJGDE var3 = new IYSWJGDE(PLSPTEPI.method406(var2), var1, true, false);
		if (!field1065) {
			var3.method280();
			var3.method281(var2);
			var3.field751 = null;
			var3.field750 = null;
		}

		if (field1060.field1208 != 128 || field1060.field1209 != 128) {
			var3.method289(field1060.field1208, field1060.field1208, field1060.field1209);
		}

		if (field1060.field1210 != 0) {
			if (field1060.field1210 == 90) {
				var3.method284();
			}

			if (field1060.field1210 == 180) {
				var3.method284();
				var3.method284();
			}

			if (field1060.field1210 == 270) {
				var3.method284();
				var3.method284();
				var3.method284();
			}
		}

		var3.method290(field1060.field1211 + 64, field1060.field1212 + 850, -30, -50, -30, true);
		return var3;
	}

	public PEKVALKR(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1060 = RTDMFIDA.field1201[arg2];
		field1061 = arg0;
		field1062 = arg6;
		field1063 = arg3;
		field1064 = arg5;
		field1057 = arg1 + arg4;
		field1065 = false;
	}

	@ObfuscatedName("PEKVALKR.a(IZ)V")
	public final void method393(int arg0) {
		field1059 += arg0;
		while (field1059 > field1060.field1205.method320(field1058)) {
			field1059 -= field1060.field1205.method320(field1058) + 1;
			field1058++;
			if (field1058 >= field1060.field1205.field826 && (field1058 < 0 || field1058 >= field1060.field1205.field826)) {
				field1058 = 0;
				field1065 = true;
			}
		}
	}
}
