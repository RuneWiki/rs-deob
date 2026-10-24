package deob;

@ObfuscatedName("KTPZRJZJ")
public class KTPZRJZJ {

	@ObfuscatedName("KTPZRJZJ.g")
	public SMALAPQM[] field904 = new SMALAPQM[10];

	@ObfuscatedName("KTPZRJZJ.c")
	public static KTPZRJZJ[] field900 = new KTPZRJZJ[5000];

	@ObfuscatedName("KTPZRJZJ.d")
	public static int[] field901 = new int[5000];

	@ObfuscatedName("KTPZRJZJ.h")
	public int field905;

	@ObfuscatedName("KTPZRJZJ.i")
	public int field906;

	@ObfuscatedName("KTPZRJZJ.f")
	public static NHEPCMLW field903;

	@ObfuscatedName("KTPZRJZJ.e")
	public static byte[] field902;

	@ObfuscatedName("KTPZRJZJ.a(ILNHEPCMLW;)V")
	public static final void method286(NHEPCMLW arg0) {
		field902 = new byte[441000];
		field903 = new NHEPCMLW(field902);
		SMALAPQM.method444();

		while (true) {
			int var1 = arg0.method351();
			if (var1 == 0xFFFF) {
				return;
			}

			field900[var1] = new KTPZRJZJ();
			field900[var1].method288(arg0);
			field901[var1] = field900[var1].method289();
		}
	}

	@ObfuscatedName("KTPZRJZJ.a(IIZ)LNHEPCMLW;")
	public static final NHEPCMLW method287(int arg0, int arg1) {
		if (field900[arg1] != null) {
			KTPZRJZJ var2 = field900[arg1];
			return var2.method290(arg0);
		}

		return null;
	}

	@ObfuscatedName("KTPZRJZJ.a(ZLNHEPCMLW;)V")
	public final void method288(NHEPCMLW arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method349();
			if (var3 != 0) {
				arg0.field965--;
				field904[var2] = new SMALAPQM();
				field904[var2].method447(arg0);
			}
		}

		field905 = arg0.method351();
		field906 = arg0.method351();
	}

	@ObfuscatedName("KTPZRJZJ.a(B)I")
	public final int method289() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field904[var2] != null && field904[var2].field1203 / 20 < var1) {
				var1 = field904[var2].field1203 / 20;
			}
		}

		if (field905 < field906 && field905 / 20 < var1) {
			var1 = field905 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field904[var3] != null) {
					field904[var3].field1203 -= var1 * 20;
				}
			}

			if (field905 < field906) {
				field905 -= var1 * 20;
				field906 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("KTPZRJZJ.a(II)LNHEPCMLW;")
	public final NHEPCMLW method290(int arg0) {
		int var2 = method291(arg0);
		field903.field965 = 0;
		field903.method343(0x52494646);
		field903.method344(var2 + 36);
		field903.method343(0x57415645);
		field903.method343(0x666D7420);
		field903.method344(16);
		field903.method341(1);
		field903.method341(1);
		field903.method344(22050);
		field903.method344(22050);
		field903.method341(1);
		field903.method341(8);
		field903.method343(0x64617461);
		field903.method344(var2);
		field903.field965 += var2;
		return field903;
	}

	@ObfuscatedName("KTPZRJZJ.a(I)I")
	public final int method291(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field904[var3] != null && field904[var3].field1203 + field904[var3].field1202 > var2) {
				var2 = field904[var3].field1203 + field904[var3].field1202;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field905 * 22050 / 1000;
		int var6 = field906 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field902[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field904[var9] != null) {
				int var10 = field904[var9].field1202 * 22050 / 1000;
				int var11 = field904[var9].field1203 * 22050 / 1000;
				int[] var12 = field904[var9].method445(var10, field904[var9].field1202);
				for (int var13 = 0; var13 < var10; var13++) {
					field902[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field902[var14 + var15] = field902[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field902[var17 + var18] = field902[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
