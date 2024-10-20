package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ew")
public class class110 {

    @ObfuscatedName("ew.ar")
    public boolean[] field1398;

    @ObfuscatedName("ew.am")
    public Map field1397;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ew.as")
    public String[] field1400;

    @ObfuscatedName("ew.aj")
    public boolean field1396 = false;

    @ObfuscatedName("ew.ag")
    public long field1402;

    public class110() {
        int var1 = Statics.field2052.method6127(19);
        this.field1397 = new HashMap();
        this.field1398 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class189 var3 = class189.method2891(var2);
            this.field1398[var2] = var3.field1937;
        }
        int var4 = 0;
        if (Statics.field2052.method6104(15)) {
            var4 = Statics.field2052.method6127(15);
        }
        this.field1400 = new String[var4];
        this.method2588();
    }

    @ObfuscatedName("ew.aw(III)V")
    public void method2610(int arg0, int arg1) {
        this.field1397.put(arg0, arg1);
        if (this.field1398[arg0]) {
            this.field1396 = true;
        }
    }

    @ObfuscatedName("ew.ay(II)I")
    public int method2602(int arg0) {
        Object var2 = this.field1397.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ew.ar(ILjava/lang/String;B)V")
    public void method2582(int arg0, String arg1) {
        this.field1397.put(arg0, arg1);
    }

    @ObfuscatedName("ew.am(II)Ljava/lang/String;")
    public String method2587(int arg0) {
        Object var2 = this.field1397.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ew.as(ILjava/lang/String;B)V")
    public void method2626(int arg0, String arg1) {
        this.field1400[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ew.aj(II)Ljava/lang/String;")
    public String method2584(int arg0) {
        return this.field1400[arg0];
    }

    @ObfuscatedName("ew.ag(I)V")
    public void method2585() {
        for (int var1 = 0; var1 < this.field1398.length; var1++) {
            if (!this.field1398[var1]) {
                this.field1397.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1400.length; var2++) {
            this.field1400[var2] = null;
        }
    }

    @ObfuscatedName("ew.az(ZB)Ltn;")
    public class496 method2586(boolean arg0) {
        return class174.method1075("2", Statics.field139.field3879, arg0);
    }

    @ObfuscatedName("ew.av(B)V")
    public void method2597() {
        class496 var1 = this.method2586(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1397.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1398[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class514.method8096((String) var7);
                    }
                    var3++;
                }
            }
            class514 var8 = new class514(var2);
            var8.method8227(2);
            var8.method8228(var3);
            Iterator var9 = this.field1397.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1398[var11]) {
                    var8.method8228(var11);
                    Object var12 = var10.getValue();
                    class504 var13 = class504.method8106(var12.getClass());
                    var8.method8227(var13.field5030);
                    class504.method8112(var12, var8);
                }
            }
            var1.method8019(var8.field5070, 0, var8.field5072);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method8020();
            } catch (Exception var24) {
            }
        }
        this.field1396 = false;
        this.field1402 = class303.method2705();
    }

    @ObfuscatedName("ew.ap(I)V")
    public void method2588() {
        class496 var1 = this.method2586(false);
        label219: {
            try {
                byte[] var2 = new byte[(int) var1.method8022()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8024(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class514 var5 = new class514(var2);
                if (var5.field5070.length - var5.field5072 < 1) {
                    return;
                }
                int var7 = var5.method8244();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method8246();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label219;
                            }
                            int var11 = var5.method8246();
                            int var12 = var5.method8244();
                            class504 var13 = (class504) class374.method2465(class504.method8111(), var12);
                            Object var14 = var13.method8108(var5);
                            if (var11 >= 0 && var11 < this.field1398.length && this.field1398[var11]) {
                                this.field1397.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method8246();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method8246();
                            int var18 = var5.method8496();
                            if (var17 >= 0 && var17 < this.field1398.length && this.field1398[var17]) {
                                this.field1397.put(var17, var18);
                            }
                        }
                        int var19 = var5.method8246();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label219;
                            }
                            var5.method8246();
                            var5.method8369();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label219;
            } finally {
                try {
                    var1.method8020();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1396 = false;
    }

    @ObfuscatedName("ew.aq(I)V")
    public void method2614() {
        if (this.field1396 && this.field1402 < class303.method2705() - 60000L) {
            this.method2597();
        }
    }

    @ObfuscatedName("ew.at(B)Z")
    public boolean method2580() {
        return this.field1396;
    }
}
