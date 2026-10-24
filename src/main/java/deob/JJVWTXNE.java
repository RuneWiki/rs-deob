package deob;

@ObfuscatedName("JJVWTXNE")
public class JJVWTXNE {

	@ObfuscatedName("JJVWTXNE.a")
	public long field864;

	@ObfuscatedName("JJVWTXNE.b")
	public JJVWTXNE field865;

	@ObfuscatedName("JJVWTXNE.c")
	public JJVWTXNE field866;

	@ObfuscatedName("JJVWTXNE.a()V")
	public void method334() {
		if (field866 != null) {
			field866.field865 = field865;
			field865.field866 = field866;
			field865 = null;
			field866 = null;
		}
	}
}
