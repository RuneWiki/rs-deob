package deob;

@ObfuscatedName("AAKFEJZP")
public final class AAKFEJZP extends JNFESWRD {

	@ObfuscatedName("AAKFEJZP.D")
	public boolean field19 = false;

	@ObfuscatedName("AAKFEJZP.t")
	public RTDMFIDA field10;

	@ObfuscatedName("AAKFEJZP.k")
	public int field1;

	@ObfuscatedName("AAKFEJZP.n")
	public int field4;

	@ObfuscatedName("AAKFEJZP.o")
	public int field5;

	@ObfuscatedName("AAKFEJZP.p")
	public int field6;

	@ObfuscatedName("AAKFEJZP.r")
	public int field8;

	@ObfuscatedName("AAKFEJZP.s")
	public int field9;

	@ObfuscatedName("AAKFEJZP.A")
	public int field16;

	@ObfuscatedName("AAKFEJZP.B")
	public int field17;

	@ObfuscatedName("AAKFEJZP.C")
	public int field18;

	@ObfuscatedName("AAKFEJZP.q")
	public int field7;

	@ObfuscatedName("AAKFEJZP.u")
	public double field11;

	@ObfuscatedName("AAKFEJZP.v")
	public double field12;

	@ObfuscatedName("AAKFEJZP.w")
	public double field13;

	@ObfuscatedName("AAKFEJZP.E")
	public double field20;

	@ObfuscatedName("AAKFEJZP.F")
	public double field21;

	@ObfuscatedName("AAKFEJZP.G")
	public double field22;

	@ObfuscatedName("AAKFEJZP.H")
	public double field23;

	@ObfuscatedName("AAKFEJZP.I")
	public double field24;

	@ObfuscatedName("AAKFEJZP.x")
	public int field14;

	@ObfuscatedName("AAKFEJZP.y")
	public int field15;

	@ObfuscatedName("AAKFEJZP.l")
	public int field2;

	@ObfuscatedName("AAKFEJZP.m")
	public int field3;

	@ObfuscatedName("AAKFEJZP.a(ZI)V")
	public final void method1(int arg0) {
		field19 = true;
		field11 += arg0 * field21;
		field12 += arg0 * field22;
		field13 += field20 * 0.5D * arg0 * arg0 + arg0 * field24;
		field24 += arg0 * field20;
		field2 = (int) (Math.atan2(field21, field22) * 325.949D) + 1024 & 0x7FF;
		field3 = (int) (Math.atan2(field24, field23) * 325.949D) & 0x7FF;

		if (field10.field1205 != null) {
			field15 += arg0;
			while (field15 > field10.field1205.method320(field14)) {
				field15 -= field10.field1205.method320(field14) + 1;
				field14++;
				if (field14 >= field10.field1205.field826) {
					field14 = 0;
				}
			}
		}
	}

	@ObfuscatedName("AAKFEJZP.a(Z)LIYSWJGDE;")
	public final IYSWJGDE method2() {
		IYSWJGDE var1 = field10.method448();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field10.field1205 != null) {
			var2 = field10.field1205.field827[field14];
		}

		IYSWJGDE var3 = new IYSWJGDE(PLSPTEPI.method406(var2), var1, true, false);
		if (var2 != -1) {
			var3.method280();
			var3.method281(var2);
			var3.field751 = null;
			var3.field750 = null;
		}

		if (field10.field1208 != 128 || field10.field1209 != 128) {
			var3.method289(field10.field1208, field10.field1208, field10.field1209);
		}

		var3.method285(field3);
		var3.method290(field10.field1211 + 64, field10.field1212 + 850, -30, -50, -30, true);
		return var3;
	}

	public AAKFEJZP(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field10 = RTDMFIDA.field1201[arg7];
		field1 = arg2;
		field4 = arg3;
		field5 = arg8;
		field6 = arg1;
		field8 = arg0;
		field9 = arg10;
		field16 = arg9;
		field17 = arg4;
		field18 = arg5;
		field7 = arg6;
		field19 = false;
	}

	@ObfuscatedName("AAKFEJZP.a(IIIZI)V")
	public final void method3(int arg0, int arg1, int arg2, int arg3) {
		if (!field19) {
			double var5 = (double) (arg0 - field4);
			double var7 = (double) (arg1 - field5);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field11 = field17 * var5 / var9 + field4;
			field12 = field17 * var7 / var9 + field5;
			field13 = field6;
		}

		double var11 = (double) (field9 + 1 - arg3);
		field21 = (arg0 - field11) / var11;
		field22 = (arg1 - field12) / var11;
		field23 = Math.sqrt(field22 * field22 + field21 * field21);
		if (!field19) {
			field24 = -field23 * Math.tan(field16 * 0.02454369D);
		}

		field20 = (arg2 - field13 - field24 * var11) * 2.0D / (var11 * var11);
	}
}
