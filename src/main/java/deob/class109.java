package deob;

@ObfuscatedName("dj")
public class class109 implements Runnable {

    @ObfuscatedName("dj.b")
    public volatile class107[] field1546 = new class107[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class107 var2 = this.field1546[var1];
                if (var2 != null) {
                    var2.method2054();
                }
            }
        } catch (Exception var4) {
            class164.method482((String) null, var4);
        }
    }
}
