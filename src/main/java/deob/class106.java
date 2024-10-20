package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("dn")
public class class106 {

    @ObfuscatedName("dn.v")
    public boolean[] field1405;

    @ObfuscatedName("dn.x")
    public Map field1406;

    /**
     * @deprecated
     */
    @ObfuscatedName("dn.m")
    public String[] field1407;

    @ObfuscatedName("dn.q")
    public boolean field1408 = false;

    @ObfuscatedName("dn.f")
    public long field1409;

    public class106() {
        int var1 = Statics.field2152.method5869(19);
        this.field1406 = new HashMap();
        this.field1405 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class180 var3 = class180.method1131(var2);
            this.field1405[var2] = var3.field1955;
        }
        int var4 = 0;
        if (Statics.field2152.method5834(15)) {
            var4 = Statics.field2152.method5869(15);
        }
        this.field1407 = new String[var4];
        this.method2519();
    }

    @ObfuscatedName("dn.h(III)V")
    public void method2511(int arg0, int arg1) {
        this.field1406.put(arg0, arg1);
        if (this.field1405[arg0]) {
            this.field1408 = true;
        }
    }

    @ObfuscatedName("dn.e(II)I")
    public int method2525(int arg0) {
        Object var2 = this.field1406.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("dn.v(ILjava/lang/String;I)V")
    public void method2512(int arg0, String arg1) {
        this.field1406.put(arg0, arg1);
    }

    @ObfuscatedName("dn.x(IB)Ljava/lang/String;")
    public String method2513(int arg0) {
        Object var2 = this.field1406.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("dn.m(ILjava/lang/String;I)V")
    public void method2514(int arg0, String arg1) {
        this.field1407[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("dn.q(II)Ljava/lang/String;")
    public String method2515(int arg0) {
        return this.field1407[arg0];
    }

    @ObfuscatedName("dn.f(I)V")
    public void method2516() {
        for (int var1 = 0; var1 < this.field1405.length; var1++) {
            if (!this.field1405[var1]) {
                this.field1406.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1407.length; var2++) {
            this.field1407[var2] = null;
        }
    }

    @ObfuscatedName("dn.r(ZB)Lqq;")
    public class449 method2520(boolean arg0) {
        return class166.method2159("2", Statics.field3303.field3800, arg0);
    }

    @ObfuscatedName("dn.u(I)V")
    public void method2518() {
        class449 var1 = this.method2520(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1406.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1405[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class467.method155((String) var7);
                    }
                    var3++;
                }
            }
            class467 var8 = new class467(var2);
            var8.method7789(2);
            var8.method7776(var3);
            Iterator var9 = this.field1406.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1405[var11]) {
                    var8.method7776(var11);
                    Object var12 = var10.getValue();
                    class457 var13 = class457.method7648(var12.getClass());
                    var8.method7789(var13.field4877);
                    class457.method7649(var12, var8);
                }
            }
            var1.method7562(var8.field4917, 0, var8.field4915);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method7563();
            } catch (Exception var24) {
            }
        }
        this.field1408 = false;
        this.field1409 = Statics.method1118();
    }

    @ObfuscatedName("dn.b(I)V")
    public void method2519() {
        class449 var1 = this.method2520(false);
        label215: {
            try {
                byte[] var2 = new byte[(int) var1.method7572()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method7566(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class467 var5 = new class467(var2);
                if (var5.field4917.length - var5.field4915 < 1) {
                    return;
                }
                int var7 = var5.method7792();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method7794();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label215;
                            }
                            int var11 = var5.method7794();
                            int var12 = var5.method7792();
                            class457 var13 = (class457) class347.method1688(class457.method7658(), var12);
                            Object var14 = var13.method7650(var5);
                            if (this.field1405[var11]) {
                                this.field1406.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method7794();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method7794();
                            int var18 = var5.method7946();
                            if (this.field1405[var17]) {
                                this.field1406.put(var17, var18);
                            }
                        }
                        int var19 = var5.method7794();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label215;
                            }
                            var5.method7794();
                            var5.method7801();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label215;
            } finally {
                try {
                    var1.method7563();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1408 = false;
    }

    @ObfuscatedName("dn.j(I)V")
    public void method2532() {
        if (this.field1408 && this.field1409 < Statics.method1118() - 60000L) {
            this.method2518();
        }
    }

    @ObfuscatedName("dn.g(I)Z")
    public boolean method2510() {
        return this.field1408;
    }
}
