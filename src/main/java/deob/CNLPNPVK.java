package deob;

@ObfuscatedName("CNLPNPVK")
public final class CNLPNPVK extends VIVVOUFY {

	@ObfuscatedName("CNLPNPVK.z")
	public boolean field536 = false;

	@ObfuscatedName("CNLPNPVK.t")
	public ZSSCYSIO field530;

	@ObfuscatedName("CNLPNPVK.l")
	public int field523;

	@ObfuscatedName("CNLPNPVK.p")
	public int field526;

	@ObfuscatedName("CNLPNPVK.q")
	public int field527;

	@ObfuscatedName("CNLPNPVK.r")
	public int field528;

	@ObfuscatedName("CNLPNPVK.F")
	public int field542;

	@ObfuscatedName("CNLPNPVK.G")
	public int field543;

	@ObfuscatedName("CNLPNPVK.H")
	public int field544;

	@ObfuscatedName("CNLPNPVK.I")
	public int field545;

	@ObfuscatedName("CNLPNPVK.J")
	public int field546;

	@ObfuscatedName("CNLPNPVK.s")
	public int field529;

	@ObfuscatedName("CNLPNPVK.u")
	public double field531;

	@ObfuscatedName("CNLPNPVK.v")
	public double field532;

	@ObfuscatedName("CNLPNPVK.w")
	public double field533;

	@ObfuscatedName("CNLPNPVK.A")
	public double field537;

	@ObfuscatedName("CNLPNPVK.B")
	public double field538;

	@ObfuscatedName("CNLPNPVK.C")
	public double field539;

	@ObfuscatedName("CNLPNPVK.D")
	public double field540;

	@ObfuscatedName("CNLPNPVK.E")
	public double field541;

	@ObfuscatedName("CNLPNPVK.m")
	public int field524;

	@ObfuscatedName("CNLPNPVK.n")
	public int field525;

	@ObfuscatedName("CNLPNPVK.x")
	public int field534;

	@ObfuscatedName("CNLPNPVK.y")
	public int field535;

	public CNLPNPVK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field530 = ZSSCYSIO.field1476[arg10];
		field523 = arg2;
		field526 = arg5;
		field527 = arg4;
		field528 = arg0;
		field542 = arg3;
		field543 = arg6;
		field544 = arg1;
		field545 = arg7;
		field546 = arg9;
		field529 = arg8;
		field536 = false;
	}

	@ObfuscatedName("CNLPNPVK.a(II)V")
	public final void method180(int arg0) {
		field536 = true;
		field531 += arg0 * field538;
		field532 += arg0 * field539;
		field533 += field537 * 0.5D * arg0 * arg0 + arg0 * field541;
		field541 += arg0 * field537;
		field534 = (int) (Math.atan2(field538, field539) * 325.949D) + 1024 & 0x7FF;
		field535 = (int) (Math.atan2(field541, field540) * 325.949D) & 0x7FF;

		if (field530.field1480 != null) {
			field525 += arg0;
			while (field525 > field530.field1480.method226(field524)) {
				field525 -= field530.field1480.method226(field524) + 1;
				field524++;
				if (field524 >= field530.field1480.field787) {
					field524 = 0;
				}
			}
		}
	}

	@ObfuscatedName("CNLPNPVK.a(B)LCCYECDYX;")
	public final CCYECDYX method181() {
		CCYECDYX var1 = field530.method590();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field530.field1480 != null) {
			var2 = field530.field1480.field788[field524];
		}

		CCYECDYX var3 = new CCYECDYX(RKTGZGSS.method383(var2), var1, false, true);
		if (var2 != -1) {
			var3.method18();
			var3.method19(var2);
			var3.field59 = null;
			var3.field58 = null;
		}

		if (field530.field1483 != 128 || field530.field1484 != 128) {
			var3.method27(field530.field1483, field530.field1484, field530.field1483);
		}

		var3.method23(field535);
		var3.method28(field530.field1486 + 64, field530.field1487 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("CNLPNPVK.a(IIIIB)V")
	public final void method182(int arg0, int arg1, int arg2, int arg3) {
		if (!field536) {
			double var5 = (double) (arg2 - field526);
			double var7 = (double) (arg0 - field527);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field531 = field545 * var5 / var9 + field526;
			field532 = field545 * var7 / var9 + field527;
			field533 = field528;
		}

		double var11 = (double) (field543 + 1 - arg3);
		field538 = (arg2 - field531) / var11;
		field539 = (arg0 - field532) / var11;
		field540 = Math.sqrt(field539 * field539 + field538 * field538);
		if (!field536) {
			field541 = -field540 * Math.tan(field544 * 0.02454369D);
		}

		field537 = (arg1 - field533 - field541 * var11) * 2.0D / (var11 * var11);
	}
}
