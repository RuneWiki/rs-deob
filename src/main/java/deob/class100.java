package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cg")
public class class100 {

    @ObfuscatedName("cg.x")
    public boolean[] field1273;

    @ObfuscatedName("cg.w")
    public Map field1274;

    @ObfuscatedName("cg.t")
    public String[] field1282;

    @ObfuscatedName("cg.j")
    public boolean field1276 = false;

    @ObfuscatedName("cg.n")
    public long field1277;

    public class100() {
        int var1 = Statics.field1311.method3846(19);
        this.field1274 = new HashMap();
        this.field1273 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class254 var3 = class254.method2613(var2);
            this.field1273[var2] = var3.field3269;
        }
        int var4 = 0;
        if (Statics.field1311.method3944(15)) {
            var4 = Statics.field1311.method3846(15);
        }
        this.field1282 = new String[var4];
        this.method2071();
    }

    @ObfuscatedName("cg.h(III)V")
    public void method2065(int arg0, int arg1) {
        this.field1274.put(arg0, arg1);
        if (this.field1273[arg0]) {
            this.field1276 = true;
        }
    }

    @ObfuscatedName("cg.v(II)I")
    public int method2063(int arg0) {
        Object var2 = this.field1274.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cg.x(ILjava/lang/String;I)V")
    public void method2064(int arg0, String arg1) {
        this.field1274.put(arg0, arg1);
    }

    @ObfuscatedName("cg.w(IB)Ljava/lang/String;")
    public String method2068(int arg0) {
        Object var2 = this.field1274.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cg.t(ILjava/lang/String;B)V")
    public void method2066(int arg0, String arg1) {
        this.field1282[arg0] = arg1;
    }

    @ObfuscatedName("cg.j(II)Ljava/lang/String;")
    public String method2067(int arg0) {
        return this.field1282[arg0];
    }

    @ObfuscatedName("cg.n(I)V")
    public void method2092() {
        for (int var1 = 0; var1 < this.field1273.length; var1++) {
            if (!this.field1273[var1]) {
                this.field1274.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1282.length; var2++) {
            this.field1282[var2] = null;
        }
    }

    @ObfuscatedName("cg.p(ZB)Lmy;")
    public class354 method2069(boolean arg0) {
        return Statics.method529("2", Statics.field1175.field3142, arg0);
    }

    @ObfuscatedName("cg.l(I)V")
    public void method2070() {
        class354 var1 = this.method2069(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1274.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1273[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class311.method2704((String) var7);
                    }
                    var3++;
                }
            }
            class311 var8 = new class311(var2);
            var8.method5095(2);
            var8.method5099(var3);
            Iterator var9 = this.field1274.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6131(var8.field3753, 0, var8.field3752);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1273[var11]);
                var8.method5099(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = new class4[] { class4.field14, class4.field13, class4.field9 };
                class4[] var15 = var14;
                int var16 = 0;
                class4 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class4 var17 = var15[var16];
                    if (var17.field7 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method5095(var18.field11);
                class4.method16(var12, var8);
            }
        } catch (Exception var31) {
        } finally {
            try {
                var1.method6135();
            } catch (Exception var30) {
            }
        }
        this.field1276 = false;
        this.field1277 = class308.method4891();
    }

    @ObfuscatedName("cg.z(B)V")
    public void method2071() {
        class354 var1 = this.method2069(false);
        label216: {
            try {
                byte[] var2 = new byte[(int) var1.method6134()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6133(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class311 var5 = new class311(var2);
                if (var5.field3753.length - var5.field3752 < 1) {
                    return;
                }
                int var7 = var5.method5274();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method5342();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label216;
                            }
                            int var11 = var5.method5342();
                            int var12 = var5.method5274();
                            class4[] var13 = new class4[] { class4.field14, class4.field13, class4.field9 };
                            class4 var14 = (class4) class205.method3134(var13, var12);
                            Object var15 = var14.method19(var5);
                            if (this.field1273[var11]) {
                                this.field1274.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method5342();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method5342();
                            int var19 = var5.method5120();
                            if (this.field1273[var18]) {
                                this.field1274.put(var18, var19);
                            }
                        }
                        int var20 = var5.method5342();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label216;
                            }
                            var5.method5342();
                            var5.method5202();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label216;
            } finally {
                try {
                    var1.method6135();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1276 = false;
    }

    @ObfuscatedName("cg.u(I)V")
    public void method2072() {
        if (this.field1276 && this.field1277 < class308.method4891() - 60000L) {
            this.method2070();
        }
    }

    @ObfuscatedName("cg.e(I)Z")
    public boolean method2062() {
        return this.field1276;
    }
}
