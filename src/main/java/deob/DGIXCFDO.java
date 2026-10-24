package deob;

@ObfuscatedName("DGIXCFDO")
public final class DGIXCFDO extends ESJLSSWI {

	@ObfuscatedName("DGIXCFDO.J")
	public boolean field564 = false;

	@ObfuscatedName("DGIXCFDO.E")
	public TGYZPJQJ field559;

	@ObfuscatedName("DGIXCFDO.I")
	public int field563;

	@ObfuscatedName("DGIXCFDO.m")
	public int field544;

	@ObfuscatedName("DGIXCFDO.n")
	public int field545;

	@ObfuscatedName("DGIXCFDO.o")
	public int field546;

	@ObfuscatedName("DGIXCFDO.t")
	public int field551;

	@ObfuscatedName("DGIXCFDO.u")
	public int field552;

	@ObfuscatedName("DGIXCFDO.F")
	public int field560;

	@ObfuscatedName("DGIXCFDO.G")
	public int field561;

	@ObfuscatedName("DGIXCFDO.H")
	public int field562;

	@ObfuscatedName("DGIXCFDO.p")
	public int field547;

	@ObfuscatedName("DGIXCFDO.l")
	public double field543;

	@ObfuscatedName("DGIXCFDO.q")
	public double field548;

	@ObfuscatedName("DGIXCFDO.r")
	public double field549;

	@ObfuscatedName("DGIXCFDO.s")
	public double field550;

	@ObfuscatedName("DGIXCFDO.x")
	public double field553;

	@ObfuscatedName("DGIXCFDO.y")
	public double field554;

	@ObfuscatedName("DGIXCFDO.z")
	public double field555;

	@ObfuscatedName("DGIXCFDO.A")
	public double field556;

	@ObfuscatedName("DGIXCFDO.C")
	public int field557;

	@ObfuscatedName("DGIXCFDO.D")
	public int field558;

	@ObfuscatedName("DGIXCFDO.L")
	public int field565;

	@ObfuscatedName("DGIXCFDO.M")
	public int field566;

	@ObfuscatedName("DGIXCFDO.a(Z)LWRJMHIDY;")
	public final WRJMHIDY method174() {
		WRJMHIDY var1 = field559.method444();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field559.field1125 != null) {
			var2 = field559.field1125.field834[field557];
		}

		WRJMHIDY var3 = new WRJMHIDY(var1, true, false, OZAHMTPS.method338(var2));
		if (var2 != -1) {
			var3.method473();
			var3.method474(var2);
			var3.field1261 = null;
			var3.field1260 = null;
		}

		if (field559.field1128 != 128 || field559.field1129 != 128) {
			var3.method482(field559.field1128, field559.field1128, field559.field1129);
		}

		var3.method478(field566);
		var3.method483(field559.field1131 + 64, field559.field1132 + 850, -30, -50, -30, true);
		return var3;
	}

	public DGIXCFDO(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field559 = TGYZPJQJ.field1121[arg10];
		field563 = arg7;
		field544 = arg3;
		field545 = arg4;
		field546 = arg8;
		field551 = arg2;
		field552 = arg0;
		field560 = arg9;
		field561 = arg1;
		field562 = arg5;
		field547 = arg6;
		field564 = false;
	}

	@ObfuscatedName("DGIXCFDO.a(ZI)V")
	public final void method175(int arg0) {
		field564 = true;
		field548 += arg0 * field553;
		field549 += arg0 * field554;
		field550 += field543 * 0.5D * arg0 * arg0 + arg0 * field556;
		field556 += arg0 * field543;
		field565 = (int) (Math.atan2(field553, field554) * 325.949D) + 1024 & 0x7FF;
		field566 = (int) (Math.atan2(field556, field555) * 325.949D) & 0x7FF;

		if (field559.field1125 != null) {
			field558 += arg0;
			while (field558 > field559.field1125.method301(field557)) {
				field558 -= field559.field1125.method301(field557) + 1;
				field557++;
				if (field557 >= field559.field1125.field833) {
					field557 = 0;
				}
			}
		}
	}

	@ObfuscatedName("DGIXCFDO.a(BIIII)V")
	public final void method176(int arg0, int arg1, int arg2, int arg3) {
		if (!field564) {
			double var5 = (double) (arg1 - field544);
			double var7 = (double) (arg0 - field545);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field548 = field561 * var5 / var9 + field544;
			field549 = field561 * var7 / var9 + field545;
			field550 = field546;
		}

		double var11 = (double) (field552 + 1 - arg3);
		field553 = (arg1 - field548) / var11;
		field554 = (arg0 - field549) / var11;
		field555 = Math.sqrt(field554 * field554 + field553 * field553);
		if (!field564) {
			field556 = -field555 * Math.tan(field560 * 0.02454369D);
		}

		field543 = (arg2 - field550 - field556 * var11) * 2.0D / (var11 * var11);
	}
}
