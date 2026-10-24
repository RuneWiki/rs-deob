package deob;

@ObfuscatedName("IQRKADXA")
public final class IQRKADXA {

	@ObfuscatedName("IQRKADXA.b")
	public static char[] field711 = new char[100];

	@ObfuscatedName("IQRKADXA.c")
	public static SVWJKJVI field712 = new SVWJKJVI(new byte[100]);

	@ObfuscatedName("IQRKADXA.d")
	public static char[] field713 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("IQRKADXA.a(LSVWJKJVI;II)Ljava/lang/String;")
	public static String method266(SVWJKJVI arg0, int arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0.method461();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field711[var2++] = field713[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field711[var2++] = field713[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field711[var2++] = field713[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field711[var2++] = field713[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field711[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field711[var9] = (char) (field711[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}

		return new String(field711, 0, var2);
	}

	@ObfuscatedName("IQRKADXA.a(LSVWJKJVI;ILjava/lang/String;)V")
	public static void method267(SVWJKJVI arg0, String arg1) {
		if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}

		arg1 = arg1.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			char var4 = arg1.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field713.length; var6++) {
				if (field713[var6] == var4) {
					var5 = var6;
					break;
				}
			}

			if (var5 > 12) {
				var5 += 195;
			}

			if (var2 == -1) {
				if (var5 < 13) {
					var2 = var5;
				} else {
					arg0.method451(var5);
				}
			} else if (var5 < 13) {
				arg0.method451((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg0.method451((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg0.method451(var2 << 4);
		}
	}

	@ObfuscatedName("IQRKADXA.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method268(String arg0) {
		field712.field1263 = 0;
		method267(field712, arg0);
		int var1 = field712.field1263;
		field712.field1263 = 0;
		return method266(field712, var1);
	}
}
