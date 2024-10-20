package deob;

@ObfuscatedName("de")
public class class112 implements Runnable {

    @ObfuscatedName("de.i")
    public volatile class110[] field1676 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1676[var1];
                if (var2 != null) {
                    var2.method1863();
                }
            }
        } catch (Exception var4) {
            class153.method131((String) null, var4);
        }
    }
}
