package deob;

@ObfuscatedName("OPRNYJBH")
public final class OPRNYJBH extends AOBGXKOU {

	@ObfuscatedName("OPRNYJBH.J")
	public boolean field888 = false;

	@ObfuscatedName("OPRNYJBH.t")
	public CIVOPMKV field876;

	@ObfuscatedName("OPRNYJBH.s")
	public int field875;

	@ObfuscatedName("OPRNYJBH.A")
	public int field882;

	@ObfuscatedName("OPRNYJBH.B")
	public int field883;

	@ObfuscatedName("OPRNYJBH.C")
	public int field884;

	@ObfuscatedName("OPRNYJBH.F")
	public int field886;

	@ObfuscatedName("OPRNYJBH.G")
	public int field887;

	@ObfuscatedName("OPRNYJBH.n")
	public int field870;

	@ObfuscatedName("OPRNYJBH.o")
	public int field871;

	@ObfuscatedName("OPRNYJBH.p")
	public int field872;

	@ObfuscatedName("OPRNYJBH.D")
	public int field885;

	@ObfuscatedName("OPRNYJBH.v")
	public double field877;

	@ObfuscatedName("OPRNYJBH.w")
	public double field878;

	@ObfuscatedName("OPRNYJBH.x")
	public double field879;

	@ObfuscatedName("OPRNYJBH.K")
	public double field889;

	@ObfuscatedName("OPRNYJBH.L")
	public double field890;

	@ObfuscatedName("OPRNYJBH.M")
	public double field891;

	@ObfuscatedName("OPRNYJBH.N")
	public double field892;

	@ObfuscatedName("OPRNYJBH.O")
	public double field893;

	@ObfuscatedName("OPRNYJBH.q")
	public int field873;

	@ObfuscatedName("OPRNYJBH.r")
	public int field874;

	@ObfuscatedName("OPRNYJBH.y")
	public int field880;

	@ObfuscatedName("OPRNYJBH.z")
	public int field881;

	@ObfuscatedName("OPRNYJBH.a(Z)LYABPKWWG;")
	public final YABPKWWG method16() {
		YABPKWWG var1 = field876.method32();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field876.field118 != null) {
			var2 = field876.field118.field1463[field873];
		}

		YABPKWWG var3 = new YABPKWWG(var1, HQHBJEDA.method219(var2), true, false);
		if (var2 != -1) {
			var3.method555();
			var3.method556(var2);
			var3.field1415 = null;
			var3.field1414 = null;
		}

		if (field876.field121 != 128 || field876.field122 != 128) {
			var3.method564(field876.field122, field876.field121, field876.field121);
		}

		var3.method560(field881);
		var3.method565(field876.field124 + 64, field876.field125 + 850, -30, -50, -30, true);
		return var3;
	}

	public OPRNYJBH(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field876 = CIVOPMKV.field114[arg10];
		field875 = arg4;
		field882 = arg7;
		field883 = arg5;
		field884 = arg3;
		field886 = arg1;
		field887 = arg9;
		field870 = arg2;
		field871 = arg0;
		field872 = arg8;
		field885 = arg6;
		field888 = false;
	}

	@ObfuscatedName("OPRNYJBH.a(IIIII)V")
	public final void method376(int arg0, int arg1, int arg2, int arg3) {
		if (!field888) {
			double var5 = (double) (arg0 - field882);
			double var7 = (double) (arg1 - field883);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field877 = field871 * var5 / var9 + field882;
			field878 = field871 * var7 / var9 + field883;
			field879 = field884;
		}

		double var11 = (double) (field887 + 1 - arg2);
		field890 = (arg0 - field877) / var11;
		field891 = (arg1 - field878) / var11;
		field892 = Math.sqrt(field891 * field891 + field890 * field890);
		if (!field888) {
			field893 = -field892 * Math.tan(field870 * 0.02454369D);
		}

		field889 = (arg3 - field879 - field893 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("OPRNYJBH.a(ZI)V")
	public final void method377(int arg0) {
		field888 = true;
		field877 += arg0 * field890;
		field878 += arg0 * field891;
		field879 += field889 * 0.5D * arg0 * arg0 + arg0 * field893;
		field893 += arg0 * field889;
		field880 = (int) (Math.atan2(field890, field891) * 325.949D) + 1024 & 0x7FF;
		field881 = (int) (Math.atan2(field893, field892) * 325.949D) & 0x7FF;

		if (field876.field118 != null) {
			field874 += arg0;
			while (field874 > field876.field118.method591(field873)) {
				field874 -= field876.field118.method591(field873) + 1;
				field873++;
				if (field873 >= field876.field118.field1462) {
					field873 = 0;
				}
			}
		}
	}
}
