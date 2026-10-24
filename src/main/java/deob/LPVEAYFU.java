package deob;

@ObfuscatedName("LPVEAYFU")
public class LPVEAYFU extends CYZGZTKE {

	@ObfuscatedName("LPVEAYFU.t")
	public int field913;

	@ObfuscatedName("LPVEAYFU.u")
	public int field914;

	@ObfuscatedName("LPVEAYFU.v")
	public int field915;

	@ObfuscatedName("LPVEAYFU.o")
	public int field908;

	@ObfuscatedName("LPVEAYFU.p")
	public int field909;

	@ObfuscatedName("LPVEAYFU.q")
	public int field910;

	@ObfuscatedName("LPVEAYFU.r")
	public int field911;

	@ObfuscatedName("LPVEAYFU.n")
	public IUTBNGPH field907;

	@ObfuscatedName("LPVEAYFU.w")
	public int field916;

	@ObfuscatedName("LPVEAYFU.s")
	public int field912;

	@ObfuscatedName("LPVEAYFU.z")
	public int field918;

	@ObfuscatedName("LPVEAYFU.A")
	public int field919;

	@ObfuscatedName("LPVEAYFU.C")
	public int[] field920;

	@ObfuscatedName("LPVEAYFU.y")
	public static client field917;

	@ObfuscatedName("LPVEAYFU.a(B)LQMZPELNG;")
	public final QMZPELNG method368() {
		int var1 = -1;
		if (field918 != -1) {
			DDXRHBHP var2 = DDXRHBHP.field496[field918];
			int var3 = var2.field498;
			int var4 = var2.field499;
			int var5 = var2.field500;
			int var6 = client.field461[var5 - var4];
			var1 = field917.field351[var3] >> var4 & var6;
		} else if (field919 != -1) {
			var1 = field917.field351[field919];
		}

		if (var1 >= 0 && var1 < field920.length && field920[var1] != -1) {
			return QMZPELNG.method486(field920[var1]);
		}

		return null;
	}

	@ObfuscatedName("LPVEAYFU.a(I)LLFTMDGKK;")
	public final LFTMDGKK method1() {
		int var1 = -1;
		if (field907 != null) {
			int var2 = client.field145 - field912;
			if (var2 > 100 && field907.field687 > 0) {
				var2 = 100;
			}

			while (var2 > field907.method322(field916)) {
				var2 -= field907.method322(field916);
				field916++;
				if (field916 >= field907.field683) {
					field916 -= field907.field687;
					if (field916 < 0 || field916 >= field907.field683) {
						break;
					}
				}
			}

			field907 = null;
			field912 = client.field145 - var2;

			if (field907 != null) {
				var1 = field907.field684[field916];
			}
		}

		QMZPELNG var3;
		if (field920 == null) {
			var3 = QMZPELNG.method486(field913);
		} else {
			var3 = method368();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method478(field914, field915, field908, field909, field910, field911, var1);
	}

	public LPVEAYFU(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		field913 = arg4;
		field914 = arg5;
		field915 = arg6;
		field908 = arg2;
		field909 = arg3;
		field910 = arg7;
		field911 = arg1;

		if (arg8 != -1) {
			field907 = IUTBNGPH.field682[arg8];
			field916 = 0;
			field912 = client.field145;
			if (arg0 && field907.field687 != -1) {
				field916 = (int) (Math.random() * field907.field683);
				field912 -= (int) (Math.random() * field907.method322(field916));
			}
		}

		QMZPELNG var10 = QMZPELNG.method486(field913);
		field918 = var10.field1147;
		field919 = var10.field1174;
		field920 = var10.field1143;
	}
}
