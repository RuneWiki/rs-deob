package deob;

@ObfuscatedName("l")
public class class12 implements Runnable {

    @ObfuscatedName("l.i")
    public boolean field190 = true;

    @ObfuscatedName("l.c")
    public Object field187 = new Object();

    @ObfuscatedName("l.h")
    public int field183 = 0;

    @ObfuscatedName("l.v")
    public int[] field184 = new int[500];

    @ObfuscatedName("l.q")
    public int[] field185 = new int[500];

    public void run() {
        while (this.field190) {
            Object var1 = this.field187;
            synchronized (this.field187) {
                if (this.field183 < 500) {
                    this.field184[this.field183] = class127.field1996;
                    this.field185[this.field183] = class127.field1997 * -153904067;
                    this.field183++;
                }
            }
            class114.method743(50L);
        }
    }
}
