package deob;

@ObfuscatedName("LOFYMKZK")
public class LOFYMKZK extends XPEMEMUL {

	@ObfuscatedName("LOFYMKZK.x")
	public int field971;

	@ObfuscatedName("LOFYMKZK.y")
	public int field972;

	@ObfuscatedName("LOFYMKZK.z")
	public int field973;

	@ObfuscatedName("LOFYMKZK.n")
	public int field962;

	@ObfuscatedName("LOFYMKZK.o")
	public int field963;

	@ObfuscatedName("LOFYMKZK.p")
	public int field964;

	@ObfuscatedName("LOFYMKZK.q")
	public int field965;

	@ObfuscatedName("LOFYMKZK.B")
	public NMXKUYSC field975;

	@ObfuscatedName("LOFYMKZK.r")
	public int field966;

	@ObfuscatedName("LOFYMKZK.w")
	public int field970;

	@ObfuscatedName("LOFYMKZK.u")
	public int field968;

	@ObfuscatedName("LOFYMKZK.v")
	public int field969;

	@ObfuscatedName("LOFYMKZK.A")
	public int[] field974;

	@ObfuscatedName("LOFYMKZK.t")
	public static client field967;

	public LOFYMKZK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field971 = arg1;
		field972 = arg2;
		field973 = arg0;
		field962 = arg5;
		field963 = arg4;
		field964 = arg8;
		field965 = arg7;

		if (arg3 != -1) {
			field975 = NMXKUYSC.field998[arg3];
			field966 = 0;
			field970 = client.field425;
			if (arg6 && field975.field1003 != -1) {
				field966 = (int) (Math.random() * field975.field999);
				field970 -= (int) (Math.random() * field975.method415(field966));
			}
		}

		SCWSBSIM var10 = SCWSBSIM.method464(field971);
		field968 = var10.field1258;
		field969 = var10.field1273;
		field974 = var10.field1266;
	}

	@ObfuscatedName("LOFYMKZK.b(I)LSCWSBSIM;")
	public final SCWSBSIM method411() {
		int var1 = -1;
		if (field968 != -1) {
			XBHMGKWV var2 = XBHMGKWV.field1354[field968];
			int var3 = var2.field1356;
			int var4 = var2.field1357;
			int var5 = var2.field1358;
			int var6 = client.field378[var5 - var4];
			var1 = field967.field342[var3] >> var4 & var6;
		} else if (field969 != -1) {
			var1 = field967.field342[field969];
		}

		if (var1 >= 0 && var1 < field974.length && field974[var1] != -1) {
			return SCWSBSIM.method464(field974[var1]);
		}

		return null;
	}

	@ObfuscatedName("LOFYMKZK.a(I)LKPUOCBCE;")
	public final KPUOCBCE method11() {
		int var1 = -1;
		if (field975 != null) {
			int var2 = client.field425 - field970;
			if (var2 > 100 && field975.field1003 > 0) {
				var2 = 100;
			}

			while (var2 > field975.method415(field966)) {
				var2 -= field975.method415(field966);
				field966++;
				if (field966 >= field975.field999) {
					field966 -= field975.field1003;
					if (field966 < 0 || field966 >= field975.field999) {
						break;
					}
				}
			}

			field975 = null;
			field970 = client.field425 - var2;

			if (field975 != null) {
				var1 = field975.field1000[field966];
			}
		}

		SCWSBSIM var3;
		if (field974 == null) {
			var3 = SCWSBSIM.method464(field971);
		} else {
			var3 = method411();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method470(field972, field973, field962, field963, field964, field965, var1);
	}
}
