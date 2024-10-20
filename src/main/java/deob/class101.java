package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("db")
public class class101 {

    @ObfuscatedName("db.ax")
    public boolean field1284;

    @ObfuscatedName("db.ao")
    public boolean field1287 = false;

    @ObfuscatedName("db.am")
    public boolean field1288;

    @ObfuscatedName("db.ac")
    public boolean field1302 = false;

    @ObfuscatedName("db.ae")
    public int field1301;

    @ObfuscatedName("db.ad")
    public double field1291 = 0.8D;

    @ObfuscatedName("db.aq")
    public int field1292 = 127;

    @ObfuscatedName("db.al")
    public int field1293 = 127;

    @ObfuscatedName("db.aj")
    public int field1294 = 127;

    @ObfuscatedName("db.as")
    public int field1295 = -1;

    @ObfuscatedName("db.aw")
    public String field1290 = null;

    @ObfuscatedName("db.af")
    public int field1297 = 1;

    @ObfuscatedName("db.aa")
    public int field1289 = 25;

    @ObfuscatedName("db.ah")
    public final Map field1296 = new LinkedHashMap();

    public class101() {
        this.method2499(true);
    }

    public class101(class549 arg0) {
        if (arg0 == null || arg0.field5381 == null) {
            this.method2499(true);
        } else {
            int var2 = arg0.method9025();
            if (var2 >= 0 && var2 <= 11) {
                if (arg0.method9025() == 1) {
                    this.field1284 = true;
                }
                if (var2 > 1) {
                    this.field1288 = arg0.method9025() == 1;
                }
                if (var2 > 3) {
                    this.field1297 = arg0.method9025();
                }
                if (var2 > 2) {
                    int var3 = arg0.method9025();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8803();
                        int var6 = arg0.method8803();
                        this.field1296.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1290 = arg0.method8807();
                }
                if (var2 > 5) {
                    this.field1287 = arg0.method8810();
                }
                if (var2 > 6) {
                    this.field1291 = (double) arg0.method9025() / 100.0D;
                    this.field1292 = arg0.method9025();
                    this.field1293 = arg0.method9025();
                    this.field1294 = arg0.method9025();
                }
                if (var2 > 7) {
                    this.field1295 = arg0.method9025();
                }
                if (var2 > 8) {
                    this.field1302 = arg0.method9025() == 1;
                }
                if (var2 > 9) {
                    this.field1301 = arg0.method8803();
                }
                if (var2 > 10) {
                    this.field1289 = arg0.method9025();
                }
            } else {
                this.method2499(true);
            }
        }
    }

    @ObfuscatedName("db.ab(ZI)V")
    public void method2499(boolean arg0) {
    }

