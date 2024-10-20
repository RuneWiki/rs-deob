package deob;

@ObfuscatedName("dl")
public class class114 implements Runnable {

    @ObfuscatedName("dl.d")
    public volatile class112[] field1650 = new class112[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class112 var2 = this.field1650[var1];
                if (var2 != null) {
                    var2.method1909();
                }
            }
        } catch (Exception var4) {
            class153.method158((String) null, var4);
        }
    }
}
