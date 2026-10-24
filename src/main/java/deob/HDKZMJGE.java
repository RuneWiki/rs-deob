package deob;

@ObfuscatedName("HDKZMJGE")
public final class HDKZMJGE extends MODNYPGG {

	@ObfuscatedName("HDKZMJGE.y")
	public boolean field632 = false;

	@ObfuscatedName("HDKZMJGE.w")
	public FOXTQZWB field631;

	@ObfuscatedName("HDKZMJGE.K")
	public int field644;

	@ObfuscatedName("HDKZMJGE.C")
	public int field636;

	@ObfuscatedName("HDKZMJGE.D")
	public int field637;

	@ObfuscatedName("HDKZMJGE.E")
	public int field638;

	@ObfuscatedName("HDKZMJGE.u")
	public int field629;

	@ObfuscatedName("HDKZMJGE.v")
	public int field630;

	@ObfuscatedName("HDKZMJGE.H")
	public int field641;

	@ObfuscatedName("HDKZMJGE.I")
	public int field642;

	@ObfuscatedName("HDKZMJGE.J")
	public int field643;

	@ObfuscatedName("HDKZMJGE.F")
	public int field639;

	@ObfuscatedName("HDKZMJGE.p")
	public double field625;

	@ObfuscatedName("HDKZMJGE.q")
	public double field626;

	@ObfuscatedName("HDKZMJGE.r")
	public double field627;

	@ObfuscatedName("HDKZMJGE.s")
	public double field628;

	@ObfuscatedName("HDKZMJGE.z")
	public double field633;

	@ObfuscatedName("HDKZMJGE.A")
	public double field634;

	@ObfuscatedName("HDKZMJGE.B")
	public double field635;

	@ObfuscatedName("HDKZMJGE.G")
	public double field640;

	@ObfuscatedName("HDKZMJGE.n")
	public int field623;

	@ObfuscatedName("HDKZMJGE.o")
	public int field624;

	@ObfuscatedName("HDKZMJGE.M")
	public int field645;

	@ObfuscatedName("HDKZMJGE.N")
	public int field646;

	@ObfuscatedName("HDKZMJGE.a(BIIII)V")
	public final void method217(int arg0, int arg1, int arg2, int arg3) {
		if (!field632) {
			double var5 = (double) (arg0 - field636);
			double var7 = (double) (arg2 - field637);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field633 = field642 * var5 / var9 + field636;
			field634 = field642 * var7 / var9 + field637;
			field635 = field638;
		}

		double var11 = (double) (field630 + 1 - arg3);
		field625 = (arg0 - field633) / var11;
		field626 = (arg2 - field634) / var11;
		field627 = Math.sqrt(field626 * field626 + field625 * field625);
		if (!field632) {
			field628 = -field627 * Math.tan(field641 * 0.02454369D);
		}

		field640 = (arg1 - field635 - field628 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("HDKZMJGE.a(ZI)V")
	public final void method218(int arg0) {
		field632 = true;
		field633 += arg0 * field625;
		field634 += arg0 * field626;
		field635 += field640 * 0.5D * arg0 * arg0 + arg0 * field628;
		field628 += arg0 * field640;
		field645 = (int) (Math.atan2(field625, field626) * 325.949D) + 1024 & 0x7FF;
		field646 = (int) (Math.atan2(field628, field627) * 325.949D) & 0x7FF;

		if (field631.field607 != null) {
			field624 += arg0;
			while (field624 > field631.field607.method240(field623)) {
				field624 -= field631.field607.method240(field623) + 1;
				field623++;
				if (field623 >= field631.field607.field743) {
					field623 = 0;
				}
			}
		}
	}

	public HDKZMJGE(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field631 = FOXTQZWB.field603[arg7];
		field644 = arg10;
		field636 = arg0;
		field637 = arg2;
		field638 = arg6;
		field629 = arg9;
		field630 = arg8;
		field641 = arg3;
		field642 = arg4;
		field643 = arg5;
		field639 = arg1;
		field632 = false;
	}

	@ObfuscatedName("HDKZMJGE.a(I)LNGYJLUVS;")
	public final NGYJLUVS method206() {
		NGYJLUVS var1 = field631.method210();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field631.field607 != null) {
			var2 = field631.field607.field744[field623];
		}

		NGYJLUVS var3 = new NGYJLUVS(PHDJZMLE.method428(var2), true, var1, false);
		if (var2 != -1) {
			var3.method298();
			var3.method299(var2);
			var3.field891 = null;
			var3.field890 = null;
		}

		if (field631.field610 != 128 || field631.field611 != 128) {
			var3.method307(field631.field610, field631.field610, field631.field611);
		}

		var3.method303(field646);
		var3.method308(field631.field613 + 64, field631.field614 + 850, -30, -50, -30, true);
		return var3;
	}
}
