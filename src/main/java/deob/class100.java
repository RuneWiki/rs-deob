package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("co")
public class class100 {

    @ObfuscatedName("co.s")
    public boolean[] field1290;

    @ObfuscatedName("co.t")
    public Map field1293;

    @ObfuscatedName("co.i")
    public String[] field1294;

    @ObfuscatedName("co.o")
    public boolean field1295 = false;

    @ObfuscatedName("co.x")
    public long field1296;

    public class100() {
        int var1 = Statics.field3159.method3884(19);
        this.field1293 = new HashMap();
        this.field1290 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class253 var3 = class253.method2138(var2);
            this.field1290[var2] = var3.field3260;
        }
        int var4 = 0;
        if (Statics.field3159.method3982(15)) {
            var4 = Statics.field3159.method3884(15);
        }
        this.field1294 = new String[var4];
        this.method2093();
    }

    @ObfuscatedName("co.z(III)V")
    public void method2055(int arg0, int arg1) {
        this.field1293.put(arg0, arg1);
        if (this.field1290[arg0]) {
            this.field1295 = true;
        }
    }

    @ObfuscatedName("co.k(IB)I")
    public int method2085(int arg0) {
        Object var2 = this.field1293.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("co.s(ILjava/lang/String;I)V")
    public void method2068(int arg0, String arg1) {
        this.field1293.put(arg0, arg1);
    }

    @ObfuscatedName("co.t(IB)Ljava/lang/String;")
    public String method2058(int arg0) {
        Object var2 = this.field1293.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("co.i(ILjava/lang/String;I)V")
    public void method2082(int arg0, String arg1) {
        this.field1294[arg0] = arg1;
    }

    @ObfuscatedName("co.o(IB)Ljava/lang/String;")
    public String method2060(int arg0) {
        return this.field1294[arg0];
    }

    @ObfuscatedName("co.x(B)V")
    public void method2054() {
        for (int var1 = 0; var1 < this.field1290.length; var1++) {
            if (!this.field1290[var1]) {
                this.field1293.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1294.length; var2++) {
            this.field1294[var2] = null;
        }
    }

    @ObfuscatedName("co.w(ZI)Lmy;")
    public class353 method2062(boolean arg0) {
        return class177.method21("2", Statics.field533.field3143, arg0);
    }

    @ObfuscatedName("co.g(B)V")
    public void method2067() {
        class353 var1 = this.method2062(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1293.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1290[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class310.method2409((String) var7);
                    }
                    var3++;
                }
            }
            class310 var8 = new class310(var2);
            var8.method5177(2);
            var8.method5178(var3);
            Iterator var9 = this.field1293.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6191(var8.field3731, 0, var8.field3734);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1290[var11]);
                var8.method5178(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = Statics.method30();
                int var15 = 0;
                class4 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class4 var16 = var14[var15];
                    if (var16.field18 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method5177(var17.field17);
                class4.method26(var12, var8);
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method6189();
            } catch (Exception var29) {
            }
        }
        this.field1295 = false;
        this.field1296 = class307.method2184();
    }

    @ObfuscatedName("co.m(B)V")
    public void method2093() {
        class353 var1 = this.method2062(false);
        label204: {
            try {
                byte[] var2 = new byte[(int) var1.method6206()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6194(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class310 var5 = new class310(var2);
                if (var5.field3731.length - var5.field3734 >= 1) {
                    int var7 = var5.method5193();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method5195();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label204;
                            }
                            int var11 = var5.method5195();
                            int var12 = var5.method5193();
                            class4 var13 = (class4) class205.method2633(Statics.method30(), var12);
                            Object var14 = var13.method29(var5);
                            if (this.field1290[var11]) {
                                this.field1293.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method5195();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method5195();
                            int var18 = var5.method5270();
                            if (this.field1290[var17]) {
                                this.field1293.put(var17, var18);
                            }
                        }
                        int var19 = var5.method5195();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label204;
                            }
                            var5.method5195();
                            var5.method5202();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label204;
            } finally {
                try {
                    var1.method6189();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1295 = false;
    }

    @ObfuscatedName("co.n(B)V")
    public void method2064() {
        if (this.field1295 && this.field1296 < class307.method2184() - 60000L) {
            this.method2067();
        }
    }

    @ObfuscatedName("co.d(I)Z")
    public boolean method2065() {
        return this.field1295;
    }
}
