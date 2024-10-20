package deob;

@ObfuscatedName("dw")
public class class112 implements Runnable {

    @ObfuscatedName("dw.c")
    public volatile class110[] field1625 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1625[var1];
                if (var2 != null) {
                    var2.method1802();
                }
            }
        } catch (Exception var4) {
            class153.method463((String) null, var4);
        }
    }
}
