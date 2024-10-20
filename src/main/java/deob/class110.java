package deob;

@ObfuscatedName("dm")
public class class110 implements Runnable {

    @ObfuscatedName("dm.o")
    public volatile class108[] field1599 = new class108[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class108 var2 = this.field1599[var1];
                if (var2 != null) {
                    var2.method2024();
                }
            }
        } catch (Exception var4) {
            class165.method1744((String) null, var4);
        }
    }
}
