package deob;

@ObfuscatedName("PTSFQSMJ")
public class PTSFQSMJ implements Runnable {

	@ObfuscatedName("PTSFQSMJ.a")
	public Object field1217 = new Object();

	@ObfuscatedName("PTSFQSMJ.c")
	public int[] field1219 = new int[500];

	@ObfuscatedName("PTSFQSMJ.d")
	public boolean field1220 = true;

	@ObfuscatedName("PTSFQSMJ.f")
	public int[] field1222 = new int[500];

	@ObfuscatedName("PTSFQSMJ.e")
	public client field1221;

	@ObfuscatedName("PTSFQSMJ.b")
	public int field1218;

	public void run() {
		while (field1220) {
			synchronized (field1217) {
				if (field1218 < 500) {
					field1222[field1218] = field1221.field1369;
					field1219[field1218] = field1221.field1370;
					field1218++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public PTSFQSMJ(client arg0) {
		field1221 = arg0;
	}
}
