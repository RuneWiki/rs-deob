package deob;

@ObfuscatedName("HMUVVYST")
public final class HMUVVYST extends TFGCPINZ {

	@ObfuscatedName("HMUVVYST.L")
	public boolean field725 = false;

	@ObfuscatedName("HMUVVYST.q")
	public EBBSHPSJ field706;

	@ObfuscatedName("HMUVVYST.K")
	public int field724;

	@ObfuscatedName("HMUVVYST.m")
	public int field702;

	@ObfuscatedName("HMUVVYST.n")
	public int field703;

	@ObfuscatedName("HMUVVYST.o")
	public int field704;

	@ObfuscatedName("HMUVVYST.G")
	public int field720;

	@ObfuscatedName("HMUVVYST.H")
	public int field721;

	@ObfuscatedName("HMUVVYST.x")
	public int field711;

	@ObfuscatedName("HMUVVYST.y")
	public int field712;

	@ObfuscatedName("HMUVVYST.z")
	public int field713;

	@ObfuscatedName("HMUVVYST.p")
	public int field705;

	@ObfuscatedName("HMUVVYST.r")
	public double field707;

	@ObfuscatedName("HMUVVYST.s")
	public double field708;

	@ObfuscatedName("HMUVVYST.t")
	public double field709;

	@ObfuscatedName("HMUVVYST.v")
	public double field710;

	@ObfuscatedName("HMUVVYST.C")
	public double field716;

	@ObfuscatedName("HMUVVYST.D")
	public double field717;

	@ObfuscatedName("HMUVVYST.E")
	public double field718;

	@ObfuscatedName("HMUVVYST.F")
	public double field719;

	@ObfuscatedName("HMUVVYST.A")
	public int field714;

	@ObfuscatedName("HMUVVYST.B")
	public int field715;

	@ObfuscatedName("HMUVVYST.I")
	public int field722;

	@ObfuscatedName("HMUVVYST.J")
	public int field723;

	@ObfuscatedName("HMUVVYST.a(IIZII)V")
	public final void method228(int arg0, int arg1, int arg2, int arg3) {
		if (!field725) {
			double var5 = (double) (arg0 - field702);
			double var7 = (double) (arg3 - field703);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field707 = field712 * var5 / var9 + field702;
			field708 = field712 * var7 / var9 + field703;
			field709 = field704;
		}

		double var11 = (double) (field721 + 1 - arg2);
		field716 = (arg0 - field707) / var11;
		field717 = (arg3 - field708) / var11;
		field718 = Math.sqrt(field717 * field717 + field716 * field716);
		if (!field725) {
			field719 = -field718 * Math.tan(field711 * 0.02454369D);
		}

		field710 = (arg1 - field709 - field719 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("HMUVVYST.a(B)LJJMVUSJJ;")
	public final JJMVUSJJ method214() {
		JJMVUSJJ var1 = field706.method210();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field706.field613 != null) {
			var2 = field706.field613.field1434[field714];
		}

		JJMVUSJJ var3 = new JJMVUSJJ(true, OJYMITMR.method382(var2), false, var1);
		if (var2 != -1) {
			var3.method307();
			var3.method308(var2);
			var3.field834 = null;
			var3.field833 = null;
		}

		if (field706.field616 != 128 || field706.field617 != 128) {
			var3.method316(field706.field617, field706.field616, field706.field616);
		}

		var3.method312(field723);
		var3.method317(field706.field619 + 64, field706.field620 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("HMUVVYST.a(ZI)V")
	public final void method229(int arg0) {
		field725 = true;
		field707 += arg0 * field716;
		field708 += arg0 * field717;
		field709 += field710 * 0.5D * arg0 * arg0 + arg0 * field719;
		field719 += arg0 * field710;
		field722 = (int) (Math.atan2(field716, field717) * 325.949D) + 1024 & 0x7FF;
		field723 = (int) (Math.atan2(field719, field718) * 325.949D) & 0x7FF;

		if (field706.field613 != null) {
			field715 += arg0;
			while (field715 > field706.field613.method532(field714)) {
				field715 -= field706.field613.method532(field714);
				field714++;
				if (field714 >= field706.field613.field1433) {
					field714 = 0;
				}
			}
		}
	}

	public HMUVVYST(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field706 = EBBSHPSJ.field609[arg9];
		field724 = arg7;
		field702 = arg10;
		field703 = arg8;
		field704 = arg1;
		field720 = arg0;
		field721 = arg2;
		field711 = arg3;
		field712 = arg5;
		field713 = arg4;
		field705 = arg6;
		field725 = false;
	}
}
