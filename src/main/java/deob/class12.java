package deob;

@ObfuscatedName("c")
public class class12 implements Runnable {

    @ObfuscatedName("c.v")
    public boolean field179 = true;

    @ObfuscatedName("c.t")
    public Object field174 = new Object();

    @ObfuscatedName("c.f")
    public int field175 = 0;

    @ObfuscatedName("c.j")
    public int[] field176 = new int[500];

    @ObfuscatedName("c.l")
    public int[] field177 = new int[500];

    public void run() {
        while (this.field179) {
            Object var1 = this.field174;
            synchronized (this.field174) {
                if (this.field175 < 500) {
                    this.field176[this.field175] = class131.field2019;
                    this.field177[this.field175] = class131.field2020;
                    this.field175++;
                }
            }
            class118.method2729(50L);
        }
    }
}
