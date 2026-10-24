package deob;

@ObfuscatedName("HEJSGXMA")
public final class HEJSGXMA extends FKSXNQOK {

	@ObfuscatedName("HEJSGXMA.m")
	public boolean field672 = false;

	@ObfuscatedName("HEJSGXMA.t")
	public UAVNMKVJ field679;

	@ObfuscatedName("HEJSGXMA.z")
	public int field683;

	@ObfuscatedName("HEJSGXMA.A")
	public int field684;

	@ObfuscatedName("HEJSGXMA.B")
	public int field685;

	@ObfuscatedName("HEJSGXMA.C")
	public int field686;

	@ObfuscatedName("HEJSGXMA.r")
	public int field677;

	@ObfuscatedName("HEJSGXMA.s")
	public int field678;

	@ObfuscatedName("HEJSGXMA.F")
	public int field688;

	@ObfuscatedName("HEJSGXMA.G")
	public int field689;

	@ObfuscatedName("HEJSGXMA.H")
	public int field690;

	@ObfuscatedName("HEJSGXMA.D")
	public int field687;

	@ObfuscatedName("HEJSGXMA.n")
	public double field673;

	@ObfuscatedName("HEJSGXMA.o")
	public double field674;

	@ObfuscatedName("HEJSGXMA.p")
	public double field675;

	@ObfuscatedName("HEJSGXMA.q")
	public double field676;

	@ObfuscatedName("HEJSGXMA.u")
	public double field680;

	@ObfuscatedName("HEJSGXMA.v")
	public double field681;

	@ObfuscatedName("HEJSGXMA.w")
	public double field682;

	@ObfuscatedName("HEJSGXMA.M")
	public double field693;

	@ObfuscatedName("HEJSGXMA.J")
	public int field691;

	@ObfuscatedName("HEJSGXMA.K")
	public int field692;

	@ObfuscatedName("HEJSGXMA.N")
	public int field694;

	@ObfuscatedName("HEJSGXMA.O")
	public int field695;

	@ObfuscatedName("HEJSGXMA.a(II)V")
	public final void method286(int arg0) {
		field672 = true;
		field680 += arg0 * field673;
		field681 += arg0 * field674;
		field682 += field693 * 0.5D * arg0 * arg0 + arg0 * field676;
		field676 += arg0 * field693;
		field691 = (int) (Math.atan2(field673, field674) * 325.949D) + 1024 & 0x7FF;
		field692 = (int) (Math.atan2(field676, field675) * 325.949D) & 0x7FF;

		if (field679.field1337 != null) {
			field695 += arg0;
			while (field695 > field679.field1337.method361(field694)) {
				field695 -= field679.field1337.method361(field694) + 1;
				field694++;
				if (field694 >= field679.field1337.field796) {
					field694 = 0;
				}
			}
		}
	}

	public HEJSGXMA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field679 = UAVNMKVJ.field1333[arg0];
		field683 = arg10;
		field684 = arg2;
		field685 = arg6;
		field686 = arg5;
		field677 = arg1;
		field678 = arg7;
		field688 = arg9;
		field689 = arg4;
		field690 = arg3;
		field687 = arg8;
		field672 = false;
	}

	@ObfuscatedName("HEJSGXMA.a(IIIIZ)V")
	public final void method287(int arg0, int arg1, int arg2, int arg3) {
		if (!field672) {
			double var5 = (double) (arg1 - field684);
			double var7 = (double) (arg2 - field685);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field680 = field689 * var5 / var9 + field684;
			field681 = field689 * var7 / var9 + field685;
			field682 = field686;
		}

		double var11 = (double) (field678 + 1 - arg3);
		field673 = (arg1 - field680) / var11;
		field674 = (arg2 - field681) / var11;
		field675 = Math.sqrt(field674 * field674 + field673 * field673);
		if (!field672) {
			field676 = -field675 * Math.tan(field688 * 0.02454369D);
		}

		field693 = (arg0 - field682 - field676 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("HEJSGXMA.a(I)LRTQSBWRH;")
	public final RTQSBWRH method199() {
		RTQSBWRH var1 = field679.method502();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field679.field1337 != null) {
			var2 = field679.field1337.field797[field694];
		}

		RTQSBWRH var3 = new RTQSBWRH(true, EMBMBPSC.method229(var2), var1, false);
		if (var2 != -1) {
			var3.method461();
			var3.method462(var2);
			var3.field1127 = null;
			var3.field1126 = null;
		}

		if (field679.field1340 != 128 || field679.field1341 != 128) {
			var3.method470(field679.field1341, field679.field1340, field679.field1340);
		}

		var3.method466(field692);
		var3.method471(field679.field1343 + 64, field679.field1344 + 850, -30, -50, -30, true);
		return var3;
	}
}
