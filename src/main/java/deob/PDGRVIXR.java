package deob;

@ObfuscatedName("PDGRVIXR")
public class PDGRVIXR implements Runnable {

	@ObfuscatedName("PDGRVIXR.a")
	public Object field1190 = new Object();

	@ObfuscatedName("PDGRVIXR.c")
	public int[] field1192 = new int[500];

	@ObfuscatedName("PDGRVIXR.d")
	public int[] field1193 = new int[500];

	@ObfuscatedName("PDGRVIXR.e")
	public boolean field1194 = true;

	@ObfuscatedName("PDGRVIXR.f")
	public client field1195;

	@ObfuscatedName("PDGRVIXR.b")
	public int field1191;

	public PDGRVIXR(client arg0) {
		field1195 = arg0;
	}

	public void run() {
		while (field1194) {
			synchronized (field1190) {
				if (field1191 < 500) {
					field1192[field1191] = field1195.field801;
					field1193[field1191] = field1195.field802;
					field1191++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
