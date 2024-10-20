package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dl")
public class class110 {

    @ObfuscatedName("dl.u")
    public boolean[] field1373;

    @ObfuscatedName("dl.p")
    public Map field1369;

    @ObfuscatedName("dl.b")
    public String[] field1370;

    @ObfuscatedName("dl.e")
    public boolean field1371 = false;

    @ObfuscatedName("dl.k")
    public long field1367;

    public class110() {
        int var1 = Statics.field2847.method3944(19);
        this.field1369 = new HashMap();
        this.field1373 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class281 var3 = Statics.method4053(var2);
            this.field1373[var2] = var3.field3428;
        }
        int var4 = 0;
        if (Statics.field2847.method3898(15)) {
            var4 = Statics.field2847.method3944(15);
        }
        this.field1370 = new String[var4];
        this.method2042();
    }

    @ObfuscatedName("dl.f(III)V")
    public void method2038(int arg0, int arg1) {
        this.field1369.put(arg0, arg1);
        if (this.field1373[arg0]) {
            this.field1371 = true;
        }
    }

    @ObfuscatedName("dl.o(II)I")
    public int method2041(int arg0) {
        Object var2 = this.field1369.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("dl.u(ILjava/lang/String;I)V")
    public void method2023(int arg0, String arg1) {
        this.field1369.put(arg0, arg1);
    }

    @ObfuscatedName("dl.p(IB)Ljava/lang/String;")
    public String method2006(int arg0) {
        Object var2 = this.field1369.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("dl.b(ILjava/lang/String;I)V")
    public void method2007(int arg0, String arg1) {
        this.field1370[arg0] = arg1;
    }

    @ObfuscatedName("dl.e(II)Ljava/lang/String;")
    public String method2008(int arg0) {
        return this.field1370[arg0];
    }

    @ObfuscatedName("dl.k(I)V")
    public void method2009() {
        for (int var1 = 0; var1 < this.field1373.length; var1++) {
            if (!this.field1373[var1]) {
                this.field1369.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1370.length; var2++) {
            this.field1370[var2] = null;
        }
    }

    @ObfuscatedName("dl.g(ZI)Lni;")
    public class366 method2010(boolean arg0) {
        return class129.method162("2", Statics.field209.field2889, arg0);
    }

    @ObfuscatedName("dl.h(B)V")
    public void method2011() {
        class366 var1 = this.method2010(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1369.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1373[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class382.method5070((String) var7);
                    }
                    var3++;
                }
            }
            class382 var8 = new class382(var2);
            var8.method5839(2);
            var8.method5853(var3);
            Iterator var9 = this.field1369.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1373[var11]) {
                    var8.method5853(var11);
                    Object var12 = var10.getValue();
                    class374 var13 = class374.method5767(var12.getClass());
                    var8.method5839(var13.field4131);
                    class370 var14 = Statics.method5769(var12.getClass());
                    var14.method5752(var12, var8);
                }
            }
            var1.method5673(var8.field4153, 0, var8.field4155);
        } catch (Exception var26) {
        } finally {
            try {
                var1.method5674();
            } catch (Exception var25) {
            }
        }
        this.field1371 = false;
        this.field1367 = class379.method1540();
    }

    @ObfuscatedName("dl.n(I)V")
    public void method2042() {
        class366 var1 = this.method2010(false);
        try {
            byte[] var2 = new byte[(int) var1.method5695()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method5671(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class382 var5 = new class382(var2);
            if (var5.field4153.length - var5.field4155 < 1) {
                return;
            }
            int var7 = var5.method5856();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method5858();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method5858();
                    int var12 = var5.method5856();
                    class374[] var13 = new class374[] { class374.field4129, class374.field4135, class374.field4127 };
                    class374 var14 = (class374) class267.method2139(var13, var12);
                    Object var15 = var14.method5771(var5);
                    if (this.field1373[var11]) {
                        this.field1369.put(var11, var15);
                    }
                }
            } else {
                int var16 = var5.method5858();
                for (int var17 = 0; var17 < var16; var17++) {
                    int var18 = var5.method5858();
                    int var19 = var5.method5861();
                    if (this.field1373[var18]) {
                        this.field1369.put(var18, var19);
                    }
                }
                int var20 = var5.method5858();
                for (int var21 = 0; var21 < var20; var21++) {
                    var5.method5858();
                    var5.method5865();
                }
            }
        } catch (Exception var35) {
        } finally {
            try {
                var1.method5674();
            } catch (Exception var34) {
            }
        }
        this.field1371 = false;
    }

    @ObfuscatedName("dl.l(S)V")
    public void method2018() {
        if (this.field1371 && this.field1367 < class379.method1540() - 60000L) {
            this.method2011();
        }
    }

    @ObfuscatedName("dl.m(B)Z")
    public boolean method2013() {
        return this.field1371;
    }
}
