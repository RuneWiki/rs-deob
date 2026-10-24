package deob;

@ObfuscatedName("QVSTBDDY")
public class QVSTBDDY implements Runnable {

	@ObfuscatedName("QVSTBDDY.a")
	public int[] field1322 = new int[500];

	@ObfuscatedName("QVSTBDDY.b")
	public int[] field1323 = new int[500];

	@ObfuscatedName("QVSTBDDY.c")
	public Object field1324 = new Object();

	@ObfuscatedName("QVSTBDDY.e")
	public boolean field1326 = true;

	@ObfuscatedName("QVSTBDDY.d")
	public client field1325;

	@ObfuscatedName("QVSTBDDY.g")
	public int field1327;

	public QVSTBDDY(client arg0) {
		field1325 = arg0;
	}

	public void run() {
		while (field1326) {
			synchronized (field1324) {
				if (field1327 < 500) {
					field1322[field1327] = field1325.field79;
					field1323[field1327] = field1325.field80;
					field1327++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
