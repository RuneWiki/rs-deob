package deob;

@ObfuscatedName("b")
public class class13 implements Runnable {

    @ObfuscatedName("b.n")
    public boolean field183 = true;

    @ObfuscatedName("b.w")
    public Object field189 = new Object();

    @ObfuscatedName("b.i")
    public int field182 = 0;

    @ObfuscatedName("b.e")
    public int[] field185 = new int[500];

    @ObfuscatedName("b.h")
    public int[] field186 = new int[500];

    public void run() {
        while (this.field183) {
            Object var1 = this.field189;
            synchronized (this.field189) {
                if (this.field182 < 500) {
                    this.field185[this.field182] = class132.field2037;
                    this.field186[this.field182] = class132.field2038;
                    this.field182++;
                }
            }
            Statics.method849(50L);
        }
    }
}
