package deob;

@ObfuscatedName("IDJBPKZF")
public final class IDJBPKZF {

	@ObfuscatedName("IDJBPKZF.b")
	public static char[] field905 = new char[100];

	@ObfuscatedName("IDJBPKZF.c")
	public static CKBTFRZM field906 = new CKBTFRZM(new byte[100]);

	@ObfuscatedName("IDJBPKZF.d")
	public static char[] field907 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("IDJBPKZF.a(ILCKBTFRZM;I)Ljava/lang/String;")
	public static String method379(int arg0, CKBTFRZM arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg0; var4++) {
			int var5 = arg1.method44();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field905[var2++] = field907[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field905[var2++] = field907[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field905[var2++] = field907[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field905[var2++] = field907[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field905[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field905[var9] = (char) (field905[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}

		return new String(field905, 0, var2);
	}

	@ObfuscatedName("IDJBPKZF.a(Ljava/lang/String;LCKBTFRZM;I)V")
	public static void method380(String arg0, CKBTFRZM arg1) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}

		arg0 = arg0.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			char var4 = arg0.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field907.length; var6++) {
				if (field907[var6] == var4) {
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
					arg1.method34(var5);
				}
			} else if (var5 < 13) {
				arg1.method34((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg1.method34((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg1.method34(var2 << 4);
		}
	}

	@ObfuscatedName("IDJBPKZF.a(ILjava/lang/String;)Ljava/lang/String;")
	public static String method381(String arg0) {
		field906.field92 = 0;
		method380(arg0, field906);
		int var1 = field906.field92;
		field906.field92 = 0;
		return method379(var1, field906);
	}
}
