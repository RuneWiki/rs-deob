package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ek")
public class class112 {

    @ObfuscatedName("ek.ak")
    public boolean[] field1411;

    @ObfuscatedName("ek.ax")
    public Map field1408;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ek.ao")
    public String[] field1410;

    @ObfuscatedName("ek.ah")
    public boolean field1412 = false;

    @ObfuscatedName("ek.ar")
    public long field1409;

    public class112() {
        int var1 = Statics.field321.method6273(19);
        this.field1408 = new HashMap();
        this.field1411 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class196 var3 = class196.method1733(var2);
            this.field1411[var2] = var3.field1959;
        }
        int var4 = 0;
        if (Statics.field321.method6228(15)) {
            var4 = Statics.field321.method6273(15);
        }
        this.field1410 = new String[var4];
        this.method2632();
    }

    @ObfuscatedName("ek.ac(III)V")
    public void method2655(int arg0, int arg1) {
        this.field1408.put(arg0, arg1);
        if (this.field1411[arg0]) {
            this.field1412 = true;
        }
    }

    @ObfuscatedName("ek.al(IB)I")
    public int method2622(int arg0) {
        Object var2 = this.field1408.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ek.ak(ILjava/lang/String;I)V")
    public void method2625(int arg0, String arg1) {
        this.field1408.put(arg0, arg1);
    }

    @ObfuscatedName("ek.ax(II)Ljava/lang/String;")
    public String method2626(int arg0) {
        Object var2 = this.field1408.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ek.ao(ILjava/lang/String;I)V")
    public void method2627(int arg0, String arg1) {
        this.field1410[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ek.ah(IB)Ljava/lang/String;")
    public String method2628(int arg0) {
        return this.field1410[arg0];
    }

    @ObfuscatedName("ek.ar(B)V")
    public void method2635() {
        for (int var1 = 0; var1 < this.field1411.length; var1++) {
            if (!this.field1411[var1]) {
                this.field1408.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1410.length; var2++) {
            this.field1410[var2] = null;
        }
    }

    @ObfuscatedName("ek.ab(ZI)Lto;")
    public class510 method2630(boolean arg0) {
        return class176.method194("2", Statics.field1437.field3920, arg0);
    }

    @ObfuscatedName("ek.am(I)V")
    public void method2631() {
        class510 var1 = this.method2630(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1408.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1411[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class530.method7740((String) var7);
                    }
                    var3++;
                }
            }
            class530 var8 = new class530(var2);
            var8.method8348(2);
            var8.method8349(var3);
            Iterator var9 = this.field1408.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1411[var11]) {
                    var8.method8349(var11);
                    Object var12 = var10.getValue();
                    class518 var13 = class518.method8207(var12.getClass());
                    var8.method8348(var13.field5070);
                    Class var14 = var12.getClass();
                    class518 var15 = class518.method8207(var14);
                    if (var15 == null) {
                        throw new IllegalArgumentException();
                    }
                    class514 var16 = var15.field5072;
                    var16.method8191(var12, var8);
                }
            }
            var1.method8122(var8.field5139, 0, var8.field5140);
        } catch (Exception var29) {
        } finally {
            try {
                var1.method8123();
            } catch (Exception var28) {
            }
        }
        this.field1412 = false;
        this.field1409 = class316.method6401();
    }

    @ObfuscatedName("ek.av(I)V")
    public void method2632() {
        class510 var1 = this.method2630(false);
        try {
            byte[] var2 = new byte[(int) var1.method8125()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method8147(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class530 var5 = new class530(var2);
            if (var5.field5139.length - var5.field5140 < 1) {
                return;
            }
            int var7 = var5.method8365();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method8598();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method8598();
                    int var12 = var5.method8365();
                    class518 var13 = (class518) class388.method3894(class518.method8221(), var12);
                    Object var14 = var13.method8209(var5);
                    if (var11 >= 0 && var11 < this.field1411.length && this.field1411[var11]) {
                        this.field1408.put(var11, var14);
                    }
                }
            } else {
                int var15 = var5.method8598();
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = var5.method8598();
                    int var18 = var5.method8371();
                    if (var17 >= 0 && var17 < this.field1411.length && this.field1411[var17]) {
                        this.field1408.put(var17, var18);
                    }
                }
                int var19 = var5.method8598();
                for (int var20 = 0; var20 < var19; var20++) {
                    var5.method8598();
                    var5.method8588();
                }
            }
        } catch (Exception var34) {
        } finally {
            try {
                var1.method8123();
            } catch (Exception var33) {
            }
        }
        this.field1412 = false;
    }

    @ObfuscatedName("ek.ag(I)V")
    public void method2643() {
        if (this.field1412 && this.field1409 < class316.method6401() - 60000L) {
            this.method2631();
        }
    }

    @ObfuscatedName("ek.aa(I)Z")
    public boolean method2634() {
        return this.field1412;
    }
}
