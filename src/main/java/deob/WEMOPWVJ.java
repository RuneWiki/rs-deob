package deob;

@ObfuscatedName("WEMOPWVJ")
public final class WEMOPWVJ {

	@ObfuscatedName("WEMOPWVJ.e")
	public int field1416;

	@ObfuscatedName("WEMOPWVJ.j")
	public boolean field1421;

	@ObfuscatedName("WEMOPWVJ.d")
	public byte[] field1415;

	@ObfuscatedName("WEMOPWVJ.f")
	public int[] field1417;

	@ObfuscatedName("WEMOPWVJ.g")
	public int[] field1418;

	@ObfuscatedName("WEMOPWVJ.h")
	public int[] field1419;

	@ObfuscatedName("WEMOPWVJ.i")
	public int[] field1420;

	public WEMOPWVJ(byte[] arg0) {
		method558(arg0);
	}

	@ObfuscatedName("WEMOPWVJ.a(Z[B)V")
	public void method558(byte[] arg0) {
		SVWJKJVI var2 = new SVWJKJVI(arg0);
		int var3 = var2.method465();
		int var4 = var2.method465();
		if (var3 == var4) {
			field1415 = arg0;
			field1421 = false;
		} else {
			byte[] var5 = new byte[var3];
			JNLAREVU.method300(var5, var3, arg0, var4, 6);
			field1415 = var5;
			var2 = new SVWJKJVI(field1415);
			field1421 = true;
		}

		field1416 = var2.method463();
		field1417 = new int[field1416];
		field1418 = new int[field1416];
		field1419 = new int[field1416];
		field1420 = new int[field1416];
		int var6 = field1416 * 10 + var2.field1263;
		for (int var7 = 0; var7 < field1416; var7++) {
			field1417[var7] = var2.method466();
			field1418[var7] = var2.method465();
			field1419[var7] = var2.method465();
			field1420[var7] = var6;
			var6 += field1419[var7];
		}
	}

	@ObfuscatedName("WEMOPWVJ.a(Ljava/lang/String;[B)[B")
	public byte[] method559(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1416; var5++) {
			if (field1417[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1418[var5]];
				}

				if (field1421) {
					for (int var6 = 0; var6 < field1418[var5]; var6++) {
						arg1[var6] = field1415[field1420[var5] + var6];
					}
				} else {
					JNLAREVU.method300(arg1, field1418[var5], field1415, field1419[var5], field1420[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
