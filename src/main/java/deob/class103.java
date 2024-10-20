package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("du")
public class class103 {

    @ObfuscatedName("du.ax")
    public boolean field1334;

    @ObfuscatedName("du.aq")
    public boolean field1340 = false;

    @ObfuscatedName("du.af")
    public boolean field1336;

    @ObfuscatedName("du.at")
    public boolean field1337 = false;

    @ObfuscatedName("du.au")
    public int field1349;

    @ObfuscatedName("du.ar")
    public double field1339 = 0.8D;

    @ObfuscatedName("du.al")
    public int field1330 = 127;

    @ObfuscatedName("du.ad")
    public int field1341 = 127;

    @ObfuscatedName("du.ah")
    public int field1338 = 127;

    @ObfuscatedName("du.ap")
    public int field1343 = -1;

    @ObfuscatedName("du.ab")
    public String field1344 = null;

    @ObfuscatedName("du.az")
    public int field1345 = 1;

    @ObfuscatedName("du.aa")
    public int field1346 = 25;

    @ObfuscatedName("du.ai")
    public final Map field1335 = new LinkedHashMap();

    public class103() {
        this.method2618(true);
    }

    public class103(class551 arg0) {
        if (arg0 == null || arg0.field5413 == null) {
            this.method2618(true);
        } else {
            int var2 = arg0.method8955();
            if (var2 >= 0 && var2 <= 11) {
                if (arg0.method8955() == 1) {
                    this.field1334 = true;
                }
                if (var2 > 1) {
                    this.field1336 = arg0.method8955() == 1;
                }
                if (var2 > 3) {
                    this.field1345 = arg0.method8955();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8955();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method9110();
                        int var6 = arg0.method9110();
                        this.field1335.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1344 = arg0.method8987();
                }
                if (var2 > 5) {
                    this.field1340 = arg0.method8982();
                }
                if (var2 > 6) {
                    this.field1339 = (double) arg0.method8955() / 100.0D;
                    this.field1330 = arg0.method8955();
                    this.field1341 = arg0.method8955();
                    this.field1338 = arg0.method8955();
                }
                if (var2 > 7) {
                    this.field1343 = arg0.method8955();
                }
                if (var2 > 8) {
                    this.field1337 = arg0.method8955() == 1;
                }
                if (var2 > 9) {
                    this.field1349 = arg0.method9110();
                }
                if (var2 > 10) {
                    this.field1346 = arg0.method8955();
                }
            } else {
                this.method2618(true);
            }
        }
    }

    @ObfuscatedName("du.ac(ZB)V")
    public void method2618(boolean arg0) {
    }

