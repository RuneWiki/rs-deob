package deob;

@ObfuscatedName("k")
public class class12 implements Runnable {

    @ObfuscatedName("k.g")
    public boolean field170 = true;

    @ObfuscatedName("k.s")
    public Object field160 = new Object();

    @ObfuscatedName("k.h")
    public int field161 = 0;

    @ObfuscatedName("k.m")
    public int[] field171 = new int[500];

    @ObfuscatedName("k.u")
    public int[] field163 = new int[500];

    public void run() {
        while (this.field170) {
            Object var1 = this.field160;
            synchronized (this.field160) {
                if (this.field161 < 500) {
                    this.field171[this.field161] = class127.field1992;
                    this.field163[this.field161] = class127.field1988;
                    this.field161++;
                }
            }
            class114.method2036(50L);
        }
    }
}
