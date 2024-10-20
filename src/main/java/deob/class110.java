package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ej")
public class class110 {

    @ObfuscatedName("ej.ao")
    public boolean[] field1412;

    @ObfuscatedName("ej.at")
    public Map field1416;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ej.ac")
    public String[] field1410;

    @ObfuscatedName("ej.ai")
    public boolean field1415 = false;

    @ObfuscatedName("ej.az")
    public long field1414;

    public class110() {
        int var1 = Statics.field4.method6173(19);
        this.field1416 = new HashMap();
        this.field1412 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class189 var3 = class189.method4147(var2);
            this.field1412[var2] = var3.field1971;
        }
        int var4 = 0;
        if (Statics.field4.method6093(15)) {
            var4 = Statics.field4.method6173(15);
        }
        this.field1410 = new String[var4];
        this.method2623();
    }

    @ObfuscatedName("ej.au(III)V")
    public void method2633(int arg0, int arg1) {
        this.field1416.put(arg0, arg1);
        if (this.field1412[arg0]) {
            this.field1415 = true;
        }
    }

    @ObfuscatedName("ej.ae(IB)I")
    public int method2597(int arg0) {
        Object var2 = this.field1416.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ej.ao(ILjava/lang/String;I)V")
    public void method2615(int arg0, String arg1) {
        this.field1416.put(arg0, arg1);
    }

    @ObfuscatedName("ej.at(IB)Ljava/lang/String;")
    public String method2599(int arg0) {
        Object var2 = this.field1416.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ej.ac(ILjava/lang/String;I)V")
    public void method2611(int arg0, String arg1) {
        this.field1410[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ej.ai(IB)Ljava/lang/String;")
    public String method2601(int arg0) {
        return this.field1410[arg0];
    }

    @ObfuscatedName("ej.az(B)V")
    public void method2630() {
        for (int var1 = 0; var1 < this.field1412.length; var1++) {
            if (!this.field1412[var1]) {
                this.field1416.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1410.length; var2++) {
            this.field1410[var2] = null;
        }
    }

    @ObfuscatedName("ej.ap(ZI)Ltu;")
    public class495 method2603(boolean arg0) {
        return class174.method1076("2", Statics.field2998.field3893, arg0);
    }

    @ObfuscatedName("ej.aa(B)V")
    public void method2604() {
        class495 var1 = this.method2603(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1416.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1412[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class515.method7389((String) var7);
                    }
                    var3++;
                }
            }
            class515 var8 = new class515(var2);
            var8.method8283(2);
            var8.method8345(var3);
            Iterator var9 = this.field1416.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1412[var11]) {
                    var8.method8345(var11);
                    Object var12 = var10.getValue();
                    class503 var13 = class503.method8168(var12.getClass());
                    var8.method8283(var13.field5033);
                    Class var14 = var12.getClass();
                    class503 var15 = class503.method8168(var14);
                    if (var15 == null) {
                        throw new IllegalArgumentException();
                    }
                    class499 var16 = var15.field5035;
                    var16.method8150(var12, var8);
                }
            }
            var1.method8077(var8.field5108, 0, var8.field5111);
        } catch (Exception var29) {
        } finally {
            try {
                var1.method8094();
            } catch (Exception var28) {
            }
        }
        this.field1415 = false;
        this.field1414 = class302.method655();
    }

    @ObfuscatedName("ej.af(I)V")
    public void method2623() {
        class495 var1 = this.method2603(false);
        label218: {
            try {
                byte[] var2 = new byte[(int) var1.method8080()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8081(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class515 var5 = new class515(var2);
                if (var5.field5108.length - var5.field5111 < 1) {
                    return;
                }
                int var7 = var5.method8300();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method8448();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label218;
                            }
                            int var11 = var5.method8448();
                            int var12 = var5.method8300();
                            class503 var13 = (class503) class373.method371(class503.method8172(), var12);
                            Object var14 = var13.method8169(var5);
                            if (var11 >= 0 && var11 < this.field1412.length && this.field1412[var11]) {
                                this.field1416.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method8448();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method8448();
                            int var18 = var5.method8306();
                            if (var17 >= 0 && var17 < this.field1412.length && this.field1412[var17]) {
                                this.field1416.put(var17, var18);
                            }
                        }
                        int var19 = var5.method8448();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label218;
                            }
                            var5.method8448();
                            var5.method8311();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label218;
            } finally {
                try {
                    var1.method8094();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1415 = false;
    }

    @ObfuscatedName("ej.ad(I)V")
    public void method2605() {
        if (this.field1415 && this.field1414 < class302.method655() - 60000L) {
            this.method2604();
        }
    }

    @ObfuscatedName("ej.aq(B)Z")
    public boolean method2607() {
        return this.field1415;
    }
}
