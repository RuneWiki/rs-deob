package deob;

@ObfuscatedName("bm")
public class class124 implements Runnable {

    @ObfuscatedName("bm.b")
    public volatile boolean field1871 = false;

    @ObfuscatedName("bm.c")
    public volatile class163[] field1869 = new class163[2];

    @ObfuscatedName("bm.i")
    public volatile boolean field1872 = false;

    @ObfuscatedName("bm.v")
    public class130 field1870;

    public void run() {
        this.field1872 = true;
        try {
            while (!this.field1871) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class163 var2 = this.field1869[var1];
                    if (var2 != null) {
                        var2.method2922();
                    }
                }
                class134.method1468(10L);
                class127.method1078(this.field1870, (Object) null);
            }
        } catch (Exception var7) {
            class136.method1295((String) null, var7);
        } finally {
            this.field1872 = false;
        }
    }
}
