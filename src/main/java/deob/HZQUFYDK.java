package deob;

@ObfuscatedName("HZQUFYDK")
public class HZQUFYDK extends LDWABQSV {

	@ObfuscatedName("HZQUFYDK.n")
	public int field681;

	@ObfuscatedName("HZQUFYDK.o")
	public int field682;

	@ObfuscatedName("HZQUFYDK.p")
	public int field683;

	@ObfuscatedName("HZQUFYDK.x")
	public int field690;

	@ObfuscatedName("HZQUFYDK.y")
	public int field691;

	@ObfuscatedName("HZQUFYDK.z")
	public int field692;

	@ObfuscatedName("HZQUFYDK.A")
	public int field693;

	@ObfuscatedName("HZQUFYDK.q")
	public TLXFHCOO field684;

	@ObfuscatedName("HZQUFYDK.s")
	public int field686;

	@ObfuscatedName("HZQUFYDK.r")
	public int field685;

	@ObfuscatedName("HZQUFYDK.t")
	public int field687;

	@ObfuscatedName("HZQUFYDK.u")
	public int field688;

	@ObfuscatedName("HZQUFYDK.C")
	public int[] field694;

	@ObfuscatedName("HZQUFYDK.v")
	public static client field689;

	@ObfuscatedName("HZQUFYDK.b(I)LPFIKHQJO;")
	public final PFIKHQJO method244() {
		int var1 = -1;
		if (field687 != -1) {
			FTZZSWCP var2 = FTZZSWCP.field640[field687];
			int var3 = var2.field642;
			int var4 = var2.field643;
			int var5 = var2.field644;
			int var6 = client.field114[var5 - var4];
			var1 = field689.field230[var3] >> var4 & var6;
		} else if (field688 != -1) {
			var1 = field689.field230[field688];
		}

		if (var1 >= 0 && var1 < field694.length && field694[var1] != -1) {
			return PFIKHQJO.method405(field694[var1]);
		}

		return null;
	}

	public HZQUFYDK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field681 = arg8;
		field682 = arg3;
		field683 = arg5;
		field690 = arg7;
		field691 = arg2;
		field692 = arg4;
		field693 = arg1;

		if (arg0 != -1) {
			field684 = TLXFHCOO.field1242[arg0];
			field686 = 0;
			field685 = client.field203;
			if (arg6 && field684.field1247 != -1) {
				field686 = (int) (Math.random() * field684.field1243);
				field685 -= (int) (Math.random() * field684.method493(field686));
			}
		}

		PFIKHQJO var10 = PFIKHQJO.method405(field681);
		field687 = var10.field997;
		field688 = var10.field989;
		field694 = var10.field965;
	}

	@ObfuscatedName("HZQUFYDK.a(I)LNJPATAFL;")
	public final NJPATAFL method206() {
		int var1 = -1;
		if (field684 != null) {
			int var2 = client.field203 - field685;
			if (var2 > 100 && field684.field1247 > 0) {
				var2 = 100;
			}

			while (var2 > field684.method493(field686)) {
				var2 -= field684.method493(field686);
				field686++;
				if (field686 >= field684.field1243) {
					field686 -= field684.field1247;
					if (field686 < 0 || field686 >= field684.field1243) {
						break;
					}
				}
			}

			field684 = null;
			field685 = client.field203 - var2;

			if (field684 != null) {
				var1 = field684.field1244[field686];
			}
		}

		PFIKHQJO var3;
		if (field694 == null) {
			var3 = PFIKHQJO.method405(field681);
		} else {
			var3 = method244();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method406(field682, field683, field690, field691, field692, field693, var1);
	}
}
