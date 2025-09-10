package deob;

@ObfuscatedName("di")
public class class101 {

	@ObfuscatedName("di.af")
	public class413 field1374;

	@ObfuscatedName("di.aw")
	public class413 field1377;

	@ObfuscatedName("di.at")
	public class429 field1376;

	public class101(class413 arg0, class413 arg1) {
		new class429(256);
		this.field1376 = new class429(256);
		this.field1374 = arg0;
		this.field1377 = arg1;
	}

	@ObfuscatedName("di.af(II[IB)Ldv;")
	public class96 method3032(int arg0, int arg1, int[] arg2) {
		long var4 = this.method3036(arg0, arg1, false);
		class109 var6 = (class109) this.field1376.method7973(var4);
		if (var6 != null) {
			return var6.method3237();
		} else if (arg2 == null || arg2[0] > 0) {
			class95 var7 = class95.method2928(this.field1374, arg0, arg1);
			if (var7 == null) {
				return null;
			}
			class96 var8 = var7.method2930();
			this.field1376.method7975(new class109(var8), var4);
			if (arg2 != null) {
				arg2[0] -= var8.field1323.length;
			}
			return var8;
		} else {
			return null;
		}
	}

	@ObfuscatedName("di.aw(III)Lec;")
	public class109 method3057(int arg0, int arg1) {
		long var3 = this.method3036(arg0, arg1, true);
		class109 var5 = (class109) this.field1376.method7973(var3);
		if (var5 != null) {
			return var5;
		}
		class111 var6 = class111.method3282(this.field1377, arg0, arg1);
		if (var6 == null) {
			return new class109();
		} else {
			class109 var7 = new class109(var6);
			this.field1376.method7975(var7, var3);
			return var7;
		}
	}

	@ObfuscatedName("di.at(I[IB)Ldv;")
	public class96 method3033(int arg0, int[] arg1) {
		if (this.field1374.method7700() == 1) {
			return this.method3032(0, arg0, arg1);
		} else if (this.field1374.method7702(arg0) - 1 == 1) {
			return this.method3032(arg0, 1, arg1);
		} else if (this.field1374.method7702(arg0) - 1 == 0) {
			return this.method3032(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("di.ac(II)Lec;")
	public class109 method3034(int arg0) {
		if (this.field1377.method7700() == 1) {
			return this.method3057(0, arg0);
		} else if (this.field1377.method7702(arg0) == 1) {
			return this.method3057(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("di.ap(II)Ldv;")
	public class96 method3035(int arg0) {
		return this.method3033(arg0, null);
	}

	@ObfuscatedName("di.aq(IIZB)J")
	public long method3036(int arg0, int arg1, boolean arg2) {
		int var4 = arg1 ^ (arg0 << 4 & 0xFFFF | arg0 >> 12);
		int var5 = var4 | arg0 << 16;
		return arg2 ? (long) var5 ^ 0x100000000L : (long) var5;
	}
}
