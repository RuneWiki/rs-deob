package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bu")
public class class115 implements Runnable {

    @ObfuscatedName("bu.b")
    public class116 field1913;

    @ObfuscatedName("bu.k")
    public volatile boolean field1908 = false;

    @ObfuscatedName("bu.h")
    public volatile class185[] field1909 = new class185[2];

    @ObfuscatedName("bu.w")
    public volatile boolean field1911 = false;

    public void run() {
        this.field1911 = true;
        try {
            while (!this.field1908) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class185 var2 = this.field1909[var1];
                    if (var2 != null) {
                        var2.method3358();
                    }
                }
                class134.method600(10L);
                class116 var3 = this.field1913;
                Object var4 = null;
                if (var3.field1921 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1921.peekEvent() != null; var5++) {
                        class134.method600(1L);
                    }
                    if (var4 != null) {
                        var3.field1921.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class136.method1127((String) null, var10);
        } finally {
            this.field1911 = false;
        }
    }
}
