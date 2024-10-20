package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ee")
public class class107 {

    @ObfuscatedName("ee.ac")
    public boolean[] field1364;

    @ObfuscatedName("ee.ab")
    public Map field1363;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ee.an")
    public String[] field1366;

    @ObfuscatedName("ee.ao")
    public boolean field1368 = false;

    @ObfuscatedName("ee.av")
    public long field1365;

    public class107() {
        int var1 = Statics.field2984.method5934(19);
        this.field1363 = new HashMap();
        this.field1364 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class186 var3 = (class186) class186.field1925.method4921((long) var2);
            class186 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1924.method5860(19, var2);
                class186 var6 = new class186();
                if (var5 != null) {
                    var6.method3274(new class478(var5));
                }
                class186.field1925.method4923(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1364[var2] = var4.field1926;
        }
        int var8 = 0;
        if (Statics.field2984.method5820(15)) {
            var8 = Statics.field2984.method5934(15);
        }
        this.field1366 = new String[var8];
        this.method2572();
    }

    @ObfuscatedName("ee.aj(III)V")
    public void method2589(int arg0, int arg1) {
        this.field1363.put(arg0, arg1);
        if (this.field1364[arg0]) {
            this.field1368 = true;
        }
    }

    @ObfuscatedName("ee.al(IS)I")
    public int method2564(int arg0) {
        Object var2 = this.field1363.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ee.ac(ILjava/lang/String;I)V")
    public void method2585(int arg0, String arg1) {
        this.field1363.put(arg0, arg1);
    }

    @ObfuscatedName("ee.ab(II)Ljava/lang/String;")
    public String method2566(int arg0) {
        Object var2 = this.field1363.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ee.an(ILjava/lang/String;B)V")
    public void method2579(int arg0, String arg1) {
        this.field1366[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ee.ao(II)Ljava/lang/String;")
    public String method2568(int arg0) {
        return this.field1366[arg0];
    }

    @ObfuscatedName("ee.av(I)V")
    public void method2569() {
        for (int var1 = 0; var1 < this.field1364.length; var1++) {
            if (!this.field1364[var1]) {
                this.field1363.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1366.length; var2++) {
            this.field1366[var2] = null;
        }
    }

    @ObfuscatedName("ee.aq(ZB)Lre;")
    public class460 method2570(boolean arg0) {
        return class171.method6049("2", Statics.field4871.field3787, arg0);
    }

    @ObfuscatedName("ee.ap(I)V")
    public void method2571() {
        class460 var1 = this.method2570(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1363.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1364[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class478.method4789((String) var7);
                    }
                    var3++;
                }
            }
            class478 var8 = new class478(var2);
            var8.method7886(2);
            var8.method7887(var3);
            Iterator var9 = this.field1363.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1364[var11]) {
                    var8.method7887(var11);
                    Object var12 = var10.getValue();
                    class468 var13 = class468.method7762(var12.getClass());
                    var8.method7886(var13.field4863);
                    class468.method7764(var12, var8);
                }
            }
            var1.method7662(var8.field4906, 0, var8.field4904);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method7678();
            } catch (Exception var24) {
            }
        }
        this.field1368 = false;
        this.field1365 = class290.method4466();
    }

    @ObfuscatedName("ee.ar(I)V")
    public void method2572() {
        class460 var1 = this.method2570(false);
        label217: {
            try {
                byte[] var2 = new byte[(int) var1.method7658()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method7660(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class478 var5 = new class478(var2);
                if (var5.field4906.length - var5.field4904 >= 1) {
                    int var7 = var5.method7909();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method7905();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label217;
                                }
                                int var11 = var5.method7905();
                                int var12 = var5.method7909();
                                class468 var13 = (class468) class354.method5197(class468.method7769(), var12);
                                Object var14 = var13.method7756(var5);
                                if (this.field1364[var11]) {
                                    this.field1363.put(var11, var14);
                                }
                                var10++;
                            }
                        } else {
                            int var15 = var5.method7905();
                            for (int var16 = 0; var16 < var15; var16++) {
                                int var17 = var5.method7905();
                                int var18 = var5.method7908();
                                if (this.field1364[var17]) {
                                    this.field1363.put(var17, var18);
                                }
                            }
                            int var19 = var5.method7905();
                            int var20 = 0;
                            while (true) {
                                if (var20 >= var19) {
                                    break label217;
                                }
                                var5.method7905();
                                var5.method7950();
                                var20++;
                            }
                        }
                    }
                    return;
                }
            } catch (Exception var34) {
                break label217;
            } finally {
                try {
                    var1.method7678();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1368 = false;
    }

    @ObfuscatedName("ee.ak(I)V")
    public void method2573() {
        if (this.field1368 && this.field1365 < class290.method4466() - 60000L) {
            this.method2571();
        }
    }

    @ObfuscatedName("ee.ax(B)Z")
    public boolean method2565() {
        return this.field1368;
    }
}
