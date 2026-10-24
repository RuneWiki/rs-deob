package deob;

@ObfuscatedName("IIATCLSX")
public class IIATCLSX {

	@ObfuscatedName("IIATCLSX.g")
	public int field703 = -1;

	@ObfuscatedName("IIATCLSX.i")
	public int[] field705 = new int[6];

	@ObfuscatedName("IIATCLSX.j")
	public int[] field706 = new int[6];

	@ObfuscatedName("IIATCLSX.k")
	public int[] field707 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("IIATCLSX.l")
	public boolean field708 = false;

	@ObfuscatedName("IIATCLSX.e")
	public static int field701;

	@ObfuscatedName("IIATCLSX.h")
	public int[] field704;

	@ObfuscatedName("IIATCLSX.f")
	public static IIATCLSX[] field702;

	@ObfuscatedName("IIATCLSX.a(BLESUFCMYV;)V")
	public static void method230(ESUFCMYV arg0) {
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("idk.dat", null));
		field701 = var1.method457();
		if (field702 == null) {
			field702 = new IIATCLSX[field701];
		}

		for (int var2 = 0; var2 < field701; var2++) {
			if (field702[var2] == null) {
				field702[var2] = new IIATCLSX();
			}

			field702[var2].method231(var1);
		}
	}

	@ObfuscatedName("IIATCLSX.a(ILRGCGKKUR;)V")
	public void method231(RGCGKKUR arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field703 = arg0.method455();
			} else if (var2 == 2) {
				int var3 = arg0.method455();
				field704 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field704[var4] = arg0.method457();
				}
			} else if (var2 == 3) {
				field708 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field705[var2 - 40] = arg0.method457();
			} else if (var2 >= 50 && var2 < 60) {
				field706[var2 - 50] = arg0.method457();
			} else if (var2 >= 60 && var2 < 70) {
				field707[var2 - 60] = arg0.method457();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("IIATCLSX.a(I)Z")
	public boolean method232() {
		if (field704 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field704.length; var2++) {
			if (!NGYJLUVS.method292(field704[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("IIATCLSX.b(I)LNGYJLUVS;")
	public NGYJLUVS method233() {
		if (field704 == null) {
			return null;
		}

		NGYJLUVS[] var1 = new NGYJLUVS[field704.length];
		for (int var2 = 0; var2 < field704.length; var2++) {
			var1[var2] = NGYJLUVS.method291(field704[var2]);
		}

		NGYJLUVS var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new NGYJLUVS(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field705[var4] != 0; var4++) {
			var3.method305(field705[var4], field706[var4]);
		}

		return var3;
	}

	@ObfuscatedName("IIATCLSX.c(I)Z")
	public boolean method234() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field707[var2] != -1 && !NGYJLUVS.method292(field707[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("IIATCLSX.a(B)LNGYJLUVS;")
	public NGYJLUVS method235() {
		NGYJLUVS[] var1 = new NGYJLUVS[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field707[var3] != -1) {
				var1[var2++] = NGYJLUVS.method291(field707[var3]);
			}
		}

		NGYJLUVS var4 = new NGYJLUVS(var1, var2);
		for (int var5 = 0; var5 < 6 && field705[var5] != 0; var5++) {
			var4.method305(field705[var5], field706[var5]);
		}

		return var4;
	}
}
