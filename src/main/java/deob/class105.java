package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ep")
public class class105 {

    @ObfuscatedName("ep.aw")
    public boolean[] field1367;

    @ObfuscatedName("ep.ac")
    public Map field1369;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ep.au")
    public String[] field1368;

    @ObfuscatedName("ep.ab")
    public boolean field1371 = false;

    @ObfuscatedName("ep.aq")
    public long field1372;

    public class105() {
        int var1 = Statics.field1064.method6081(19);
        this.field1369 = new HashMap();
        this.field1367 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class184 var3 = (class184) class184.field1939.method5119((long) var2);
            class184 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3366.method6090(19, var2);
                class184 var6 = new class184();
                if (var5 != null) {
                    var6.method3370(new class489(var5));
                }
                class184.field1939.method5121(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1367[var2] = var4.field1940;
        }
        int var8 = 0;
        if (Statics.field1064.method6027(15)) {
            var8 = Statics.field1064.method6081(15);
        }
        this.field1368 = new String[var8];
        this.method2584();
    }

    @ObfuscatedName("ep.af(III)V")
    public void method2599(int arg0, int arg1) {
        this.field1369.put(arg0, arg1);
        if (this.field1367[arg0]) {
            this.field1371 = true;
        }
    }

    @ObfuscatedName("ep.an(II)I")
    public int method2575(int arg0) {
        Object var2 = this.field1369.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ep.aw(ILjava/lang/String;I)V")
    public void method2577(int arg0, String arg1) {
        this.field1369.put(arg0, arg1);
    }

    @ObfuscatedName("ep.ac(II)Ljava/lang/String;")
    public String method2586(int arg0) {
        Object var2 = this.field1369.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ep.au(ILjava/lang/String;I)V")
    public void method2579(int arg0, String arg1) {
        this.field1368[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ep.ab(IB)Ljava/lang/String;")
    public String method2580(int arg0) {
        return this.field1368[arg0];
    }

    @ObfuscatedName("ep.aq(I)V")
    public void method2581() {
        for (int var1 = 0; var1 < this.field1367.length; var1++) {
            if (!this.field1367[var1]) {
                this.field1369.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1368.length; var2++) {
            this.field1368[var2] = null;
        }
    }

    @ObfuscatedName("ep.al(ZB)Lsy;")
    public class471 method2582(boolean arg0) {
        return class170.method4098("2", Statics.field491.field3813, arg0);
    }

    @ObfuscatedName("ep.at(I)V")
    public void method2583() {
        class471 var1 = this.method2582(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1369.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1367[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class489.method2043((String) var7);
                    }
                    var3++;
                }
            }
            class489 var8 = new class489(var2);
            var8.method8285(2);
            var8.method8232(var3);
            Iterator var9 = this.field1369.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1367[var11]) {
                    var8.method8232(var11);
                    Object var12 = var10.getValue();
                    class479 var13 = class479.method8096(var12.getClass());
                    var8.method8285(var13.field4951);
                    class479.method8110(var12, var8);
                }
            }
            var1.method8023(var8.field4991, 0, var8.field4989);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method8005();
            } catch (Exception var24) {
            }
        }
        this.field1371 = false;
        this.field1372 = class294.method2504();
    }

    @ObfuscatedName("ep.aa(B)V")
    public void method2584() {
        class471 var1 = this.method2582(false);
        label235: {
            try {
                byte[] var2 = new byte[(int) var1.method8010()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8011(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class489 var5 = new class489(var2);
                if (var5.field4991.length - var5.field4989 >= 1) {
                    int var7 = var5.method8248();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method8250();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label235;
                                }
                                int var11 = var5.method8250();
                                int var12 = var5.method8248();
                                class479 var13 = (class479) Statics.method3600(class479.method8097(), var12);
                                Object var14 = var13.method8100(var5);
                                if (var11 >= 0 && var11 < this.field1367.length && this.field1367[var11]) {
                                    this.field1369.put(var11, var14);
                                }
                                var10++;
                            }
                        } else {
                            int var15 = var5.method8250();
                            for (int var16 = 0; var16 < var15; var16++) {
                                int var17 = var5.method8250();
                                int var18 = var5.method8254();
                                if (var17 >= 0 && var17 < this.field1367.length && this.field1367[var17]) {
                                    this.field1369.put(var17, var18);
                                }
                            }
                            int var19 = var5.method8250();
                            int var20 = 0;
                            while (true) {
                                if (var20 >= var19) {
                                    break label235;
                                }
                                var5.method8250();
                                var5.method8259();
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
                    var1.method8005();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1371 = false;
    }

    @ObfuscatedName("ep.ay(I)V")
    public void method2608() {
        if (this.field1371 && this.field1372 < class294.method2504() - 60000L) {
            this.method2583();
        }
    }

    @ObfuscatedName("ep.ao(I)Z")
    public boolean method2610() {
        return this.field1371;
    }
}
