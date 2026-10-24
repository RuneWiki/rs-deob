package deob;

@ObfuscatedName("NXFIIFAD")
public final class NXFIIFAD {

	@ObfuscatedName("NXFIIFAD.e")
	public int field1091;

	@ObfuscatedName("NXFIIFAD.j")
	public boolean field1096;

	@ObfuscatedName("NXFIIFAD.d")
	public byte[] field1090;

	@ObfuscatedName("NXFIIFAD.f")
	public int[] field1092;

	@ObfuscatedName("NXFIIFAD.g")
	public int[] field1093;

	@ObfuscatedName("NXFIIFAD.h")
	public int[] field1094;

	@ObfuscatedName("NXFIIFAD.i")
	public int[] field1095;

	public NXFIIFAD(byte[] arg0) {
		method430(arg0);
	}

	@ObfuscatedName("NXFIIFAD.a(Z[B)V")
	public void method430(byte[] arg0) {
		MNKDCXXG var2 = new MNKDCXXG(arg0);
		int var3 = var2.method390();
		int var4 = var2.method390();
		if (var3 == var4) {
			field1090 = arg0;
			field1096 = false;
		} else {
			byte[] var5 = new byte[var3];
			DKFTTKQA.method177(var5, var3, arg0, var4, 6);
			field1090 = var5;
			var2 = new MNKDCXXG(field1090);
			field1096 = true;
		}

		field1091 = var2.method388();
		field1092 = new int[field1091];
		field1093 = new int[field1091];
		field1094 = new int[field1091];
		field1095 = new int[field1091];
		int var6 = field1091 * 10 + var2.field1055;
		for (int var7 = 0; var7 < field1091; var7++) {
			field1092[var7] = var2.method391();
			field1093[var7] = var2.method390();
			field1094[var7] = var2.method390();
			field1095[var7] = var6;
			var6 += field1094[var7];
		}
	}

	@ObfuscatedName("NXFIIFAD.a(Ljava/lang/String;[B)[B")
	public byte[] method431(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1091; var5++) {
			if (field1092[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1093[var5]];
				}

				if (field1096) {
					for (int var6 = 0; var6 < field1093[var5]; var6++) {
						arg1[var6] = field1090[field1095[var5] + var6];
					}
				} else {
					DKFTTKQA.method177(arg1, field1093[var5], field1090, field1094[var5], field1095[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
