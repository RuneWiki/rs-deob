package deob;

@ObfuscatedName("di")
public class class112 implements Runnable {

    @ObfuscatedName("di.s")
    public volatile class110[] field1658 = new class110[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class110 var2 = this.field1658[var1];
                if (var2 != null) {
                    var2.method1888();
                }
            }
        } catch (Exception var4) {
            class154.method1971((String) null, var4);
        }
    }
}
