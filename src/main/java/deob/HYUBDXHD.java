package deob;

@ObfuscatedName("HYUBDXHD")
public final class HYUBDXHD extends XPEMEMUL {

	@ObfuscatedName("HYUBDXHD.p")
	public boolean field806 = false;

	@ObfuscatedName("HYUBDXHD.l")
	public FULHVSIU field802;

	@ObfuscatedName("HYUBDXHD.r")
	public int field807;

	@ObfuscatedName("HYUBDXHD.s")
	public int field808;

	@ObfuscatedName("HYUBDXHD.t")
	public int field809;

	@ObfuscatedName("HYUBDXHD.u")
	public int field810;

	@ObfuscatedName("HYUBDXHD.m")
	public int field803;

	@ObfuscatedName("HYUBDXHD.n")
	public int field804;

	@ObfuscatedName("HYUBDXHD.o")
	public int field805;

	@ObfuscatedName("HYUBDXHD.a(BI)V")
	public final void method316(int arg0) {
		field805 += arg0;
		while (field805 > field802.field608.method415(field804)) {
			field805 -= field802.field608.method415(field804) + 1;
			field804++;
			if (field804 >= field802.field608.field999 && (field804 < 0 || field804 >= field802.field608.field999)) {
				field804 = 0;
				field806 = true;
			}
		}
	}

	@ObfuscatedName("HYUBDXHD.a(I)LKPUOCBCE;")
	public final KPUOCBCE method11() {
		KPUOCBCE var1 = field802.method231();
		if (var1 == null) {
			return null;
		}

		int var2 = field802.field608.field1000[field804];
		KPUOCBCE var3 = new KPUOCBCE(ZNUJPBQV.method585(var2), false, var1, true);
		if (!field806) {
			var3.method386();
			var3.method387(var2);
			var3.field889 = null;
			var3.field888 = null;
		}

		if (field802.field611 != 128 || field802.field612 != 128) {
			var3.method395(field802.field611, field802.field612, field802.field611);
		}

		if (field802.field613 != 0) {
			if (field802.field613 == 90) {
				var3.method390();
			}

			if (field802.field613 == 180) {
				var3.method390();
				var3.method390();
			}

			if (field802.field613 == 270) {
				var3.method390();
				var3.method390();
				var3.method390();
			}
		}

		var3.method396(field802.field614 + 64, field802.field615 + 850, -30, -50, -30, true);
		return var3;
	}

	public HYUBDXHD(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field802 = FULHVSIU.field604[arg1];
		field807 = arg6;
		field808 = arg0;
		field809 = arg2;
		field810 = arg3;
		field803 = arg4 + arg5;
		field806 = false;
	}
}
