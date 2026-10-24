package deob;

@ObfuscatedName("JLGPBSNA")
public final class JLGPBSNA {

	@ObfuscatedName("JLGPBSNA.d")
	public int[] field731 = new int[256];

	@ObfuscatedName("JLGPBSNA.c")
	public int[] field730 = new int[256];

	@ObfuscatedName("JLGPBSNA.b")
	public int field729;

	@ObfuscatedName("JLGPBSNA.e")
	public int field732;

	@ObfuscatedName("JLGPBSNA.f")
	public int field733;

	@ObfuscatedName("JLGPBSNA.g")
	public int field734;

	public JLGPBSNA(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field730[var2] = arg0[var2];
		}

		method238();
	}

	@ObfuscatedName("JLGPBSNA.a()I")
	public final int method236() {
		if (field729-- == 0) {
			method237();
			field729 = 255;
		}

		return field730[field729];
	}

	@ObfuscatedName("JLGPBSNA.b()V")
	public final void method237() {
		field733 += ++field734;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field731[var1];

			if ((var1 & 0x3) == 0) {
				field732 ^= field732 << 13;
			} else if ((var1 & 0x3) == 1) {
				field732 ^= field732 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field732 ^= field732 << 2;
			} else if ((var1 & 0x3) == 3) {
				field732 ^= field732 >>> 16;
			}

			field732 += field731[var1 + 128 & 0xFF];
			int var3;
			field731[var1] = var3 = field731[var2 >> 2 & 0xFF] + field732 + field733;
			field730[var1] = field733 = field731[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("JLGPBSNA.c()V")
	public final void method238() {
		int var1 = 0x9E3779B9;
		int var2 = 0x9E3779B9;
		int var3 = 0x9E3779B9;
		int var4 = 0x9E3779B9;
		int var5 = 0x9E3779B9;
		int var6 = 0x9E3779B9;
		int var7 = 0x9E3779B9;
		int var8 = 0x9E3779B9;
		for (int var9 = 0; var9 < 4; var9++) {
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
		}

		for (int var10 = 0; var10 < 256; var10 += 8) {
			var8 += field730[var10];
			var7 += field730[var10 + 1];
			var6 += field730[var10 + 2];
			var5 += field730[var10 + 3];
			var4 += field730[var10 + 4];
			var3 += field730[var10 + 5];
			var2 += field730[var10 + 6];
			var1 += field730[var10 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			field731[var10] = var8;
			field731[var10 + 1] = var7;
			field731[var10 + 2] = var6;
			field731[var10 + 3] = var5;
			field731[var10 + 4] = var4;
			field731[var10 + 5] = var3;
			field731[var10 + 6] = var2;
			field731[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field731[var11];
			var7 += field731[var11 + 1];
			var6 += field731[var11 + 2];
			var5 += field731[var11 + 3];
			var4 += field731[var11 + 4];
			var3 += field731[var11 + 5];
			var2 += field731[var11 + 6];
			var1 += field731[var11 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			field731[var11] = var8;
			field731[var11 + 1] = var7;
			field731[var11 + 2] = var6;
			field731[var11 + 3] = var5;
			field731[var11 + 4] = var4;
			field731[var11 + 5] = var3;
			field731[var11 + 6] = var2;
			field731[var11 + 7] = var1;
		}

		method237();
		field729 = 256;
	}
}
