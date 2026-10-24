package deob;

@ObfuscatedName("OXCIEWBY")
public class OXCIEWBY extends XEUTUWWF {

	@ObfuscatedName("OXCIEWBY.v")
	public int field1087;

	@ObfuscatedName("OXCIEWBY.w")
	public int field1088;

	@ObfuscatedName("OXCIEWBY.x")
	public int field1089;

	@ObfuscatedName("OXCIEWBY.n")
	public int field1080;

	@ObfuscatedName("OXCIEWBY.o")
	public int field1081;

	@ObfuscatedName("OXCIEWBY.p")
	public int field1082;

	@ObfuscatedName("OXCIEWBY.q")
	public int field1083;

	@ObfuscatedName("OXCIEWBY.z")
	public ZGXCNUJM field1091;

	@ObfuscatedName("OXCIEWBY.s")
	public int field1085;

	@ObfuscatedName("OXCIEWBY.t")
	public int field1086;

	@ObfuscatedName("OXCIEWBY.l")
	public int field1078;

	@ObfuscatedName("OXCIEWBY.m")
	public int field1079;

	@ObfuscatedName("OXCIEWBY.y")
	public int[] field1090;

	@ObfuscatedName("OXCIEWBY.r")
	public static client field1084;

	@ObfuscatedName("OXCIEWBY.b(B)LSRQVPDWQ;")
	public final SRQVPDWQ method384() {
		int var1 = -1;
		if (field1078 != -1) {
			LVQCDTJA var2 = LVQCDTJA.field901[field1078];
			int var3 = var2.field903;
			int var4 = var2.field904;
			int var5 = var2.field905;
			int var6 = client.field501[var5 - var4];
			var1 = field1084.field532[var3] >> var4 & var6;
		} else if (field1079 != -1) {
			var1 = field1084.field532[field1079];
		}

		if (var1 >= 0 && var1 < field1090.length && field1090[var1] != -1) {
			return SRQVPDWQ.method445(field1090[var1]);
		}

		return null;
	}

	@ObfuscatedName("OXCIEWBY.a(B)LSNMMQNPZ;")
	public final SNMMQNPZ method175() {
		int var1 = -1;
		if (field1091 != null) {
			int var2 = client.field402 - field1086;
			if (var2 > 100 && field1091.field1486 > 0) {
				var2 = 100;
			}

			while (var2 > field1091.method598(field1085)) {
				var2 -= field1091.method598(field1085);
				field1085++;
				if (field1085 >= field1091.field1482) {
					field1085 -= field1091.field1486;
					if (field1085 < 0 || field1085 >= field1091.field1482) {
						break;
					}
				}
			}

			field1091 = null;
			field1086 = client.field402 - var2;

			if (field1091 != null) {
				var1 = field1091.field1483[field1085];
			}
		}

		SRQVPDWQ var3;
		if (field1090 == null) {
			var3 = SRQVPDWQ.method445(field1087);
		} else {
			var3 = method384();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method446(field1088, field1089, field1080, field1081, field1082, field1083, var1);
	}

	public OXCIEWBY(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		field1087 = arg5;
		field1088 = arg8;
		field1089 = arg3;
		field1080 = arg0;
		field1081 = arg1;
		field1082 = arg4;
		field1083 = arg6;

		if (arg2 != -1) {
			field1091 = ZGXCNUJM.field1481[arg2];
			field1085 = 0;
			field1086 = client.field402;
			if (arg7 && field1091.field1486 != -1) {
				field1085 = (int) (Math.random() * field1091.field1482);
				field1086 -= (int) (Math.random() * field1091.method598(field1085));
			}
		}

		SRQVPDWQ var10 = SRQVPDWQ.method445(field1087);
		field1078 = var10.field1252;
		field1079 = var10.field1265;
		field1090 = var10.field1247;
	}
}
