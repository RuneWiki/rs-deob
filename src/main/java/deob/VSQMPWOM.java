package deob;

@ObfuscatedName("VSQMPWOM")
public final class VSQMPWOM {

	@ObfuscatedName("VSQMPWOM.e")
	public int field1308;

	@ObfuscatedName("VSQMPWOM.j")
	public boolean field1313;

	@ObfuscatedName("VSQMPWOM.d")
	public byte[] field1307;

	@ObfuscatedName("VSQMPWOM.f")
	public int[] field1309;

	@ObfuscatedName("VSQMPWOM.g")
	public int[] field1310;

	@ObfuscatedName("VSQMPWOM.h")
	public int[] field1311;

	@ObfuscatedName("VSQMPWOM.i")
	public int[] field1312;

	public VSQMPWOM(byte[] arg0) {
		method525(arg0);
	}

	@ObfuscatedName("VSQMPWOM.a([BI)V")
	public void method525(byte[] arg0) {
		BFQIDHPO var2 = new BFQIDHPO(arg0);
		int var3 = var2.method58();
		int var4 = var2.method58();
		if (var3 == var4) {
			field1307 = arg0;
			field1313 = false;
		} else {
			byte[] var5 = new byte[var3];
			XKTKWFYG.method567(var5, var3, arg0, var4, 6);
			field1307 = var5;
			var2 = new BFQIDHPO(field1307);
			field1313 = true;
		}

		field1308 = var2.method56();
		field1309 = new int[field1308];
		field1310 = new int[field1308];
		field1311 = new int[field1308];
		field1312 = new int[field1308];
		int var6 = field1308 * 10 + var2.field10;
		for (int var7 = 0; var7 < field1308; var7++) {
			field1309[var7] = var2.method59();
			field1310[var7] = var2.method58();
			field1311[var7] = var2.method58();
			field1312[var7] = var6;
			var6 += field1311[var7];
		}
	}

	@ObfuscatedName("VSQMPWOM.a(Ljava/lang/String;[B)[B")
	public byte[] method526(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1308; var5++) {
			if (field1309[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1310[var5]];
				}

				if (field1313) {
					for (int var6 = 0; var6 < field1310[var5]; var6++) {
						arg1[var6] = field1307[field1312[var5] + var6];
					}
				} else {
					XKTKWFYG.method567(arg1, field1310[var5], field1307, field1311[var5], field1312[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
