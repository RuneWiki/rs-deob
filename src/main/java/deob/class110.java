package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dc")
public class class110 {

    @ObfuscatedName("dc.f")
    public boolean[] field1388;

    @ObfuscatedName("dc.y")
    public Map field1389;

    @ObfuscatedName("dc.p")
    public String[] field1390;

    @ObfuscatedName("dc.j")
    public boolean field1392 = false;

    @ObfuscatedName("dc.r")
    public long field1386;

    public class110() {
        int var1 = Statics.field74.method4478(19);
        this.field1389 = new HashMap();
        this.field1388 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class140 var3 = class140.method3293(var2);
            this.field1388[var2] = var3.field1579;
        }
        int var4 = 0;
        if (Statics.field74.method4439(15)) {
            var4 = Statics.field74.method4478(15);
        }
        this.field1390 = new String[var4];
        this.method2104();
    }

    @ObfuscatedName("dc.v(IIB)V")
    public void method2096(int arg0, int arg1) {
        this.field1389.put(arg0, arg1);
        if (this.field1388[arg0]) {
            this.field1392 = true;
        }
    }

    @ObfuscatedName("dc.n(II)I")
    public int method2097(int arg0) {
        Object var2 = this.field1389.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("dc.f(ILjava/lang/String;I)V")
    public void method2098(int arg0, String arg1) {
        this.field1389.put(arg0, arg1);
    }

    @ObfuscatedName("dc.y(II)Ljava/lang/String;")
    public String method2099(int arg0) {
        Object var2 = this.field1389.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("dc.p(ILjava/lang/String;S)V")
    public void method2100(int arg0, String arg1) {
        this.field1390[arg0] = arg1;
    }

    @ObfuscatedName("dc.j(IS)Ljava/lang/String;")
    public String method2129(int arg0) {
        return this.field1390[arg0];
    }

    @ObfuscatedName("dc.r(I)V")
    public void method2102() {
        for (int var1 = 0; var1 < this.field1388.length; var1++) {
            if (!this.field1388[var1]) {
                this.field1389.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1390.length; var2++) {
            this.field1390[var2] = null;
        }
    }

    @ObfuscatedName("dc.b(ZI)Lnm;")
    public class367 method2128(boolean arg0) {
        return class129.method1727("2", Statics.field462.field3217, arg0);
    }

    @ObfuscatedName("dc.d(B)V")
    public void method2103() {
        class367 var1 = this.method2128(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1389.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1388[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class383.method1863((String) var7);
                    }
                    var3++;
                }
            }
            class383 var8 = new class383(var2);
            var8.method6043(2);
            var8.method6166(var3);
            Iterator var9 = this.field1389.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1388[var11]) {
                    var8.method6166(var11);
                    Object var12 = var10.getValue();
                    class375 var13 = class375.method5888(var12.getClass());
                    var8.method6043(var13.field4136);
                    class375.method5884(var12, var8);
                }
            }
            var1.method5806(var8.field4155, 0, var8.field4158);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method5823();
            } catch (Exception var24) {
            }
        }
        this.field1392 = false;
        this.field1386 = class380.method2744();
    }

    @ObfuscatedName("dc.s(B)V")
    public void method2104() {
        class367 var1 = this.method2128(false);
        try {
            byte[] var2 = new byte[(int) var1.method5809()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method5810(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class383 var5 = new class383(var2);
            if (var5.field4155.length - var5.field4158 < 1) {
                return;
            }
            int var7 = var5.method5965();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method5967();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method5967();
                    int var12 = var5.method5965();
                    class375 var13 = (class375) class289.method2163(class375.method5885(), var12);
                    Object var14 = var13.method5889(var5);
                    if (this.field1388[var11]) {
                        this.field1389.put(var11, var14);
                    }
                }
            } else {
                int var15 = var5.method5967();
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = var5.method5967();
                    int var18 = var5.method5970();
                    if (this.field1388[var17]) {
                        this.field1389.put(var17, var18);
                    }
                }
                int var19 = var5.method5967();
                for (int var20 = 0; var20 < var19; var20++) {
                    var5.method5967();
                    var5.method5974();
                }
            }
        } catch (Exception var34) {
        } finally {
            try {
                var1.method5823();
            } catch (Exception var33) {
            }
        }
        this.field1392 = false;
    }

    @ObfuscatedName("dc.u(I)V")
    public void method2105() {
        if (this.field1392 && this.field1386 < class380.method2744() - 60000L) {
            this.method2103();
        }
    }

    @ObfuscatedName("dc.l(I)Z")
    public boolean method2106() {
        return this.field1392;
    }
}
