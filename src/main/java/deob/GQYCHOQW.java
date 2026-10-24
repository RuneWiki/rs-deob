package deob;

@ObfuscatedName("GQYCHOQW")
public class GQYCHOQW {

	@ObfuscatedName("GQYCHOQW.g")
	public IRCSYKHE[] field636 = new IRCSYKHE[10];

	@ObfuscatedName("GQYCHOQW.c")
	public static GQYCHOQW[] field632 = new GQYCHOQW[5000];

	@ObfuscatedName("GQYCHOQW.d")
	public static int[] field633 = new int[5000];

	@ObfuscatedName("GQYCHOQW.h")
	public int field637;

	@ObfuscatedName("GQYCHOQW.i")
	public int field638;

	@ObfuscatedName("GQYCHOQW.f")
	public static BJPWOXRJ field635;

	@ObfuscatedName("GQYCHOQW.e")
	public static byte[] field634;

	@ObfuscatedName("GQYCHOQW.a(LBJPWOXRJ;B)V")
	public static final void method235(BJPWOXRJ arg0) {
		field634 = new byte[441000];
		field635 = new BJPWOXRJ(field634);
		IRCSYKHE.method311();

		while (true) {
			int var1 = arg0.method17();
			if (var1 == 0xFFFF) {
				return;
			}

			field632[var1] = new GQYCHOQW();
			field632[var1].method237(arg0);
			field633[var1] = field632[var1].method238();
		}
	}

	@ObfuscatedName("GQYCHOQW.a(III)LBJPWOXRJ;")
	public static final BJPWOXRJ method236(int arg0, int arg1) {
		if (field632[arg1] != null) {
			GQYCHOQW var2 = field632[arg1];
			return var2.method239(arg0);
		}

		return null;
	}

	@ObfuscatedName("GQYCHOQW.a(ILBJPWOXRJ;)V")
	public final void method237(BJPWOXRJ arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method15();
			if (var3 != 0) {
				arg0.field5--;
				field636[var2] = new IRCSYKHE();
				field636[var2].method314(arg0);
			}
		}

		field637 = arg0.method17();
		field638 = arg0.method17();
	}

	@ObfuscatedName("GQYCHOQW.a(I)I")
	public final int method238() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field636[var2] != null && field636[var2].field767 / 20 < var1) {
				var1 = field636[var2].field767 / 20;
			}
		}

		if (field637 < field638 && field637 / 20 < var1) {
			var1 = field637 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field636[var3] != null) {
					field636[var3].field767 -= var1 * 20;
				}
			}

			if (field637 < field638) {
				field637 -= var1 * 20;
				field638 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("GQYCHOQW.a(BI)LBJPWOXRJ;")
	public final BJPWOXRJ method239(int arg0) {
		int var2 = method240(arg0);
		field635.field5 = 0;
		field635.method9(0x52494646);
		field635.method10(var2 + 36);
		field635.method9(0x57415645);
		field635.method9(0x666D7420);
		field635.method10(16);
		field635.method7(1);
		field635.method7(1);
		field635.method10(22050);
		field635.method10(22050);
		field635.method7(1);
		field635.method7(8);
		field635.method9(0x64617461);
		field635.method10(var2);
		field635.field5 += var2;
		return field635;
	}

	@ObfuscatedName("GQYCHOQW.b(I)I")
	public final int method240(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field636[var3] != null && field636[var3].field767 + field636[var3].field766 > var2) {
				var2 = field636[var3].field767 + field636[var3].field766;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field637 * 22050 / 1000;
		int var6 = field638 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field634[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field636[var9] != null) {
				int var10 = field636[var9].field766 * 22050 / 1000;
				int var11 = field636[var9].field767 * 22050 / 1000;
				int[] var12 = field636[var9].method312(var10, field636[var9].field766);
				for (int var13 = 0; var13 < var10; var13++) {
					field634[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field634[var14 + var15] = field634[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field634[var17 + var18] = field634[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
