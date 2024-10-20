package deob;

@ObfuscatedName("s")
public class class13 implements Runnable {

    @ObfuscatedName("s.e")
    public boolean field172 = true;

    @ObfuscatedName("s.a")
    public Object field169 = new Object();

    @ObfuscatedName("s.l")
    public int field170 = 0;

    @ObfuscatedName("s.c")
    public int[] field175 = new int[500];

    @ObfuscatedName("s.u")
    public int[] field173 = new int[500];

    public void run() {
        while (this.field172) {
            Object var1 = this.field169;
            synchronized (this.field169) {
                if (this.field170 < 500) {
                    this.field175[this.field170] = class132.field2007;
                    this.field173[this.field170] = class132.field2008;
                    this.field170++;
                }
            }
            class119.method837(50L);
        }
    }
}
