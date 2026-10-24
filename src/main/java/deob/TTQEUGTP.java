package deob;

@ObfuscatedName("TTQEUGTP")
public class TTQEUGTP implements Runnable {

	@ObfuscatedName("TTQEUGTP.c")
	public int[] field1192 = new int[500];

	@ObfuscatedName("TTQEUGTP.e")
	public int[] field1194 = new int[500];

	@ObfuscatedName("TTQEUGTP.f")
	public Object field1195 = new Object();

	@ObfuscatedName("TTQEUGTP.g")
	public boolean field1196 = true;

	@ObfuscatedName("TTQEUGTP.a")
	public client field1191;

	@ObfuscatedName("TTQEUGTP.d")
	public int field1193;

	public TTQEUGTP(client arg0) {
		field1191 = arg0;
	}

	public void run() {
		while (field1196) {
			synchronized (field1195) {
				if (field1193 < 500) {
					field1192[field1193] = field1191.field949;
					field1194[field1193] = field1191.field950;
					field1193++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
