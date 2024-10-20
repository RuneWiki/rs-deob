package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("em")
public class class110 {

    @ObfuscatedName("em.ar")
    public boolean[] field1392;

    @ObfuscatedName("em.ao")
    public Map field1391;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("em.ab")
    public String[] field1389;

    @ObfuscatedName("em.au")
    public boolean field1393 = false;

    @ObfuscatedName("em.aa")
    public long field1394;

    public class110() {
        int var1 = Statics.field3812.method6294(19);
        this.field1391 = new HashMap();
        this.field1392 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class179 var3 = class179.method3036(var2);
            this.field1392[var2] = var3.field1850;
        }
        int var4 = 0;
        if (Statics.field3812.method6243(15)) {
            var4 = Statics.field3812.method6294(15);
        }
        this.field1389 = new String[var4];
        this.method2672();
    }

    @ObfuscatedName("em.at(III)V")
    public void method2666(int arg0, int arg1) {
        this.field1391.put(arg0, arg1);
        if (this.field1392[arg0]) {
            this.field1393 = true;
        }
    }

    @ObfuscatedName("em.ah(II)I")
    public int method2652(int arg0) {
        Object var2 = this.field1391.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("em.ar(ILjava/lang/String;B)V")
    public void method2653(int arg0, String arg1) {
        this.field1391.put(arg0, arg1);
    }

    @ObfuscatedName("em.ao(IB)Ljava/lang/String;")
    public String method2654(int arg0) {
        Object var2 = this.field1391.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("em.ab(ILjava/lang/String;I)V")
    public void method2655(int arg0, String arg1) {
        this.field1389[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("em.au(IB)Ljava/lang/String;")
    public String method2674(int arg0) {
        return this.field1389[arg0];
    }

    @ObfuscatedName("em.aa(I)V")
    public void method2656() {
        for (int var1 = 0; var1 < this.field1392.length; var1++) {
            if (!this.field1392[var1]) {
                this.field1391.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1389.length; var2++) {
            this.field1389[var2] = null;
        }
    }

    @ObfuscatedName("em.ac(ZI)Lto;")
    public class507 method2657(boolean arg0) {
        return class212.method2944("2", Statics.field1402.field3905, arg0);
    }

    @ObfuscatedName("em.al(I)V")
    public void method2662() {
        class507 var1 = this.method2657(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1391.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1392[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class527.method3196((String) var7);
                    }
                    var3++;
                }
            }
            class527 var8 = new class527(var2);
            var8.method8393(2);
            var8.method8394(var3);
            Iterator var9 = this.field1391.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1392[var11]) {
                    var8.method8394(var11);
                    Object var12 = var10.getValue();
                    class515 var13 = class515.method8282(var12.getClass());
                    var8.method8393(var13.field5064);
                    Class var14 = var12.getClass();
                    class515 var15 = class515.method8282(var14);
                    if (var15 == null) {
                        throw new IllegalArgumentException();
                    }
                    class511 var16 = var15.field5063;
                    var16.method8259(var12, var8);
                }
            }
            var1.method8203(var8.field5140, 0, var8.field5137);
        } catch (Exception var29) {
        } finally {
            try {
                var1.method8195();
            } catch (Exception var28) {
            }
        }
        this.field1393 = false;
        this.field1394 = class313.method3460();
    }

    @ObfuscatedName("em.az(B)V")
    public void method2672() {
        class507 var1 = this.method2657(false);
        label235: {
            try {
                byte[] var2 = new byte[(int) var1.method8214()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8198(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class527 var5 = new class527(var2);
                if (var5.field5140.length - var5.field5137 >= 1) {
                    int var7 = var5.method8410();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method8412();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label235;
                                }
                                int var11 = var5.method8412();
                                int var12 = var5.method8410();
                                class515 var13 = (class515) class385.method164(class515.method8280(), var12);
                                Object var14 = var13.method8278(var5);
                                if (var11 >= 0 && var11 < this.field1392.length && this.field1392[var11]) {
                                    this.field1391.put(var11, var14);
                                }
                                var10++;
                            }
                        } else {
                            int var15 = var5.method8412();
                            for (int var16 = 0; var16 < var15; var16++) {
                                int var17 = var5.method8412();
                                int var18 = var5.method8416();
                                if (var17 >= 0 && var17 < this.field1392.length && this.field1392[var17]) {
                                    this.field1391.put(var17, var18);
                                }
                            }
                            int var19 = var5.method8412();
                            int var20 = 0;
                            while (true) {
                                if (var20 >= var19) {
                                    break label235;
                                }
                                var5.method8412();
                                var5.method8535();
                                var20++;
                            }
                        }
                    }
                    return;
                }
            } catch (Exception var34) {
                break label235;
            } finally {
                try {
                    var1.method8195();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1393 = false;
    }

    @ObfuscatedName("em.ap(I)V")
    public void method2677() {
        if (this.field1393 && this.field1394 < class313.method3460() - 60000L) {
            this.method2662();
        }
    }

    @ObfuscatedName("em.av(B)Z")
    public boolean method2661() {
        return this.field1393;
    }
}
