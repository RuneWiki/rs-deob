package deob;

@ObfuscatedName("l")
public class class13 implements Runnable {

    @ObfuscatedName("l.t")
    public boolean field189 = true;

    @ObfuscatedName("l.b")
    public Object field181 = new Object();

    @ObfuscatedName("l.p")
    public int field180 = 0;

    @ObfuscatedName("l.e")
    public int[] field179 = new int[500];

    @ObfuscatedName("l.i")
    public int[] field182 = new int[500];

    public void run() {
        while (this.field189) {
            Object var1 = this.field181;
            synchronized (this.field181) {
                if (this.field180 < 500) {
                    this.field179[this.field180] = class132.field2027;
                    this.field182[this.field180] = class132.field2038;
                    this.field180++;
                }
            }
            class119.method172(50L);
        }
    }
}
