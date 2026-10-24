package deob;

@ObfuscatedName("IJDLXEFP")
public final class IJDLXEFP extends UPHLHIWQ {

	@ObfuscatedName("IJDLXEFP.y")
	public boolean field817 = false;

	@ObfuscatedName("IJDLXEFP.J")
	public HTWOTIWO field828;

	@ObfuscatedName("IJDLXEFP.I")
	public int field827;

	@ObfuscatedName("IJDLXEFP.l")
	public int field805;

	@ObfuscatedName("IJDLXEFP.m")
	public int field806;

	@ObfuscatedName("IJDLXEFP.n")
	public int field807;

	@ObfuscatedName("IJDLXEFP.D")
	public int field822;

	@ObfuscatedName("IJDLXEFP.E")
	public int field823;

	@ObfuscatedName("IJDLXEFP.F")
	public int field824;

	@ObfuscatedName("IJDLXEFP.G")
	public int field825;

	@ObfuscatedName("IJDLXEFP.H")
	public int field826;

	@ObfuscatedName("IJDLXEFP.o")
	public int field808;

	@ObfuscatedName("IJDLXEFP.q")
	public double field809;

	@ObfuscatedName("IJDLXEFP.r")
	public double field810;

	@ObfuscatedName("IJDLXEFP.s")
	public double field811;

	@ObfuscatedName("IJDLXEFP.t")
	public double field812;

	@ObfuscatedName("IJDLXEFP.u")
	public double field813;

	@ObfuscatedName("IJDLXEFP.v")
	public double field814;

	@ObfuscatedName("IJDLXEFP.w")
	public double field815;

	@ObfuscatedName("IJDLXEFP.x")
	public double field816;

	@ObfuscatedName("IJDLXEFP.z")
	public int field818;

	@ObfuscatedName("IJDLXEFP.A")
	public int field819;

	@ObfuscatedName("IJDLXEFP.B")
	public int field820;

	@ObfuscatedName("IJDLXEFP.C")
	public int field821;

	@ObfuscatedName("IJDLXEFP.a(I)LPSGMMDJS;")
	public final PSGMMDJS method196() {
		PSGMMDJS var1 = field828.method251();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field828.field782 != null) {
			var2 = field828.field782.field588[field820];
		}

		PSGMMDJS var3 = new PSGMMDJS(var1, AOFTXYIM.method5(var2), true, false);
		if (var2 != -1) {
			var3.method417();
			var3.method418(var2);
			var3.field1028 = null;
			var3.field1027 = null;
		}

		if (field828.field785 != 128 || field828.field786 != 128) {
			var3.method426(field828.field786, field828.field785, field828.field785);
		}

		var3.method422(field819);
		var3.method427(field828.field788 + 64, field828.field789 + 850, -30, -50, -30, true);
		return var3;
	}

	public IJDLXEFP(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field828 = HTWOTIWO.field778[arg7];
		field827 = arg8;
		field805 = arg4;
		field806 = arg0;
		field807 = arg3;
		field822 = arg6;
		field823 = arg10;
		field824 = arg1;
		field825 = arg5;
		field826 = arg9;
		field808 = arg2;
		field817 = false;
	}

	@ObfuscatedName("IJDLXEFP.a(II)V")
	public final void method252(int arg0) {
		field817 = true;
		field814 += arg0 * field810;
		field815 += arg0 * field811;
		field816 += field809 * 0.5D * arg0 * arg0 + arg0 * field813;
		field813 += arg0 * field809;
		field818 = (int) (Math.atan2(field810, field811) * 325.949D) + 1024 & 0x7FF;
		field819 = (int) (Math.atan2(field813, field812) * 325.949D) & 0x7FF;

		if (field828.field782 != null) {
			field821 += arg0;
			while (field821 > field828.field782.method215(field820)) {
				field821 -= field828.field782.method215(field820) + 1;
				field820++;
				if (field820 >= field828.field782.field587) {
					field820 = 0;
				}
			}
		}
	}

	@ObfuscatedName("IJDLXEFP.a(IBIII)V")
	public final void method253(int arg0, int arg1, int arg2, int arg3) {
		if (!field817) {
			double var5 = (double) (arg0 - field805);
			double var7 = (double) (arg1 - field806);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field814 = field825 * var5 / var9 + field805;
			field815 = field825 * var7 / var9 + field806;
			field816 = field807;
		}

		double var11 = (double) (field823 + 1 - arg2);
		field810 = (arg0 - field814) / var11;
		field811 = (arg1 - field815) / var11;
		field812 = Math.sqrt(field811 * field811 + field810 * field810);
		if (!field817) {
			field813 = -field812 * Math.tan(field824 * 0.02454369D);
		}

		field809 = (arg3 - field816 - field813 * var11) * 2.0D / (var11 * var11);
	}
}
