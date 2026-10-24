package deob;

@ObfuscatedName("BMMXGYBV")
public class BMMXGYBV extends CRKDFBCP {

	@ObfuscatedName("BMMXGYBV.o")
	public int field91;

	@ObfuscatedName("BMMXGYBV.p")
	public int field92;

	@ObfuscatedName("BMMXGYBV.q")
	public int field93;

	@ObfuscatedName("BMMXGYBV.v")
	public int field97;

	@ObfuscatedName("BMMXGYBV.w")
	public int field98;

	@ObfuscatedName("BMMXGYBV.x")
	public int field99;

	@ObfuscatedName("BMMXGYBV.y")
	public int field100;

	@ObfuscatedName("BMMXGYBV.z")
	public KSVXFIAD field101;

	@ObfuscatedName("BMMXGYBV.r")
	public int field94;

	@ObfuscatedName("BMMXGYBV.t")
	public int field96;

	@ObfuscatedName("BMMXGYBV.m")
	public int field89;

	@ObfuscatedName("BMMXGYBV.n")
	public int field90;

	@ObfuscatedName("BMMXGYBV.l")
	public int[] field88;

	@ObfuscatedName("BMMXGYBV.s")
	public static client field95;

	public BMMXGYBV(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field91 = arg2;
		field92 = arg0;
		field93 = arg8;
		field97 = arg6;
		field98 = arg5;
		field99 = arg4;
		field100 = arg1;

		if (arg3 != -1) {
			field101 = KSVXFIAD.field1002[arg3];
			field94 = 0;
			field96 = client.field456;
			if (arg7 && field101.field1007 != -1) {
				field94 = (int) (Math.random() * field101.field1003);
				field96 -= (int) (Math.random() * field101.method375(field94));
			}
		}

		SOLNFIIQ var10 = SOLNFIIQ.method499(field91);
		field89 = var10.field1283;
		field90 = var10.field1281;
		field88 = var10.field1327;
	}

	@ObfuscatedName("BMMXGYBV.a(I)LOGORHYVW;")
	public final OGORHYVW method5() {
		int var1 = -1;
		if (field101 != null) {
			int var2 = client.field456 - field96;
			if (var2 > 100 && field101.field1007 > 0) {
				var2 = 100;
			}

			while (var2 > field101.method375(field94)) {
				var2 -= field101.method375(field94);
				field94++;
				if (field94 >= field101.field1003) {
					field94 -= field101.field1007;
					if (field94 < 0 || field94 >= field101.field1003) {
						break;
					}
				}
			}

			field101 = null;
			field96 = client.field456 - var2;

			if (field101 != null) {
				var1 = field101.field1004[field94];
			}
		}

		SOLNFIIQ var3;
		if (field88 == null) {
			var3 = SOLNFIIQ.method499(field91);
		} else {
			var3 = method11();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method496(field92, field93, field97, field98, field99, field100, var1);
	}

	@ObfuscatedName("BMMXGYBV.b(I)LSOLNFIIQ;")
	public final SOLNFIIQ method11() {
		int var1 = -1;
		if (field89 != -1) {
			UDCHKCCJ var2 = UDCHKCCJ.field1395[field89];
			int var3 = var2.field1397;
			int var4 = var2.field1398;
			int var5 = var2.field1399;
			int var6 = client.field571[var5 - var4];
			var1 = field95.field472[var3] >> var4 & var6;
		} else if (field90 != -1) {
			var1 = field95.field472[field90];
		}

		if (var1 >= 0 && var1 < field88.length && field88[var1] != -1) {
			return SOLNFIIQ.method499(field88[var1]);
		}

		return null;
	}
}
