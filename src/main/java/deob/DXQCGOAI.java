package deob;

@ObfuscatedName("DXQCGOAI")
public final class DXQCGOAI extends DPCHFTTD {

	@ObfuscatedName("DXQCGOAI.n")
	public boolean field573 = false;

	@ObfuscatedName("DXQCGOAI.m")
	public IDBAHLFM field572;

	@ObfuscatedName("DXQCGOAI.o")
	public int field574;

	@ObfuscatedName("DXQCGOAI.p")
	public int field575;

	@ObfuscatedName("DXQCGOAI.q")
	public int field576;

	@ObfuscatedName("DXQCGOAI.r")
	public int field577;

	@ObfuscatedName("DXQCGOAI.l")
	public int field571;

	@ObfuscatedName("DXQCGOAI.u")
	public int field578;

	@ObfuscatedName("DXQCGOAI.v")
	public int field579;

	public DXQCGOAI(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field572 = IDBAHLFM.field805[arg5];
		field574 = arg3;
		field575 = arg1;
		field576 = arg0;
		field577 = arg6;
		field571 = arg2 + arg4;
		field573 = false;
	}

	@ObfuscatedName("DXQCGOAI.a(II)V")
	public final void method222(int arg0) {
		field579 += arg0;
		while (field579 > field572.field809.method241(field578)) {
			field579 -= field572.field809.method241(field578) + 1;
			field578++;
			if (field578 >= field572.field809.field605 && (field578 < 0 || field578 >= field572.field809.field605)) {
				field578 = 0;
				field573 = true;
			}
		}
	}

	@ObfuscatedName("DXQCGOAI.a(B)LGEUHTGZJ;")
	public final GEUHTGZJ method221() {
		GEUHTGZJ var1 = field572.method323();
		if (var1 == null) {
			return null;
		}

		int var2 = field572.field809.field606[field578];
		GEUHTGZJ var3 = new GEUHTGZJ(QWCFKPFT.method504(var2), var1, false, true);
		if (!field573) {
			var3.method292();
			var3.method293(var2);
			var3.field746 = null;
			var3.field745 = null;
		}

		if (field572.field812 != 128 || field572.field813 != 128) {
			var3.method301(field572.field813, field572.field812, field572.field812);
		}

		if (field572.field814 != 0) {
			if (field572.field814 == 90) {
				var3.method296();
			}

			if (field572.field814 == 180) {
				var3.method296();
				var3.method296();
			}

			if (field572.field814 == 270) {
				var3.method296();
				var3.method296();
				var3.method296();
			}
		}

		var3.method302(field572.field815 + 64, field572.field816 + 850, -30, -50, -30, true);
		return var3;
	}
}
