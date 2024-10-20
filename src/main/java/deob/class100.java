package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cz")
public class class100 {

    @ObfuscatedName("cz.l")
    public boolean[] field1298;

    @ObfuscatedName("cz.m")
    public Map field1302;

    @ObfuscatedName("cz.z")
    public String[] field1300;

    @ObfuscatedName("cz.q")
    public boolean field1301 = false;

    @ObfuscatedName("cz.k")
    public long field1299;

    public class100() {
        int var1 = Statics.field393.method3963(19);
        this.field1302 = new HashMap();
        this.field1298 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class254 var3 = (class254) class254.field3263.method3155((long) var2);
            class254 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3262.method3905(19, var2);
                class254 var6 = new class254();
                if (var5 != null) {
                    var6.method4143(new class311(var5));
                }
                class254.field3263.method3157(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1298[var2] = var4.field3265;
        }
        int var8 = 0;
        if (Statics.field393.method4018(15)) {
            var8 = Statics.field393.method3963(15);
        }
        this.field1300 = new String[var8];
        this.method2103();
    }

    @ObfuscatedName("cz.f(III)V")
    public void method2065(int arg0, int arg1) {
        this.field1302.put(arg0, arg1);
        if (this.field1298[arg0]) {
            this.field1301 = true;
        }
    }

    @ObfuscatedName("cz.b(IB)I")
    public int method2102(int arg0) {
        Object var2 = this.field1302.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cz.l(ILjava/lang/String;I)V")
    public void method2073(int arg0, String arg1) {
        this.field1302.put(arg0, arg1);
    }

    @ObfuscatedName("cz.m(II)Ljava/lang/String;")
    public String method2091(int arg0) {
        Object var2 = this.field1302.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cz.z(ILjava/lang/String;S)V")
    public void method2069(int arg0, String arg1) {
        this.field1300[arg0] = arg1;
    }

    @ObfuscatedName("cz.q(II)Ljava/lang/String;")
    public String method2070(int arg0) {
        return this.field1300[arg0];
    }

    @ObfuscatedName("cz.k(B)V")
    public void method2071() {
        for (int var1 = 0; var1 < this.field1298.length; var1++) {
            if (!this.field1298[var1]) {
                this.field1302.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1300.length; var2++) {
            this.field1300[var2] = null;
        }
    }

    @ObfuscatedName("cz.c(ZI)Lmr;")
    public class354 method2105(boolean arg0) {
        return class177.method592("2", Statics.field59.field3142, arg0);
    }

    @ObfuscatedName("cz.u(I)V")
    public void method2107() {
        class354 var1 = this.method2105(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1302.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1298[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class311.method3740((String) var7);
                    }
                    var3++;
                }
            }
            class311 var8 = new class311(var2);
            var8.method5203(2);
            var8.method5164(var3);
            Iterator var9 = this.field1302.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6199(var8.field3742, 0, var8.field3741);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1298[var11]);
                var8.method5164(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = class4.method28();
                int var15 = 0;
                class4 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class4 var16 = var14[var15];
                    if (var16.field14 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method5203(var17.field13);
                class4.method42(var12, var8);
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method6181();
            } catch (Exception var29) {
            }
        }
        this.field1301 = false;
        this.field1299 = class308.method4786();
    }

    @ObfuscatedName("cz.t(I)V")
    public void method2103() {
        class354 var1 = this.method2105(false);
        label216: {
            try {
                byte[] var2 = new byte[(int) var1.method6195()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6190(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class311 var5 = new class311(var2);
                if (var5.field3742.length - var5.field3741 < 1) {
                    return;
                }
                int var7 = var5.method5276();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method5163();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label216;
                            }
                            int var11 = var5.method5163();
                            int var12 = var5.method5276();
                            class4 var13 = (class4) class205.method3432(class4.method28(), var12);
                            Object var14 = var13.method32(var5);
                            if (this.field1298[var11]) {
                                this.field1302.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method5163();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method5163();
                            int var18 = var5.method5330();
                            if (this.field1298[var17]) {
                                this.field1302.put(var17, var18);
                            }
                        }
                        int var19 = var5.method5163();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label216;
                            }
                            var5.method5163();
                            var5.method5189();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label216;
            } finally {
                try {
                    var1.method6181();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1301 = false;
    }

    @ObfuscatedName("cz.e(I)V")
    public void method2072() {
        if (this.field1301 && this.field1299 < class308.method4786() - 60000L) {
            this.method2107();
        }
    }

    @ObfuscatedName("cz.o(I)Z")
    public boolean method2076() {
        return this.field1301;
    }
}
