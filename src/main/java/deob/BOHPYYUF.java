package deob;

@ObfuscatedName("BOHPYYUF")
public final class BOHPYYUF {

	@ObfuscatedName("BOHPYYUF.b")
	public static char[] field96 = new char[100];

	@ObfuscatedName("BOHPYYUF.c")
	public static RSWRPCHR field97 = new RSWRPCHR(new byte[100]);

	@ObfuscatedName("BOHPYYUF.d")
	public static char[] field98 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("BOHPYYUF.a(LRSWRPCHR;IB)Ljava/lang/String;")
	public static String method17(RSWRPCHR arg0, int arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0.method388();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field96[var2++] = field98[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field96[var2++] = field98[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field96[var2++] = field98[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field96[var2++] = field98[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field96[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field96[var9] = (char) (field96[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}

		return new String(field96, 0, var2);
	}

	@ObfuscatedName("BOHPYYUF.a(ILRSWRPCHR;Ljava/lang/String;)V")
	public static void method18(RSWRPCHR arg0, String arg1) {
		if (arg1.length() > 80) {
			arg1 = arg1.substring(0, 80);
		}

		arg1 = arg1.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			char var4 = arg1.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field98.length; var6++) {
				if (field98[var6] == var4) {
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
					arg0.method378(var5);
				}
			} else if (var5 < 13) {
				arg0.method378((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg0.method378((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg0.method378(var2 << 4);
		}
	}

	@ObfuscatedName("BOHPYYUF.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method19(String arg0) {
		field97.field1038 = 0;
		method18(field97, arg0);
		int var1 = field97.field1038;
		field97.field1038 = 0;
		return method17(field97, var1);
	}
}
