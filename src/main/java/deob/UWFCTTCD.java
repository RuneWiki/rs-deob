package deob;

@ObfuscatedName("UWFCTTCD")
public class UWFCTTCD implements Runnable {

	@ObfuscatedName("UWFCTTCD.a")
	public int[] field1200 = new int[500];

	@ObfuscatedName("UWFCTTCD.b")
	public Object field1201 = new Object();

	@ObfuscatedName("UWFCTTCD.e")
	public int[] field1204 = new int[500];

	@ObfuscatedName("UWFCTTCD.f")
	public boolean field1205 = true;

	@ObfuscatedName("UWFCTTCD.d")
	public client field1203;

	@ObfuscatedName("UWFCTTCD.c")
	public int field1202;

	public UWFCTTCD(client arg0) {
		field1203 = arg0;
	}

	public void run() {
		while (field1205) {
			synchronized (field1201) {
				if (field1202 < 500) {
					field1204[field1202] = field1203.field1029;
					field1200[field1202] = field1203.field1030;
					field1202++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
