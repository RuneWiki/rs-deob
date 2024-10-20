package deob;

@ObfuscatedName("q")
public class class12 implements Runnable {

    @ObfuscatedName("q.x")
    public boolean field177 = true;

    @ObfuscatedName("q.v")
    public Object field178 = new Object();

    @ObfuscatedName("q.m")
    public int field168 = 0;

    @ObfuscatedName("q.e")
    public int[] field171 = new int[500];

    @ObfuscatedName("q.h")
    public int[] field167 = new int[500];

    public void run() {
        while (this.field177) {
            Object var1 = this.field178;
            synchronized (this.field178) {
                if (this.field168 < 500) {
                    this.field171[this.field168] = class129.field2001;
                    this.field167[this.field168] = class129.field2002;
                    this.field168++;
                }
            }
            class116.method1361(50L);
        }
    }
}
