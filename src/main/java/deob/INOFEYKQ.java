package deob;

@ObfuscatedName("INOFEYKQ")
public final class INOFEYKQ {

	@ObfuscatedName("INOFEYKQ.f")
	public int field864;

	@ObfuscatedName("INOFEYKQ.k")
	public boolean field869;

	@ObfuscatedName("INOFEYKQ.e")
	public byte[] field863;

	@ObfuscatedName("INOFEYKQ.g")
	public int[] field865;

	@ObfuscatedName("INOFEYKQ.h")
	public int[] field866;

	@ObfuscatedName("INOFEYKQ.i")
	public int[] field867;

	@ObfuscatedName("INOFEYKQ.j")
	public int[] field868;

	public INOFEYKQ(byte[] arg0) {
		method276(arg0);
	}

	@ObfuscatedName("INOFEYKQ.a(I[B)V")
	public void method276(byte[] arg0) {
		NHEPCMLW var2 = new NHEPCMLW(arg0);
		int var3 = var2.method353();
		int var4 = var2.method353();
		if (var3 == var4) {
			field863 = arg0;
			field869 = false;
		} else {
			byte[] var5 = new byte[var3];
			WLDGGJJE.method538(var5, var3, arg0, var4, 6);
			field863 = var5;
			var2 = new NHEPCMLW(field863);
			field869 = true;
		}

		field864 = var2.method351();
		field865 = new int[field864];
		field866 = new int[field864];
		field867 = new int[field864];
		field868 = new int[field864];
		int var6 = field864 * 10 + var2.field965;
		for (int var7 = 0; var7 < field864; var7++) {
			field865[var7] = var2.method354();
			field866[var7] = var2.method353();
			field867[var7] = var2.method353();
			field868[var7] = var6;
			var6 += field867[var7];
		}
	}

	@ObfuscatedName("INOFEYKQ.a(Ljava/lang/String;[B)[B")
	public byte[] method277(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field864; var5++) {
			if (field865[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field866[var5]];
				}

				if (field869) {
					for (int var6 = 0; var6 < field866[var5]; var6++) {
						arg1[var6] = field863[field868[var5] + var6];
					}
				} else {
					WLDGGJJE.method538(arg1, field866[var5], field863, field867[var5], field868[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
