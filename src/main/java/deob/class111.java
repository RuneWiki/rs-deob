package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("eu")
public class class111 {

    @ObfuscatedName("eu.al")
    public boolean[] field1411;

    @ObfuscatedName("eu.ai")
    public Map field1412;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("eu.ar")
    public String[] field1414;

    @ObfuscatedName("eu.as")
    public boolean field1417 = false;

    @ObfuscatedName("eu.aa")
    public long field1415;

    public class111() {
        int var1 = Statics.field95.method6429(19);
        this.field1412 = new HashMap();
        this.field1411 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class180 var3 = class180.method3042(var2);
            this.field1411[var2] = var3.field1892;
        }
        int var4 = 0;
        if (Statics.field95.method6375(15)) {
            var4 = Statics.field95.method6429(15);
        }
        this.field1414 = new String[var4];
        this.method2669();
    }

    @ObfuscatedName("eu.aq(III)V")
    public void method2660(int arg0, int arg1) {
        this.field1412.put(arg0, arg1);
        if (this.field1411[arg0]) {
            this.field1417 = true;
        }
    }

    @ObfuscatedName("eu.aw(IB)I")
    public int method2661(int arg0) {
        Object var2 = this.field1412.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("eu.al(ILjava/lang/String;I)V")
    public void method2662(int arg0, String arg1) {
        this.field1412.put(arg0, arg1);
    }

    @ObfuscatedName("eu.ai(II)Ljava/lang/String;")
    public String method2663(int arg0) {
        Object var2 = this.field1412.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("eu.ar(ILjava/lang/String;B)V")
    public void method2687(int arg0, String arg1) {
        this.field1414[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("eu.as(II)Ljava/lang/String;")
    public String method2683(int arg0) {
        return this.field1414[arg0];
    }

    @ObfuscatedName("eu.aa(I)V")
    public void method2667() {
        for (int var1 = 0; var1 < this.field1411.length; var1++) {
            if (!this.field1411[var1]) {
                this.field1412.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1414.length; var2++) {
            this.field1414[var2] = null;
        }
    }

    @ObfuscatedName("eu.az(ZB)Ltf;")
    public class514 method2666(boolean arg0) {
        return class215.method3279("2", Statics.field152.field3988, arg0);
    }

    @ObfuscatedName("eu.ao(I)V")
    public void method2668() {
        class514 var1 = this.method2666(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1412.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1411[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class534.method3043((String) var7);
                    }
                    var3++;
                }
            }
            class534 var8 = new class534(var2);
            var8.method8574(2);
            var8.method8575(var3);
            Iterator var9 = this.field1412.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1411[var11]) {
                    var8.method8575(var11);
                    Object var12 = var10.getValue();
                    class522 var13 = class522.method8463(var12.getClass());
                    var8.method8574(var13.field5125);
                    class518 var14 = class522.method8454(var12.getClass());
                    var14.method8435(var12, var8);
                }
            }
            var1.method8359(var8.field5199, 0, var8.field5200);
        } catch (Exception var26) {
        } finally {
            try {
                var1.method8360();
            } catch (Exception var25) {
            }
        }
        this.field1417 = false;
        this.field1415 = class318.method2218();
    }

    @ObfuscatedName("eu.au(I)V")
    public void method2669() {
        class514 var1 = this.method2666(false);
        try {
            byte[] var2 = new byte[(int) var1.method8362()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method8363(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class534 var5 = new class534(var2);
            if (var5.field5199.length - var5.field5200 < 1) {
                return;
            }
            int var7 = var5.method8591();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method8593();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method8593();
                    int var12 = var5.method8591();
                    class522 var13 = (class522) class392.method6317(class522.method8464(), var12);
                    Object var14 = var13.method8455(var5);
                    if (var11 >= 0 && var11 < this.field1411.length && this.field1411[var11]) {
                        this.field1412.put(var11, var14);
                    }
                }
            } else {
                int var15 = var5.method8593();
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = var5.method8593();
                    int var18 = var5.method8597();
                    if (var17 >= 0 && var17 < this.field1411.length && this.field1411[var17]) {
                        this.field1412.put(var17, var18);
                    }
                }
                int var19 = var5.method8593();
                for (int var20 = 0; var20 < var19; var20++) {
                    var5.method8593();
                    var5.method8741();
                }
            }
        } catch (Exception var34) {
        } finally {
            try {
                var1.method8360();
            } catch (Exception var33) {
            }
        }
        this.field1417 = false;
    }

    @ObfuscatedName("eu.ak(B)V")
    public void method2670() {
        if (this.field1417 && this.field1415 < class318.method2218() - 60000L) {
            this.method2668();
        }
    }

    @ObfuscatedName("eu.ah(B)Z")
    public boolean method2671() {
        return this.field1417;
    }
}
