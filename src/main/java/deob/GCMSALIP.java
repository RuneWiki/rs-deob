package deob;

@ObfuscatedName("GCMSALIP")
public final class GCMSALIP extends JEESRQGR {

	@ObfuscatedName("GCMSALIP.r")
	public boolean field703 = false;

	@ObfuscatedName("GCMSALIP.p")
	public BKJQHSVH field702;

	@ObfuscatedName("GCMSALIP.l")
	public int field698;

	@ObfuscatedName("GCMSALIP.m")
	public int field699;

	@ObfuscatedName("GCMSALIP.n")
	public int field700;

	@ObfuscatedName("GCMSALIP.o")
	public int field701;

	@ObfuscatedName("GCMSALIP.s")
	public int field704;

	@ObfuscatedName("GCMSALIP.t")
	public int field705;

	@ObfuscatedName("GCMSALIP.u")
	public int field706;

	@ObfuscatedName("GCMSALIP.a(II)V")
	public final void method212(int arg0) {
		field706 += arg0;
		while (field706 > field702.field57.method319(field705)) {
			field706 -= field702.field57.method319(field705) + 1;
			field705++;
			if (field705 >= field702.field57.field1045 && (field705 < 0 || field705 >= field702.field57.field1045)) {
				field705 = 0;
				field703 = true;
			}
		}
	}

	public GCMSALIP(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field702 = BKJQHSVH.field53[arg6];
		field698 = arg0;
		field699 = arg3;
		field700 = arg1;
		field701 = arg5;
		field704 = arg2 + arg4;
		field703 = false;
	}

	@ObfuscatedName("GCMSALIP.a(I)LVYUQHOMO;")
	public final VYUQHOMO method13() {
		VYUQHOMO var1 = field702.method16();
		if (var1 == null) {
			return null;
		}

		int var2 = field702.field57.field1046[field705];
		VYUQHOMO var3 = new VYUQHOMO(true, APJPJMYV.method11(var2), var1, false);
		if (!field703) {
			var3.method414();
			var3.method415(var2);
			var3.field1323 = null;
			var3.field1322 = null;
		}

		if (field702.field60 != 128 || field702.field61 != 128) {
			var3.method423(field702.field60, field702.field61, field702.field60);
		}

		if (field702.field62 != 0) {
			if (field702.field62 == 90) {
				var3.method418();
			}

			if (field702.field62 == 180) {
				var3.method418();
				var3.method418();
			}

			if (field702.field62 == 270) {
				var3.method418();
				var3.method418();
				var3.method418();
			}
		}

		var3.method424(field702.field63 + 64, field702.field64 + 850, -30, -50, -30, true);
		return var3;
	}
}
