package deob;

@ObfuscatedName("AEQBPGLT")
public final class AEQBPGLT extends UCNHLGIK {

	@ObfuscatedName("AEQBPGLT.t")
	public boolean field8 = false;

	@ObfuscatedName("AEQBPGLT.u")
	public XYSJIYWF field9;

	@ObfuscatedName("AEQBPGLT.o")
	public int field3;

	@ObfuscatedName("AEQBPGLT.p")
	public int field4;

	@ObfuscatedName("AEQBPGLT.q")
	public int field5;

	@ObfuscatedName("AEQBPGLT.r")
	public int field6;

	@ObfuscatedName("AEQBPGLT.s")
	public int field7;

	@ObfuscatedName("AEQBPGLT.m")
	public int field1;

	@ObfuscatedName("AEQBPGLT.n")
	public int field2;

	@ObfuscatedName("AEQBPGLT.a(I)LOJGAHFXC;")
	public final OJGAHFXC method1() {
		OJGAHFXC var1 = field9.method582();
		if (var1 == null) {
			return null;
		}

		int var2 = field9.field1481.field638[field1];
		OJGAHFXC var3 = new OJGAHFXC(MOOJSKCU.method395(var2), false, true, var1);
		if (!field8) {
			var3.method420();
			var3.method421(var2);
			var3.field1049 = null;
			var3.field1048 = null;
		}

		if (field9.field1484 != 128 || field9.field1485 != 128) {
			var3.method429(field9.field1484, field9.field1485, field9.field1484);
		}

		if (field9.field1486 != 0) {
			if (field9.field1486 == 90) {
				var3.method424();
			}

			if (field9.field1486 == 180) {
				var3.method424();
				var3.method424();
			}

			if (field9.field1486 == 270) {
				var3.method424();
				var3.method424();
				var3.method424();
			}
		}

		var3.method430(field9.field1487 + 64, field9.field1488 + 850, -30, -50, -30, true);
		return var3;
	}

	public AEQBPGLT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field9 = XYSJIYWF.field1477[arg2];
		field3 = arg1;
		field4 = arg0;
		field5 = arg5;
		field6 = arg6;
		field7 = arg3 + arg4;
		field8 = false;
	}

	@ObfuscatedName("AEQBPGLT.a(II)V")
	public final void method2(int arg0) {
		field2 += arg0;
		while (field2 > field9.field1481.method207(field1)) {
			field2 -= field9.field1481.method207(field1);
			field1++;
			if (field1 >= field9.field1481.field637 && (field1 < 0 || field1 >= field9.field1481.field637)) {
				field1 = 0;
				field8 = true;
			}
		}
	}
}
