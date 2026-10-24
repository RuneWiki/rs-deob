package deob;

@ObfuscatedName("UUIGNTAD")
public final class UUIGNTAD {

	@ObfuscatedName("UUIGNTAD.e")
	public int field1303;

	@ObfuscatedName("UUIGNTAD.j")
	public boolean field1308;

	@ObfuscatedName("UUIGNTAD.d")
	public byte[] field1302;

	@ObfuscatedName("UUIGNTAD.f")
	public int[] field1304;

	@ObfuscatedName("UUIGNTAD.g")
	public int[] field1305;

	@ObfuscatedName("UUIGNTAD.h")
	public int[] field1306;

	@ObfuscatedName("UUIGNTAD.i")
	public int[] field1307;

	public UUIGNTAD(byte[] arg0) {
		method544(arg0);
	}

	@ObfuscatedName("UUIGNTAD.a([BZ)V")
	public void method544(byte[] arg0) {
		CMGGUSPR var2 = new CMGGUSPR(arg0);
		int var3 = var2.method198();
		int var4 = var2.method198();
		if (var3 == var4) {
			field1302 = arg0;
			field1308 = false;
		} else {
			byte[] var5 = new byte[var3];
			DTLPXPBO.method247(var5, var3, arg0, var4, 6);
			field1302 = var5;
			var2 = new CMGGUSPR(field1302);
			field1308 = true;
		}

		field1303 = var2.method196();
		field1304 = new int[field1303];
		field1305 = new int[field1303];
		field1306 = new int[field1303];
		field1307 = new int[field1303];
		int var6 = field1303 * 10 + var2.field540;
		for (int var7 = 0; var7 < field1303; var7++) {
			field1304[var7] = var2.method199();
			field1305[var7] = var2.method198();
			field1306[var7] = var2.method198();
			field1307[var7] = var6;
			var6 += field1306[var7];
		}
	}

	@ObfuscatedName("UUIGNTAD.a(Ljava/lang/String;[B)[B")
	public byte[] method545(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1303; var5++) {
			if (field1304[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1305[var5]];
				}

				if (field1308) {
					for (int var6 = 0; var6 < field1305[var5]; var6++) {
						arg1[var6] = field1302[field1307[var5] + var6];
					}
				} else {
					DTLPXPBO.method247(arg1, field1305[var5], field1302, field1306[var5], field1307[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
