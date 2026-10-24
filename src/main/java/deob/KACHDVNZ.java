package deob;

@ObfuscatedName("KACHDVNZ")
public final class KACHDVNZ extends WWTUXVKR {

	@ObfuscatedName("KACHDVNZ.v")
	public boolean field820 = false;

	@ObfuscatedName("KACHDVNZ.t")
	public BUIWQSXJ field818;

	@ObfuscatedName("KACHDVNZ.o")
	public int field814;

	@ObfuscatedName("KACHDVNZ.p")
	public int field815;

	@ObfuscatedName("KACHDVNZ.q")
	public int field816;

	@ObfuscatedName("KACHDVNZ.r")
	public int field817;

	@ObfuscatedName("KACHDVNZ.u")
	public int field819;

	@ObfuscatedName("KACHDVNZ.m")
	public int field812;

	@ObfuscatedName("KACHDVNZ.n")
	public int field813;

	@ObfuscatedName("KACHDVNZ.a(II)V")
	public final void method307(int arg0) {
		field813 += arg0;
		while (field813 > field818.field34.method364(field812)) {
			field813 -= field818.field34.method364(field812) + 1;
			field812++;
			if (field812 >= field818.field34.field889 && (field812 < 0 || field812 >= field818.field34.field889)) {
				field812 = 0;
				field820 = true;
			}
		}
	}

	public KACHDVNZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field818 = BUIWQSXJ.field30[arg0];
		field814 = arg4;
		field815 = arg2;
		field816 = arg5;
		field817 = arg3;
		field819 = arg1 + arg6;
		field820 = false;
	}

	@ObfuscatedName("KACHDVNZ.a(Z)LPOJFANDE;")
	public final POJFANDE method54() {
		POJFANDE var1 = field818.method62();
		if (var1 == null) {
			return null;
		}

		int var2 = field818.field34.field890[field812];
		POJFANDE var3 = new POJFANDE(HVIFHYEW.method287(var2), true, false, var1);
		if (!field820) {
			var3.method467();
			var3.method468(var2);
			var3.field1131 = null;
			var3.field1130 = null;
		}

		if (field818.field37 != 128 || field818.field38 != 128) {
			var3.method476(field818.field38, field818.field37, field818.field37);
		}

		if (field818.field39 != 0) {
			if (field818.field39 == 90) {
				var3.method471();
			}

			if (field818.field39 == 180) {
				var3.method471();
				var3.method471();
			}

			if (field818.field39 == 270) {
				var3.method471();
				var3.method471();
				var3.method471();
			}
		}

		var3.method477(field818.field40 + 64, field818.field41 + 850, -30, -50, -30, true);
		return var3;
	}
}
