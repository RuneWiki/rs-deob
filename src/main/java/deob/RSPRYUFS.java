package deob;

@ObfuscatedName("RSPRYUFS")
public final class RSPRYUFS {

	@ObfuscatedName("RSPRYUFS.c")
	public int field1042;

	@ObfuscatedName("RSPRYUFS.h")
	public boolean field1047;

	@ObfuscatedName("RSPRYUFS.b")
	public byte[] field1041;

	@ObfuscatedName("RSPRYUFS.d")
	public int[] field1043;

	@ObfuscatedName("RSPRYUFS.e")
	public int[] field1044;

	@ObfuscatedName("RSPRYUFS.f")
	public int[] field1045;

	@ObfuscatedName("RSPRYUFS.g")
	public int[] field1046;

	public RSPRYUFS(byte[] arg0) {
		method426(arg0);
	}

	@ObfuscatedName("RSPRYUFS.a([BI)V")
	public void method426(byte[] arg0) {
		NQUAUMDT var2 = new NQUAUMDT(arg0);
		int var3 = var2.method343();
		int var4 = var2.method343();
		if (var3 == var4) {
			field1041 = arg0;
			field1047 = false;
		} else {
			byte[] var5 = new byte[var3];
			OVYCDEZF.method400(var5, var3, arg0, var4, 6);
			field1041 = var5;
			var2 = new NQUAUMDT(field1041);
			field1047 = true;
		}

		field1042 = var2.method341();
		field1043 = new int[field1042];
		field1044 = new int[field1042];
		field1045 = new int[field1042];
		field1046 = new int[field1042];
		int var6 = field1042 * 10 + var2.field929;
		for (int var7 = 0; var7 < field1042; var7++) {
			field1043[var7] = var2.method344();
			field1044[var7] = var2.method343();
			field1045[var7] = var2.method343();
			field1046[var7] = var6;
			var6 += field1045[var7];
		}
	}

	@ObfuscatedName("RSPRYUFS.a(Ljava/lang/String;[B)[B")
	public byte[] method427(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1042; var5++) {
			if (field1043[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1044[var5]];
				}

				if (field1047) {
					for (int var6 = 0; var6 < field1044[var5]; var6++) {
						arg1[var6] = field1041[field1046[var5] + var6];
					}
				} else {
					OVYCDEZF.method400(arg1, field1044[var5], field1041, field1045[var5], field1046[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
