package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cm")
public class class103 {

    @ObfuscatedName("cm.f")
    public static int field1302 = 7;

    @ObfuscatedName("cm.u")
    public boolean field1311;

    @ObfuscatedName("cm.p")
    public boolean field1301;

    @ObfuscatedName("cm.b")
    public int field1306 = 1;

    @ObfuscatedName("cm.e")
    public String field1300 = null;

    @ObfuscatedName("cm.k")
    public boolean field1298 = false;

    @ObfuscatedName("cm.g")
    public double field1305 = 0.8D;

    @ObfuscatedName("cm.h")
    public int field1303 = 127;

    @ObfuscatedName("cm.n")
    public int field1307 = 127;

    @ObfuscatedName("cm.l")
    public int field1308 = 127;

    @ObfuscatedName("cm.m")
    public LinkedHashMap field1309 = new LinkedHashMap();

    public class103() {
        this.method1943(true);
    }

    public class103(class382 arg0) {
        if (arg0 == null || arg0.field4153 == null) {
            this.method1943(true);
        } else {
            int var2 = arg0.method5856();
            if (var2 >= 0 && var2 <= field1302) {
                if (arg0.method5856() == 1) {
                    this.field1311 = true;
                }
                if (var2 > 1) {
                    this.field1301 = arg0.method5856() == 1;
                }
                if (var2 > 3) {
                    this.field1306 = arg0.method5856();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5856();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5861();
                        int var6 = arg0.method5861();
                        this.field1309.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1300 = arg0.method5837();
                }
                if (var2 > 5) {
                    this.field1298 = arg0.method5847();
                }
                if (var2 > 6) {
                    this.field1305 = (double) arg0.method5856() / 100.0D;
                    this.field1303 = arg0.method5856();
                    this.field1307 = arg0.method5856();
                    this.field1308 = arg0.method5856();
                }
            } else {
                this.method1943(true);
            }
        }
    }

    @ObfuscatedName("cm.f(ZI)V")
    public void method1943(boolean arg0) {
    }

    @ObfuscatedName("cm.o(I)Lnu;")
    public class382 method1942() {
        class382 var1 = new class382(100);
        var1.method5839(field1302);
        var1.method5839(this.field1311 ? 1 : 0);
        var1.method5839(this.field1301 ? 1 : 0);
        var1.method5839(this.field1306);
        var1.method5839(this.field1309.size());
        Iterator var2 = this.field1309.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5842((Integer) var3.getKey());
            var1.method5842((Integer) var3.getValue());
        }
        var1.method6016(this.field1300 == null ? "" : this.field1300);
        var1.method5845(this.field1298);
        var1.method5839((int) (this.field1305 * 100.0D));
        var1.method5839(this.field1303);
        var1.method5839(this.field1307);
        var1.method5839(this.field1308);
        return var1;
    }

    @ObfuscatedName("bs.u(I)V")
    public static void method964() {
        class366 var0 = null;
        try {
            var0 = class129.method162("", Statics.field209.field2889, true);
            class382 var1 = Statics.field988.method1942();
            var0.method5673(var1.field4153, 0, var1.field4155);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method5675(true);
            }
        } catch (Exception var4) {
        }
    }
}
