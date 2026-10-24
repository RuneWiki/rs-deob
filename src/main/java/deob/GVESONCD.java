package deob;

@ObfuscatedName("GVESONCD")
public final class GVESONCD {

	@ObfuscatedName("GVESONCD.c")
	public static char[] field764 = new char[100];

	@ObfuscatedName("GVESONCD.d")
	public static MLYYHULT field765 = new MLYYHULT(new byte[100]);

	@ObfuscatedName("GVESONCD.e")
	public static char[] field766 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("GVESONCD.a(ILMLYYHULT;I)Ljava/lang/String;")
	public static String method245(MLYYHULT arg0, int arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0.method296();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				field764[var2++] = field766[(var3 << 4) + var6 - 195];
				var3 = -1;
			} else if (var6 < 13) {
				field764[var2++] = field766[var6];
			} else {
				var3 = var6;
			}

			int var7 = var5 & 0xF;
			if (var3 != -1) {
				field764[var2++] = field766[(var3 << 4) + var7 - 195];
				var3 = -1;
			} else if (var7 < 13) {
				field764[var2++] = field766[var7];
			} else {
				var3 = var7;
			}
		}

		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = field764[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				field764[var9] = (char) (field764[var9] - 32);
				var8 = false;
			}

			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}

		return new String(field764, 0, var2);
	}

	@ObfuscatedName("GVESONCD.a(ILjava/lang/String;LMLYYHULT;)V")
	public static void method246(String arg0, MLYYHULT arg1) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}

		arg0 = arg0.toLowerCase();
		int var2 = -1;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			char var4 = arg0.charAt(var3);
			int var5 = 0;
			for (int var6 = 0; var6 < field766.length; var6++) {
				if (field766[var6] == var4) {
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
					arg1.method286(var5);
				}
			} else if (var5 < 13) {
				arg1.method286((var2 << 4) + var5);
				var2 = -1;
			} else {
				arg1.method286((var2 << 4) + (var5 >> 4));
				var2 = var5 & 0xF;
			}
		}

		if (var2 != -1) {
			arg1.method286(var2 << 4);
		}
	}

	@ObfuscatedName("GVESONCD.a(ILjava/lang/String;)Ljava/lang/String;")
	public static String method247(String arg0) {
		field765.field963 = 0;
		method246(arg0, field765);
		int var1 = field765.field963;
		field765.field963 = 0;
		return method245(field765, var1);
	}
}
