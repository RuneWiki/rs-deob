package deob;

@ObfuscatedName("OTSGNSQM")
public final class OTSGNSQM {

	@ObfuscatedName("OTSGNSQM.d")
	public int field1027;

	@ObfuscatedName("OTSGNSQM.i")
	public boolean field1032;

	@ObfuscatedName("OTSGNSQM.c")
	public byte[] field1026;

	@ObfuscatedName("OTSGNSQM.e")
	public int[] field1028;

	@ObfuscatedName("OTSGNSQM.f")
	public int[] field1029;

	@ObfuscatedName("OTSGNSQM.g")
	public int[] field1030;

	@ObfuscatedName("OTSGNSQM.h")
	public int[] field1031;

	public OTSGNSQM(byte[] arg0) {
		method375(arg0);
	}

	@ObfuscatedName("OTSGNSQM.a(I[B)V")
	public void method375(byte[] arg0) {
		YOXDZEVD var2 = new YOXDZEVD(arg0);
		int var3 = var2.method553();
		int var4 = var2.method553();
		if (var3 == var4) {
			field1026 = arg0;
			field1032 = false;
		} else {
			byte[] var5 = new byte[var3];
			TAKJUEWR.method418(var5, var3, arg0, var4, 6);
			field1026 = var5;
			var2 = new YOXDZEVD(field1026);
			field1032 = true;
		}

		field1027 = var2.method551();
		field1028 = new int[field1027];
		field1029 = new int[field1027];
		field1030 = new int[field1027];
		field1031 = new int[field1027];
		int var6 = field1027 * 10 + var2.field1393;
		for (int var7 = 0; var7 < field1027; var7++) {
			field1028[var7] = var2.method554();
			field1029[var7] = var2.method553();
			field1030[var7] = var2.method553();
			field1031[var7] = var6;
			var6 += field1030[var7];
		}
	}

	@ObfuscatedName("OTSGNSQM.a(Ljava/lang/String;[B)[B")
	public byte[] method376(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1027; var5++) {
			if (field1028[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1029[var5]];
				}

				if (field1032) {
					for (int var6 = 0; var6 < field1029[var5]; var6++) {
						arg1[var6] = field1026[field1031[var5] + var6];
					}
				} else {
					TAKJUEWR.method418(arg1, field1029[var5], field1026, field1030[var5], field1031[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
