package deob;

@ObfuscatedName("o")
public class class12 implements Runnable {

    @ObfuscatedName("o.z")
    public boolean field173 = true;

    @ObfuscatedName("o.j")
    public Object field170 = new Object();

    @ObfuscatedName("o.a")
    public int field171 = 0;

    @ObfuscatedName("o.y")
    public int[] field172 = new int[500];

    @ObfuscatedName("o.i")
    public int[] field175 = new int[500];

    public void run() {
        while (this.field173) {
            Object var1 = this.field170;
            synchronized (this.field170) {
                if (this.field171 < 500) {
                    this.field172[this.field171] = class127.field1988;
                    this.field175[this.field171] = class127.field1989 * -632739763;
                    this.field171++;
                }
            }
            class114.method1960(50L);
        }
    }
}
