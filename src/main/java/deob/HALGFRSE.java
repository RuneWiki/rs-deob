package deob;

@ObfuscatedName("HALGFRSE")
public class HALGFRSE extends FKSXNQOK {

	@ObfuscatedName("HALGFRSE.n")
	public int field637;

	@ObfuscatedName("HALGFRSE.o")
	public int field638;

	@ObfuscatedName("HALGFRSE.p")
	public int field639;

	@ObfuscatedName("HALGFRSE.t")
	public int field642;

	@ObfuscatedName("HALGFRSE.u")
	public int field643;

	@ObfuscatedName("HALGFRSE.v")
	public int field644;

	@ObfuscatedName("HALGFRSE.w")
	public int field645;

	@ObfuscatedName("HALGFRSE.l")
	public LCRVYGCP field635;

	@ObfuscatedName("HALGFRSE.r")
	public int field641;

	@ObfuscatedName("HALGFRSE.B")
	public int field648;

	@ObfuscatedName("HALGFRSE.x")
	public int field646;

	@ObfuscatedName("HALGFRSE.y")
	public int field647;

	@ObfuscatedName("HALGFRSE.m")
	public int[] field636;

	@ObfuscatedName("HALGFRSE.q")
	public static client field640;

	@ObfuscatedName("HALGFRSE.a(I)LRTQSBWRH;")
	public final RTQSBWRH method199() {
		int var1 = -1;
		if (field635 != null) {
			int var2 = client.field236 - field648;
			if (var2 > 100 && field635.field800 > 0) {
				var2 = 100;
			}

			while (var2 > field635.method361(field641)) {
				var2 -= field635.method361(field641);
				field641++;
				if (field641 >= field635.field796) {
					field641 -= field635.field800;
					if (field641 < 0 || field641 >= field635.field796) {
						break;
					}
				}
			}

			field635 = null;
			field648 = client.field236 - var2;

			if (field635 != null) {
				var1 = field635.field797[field641];
			}
		}

		SYTHBZWG var3;
		if (field636 == null) {
			var3 = SYTHBZWG.method491(field637);
		} else {
			var3 = method285();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method486(field638, field639, field642, field643, field644, field645, var1);
	}

	public HALGFRSE(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field637 = arg3;
		field638 = arg0;
		field639 = arg1;
		field642 = arg8;
		field643 = arg2;
		field644 = arg6;
		field645 = arg5;

		if (arg4 != -1) {
			field635 = LCRVYGCP.field795[arg4];
			field641 = 0;
			field648 = client.field236;
			if (arg7 && field635.field800 != -1) {
				field641 = (int) (Math.random() * field635.field796);
				field648 -= (int) (Math.random() * field635.method361(field641));
			}
		}

		SYTHBZWG var10 = SYTHBZWG.method491(field637);
		field646 = var10.field1215;
		field647 = var10.field1200;
		field636 = var10.field1182;
	}

	@ObfuscatedName("HALGFRSE.a(Z)LSYTHBZWG;")
	public final SYTHBZWG method285() {
		int var1 = -1;
		if (field646 != -1) {
			AIRUOZLB var2 = AIRUOZLB.field4[field646];
			int var3 = var2.field6;
			int var4 = var2.field7;
			int var5 = var2.field8;
			int var6 = client.field500[var5 - var4];
			var1 = field640.field418[var3] >> var4 & var6;
		} else if (field647 != -1) {
			var1 = field640.field418[field647];
		}

		if (var1 >= 0 && var1 < field636.length && field636[var1] != -1) {
			return SYTHBZWG.method491(field636[var1]);
		}

		return null;
	}
}
