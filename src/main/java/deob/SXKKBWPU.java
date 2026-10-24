package deob;

@ObfuscatedName("SXKKBWPU")
public final class SXKKBWPU {

	@ObfuscatedName("SXKKBWPU.d")
	public int field1231;

	@ObfuscatedName("SXKKBWPU.i")
	public boolean field1236;

	@ObfuscatedName("SXKKBWPU.c")
	public byte[] field1230;

	@ObfuscatedName("SXKKBWPU.e")
	public int[] field1232;

	@ObfuscatedName("SXKKBWPU.f")
	public int[] field1233;

	@ObfuscatedName("SXKKBWPU.g")
	public int[] field1234;

	@ObfuscatedName("SXKKBWPU.h")
	public int[] field1235;

	public SXKKBWPU(byte[] arg0) {
		method441(arg0);
	}

	@ObfuscatedName("SXKKBWPU.a(B[B)V")
	public void method441(byte[] arg0) {
		TQYMAXSO var2 = new TQYMAXSO(arg0);
		int var3 = var2.method472();
		int var4 = var2.method472();
		if (var3 == var4) {
			field1230 = arg0;
			field1236 = false;
		} else {
			byte[] var5 = new byte[var3];
			UCSBINUP.method507(var5, var3, arg0, var4, 6);
			field1230 = var5;
			var2 = new TQYMAXSO(field1230);
			field1236 = true;
		}

		field1231 = var2.method470();
		field1232 = new int[field1231];
		field1233 = new int[field1231];
		field1234 = new int[field1231];
		field1235 = new int[field1231];
		int var6 = field1231 * 10 + var2.field1263;
		for (int var7 = 0; var7 < field1231; var7++) {
			field1232[var7] = var2.method473();
			field1233[var7] = var2.method472();
			field1234[var7] = var2.method472();
			field1235[var7] = var6;
			var6 += field1234[var7];
		}
	}

	@ObfuscatedName("SXKKBWPU.a(Ljava/lang/String;[B)[B")
	public byte[] method442(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1231; var5++) {
			if (field1232[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1233[var5]];
				}

				if (field1236) {
					for (int var6 = 0; var6 < field1233[var5]; var6++) {
						arg1[var6] = field1230[field1235[var5] + var6];
					}
				} else {
					UCSBINUP.method507(arg1, field1233[var5], field1230, field1234[var5], field1235[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
