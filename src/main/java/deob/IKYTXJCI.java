package deob;

@ObfuscatedName("IKYTXJCI")
public class IKYTXJCI extends SMAWMDZY {

	@ObfuscatedName("IKYTXJCI.o")
	public int field736;

	@ObfuscatedName("IKYTXJCI.p")
	public int field737;

	@ObfuscatedName("IKYTXJCI.q")
	public int field738;

	@ObfuscatedName("IKYTXJCI.u")
	public int field741;

	@ObfuscatedName("IKYTXJCI.v")
	public int field742;

	@ObfuscatedName("IKYTXJCI.w")
	public int field743;

	@ObfuscatedName("IKYTXJCI.x")
	public int field744;

	@ObfuscatedName("IKYTXJCI.y")
	public HZCWGKOF field745;

	@ObfuscatedName("IKYTXJCI.t")
	public int field740;

	@ObfuscatedName("IKYTXJCI.s")
	public int field739;

	@ObfuscatedName("IKYTXJCI.m")
	public int field734;

	@ObfuscatedName("IKYTXJCI.n")
	public int field735;

	@ObfuscatedName("IKYTXJCI.z")
	public int[] field746;

	@ObfuscatedName("IKYTXJCI.l")
	public static client field733;

	@ObfuscatedName("IKYTXJCI.a(I)LDHQCHKXN;")
	public final DHQCHKXN method233() {
		int var1 = -1;
		if (field734 != -1) {
			JHLQAAYP var2 = JHLQAAYP.field840[field734];
			int var3 = var2.field842;
			int var4 = var2.field843;
			int var5 = var2.field844;
			int var6 = client.field165[var5 - var4];
			var1 = field733.field327[var3] >> var4 & var6;
		} else if (field735 != -1) {
			var1 = field733.field327[field735];
		}

		if (var1 >= 0 && var1 < field746.length && field746[var1] != -1) {
			return DHQCHKXN.method194(field746[var1]);
		}

		return null;
	}

	@ObfuscatedName("IKYTXJCI.a(Z)LITSMSHJO;")
	public final ITSMSHJO method2() {
		int var1 = -1;
		if (field745 != null) {
			int var2 = client.field287 - field739;
			if (var2 > 100 && field745.field717 > 0) {
				var2 = 100;
			}

			while (var2 > field745.method227(field740)) {
				var2 -= field745.method227(field740);
				field740++;
				if (field740 >= field745.field713) {
					field740 -= field745.field717;
					if (field740 < 0 || field740 >= field745.field713) {
						break;
					}
				}
			}

			field745 = null;
			field739 = client.field287 - var2;

			if (field745 != null) {
				var1 = field745.field714[field740];
			}
		}

		DHQCHKXN var3;
		if (field746 == null) {
			var3 = DHQCHKXN.method194(field736);
		} else {
			var3 = method233();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method191(field737, field738, field741, field742, field743, field744, var1);
	}

	public IKYTXJCI(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field736 = arg4;
		field737 = arg5;
		field738 = arg1;
		field741 = arg2;
		field742 = arg0;
		field743 = arg6;
		field744 = arg7;

		if (arg8 != -1) {
			field745 = HZCWGKOF.field712[arg8];
			field740 = 0;
			field739 = client.field287;
			if (arg3 && field745.field717 != -1) {
				field740 = (int) (Math.random() * field745.field713);
				field739 -= (int) (Math.random() * field745.method227(field740));
			}
		}

		DHQCHKXN var10 = DHQCHKXN.method194(field736);
		field734 = var10.field575;
		field735 = var10.field593;
		field746 = var10.field604;
	}
}
