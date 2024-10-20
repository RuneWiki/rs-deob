package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ed")
public class class111 {

    @ObfuscatedName("ed.af")
    public boolean[] field1424;

    @ObfuscatedName("ed.at")
    public Map field1422;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ed.an")
    public String[] field1419;

    @ObfuscatedName("ed.ao")
    public boolean field1420 = false;

    @ObfuscatedName("ed.ab")
    public long field1423;

    public class111() {
        int var1 = Statics.field1498.method6338(19);
        this.field1422 = new HashMap();
        this.field1424 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class198 var3 = class198.method4106(var2);
            this.field1424[var2] = var3.field2029;
        }
        int var4 = 0;
        if (Statics.field1498.method6313(15)) {
            var4 = Statics.field1498.method6338(15);
        }
        this.field1419 = new String[var4];
        this.method2599();
    }

    @ObfuscatedName("ed.az(III)V")
    public void method2590(int arg0, int arg1) {
        this.field1422.put(arg0, arg1);
        if (this.field1424[arg0]) {
            this.field1420 = true;
        }
    }

    @ObfuscatedName("ed.ah(IS)I")
    public int method2591(int arg0) {
        Object var2 = this.field1422.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ed.af(ILjava/lang/String;B)V")
    public void method2602(int arg0, String arg1) {
        this.field1422.put(arg0, arg1);
    }

    @ObfuscatedName("ed.at(IS)Ljava/lang/String;")
    public String method2596(int arg0) {
        Object var2 = this.field1422.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ed.an(ILjava/lang/String;B)V")
    public void method2594(int arg0, String arg1) {
        this.field1419[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ed.ao(IB)Ljava/lang/String;")
    public String method2595(int arg0) {
        return this.field1419[arg0];
    }

    @ObfuscatedName("ed.ab(I)V")
    public void method2613() {
        for (int var1 = 0; var1 < this.field1424.length; var1++) {
            if (!this.field1424[var1]) {
                this.field1422.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1419.length; var2++) {
            this.field1419[var2] = null;
        }
    }

    @ObfuscatedName("ed.aw(ZI)Ltz;")
    public class515 method2589(boolean arg0) {
        return class176.method3126("2", Statics.field2090.field3988, arg0);
    }

    @ObfuscatedName("ed.ad(I)V")
    public void method2598() {
        class515 var1 = this.method2589(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1422.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1424[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class535.method3943((String) var7);
                    }
                    var3++;
                }
            }
            class535 var8 = new class535(var2);
            var8.method8445(2);
            var8.method8446(var3);
            Iterator var9 = this.field1422.entrySet().iterator();
            label143: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method8234(var8.field5231, 0, var8.field5233);
                        break label143;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1424[var11]);
                var8.method8446(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class523[] var14 = class523.method8332();
                int var15 = 0;
                class523 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class523 var16 = var14[var15];
                    if (var16.field5154 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method8445(var17.field5158);
                class523.method8319(var12, var8);
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method8247();
            } catch (Exception var29) {
            }
        }
        this.field1420 = false;
        this.field1423 = class318.method3596();
    }

    @ObfuscatedName("ed.al(S)V")
    public void method2599() {
        class515 var1 = this.method2589(false);
        label219: {
            try {
                byte[] var2 = new byte[(int) var1.method8243()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8238(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class535 var5 = new class535(var2);
                if (var5.field5231.length - var5.field5233 < 1) {
                    return;
                }
                int var7 = var5.method8462();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method8670();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label219;
                            }
                            int var11 = var5.method8670();
                            int var12 = var5.method8462();
                            class523 var13 = (class523) class393.method3484(class523.method8332(), var12);
                            Object var14 = var13.method8321(var5);
                            if (var11 >= 0 && var11 < this.field1424.length && this.field1424[var11]) {
                                this.field1422.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method8670();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method8670();
                            int var18 = var5.method8682();
                            if (var17 >= 0 && var17 < this.field1424.length && this.field1424[var17]) {
                                this.field1422.put(var17, var18);
                            }
                        }
                        int var19 = var5.method8670();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label219;
                            }
                            var5.method8670();
                            var5.method8473();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label219;
            } finally {
                try {
                    var1.method8247();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1420 = false;
    }

    @ObfuscatedName("ed.as(B)V")
    public void method2600() {
        if (this.field1420 && this.field1423 < class318.method3596() - 60000L) {
            this.method2598();
        }
    }

    @ObfuscatedName("ed.ag(I)Z")
    public boolean method2593() {
        return this.field1420;
    }
}
