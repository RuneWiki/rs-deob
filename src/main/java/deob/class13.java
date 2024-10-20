package deob;

@ObfuscatedName("a")
public class class13 implements Runnable {

    @ObfuscatedName("a.o")
    public boolean field181 = true;

    @ObfuscatedName("a.l")
    public Object field178 = new Object();

    @ObfuscatedName("a.g")
    public int field180 = 0;

    @ObfuscatedName("a.u")
    public int[] field184 = new int[500];

    @ObfuscatedName("a.q")
    public int[] field189 = new int[500];

    public void run() {
        while (this.field181) {
            Object var1 = this.field178;
            synchronized (this.field178) {
                if (this.field180 < 500) {
                    this.field184[this.field180] = class132.field2041;
                    this.field189[this.field180] = class132.field2050;
                    this.field180++;
                }
            }
            Statics.method832(50L);
        }
    }
}
