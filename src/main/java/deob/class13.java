package deob;

@ObfuscatedName("z")
public class class13 implements Runnable {

    @ObfuscatedName("z.b")
    public boolean field178 = true;

    @ObfuscatedName("z.e")
    public Object field175 = new Object();

    @ObfuscatedName("z.a")
    public int field174 = 0;

    @ObfuscatedName("z.k")
    public int[] field176 = new int[500];

    @ObfuscatedName("z.p")
    public int[] field179 = new int[500];

    public void run() {
        while (this.field178) {
            Object var1 = this.field175;
            synchronized (this.field175) {
                if (this.field174 < 500) {
                    this.field176[this.field174] = class132.field2053;
                    this.field179[this.field174] = class132.field2054;
                    this.field174++;
                }
            }
            class119.method555(50L);
        }
    }
}
