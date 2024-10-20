package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cg")
public class class100 {

    @ObfuscatedName("cg.d")
    public boolean[] field1281;

    @ObfuscatedName("cg.c")
    public Map field1284;

    @ObfuscatedName("cg.y")
    public String[] field1285;

    @ObfuscatedName("cg.h")
    public boolean field1286 = false;

    @ObfuscatedName("cg.z")
    public long field1283;

    public class100() {
        int var1 = Statics.field158.method4008(19);
        this.field1284 = new HashMap();
        this.field1281 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class254 var3 = (class254) class254.field3269.method3220((long) var2);
            class254 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3270.method4032(19, var2);
                class254 var6 = new class254();
                if (var5 != null) {
                    var6.method4199(new class311(var5));
                }
                class254.field3269.method3217(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1281[var2] = var4.field3271;
        }
        int var8 = 0;
        if (Statics.field158.method4087(15)) {
            var8 = Statics.field158.method4008(15);
        }
        this.field1285 = new String[var8];
        this.method2130();
    }

    @ObfuscatedName("cg.n(III)V")
    public void method2131(int arg0, int arg1) {
        this.field1284.put(arg0, arg1);
        if (this.field1281[arg0]) {
            this.field1286 = true;
        }
    }

    @ObfuscatedName("cg.v(II)I")
    public int method2122(int arg0) {
        Object var2 = this.field1284.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cg.d(ILjava/lang/String;I)V")
    public void method2123(int arg0, String arg1) {
        this.field1284.put(arg0, arg1);
    }

    @ObfuscatedName("cg.c(II)Ljava/lang/String;")
    public String method2124(int arg0) {
        Object var2 = this.field1284.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cg.y(ILjava/lang/String;I)V")
    public void method2125(int arg0, String arg1) {
        this.field1285[arg0] = arg1;
    }

    @ObfuscatedName("cg.h(IB)Ljava/lang/String;")
    public String method2126(int arg0) {
        return this.field1285[arg0];
    }

    @ObfuscatedName("cg.z(I)V")
    public void method2127() {
        for (int var1 = 0; var1 < this.field1281.length; var1++) {
            if (!this.field1281[var1]) {
                this.field1284.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1285.length; var2++) {
            this.field1285[var2] = null;
        }
    }

    @ObfuscatedName("cg.e(ZI)Lmc;")
    public class354 method2128(boolean arg0) {
        return class177.method327("2", Statics.field3700.field3155, arg0);
    }

    @ObfuscatedName("cg.q(I)V")
    public void method2129() {
        class354 var1 = this.method2128(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1284.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1281[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class311.method235((String) var7);
                    }
                    var3++;
                }
            }
            class311 var8 = new class311(var2);
            var8.method5279(2);
            var8.method5229(var3);
            Iterator var9 = this.field1284.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6266(var8.field3746, 0, var8.field3747);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1281[var11]);
                var8.method5229(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = new class4[] { class4.field19, class4.field27, class4.field18 };
                class4[] var15 = var14;
                int var16 = 0;
                class4 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class4 var17 = var15[var16];
                    if (var17.field22 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method5279(var18.field23);
                class4.method21(var12, var8);
            }
        } catch (Exception var31) {
        } finally {
            try {
                var1.method6267();
            } catch (Exception var30) {
            }
        }
        this.field1286 = false;
        this.field1283 = class308.method1082();
    }

    @ObfuscatedName("cg.l(I)V")
    public void method2130() {
        class354 var1 = this.method2128(false);
        label204: {
            try {
                byte[] var2 = new byte[(int) var1.method6272()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6269(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class311 var5 = new class311(var2);
                if (var5.field3746.length - var5.field3747 >= 1) {
                    int var7 = var5.method5310();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method5247();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label204;
                            }
                            int var11 = var5.method5247();
                            int var12 = var5.method5310();
                            class4[] var13 = new class4[] { class4.field19, class4.field27, class4.field18 };
                            class4 var14 = (class4) class205.method1123(var13, var12);
                            Object var15 = var14.method23(var5);
                            if (this.field1281[var11]) {
                                this.field1284.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method5247();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method5247();
                            int var19 = var5.method5455();
                            if (this.field1281[var18]) {
                                this.field1284.put(var18, var19);
                            }
                        }
                        int var20 = var5.method5247();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label204;
                            }
                            var5.method5247();
                            var5.method5465();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label204;
            } finally {
                try {
                    var1.method6267();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1286 = false;
    }

    @ObfuscatedName("cg.s(I)V")
    public void method2155() {
        if (this.field1286 && this.field1283 < class308.method1082() - 60000L) {
            this.method2129();
        }
    }

    @ObfuscatedName("cg.b(I)Z")
    public boolean method2132() {
        return this.field1286;
    }
}
