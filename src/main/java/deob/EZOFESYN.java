package deob;

@ObfuscatedName("EZOFESYN")
public class EZOFESYN extends AOBGXKOU {

	@ObfuscatedName("EZOFESYN.o")
	public int field606;

	@ObfuscatedName("EZOFESYN.p")
	public int field607;

	@ObfuscatedName("EZOFESYN.q")
	public int field608;

	@ObfuscatedName("EZOFESYN.y")
	public int field615;

	@ObfuscatedName("EZOFESYN.z")
	public int field616;

	@ObfuscatedName("EZOFESYN.A")
	public int field617;

	@ObfuscatedName("EZOFESYN.B")
	public int field618;

	@ObfuscatedName("EZOFESYN.u")
	public ZKWMIVTX field612;

	@ObfuscatedName("EZOFESYN.t")
	public int field611;

	@ObfuscatedName("EZOFESYN.r")
	public int field609;

	@ObfuscatedName("EZOFESYN.v")
	public int field613;

	@ObfuscatedName("EZOFESYN.w")
	public int field614;

	@ObfuscatedName("EZOFESYN.s")
	public int[] field610;

	@ObfuscatedName("EZOFESYN.C")
	public static client field619;

	@ObfuscatedName("EZOFESYN.a(I)LPZZVQRQI;")
	public final PZZVQRQI method210() {
		int var1 = -1;
		if (field613 != -1) {
			AFWJXAMU var2 = AFWJXAMU.field10[field613];
			int var3 = var2.field12;
			int var4 = var2.field13;
			int var5 = var2.field14;
			int var6 = client.field259[var5 - var4];
			var1 = field619.field187[var3] >> var4 & var6;
		} else if (field614 != -1) {
			var1 = field619.field187[field614];
		}

		if (var1 >= 0 && var1 < field610.length && field610[var1] != -1) {
			return PZZVQRQI.method398(field610[var1]);
		}

		return null;
	}

	public EZOFESYN(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field606 = arg6;
		field607 = arg8;
		field608 = arg0;
		field615 = arg5;
		field616 = arg2;
		field617 = arg4;
		field618 = arg3;

		if (arg7 != -1) {
			field612 = ZKWMIVTX.field1461[arg7];
			field611 = 0;
			field609 = client.field538;
			if (arg1 && field612.field1466 != -1) {
				field611 = (int) (Math.random() * field612.field1462);
				field609 -= (int) (Math.random() * field612.method591(field611));
			}
		}

		PZZVQRQI var10 = PZZVQRQI.method398(field606);
		field613 = var10.field904;
		field614 = var10.field934;
		field610 = var10.field915;
	}

	@ObfuscatedName("EZOFESYN.a(Z)LYABPKWWG;")
	public final YABPKWWG method16() {
		int var1 = -1;
		if (field612 != null) {
			int var2 = client.field538 - field609;
			if (var2 > 100 && field612.field1466 > 0) {
				var2 = 100;
			}

			while (var2 > field612.method591(field611)) {
				var2 -= field612.method591(field611);
				field611++;
				if (field611 >= field612.field1462) {
					field611 -= field612.field1466;
					if (field611 < 0 || field611 >= field612.field1462) {
						break;
					}
				}
			}

			field612 = null;
			field609 = client.field538 - var2;

			if (field612 != null) {
				var1 = field612.field1463[field611];
			}
		}

		PZZVQRQI var3;
		if (field610 == null) {
			var3 = PZZVQRQI.method398(field606);
		} else {
			var3 = method210();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method405(field607, field608, field615, field616, field617, field618, var1);
	}
}
