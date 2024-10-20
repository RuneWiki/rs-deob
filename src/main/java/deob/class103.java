package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("di")
public class class103 {

    @ObfuscatedName("di.ai")
    public boolean field1335;

    @ObfuscatedName("di.ay")
    public boolean field1326 = false;

    @ObfuscatedName("di.as")
    public boolean field1327;

    @ObfuscatedName("di.ae")
    public boolean field1328 = false;

    @ObfuscatedName("di.am")
    public int field1329;

    @ObfuscatedName("di.at")
    public double field1330 = 0.8D;

    @ObfuscatedName("di.au")
    public int field1331 = 127;

    @ObfuscatedName("di.an")
    public int field1325 = 127;

    @ObfuscatedName("di.ao")
    public int field1333 = 127;

    @ObfuscatedName("di.af")
    public int field1334 = -1;

    @ObfuscatedName("di.ar")
    public String field1338 = null;

    @ObfuscatedName("di.ab")
    public int field1336 = 1;

    @ObfuscatedName("di.az")
    public int field1337 = 25;

    @ObfuscatedName("di.ag")
    public final Map field1324 = new LinkedHashMap();

    public class103() {
        this.method2710(true);
    }

    public class103(class558 arg0) {
        if (arg0 == null || arg0.field5463 == null) {
            this.method2710(true);
        } else {
            int var2 = arg0.method9258();
            if (var2 >= 0 && var2 <= 11) {
                if (arg0.method9258() == 1) {
                    this.field1335 = true;
                }
                if (var2 > 1) {
                    this.field1327 = arg0.method9258() == 1;
                }
                if (var2 > 3) {
                    this.field1336 = arg0.method9258();
                }
                if (var2 > 2) {
                    int var3 = arg0.method9258();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method9264();
                        int var6 = arg0.method9264();
                        this.field1324.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1338 = arg0.method9268();
                }
                if (var2 > 5) {
                    this.field1326 = arg0.method9267();
                }
                if (var2 > 6) {
                    this.field1330 = (double) arg0.method9258() / 100.0D;
                    this.field1331 = arg0.method9258();
                    this.field1325 = arg0.method9258();
                    this.field1333 = arg0.method9258();
                }
                if (var2 > 7) {
                    this.field1334 = arg0.method9258();
                }
                if (var2 > 8) {
                    this.field1328 = arg0.method9258() == 1;
                }
                if (var2 > 9) {
                    this.field1329 = arg0.method9264();
                }
                if (var2 > 10) {
                    this.field1337 = arg0.method9258();
                }
            } else {
                this.method2710(true);
            }
        }
    }

    @ObfuscatedName("di.ap(ZB)V")
    public void method2710(boolean arg0) {
    }

