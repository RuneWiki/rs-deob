package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("em")
public class class115 {

    @ObfuscatedName("em.ak")
    public boolean[] field1455;

    @ObfuscatedName("em.aj")
    public Map field1456;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("em.ai")
    public String[] field1457;

    @ObfuscatedName("em.ay")
    public boolean field1458 = false;

    @ObfuscatedName("em.as")
    public long field1459;

    public class115() {
        int var1 = Statics.field406.method7004(19);
        this.field1456 = new HashMap();
        this.field1455 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class185 var3 = (class185) class185.field1934.method5928((long) var2);
            class185 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1933.method7009(19, var2);
                class185 var6 = new class185();
                if (var5 != null) {
                    var6.method3647(new class558(var5));
                }
                class185.field1934.method5931(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1455[var2] = var4.field1935;
        }
        int var8 = 0;
        if (Statics.field406.method6972(15)) {
            var8 = Statics.field406.method7004(15);
        }
        this.field1457 = new String[var8];
        this.method3011();
    }

    @ObfuscatedName("em.ap(III)V")
    public void method3013(int arg0, int arg1) {
        this.field1456.put(arg0, arg1);
        if (this.field1455[arg0]) {
            this.field1458 = true;
        }
    }

    @ObfuscatedName("em.aw(II)I")
    public int method3005(int arg0) {
        Object var2 = this.field1456.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("em.ak(ILjava/lang/String;I)V")
    public void method3022(int arg0, String arg1) {
        this.field1456.put(arg0, arg1);
    }

    @ObfuscatedName("em.aj(II)Ljava/lang/String;")
    public String method3006(int arg0) {
        Object var2 = this.field1456.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("em.ai(ILjava/lang/String;I)V")
    public void method2989(int arg0, String arg1) {
        this.field1457[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("em.ay(II)Ljava/lang/String;")
    public String method2987(int arg0) {
        return this.field1457[arg0];
    }

    @ObfuscatedName("em.as(I)V")
    public void method2991() {
        for (int var1 = 0; var1 < this.field1455.length; var1++) {
            if (!this.field1455[var1]) {
                this.field1456.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1457.length; var2++) {
            this.field1457[var2] = null;
        }
    }

    @ObfuscatedName("em.ae(ZI)Lun;")
    public class537 method2992(boolean arg0) {
        return class221.method8260("2", Statics.field3157.field4131, arg0);
    }

    @ObfuscatedName("em.am(I)V")
    public void method2990() {
        class537 var1 = this.method2992(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1456.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1455[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class558.method1876((String) var7);
                    }
                    var3++;
                }
            }
            class558 var8 = new class558(var2);
            var8.method9241(2);
            var8.method9257(var3);
            Iterator var9 = this.field1456.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1455[var11]) {
                    var8.method9257(var11);
                    Object var12 = var10.getValue();
                    class545 var13 = class545.method9106(var12.getClass());
                    var8.method9241(var13.field5384);
                    class545.method9109(var12, var8);
                }
            }
            var1.method9029(var8.field5463, 0, var8.field5462);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method9027();
            } catch (Exception var24) {
            }
        }
        this.field1458 = false;
        this.field1459 = class330.method2257();
    }

    @ObfuscatedName("em.at(I)V")
    public void method3011() {
        class537 var1 = this.method2992(false);
        try {
            byte[] var2 = new byte[(int) var1.method9031()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method9032(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class558 var5 = new class558(var2);
            if (var5.field5463.length - var5.field5462 < 1) {
                return;
            }
            int var7 = var5.method9258();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method9260();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method9260();
                    int var12 = var5.method9258();
                    class545 var13 = (class545) class406.method3580(class545.method9116(), var12);
                    Object var14 = var13.method9112(var5);
                    if (var11 >= 0 && var11 < this.field1455.length && this.field1455[var11]) {
                        this.field1456.put(var11, var14);
                    }
                }
            } else {
                int var15 = var5.method9260();
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = var5.method9260();
                    int var18 = var5.method9264();
                    if (var17 >= 0 && var17 < this.field1455.length && this.field1455[var17]) {
                        this.field1456.put(var17, var18);
                    }
                }
                int var19 = var5.method9260();
                for (int var20 = 0; var20 < var19; var20++) {
                    var5.method9260();
                    var5.method9269();
                }
            }
        } catch (Exception var34) {
        } finally {
            try {
                var1.method9027();
            } catch (Exception var33) {
            }
        }
        this.field1458 = false;
    }

    @ObfuscatedName("em.au(I)V")
    public void method2988() {
        if (this.field1458 && this.field1459 < class330.method2257() - 60000L) {
            this.method2990();
        }
    }

    @ObfuscatedName("em.an(I)Z")
    public boolean method2996() {
        return this.field1458;
    }
}
