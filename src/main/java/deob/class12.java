package deob;

@ObfuscatedName("i")
public class class12 implements Runnable {

    @ObfuscatedName("i.j")
    public boolean field179 = true;

    @ObfuscatedName("i.z")
    public Object field172 = new Object();

    @ObfuscatedName("i.y")
    public int field173 = 0;

    @ObfuscatedName("i.h")
    public int[] field176 = new int[500];

    @ObfuscatedName("i.r")
    public int[] field175 = new int[500];

    public void run() {
        while (this.field179) {
            Object var1 = this.field172;
            synchronized (this.field172) {
                if (this.field173 < 500) {
                    this.field176[this.field173] = class127.field2016;
                    this.field175[this.field173] = class127.field2011 * 1253894097;
                    this.field173++;
                }
            }
            class114.method589(50L);
        }
    }
}
