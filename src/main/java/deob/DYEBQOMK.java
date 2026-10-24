package deob;

@ObfuscatedName("DYEBQOMK")
public class DYEBQOMK extends ZJNSWWFY {

	@ObfuscatedName("DYEBQOMK.x")
	public int field601;

	@ObfuscatedName("DYEBQOMK.y")
	public int field602;

	@ObfuscatedName("DYEBQOMK.z")
	public int field603;

	@ObfuscatedName("DYEBQOMK.q")
	public int field596;

	@ObfuscatedName("DYEBQOMK.r")
	public int field597;

	@ObfuscatedName("DYEBQOMK.s")
	public int field598;

	@ObfuscatedName("DYEBQOMK.t")
	public int field599;

	@ObfuscatedName("DYEBQOMK.C")
	public PNPNYEVW field606;

	@ObfuscatedName("DYEBQOMK.l")
	public int field593;

	@ObfuscatedName("DYEBQOMK.o")
	public int field594;

	@ObfuscatedName("DYEBQOMK.A")
	public int field604;

	@ObfuscatedName("DYEBQOMK.B")
	public int field605;

	@ObfuscatedName("DYEBQOMK.p")
	public int[] field595;

	@ObfuscatedName("DYEBQOMK.v")
	public static client field600;

	@ObfuscatedName("DYEBQOMK.a(B)LNRKXAGEB;")
	public final NRKXAGEB method186() {
		int var1 = -1;
		if (field604 != -1) {
			OHEMVFER var2 = OHEMVFER.field1037[field604];
			int var3 = var2.field1039;
			int var4 = var2.field1040;
			int var5 = var2.field1041;
			int var6 = client.field362[var5 - var4];
			var1 = field600.field117[var3] >> var4 & var6;
		} else if (field605 != -1) {
			var1 = field600.field117[field605];
		}

		if (var1 >= 0 && var1 < field595.length && field595[var1] != -1) {
			return NRKXAGEB.method400(field595[var1]);
		}

		return null;
	}

	public DYEBQOMK(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field601 = arg8;
		field602 = arg6;
		field603 = arg5;
		field596 = arg0;
		field597 = arg7;
		field598 = arg4;
		field599 = arg3;

		if (arg1 != -1) {
			field606 = PNPNYEVW.field1058[arg1];
			field593 = 0;
			field594 = client.field453;
			if (arg2 && field606.field1063 != -1) {
				field593 = (int) (Math.random() * field606.field1059);
				field594 -= (int) (Math.random() * field606.method427(field593));
			}
		}

		NRKXAGEB var10 = NRKXAGEB.method400(field601);
		field604 = var10.field1013;
		field605 = var10.field991;
		field595 = var10.field1005;
	}

	@ObfuscatedName("DYEBQOMK.a(Z)LCSGBDGDY;")
	public final CSGBDGDY method187() {
		int var1 = -1;
		if (field606 != null) {
			int var2 = client.field453 - field594;
			if (var2 > 100 && field606.field1063 > 0) {
				var2 = 100;
			}

			while (var2 > field606.method427(field593)) {
				var2 -= field606.method427(field593);
				field593++;
				if (field593 >= field606.field1059) {
					field593 -= field606.field1063;
					if (field593 < 0 || field593 >= field606.field1059) {
						break;
					}
				}
			}

			field606 = null;
			field594 = client.field453 - var2;

			if (field606 != null) {
				var1 = field606.field1060[field593];
			}
		}

		NRKXAGEB var3;
		if (field595 == null) {
			var3 = NRKXAGEB.method400(field601);
		} else {
			var3 = method186();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method408(field602, field603, field596, field597, field598, field599, var1);
	}
}
