package deob;

@ObfuscatedName("YVZOKMUV")
public final class YVZOKMUV extends AVUWZCYT {

	@ObfuscatedName("YVZOKMUV.s")
	public boolean field1334 = false;

	@ObfuscatedName("YVZOKMUV.r")
	public OQOGSGFM field1333;

	@ObfuscatedName("YVZOKMUV.t")
	public int field1335;

	@ObfuscatedName("YVZOKMUV.u")
	public int field1336;

	@ObfuscatedName("YVZOKMUV.v")
	public int field1337;

	@ObfuscatedName("YVZOKMUV.w")
	public int field1338;

	@ObfuscatedName("YVZOKMUV.m")
	public int field1332;

	@ObfuscatedName("YVZOKMUV.k")
	public int field1330;

	@ObfuscatedName("YVZOKMUV.l")
	public int field1331;

	@ObfuscatedName("YVZOKMUV.a(Z)LYYHPBDED;")
	public final YYHPBDED method2() {
		YYHPBDED var1 = field1333.method366();
		if (var1 == null) {
			return null;
		}

		int var2 = field1333.field821.field661[field1330];
		YYHPBDED var3 = new YYHPBDED(false, var1, true, VPISXBMB.method513(var2));
		if (!field1334) {
			var3.method558();
			var3.method559(var2);
			var3.field1377 = null;
			var3.field1376 = null;
		}

		if (field1333.field824 != 128 || field1333.field825 != 128) {
			var3.method567(field1333.field825, field1333.field824, field1333.field824);
		}

		if (field1333.field826 != 0) {
			if (field1333.field826 == 90) {
				var3.method562();
			}

			if (field1333.field826 == 180) {
				var3.method562();
				var3.method562();
			}

			if (field1333.field826 == 270) {
				var3.method562();
				var3.method562();
				var3.method562();
			}
		}

		var3.method568(field1333.field827 + 64, field1333.field828 + 850, -30, -50, -30, true);
		return var3;
	}

	public YVZOKMUV(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1333 = OQOGSGFM.field817[arg2];
		field1335 = arg4;
		field1336 = arg6;
		field1337 = arg1;
		field1338 = arg3;
		field1332 = arg0 + arg5;
		field1334 = false;
	}

	@ObfuscatedName("YVZOKMUV.a(IZ)V")
	public final void method546(int arg0) {
		field1331 += arg0;
		while (field1331 > field1333.field821.method251(field1330)) {
			field1331 -= field1333.field821.method251(field1330) + 1;
			field1330++;
			if (field1330 >= field1333.field821.field660 && (field1330 < 0 || field1330 >= field1333.field821.field660)) {
				field1330 = 0;
				field1334 = true;
			}
		}
	}
}
