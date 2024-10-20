package deob;

@ObfuscatedName("de")
public class class112 implements Runnable {

    @ObfuscatedName("de.i")
    public volatile class110[] field1652 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1652[var1];
                if (var2 != null) {
                    var2.method1888();
                }
            }
        } catch (Exception var4) {
            class153.method3831((String) null, var4);
        }
    }
}