    @ObfuscatedName("di.aw(S)Lvl;")
    public class558 method2711() {
        class558 var1 = new class558(418, true);
        var1.method9241(11);
        var1.method9241(this.field1335 ? 1 : 0);
        var1.method9241(this.field1327 ? 1 : 0);
        var1.method9241(this.field1336);
        var1.method9241(this.field1324.size());
        Iterator var2 = this.field1324.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method9244((Integer) var3.getKey());
            var1.method9244((Integer) var3.getValue());
        }
        var1.method9248(this.field1338 == null ? "" : this.field1338);
        var1.method9247(this.field1326);
        var1.method9241((int) (this.field1330 * 100.0D));
        var1.method9241(this.field1331);
        var1.method9241(this.field1325);
        var1.method9241(this.field1333);
        var1.method9241(this.field1334);
        var1.method9241(this.field1328 ? 1 : 0);
        var1.method9244(this.field1329);
        var1.method9241(this.field1337);
        return var1;
    }

    @ObfuscatedName("ok.ak(I)V")
    public static void method6908() {
        class537 var0 = null;
        try {
            var0 = class221.method8260("", Statics.field3157.field4131, true);
            class558 var1 = Statics.field2378.method2711();
            var0.method9029(var1.field5463, 0, var1.field5462);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method9040(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("di.aj(ZI)V")
    public void method2712(boolean arg0) {
        this.field1335 = arg0;
        method6908();
    }

    @ObfuscatedName("di.ai(I)Z")
    public boolean method2713() {
        return this.field1335;
    }

    @ObfuscatedName("di.ay(ZI)V")
    public void method2735(boolean arg0) {
        this.field1326 = arg0;
        method6908();
    }

    @ObfuscatedName("di.as(I)Z")
    public boolean method2757() {
        return this.field1326;
    }

    @ObfuscatedName("di.ae(ZI)V")
    public void method2716(boolean arg0) {
        this.field1327 = arg0;
        method6908();
    }

    @ObfuscatedName("di.am(I)Z")
    public boolean method2790() {
        return this.field1327;
    }

    @ObfuscatedName("di.at(ZI)V")
    public void method2718(boolean arg0) {
        this.field1328 = arg0;
        method6908();
    }

    @ObfuscatedName("di.au(I)V")
    public void method2794() {
        this.method2718(!this.field1328);
    }

    @ObfuscatedName("di.an(I)Z")
    public boolean method2764() {
        return this.field1328;
    }

    @ObfuscatedName("di.ao(II)V")
    public void method2721(int arg0) {
        this.field1329 = arg0;
        method6908();
    }

    @ObfuscatedName("di.af(I)I")
    public int method2819() {
        return this.field1329;
    }

    @ObfuscatedName("di.ar(D)V")
    public void method2723(double arg0) {
        this.field1330 = arg0;
        method6908();
    }

    @ObfuscatedName("di.ab(B)D")
    public double method2724() {
        return this.field1330;
    }

    @ObfuscatedName("di.az(II)V")
    public void method2784(int arg0) {
        this.field1331 = arg0;
        method6908();
    }

    @ObfuscatedName("di.ag(B)I")
    public int method2726() {
        return this.field1331;
    }

    @ObfuscatedName("di.ad(IB)V")
    public void method2727(int arg0) {
        this.field1325 = arg0;
        method6908();
    }

    @ObfuscatedName("di.ac(I)I")
    public int method2728() {
        return this.field1325;
    }

    @ObfuscatedName("di.av(II)V")
    public void method2791(int arg0) {
        this.field1333 = arg0;
        method6908();
    }

    @ObfuscatedName("di.ax(I)I")
    public int method2730() {
        return this.field1333;
    }

    @ObfuscatedName("di.aq(Ljava/lang/String;I)V")
    public void method2766(String arg0) {
        this.field1338 = arg0;
        method6908();
    }

    @ObfuscatedName("di.al(I)Ljava/lang/String;")
    public String method2732() {
        return this.field1338;
    }

    @ObfuscatedName("di.aa(II)V")
    public void method2733(int arg0) {
        this.field1334 = arg0;
        method6908();
    }

    @ObfuscatedName("di.ah(I)I")
    public int method2785() {
        return this.field1334;
    }

    @ObfuscatedName("di.bh(IB)V")
    public void method2725(int arg0) {
        this.field1336 = arg0;
        method6908();
    }

    @ObfuscatedName("di.bj(I)I")
    public int method2736() {
        return this.field1336;
    }

    @ObfuscatedName("di.bv(Ljava/lang/String;II)V")
    public void method2737(String arg0, int arg1) {
        int var3 = this.method2740(arg0);
        if (this.field1324.size() >= 10 && !this.field1324.containsKey(var3)) {
            Iterator var4 = this.field1324.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1324.put(var3, arg1);
        method6908();
    }

    @ObfuscatedName("di.bx(Ljava/lang/String;I)Z")
    public boolean method2738(String arg0) {
        int var2 = this.method2740(arg0);
        return this.field1324.containsKey(var2);
    }

    @ObfuscatedName("di.bk(Ljava/lang/String;B)I")
    public int method2739(String arg0) {
        int var2 = this.method2740(arg0);
        return this.field1324.containsKey(var2) ? (Integer) this.field1324.get(var2) : 0;
    }

    @ObfuscatedName("di.bb(Ljava/lang/String;I)I")
    public int method2740(String arg0) {
        return class420.method6907(arg0.toLowerCase());
    }

    @ObfuscatedName("di.bq(II)V")
    public void method2734(int arg0) {
        this.field1337 = arg0;
        client.method6407();
        method6908();
    }

    @ObfuscatedName("di.bp(B)I")
    public int method2761() {
        return this.field1337;
    }
}
