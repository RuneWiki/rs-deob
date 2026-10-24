package deob;

@ObfuscatedName("TUJJLJTQ")
public class TUJJLJTQ extends XHDBBLMT {

	@ObfuscatedName("TUJJLJTQ.k")
	public int field1211;

	@ObfuscatedName("TUJJLJTQ.l")
	public int field1212;

	@ObfuscatedName("TUJJLJTQ.m")
	public int field1213;

	@ObfuscatedName("TUJJLJTQ.o")
	public int field1215;

	@ObfuscatedName("TUJJLJTQ.p")
	public int field1216;

	@ObfuscatedName("TUJJLJTQ.q")
	public int field1217;

	@ObfuscatedName("TUJJLJTQ.r")
	public int field1218;

	@ObfuscatedName("TUJJLJTQ.t")
	public ODMBIHRM field1219;

	@ObfuscatedName("TUJJLJTQ.x")
	public int field1222;

	@ObfuscatedName("TUJJLJTQ.n")
	public int field1214;

	@ObfuscatedName("TUJJLJTQ.y")
	public int field1223;

	@ObfuscatedName("TUJJLJTQ.z")
	public int field1224;

	@ObfuscatedName("TUJJLJTQ.u")
	public int[] field1220;

	@ObfuscatedName("TUJJLJTQ.v")
	public static client field1221;

	public TUJJLJTQ(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
		field1211 = arg0;
		field1212 = arg1;
		field1213 = arg6;
		field1215 = arg8;
		field1216 = arg2;
		field1217 = arg7;
		field1218 = arg4;

		if (arg3 != -1) {
			field1219 = ODMBIHRM.field1035[arg3];
			field1222 = 0;
			field1214 = client.field499;
			if (arg5 && field1219.field1040 != -1) {
				field1222 = (int) (Math.random() * field1219.field1036);
				field1214 -= (int) (Math.random() * field1219.method413(field1222));
			}
		}

		DQLJXYPC var10 = DQLJXYPC.method192(field1211);
		field1223 = var10.field665;
		field1224 = var10.field642;
		field1220 = var10.field659;
	}

	@ObfuscatedName("TUJJLJTQ.b(I)LDQLJXYPC;")
	public final DQLJXYPC method462() {
		int var1 = -1;
		if (field1223 != -1) {
			SRLFLGUY var2 = SRLFLGUY.field1160[field1223];
			int var3 = var2.field1162;
			int var4 = var2.field1163;
			int var5 = var2.field1164;
			int var6 = client.field476[var5 - var4];
			var1 = field1221.field580[var3] >> var4 & var6;
		} else if (field1224 != -1) {
			var1 = field1221.field580[field1224];
		}

		if (var1 >= 0 && var1 < field1220.length && field1220[var1] != -1) {
			return DQLJXYPC.method192(field1220[var1]);
		}

		return null;
	}

	@ObfuscatedName("TUJJLJTQ.a(I)LKBEXSZSN;")
	public final KBEXSZSN method28() {
		int var1 = -1;
		if (field1219 != null) {
			int var2 = client.field499 - field1214;
			if (var2 > 100 && field1219.field1040 > 0) {
				var2 = 100;
			}

			while (var2 > field1219.method413(field1222)) {
				var2 -= field1219.method413(field1222);
				field1222++;
				if (field1222 >= field1219.field1036) {
					field1222 -= field1219.field1040;
					if (field1222 < 0 || field1222 >= field1219.field1036) {
						break;
					}
				}
			}

			field1219 = null;
			field1214 = client.field499 - var2;

			if (field1219 != null) {
				var1 = field1219.field1037[field1222];
			}
		}

		DQLJXYPC var3;
		if (field1220 == null) {
			var3 = DQLJXYPC.method192(field1211);
		} else {
			var3 = method462();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method189(field1212, field1213, field1215, field1216, field1217, field1218, var1);
	}
}
