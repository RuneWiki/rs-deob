package deob;

@ObfuscatedName("YNDLJDLS")
public class YNDLJDLS implements Runnable {

	@ObfuscatedName("YNDLJDLS.a")
	public int[] field1497 = new int[500];

	@ObfuscatedName("YNDLJDLS.c")
	public boolean field1499 = true;

	@ObfuscatedName("YNDLJDLS.e")
	public int[] field1501 = new int[500];

	@ObfuscatedName("YNDLJDLS.f")
	public Object field1502 = new Object();

	@ObfuscatedName("YNDLJDLS.d")
	public client field1500;

	@ObfuscatedName("YNDLJDLS.b")
	public int field1498;

	public void run() {
		while (field1499) {
			synchronized (field1502) {
				if (field1498 < 500) {
					field1501[field1498] = field1500.field1115;
					field1497[field1498] = field1500.field1116;
					field1498++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public YNDLJDLS(client arg0) {
		field1500 = arg0;
	}
}
