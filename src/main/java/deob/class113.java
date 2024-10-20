package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ef")
public class class113 {

    @ObfuscatedName("ef.aj")
    public boolean[] field1454;

    @ObfuscatedName("ef.az")
    public Map field1452;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ef.af")
    public String[] field1450;

    @ObfuscatedName("ef.aa")
    public boolean field1447 = false;

    @ObfuscatedName("ef.at")
    public long field1449;

    public class113() {
        int var1 = Statics.field2840.method6591(19);
        this.field1452 = new HashMap();
        this.field1454 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class200 var3 = class200.method3055(var2);
            this.field1454[var2] = var3.field2041;
        }
        int var4 = 0;
        if (Statics.field2840.method6522(15)) {
            var4 = Statics.field2840.method6591(15);
        }
        this.field1450 = new String[var4];
        this.method2681();
    }

    @ObfuscatedName("ef.ak(IIB)V")
    public void method2672(int arg0, int arg1) {
        this.field1452.put(arg0, arg1);
        if (this.field1454[arg0]) {
            this.field1447 = true;
        }
    }

    @ObfuscatedName("ef.al(II)I")
    public int method2671(int arg0) {
        Object var2 = this.field1452.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ef.aj(ILjava/lang/String;I)V")
    public void method2686(int arg0, String arg1) {
        this.field1452.put(arg0, arg1);
    }

    @ObfuscatedName("ef.az(II)Ljava/lang/String;")
    public String method2712(int arg0) {
        Object var2 = this.field1452.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ef.af(ILjava/lang/String;I)V")
    public void method2673(int arg0, String arg1) {
        this.field1450[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ef.aa(II)Ljava/lang/String;")
    public String method2677(int arg0) {
        return this.field1450[arg0];
    }

    @ObfuscatedName("ef.at(I)V")
    public void method2678() {
        for (int var1 = 0; var1 < this.field1454.length; var1++) {
            if (!this.field1454[var1]) {
                this.field1452.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1450.length; var2++) {
            this.field1450[var2] = null;
        }
    }

    @ObfuscatedName("ef.ab(ZB)Lue;")
    public class526 method2675(boolean arg0) {
        return class179.method2825("2", Statics.field1432.field4062, arg0);
    }

    @ObfuscatedName("ef.ac(I)V")
    public void method2679() {
        class526 var1 = this.method2675(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1452.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1454[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class546.method7454((String) var7);
                    }
                    var3++;
                }
            }
            class546 var8 = new class546(var2);
            var8.method8779(2);
            var8.method8780(var3);
            Iterator var9 = this.field1452.entrySet().iterator();
            label175: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method8562(var8.field5346, 0, var8.field5344);
                        break label175;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1454[var11]);
                var8.method8780(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class534[] var14 = class534.method8663();
                int var15 = 0;
                class534 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class534 var16 = var14[var15];
                    if (var16.field5269 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method8779(var17.field5272);
                Class var19 = var12.getClass();
                class534[] var20 = class534.method8663();
                int var21 = 0;
                class534 var23;
                while (true) {
                    if (var21 >= var20.length) {
                        var23 = null;
                        break;
                    }
                    class534 var22 = var20[var21];
                    if (var22.field5269 == var19) {
                        var23 = var22;
                        break;
                    }
                    var21++;
                }
                if (var23 == null) {
                    throw new IllegalArgumentException();
                }
                class530 var25 = var23.field5270;
                var25.method8641(var12, var8);
            }
        } catch (Exception var38) {
        } finally {
            try {
                var1.method8566();
            } catch (Exception var37) {
            }
        }
        this.field1447 = false;
        this.field1449 = class326.method2895();
    }

    @ObfuscatedName("ef.ao(B)V")
    public void method2681() {
        class526 var1 = this.method2675(false);
        label219: {
            try {
                byte[] var2 = new byte[(int) var1.method8568()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8576(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class546 var5 = new class546(var2);
                if (var5.field5346.length - var5.field5344 < 1) {
                    return;
                }
                int var7 = var5.method8796();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method8798();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label219;
                            }
                            int var11 = var5.method8798();
                            int var12 = var5.method8796();
                            class534 var13 = (class534) class401.method2027(class534.method8663(), var12);
                            Object var14 = var13.method8659(var5);
                            if (var11 >= 0 && var11 < this.field1454.length && this.field1454[var11]) {
                                this.field1452.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method8798();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method8798();
                            int var18 = var5.method8801();
                            if (var17 >= 0 && var17 < this.field1454.length && this.field1454[var17]) {
                                this.field1452.put(var17, var18);
                            }
                        }
                        int var19 = var5.method8798();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label219;
                            }
                            var5.method8798();
                            var5.method8806();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label219;
            } finally {
                try {
                    var1.method8566();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1447 = false;
    }

    @ObfuscatedName("ef.ah(I)V")
    public void method2697() {
        if (this.field1447 && this.field1449 < class326.method2895() - 60000L) {
            this.method2679();
        }
    }

    @ObfuscatedName("ef.av(I)Z")
    public boolean method2706() {
        return this.field1447;
    }
}
