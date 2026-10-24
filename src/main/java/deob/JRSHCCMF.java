package deob;

@ObfuscatedName("JRSHCCMF")
public class JRSHCCMF {

	@ObfuscatedName("JRSHCCMF.g")
	public HJHNNPSW[] field799 = new HJHNNPSW[10];

	@ObfuscatedName("JRSHCCMF.c")
	public static JRSHCCMF[] field795 = new JRSHCCMF[5000];

	@ObfuscatedName("JRSHCCMF.d")
	public static int[] field796 = new int[5000];

	@ObfuscatedName("JRSHCCMF.h")
	public int field800;

	@ObfuscatedName("JRSHCCMF.i")
	public int field801;

	@ObfuscatedName("JRSHCCMF.f")
	public static SVWJKJVI field798;

	@ObfuscatedName("JRSHCCMF.e")
	public static byte[] field797;

	@ObfuscatedName("JRSHCCMF.a(LSVWJKJVI;I)V")
	public static final void method308(SVWJKJVI arg0) {
		field797 = new byte[441000];
		field798 = new SVWJKJVI(field797);
		HJHNNPSW.method240();

		while (true) {
			int var1 = arg0.method463();
			if (var1 == 0xFFFF) {
				return;
			}

			field795[var1] = new JRSHCCMF();
			field795[var1].method310(arg0);
			field796[var1] = field795[var1].method311();
		}
	}

	@ObfuscatedName("JRSHCCMF.a(III)LSVWJKJVI;")
	public static final SVWJKJVI method309(int arg0, int arg1) {
		if (field795[arg0] != null) {
			JRSHCCMF var2 = field795[arg0];
			return var2.method312(arg1);
		}

		return null;
	}

	@ObfuscatedName("JRSHCCMF.a(ILSVWJKJVI;)V")
	public final void method310(SVWJKJVI arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method461();
			if (var3 != 0) {
				arg0.field1263--;
				field799[var2] = new HJHNNPSW();
				field799[var2].method243(arg0);
			}
		}

		field800 = arg0.method463();
		field801 = arg0.method463();
	}

	@ObfuscatedName("JRSHCCMF.a(B)I")
	public final int method311() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field799[var2] != null && field799[var2].field645 / 20 < var1) {
				var1 = field799[var2].field645 / 20;
			}
		}

		if (field800 < field801 && field800 / 20 < var1) {
			var1 = field800 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field799[var3] != null) {
					field799[var3].field645 -= var1 * 20;
				}
			}

			if (field800 < field801) {
				field800 -= var1 * 20;
				field801 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("JRSHCCMF.a(ZI)LSVWJKJVI;")
	public final SVWJKJVI method312(int arg0) {
		int var2 = method313(arg0);
		field798.field1263 = 0;
		field798.method455(0x52494646);
		field798.method456(var2 + 36);
		field798.method455(0x57415645);
		field798.method455(0x666D7420);
		field798.method456(16);
		field798.method453(1);
		field798.method453(1);
		field798.method456(22050);
		field798.method456(22050);
		field798.method453(1);
		field798.method453(8);
		field798.method455(0x64617461);
		field798.method456(var2);
		field798.field1263 += var2;
		return field798;
	}

	@ObfuscatedName("JRSHCCMF.a(I)I")
	public final int method313(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field799[var3] != null && field799[var3].field645 + field799[var3].field644 > var2) {
				var2 = field799[var3].field645 + field799[var3].field644;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field800 * 22050 / 1000;
		int var6 = field801 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field797[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field799[var9] != null) {
				int var10 = field799[var9].field644 * 22050 / 1000;
				int var11 = field799[var9].field645 * 22050 / 1000;
				int[] var12 = field799[var9].method241(var10, field799[var9].field644);
				for (int var13 = 0; var13 < var10; var13++) {
					field797[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field797[var14 + var15] = field797[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field797[var17 + var18] = field797[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
