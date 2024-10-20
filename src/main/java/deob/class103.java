package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cn")
public class class103 {

    @ObfuscatedName("cn.f")
    public static int field1318 = 7;

    @ObfuscatedName("cn.v")
    public boolean field1321;

    @ObfuscatedName("cn.y")
    public boolean field1315;

    @ObfuscatedName("cn.j")
    public int field1316 = 1;

    @ObfuscatedName("cn.o")
    public String field1319 = null;

    @ObfuscatedName("cn.m")
    public boolean field1317 = false;

    @ObfuscatedName("cn.r")
    public double field1313 = 0.8D;

    @ObfuscatedName("cn.h")
    public int field1320 = 127;

    @ObfuscatedName("cn.d")
    public int field1312 = 127;

    @ObfuscatedName("cn.z")
    public int field1322 = 127;

    @ObfuscatedName("cn.b")
    public LinkedHashMap field1323 = new LinkedHashMap();

    public class103() {
        this.method2049(true);
    }

    public class103(class384 arg0) {
        if (arg0 == null || arg0.field4160 == null) {
            this.method2049(true);
        } else {
            int var2 = arg0.method5902();
            if (var2 >= 0 && var2 <= field1318) {
                if (arg0.method5902() == 1) {
                    this.field1321 = true;
                }
                if (var2 > 1) {
                    this.field1315 = arg0.method5902() == 1;
                }
                if (var2 > 3) {
                    this.field1316 = arg0.method5902();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5902();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5965();
                        int var6 = arg0.method5965();
                        this.field1323.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1319 = arg0.method5940();
                }
                if (var2 > 5) {
                    this.field1317 = arg0.method5904();
                }
                if (var2 > 6) {
                    this.field1313 = (double) arg0.method5902() / 100.0D;
                    this.field1320 = arg0.method5902();
                    this.field1312 = arg0.method5902();
                    this.field1322 = arg0.method5902();
                }
            } else {
                this.method2049(true);
            }
        }
    }

    @ObfuscatedName("cn.f(ZB)V")
    public void method2049(boolean arg0) {
    }

    @ObfuscatedName("cn.e(I)Lnt;")
    public class384 method2052() {
        class384 var1 = new class384(100);
        var1.method5880(field1318);
        var1.method5880(this.field1321 ? 1 : 0);
        var1.method5880(this.field1315 ? 1 : 0);
        var1.method5880(this.field1316);
        var1.method5880(this.field1323.size());
        Iterator var2 = this.field1323.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5883((Integer) var3.getKey());
            var1.method5883((Integer) var3.getValue());
        }
        var1.method6068(this.field1319 == null ? "" : this.field1319);
        var1.method5886(this.field1317);
        var1.method5880((int) (this.field1313 * 100.0D));
        var1.method5880(this.field1320);
        var1.method5880(this.field1312);
        var1.method5880(this.field1322);
        return var1;
    }

    @ObfuscatedName("eb.v(I)Lcn;")
    public static class103 method2412() {
        class368 var0 = null;
        class103 var1 = new class103();
        try {
            var0 = class130.method4424("", Statics.field2115.field3212, false);
            byte[] var2 = new byte[(int) var0.method5731()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method5732(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class103(new class384(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method5729();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("cl.y(B)V")
    public static void method2003() {
        class368 var0 = null;
        try {
            var0 = class130.method4424("", Statics.field2115.field3212, true);
            class384 var1 = Statics.field40.method2052();
            var0.method5728(var1.field4160, 0, var1.field4161);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method5727(true);
            }
        } catch (Exception var4) {
        }
    }
}
