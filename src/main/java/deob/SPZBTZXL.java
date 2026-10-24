package deob;

@ObfuscatedName("SPZBTZXL")
public final class SPZBTZXL {

	@ObfuscatedName("SPZBTZXL.e")
	public int field1096;

	@ObfuscatedName("SPZBTZXL.j")
	public boolean field1101;

	@ObfuscatedName("SPZBTZXL.d")
	public byte[] field1095;

	@ObfuscatedName("SPZBTZXL.f")
	public int[] field1097;

	@ObfuscatedName("SPZBTZXL.g")
	public int[] field1098;

	@ObfuscatedName("SPZBTZXL.h")
	public int[] field1099;

	@ObfuscatedName("SPZBTZXL.i")
	public int[] field1100;

	public SPZBTZXL(byte[] arg0) {
		method514(arg0);
	}

	@ObfuscatedName("SPZBTZXL.a([BI)V")
	public void method514(byte[] arg0) {
		LDILQFVA var2 = new LDILQFVA(arg0);
		int var3 = var2.method406();
		int var4 = var2.method406();
		if (var3 == var4) {
			field1095 = arg0;
			field1101 = false;
		} else {
			byte[] var5 = new byte[var3];
			ZJFRIHZL.method578(var5, var3, arg0, var4, 6);
			field1095 = var5;
			var2 = new LDILQFVA(field1095);
			field1101 = true;
		}

		field1096 = var2.method404();
		field1097 = new int[field1096];
		field1098 = new int[field1096];
		field1099 = new int[field1096];
		field1100 = new int[field1096];
		int var6 = field1096 * 10 + var2.field902;
		for (int var7 = 0; var7 < field1096; var7++) {
			field1097[var7] = var2.method407();
			field1098[var7] = var2.method406();
			field1099[var7] = var2.method406();
			field1100[var7] = var6;
			var6 += field1099[var7];
		}
	}

	@ObfuscatedName("SPZBTZXL.a(Ljava/lang/String;[B)[B")
	public byte[] method515(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1096; var5++) {
			if (field1097[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1098[var5]];
				}

				if (field1101) {
					for (int var6 = 0; var6 < field1098[var5]; var6++) {
						arg1[var6] = field1095[field1100[var5] + var6];
					}
				} else {
					ZJFRIHZL.method578(arg1, field1098[var5], field1095, field1099[var5], field1100[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
