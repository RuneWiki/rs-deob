package deob;

@ObfuscatedName("LLZTMQTZ")
public class LLZTMQTZ implements Runnable {

	@ObfuscatedName("LLZTMQTZ.a")
	public Object field907 = new Object();

	@ObfuscatedName("LLZTMQTZ.b")
	public int[] field908 = new int[500];

	@ObfuscatedName("LLZTMQTZ.c")
	public int[] field909 = new int[500];

	@ObfuscatedName("LLZTMQTZ.f")
	public boolean field911 = true;

	@ObfuscatedName("LLZTMQTZ.g")
	public client field912;

	@ObfuscatedName("LLZTMQTZ.d")
	public int field910;

	public void run() {
		while (field911) {
			synchronized (field907) {
				if (field910 < 500) {
					field908[field910] = field912.field1049;
					field909[field910] = field912.field1050;
					field910++;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public LLZTMQTZ(client arg0) {
		field912 = arg0;
	}
}
