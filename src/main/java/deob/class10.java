package deob;

@ObfuscatedName("au")
public class class10 implements class431 {

	@ObfuscatedName("au.af")
	public static final class10 field35 = new class10(0, "POST", true, true);

	@ObfuscatedName("au.aw")
	public static final class10 field31 = new class10(1, "GET", true, false);

	@ObfuscatedName("au.at")
	public static final class10 field32 = new class10(2, "PUT", false, true);

	@ObfuscatedName("au.ac")
	public static final class10 field40 = new class10(3, "PATCH", false, true);

	@ObfuscatedName("au.ap")
	public static final class10 field34 = new class10(4, "DELETE", false, true);

	@ObfuscatedName("au.aq")
	public int field30;

	@ObfuscatedName("au.ao")
	public String field36;

	@ObfuscatedName("au.as")
	public boolean field37;

	@ObfuscatedName("au.al")
	public boolean field38;

	public class10(int arg0, String arg1, boolean arg2, boolean arg3) {
		this.field30 = arg0;
		this.field36 = arg1;
		this.field37 = arg2;
		this.field38 = arg3;
	}

	@ObfuscatedName("au.at(B)Z")
	public boolean method75() {
		return this.field37;
	}

	@ObfuscatedName("au.ac(I)Ljava/lang/String;")
	public String method66() {
		return this.field36;
	}

	@ObfuscatedName("au.ap(I)Z")
	public boolean method67() {
		return this.field38;
	}

	@ObfuscatedName("au.af(I)I")
	public int method34() {
		return this.field30;
	}
}
