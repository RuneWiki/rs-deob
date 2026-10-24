package deob;

@ObfuscatedName("RUSNMPGH")
public final class RUSNMPGH extends QLYZESGB {

	@ObfuscatedName("RUSNMPGH.o")
	public boolean field1253 = false;

	@ObfuscatedName("RUSNMPGH.r")
	public MHWTJCHJ field1254;

	@ObfuscatedName("RUSNMPGH.s")
	public int field1255;

	@ObfuscatedName("RUSNMPGH.t")
	public int field1256;

	@ObfuscatedName("RUSNMPGH.u")
	public int field1257;

	@ObfuscatedName("RUSNMPGH.v")
	public int field1258;

	@ObfuscatedName("RUSNMPGH.n")
	public int field1252;

	@ObfuscatedName("RUSNMPGH.x")
	public int field1259;

	@ObfuscatedName("RUSNMPGH.y")
	public int field1260;

	@ObfuscatedName("RUSNMPGH.a(II)V")
	public final void method503(int arg0) {
		field1260 += arg0;
		while (field1260 > field1254.field843.method342(field1259)) {
			field1260 -= field1254.field843.method342(field1259);
			field1259++;
			if (field1259 >= field1254.field843.field758 && (field1259 < 0 || field1259 >= field1254.field843.field758)) {
				field1259 = 0;
				field1253 = true;
			}
		}
	}

	public RUSNMPGH(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1254 = MHWTJCHJ.field839[arg6];
		field1255 = arg5;
		field1256 = arg1;
		field1257 = arg3;
		field1258 = arg4;
		field1252 = arg0 + arg2;
		field1253 = false;
	}

	@ObfuscatedName("RUSNMPGH.a(B)LRMLAXPMV;")
	public final RMLAXPMV method344() {
		RMLAXPMV var1 = field1254.method367();
		if (var1 == null) {
			return null;
		}

		int var2 = field1254.field843.field759[field1259];
		RMLAXPMV var3 = new RMLAXPMV(var1, XMRZESBN.method586(var2), true, false);
		if (!field1253) {
			var3.method473();
			var3.method474(var2);
			var3.field1170 = null;
			var3.field1169 = null;
		}

		if (field1254.field846 != 128 || field1254.field847 != 128) {
			var3.method482(field1254.field847, field1254.field846, field1254.field846);
		}

		if (field1254.field848 != 0) {
			if (field1254.field848 == 90) {
				var3.method477();
			}

			if (field1254.field848 == 180) {
				var3.method477();
				var3.method477();
			}

			if (field1254.field848 == 270) {
				var3.method477();
				var3.method477();
				var3.method477();
			}
		}

		var3.method483(field1254.field849 + 64, field1254.field850 + 850, -30, -50, -30, true);
		return var3;
	}
}
