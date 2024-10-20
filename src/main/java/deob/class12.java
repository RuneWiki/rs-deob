package deob;

@ObfuscatedName("i")
public class class12 implements Runnable {

    @ObfuscatedName("i.g")
    public boolean field178 = true;

    @ObfuscatedName("i.v")
    public Object field181 = new Object();

    @ObfuscatedName("i.z")
    public int field171 = 0;

    @ObfuscatedName("i.h")
    public int[] field174 = new int[500];

    @ObfuscatedName("i.k")
    public int[] field175 = new int[500];

    public void run() {
        while (this.field178) {
            Object var1 = this.field181;
            synchronized (this.field181) {
                if (this.field171 < 500) {
                    this.field174[this.field171] = class127.field2023;
                    this.field175[this.field171] = class127.field2017 * 1105708693;
                    this.field171++;
                }
            }
            class114.method2962(50L);
        }
    }
}
