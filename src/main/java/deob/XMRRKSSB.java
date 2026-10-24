package deob;

@ObfuscatedName("XMRRKSSB")
public final class XMRRKSSB {

	@ObfuscatedName("XMRRKSSB.c")
	public int field1305;

	@ObfuscatedName("XMRRKSSB.h")
	public boolean field1310;

	@ObfuscatedName("XMRRKSSB.b")
	public byte[] field1304;

	@ObfuscatedName("XMRRKSSB.d")
	public int[] field1306;

	@ObfuscatedName("XMRRKSSB.e")
	public int[] field1307;

	@ObfuscatedName("XMRRKSSB.f")
	public int[] field1308;

	@ObfuscatedName("XMRRKSSB.g")
	public int[] field1309;

	public XMRRKSSB(byte[] arg0) {
		method464(arg0);
	}

	@ObfuscatedName("XMRRKSSB.a([BZ)V")
	public void method464(byte[] arg0) {
		XQPFGONL var2 = new XQPFGONL(arg0);
		int var3 = var2.method482();
		int var4 = var2.method482();
		if (var3 == var4) {
			field1304 = arg0;
			field1310 = false;
		} else {
			byte[] var5 = new byte[var3];
			JNDEFVRW.method287(var5, var3, arg0, var4, 6);
			field1304 = var5;
			var2 = new XQPFGONL(field1304);
			field1310 = true;
		}

		field1305 = var2.method480();
		field1306 = new int[field1305];
		field1307 = new int[field1305];
		field1308 = new int[field1305];
		field1309 = new int[field1305];
		int var6 = field1305 * 10 + var2.field1335;
		for (int var7 = 0; var7 < field1305; var7++) {
			field1306[var7] = var2.method483();
			field1307[var7] = var2.method482();
			field1308[var7] = var2.method482();
			field1309[var7] = var6;
			var6 += field1308[var7];
		}
	}

	@ObfuscatedName("XMRRKSSB.a(Ljava/lang/String;[B)[B")
	public byte[] method465(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1305; var5++) {
			if (field1306[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1307[var5]];
				}

				if (field1310) {
					for (int var6 = 0; var6 < field1307[var5]; var6++) {
						arg1[var6] = field1304[field1309[var5] + var6];
					}
				} else {
					JNDEFVRW.method287(arg1, field1307[var5], field1304, field1308[var5], field1309[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
