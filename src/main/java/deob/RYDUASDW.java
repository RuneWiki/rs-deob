package deob;

@ObfuscatedName("RYDUASDW")
public final class RYDUASDW {

	@ObfuscatedName("RYDUASDW.c")
	public int[] field1068 = new int[256];

	@ObfuscatedName("RYDUASDW.b")
	public int[] field1067 = new int[256];

	@ObfuscatedName("RYDUASDW.a")
	public int field1066;

	@ObfuscatedName("RYDUASDW.d")
	public int field1069;

	@ObfuscatedName("RYDUASDW.e")
	public int field1070;

	@ObfuscatedName("RYDUASDW.f")
	public int field1071;

	public RYDUASDW(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field1067[var2] = arg0[var2];
		}

		method439();
	}

	@ObfuscatedName("RYDUASDW.a()I")
	public final int method437() {
		if (field1066-- == 0) {
			method438();
			field1066 = 255;
		}

		return field1067[field1066];
	}

	@ObfuscatedName("RYDUASDW.b()V")
	public final void method438() {
		field1070 += ++field1071;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field1068[var1];

			if ((var1 & 0x3) == 0) {
				field1069 ^= field1069 << 13;
			} else if ((var1 & 0x3) == 1) {
				field1069 ^= field1069 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field1069 ^= field1069 << 2;
			} else if ((var1 & 0x3) == 3) {
				field1069 ^= field1069 >>> 16;
			}

			field1069 += field1068[var1 + 128 & 0xFF];
			int var3;
			field1068[var1] = var3 = field1068[var2 >> 2 & 0xFF] + field1069 + field1070;
			field1067[var1] = field1070 = field1068[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("RYDUASDW.c()V")
	public final void method439() {
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
			var8 += field1067[var10];
			var7 += field1067[var10 + 1];
			var6 += field1067[var10 + 2];
			var5 += field1067[var10 + 3];
			var4 += field1067[var10 + 4];
			var3 += field1067[var10 + 5];
			var2 += field1067[var10 + 6];
			var1 += field1067[var10 + 7];
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
			field1068[var10] = var8;
			field1068[var10 + 1] = var7;
			field1068[var10 + 2] = var6;
			field1068[var10 + 3] = var5;
			field1068[var10 + 4] = var4;
			field1068[var10 + 5] = var3;
			field1068[var10 + 6] = var2;
			field1068[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field1068[var11];
			var7 += field1068[var11 + 1];
			var6 += field1068[var11 + 2];
			var5 += field1068[var11 + 3];
			var4 += field1068[var11 + 4];
			var3 += field1068[var11 + 5];
			var2 += field1068[var11 + 6];
			var1 += field1068[var11 + 7];
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
			field1068[var11] = var8;
			field1068[var11 + 1] = var7;
			field1068[var11 + 2] = var6;
			field1068[var11 + 3] = var5;
			field1068[var11 + 4] = var4;
			field1068[var11 + 5] = var3;
			field1068[var11 + 6] = var2;
			field1068[var11 + 7] = var1;
		}

		method438();
		field1066 = 256;
	}
}
