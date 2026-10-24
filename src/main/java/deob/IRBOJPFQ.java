package deob;

@ObfuscatedName("IRBOJPFQ")
public final class IRBOJPFQ extends PJUTMHMD {

	@ObfuscatedName("IRBOJPFQ.v")
	public boolean field774 = false;

	@ObfuscatedName("IRBOJPFQ.M")
	public int field789 = -17838;

	@ObfuscatedName("IRBOJPFQ.u")
	public XHDTVZNY field773;

	@ObfuscatedName("IRBOJPFQ.m")
	public int field765;

	@ObfuscatedName("IRBOJPFQ.B")
	public int field778;

	@ObfuscatedName("IRBOJPFQ.C")
	public int field779;

	@ObfuscatedName("IRBOJPFQ.D")
	public int field780;

	@ObfuscatedName("IRBOJPFQ.w")
	public int field775;

	@ObfuscatedName("IRBOJPFQ.x")
	public int field776;

	@ObfuscatedName("IRBOJPFQ.J")
	public int field786;

	@ObfuscatedName("IRBOJPFQ.K")
	public int field787;

	@ObfuscatedName("IRBOJPFQ.L")
	public int field788;

	@ObfuscatedName("IRBOJPFQ.E")
	public int field781;

	@ObfuscatedName("IRBOJPFQ.r")
	public double field770;

	@ObfuscatedName("IRBOJPFQ.s")
	public double field771;

	@ObfuscatedName("IRBOJPFQ.t")
	public double field772;

	@ObfuscatedName("IRBOJPFQ.y")
	public double field777;

	@ObfuscatedName("IRBOJPFQ.F")
	public double field782;

	@ObfuscatedName("IRBOJPFQ.G")
	public double field783;

	@ObfuscatedName("IRBOJPFQ.H")
	public double field784;

	@ObfuscatedName("IRBOJPFQ.I")
	public double field785;

	@ObfuscatedName("IRBOJPFQ.n")
	public int field766;

	@ObfuscatedName("IRBOJPFQ.o")
	public int field767;

	@ObfuscatedName("IRBOJPFQ.p")
	public int field768;

	@ObfuscatedName("IRBOJPFQ.q")
	public int field769;

	@ObfuscatedName("IRBOJPFQ.a(IIZII)V")
	public final void method339(int arg0, int arg1, int arg2, int arg3) {
		if (!field774) {
			double var5 = (double) (arg1 - field778);
			double var7 = (double) (arg0 - field779);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field770 = field787 * var5 / var9 + field778;
			field771 = field787 * var7 / var9 + field779;
			field772 = field780;
		}

		double var11 = (double) (field776 + 1 - arg3);
		field782 = (arg1 - field770) / var11;
		field783 = (arg0 - field771) / var11;
		field784 = Math.sqrt(field783 * field783 + field782 * field782);
		if (!field774) {
			field785 = -field784 * Math.tan(field786 * 0.02454369D);
		}

		field777 = (arg2 - field772 - field785 * var11) * 2.0D / (var11 * var11);
	}

	public IRBOJPFQ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (field789 != arg4) {
			field789 = -401;
		}

		field773 = XHDTVZNY.field1398[arg10];
		field765 = arg9;
		field778 = arg7;
		field779 = arg6;
		field780 = arg0;
		field775 = arg1;
		field776 = arg2;
		field786 = arg3;
		field787 = arg5;
		field788 = arg8;
		field781 = arg11;
		field774 = false;
	}

	@ObfuscatedName("IRBOJPFQ.a(I)LVHYCWIPJ;")
	public final VHYCWIPJ method217() {
		VHYCWIPJ var1 = field773.method579();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field773.field1402 != null) {
			var2 = field773.field1402.field1325[field768];
		}

		VHYCWIPJ var3 = new VHYCWIPJ(TTZHVWEG.method489(var2), true, false, var1);
		if (var2 != -1) {
			var3.method507();
			var3.method508(var2);
			var3.field1210 = null;
			var3.field1209 = null;
		}

		if (field773.field1405 != 128 || field773.field1406 != 128) {
			var3.method516(field773.field1405, field773.field1405, field773.field1406);
		}

		var3.method512(field767);
		var3.method517(field773.field1408 + 64, field773.field1409 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("IRBOJPFQ.a(ZI)V")
	public final void method340(int arg0) {
		field774 = true;
		field770 += arg0 * field782;
		field771 += arg0 * field783;
		field772 += field777 * 0.5D * arg0 * arg0 + arg0 * field785;
		field785 += arg0 * field777;
		field766 = (int) (Math.atan2(field782, field783) * 325.949D) + 1024 & 0x7FF;
		field767 = (int) (Math.atan2(field785, field784) * 325.949D) & 0x7FF;

		if (field773.field1402 != null) {
			field769 += arg0;
			while (field769 > field773.field1402.method549(field768)) {
				field769 -= field773.field1402.method549(field768) + 1;
				field768++;
				if (field768 >= field773.field1402.field1324) {
					field768 = 0;
				}
			}
		}
	}
}
