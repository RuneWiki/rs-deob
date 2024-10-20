package deob;

@ObfuscatedName("g")
public class class13 implements Runnable {

    @ObfuscatedName("g.q")
    public boolean field189 = true;

    @ObfuscatedName("g.s")
    public Object field186 = new Object();

    @ObfuscatedName("g.h")
    public int field187 = 0;

    @ObfuscatedName("g.e")
    public int[] field188 = new int[500];

    @ObfuscatedName("g.n")
    public int[] field196 = new int[500];

    public void run() {
        while (this.field189) {
            Object var1 = this.field186;
            synchronized (this.field186) {
                if (this.field187 < 500) {
                    this.field188[this.field187] = class132.field2011;
                    this.field196[this.field187] = class132.field2005 * -322104283;
                    this.field187++;
                }
            }
            class119.method587(50L);
        }
    }
}
