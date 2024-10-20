package deob;

@ObfuscatedName("v")
public class class12 implements Runnable {

    @ObfuscatedName("v.k")
    public boolean field162 = true;

    @ObfuscatedName("v.y")
    public Object field166 = new Object();

    @ObfuscatedName("v.s")
    public int field163 = 0;

    @ObfuscatedName("v.g")
    public int[] field161 = new int[500];

    @ObfuscatedName("v.h")
    public int[] field168 = new int[500];

    public void run() {
        while (this.field162) {
            Object var1 = this.field166;
            synchronized (this.field166) {
                if (this.field163 < 500) {
                    this.field161[this.field163] = class127.field2007;
                    this.field168[this.field163] = class127.field2008;
                    this.field163++;
                }
            }
            class114.method1888(50L);
        }
    }
}
