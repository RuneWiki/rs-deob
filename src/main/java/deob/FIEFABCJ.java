package deob;

@ObfuscatedName("FIEFABCJ")
public final class FIEFABCJ extends LDWABQSV {

	@ObfuscatedName("FIEFABCJ.x")
	public boolean field568 = false;

	@ObfuscatedName("FIEFABCJ.L")
	public SNGXEJOJ field580;

	@ObfuscatedName("FIEFABCJ.w")
	public int field567;

	@ObfuscatedName("FIEFABCJ.C")
	public int field573;

	@ObfuscatedName("FIEFABCJ.D")
	public int field574;

	@ObfuscatedName("FIEFABCJ.E")
	public int field575;

	@ObfuscatedName("FIEFABCJ.r")
	public int field562;

	@ObfuscatedName("FIEFABCJ.s")
	public int field563;

	@ObfuscatedName("FIEFABCJ.t")
	public int field564;

	@ObfuscatedName("FIEFABCJ.u")
	public int field565;

	@ObfuscatedName("FIEFABCJ.v")
	public int field566;

	@ObfuscatedName("FIEFABCJ.F")
	public int field576;

	@ObfuscatedName("FIEFABCJ.q")
	public double field561;

	@ObfuscatedName("FIEFABCJ.y")
	public double field569;

	@ObfuscatedName("FIEFABCJ.z")
	public double field570;

	@ObfuscatedName("FIEFABCJ.A")
	public double field571;

	@ObfuscatedName("FIEFABCJ.B")
	public double field572;

	@ObfuscatedName("FIEFABCJ.I")
	public double field577;

	@ObfuscatedName("FIEFABCJ.J")
	public double field578;

	@ObfuscatedName("FIEFABCJ.K")
	public double field579;

	@ObfuscatedName("FIEFABCJ.o")
	public int field559;

	@ObfuscatedName("FIEFABCJ.p")
	public int field560;

	@ObfuscatedName("FIEFABCJ.M")
	public int field581;

	@ObfuscatedName("FIEFABCJ.N")
	public int field582;

	public FIEFABCJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field580 = SNGXEJOJ.field1217[arg4];
		field567 = arg2;
		field573 = arg5;
		field574 = arg10;
		field575 = arg8;
		field562 = arg0;
		field563 = arg3;
		field564 = arg9;
		field565 = arg7;
		field566 = arg1;
		field576 = arg6;
		field568 = false;
	}

	@ObfuscatedName("FIEFABCJ.a(II)V")
	public final void method205(int arg0) {
		field568 = true;
		field577 += arg0 * field569;
		field578 += arg0 * field570;
		field579 += field561 * 0.5D * arg0 * arg0 + arg0 * field572;
		field572 += arg0 * field561;
		field559 = (int) (Math.atan2(field569, field570) * 325.949D) + 1024 & 0x7FF;
		field560 = (int) (Math.atan2(field572, field571) * 325.949D) & 0x7FF;

		if (field580.field1221 != null) {
			field582 += arg0;
			while (field582 > field580.field1221.method493(field581)) {
				field582 -= field580.field1221.method493(field581) + 1;
				field581++;
				if (field581 >= field580.field1221.field1243) {
					field581 = 0;
				}
			}
		}
	}

	@ObfuscatedName("FIEFABCJ.a(I)LNJPATAFL;")
	public final NJPATAFL method206() {
		NJPATAFL var1 = field580.method478();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field580.field1221 != null) {
			var2 = field580.field1221.field1244[field581];
		}

		NJPATAFL var3 = new NJPATAFL(TDFMBTLA.method491(var2), false, true, var1);
		if (var2 != -1) {
			var3.method341();
			var3.method342(var2);
			var3.field874 = null;
			var3.field873 = null;
		}

		if (field580.field1224 != 128 || field580.field1225 != 128) {
			var3.method350(field580.field1224, field580.field1224, field580.field1225);
		}

		var3.method346(field560);
		var3.method351(field580.field1227 + 64, field580.field1228 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("FIEFABCJ.a(IIZII)V")
	public final void method207(int arg0, int arg1, int arg2, int arg3) {
		if (!field568) {
			double var5 = (double) (arg2 - field573);
			double var7 = (double) (arg1 - field574);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field577 = field565 * var5 / var9 + field573;
			field578 = field565 * var7 / var9 + field574;
			field579 = field575;
		}

		double var11 = (double) (field563 + 1 - arg3);
		field569 = (arg2 - field577) / var11;
		field570 = (arg1 - field578) / var11;
		field571 = Math.sqrt(field570 * field570 + field569 * field569);
		if (!field568) {
			field572 = -field571 * Math.tan(field564 * 0.02454369D);
		}

		field561 = (arg0 - field579 - field572 * var11) * 2.0D / (var11 * var11);
	}
}
