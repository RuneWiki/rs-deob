package deob;

@ObfuscatedName("GYTJTJWK")
public final class GYTJTJWK {

	@ObfuscatedName("GYTJTJWK.b")
	public static char[] field708 = new char[100];

	@ObfuscatedName("GYTJTJWK.c")
	public static XQPFGONL field709 = new XQPFGONL(new byte[100]);

	@ObfuscatedName("GYTJTJWK.d")
	public static char[] field710 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("GYTJTJWK.a(IILXQPFGONL;)Ljava/lang/String;")
	public static String method223(int arg0, XQPFGONL arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg0; var4++) {
			int var5 = arg1.method478();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field708[var2++] = field710[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field708[var2++] = field710[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field708[var2++] = field710[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field708[var2++] = field710[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field708[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field708[var9] = (char) (field708[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}

		return new String(field708, 0, var2);
	}

	@ObfuscatedName("GYTJTJWK.a(ZLXQPFGONL;Ljava/lang/String;)V")
	public static void method224(XQPFGONL arg0, String arg1) {
		if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}

		arg1 = arg1.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			char var4 = arg1.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field710.length; var6++) {
				if (field710[var6] == var4) {
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
					arg0.method468(var5);
				}
			} else if (var5 < 13) {
				arg0.method468((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg0.method468((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg0.method468(var2 << 4);
		}
	}

	@ObfuscatedName("GYTJTJWK.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method225(String arg0) {
		field709.field1335 = 0;
		method224(field709, arg0);
		int var1 = field709.field1335;
		field709.field1335 = 0;
		return method223(var1, field709);
	}
}
