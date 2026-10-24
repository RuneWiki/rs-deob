package deob;

@ObfuscatedName("QQBOAQZB")
public final class QQBOAQZB {

	@ObfuscatedName("QQBOAQZB.e")
	public MOVYLKVL field1161 = new MOVYLKVL();

	@ObfuscatedName("QQBOAQZB.i")
	public KMFVYEKJ field1165 = new KMFVYEKJ();

	@ObfuscatedName("QQBOAQZB.f")
	public int field1162;

	@ObfuscatedName("QQBOAQZB.g")
	public int field1163;

	@ObfuscatedName("QQBOAQZB.h")
	public YCPCXCIN field1164;

	@ObfuscatedName("QQBOAQZB.c")
	public int field1159;

	@ObfuscatedName("QQBOAQZB.d")
	public int field1160;

	public QQBOAQZB(int arg0) {
		field1162 = arg0;
		field1163 = arg0;
		field1164 = new YCPCXCIN(1024);
	}

	@ObfuscatedName("QQBOAQZB.a(J)LMOVYLKVL;")
	public MOVYLKVL method421(long arg0) {
		MOVYLKVL var3 = (MOVYLKVL) field1164.method578(arg0);
		if (var3 == null) {
			field1159++;
		} else {
			field1165.method371(var3);
			field1160++;
		}

		return var3;
	}

	@ObfuscatedName("QQBOAQZB.a(ZLMOVYLKVL;J)V")
	public void method422(MOVYLKVL arg0, long arg1) {
		if (field1163 == 0) {
			MOVYLKVL var4 = field1165.method372();
			var4.method234();
			var4.method379();

			if (field1161 == var4) {
				MOVYLKVL var5 = field1165.method372();
				var5.method234();
				var5.method379();
			}
		} else {
			field1163--;
		}

		field1164.method579(arg0, arg1);
		field1165.method371(arg0);
	}

	@ObfuscatedName("QQBOAQZB.a()V")
	public void method423() {
		while (true) {
			MOVYLKVL var1 = field1165.method372();
			if (var1 == null) {
				field1163 = field1162;
				return;
			}

			var1.method234();
			var1.method379();
		}
	}
}
