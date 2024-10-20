package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cp")
public class class100 {

    @ObfuscatedName("cp.k")
    public boolean[] field1283;

    @ObfuscatedName("cp.d")
    public Map field1284;

    @ObfuscatedName("cp.w")
    public String[] field1285;

    @ObfuscatedName("cp.v")
    public boolean field1287 = false;

    @ObfuscatedName("cp.q")
    public long field1282;

    public class100() {
        int var1 = Statics.field103.method3891(19);
        this.field1284 = new HashMap();
        this.field1283 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class253 var3 = (class253) class253.field3232.method3146((long) var2);
            class253 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3233.method3869(19, var2);
                class253 var6 = new class253();
                if (var5 != null) {
                    var6.method4095(new class310(var5));
                }
                class253.field3232.method3152(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1283[var2] = var4.field3234;
        }
        int var8 = 0;
        if (Statics.field103.method3972(15)) {
            var8 = Statics.field103.method3891(15);
        }
        this.field1285 = new String[var8];
        this.method2061();
    }

    @ObfuscatedName("cp.x(III)V")
    public void method2052(int arg0, int arg1) {
        this.field1284.put(arg0, arg1);
        if (this.field1283[arg0]) {
            this.field1287 = true;
        }
    }

    @ObfuscatedName("cp.m(IB)I")
    public int method2053(int arg0) {
        Object var2 = this.field1284.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cp.k(ILjava/lang/String;I)V")
    public void method2085(int arg0, String arg1) {
        this.field1284.put(arg0, arg1);
    }

    @ObfuscatedName("cp.d(II)Ljava/lang/String;")
    public String method2077(int arg0) {
        Object var2 = this.field1284.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cp.w(ILjava/lang/String;S)V")
    public void method2079(int arg0, String arg1) {
        this.field1285[arg0] = arg1;
    }

    @ObfuscatedName("cp.v(IB)Ljava/lang/String;")
    public String method2057(int arg0) {
        return this.field1285[arg0];
    }

    @ObfuscatedName("cp.q(I)V")
    public void method2058() {
        for (int var1 = 0; var1 < this.field1283.length; var1++) {
            if (!this.field1283[var1]) {
                this.field1284.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1285.length; var2++) {
            this.field1285[var2] = null;
        }
    }

    @ObfuscatedName("cp.z(ZS)Lmb;")
    public class353 method2059(boolean arg0) {
        return class177.method763("2", Statics.field3966.field3110, arg0);
    }

    @ObfuscatedName("cp.t(I)V")
    public void method2060() {
        class353 var1 = this.method2059(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1284.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1283[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class310.method3851((String) var7);
                    }
                    var3++;
                }
            }
            class310 var8 = new class310(var2);
            var8.method5121(2);
            var8.method5122(var3);
            Iterator var9 = this.field1284.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1283[var11]) {
                    var8.method5122(var11);
                    Object var12 = var10.getValue();
                    class4 var13 = class4.method23(var12.getClass());
                    var8.method5121(var13.field10);
                    class1 var14 = class4.method25(var12.getClass());
                    var14.method4(var12, var8);
                }
            }
            var1.method6197(var8.field3710, 0, var8.field3711);
        } catch (Exception var26) {
        } finally {
            try {
                var1.method6192();
            } catch (Exception var25) {
            }
        }
        this.field1287 = false;
        this.field1282 = Statics.method3668();
    }

    @ObfuscatedName("cp.e(I)V")
    public void method2061() {
        class353 var1 = this.method2059(false);
        label216: {
            try {
                byte[] var2 = new byte[(int) var1.method6194()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6206(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class310 var5 = new class310(var2);
                if (var5.field3710.length - var5.field3711 < 1) {
                    return;
                }
                int var7 = var5.method5137();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method5139();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label216;
                            }
                            int var11 = var5.method5139();
                            int var12 = var5.method5137();
                            class4 var13 = (class4) class205.method129(class4.method31(), var12);
                            Object var14 = var13.method27(var5);
                            if (this.field1283[var11]) {
                                this.field1284.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method5139();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method5139();
                            int var18 = var5.method5142();
                            if (this.field1283[var17]) {
                                this.field1284.put(var17, var18);
                            }
                        }
                        int var19 = var5.method5139();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label216;
                            }
                            var5.method5139();
                            var5.method5257();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label216;
            } finally {
                try {
                    var1.method6192();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1287 = false;
    }

    @ObfuscatedName("cp.s(I)V")
    public void method2087() {
        if (this.field1287 && this.field1282 < Statics.method3668() - 60000L) {
            this.method2060();
        }
    }

    @ObfuscatedName("cp.p(I)Z")
    public boolean method2063() {
        return this.field1287;
    }
}
