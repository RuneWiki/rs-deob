package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("ds")
public class class105 {

    @ObfuscatedName("ds.c")
    public boolean[] field1351;

    @ObfuscatedName("ds.x")
    public Map field1353;

    /**
     * @deprecated
     */
    @ObfuscatedName("ds.h")
    public String[] field1355;

    @ObfuscatedName("ds.j")
    public boolean field1354 = false;

    @ObfuscatedName("ds.y")
    public long field1357;

    public class105() {
        int var1 = Statics.field1743.method5793(19);
        this.field1353 = new HashMap();
        this.field1351 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class179 var3 = (class179) class179.field1898.method4839((long) var2);
            class179 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1897.method5859(19, var2);
                class179 var6 = new class179();
                if (var5 != null) {
                    var6.method3153(new class464(var5));
                }
                class179.field1898.method4834(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1351[var2] = var4.field1899;
        }
        int var8 = 0;
        if (Statics.field1743.method5735(15)) {
            var8 = Statics.field1743.method5793(15);
        }
        this.field1355 = new String[var8];
        this.method2485();
    }

    @ObfuscatedName("ds.a(IIB)V")
    public void method2515(int arg0, int arg1) {
        this.field1353.put(arg0, arg1);
        if (this.field1351[arg0]) {
            this.field1354 = true;
        }
    }

    @ObfuscatedName("ds.f(IB)I")
    public int method2477(int arg0) {
        Object var2 = this.field1353.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ds.c(ILjava/lang/String;I)V")
    public void method2478(int arg0, String arg1) {
        this.field1353.put(arg0, arg1);
    }

    @ObfuscatedName("ds.x(IB)Ljava/lang/String;")
    public String method2479(int arg0) {
        Object var2 = this.field1353.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ds.h(ILjava/lang/String;I)V")
    public void method2480(int arg0, String arg1) {
        this.field1355[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ds.j(II)Ljava/lang/String;")
    public String method2476(int arg0) {
        return this.field1355[arg0];
    }

    @ObfuscatedName("ds.y(B)V")
    public void method2482() {
        for (int var1 = 0; var1 < this.field1351.length; var1++) {
            if (!this.field1351[var1]) {
                this.field1353.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1355.length; var2++) {
            this.field1355[var2] = null;
        }
    }

    @ObfuscatedName("ds.d(ZI)Lqv;")
    public class446 method2483(boolean arg0) {
        return class165.method2975("2", Statics.field4412.field3742, arg0);
    }

    @ObfuscatedName("ds.n(I)V")
    public void method2484() {
        class446 var1 = this.method2483(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1353.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1351[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class464.method2236((String) var7);
                    }
                    var3++;
                }
            }
            class464 var8 = new class464(var2);
            var8.method7698(2);
            var8.method7775(var3);
            Iterator var9 = this.field1353.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1351[var11]) {
                    var8.method7775(var11);
                    Object var12 = var10.getValue();
                    class454 var13 = class454.method7576(var12.getClass());
                    var8.method7698(var13.field4833);
                    class454.method7584(var12, var8);
                }
            }
            var1.method7498(var8.field4867, 0, var8.field4864);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method7502();
            } catch (Exception var24) {
            }
        }
        this.field1354 = false;
        this.field1357 = class280.method2629();
    }

    @ObfuscatedName("ds.r(B)V")
    public void method2485() {
        class446 var1 = this.method2483(false);
        label215: {
            try {
                byte[] var2 = new byte[(int) var1.method7501()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method7497(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class464 var5 = new class464(var2);
                if (var5.field4867.length - var5.field4864 < 1) {
                    return;
                }
                int var7 = var5.method7735();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method7716();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label215;
                            }
                            int var11 = var5.method7716();
                            int var12 = var5.method7735();
                            class454 var13 = (class454) class344.method4292(class454.method7587(), var12);
                            Object var14 = var13.method7577(var5);
                            if (this.field1351[var11]) {
                                this.field1353.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method7716();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method7716();
                            int var18 = var5.method7720();
                            if (this.field1351[var17]) {
                                this.field1353.put(var17, var18);
                            }
                        }
                        int var19 = var5.method7716();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label215;
                            }
                            var5.method7716();
                            var5.method7725();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label215;
            } finally {
                try {
                    var1.method7502();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1354 = false;
    }

    @ObfuscatedName("ds.l(B)V")
    public void method2486() {
        if (this.field1354 && this.field1357 < class280.method2629() - 60000L) {
            this.method2484();
        }
    }

    @ObfuscatedName("ds.s(B)Z")
    public boolean method2488() {
        return this.field1354;
    }
}
