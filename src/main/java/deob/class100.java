package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cy")
public class class100 {

    @ObfuscatedName("cy.q")
    public boolean[] field1294;

    @ObfuscatedName("cy.j")
    public Map field1295;

    @ObfuscatedName("cy.p")
    public String[] field1296;

    @ObfuscatedName("cy.g")
    public boolean field1297 = false;

    @ObfuscatedName("cy.n")
    public long field1292;

    public class100() {
        int var1 = Statics.field2091.method3903(19);
        this.field1295 = new HashMap();
        this.field1294 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class253 var3 = (class253) class253.field3263.method3127((long) var2);
            class253 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3264.method3891(19, var2);
                class253 var6 = new class253();
                if (var5 != null) {
                    var6.method4142(new class310(var5));
                }
                class253.field3263.method3137(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1294[var2] = var4.field3265;
        }
        int var8 = 0;
        if (Statics.field2091.method4029(15)) {
            var8 = Statics.field2091.method3903(15);
        }
        this.field1296 = new String[var8];
        this.method2097();
    }

    @ObfuscatedName("cy.m(III)V")
    public void method2070(int arg0, int arg1) {
        this.field1295.put(arg0, arg1);
        if (this.field1294[arg0]) {
            this.field1297 = true;
        }
    }

    @ObfuscatedName("cy.o(IB)I")
    public int method2071(int arg0) {
        Object var2 = this.field1295.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cy.q(ILjava/lang/String;I)V")
    public void method2096(int arg0, String arg1) {
        this.field1295.put(arg0, arg1);
    }

    @ObfuscatedName("cy.j(II)Ljava/lang/String;")
    public String method2073(int arg0) {
        Object var2 = this.field1295.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cy.p(ILjava/lang/String;B)V")
    public void method2079(int arg0, String arg1) {
        this.field1296[arg0] = arg1;
    }

    @ObfuscatedName("cy.g(II)Ljava/lang/String;")
    public String method2105(int arg0) {
        return this.field1296[arg0];
    }

    @ObfuscatedName("cy.n(I)V")
    public void method2075() {
        for (int var1 = 0; var1 < this.field1294.length; var1++) {
            if (!this.field1294[var1]) {
                this.field1295.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1296.length; var2++) {
            this.field1296[var2] = null;
        }
    }

    @ObfuscatedName("cy.u(ZI)Lmy;")
    public class353 method2074(boolean arg0) {
        return class177.method958("2", Statics.field55.field3146, arg0);
    }

    @ObfuscatedName("cy.a(I)V")
    public void method2077() {
        class353 var1 = this.method2074(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1295.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1294[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += Statics.method2147((String) var7);
                    }
                    var3++;
                }
            }
            class310 var8 = new class310(var2);
            var8.method5437(2);
            var8.method5387(var3);
            Iterator var9 = this.field1295.entrySet().iterator();
            label175: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6223(var8.field3736, 0, var8.field3734);
                        break label175;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1294[var11]);
                var8.method5387(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = new class4[] { class4.field10, class4.field9, class4.field11 };
                class4[] var15 = var14;
                int var16 = 0;
                class4 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class4 var17 = var15[var16];
                    if (var17.field13 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method5437(var18.field16);
                Class var20 = var12.getClass();
                class4[] var21 = new class4[] { class4.field10, class4.field9, class4.field11 };
                class4[] var22 = var21;
                int var23 = 0;
                class4 var25;
                while (true) {
                    if (var23 >= var22.length) {
                        var25 = null;
                        break;
                    }
                    class4 var24 = var22[var23];
                    if (var24.field13 == var20) {
                        var25 = var24;
                        break;
                    }
                    var23++;
                }
                if (var25 == null) {
                    throw new IllegalArgumentException();
                }
                class1 var27 = var25.field14;
                var27.method1(var12, var8);
            }
        } catch (Exception var40) {
        } finally {
            try {
                var1.method6232();
            } catch (Exception var39) {
            }
        }
        this.field1297 = false;
        this.field1292 = class307.method3253();
    }

    @ObfuscatedName("cy.z(B)V")
    public void method2097() {
        class353 var1 = this.method2074(false);
        label216: {
            try {
                byte[] var2 = new byte[(int) var1.method6227()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6228(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class310 var5 = new class310(var2);
                if (var5.field3736.length - var5.field3734 < 1) {
                    return;
                }
                int var7 = var5.method5227();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method5283();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label216;
                            }
                            int var11 = var5.method5283();
                            int var12 = var5.method5227();
                            class4[] var13 = new class4[] { class4.field10, class4.field9, class4.field11 };
                            class4 var14 = (class4) class205.method3095(var13, var12);
                            Object var15 = var14.method27(var5);
                            if (this.field1294[var11]) {
                                this.field1295.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method5283();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method5283();
                            int var19 = var5.method5209();
                            if (this.field1294[var18]) {
                                this.field1295.put(var18, var19);
                            }
                        }
                        int var20 = var5.method5283();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label216;
                            }
                            var5.method5283();
                            var5.method5236();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label216;
            } finally {
                try {
                    var1.method6232();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1297 = false;
    }

    @ObfuscatedName("cy.w(I)V")
    public void method2102() {
        if (this.field1297 && this.field1292 < class307.method3253() - 60000L) {
            this.method2077();
        }
    }

    @ObfuscatedName("cy.y(B)Z")
    public boolean method2080() {
        return this.field1297;
    }
}
