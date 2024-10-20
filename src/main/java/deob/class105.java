package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("dw")
public class class105 {

    @ObfuscatedName("dw.v")
    public boolean[] field1375;

    @ObfuscatedName("dw.s")
    public Map field1378;

    /**
     * @deprecated
     */
    @ObfuscatedName("dw.z")
    public String[] field1376;

    @ObfuscatedName("dw.j")
    public boolean field1374 = false;

    @ObfuscatedName("dw.i")
    public long field1373;

    public class105() {
        int var1 = Statics.field4403.method5982(19);
        this.field1378 = new HashMap();
        this.field1375 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class184 var3 = (class184) class184.field1959.method5028((long) var2);
            class184 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1962.method5990(19, var2);
                class184 var6 = new class184();
                if (var5 != null) {
                    var6.method3336(new class474(var5));
                }
                class184.field1959.method5027(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1375[var2] = var4.field1960;
        }
        int var8 = 0;
        if (Statics.field4403.method5937(15)) {
            var8 = Statics.field4403.method5982(15);
        }
        this.field1376 = new String[var8];
        this.method2626();
    }

    @ObfuscatedName("dw.f(III)V")
    public void method2647(int arg0, int arg1) {
        this.field1378.put(arg0, arg1);
        if (this.field1375[arg0]) {
            this.field1374 = true;
        }
    }

    @ObfuscatedName("dw.w(II)I")
    public int method2618(int arg0) {
        Object var2 = this.field1378.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("dw.v(ILjava/lang/String;I)V")
    public void method2619(int arg0, String arg1) {
        this.field1378.put(arg0, arg1);
    }

    @ObfuscatedName("dw.s(IB)Ljava/lang/String;")
    public String method2633(int arg0) {
        Object var2 = this.field1378.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("dw.z(ILjava/lang/String;I)V")
    public void method2621(int arg0, String arg1) {
        this.field1376[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("dw.j(II)Ljava/lang/String;")
    public String method2622(int arg0) {
        return this.field1376[arg0];
    }

    @ObfuscatedName("dw.i(I)V")
    public void method2623() {
        for (int var1 = 0; var1 < this.field1375.length; var1++) {
            if (!this.field1375[var1]) {
                this.field1378.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1376.length; var2++) {
            this.field1376[var2] = null;
        }
    }

    @ObfuscatedName("dw.n(ZI)Lqr;")
    public class456 method2616(boolean arg0) {
        return class170.method2735("2", Statics.field1607.field3816, arg0);
    }

    @ObfuscatedName("dw.l(B)V")
    public void method2631() {
        class456 var1 = this.method2616(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1378.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1375[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class474.method2557((String) var7);
                    }
                    var3++;
                }
            }
            class474 var8 = new class474(var2);
            var8.method7947(2);
            var8.method7950(var3);
            Iterator var9 = this.field1378.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1375[var11]) {
                    var8.method7950(var11);
                    Object var12 = var10.getValue();
                    class464 var13 = class464.method7837(var12.getClass());
                    var8.method7947(var13.field4897);
                    Class var14 = var12.getClass();
                    class464 var15 = class464.method7837(var14);
                    if (var15 == null) {
                        throw new IllegalArgumentException();
                    }
                    class460 var16 = var15.field4901;
                    var16.method7819(var12, var8);
                }
            }
            var1.method7734(var8.field4936, 0, var8.field4939);
        } catch (Exception var29) {
        } finally {
            try {
                var1.method7735();
            } catch (Exception var28) {
            }
        }
        this.field1374 = false;
        this.field1373 = class287.method3099();
    }

    @ObfuscatedName("dw.k(I)V")
    public void method2626() {
        class456 var1 = this.method2616(false);
        label202: {
            try {
                byte[] var2 = new byte[(int) var1.method7739()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method7738(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class474 var5 = new class474(var2);
                if (var5.field4936.length - var5.field4939 < 1) {
                    return;
                }
                int var7 = var5.method7964();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method8032();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label202;
                            }
                            int var11 = var5.method8032();
                            int var12 = var5.method7964();
                            class464 var13 = (class464) class351.method19(class464.method7831(), var12);
                            Object var14 = var13.method7833(var5);
                            if (this.field1375[var11]) {
                                this.field1378.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method8032();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method8032();
                            int var18 = var5.method7979();
                            if (this.field1375[var17]) {
                                this.field1378.put(var17, var18);
                            }
                        }
                        int var19 = var5.method8032();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label202;
                            }
                            var5.method8032();
                            var5.method7983();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label202;
            } finally {
                try {
                    var1.method7735();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1374 = false;
    }

    @ObfuscatedName("dw.c(I)V")
    public void method2639() {
        if (this.field1374 && this.field1373 < class287.method3099() - 60000L) {
            this.method2631();
        }
    }

    @ObfuscatedName("dw.r(B)Z")
    public boolean method2641() {
        return this.field1374;
    }
}
