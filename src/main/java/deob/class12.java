package deob;

@ObfuscatedName("y")
public class class12 implements Runnable {

    @ObfuscatedName("y.b")
    public boolean field167 = true;

    @ObfuscatedName("y.e")
    public Object field168 = new Object();

    @ObfuscatedName("y.i")
    public int field172 = 0;

    @ObfuscatedName("y.k")
    public int[] field170 = new int[500];

    @ObfuscatedName("y.h")
    public int[] field171 = new int[500];

    public void run() {
        while (this.field167) {
            Object var1 = this.field168;
            synchronized (this.field168) {
                if (this.field172 < 500) {
                    this.field170[this.field172] = class131.field2022;
                    this.field171[this.field172] = class131.field2036 * -379793861;
                    this.field172++;
                }
            }
            class118.method2490(50L);
        }
    }
}
