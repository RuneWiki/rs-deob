package deob;

@ObfuscatedName("OUOWXDXZ")
public class OUOWXDXZ implements Runnable {

	@ObfuscatedName("OUOWXDXZ.a")
	public int[] field1084 = new int[500];

	@ObfuscatedName("OUOWXDXZ.b")
	public boolean field1085 = true;

	@ObfuscatedName("OUOWXDXZ.e")
	public Object field1088 = new Object();

	@ObfuscatedName("OUOWXDXZ.f")
	public int[] field1089 = new int[500];

	@ObfuscatedName("OUOWXDXZ.c")
	public client field1086;

	@ObfuscatedName("OUOWXDXZ.d")
	public int field1087;

	public OUOWXDXZ(client arg0) {
		field1086 = arg0;
	}

	public void run() {
		while (field1085) {
			synchronized (field1088) {
				if (field1087 < 500) {
					field1084[field1087] = field1086.field956;
					field1089[field1087] = field1086.field957;
					field1087++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
