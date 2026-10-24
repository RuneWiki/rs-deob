package deob;

@ObfuscatedName("SRZUEVOD")
public final class SRZUEVOD {

	@ObfuscatedName("SRZUEVOD.c")
	public int field1334;

	@ObfuscatedName("SRZUEVOD.h")
	public boolean field1339;

	@ObfuscatedName("SRZUEVOD.b")
	public byte[] field1333;

	@ObfuscatedName("SRZUEVOD.d")
	public int[] field1335;

	@ObfuscatedName("SRZUEVOD.e")
	public int[] field1336;

	@ObfuscatedName("SRZUEVOD.f")
	public int[] field1337;

	@ObfuscatedName("SRZUEVOD.g")
	public int[] field1338;

	public SRZUEVOD(byte[] arg0) {
		method565(arg0);
	}

	@ObfuscatedName("SRZUEVOD.a([BI)V")
	public void method565(byte[] arg0) {
		LZWRHABP var2 = new LZWRHABP(arg0);
		int var3 = var2.method467();
		int var4 = var2.method467();
		if (var3 == var4) {
			field1333 = arg0;
			field1339 = false;
		} else {
			byte[] var5 = new byte[var3];
			PWHJGSFT.method524(var5, var3, arg0, var4, 6);
			field1333 = var5;
			var2 = new LZWRHABP(field1333);
			field1339 = true;
		}

		field1334 = var2.method465();
		field1335 = new int[field1334];
		field1336 = new int[field1334];
		field1337 = new int[field1334];
		field1338 = new int[field1334];
		int var6 = field1334 * 10 + var2.field1139;
		for (int var7 = 0; var7 < field1334; var7++) {
			field1335[var7] = var2.method468();
			field1336[var7] = var2.method467();
			field1337[var7] = var2.method467();
			field1338[var7] = var6;
			var6 += field1337[var7];
		}
	}

	@ObfuscatedName("SRZUEVOD.a(Ljava/lang/String;[B)[B")
	public byte[] method566(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1334; var5++) {
			if (field1335[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1336[var5]];
				}

				if (field1339) {
					for (int var6 = 0; var6 < field1336[var5]; var6++) {
						arg1[var6] = field1333[field1338[var5] + var6];
					}
				} else {
					PWHJGSFT.method524(arg1, field1336[var5], field1333, field1337[var5], field1338[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
