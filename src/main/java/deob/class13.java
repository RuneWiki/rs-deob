package deob;

@ObfuscatedName("w")
public class class13 implements Runnable {

    @ObfuscatedName("w.y")
    public boolean field193 = true;

    @ObfuscatedName("w.k")
    public Object field189 = new Object();

    @ObfuscatedName("w.g")
    public int field190 = 0;

    @ObfuscatedName("w.n")
    public int[] field191 = new int[500];

    @ObfuscatedName("w.t")
    public int[] field192 = new int[500];

    public void run() {
        while (this.field193) {
            Object var1 = this.field189;
            synchronized (this.field189) {
                if (this.field190 < 500) {
                    this.field191[this.field190] = class132.field2071;
                    this.field192[this.field190] = class132.field2072 * 76101137;
                    this.field190++;
                }
            }
            class119.method488(50L);
        }
    }
}
