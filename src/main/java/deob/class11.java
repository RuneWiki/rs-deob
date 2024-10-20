package deob;

@ObfuscatedName("d")
public class class11 implements Runnable {

    @ObfuscatedName("d.m")
    public boolean field180 = true;

    @ObfuscatedName("d.k")
    public Object field177 = new Object();

    @ObfuscatedName("d.y")
    public int field173 = 0;

    @ObfuscatedName("d.g")
    public int[] field181 = new int[500];

    @ObfuscatedName("d.r")
    public int[] field175 = new int[500];

    public void run() {
        while (this.field180) {
            Object var1 = this.field177;
            synchronized (this.field177) {
                if (this.field173 < 500) {
                    this.field181[this.field173] = class124.field1969;
                    this.field175[this.field173] = class124.field1970;
                    this.field173++;
                }
            }
            class111.method59(50L);
        }
    }
}
