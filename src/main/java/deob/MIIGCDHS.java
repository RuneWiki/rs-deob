package deob;

@ObfuscatedName("MIIGCDHS")
public class MIIGCDHS {

	@ObfuscatedName("MIIGCDHS.f")
	public int field851 = -1;

	@ObfuscatedName("MIIGCDHS.h")
	public int[] field853 = new int[6];

	@ObfuscatedName("MIIGCDHS.i")
	public int[] field854 = new int[6];

	@ObfuscatedName("MIIGCDHS.j")
	public int[] field855 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("MIIGCDHS.k")
	public boolean field856 = false;

	@ObfuscatedName("MIIGCDHS.d")
	public static int field849;

	@ObfuscatedName("MIIGCDHS.g")
	public int[] field852;

	@ObfuscatedName("MIIGCDHS.e")
	public static MIIGCDHS[] field850;

	@ObfuscatedName("MIIGCDHS.a(ZLFXNTEMPE;)V")
	public static void method303(FXNTEMPE arg0) {
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("idk.dat", null));
		field849 = var1.method390();
		if (field850 == null) {
			field850 = new MIIGCDHS[field849];
		}

		for (int var2 = 0; var2 < field849; var2++) {
			if (field850[var2] == null) {
				field850[var2] = new MIIGCDHS();
			}

			field850[var2].method304(var1);
		}
	}

	@ObfuscatedName("MIIGCDHS.a(LRSWRPCHR;B)V")
	public void method304(RSWRPCHR arg0) {
		while (true) {
			int var2 = arg0.method388();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field851 = arg0.method388();
			} else if (var2 == 2) {
				int var3 = arg0.method388();
				field852 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field852[var4] = arg0.method390();
				}
			} else if (var2 == 3) {
				field856 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field853[var2 - 40] = arg0.method390();
			} else if (var2 >= 50 && var2 < 60) {
				field854[var2 - 50] = arg0.method390();
			} else if (var2 >= 60 && var2 < 70) {
				field855[var2 - 60] = arg0.method390();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("MIIGCDHS.a(I)Z")
	public boolean method305() {
		if (field852 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field852.length; var2++) {
			if (!WRJMHIDY.method467(field852[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("MIIGCDHS.a(Z)LWRJMHIDY;")
	public WRJMHIDY method306() {
		if (field852 == null) {
			return null;
		}

		WRJMHIDY[] var1 = new WRJMHIDY[field852.length];
		for (int var2 = 0; var2 < field852.length; var2++) {
			var1[var2] = WRJMHIDY.method466(field852[var2]);
		}

		WRJMHIDY var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new WRJMHIDY(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field853[var4] != 0; var4++) {
			var3.method480(field853[var4], field854[var4]);
		}

		return var3;
	}

	@ObfuscatedName("MIIGCDHS.b(I)Z")
	public boolean method307() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field855[var2] != -1 && !WRJMHIDY.method467(field855[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("MIIGCDHS.c(I)LWRJMHIDY;")
	public WRJMHIDY method308() {
		WRJMHIDY[] var1 = new WRJMHIDY[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field855[var3] != -1) {
				var1[var2++] = WRJMHIDY.method466(field855[var3]);
			}
		}

		WRJMHIDY var4 = new WRJMHIDY(var1, var2);
		for (int var5 = 0; var5 < 6 && field853[var5] != 0; var5++) {
			var4.method480(field853[var5], field854[var5]);
		}

		return var4;
	}
}
