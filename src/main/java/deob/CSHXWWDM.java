package deob;

@ObfuscatedName("CSHXWWDM")
public final class CSHXWWDM extends JEESRQGR {

	@ObfuscatedName("CSHXWWDM.v")
	public boolean field585 = false;

	@ObfuscatedName("CSHXWWDM.w")
	public BKJQHSVH field586;

	@ObfuscatedName("CSHXWWDM.C")
	public int field591;

	@ObfuscatedName("CSHXWWDM.r")
	public int field581;

	@ObfuscatedName("CSHXWWDM.s")
	public int field582;

	@ObfuscatedName("CSHXWWDM.t")
	public int field583;

	@ObfuscatedName("CSHXWWDM.l")
	public int field575;

	@ObfuscatedName("CSHXWWDM.m")
	public int field576;

	@ObfuscatedName("CSHXWWDM.E")
	public int field592;

	@ObfuscatedName("CSHXWWDM.F")
	public int field593;

	@ObfuscatedName("CSHXWWDM.G")
	public int field594;

	@ObfuscatedName("CSHXWWDM.u")
	public int field584;

	@ObfuscatedName("CSHXWWDM.n")
	public double field577;

	@ObfuscatedName("CSHXWWDM.o")
	public double field578;

	@ObfuscatedName("CSHXWWDM.p")
	public double field579;

	@ObfuscatedName("CSHXWWDM.q")
	public double field580;

	@ObfuscatedName("CSHXWWDM.H")
	public double field595;

	@ObfuscatedName("CSHXWWDM.I")
	public double field596;

	@ObfuscatedName("CSHXWWDM.J")
	public double field597;

	@ObfuscatedName("CSHXWWDM.K")
	public double field598;

	@ObfuscatedName("CSHXWWDM.x")
	public int field587;

	@ObfuscatedName("CSHXWWDM.y")
	public int field588;

	@ObfuscatedName("CSHXWWDM.z")
	public int field589;

	@ObfuscatedName("CSHXWWDM.A")
	public int field590;

	@ObfuscatedName("CSHXWWDM.a(IIIZI)V")
	public final void method189(int arg0, int arg1, int arg2, int arg3) {
		if (!field585) {
			double var5 = (double) (arg0 - field581);
			double var7 = (double) (arg3 - field582);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field577 = field593 * var5 / var9 + field581;
			field578 = field593 * var7 / var9 + field582;
			field579 = field583;
		}

		double var11 = (double) (field576 + 1 - arg2);
		field595 = (arg0 - field577) / var11;
		field596 = (arg3 - field578) / var11;
		field597 = Math.sqrt(field596 * field596 + field595 * field595);
		if (!field585) {
			field598 = -field597 * Math.tan(field592 * 0.02454369D);
		}

		field580 = (arg1 - field579 - field598 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("CSHXWWDM.a(II)V")
	public final void method190(int arg0) {
		field585 = true;
		field577 += arg0 * field595;
		field578 += arg0 * field596;
		field579 += field580 * 0.5D * arg0 * arg0 + arg0 * field598;
		field598 += arg0 * field580;
		field589 = (int) (Math.atan2(field595, field596) * 325.949D) + 1024 & 0x7FF;
		field590 = (int) (Math.atan2(field598, field597) * 325.949D) & 0x7FF;

		if (field586.field57 != null) {
			field588 += arg0;
			while (field588 > field586.field57.method319(field587)) {
				field588 -= field586.field57.method319(field587) + 1;
				field587++;
				if (field587 >= field586.field57.field1045) {
					field587 = 0;
				}
			}
		}
	}

	public CSHXWWDM(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field586 = BKJQHSVH.field53[arg9];
		field591 = arg7;
		field581 = arg0;
		field582 = arg10;
		field583 = arg1;
		field575 = arg8;
		field576 = arg3;
		field592 = arg2;
		field593 = arg4;
		field594 = arg5;
		field584 = arg6;
		field585 = false;
	}

	@ObfuscatedName("CSHXWWDM.a(I)LVYUQHOMO;")
	public final VYUQHOMO method13() {
		VYUQHOMO var1 = field586.method16();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field586.field57 != null) {
			var2 = field586.field57.field1046[field587];
		}

		VYUQHOMO var3 = new VYUQHOMO(true, APJPJMYV.method11(var2), var1, false);
		if (var2 != -1) {
			var3.method414();
			var3.method415(var2);
			var3.field1323 = null;
			var3.field1322 = null;
		}

		if (field586.field60 != 128 || field586.field61 != 128) {
			var3.method423(field586.field60, field586.field61, field586.field60);
		}

		var3.method419(field590);
		var3.method424(field586.field63 + 64, field586.field64 + 850, -30, -50, -30, true);
		return var3;
	}
}
