package deob;

@ObfuscatedName("AZNRLUAT")
public class AZNRLUAT extends JEESRQGR {

	@ObfuscatedName("AZNRLUAT.t")
	public int field45;

	@ObfuscatedName("AZNRLUAT.u")
	public int field46;

	@ObfuscatedName("AZNRLUAT.v")
	public int field47;

	@ObfuscatedName("AZNRLUAT.w")
	public int field48;

	@ObfuscatedName("AZNRLUAT.x")
	public int field49;

	@ObfuscatedName("AZNRLUAT.y")
	public int field50;

	@ObfuscatedName("AZNRLUAT.z")
	public int field51;

	@ObfuscatedName("AZNRLUAT.l")
	public MJVHTYCA field38;

	@ObfuscatedName("AZNRLUAT.m")
	public int field39;

	@ObfuscatedName("AZNRLUAT.n")
	public int field40;

	@ObfuscatedName("AZNRLUAT.o")
	public int field41;

	@ObfuscatedName("AZNRLUAT.p")
	public int field42;

	@ObfuscatedName("AZNRLUAT.q")
	public int[] field43;

	@ObfuscatedName("AZNRLUAT.s")
	public static client field44;

	@ObfuscatedName("AZNRLUAT.a(Z)LBMWIVHMF;")
	public final BMWIVHMF method12() {
		int var1 = -1;
		if (field41 != -1) {
			HUPZKMWH var2 = HUPZKMWH.field786[field41];
			int var3 = var2.field788;
			int var4 = var2.field789;
			int var5 = var2.field790;
			int var6 = client.field339[var5 - var4];
			var1 = field44.field275[var3] >> var4 & var6;
		} else if (field42 != -1) {
			var1 = field44.field275[field42];
		}

		if (var1 >= 0 && var1 < field43.length && field43[var1] != -1) {
			return BMWIVHMF.method30(field43[var1]);
		}

		return null;
	}

	@ObfuscatedName("AZNRLUAT.a(I)LVYUQHOMO;")
	public final VYUQHOMO method13() {
		int var1 = -1;
		if (field38 != null) {
			int var2 = client.field512 - field40;
			if (var2 > 100 && field38.field1049 > 0) {
				var2 = 100;
			}

			while (var2 > field38.method319(field39)) {
				var2 -= field38.method319(field39);
				field39++;
				if (field39 >= field38.field1045) {
					field39 -= field38.field1049;
					if (field39 < 0 || field39 >= field38.field1045) {
						break;
					}
				}
			}

			field38 = null;
			field40 = client.field512 - var2;

			if (field38 != null) {
				var1 = field38.field1046[field39];
			}
		}

		BMWIVHMF var3;
		if (field43 == null) {
			var3 = BMWIVHMF.method30(field45);
		} else {
			var3 = method12();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method27(field46, field47, field48, field49, field50, field51, var1);
	}

	public AZNRLUAT(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
		field45 = arg2;
		field46 = arg5;
		field47 = arg6;
		field48 = arg1;
		field49 = arg3;
		field50 = arg0;
		field51 = arg8;

		if (arg7 != -1) {
			field38 = MJVHTYCA.field1044[arg7];
			field39 = 0;
			field40 = client.field512;
			if (arg4 && field38.field1049 != -1) {
				field39 = (int) (Math.random() * field38.field1045);
				field40 -= (int) (Math.random() * field38.method319(field39));
			}
		}

		BMWIVHMF var10 = BMWIVHMF.method30(field45);
		field41 = var10.field118;
		field42 = var10.field120;
		field43 = var10.field78;
	}
}
