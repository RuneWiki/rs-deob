package deob;

@ObfuscatedName("f")
public class class12 implements Runnable {

    @ObfuscatedName("f.y")
    public boolean field173 = true;

    @ObfuscatedName("f.u")
    public Object field184 = new Object();

    @ObfuscatedName("f.k")
    public int field174 = 0;

    @ObfuscatedName("f.v")
    public int[] field176 = new int[500];

    @ObfuscatedName("f.l")
    public int[] field172 = new int[500];

    public void run() {
        while (this.field173) {
            Object var1 = this.field184;
            synchronized (this.field184) {
                if (this.field174 < 500) {
                    this.field176[this.field174] = class127.field2005;
                    this.field172[this.field174] = class127.field2006;
                    this.field174++;
                }
            }
            class114.method140(50L);
        }
    }
}
