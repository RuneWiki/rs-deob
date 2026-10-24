package deob;

@ObfuscatedName("UJXMBJLW")
public final class UJXMBJLW {

	@ObfuscatedName("UJXMBJLW.j")
	public static final char[] field1258 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@ObfuscatedName("UJXMBJLW.a(Ljava/lang/String;)J")
	public static long method491(String arg0) {
		long var1 = 0L;
		for (int var3 = 0; var3 < arg0.length() && var3 < 12; var3++) {
			char var4 = arg0.charAt(var3);
			var1 *= 37L;
			if (var4 >= 'A' && var4 <= 'Z') {
				var1 += var4 + 1 - 65;
			} else if (var4 >= 'a' && var4 <= 'z') {
				var1 += var4 + 1 - 97;
			} else if (var4 >= '0' && var4 <= '9') {
				var1 += var4 + 27 - 48;
			}
		}

		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("UJXMBJLW.a(IJ)Ljava/lang/String;")
	public static String method492(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return "invalid_name";
		} else if (arg0 % 37L == 0L) {
			return "invalid_name";
		} else {
			int var2 = 0;
			char[] var3 = new char[12];
			while (arg0 != 0L) {
				long var4 = arg0;
				arg0 /= 37L;
				var3[11 - var2++] = field1258[(int) (var4 - arg0 * 37L)];
			}

			return new String(var3, 12 - var2, var2);
		}
	}

	@ObfuscatedName("UJXMBJLW.a(ILjava/lang/String;)J")
	public static long method493(String arg0) {
		arg0 = arg0.toUpperCase();
		long var1 = 0L;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var1 = var1 * 61L + arg0.charAt(var3) - 32L;
			var1 = var1 + (var1 >> 56) & 0xFFFFFFFFFFFFFFL;
		}

		return var1;
	}

	@ObfuscatedName("UJXMBJLW.a(BI)Ljava/lang/String;")
	public static String method494(int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@ObfuscatedName("UJXMBJLW.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method495(String arg0) {
		if (arg0.length() > 0) {
			char[] var1 = arg0.toCharArray();
			for (int var2 = 0; var2 < var1.length; var2++) {
				if (var1[var2] == '_') {
					var1[var2] = ' ';
					if (var2 + 1 < var1.length && var1[var2 + 1] >= 'a' && var1[var2 + 1] <= 'z') {
						var1[var2 + 1] = (char) (var1[var2 + 1] + 'A' - 97);
					}
				}
			}

			if (var1[0] >= 'a' && var1[0] <= 'z') {
				var1[0] = (char) (var1[0] + 'A' - 97);
			}

			return new String(var1);
		}

		return arg0;
	}

	@ObfuscatedName("UJXMBJLW.b(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method496(String arg0) {
		StringBuffer var1 = new StringBuffer();
		for (int var2 = 0; var2 < arg0.length(); var2++) {
			var1.append("*");
		}

		return var1.toString();
	}
}
