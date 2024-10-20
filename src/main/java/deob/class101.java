package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dy")
public class class101 {

    @ObfuscatedName("dy.ao")
    public boolean field1295;

    @ObfuscatedName("dy.ah")
    public boolean field1308 = false;

    @ObfuscatedName("dy.ar")
    public boolean field1297;

    @ObfuscatedName("dy.ab")
    public boolean field1298 = false;

    @ObfuscatedName("dy.am")
    public int field1309;

    @ObfuscatedName("dy.av")
    public double field1300 = 0.8D;

    @ObfuscatedName("dy.ag")
    public int field1301 = 127;

    @ObfuscatedName("dy.aa")
    public int field1304 = 127;

    @ObfuscatedName("dy.ap")
    public int field1303 = 127;

    @ObfuscatedName("dy.ay")
    public int field1299 = -1;

    @ObfuscatedName("dy.as")
    public String field1305 = null;

    @ObfuscatedName("dy.aj")
    public int field1306 = 1;

    @ObfuscatedName("dy.an")
    public final Map field1307 = new LinkedHashMap();

    public class101() {
        this.method2383(true);
    }

    public class101(class530 arg0) {
        if (arg0 == null || arg0.field5139 == null) {
            this.method2383(true);
        } else {
            int var2 = arg0.method8365();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8365() == 1) {
                    this.field1295 = true;
                }
                if (var2 > 1) {
                    this.field1297 = arg0.method8365() == 1;
                }
                if (var2 > 3) {
                    this.field1306 = arg0.method8365();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8365();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8371();
                        int var6 = arg0.method8371();
                        this.field1307.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1305 = arg0.method8375();
                }
                if (var2 > 5) {
                    this.field1308 = arg0.method8577();
                }
                if (var2 > 6) {
                    this.field1300 = (double) arg0.method8365() / 100.0D;
                    this.field1301 = arg0.method8365();
                    this.field1304 = arg0.method8365();
                    this.field1303 = arg0.method8365();
                }
                if (var2 > 7) {
                    this.field1299 = arg0.method8365();
                }
                if (var2 > 8) {
                    this.field1298 = arg0.method8365() == 1;
                }
                if (var2 > 9) {
                    this.field1309 = arg0.method8371();
                }
            } else {
                this.method2383(true);
            }
        }
    }

    @ObfuscatedName("dy.ac(ZB)V")
    public void method2383(boolean arg0) {
    }

    @ObfuscatedName("dy.al(I)Lul;")
    public class530 method2384() {
        class530 var1 = new class530(417, true);
        var1.method8348(10);
        var1.method8348(this.field1295 ? 1 : 0);
        var1.method8348(this.field1297 ? 1 : 0);
        var1.method8348(this.field1306);
        var1.method8348(this.field1307.size());
        Iterator var2 = this.field1307.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8351((Integer) var3.getKey());
            var1.method8351((Integer) var3.getValue());
        }
        var1.method8374(this.field1305 == null ? "" : this.field1305);
        var1.method8354(this.field1308);
        var1.method8348((int) (this.field1300 * 100.0D));
        var1.method8348(this.field1301);
        var1.method8348(this.field1304);
        var1.method8348(this.field1303);
        var1.method8348(this.field1299);
        var1.method8348(this.field1298 ? 1 : 0);
        var1.method8351(this.field1309);
        return var1;
    }

    @ObfuscatedName("qg.ak(I)Ldy;")
    public static class101 method7068() {
        class510 var0 = null;
        class101 var1 = new class101();
        try {
            var0 = class176.method194("", Statics.field1437.field3920, false);
            byte[] var2 = new byte[(int) var0.method8125()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method8147(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class101(new class530(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method8123();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("fa.ax(I)V")
    public static void method2973() {
        class510 var0 = null;
        try {
            var0 = class176.method194("", Statics.field1437.field3920, true);
            class530 var1 = Statics.field1106.method2384();
            var0.method8122(var1.field5139, 0, var1.field5140);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8124(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("dy.ao(ZS)V")
    public void method2442(boolean arg0) {
        this.field1295 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.ah(I)Z")
    public boolean method2386() {
        return this.field1295;
    }

    @ObfuscatedName("dy.ar(ZB)V")
    public void method2415(boolean arg0) {
        this.field1308 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.ab(I)Z")
    public boolean method2388() {
        return this.field1308;
    }

    @ObfuscatedName("dy.am(ZI)V")
    public void method2389(boolean arg0) {
        this.field1297 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.av(B)Z")
    public boolean method2387() {
        return this.field1297;
    }

    @ObfuscatedName("dy.ag(ZI)V")
    public void method2457(boolean arg0) {
        this.field1298 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.aa(I)V")
    public void method2392() {
        this.method2457(!this.field1298);
    }

    @ObfuscatedName("dy.ap(I)Z")
    public boolean method2407() {
        return this.field1298;
    }

    @ObfuscatedName("dy.ay(IB)V")
    public void method2400(int arg0) {
        this.field1309 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.as(B)I")
    public int method2448() {
        return this.field1309;
    }

    @ObfuscatedName("dy.aj(D)V")
    public void method2390(double arg0) {
        this.field1300 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.an(I)D")
    public double method2397() {
        return this.field1300;
    }

    @ObfuscatedName("dy.au(II)V")
    public void method2398(int arg0) {
        this.field1301 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.ai(I)I")
    public int method2399() {
        return this.field1301;
    }

    @ObfuscatedName("dy.ae(II)V")
    public void method2476(int arg0) {
        this.field1304 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.aw(I)I")
    public int method2401() {
        return this.field1304;
    }

    @ObfuscatedName("dy.aq(II)V")
    public void method2402(int arg0) {
        this.field1303 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.az(B)I")
    public int method2473() {
        return this.field1303;
    }

    @ObfuscatedName("dy.at(Ljava/lang/String;S)V")
    public void method2404(String arg0) {
        this.field1305 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.af(I)Ljava/lang/String;")
    public String method2460() {
        return this.field1305;
    }

    @ObfuscatedName("dy.ad(II)V")
    public void method2406(int arg0) {
        this.field1299 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.bn(I)I")
    public int method2446() {
        return this.field1299;
    }

    @ObfuscatedName("dy.bk(II)V")
    public void method2408(int arg0) {
        this.field1306 = arg0;
        method2973();
    }

    @ObfuscatedName("dy.by(I)I")
    public int method2409() {
        return this.field1306;
    }

    @ObfuscatedName("dy.bd(Ljava/lang/String;II)V")
    public void method2467(String arg0, int arg1) {
        int var3 = this.method2413(arg0);
        if (this.field1307.size() >= 10 && !this.field1307.containsKey(var3)) {
            Iterator var4 = this.field1307.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1307.put(var3, arg1);
        method2973();
    }

    @ObfuscatedName("dy.be(Ljava/lang/String;I)Z")
    public boolean method2411(String arg0) {
        int var2 = this.method2413(arg0);
        return this.field1307.containsKey(var2);
    }

    @ObfuscatedName("dy.bv(Ljava/lang/String;I)I")
    public int method2394(String arg0) {
        int var2 = this.method2413(arg0);
        return this.field1307.containsKey(var2) ? (Integer) this.field1307.get(var2) : 0;
    }

    @ObfuscatedName("dy.ba(Ljava/lang/String;I)I")
    public int method2413(String arg0) {
        return class402.method2678(arg0.toLowerCase());
    }
}
