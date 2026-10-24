package deob;

@ObfuscatedName("VOWJQLLT")
public final class VOWJQLLT {

	@ObfuscatedName("VOWJQLLT.b")
	public static char[] field1178 = new char[100];

	@ObfuscatedName("VOWJQLLT.c")
	public static XGRGMPUQ field1179 = new XGRGMPUQ(new byte[100]);

	@ObfuscatedName("VOWJQLLT.d")
	public static char[] field1180 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("VOWJQLLT.a(LXGRGMPUQ;II)Ljava/lang/String;")
	public static String method366(XGRGMPUQ arg0, int arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0.method465();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field1178[var2++] = field1180[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field1178[var2++] = field1180[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field1178[var2++] = field1180[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field1178[var2++] = field1180[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field1178[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field1178[var9] = (char) (field1178[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}

		return new String(field1178, 0, var2);
	}

	@ObfuscatedName("VOWJQLLT.a(Ljava/lang/String;LXGRGMPUQ;Z)V")
	public static void method367(String arg0, XGRGMPUQ arg1) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}

		arg0 = arg0.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			char var4 = arg0.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field1180.length; var6++) {
				if (field1180[var6] == var4) {
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
					arg1.method455(var5);
				}
			} else if (var5 < 13) {
				arg1.method455((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg1.method455((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg1.method455(var2 << 4);
		}
	}

	@ObfuscatedName("VOWJQLLT.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method368(String arg0) {
		field1179.field1432 = 0;
		method367(arg0, field1179);
		int var1 = field1179.field1432;
		field1179.field1432 = 0;
		return method366(field1179, var1);
	}
}
