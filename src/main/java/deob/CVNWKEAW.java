package deob;

@ObfuscatedName("CVNWKEAW")
public final class CVNWKEAW {

	@ObfuscatedName("CVNWKEAW.f")
	public int field484;

	@ObfuscatedName("CVNWKEAW.k")
	public boolean field489;

	@ObfuscatedName("CVNWKEAW.e")
	public byte[] field483;

	@ObfuscatedName("CVNWKEAW.g")
	public int[] field485;

	@ObfuscatedName("CVNWKEAW.h")
	public int[] field486;

	@ObfuscatedName("CVNWKEAW.i")
	public int[] field487;

	@ObfuscatedName("CVNWKEAW.j")
	public int[] field488;

	public CVNWKEAW(byte[] arg0) {
		method179(arg0);
	}

	@ObfuscatedName("CVNWKEAW.a(I[B)V")
	public void method179(byte[] arg0) {
		XOUQUKZW var2 = new XOUQUKZW(arg0);
		int var3 = var2.method525();
		int var4 = var2.method525();
		if (var3 == var4) {
			field483 = arg0;
			field489 = false;
		} else {
			byte[] var5 = new byte[var3];
			OHPTKXPC.method423(var5, var3, arg0, var4, 6);
			field483 = var5;
			var2 = new XOUQUKZW(field483);
			field489 = true;
		}

		field484 = var2.method523();
		field485 = new int[field484];
		field486 = new int[field484];
		field487 = new int[field484];
		field488 = new int[field484];
		int var6 = field484 * 10 + var2.field1367;
		for (int var7 = 0; var7 < field484; var7++) {
			field485[var7] = var2.method526();
			field486[var7] = var2.method525();
			field487[var7] = var2.method525();
			field488[var7] = var6;
			var6 += field487[var7];
		}
	}

	@ObfuscatedName("CVNWKEAW.a(Ljava/lang/String;[B)[B")
	public byte[] method180(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field484; var5++) {
			if (field485[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field486[var5]];
				}

				if (field489) {
					for (int var6 = 0; var6 < field486[var5]; var6++) {
						arg1[var6] = field483[field488[var5] + var6];
					}
				} else {
					OHPTKXPC.method423(arg1, field486[var5], field483, field487[var5], field488[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
