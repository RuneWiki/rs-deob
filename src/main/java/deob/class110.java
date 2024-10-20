package deob;

@ObfuscatedName("de")
public class class110 implements Runnable {

    @ObfuscatedName("de.d")
    public volatile class108[] field1650 = new class108[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class108 var2 = this.field1650[var1];
                if (var2 != null) {
                    var2.method1924();
                }
            }
        } catch (Exception var4) {
            class153.method1775((String) null, var4);
        }
    }
}