    @ObfuscatedName("db.ay(I)Lvg;")
    public class549 method2500() {
        class549 var1 = new class549(418, true);
        var1.method8781(11);
        var1.method8781(this.field1284 ? 1 : 0);
        var1.method8781(this.field1288 ? 1 : 0);
        var1.method8781(this.field1297);
        var1.method8781(this.field1296.size());
        Iterator var2 = this.field1296.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method9045((Integer) var3.getKey());
            var1.method9045((Integer) var3.getValue());
        }
        var1.method8869(this.field1290 == null ? "" : this.field1290);
        var1.method8832(this.field1287);
        var1.method8781((int) (this.field1291 * 100.0D));
        var1.method8781(this.field1292);
        var1.method8781(this.field1293);
        var1.method8781(this.field1294);
        var1.method8781(this.field1295);
        var1.method8781(this.field1302 ? 1 : 0);
        var1.method9045(this.field1301);
        var1.method8781(this.field1289);
        return var1;
    }

    @ObfuscatedName("ci.an(B)Ldb;")
    public static class101 method1130() {
        class528 var0 = null;
        class101 var1 = new class101();
        try {
            var0 = class215.method2850("", Statics.field229.field4051, false);
            byte[] var2 = new byte[(int) var0.method8578()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method8594(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class101(new class549(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method8576();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("mf.au(B)V")
    public static void method5612() {
        class528 var0 = null;
        try {
            var0 = class215.method2850("", Statics.field229.field4051, true);
            class549 var1 = Statics.field1385.method2500();
            var0.method8588(var1.field5381, 0, var1.field5378);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8577(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("db.ax(ZB)V")
    public void method2501(boolean arg0) {
        this.field1284 = arg0;
        method5612();
    }

    @ObfuscatedName("db.ao(I)Z")
    public boolean method2502() {
        return this.field1284;
    }

    @ObfuscatedName("db.am(ZI)V")
    public void method2503(boolean arg0) {
        this.field1287 = arg0;
        method5612();
    }

    @ObfuscatedName("db.ac(B)Z")
    public boolean method2504() {
        return this.field1287;
    }

    @ObfuscatedName("db.ae(ZB)V")
    public void method2505(boolean arg0) {
        this.field1288 = arg0;
        method5612();
    }

    @ObfuscatedName("db.ad(I)Z")
    public boolean method2506() {
        return this.field1288;
    }

    @ObfuscatedName("db.aq(ZB)V")
    public void method2507(boolean arg0) {
        this.field1302 = arg0;
        method5612();
    }

    @ObfuscatedName("db.al(B)V")
    public void method2508() {
        this.method2507(!this.field1302);
    }

    @ObfuscatedName("db.aj(I)Z")
    public boolean method2520() {
        return this.field1302;
    }

    @ObfuscatedName("db.as(II)V")
    public void method2510(int arg0) {
        this.field1301 = arg0;
        method5612();
    }

    @ObfuscatedName("db.aw(B)I")
    public int method2610() {
        return this.field1301;
    }

    @ObfuscatedName("db.af(D)V")
    public void method2599(double arg0) {
        this.field1291 = arg0;
        method5612();
    }

    @ObfuscatedName("db.aa(I)D")
    public double method2513() {
        return this.field1291;
    }

    @ObfuscatedName("db.ah(II)V")
    public void method2514(int arg0) {
        this.field1292 = arg0;
        method5612();
    }

    @ObfuscatedName("db.ag(I)I")
    public int method2515() {
        return this.field1292;
    }

    @ObfuscatedName("db.av(II)V")
    public void method2558(int arg0) {
        this.field1293 = arg0;
        method5612();
    }

    @ObfuscatedName("db.ar(B)I")
    public int method2517() {
        return this.field1293;
    }

    @ObfuscatedName("db.ap(IB)V")
    public void method2518(int arg0) {
        this.field1294 = arg0;
        method5612();
    }

    @ObfuscatedName("db.ak(B)I")
    public int method2601() {
        return this.field1294;
    }

    @ObfuscatedName("db.ai(Ljava/lang/String;B)V")
    public void method2498(String arg0) {
        this.field1290 = arg0;
        method5612();
    }

    @ObfuscatedName("db.at(B)Ljava/lang/String;")
    public String method2521() {
        return this.field1290;
    }

    @ObfuscatedName("db.az(IB)V")
    public void method2511(int arg0) {
        this.field1295 = arg0;
        method5612();
    }

    @ObfuscatedName("db.bg(B)I")
    public int method2519() {
        return this.field1295;
    }

    @ObfuscatedName("db.bz(IB)V")
    public void method2524(int arg0) {
        this.field1297 = arg0;
        method5612();
    }

    @ObfuscatedName("db.bj(I)I")
    public int method2539() {
        return this.field1297;
    }

    @ObfuscatedName("db.bc(Ljava/lang/String;II)V")
    public void method2526(String arg0, int arg1) {
        int var3 = this.method2529(arg0);
        if (this.field1296.size() >= 10 && !this.field1296.containsKey(var3)) {
            Iterator var4 = this.field1296.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1296.put(var3, arg1);
        method5612();
    }

    @ObfuscatedName("db.bo(Ljava/lang/String;I)Z")
    public boolean method2527(String arg0) {
        int var2 = this.method2529(arg0);
        return this.field1296.containsKey(var2);
    }

    @ObfuscatedName("db.bm(Ljava/lang/String;I)I")
    public int method2528(String arg0) {
        int var2 = this.method2529(arg0);
        return this.field1296.containsKey(var2) ? (Integer) this.field1296.get(var2) : 0;
    }

    @ObfuscatedName("db.bd(Ljava/lang/String;B)I")
    public int method2529(String arg0) {
        return class417.method4580(arg0.toLowerCase());
    }

    @ObfuscatedName("db.bh(II)V")
    public void method2530(int arg0) {
        this.field1289 = arg0;
        if (Statics.field4799 != null) {
            Statics.field4799.field1328.method3635(Statics.field1385.method2604());
        }
        method5612();
    }

    @ObfuscatedName("db.bx(I)I")
    public int method2604() {
        return this.field1289;
    }
}
