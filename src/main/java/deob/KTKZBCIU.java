package deob;

@ObfuscatedName("KTKZBCIU")
public final class KTKZBCIU extends CRKDFBCP {

	@ObfuscatedName("KTKZBCIU.G")
	public boolean field1039 = false;

	@ObfuscatedName("KTKZBCIU.l")
	public HTOEUNMD field1018;

	@ObfuscatedName("KTKZBCIU.p")
	public int field1022;

	@ObfuscatedName("KTKZBCIU.q")
	public int field1023;

	@ObfuscatedName("KTKZBCIU.r")
	public int field1024;

	@ObfuscatedName("KTKZBCIU.s")
	public int field1025;

	@ObfuscatedName("KTKZBCIU.m")
	public int field1019;

	@ObfuscatedName("KTKZBCIU.n")
	public int field1020;

	@ObfuscatedName("KTKZBCIU.D")
	public int field1036;

	@ObfuscatedName("KTKZBCIU.E")
	public int field1037;

	@ObfuscatedName("KTKZBCIU.F")
	public int field1038;

	@ObfuscatedName("KTKZBCIU.t")
	public int field1026;

	@ObfuscatedName("KTKZBCIU.o")
	public double field1021;

	@ObfuscatedName("KTKZBCIU.w")
	public double field1029;

	@ObfuscatedName("KTKZBCIU.x")
	public double field1030;

	@ObfuscatedName("KTKZBCIU.y")
	public double field1031;

	@ObfuscatedName("KTKZBCIU.z")
	public double field1032;

	@ObfuscatedName("KTKZBCIU.A")
	public double field1033;

	@ObfuscatedName("KTKZBCIU.B")
	public double field1034;

	@ObfuscatedName("KTKZBCIU.C")
	public double field1035;

	@ObfuscatedName("KTKZBCIU.u")
	public int field1027;

	@ObfuscatedName("KTKZBCIU.v")
	public int field1028;

	@ObfuscatedName("KTKZBCIU.I")
	public int field1040;

	@ObfuscatedName("KTKZBCIU.J")
	public int field1041;

	@ObfuscatedName("KTKZBCIU.a(I)LOGORHYVW;")
	public final OGORHYVW method5() {
		OGORHYVW var1 = field1018.method245();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1018.field776 != null) {
			var2 = field1018.field776.field1004[field1027];
		}

		OGORHYVW var3 = new OGORHYVW(true, var1, OYJABRDD.method467(var2), false);
		if (var2 != -1) {
			var3.method440();
			var3.method441(var2);
			var3.field1140 = null;
			var3.field1139 = null;
		}

		if (field1018.field779 != 128 || field1018.field780 != 128) {
			var3.method449(field1018.field779, field1018.field779, field1018.field780);
		}

		var3.method445(field1041);
		var3.method450(field1018.field782 + 64, field1018.field783 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("KTKZBCIU.a(IIIII)V")
	public final void method377(int arg0, int arg1, int arg2, int arg3) {
		if (!field1039) {
			double var5 = (double) (arg2 - field1023);
			double var7 = (double) (arg0 - field1024);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1033 = field1037 * var5 / var9 + field1023;
			field1034 = field1037 * var7 / var9 + field1024;
			field1035 = field1025;
		}

		double var11 = (double) (field1020 + 1 - arg3);
		field1029 = (arg2 - field1033) / var11;
		field1030 = (arg0 - field1034) / var11;
		field1031 = Math.sqrt(field1030 * field1030 + field1029 * field1029);
		if (!field1039) {
			field1032 = -field1031 * Math.tan(field1036 * 0.02454369D);
		}

		field1021 = (arg1 - field1035 - field1032 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("KTKZBCIU.a(IZ)V")
	public final void method378(int arg0) {
		field1039 = true;
		field1033 += arg0 * field1029;
		field1034 += arg0 * field1030;
		field1035 += field1021 * 0.5D * arg0 * arg0 + arg0 * field1032;
		field1032 += arg0 * field1021;
		field1040 = (int) (Math.atan2(field1029, field1030) * 325.949D) + 1024 & 0x7FF;
		field1041 = (int) (Math.atan2(field1032, field1031) * 325.949D) & 0x7FF;

		if (field1018.field776 != null) {
			field1028 += arg0;
			while (field1028 > field1018.field776.method375(field1027)) {
				field1028 -= field1018.field776.method375(field1027) + 1;
				field1027++;
				if (field1027 >= field1018.field776.field1003) {
					field1027 = 0;
				}
			}
		}
	}

	public KTKZBCIU(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1018 = HTOEUNMD.field772[arg1];
		field1022 = arg8;
		field1023 = arg6;
		field1024 = arg10;
		field1025 = arg0;
		field1019 = arg7;
		field1020 = arg2;
		field1036 = arg5;
		field1037 = arg3;
		field1038 = arg9;
		field1026 = arg4;
		field1039 = false;
	}
}
