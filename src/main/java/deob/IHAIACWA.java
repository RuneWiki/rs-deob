package deob;

@ObfuscatedName("IHAIACWA")
public class IHAIACWA {

	@ObfuscatedName("IHAIACWA.b")
	public long field845;

	@ObfuscatedName("IHAIACWA.c")
	public IHAIACWA field846;

	@ObfuscatedName("IHAIACWA.d")
	public IHAIACWA field847;

	@ObfuscatedName("IHAIACWA.a()V")
	public void method379() {
		if (field847 != null) {
			field847.field846 = field846;
			field846.field847 = field847;
			field846 = null;
			field847 = null;
		}
	}
}
