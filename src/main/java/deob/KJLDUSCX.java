package deob;

@ObfuscatedName("KJLDUSCX")
public final class KJLDUSCX extends XEUTUWWF {

	@ObfuscatedName("KJLDUSCX.n")
	public boolean field805 = false;

	@ObfuscatedName("KJLDUSCX.x")
	public NGIGHQOG field815;

	@ObfuscatedName("KJLDUSCX.w")
	public int field814;

	@ObfuscatedName("KJLDUSCX.C")
	public int field819;

	@ObfuscatedName("KJLDUSCX.D")
	public int field820;

	@ObfuscatedName("KJLDUSCX.E")
	public int field821;

	@ObfuscatedName("KJLDUSCX.l")
	public int field803;

	@ObfuscatedName("KJLDUSCX.m")
	public int field804;

	@ObfuscatedName("KJLDUSCX.y")
	public int field816;

	@ObfuscatedName("KJLDUSCX.z")
	public int field817;

	@ObfuscatedName("KJLDUSCX.A")
	public int field818;

	@ObfuscatedName("KJLDUSCX.F")
	public int field822;

	@ObfuscatedName("KJLDUSCX.o")
	public double field806;

	@ObfuscatedName("KJLDUSCX.p")
	public double field807;

	@ObfuscatedName("KJLDUSCX.q")
	public double field808;

	@ObfuscatedName("KJLDUSCX.r")
	public double field809;

	@ObfuscatedName("KJLDUSCX.s")
	public double field810;

	@ObfuscatedName("KJLDUSCX.t")
	public double field811;

	@ObfuscatedName("KJLDUSCX.u")
	public double field812;

	@ObfuscatedName("KJLDUSCX.v")
	public double field813;

	@ObfuscatedName("KJLDUSCX.G")
	public int field823;

	@ObfuscatedName("KJLDUSCX.H")
	public int field824;

	@ObfuscatedName("KJLDUSCX.I")
	public int field825;

	@ObfuscatedName("KJLDUSCX.J")
	public int field826;

	@ObfuscatedName("KJLDUSCX.a(ZI)V")
	public final void method302(int arg0) {
		field805 = true;
		field810 += arg0 * field806;
		field811 += arg0 * field807;
		field812 += field813 * 0.5D * arg0 * arg0 + arg0 * field809;
		field809 += arg0 * field813;
		field823 = (int) (Math.atan2(field806, field807) * 325.949D) + 1024 & 0x7FF;
		field824 = (int) (Math.atan2(field809, field808) * 325.949D) & 0x7FF;

		if (field815.field990 != null) {
			field826 += arg0;
			while (field826 > field815.field990.method598(field825)) {
				field826 -= field815.field990.method598(field825) + 1;
				field825++;
				if (field825 >= field815.field990.field1482) {
					field825 = 0;
				}
			}
		}
	}

	public KJLDUSCX(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field815 = NGIGHQOG.field986[arg10];
		field814 = arg5;
		field819 = arg8;
		field820 = arg3;
		field821 = arg9;
		field803 = arg0;
		field804 = arg7;
		field816 = arg6;
		field817 = arg4;
		field818 = arg2;
		field822 = arg1;
		field805 = false;
	}

	@ObfuscatedName("KJLDUSCX.a(B)LSNMMQNPZ;")
	public final SNMMQNPZ method175() {
		SNMMQNPZ var1 = field815.method351();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field815.field990 != null) {
			var2 = field815.field990.field1483[field825];
		}

		SNMMQNPZ var3 = new SNMMQNPZ(var1, false, true, NLIOLBXV.method356(var2));
		if (var2 != -1) {
			var3.method425();
			var3.method426(var2);
			var3.field1185 = null;
			var3.field1184 = null;
		}

		if (field815.field993 != 128 || field815.field994 != 128) {
			var3.method434(field815.field993, field815.field993, field815.field994);
		}

		var3.method430(field824);
		var3.method435(field815.field996 + 64, field815.field997 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("KJLDUSCX.a(IIIII)V")
	public final void method303(int arg0, int arg1, int arg2, int arg3) {
		if (!field805) {
			double var5 = (double) (arg1 - field819);
			double var7 = (double) (arg3 - field820);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field810 = field817 * var5 / var9 + field819;
			field811 = field817 * var7 / var9 + field820;
			field812 = field821;
		}

		double var11 = (double) (field804 + 1 - arg0);
		field806 = (arg1 - field810) / var11;
		field807 = (arg3 - field811) / var11;
		field808 = Math.sqrt(field807 * field807 + field806 * field806);
		if (!field805) {
			field809 = -field808 * Math.tan(field816 * 0.02454369D);
		}

		field813 = (arg2 - field812 - field809 * var11) * 2.0D / (var11 * var11);
	}
}
