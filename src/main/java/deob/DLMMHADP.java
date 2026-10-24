package deob;

@ObfuscatedName("DLMMHADP")
public class DLMMHADP {

	@ObfuscatedName("DLMMHADP.a")
	public long field642;

	@ObfuscatedName("DLMMHADP.b")
	public DLMMHADP field643;

	@ObfuscatedName("DLMMHADP.c")
	public DLMMHADP field644;

	@ObfuscatedName("DLMMHADP.a()V")
	public void method234() {
		if (field644 != null) {
			field644.field643 = field643;
			field643.field644 = field644;
			field643 = null;
			field644 = null;
		}
	}
}
