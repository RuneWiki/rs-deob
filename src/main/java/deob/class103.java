package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cl")
public class class103 {

    @ObfuscatedName("cl.v")
    public static int field1334 = 7;

    @ObfuscatedName("cl.f")
    public boolean field1327;

    @ObfuscatedName("cl.y")
    public boolean field1328;

    @ObfuscatedName("cl.p")
    public int field1329 = 1;

    @ObfuscatedName("cl.j")
    public String field1330 = null;

    @ObfuscatedName("cl.r")
    public boolean field1333 = false;

    @ObfuscatedName("cl.b")
    public double field1338 = 0.8D;

    @ObfuscatedName("cl.d")
    public int field1332 = 127;

    @ObfuscatedName("cl.s")
    public int field1331 = 127;

    @ObfuscatedName("cl.u")
    public int field1325 = 127;

    @ObfuscatedName("cl.l")
    public LinkedHashMap field1336 = new LinkedHashMap();

    public class103() {
        this.method2038(true);
    }

    public class103(class383 arg0) {
        if (arg0 == null || arg0.field4155 == null) {
            this.method2038(true);
        } else {
            int var2 = arg0.method5965();
            if (var2 >= 0 && var2 <= field1334) {
                if (arg0.method5965() == 1) {
                    this.field1327 = true;
                }
                if (var2 > 1) {
                    this.field1328 = arg0.method5965() == 1;
                }
                if (var2 > 3) {
                    this.field1329 = arg0.method5965();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5965();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5970();
                        int var6 = arg0.method5970();
                        this.field1336.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1330 = arg0.method6180();
                }
                if (var2 > 5) {
                    this.field1333 = arg0.method5954();
                }
                if (var2 > 6) {
                    this.field1338 = (double) arg0.method5965() / 100.0D;
                    this.field1332 = arg0.method5965();
                    this.field1331 = arg0.method5965();
                    this.field1325 = arg0.method5965();
                }
            } else {
                this.method2038(true);
            }
        }
    }

    @ObfuscatedName("cl.v(ZI)V")
    public void method2038(boolean arg0) {
    }

    @ObfuscatedName("cl.n(I)Lnd;")
    public class383 method2036() {
        class383 var1 = new class383(100);
        var1.method6043(field1334);
        var1.method6043(this.field1327 ? 1 : 0);
        var1.method6043(this.field1328 ? 1 : 0);
        var1.method6043(this.field1329);
        var1.method6043(this.field1336.size());
        Iterator var2 = this.field1336.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5951((Integer) var3.getKey());
            var1.method5951((Integer) var3.getValue());
        }
        var1.method5955(this.field1330 == null ? "" : this.field1330);
        var1.method6083(this.field1333);
        var1.method6043((int) (this.field1338 * 100.0D));
        var1.method6043(this.field1332);
        var1.method6043(this.field1331);
        var1.method6043(this.field1325);
        return var1;
    }

    @ObfuscatedName("dr.f(I)V")
    public static void method2073() {
        class367 var0 = null;
        try {
            var0 = class129.method1727("", Statics.field462.field3217, true);
            class383 var1 = Statics.field1804.method2036();
            var0.method5806(var1.field4155, 0, var1.field4158);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method5808(true);
            }
        } catch (Exception var4) {
        }
    }
}
