package deob;

@ObfuscatedName("CAXQGHNZ")
public class CAXQGHNZ extends YDNCHMHU {

	@ObfuscatedName("CAXQGHNZ.v")
	public int field144;

	@ObfuscatedName("CAXQGHNZ.w")
	public int field145;

	@ObfuscatedName("CAXQGHNZ.x")
	public int field146;

	@ObfuscatedName("CAXQGHNZ.n")
	public int field137;

	@ObfuscatedName("CAXQGHNZ.o")
	public int field138;

	@ObfuscatedName("CAXQGHNZ.p")
	public int field139;

	@ObfuscatedName("CAXQGHNZ.q")
	public int field140;

	@ObfuscatedName("CAXQGHNZ.z")
	public CGWBYVFN field148;

	@ObfuscatedName("CAXQGHNZ.u")
	public int field143;

	@ObfuscatedName("CAXQGHNZ.y")
	public int field147;

	@ObfuscatedName("CAXQGHNZ.l")
	public int field135;

	@ObfuscatedName("CAXQGHNZ.m")
	public int field136;

	@ObfuscatedName("CAXQGHNZ.r")
	public int[] field141;

	@ObfuscatedName("CAXQGHNZ.s")
	public static client field142;

	@ObfuscatedName("CAXQGHNZ.a(Z)LOIBEFFXI;")
	public final OIBEFFXI method2() {
		int var1 = -1;
		if (field148 != null) {
			int var2 = client.field316 - field147;
			if (var2 > 100 && field148.field155 > 0) {
				var2 = 100;
			}

			while (var2 > field148.method23(field143)) {
				var2 -= field148.method23(field143);
				field143++;
				if (field143 >= field148.field151) {
					field143 -= field148.field155;
					if (field143 < 0 || field143 >= field148.field151) {
						break;
					}
				}
			}

			field148 = null;
			field147 = client.field316 - var2;

			if (field148 != null) {
				var1 = field148.field152[field143];
			}
		}

		SHDUUMNW var3;
		if (field141 == null) {
			var3 = SHDUUMNW.method410(field144);
		} else {
			var3 = method21();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method405(field145, field146, field137, field138, field139, field140, var1);
	}

	public CAXQGHNZ(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field144 = arg5;
		field145 = arg2;
		field146 = arg0;
		field137 = arg6;
		field138 = arg7;
		field139 = arg1;
		field140 = arg8;

		if (arg4 != -1) {
			field148 = CGWBYVFN.field150[arg4];
			field143 = 0;
			field147 = client.field316;
			if (arg3 && field148.field155 != -1) {
				field143 = (int) (Math.random() * field148.field151);
				field147 -= (int) (Math.random() * field148.method23(field143));
			}
		}

		SHDUUMNW var10 = SHDUUMNW.method410(field144);
		field135 = var10.field1102;
		field136 = var10.field1099;
		field141 = var10.field1090;
	}

	@ObfuscatedName("CAXQGHNZ.a(I)LSHDUUMNW;")
	public final SHDUUMNW method21() {
		int var1 = -1;
		if (field135 != -1) {
			SXQCXZWK var2 = SXQCXZWK.field1133[field135];
			int var3 = var2.field1135;
			int var4 = var2.field1136;
			int var5 = var2.field1137;
			int var6 = client.field385[var5 - var4];
			var1 = field142.field572[var3] >> var4 & var6;
		} else if (field136 != -1) {
			var1 = field142.field572[field136];
		}

		if (var1 >= 0 && var1 < field141.length && field141[var1] != -1) {
			return SHDUUMNW.method410(field141[var1]);
		}

		return null;
	}
}
