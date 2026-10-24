package deob;

@ObfuscatedName("KDXWZDUJ")
public final class KDXWZDUJ {

	@ObfuscatedName("KDXWZDUJ.b")
	public static char[] field821 = new char[100];

	@ObfuscatedName("KDXWZDUJ.c")
	public static PGNBHFUF field822 = new PGNBHFUF(new byte[100]);

	@ObfuscatedName("KDXWZDUJ.d")
	public static char[] field823 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("KDXWZDUJ.a(BILPGNBHFUF;)Ljava/lang/String;")
	public static String method308(int arg0, PGNBHFUF arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg0; var4++) {
			int var5 = arg1.method420();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field821[var2++] = field823[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field821[var2++] = field823[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field821[var2++] = field823[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field821[var2++] = field823[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field821[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field821[var9] = (char) (field821[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}

		return new String(field821, 0, var2);
	}

	@ObfuscatedName("KDXWZDUJ.a(LPGNBHFUF;Ljava/lang/String;Z)V")
	public static void method309(PGNBHFUF arg0, String arg1) {
		if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}

		arg1 = arg1.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			char var4 = arg1.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field823.length; var6++) {
				if (field823[var6] == var4) {
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
					arg0.method410(var5);
				}
			} else if (var5 < 13) {
				arg0.method410((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg0.method410((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg0.method410(var2 << 4);
		}
	}

	@ObfuscatedName("KDXWZDUJ.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method310(String arg0) {
		field822.field1082 = 0;
		method309(field822, arg0);
		int var1 = field822.field1082;
		field822.field1082 = 0;
		return method308(var1, field822);
	}
}
