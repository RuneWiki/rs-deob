package deob;

@ObfuscatedName("DZGXSGHB")
public class DZGXSGHB extends GHXFOOXU {

	@ObfuscatedName("DZGXSGHB.n")
	public int field613;

	@ObfuscatedName("DZGXSGHB.o")
	public int field614;

	@ObfuscatedName("DZGXSGHB.p")
	public int field615;

	@ObfuscatedName("DZGXSGHB.y")
	public int field622;

	@ObfuscatedName("DZGXSGHB.z")
	public int field623;

	@ObfuscatedName("DZGXSGHB.A")
	public int field624;

	@ObfuscatedName("DZGXSGHB.B")
	public int field625;

	@ObfuscatedName("DZGXSGHB.v")
	public BKDXLPEF field619;

	@ObfuscatedName("DZGXSGHB.w")
	public int field620;

	@ObfuscatedName("DZGXSGHB.x")
	public int field621;

	@ObfuscatedName("DZGXSGHB.t")
	public int field617;

	@ObfuscatedName("DZGXSGHB.u")
	public int field618;

	@ObfuscatedName("DZGXSGHB.C")
	public int[] field626;

	@ObfuscatedName("DZGXSGHB.q")
	public static client field616;

	public DZGXSGHB(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field613 = arg1;
		field614 = arg6;
		field615 = arg2;
		field622 = arg5;
		field623 = arg3;
		field624 = arg4;
		field625 = arg8;

		if (arg0 != -1) {
			field619 = BKDXLPEF.field75[arg0];
			field620 = 0;
			field621 = client.field526 - 1;
			if (arg7 && field619.field80 != -1) {
				field620 = (int) (Math.random() * field619.field76);
				field621 -= (int) (Math.random() * field619.method12(field620));
			}
		}

		ELXAMLNA var10 = ELXAMLNA.method196(field613);
		field617 = var10.field667;
		field618 = var10.field647;
		field626 = var10.field664;
	}

	@ObfuscatedName("DZGXSGHB.b(B)LELXAMLNA;")
	public final ELXAMLNA method189() {
		int var1 = -1;
		if (field617 != -1) {
			HGYXNEJH var2 = HGYXNEJH.field818[field617];
			int var3 = var2.field820;
			int var4 = var2.field821;
			int var5 = var2.field822;
			int var6 = client.field204[var5 - var4];
			var1 = field616.field356[var3] >> var4 & var6;
		} else if (field618 != -1) {
			var1 = field616.field356[field618];
		}

		if (var1 >= 0 && var1 < field626.length && field626[var1] != -1) {
			return ELXAMLNA.method196(field626[var1]);
		}

		return null;
	}

	@ObfuscatedName("DZGXSGHB.a(B)LFLXAIVEA;")
	public final FLXAIVEA method190() {
		int var1 = -1;
		if (field619 != null) {
			int var2 = client.field526 - field621;
			if (var2 > 100 && field619.field80 > 0) {
				var2 = 100;
			}

			while (var2 > field619.method12(field620)) {
				var2 -= field619.method12(field620);
				field620++;
				if (field620 >= field619.field76) {
					field620 -= field619.field80;
					if (field620 < 0 || field620 >= field619.field76) {
						break;
					}
				}
			}

			field619 = null;
			field621 = client.field526 - var2;

			if (field619 != null) {
				var1 = field619.field77[field620];
			}
		}

		ELXAMLNA var3;
		if (field626 == null) {
			var3 = ELXAMLNA.method196(field613);
		} else {
			var3 = method189();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method201(field614, field615, field622, field623, field624, field625, var1);
	}
}
