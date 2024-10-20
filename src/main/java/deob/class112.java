package deob;

@ObfuscatedName("db")
public class class112 implements Runnable {

    @ObfuscatedName("db.i")
    public volatile class110[] field1679 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1679[var1];
                if (var2 != null) {
                    var2.method1862();
                }
            }
        } catch (Exception var4) {
            class153.method2658((String) null, var4);
        }
    }
}
