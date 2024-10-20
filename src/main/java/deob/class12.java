package deob;

@ObfuscatedName("p")
public class class12 implements Runnable {

    @ObfuscatedName("p.e")
    public boolean field177 = true;

    @ObfuscatedName("p.v")
    public Object field172 = new Object();

    @ObfuscatedName("p.k")
    public int field173 = 0;

    @ObfuscatedName("p.g")
    public int[] field174 = new int[500];

    @ObfuscatedName("p.q")
    public int[] field180 = new int[500];

    public void run() {
        while (this.field177) {
            Object var1 = this.field172;
            synchronized (this.field172) {
                if (this.field173 < 500) {
                    this.field174[this.field173] = class129.field2003;
                    this.field180[this.field173] = class129.field2004;
                    this.field173++;
                }
            }
            class116.method7(50L);
        }
    }
}
