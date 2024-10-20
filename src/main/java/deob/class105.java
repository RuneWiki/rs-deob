package deob;

@ObfuscatedName("dz")
public class class105 implements Runnable {

    @ObfuscatedName("dz.a")
    public volatile class103[] field1420 = new class103[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class103 var2 = this.field1420[var1];
                if (var2 != null) {
                    var2.method2252();
                }
            }
        } catch (Exception var4) {
            class160.method2786((String) null, var4);
        }
    }
}
