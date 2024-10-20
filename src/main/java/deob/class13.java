package deob;

@ObfuscatedName("n")
public class class13 implements Runnable {

    @ObfuscatedName("n.p")
    public boolean field190 = true;

    @ObfuscatedName("n.k")
    public Object field196 = new Object();

    @ObfuscatedName("n.e")
    public int field191 = 0;

    @ObfuscatedName("n.f")
    public int[] field188 = new int[500];

    @ObfuscatedName("n.w")
    public int[] field192 = new int[500];

    public void run() {
        while (this.field190) {
            Object var1 = this.field196;
            synchronized (this.field196) {
                if (this.field191 < 500) {
                    this.field188[this.field191] = class132.field2050;
                    this.field192[this.field191] = class132.field2051;
                    this.field191++;
                }
            }
            class119.method1371(50L);
        }
    }
}
