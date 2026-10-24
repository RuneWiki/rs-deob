package deob;

@ObfuscatedName("PMGJNHXQ")
public final class PMGJNHXQ {

	@ObfuscatedName("PMGJNHXQ.b")
	public static char[] field1174 = new char[100];

	@ObfuscatedName("PMGJNHXQ.c")
	public static IUVBENCV field1175 = new IUVBENCV(new byte[100]);

	@ObfuscatedName("PMGJNHXQ.d")
	public static char[] field1176 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("PMGJNHXQ.a(IILIUVBENCV;)Ljava/lang/String;")
	public static String method383(int arg0, IUVBENCV arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg0; var4++) {
			int var5 = arg1.method245();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field1174[var2++] = field1176[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field1174[var2++] = field1176[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field1174[var2++] = field1176[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field1174[var2++] = field1176[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field1174[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field1174[var9] = (char) (field1174[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}

		return new String(field1174, 0, var2);
	}

	@ObfuscatedName("PMGJNHXQ.a(Ljava/lang/String;ILIUVBENCV;)V")
	public static void method384(String arg0, IUVBENCV arg1) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}

		arg0 = arg0.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			char var4 = arg0.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field1176.length; var6++) {
				if (field1176[var6] == var4) {
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
					arg1.method235(var5);
				}
			} else if (var5 < 13) {
				arg1.method235((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg1.method235((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg1.method235(var2 << 4);
		}
	}

	@ObfuscatedName("PMGJNHXQ.a(ILjava/lang/String;)Ljava/lang/String;")
	public static String method385(String arg0) {
		field1175.field733 = 0;
		method384(arg0, field1175);
		int var1 = field1175.field733;
		field1175.field733 = 0;
		return method383(var1, field1175);
	}
}
