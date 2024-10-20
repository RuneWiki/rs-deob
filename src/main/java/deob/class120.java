package deob;

@ObfuscatedName("bq")
public class class120 implements Runnable {

    @ObfuscatedName("bq.o")
    public volatile boolean field1838 = false;

    @ObfuscatedName("bq.j")
    public class110 field1836;

    @ObfuscatedName("bq.t")
    public volatile boolean field1839 = false;

    @ObfuscatedName("bq.p")
    public volatile class186[] field1837 = new class186[2];

    public void run() {
        this.field1839 = true;
        try {
            while (!this.field1838) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class186 var2 = this.field1837[var1];
                    if (var2 != null) {
                        var2.method3541();
                    }
                }
                class30.method1166(10L);
                class111.method858(this.field1836, (Object) null);
            }
        } catch (Exception var7) {
            class156.method2297((String) null, var7);
        } finally {
            this.field1839 = false;
        }
    }
}
