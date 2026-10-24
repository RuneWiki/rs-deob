package deob;

@ObfuscatedName("BSBQPUWL")
public final class BSBQPUWL extends UCNHLGIK {

	@ObfuscatedName("BSBQPUWL.H")
	public boolean field103 = false;

	@ObfuscatedName("BSBQPUWL.J")
	public XYSJIYWF field105;

	@ObfuscatedName("BSBQPUWL.q")
	public int field87;

	@ObfuscatedName("BSBQPUWL.y")
	public int field95;

	@ObfuscatedName("BSBQPUWL.z")
	public int field96;

	@ObfuscatedName("BSBQPUWL.A")
	public int field97;

	@ObfuscatedName("BSBQPUWL.r")
	public int field88;

	@ObfuscatedName("BSBQPUWL.s")
	public int field89;

	@ObfuscatedName("BSBQPUWL.m")
	public int field84;

	@ObfuscatedName("BSBQPUWL.n")
	public int field85;

	@ObfuscatedName("BSBQPUWL.o")
	public int field86;

	@ObfuscatedName("BSBQPUWL.B")
	public int field98;

	@ObfuscatedName("BSBQPUWL.D")
	public double field100;

	@ObfuscatedName("BSBQPUWL.E")
	public double field101;

	@ObfuscatedName("BSBQPUWL.F")
	public double field102;

	@ObfuscatedName("BSBQPUWL.I")
	public double field104;

	@ObfuscatedName("BSBQPUWL.v")
	public double field92;

	@ObfuscatedName("BSBQPUWL.w")
	public double field93;

	@ObfuscatedName("BSBQPUWL.x")
	public double field94;

	@ObfuscatedName("BSBQPUWL.C")
	public double field99;

	@ObfuscatedName("BSBQPUWL.K")
	public int field106;

	@ObfuscatedName("BSBQPUWL.L")
	public int field107;

	@ObfuscatedName("BSBQPUWL.t")
	public int field90;

	@ObfuscatedName("BSBQPUWL.u")
	public int field91;

	public BSBQPUWL(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field105 = XYSJIYWF.field1477[arg4];
		field87 = arg3;
		field95 = arg5;
		field96 = arg6;
		field97 = arg10;
		field88 = arg2;
		field89 = arg7;
		field84 = arg9;
		field85 = arg8;
		field86 = arg0;
		field98 = arg1;
		field103 = false;
	}

	@ObfuscatedName("BSBQPUWL.a(IZ)V")
	public final void method42(int arg0) {
		field103 = true;
		field92 += arg0 * field99;
		field93 += arg0 * field100;
		field94 += field104 * 0.5D * arg0 * arg0 + arg0 * field102;
		field102 += arg0 * field104;
		field90 = (int) (Math.atan2(field99, field100) * 325.949D) + 1024 & 0x7FF;
		field91 = (int) (Math.atan2(field102, field101) * 325.949D) & 0x7FF;

		if (field105.field1481 != null) {
			field107 += arg0;
			while (field107 > field105.field1481.method207(field106)) {
				field107 -= field105.field1481.method207(field106);
				field106++;
				if (field106 >= field105.field1481.field637) {
					field106 = 0;
				}
			}
		}
	}

	@ObfuscatedName("BSBQPUWL.a(I)LOJGAHFXC;")
	public final OJGAHFXC method1() {
		OJGAHFXC var1 = field105.method582();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field105.field1481 != null) {
			var2 = field105.field1481.field638[field106];
		}

		OJGAHFXC var3 = new OJGAHFXC(MOOJSKCU.method395(var2), false, true, var1);
		if (var2 != -1) {
			var3.method420();
			var3.method421(var2);
			var3.field1049 = null;
			var3.field1048 = null;
		}

		if (field105.field1484 != 128 || field105.field1485 != 128) {
			var3.method429(field105.field1484, field105.field1485, field105.field1484);
		}

		var3.method425(field91);
		var3.method430(field105.field1487 + 64, field105.field1488 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("BSBQPUWL.a(IIIII)V")
	public final void method43(int arg0, int arg1, int arg2, int arg3) {
		if (!field103) {
			double var5 = (double) (arg3 - field95);
			double var7 = (double) (arg0 - field96);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field92 = field85 * var5 / var9 + field95;
			field93 = field85 * var7 / var9 + field96;
			field94 = field97;
		}

		double var11 = (double) (field89 + 1 - arg2);
		field99 = (arg3 - field92) / var11;
		field100 = (arg0 - field93) / var11;
		field101 = Math.sqrt(field99 * field99 + field100 * field100);
		if (!field103) {
			field102 = -field101 * Math.tan(field84 * 0.02454369D);
		}

		field104 = (arg1 - field94 - field102 * var11) * 2.0D / (var11 * var11);
	}
}
