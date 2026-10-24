package deob;

@ObfuscatedName("JSKMYDBH")
public class JSKMYDBH extends RWIDPYKY {

	@ObfuscatedName("JSKMYDBH.y")
	public int field671;

	@ObfuscatedName("JSKMYDBH.z")
	public int field672;

	@ObfuscatedName("JSKMYDBH.A")
	public int field673;

	@ObfuscatedName("JSKMYDBH.q")
	public int field664;

	@ObfuscatedName("JSKMYDBH.r")
	public int field665;

	@ObfuscatedName("JSKMYDBH.s")
	public int field666;

	@ObfuscatedName("JSKMYDBH.t")
	public int field667;

	@ObfuscatedName("JSKMYDBH.B")
	public KYGPROVJ field674;

	@ObfuscatedName("JSKMYDBH.x")
	public int field670;

	@ObfuscatedName("JSKMYDBH.o")
	public int field662;

	@ObfuscatedName("JSKMYDBH.v")
	public int field668;

	@ObfuscatedName("JSKMYDBH.w")
	public int field669;

	@ObfuscatedName("JSKMYDBH.n")
	public int[] field661;

	@ObfuscatedName("JSKMYDBH.p")
	public static client field663;

	@ObfuscatedName("JSKMYDBH.b(I)LKBTDMRWU;")
	public final KBTDMRWU method207() {
		int var1 = -1;
		if (field668 != -1) {
			JYNIYSOU var2 = JYNIYSOU.field748[field668];
			int var3 = var2.field750;
			int var4 = var2.field751;
			int var5 = var2.field752;
			int var6 = client.field492[var5 - var4];
			var1 = field663.field441[var3] >> var4 & var6;
		} else if (field669 != -1) {
			var1 = field663.field441[field669];
		}

		if (var1 >= 0 && var1 < field661.length && field661[var1] != -1) {
			return KBTDMRWU.method249(field661[var1]);
		}

		return null;
	}

	public JSKMYDBH(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field671 = arg0;
		field672 = arg2;
		field673 = arg6;
		field664 = arg1;
		field665 = arg4;
		field666 = arg5;
		field667 = arg3;

		if (arg8 != -1) {
			field674 = KYGPROVJ.field828[arg8];
			field670 = 0;
			field662 = client.field512;
			if (arg7 && field674.field833 != -1) {
				field670 = (int) (Math.random() * field674.field829);
				field662 -= (int) (Math.random() * field674.method256(field670));
			}
		}

		KBTDMRWU var10 = KBTDMRWU.method249(field671);
		field668 = var10.field776;
		field669 = var10.field796;
		field661 = var10.field782;
	}

	@ObfuscatedName("JSKMYDBH.a(I)LJUQSYEMB;")
	public final JUQSYEMB method167() {
		int var1 = -1;
		if (field674 != null) {
			int var2 = client.field512 - field662;
			if (var2 > 100 && field674.field833 > 0) {
				var2 = 100;
			}

			while (var2 > field674.method256(field670)) {
				var2 -= field674.method256(field670);
				field670++;
				if (field670 >= field674.field829) {
					field670 -= field674.field833;
					if (field670 < 0 || field670 >= field674.field829) {
						break;
					}
				}
			}

			field674 = null;
			field662 = client.field512 - var2;

			if (field674 != null) {
				var1 = field674.field830[field670];
			}
		}

		KBTDMRWU var3;
		if (field661 == null) {
			var3 = KBTDMRWU.method249(field671);
		} else {
			var3 = method207();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method247(field672, field673, field664, field665, field666, field667, var1);
	}
}
