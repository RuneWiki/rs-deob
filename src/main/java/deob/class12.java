package deob;

@ObfuscatedName("a")
public class class12 implements Runnable {

    @ObfuscatedName("a.t")
    public boolean field172 = true;

    @ObfuscatedName("a.s")
    public Object field164 = new Object();

    @ObfuscatedName("a.f")
    public int field171 = 0;

    @ObfuscatedName("a.e")
    public int[] field166 = new int[500];

    @ObfuscatedName("a.d")
    public int[] field168 = new int[500];

    public void run() {
        while (this.field172) {
            Object var1 = this.field164;
            synchronized (this.field164) {
                if (this.field171 < 500) {
                    this.field166[this.field171] = class127.field1996;
                    this.field168[this.field171] = class127.field1999 * 1288203703;
                    this.field171++;
                }
            }
            class114.method2031(50L);
        }
    }
}
