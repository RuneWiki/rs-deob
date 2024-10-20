package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ef")
public class class109 {

    @ObfuscatedName("ef.av")
    public boolean[] field1366;

    @ObfuscatedName("ef.as")
    public Map field1365;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ef.ax")
    public String[] field1368;

    @ObfuscatedName("ef.ap")
    public boolean field1369 = false;

    @ObfuscatedName("ef.ab")
    public long field1373;

    public class109() {
        int var1 = Statics.field1077.method6135(19);
        this.field1365 = new HashMap();
        this.field1366 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class188 var3 = (class188) class188.field1935.method5121((long) var2);
            class188 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1934.method6080(19, var2);
                class188 var6 = new class188();
                if (var5 != null) {
                    var6.method3298(new class501(var5));
                }
                class188.field1935.method5123(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1366[var2] = var4.field1937;
        }
        int var8 = 0;
        if (Statics.field1077.method6042(15)) {
            var8 = Statics.field1077.method6135(15);
        }
        this.field1368 = new String[var8];
        this.method2572();
    }

    @ObfuscatedName("ef.at(III)V")
    public void method2563(int arg0, int arg1) {
        this.field1365.put(arg0, arg1);
        if (this.field1366[arg0]) {
            this.field1369 = true;
        }
    }

    @ObfuscatedName("ef.an(II)I")
    public int method2562(int arg0) {
        Object var2 = this.field1365.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ef.av(ILjava/lang/String;B)V")
    public void method2591(int arg0, String arg1) {
        this.field1365.put(arg0, arg1);
    }

    @ObfuscatedName("ef.as(II)Ljava/lang/String;")
    public String method2588(int arg0) {
        Object var2 = this.field1365.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ef.ax(ILjava/lang/String;I)V")
    public void method2593(int arg0, String arg1) {
        this.field1368[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ef.ap(II)Ljava/lang/String;")
    public String method2568(int arg0) {
        return this.field1368[arg0];
    }

    @ObfuscatedName("ef.ab(I)V")
    public void method2582() {
        for (int var1 = 0; var1 < this.field1366.length; var1++) {
            if (!this.field1366[var1]) {
                this.field1365.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1368.length; var2++) {
            this.field1368[var2] = null;
        }
    }

    @ObfuscatedName("ef.ak(ZB)Lsu;")
    public class483 method2589(boolean arg0) {
        return class173.method7828("2", Statics.field3842.field3854, arg0);
    }

    @ObfuscatedName("ef.ae(I)V")
    public void method2564() {
        class483 var1 = this.method2589(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1365.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1366[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class501.method5933((String) var7);
                    }
                    var3++;
                }
            }
            class501 var8 = new class501(var2);
            var8.method8113(2);
            var8.method8114(var3);
            Iterator var9 = this.field1365.entrySet().iterator();
            label143: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method7916(var8.field5016, 0, var8.field5017);
                        break label143;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1366[var11]);
                var8.method8114(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class491[] var14 = class491.method7989();
                int var15 = 0;
                class491 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class491 var16 = var14[var15];
                    if (var16.field4975 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method8113(var17.field4976);
                class487 var19 = class491.method7987(var12.getClass());
                var19.method7973(var12, var8);
            }
        } catch (Exception var31) {
        } finally {
            try {
                var1.method7922();
            } catch (Exception var30) {
            }
        }
        this.field1369 = false;
        this.field1373 = class301.method4630();
    }

    @ObfuscatedName("ef.af(I)V")
    public void method2572() {
        class483 var1 = this.method2589(false);
        try {
            byte[] var2 = new byte[(int) var1.method7919()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method7920(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class501 var5 = new class501(var2);
            if (var5.field5016.length - var5.field5017 < 1) {
                return;
            }
            int var7 = var5.method8129();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method8195();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method8195();
                    int var12 = var5.method8129();
                    class491 var13 = (class491) class371.method4632(class491.method7989(), var12);
                    Object var14 = var13.method7988(var5);
                    if (var11 >= 0 && var11 < this.field1366.length && this.field1366[var11]) {
                        this.field1365.put(var11, var14);
                    }
                }
            } else {
                int var15 = var5.method8195();
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = var5.method8195();
                    int var18 = var5.method8134();
                    if (var17 >= 0 && var17 < this.field1366.length && this.field1366[var17]) {
                        this.field1365.put(var17, var18);
                    }
                }
                int var19 = var5.method8195();
                for (int var20 = 0; var20 < var19; var20++) {
                    var5.method8195();
                    var5.method8253();
                }
            }
        } catch (Exception var34) {
        } finally {
            try {
                var1.method7922();
            } catch (Exception var33) {
            }
        }
        this.field1369 = false;
    }

    @ObfuscatedName("ef.ao(B)V")
    public void method2567() {
        if (this.field1369 && this.field1373 < class301.method4630() - 60000L) {
            this.method2564();
        }
    }

    @ObfuscatedName("ef.aa(B)Z")
    public boolean method2574() {
        return this.field1369;
    }
}
