package deob;

@ObfuscatedName("a")
public class class12 implements Runnable {

    @ObfuscatedName("a.l")
    public boolean field168 = true;

    @ObfuscatedName("a.y")
    public Object field166 = new Object();

    @ObfuscatedName("a.g")
    public int field167 = 0;

    @ObfuscatedName("a.j")
    public int[] field165 = new int[500];

    @ObfuscatedName("a.w")
    public int[] field169 = new int[500];

    public void run() {
        while (this.field168) {
            Object var1 = this.field166;
            synchronized (this.field166) {
                if (this.field167 < 500) {
                    this.field165[this.field167] = class129.field1990;
                    this.field169[this.field167] = class129.field1997;
                    this.field167++;
                }
            }
            class116.method71(50L);
        }
    }
}
