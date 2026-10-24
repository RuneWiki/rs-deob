package deob;

@ObfuscatedName("JDPRJRPB")
public class JDPRJRPB {

	@ObfuscatedName("JDPRJRPB.i")
	public ZOZPAWWH[] field756 = new ZOZPAWWH[10];

	@ObfuscatedName("JDPRJRPB.e")
	public static JDPRJRPB[] field752 = new JDPRJRPB[5000];

	@ObfuscatedName("JDPRJRPB.f")
	public static int[] field753 = new int[5000];

	@ObfuscatedName("JDPRJRPB.j")
	public int field757;

	@ObfuscatedName("JDPRJRPB.k")
	public int field758;

	@ObfuscatedName("JDPRJRPB.h")
	public static MUKVLYLC field755;

	@ObfuscatedName("JDPRJRPB.g")
	public static byte[] field754;

	@ObfuscatedName("JDPRJRPB.a(LMUKVLYLC;Z)V")
	public static final void method254(MUKVLYLC arg0) {
		field754 = new byte[441000];
		field755 = new MUKVLYLC(field754);
		ZOZPAWWH.method588();

		while (true) {
			int var1 = arg0.method294();
			if (var1 == 0xFFFF) {
				return;
			}

			field752[var1] = new JDPRJRPB();
			field752[var1].method256(arg0);
			field753[var1] = field752[var1].method257();
		}
	}

	@ObfuscatedName("JDPRJRPB.a(III)LMUKVLYLC;")
	public static final MUKVLYLC method255(int arg0, int arg1) {
		if (field752[arg1] != null) {
			JDPRJRPB var2 = field752[arg1];
			return var2.method258(arg0);
		}

		return null;
	}

	@ObfuscatedName("JDPRJRPB.b(LMUKVLYLC;Z)V")
	public final void method256(MUKVLYLC arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method292();
			if (var3 != 0) {
				arg0.field812--;
				field756[var2] = new ZOZPAWWH();
				field756[var2].method591(arg0);
			}
		}

		field757 = arg0.method294();
		field758 = arg0.method294();
	}

	@ObfuscatedName("JDPRJRPB.a(Z)I")
	public final int method257() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field756[var2] != null && field756[var2].field1473 / 20 < var1) {
				var1 = field756[var2].field1473 / 20;
			}
		}

		if (field757 < field758 && field757 / 20 < var1) {
			var1 = field757 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field756[var3] != null) {
					field756[var3].field1473 -= var1 * 20;
				}
			}

			if (field757 < field758) {
				field757 -= var1 * 20;
				field758 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("JDPRJRPB.a(IB)LMUKVLYLC;")
	public final MUKVLYLC method258(int arg0) {
		int var2 = method259(arg0);
		field755.field812 = 0;
		field755.method286(0x52494646);
		field755.method287(var2 + 36);
		field755.method286(0x57415645);
		field755.method286(0x666D7420);
		field755.method287(16);
		field755.method284(1);
		field755.method284(1);
		field755.method287(22050);
		field755.method287(22050);
		field755.method284(1);
		field755.method284(8);
		field755.method286(0x64617461);
		field755.method287(var2);
		field755.field812 += var2;
		return field755;
	}

	@ObfuscatedName("JDPRJRPB.a(I)I")
	public final int method259(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field756[var3] != null && field756[var3].field1473 + field756[var3].field1472 > var2) {
				var2 = field756[var3].field1473 + field756[var3].field1472;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field757 * 22050 / 1000;
		int var6 = field758 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field754[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field756[var9] != null) {
				int var10 = field756[var9].field1472 * 22050 / 1000;
				int var11 = field756[var9].field1473 * 22050 / 1000;
				int[] var12 = field756[var9].method589(var10, field756[var9].field1472);
				for (int var13 = 0; var13 < var10; var13++) {
					field754[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field754[var14 + var15] = field754[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field754[var17 + var18] = field754[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
