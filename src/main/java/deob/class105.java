package deob;

@ObfuscatedName("dl")
public class class105 implements Runnable {

    @ObfuscatedName("dl.n")
    public volatile class103[] field1389 = new class103[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class103 var2 = this.field1389[var1];
                if (var2 != null) {
                    var2.method2234();
                }
            }
        } catch (Exception var4) {
            class160.method943((String) null, var4);
        }
    }
}
