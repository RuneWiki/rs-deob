package deob;

@ObfuscatedName("da")
public class class112 implements Runnable {

    @ObfuscatedName("da.p")
    public volatile class110[] field1660 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1660[var1];
                if (var2 != null) {
                    var2.method1794();
                }
            }
        } catch (Exception var4) {
            class153.method40((String) null, var4);
        }
    }
}
