package deob;

@ObfuscatedName("IDSYSMIG")
public class IDSYSMIG {

	@ObfuscatedName("IDSYSMIG.e")
	public int field910 = -1;

	@ObfuscatedName("IDSYSMIG.g")
	public int[] field912 = new int[6];

	@ObfuscatedName("IDSYSMIG.h")
	public int[] field913 = new int[6];

	@ObfuscatedName("IDSYSMIG.i")
	public int[] field914 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("IDSYSMIG.j")
	public boolean field915 = false;

	@ObfuscatedName("IDSYSMIG.c")
	public static int field908;

	@ObfuscatedName("IDSYSMIG.f")
	public int[] field911;

	@ObfuscatedName("IDSYSMIG.d")
	public static IDSYSMIG[] field909;

	@ObfuscatedName("IDSYSMIG.a(ZLEAXVDNXA;)V")
	public static void method382(EAXVDNXA arg0) {
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("idk.dat", null));
		field908 = var1.method46();
		if (field909 == null) {
			field909 = new IDSYSMIG[field908];
		}

		for (int var2 = 0; var2 < field908; var2++) {
			if (field909[var2] == null) {
				field909[var2] = new IDSYSMIG();
			}

			field909[var2].method383(var1);
		}
	}

	@ObfuscatedName("IDSYSMIG.a(BLCKBTFRZM;)V")
	public void method383(CKBTFRZM arg0) {
		while (true) {
			int var2 = arg0.method44();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field910 = arg0.method44();
			} else if (var2 == 2) {
				int var3 = arg0.method44();
				field911 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field911[var4] = arg0.method46();
				}
			} else if (var2 == 3) {
				field915 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field912[var2 - 40] = arg0.method46();
			} else if (var2 >= 50 && var2 < 60) {
				field913[var2 - 50] = arg0.method46();
			} else if (var2 >= 60 && var2 < 70) {
				field914[var2 - 60] = arg0.method46();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("IDSYSMIG.a(I)Z")
	public boolean method384() {
		if (field911 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field911.length; var2++) {
			if (!GFYXEFQY.method342(field911[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("IDSYSMIG.b(I)LGFYXEFQY;")
	public GFYXEFQY method385() {
		if (field911 == null) {
			return null;
		}

		GFYXEFQY[] var1 = new GFYXEFQY[field911.length];
		for (int var2 = 0; var2 < field911.length; var2++) {
			var1[var2] = GFYXEFQY.method341(field911[var2]);
		}

		GFYXEFQY var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new GFYXEFQY(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field912[var4] != 0; var4++) {
			var3.method355(field912[var4], field913[var4]);
		}

		return var3;
	}

	@ObfuscatedName("IDSYSMIG.a(B)Z")
	public boolean method386() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field914[var2] != -1 && !GFYXEFQY.method342(field914[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("IDSYSMIG.b(B)LGFYXEFQY;")
	public GFYXEFQY method387() {
		GFYXEFQY[] var1 = new GFYXEFQY[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field914[var3] != -1) {
				var1[var2++] = GFYXEFQY.method341(field914[var3]);
			}
		}

		GFYXEFQY var4 = new GFYXEFQY(var1, var2);
		for (int var5 = 0; var5 < 6 && field912[var5] != 0; var5++) {
			var4.method355(field912[var5], field913[var5]);
		}

		return var4;
	}
}
