package deob;

@ObfuscatedName("UTXVFWKJ")
public class UTXVFWKJ implements Runnable {

	@ObfuscatedName("UTXVFWKJ.c")
	public int[] field1167 = new int[500];

	@ObfuscatedName("UTXVFWKJ.e")
	public int[] field1169 = new int[500];

	@ObfuscatedName("UTXVFWKJ.f")
	public Object field1170 = new Object();

	@ObfuscatedName("UTXVFWKJ.h")
	public boolean field1172 = true;

	@ObfuscatedName("UTXVFWKJ.g")
	public client field1171;

	@ObfuscatedName("UTXVFWKJ.d")
	public int field1168;

	public void run() {
		while (field1172) {
			synchronized (field1170) {
				if (field1168 < 500) {
					field1169[field1168] = field1171.field1428;
					field1167[field1168] = field1171.field1429;
					field1168++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public UTXVFWKJ(client arg0) {
		field1171 = arg0;
	}
}
