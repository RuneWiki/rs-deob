package deob;

@ObfuscatedName("dc")
public class class112 implements Runnable {

    @ObfuscatedName("dc.e")
    public volatile class110[] field1661 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1661[var1];
                if (var2 != null) {
                    var2.method1877();
                }
            }
        } catch (Exception var4) {
            class153.method464((String) null, var4);
        }
    }
}