    @ObfuscatedName("du.ae(I)Lvf;")
    public class551 method2600() {
        class551 var1 = new class551(418, true);
        var1.method9022(11);
        var1.method9022(this.field1334 ? 1 : 0);
        var1.method9022(this.field1336 ? 1 : 0);
        var1.method9022(this.field1345);
        var1.method9022(this.field1335.size());
        Iterator var2 = this.field1335.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8960((Integer) var3.getKey());
            var1.method8960((Integer) var3.getValue());
        }
        var1.method8964(this.field1344 == null ? "" : this.field1344);
        var1.method9100(this.field1340);
        var1.method9022((int) (this.field1339 * 100.0D));
        var1.method9022(this.field1330);
        var1.method9022(this.field1341);
        var1.method9022(this.field1338);
        var1.method9022(this.field1343);
        var1.method9022(this.field1337 ? 1 : 0);
        var1.method8960(this.field1349);
        var1.method9022(this.field1346);
        return var1;
    }

    @ObfuscatedName("ul.ag(I)Ldu;")
    public static class103 method8782() {
        class530 var0 = null;
        class103 var1 = new class103();
        try {
            var0 = class221.method6707("", Statics.field3604.field4100, false);
            byte[] var2 = new byte[(int) var0.method8727()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method8728(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class103(new class551(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method8725();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ab.am(I)V")
    public static void method166() {
        class530 var0 = null;
        try {
            var0 = class221.method6707("", Statics.field3604.field4100, true);
            class551 var1 = Statics.field4929.method2600();
            var0.method8732(var1.field5413, 0, var1.field5415);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8726(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("du.ax(ZI)V")
    public void method2597(boolean arg0) {
        this.field1334 = arg0;
        method166();
    }

    @ObfuscatedName("du.aq(I)Z")
    public boolean method2695() {
        return this.field1334;
    }

    @ObfuscatedName("du.af(ZB)V")
    public void method2656(boolean arg0) {
        this.field1340 = arg0;
        method166();
    }

    @ObfuscatedName("du.at(I)Z")
    public boolean method2604() {
        return this.field1340;
    }

    @ObfuscatedName("du.au(ZI)V")
    public void method2605(boolean arg0) {
        this.field1336 = arg0;
        method166();
    }

    @ObfuscatedName("du.ar(B)Z")
    public boolean method2632() {
        return this.field1336;
    }

    @ObfuscatedName("du.al(ZB)V")
    public void method2607(boolean arg0) {
        this.field1337 = arg0;
        method166();
    }

    @ObfuscatedName("du.ad(I)V")
    public void method2608() {
        this.method2607(!this.field1337);
    }

    @ObfuscatedName("du.ah(B)Z")
    public boolean method2619() {
        return this.field1337;
    }

    @ObfuscatedName("du.ap(II)V")
    public void method2610(int arg0) {
        this.field1349 = arg0;
        method166();
    }

    @ObfuscatedName("du.ab(I)I")
    public int method2611() {
        return this.field1349;
    }

    @ObfuscatedName("du.az(D)V")
    public void method2612(double arg0) {
        this.field1339 = arg0;
        method166();
    }

    @ObfuscatedName("du.aa(I)D")
    public double method2705() {
        return this.field1339;
    }

    @ObfuscatedName("du.ai(II)V")
    public void method2697(int arg0) {
        this.field1330 = arg0;
        method166();
    }

    @ObfuscatedName("du.ao(I)I")
    public int method2615() {
        return this.field1330;
    }

    @ObfuscatedName("du.as(II)V")
    public void method2616(int arg0) {
        this.field1341 = arg0;
        method166();
    }

    @ObfuscatedName("du.ay(I)I")
    public int method2617() {
        return this.field1341;
    }

    @ObfuscatedName("du.aj(II)V")
    public void method2655(int arg0) {
        this.field1338 = arg0;
        method166();
    }

    @ObfuscatedName("du.av(B)I")
    public int method2677() {
        return this.field1338;
    }

    @ObfuscatedName("du.aw(Ljava/lang/String;I)V")
    public void method2620(String arg0) {
        this.field1344 = arg0;
        method166();
    }

    @ObfuscatedName("du.an(I)Ljava/lang/String;")
    public String method2627() {
        return this.field1344;
    }

    @ObfuscatedName("du.ak(IB)V")
    public void method2622(int arg0) {
        this.field1343 = arg0;
        method166();
    }

    @ObfuscatedName("du.bn(I)I")
    public int method2623() {
        return this.field1343;
    }

    @ObfuscatedName("du.bh(II)V")
    public void method2624(int arg0) {
        this.field1345 = arg0;
        method166();
    }

    @ObfuscatedName("du.bd(I)I")
    public int method2625() {
        return this.field1345;
    }

    @ObfuscatedName("du.bx(Ljava/lang/String;II)V")
    public void method2631(String arg0, int arg1) {
        int var3 = this.method2629(arg0);
        if (this.field1335.size() >= 10 && !this.field1335.containsKey(var3)) {
            Iterator var4 = this.field1335.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1335.put(var3, arg1);
        method166();
    }

    @ObfuscatedName("du.bf(Ljava/lang/String;I)Z")
    public boolean method2648(String arg0) {
        int var2 = this.method2629(arg0);
        return this.field1335.containsKey(var2);
    }

    @ObfuscatedName("du.bm(Ljava/lang/String;I)I")
    public int method2628(String arg0) {
        int var2 = this.method2629(arg0);
        return this.field1335.containsKey(var2) ? (Integer) this.field1335.get(var2) : 0;
    }

    @ObfuscatedName("du.bs(Ljava/lang/String;I)I")
    public int method2629(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        return var4;
    }

    @ObfuscatedName("du.bw(II)V")
    public void method2630(int arg0) {
        this.field1346 = arg0;
        if (Statics.field1342 != null) {
            Statics.field1342.field1372.method4534(Statics.field4929.method2672());
        }
        method166();
    }

    @ObfuscatedName("du.ba(B)I")
    public int method2672() {
        return this.field1346;
    }
}
