package deob;

@ObfuscatedName("HNYSLMKN")
public class HNYSLMKN {

	@ObfuscatedName("HNYSLMKN.g")
	public VUJNNHKQ[] field640 = new VUJNNHKQ[10];

	@ObfuscatedName("HNYSLMKN.c")
	public static HNYSLMKN[] field636 = new HNYSLMKN[5000];

	@ObfuscatedName("HNYSLMKN.d")
	public static int[] field637 = new int[5000];

	@ObfuscatedName("HNYSLMKN.h")
	public int field641;

	@ObfuscatedName("HNYSLMKN.i")
	public int field642;

	@ObfuscatedName("HNYSLMKN.f")
	public static UAWAYCTK field639;

	@ObfuscatedName("HNYSLMKN.e")
	public static byte[] field638;

	@ObfuscatedName("HNYSLMKN.a(ILUAWAYCTK;)V")
	public static final void method219(UAWAYCTK arg0) {
		field638 = new byte[441000];
		field639 = new UAWAYCTK(field638);
		VUJNNHKQ.method514();

		while (true) {
			int var1 = arg0.method457();
			if (var1 == 0xFFFF) {
				return;
			}

			field636[var1] = new HNYSLMKN();
			field636[var1].method221(arg0);
			field637[var1] = field636[var1].method222();
		}
	}

	@ObfuscatedName("HNYSLMKN.a(IZI)LUAWAYCTK;")
	public static final UAWAYCTK method220(int arg0, int arg1) {
		if (field636[arg0] != null) {
			HNYSLMKN var2 = field636[arg0];
			return var2.method223(arg1);
		}

		return null;
	}

	@ObfuscatedName("HNYSLMKN.b(ILUAWAYCTK;)V")
	public final void method221(UAWAYCTK arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method455();
			if (var3 != 0) {
				arg0.field1252--;
				field640[var2] = new VUJNNHKQ();
				field640[var2].method517(arg0);
			}
		}

		field641 = arg0.method457();
		field642 = arg0.method457();
	}

	@ObfuscatedName("HNYSLMKN.a(I)I")
	public final int method222() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field640[var2] != null && field640[var2].field1331 / 20 < var1) {
				var1 = field640[var2].field1331 / 20;
			}
		}

		if (field641 < field642 && field641 / 20 < var1) {
			var1 = field641 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field640[var3] != null) {
					field640[var3].field1331 -= var1 * 20;
				}
			}

			if (field641 < field642) {
				field641 -= var1 * 20;
				field642 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("HNYSLMKN.a(II)LUAWAYCTK;")
	public final UAWAYCTK method223(int arg0) {
		int var2 = method224(arg0);
		field639.field1252 = 0;
		field639.method449(0x52494646);
		field639.method450(var2 + 36);
		field639.method449(0x57415645);
		field639.method449(0x666D7420);
		field639.method450(16);
		field639.method447(1);
		field639.method447(1);
		field639.method450(22050);
		field639.method450(22050);
		field639.method447(1);
		field639.method447(8);
		field639.method449(0x64617461);
		field639.method450(var2);
		field639.field1252 += var2;
		return field639;
	}

	@ObfuscatedName("HNYSLMKN.b(I)I")
	public final int method224(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field640[var3] != null && field640[var3].field1331 + field640[var3].field1330 > var2) {
				var2 = field640[var3].field1331 + field640[var3].field1330;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field641 * 22050 / 1000;
		int var6 = field642 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field638[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field640[var9] != null) {
				int var10 = field640[var9].field1330 * 22050 / 1000;
				int var11 = field640[var9].field1331 * 22050 / 1000;
				int[] var12 = field640[var9].method515(var10, field640[var9].field1330);
				for (int var13 = 0; var13 < var10; var13++) {
					field638[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field638[var14 + var15] = field638[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field638[var17 + var18] = field638[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
