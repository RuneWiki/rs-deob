package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("er")
public class class113 {

    @ObfuscatedName("er.an")
    public boolean[] field1434;

    @ObfuscatedName("er.au")
    public Map field1440;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("er.ax")
    public String[] field1435;

    @ObfuscatedName("er.ao")
    public boolean field1436 = false;

    @ObfuscatedName("er.am")
    public long field1437;

    public class113() {
        int var1 = Statics.field290.method6685(19);
        this.field1440 = new HashMap();
        this.field1434 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class236 var3 = (class236) class236.field2493.method5586((long) var2);
            class236 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field2494.method6670(19, var2);
                class236 var6 = new class236();
                if (var5 != null) {
                    var6.method4421(new class549(var5));
                }
                class236.field2493.method5589(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1434[var2] = var4.field2491;
        }
        int var8 = 0;
        if (Statics.field290.method6594(15)) {
            var8 = Statics.field290.method6685(15);
        }
        this.field1435 = new String[var8];
        this.method2773();
    }

    @ObfuscatedName("er.ab(IIB)V")
    public void method2764(int arg0, int arg1) {
        this.field1440.put(arg0, arg1);
        if (this.field1434[arg0]) {
            this.field1436 = true;
        }
    }

    @ObfuscatedName("er.ay(IB)I")
    public int method2770(int arg0) {
        Object var2 = this.field1440.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("er.an(ILjava/lang/String;I)V")
    public void method2766(int arg0, String arg1) {
        this.field1440.put(arg0, arg1);
    }

    @ObfuscatedName("er.au(II)Ljava/lang/String;")
    public String method2765(int arg0) {
        Object var2 = this.field1440.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("er.ax(ILjava/lang/String;B)V")
    public void method2768(int arg0, String arg1) {
        this.field1435[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("er.ao(II)Ljava/lang/String;")
    public String method2801(int arg0) {
        return this.field1435[arg0];
    }

    @ObfuscatedName("er.am(I)V")
    public void method2789() {
        for (int var1 = 0; var1 < this.field1434.length; var1++) {
            if (!this.field1434[var1]) {
                this.field1440.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1435.length; var2++) {
            this.field1435[var2] = null;
        }
    }

    @ObfuscatedName("er.ac(ZI)Lum;")
    public class528 method2771(boolean arg0) {
        return class215.method2850("2", Statics.field229.field4051, arg0);
    }

    @ObfuscatedName("er.ae(I)V")
    public void method2772() {
        class528 var1 = this.method2771(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1440.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1434[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class549.method8571((String) var7);
                    }
                    var3++;
                }
            }
            class549 var8 = new class549(var2);
            var8.method8781(2);
            var8.method8782(var3);
            Iterator var9 = this.field1440.entrySet().iterator();
            label143: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method8588(var8.field5381, 0, var8.field5378);
                        break label143;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1434[var11]);
                var8.method8782(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class536[] var14 = class536.method8659();
                int var15 = 0;
                class536 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class536 var16 = var14[var15];
                    if (var16.field5298 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method8781(var17.field5295);
                class536.method8652(var12, var8);
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method8576();
            } catch (Exception var29) {
            }
        }
        this.field1436 = false;
        this.field1437 = class329.method5009();
    }

    @ObfuscatedName("er.ad(I)V")
    public void method2773() {
        class528 var1 = this.method2771(false);
        label218: {
            try {
                byte[] var2 = new byte[(int) var1.method8578()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8594(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class549 var5 = new class549(var2);
                if (var5.field5381.length - var5.field5378 < 1) {
                    return;
                }
                int var7 = var5.method9025();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method8968();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label218;
                            }
                            int var11 = var5.method8968();
                            int var12 = var5.method9025();
                            class536 var13 = (class536) class403.method3083(class536.method8659(), var12);
                            Object var14 = var13.method8662(var5);
                            if (var11 >= 0 && var11 < this.field1434.length && this.field1434[var11]) {
                                this.field1440.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method8968();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method8968();
                            int var18 = var5.method8803();
                            if (var17 >= 0 && var17 < this.field1434.length && this.field1434[var17]) {
                                this.field1440.put(var17, var18);
                            }
                        }
                        int var19 = var5.method8968();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label218;
                            }
                            var5.method8968();
                            var5.method8808();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label218;
            } finally {
                try {
                    var1.method8576();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1436 = false;
    }

    @ObfuscatedName("er.aq(I)V")
    public void method2769() {
        if (this.field1436 && this.field1437 < class329.method5009() - 60000L) {
            this.method2772();
        }
    }

    @ObfuscatedName("er.al(B)Z")
    public boolean method2775() {
        return this.field1436;
    }
}
