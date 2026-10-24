package deob;

@ObfuscatedName("GVHVJOWK")
public final class GVHVJOWK extends BBIXHJOC {

	@ObfuscatedName("GVHVJOWK.I")
	public boolean field667 = false;

	@ObfuscatedName("GVHVJOWK.L")
	public MKJLFPRH field670;

	@ObfuscatedName("GVHVJOWK.M")
	public int field671;

	@ObfuscatedName("GVHVJOWK.A")
	public int field661;

	@ObfuscatedName("GVHVJOWK.B")
	public int field662;

	@ObfuscatedName("GVHVJOWK.C")
	public int field663;

	@ObfuscatedName("GVHVJOWK.y")
	public int field659;

	@ObfuscatedName("GVHVJOWK.z")
	public int field660;

	@ObfuscatedName("GVHVJOWK.m")
	public int field648;

	@ObfuscatedName("GVHVJOWK.n")
	public int field649;

	@ObfuscatedName("GVHVJOWK.o")
	public int field650;

	@ObfuscatedName("GVHVJOWK.D")
	public int field664;

	@ObfuscatedName("GVHVJOWK.p")
	public double field651;

	@ObfuscatedName("GVHVJOWK.r")
	public double field652;

	@ObfuscatedName("GVHVJOWK.s")
	public double field653;

	@ObfuscatedName("GVHVJOWK.t")
	public double field654;

	@ObfuscatedName("GVHVJOWK.u")
	public double field655;

	@ObfuscatedName("GVHVJOWK.v")
	public double field656;

	@ObfuscatedName("GVHVJOWK.w")
	public double field657;

	@ObfuscatedName("GVHVJOWK.x")
	public double field658;

	@ObfuscatedName("GVHVJOWK.F")
	public int field665;

	@ObfuscatedName("GVHVJOWK.G")
	public int field666;

	@ObfuscatedName("GVHVJOWK.J")
	public int field668;

	@ObfuscatedName("GVHVJOWK.K")
	public int field669;

	public GVHVJOWK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field670 = MKJLFPRH.field1051[arg4];
		field671 = arg5;
		field661 = arg10;
		field662 = arg0;
		field663 = arg9;
		field659 = arg6;
		field660 = arg3;
		field648 = arg8;
		field649 = arg2;
		field650 = arg7;
		field664 = arg1;
		field667 = false;
	}

	@ObfuscatedName("GVHVJOWK.a(I)LJLNSJQDR;")
	public final JLNSJQDR method2() {
		JLNSJQDR var1 = field670.method423();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field670.field1055 != null) {
			var2 = field670.field1055.field1154[field668];
		}

		JLNSJQDR var3 = new JLNSJQDR(UIZESDZR.method524(var2), false, true, var1);
		if (var2 != -1) {
			var3.method335();
			var3.method336(var2);
			var3.field854 = null;
			var3.field853 = null;
		}

		if (field670.field1058 != 128 || field670.field1059 != 128) {
			var3.method344(field670.field1058, field670.field1059, field670.field1058);
		}

		var3.method340(field666);
		var3.method345(field670.field1061 + 64, field670.field1062 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("GVHVJOWK.a(IIIII)V")
	public final void method242(int arg0, int arg1, int arg2, int arg3) {
		if (!field667) {
			double var5 = (double) (arg0 - field661);
			double var7 = (double) (arg3 - field662);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field656 = field649 * var5 / var9 + field661;
			field657 = field649 * var7 / var9 + field662;
			field658 = field663;
		}

		double var11 = (double) (field660 + 1 - arg2);
		field652 = (arg0 - field656) / var11;
		field653 = (arg3 - field657) / var11;
		field654 = Math.sqrt(field653 * field653 + field652 * field652);
		if (!field667) {
			field655 = -field654 * Math.tan(field648 * 0.02454369D);
		}

		field651 = (arg1 - field658 - field655 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("GVHVJOWK.a(II)V")
	public final void method243(int arg0) {
		field667 = true;
		field656 += arg0 * field652;
		field657 += arg0 * field653;
		field658 += field651 * 0.5D * arg0 * arg0 + arg0 * field655;
		field655 += arg0 * field651;
		field665 = (int) (Math.atan2(field652, field653) * 325.949D) + 1024 & 0x7FF;
		field666 = (int) (Math.atan2(field655, field654) * 325.949D) & 0x7FF;

		if (field670.field1055 != null) {
			field669 += arg0;
			while (field669 > field670.field1055.method457(field668)) {
				field669 -= field670.field1055.method457(field668) + 1;
				field668++;
				if (field668 >= field670.field1055.field1153) {
					field668 = 0;
				}
			}
		}
	}
}
