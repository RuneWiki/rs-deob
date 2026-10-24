package deob;

@ObfuscatedName("SYUGXMZF")
public final class SYUGXMZF {

	@ObfuscatedName("SYUGXMZF.e")
	public int field1254;

	@ObfuscatedName("SYUGXMZF.j")
	public boolean field1259;

	@ObfuscatedName("SYUGXMZF.d")
	public byte[] field1253;

	@ObfuscatedName("SYUGXMZF.f")
	public int[] field1255;

	@ObfuscatedName("SYUGXMZF.g")
	public int[] field1256;

	@ObfuscatedName("SYUGXMZF.h")
	public int[] field1257;

	@ObfuscatedName("SYUGXMZF.i")
	public int[] field1258;

	public SYUGXMZF(byte[] arg0) {
		method550(arg0);
	}

	@ObfuscatedName("SYUGXMZF.a(I[B)V")
	public void method550(byte[] arg0) {
		KHOMSBHW var2 = new KHOMSBHW(arg0);
		int var3 = var2.method353();
		int var4 = var2.method353();
		if (var3 == var4) {
			field1253 = arg0;
			field1259 = false;
		} else {
			byte[] var5 = new byte[var3];
			SAYOFZIJ.method518(var5, var3, arg0, var4, 6);
			field1253 = var5;
			var2 = new KHOMSBHW(field1253);
			field1259 = true;
		}

		field1254 = var2.method351();
		field1255 = new int[field1254];
		field1256 = new int[field1254];
		field1257 = new int[field1254];
		field1258 = new int[field1254];
		int var6 = field1254 * 10 + var2.field934;
		for (int var7 = 0; var7 < field1254; var7++) {
			field1255[var7] = var2.method354();
			field1256[var7] = var2.method353();
			field1257[var7] = var2.method353();
			field1258[var7] = var6;
			var6 += field1257[var7];
		}
	}

	@ObfuscatedName("SYUGXMZF.a(Ljava/lang/String;[B)[B")
	public byte[] method551(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1254; var5++) {
			if (field1255[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1256[var5]];
				}

				if (field1259) {
					for (int var6 = 0; var6 < field1256[var5]; var6++) {
						arg1[var6] = field1253[field1258[var5] + var6];
					}
				} else {
					SAYOFZIJ.method518(arg1, field1256[var5], field1253, field1257[var5], field1258[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
