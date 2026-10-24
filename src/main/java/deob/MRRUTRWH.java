package deob;

@ObfuscatedName("MRRUTRWH")
public final class MRRUTRWH extends ANJAEDVY {

	@ObfuscatedName("MRRUTRWH.t")
	public boolean field1192 = false;

	@ObfuscatedName("MRRUTRWH.w")
	public IMWZJOXU field1195;

	@ObfuscatedName("MRRUTRWH.p")
	public int field1188;

	@ObfuscatedName("MRRUTRWH.q")
	public int field1189;

	@ObfuscatedName("MRRUTRWH.r")
	public int field1190;

	@ObfuscatedName("MRRUTRWH.s")
	public int field1191;

	@ObfuscatedName("MRRUTRWH.n")
	public int field1187;

	@ObfuscatedName("MRRUTRWH.u")
	public int field1193;

	@ObfuscatedName("MRRUTRWH.v")
	public int field1194;

	@ObfuscatedName("MRRUTRWH.a(II)V")
	public final void method508(int arg0) {
		field1194 += arg0;
		while (field1194 > field1195.field996.method581(field1193)) {
			field1194 -= field1195.field996.method581(field1193) + 1;
			field1193++;
			if (field1193 >= field1195.field996.field1471 && (field1193 < 0 || field1193 >= field1195.field996.field1471)) {
				field1193 = 0;
				field1192 = true;
			}
		}
	}

	public MRRUTRWH(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1195 = IMWZJOXU.field992[arg0];
		field1188 = arg4;
		field1189 = arg6;
		field1190 = arg3;
		field1191 = arg1;
		field1187 = arg2 + arg5;
		field1192 = false;
	}

	@ObfuscatedName("MRRUTRWH.a(B)LLSSDQDBV;")
	public final LSSDQDBV method6() {
		LSSDQDBV var1 = field1195.method378();
		if (var1 == null) {
			return null;
		}

		int var2 = field1195.field996.field1472[field1193];
		LSSDQDBV var3 = new LSSDQDBV(false, var1, YGZNOIUP.method599(var2), true);
		if (!field1192) {
			var3.method430();
			var3.method431(var2);
			var3.field1096 = null;
			var3.field1095 = null;
		}

		if (field1195.field999 != 128 || field1195.field1000 != 128) {
			var3.method439(field1195.field1000, field1195.field999, field1195.field999);
		}

		if (field1195.field1001 != 0) {
			if (field1195.field1001 == 90) {
				var3.method434();
			}

			if (field1195.field1001 == 180) {
				var3.method434();
				var3.method434();
			}

			if (field1195.field1001 == 270) {
				var3.method434();
				var3.method434();
				var3.method434();
			}
		}

		var3.method440(field1195.field1002 + 64, field1195.field1003 + 850, -30, -50, -30, true);
		return var3;
	}
}
