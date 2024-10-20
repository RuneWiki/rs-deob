package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dx")
public class class101 {

    @ObfuscatedName("dx.af")
    public boolean field1316;

    @ObfuscatedName("dx.aa")
    public boolean field1317 = false;

    @ObfuscatedName("dx.at")
    public boolean field1318;

    @ObfuscatedName("dx.ab")
    public boolean field1319 = false;

    @ObfuscatedName("dx.ac")
    public int field1327;

    @ObfuscatedName("dx.ao")
    public double field1323 = 0.8D;

    @ObfuscatedName("dx.ah")
    public int field1322 = 127;

    @ObfuscatedName("dx.av")
    public int field1326 = 127;

    @ObfuscatedName("dx.aq")
    public int field1324 = 127;

    @ObfuscatedName("dx.ap")
    public int field1325 = -1;

    @ObfuscatedName("dx.ae")
    public String field1314 = null;

    @ObfuscatedName("dx.ax")
    public int field1321 = 1;

    @ObfuscatedName("dx.ay")
    public int field1328 = 25;

    @ObfuscatedName("dx.au")
    public final Map field1329 = new LinkedHashMap();

    public class101() {
        this.method2387(true);
    }

    public class101(class546 arg0) {
        if (arg0 == null || arg0.field5346 == null) {
            this.method2387(true);
        } else {
            int var2 = arg0.method8796();
            if (var2 >= 0 && var2 <= 11) {
                if (arg0.method8796() == 1) {
                    this.field1316 = true;
                }
                if (var2 > 1) {
                    this.field1318 = arg0.method8796() == 1;
                }
                if (var2 > 3) {
                    this.field1321 = arg0.method8796();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8796();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8801();
                        int var6 = arg0.method8801();
                        this.field1329.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1314 = arg0.method8805();
                }
                if (var2 > 5) {
                    this.field1317 = arg0.method8804();
                }
                if (var2 > 6) {
                    this.field1323 = (double) arg0.method8796() / 100.0D;
                    this.field1322 = arg0.method8796();
                    this.field1326 = arg0.method8796();
                    this.field1324 = arg0.method8796();
                }
                if (var2 > 7) {
                    this.field1325 = arg0.method8796();
                }
                if (var2 > 8) {
                    this.field1319 = arg0.method8796() == 1;
                }
                if (var2 > 9) {
                    this.field1327 = arg0.method8801();
                }
                if (var2 > 10) {
                    this.field1328 = arg0.method8796();
                }
            } else {
                this.method2387(true);
            }
        }
    }

    @ObfuscatedName("dx.ak(ZI)V")
    public void method2387(boolean arg0) {
    }

    @ObfuscatedName("dx.al(I)Lua;")
    public class546 method2388() {
        class546 var1 = new class546(418, true);
        var1.method8779(11);
        var1.method8779(this.field1316 ? 1 : 0);
        var1.method8779(this.field1318 ? 1 : 0);
        var1.method8779(this.field1321);
        var1.method8779(this.field1329.size());
        Iterator var2 = this.field1329.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8981((Integer) var3.getKey());
            var1.method8981((Integer) var3.getValue());
        }
        var1.method8864(this.field1314 == null ? "" : this.field1314);
        var1.method8785(this.field1317);
        var1.method8779((int) (this.field1323 * 100.0D));
        var1.method8779(this.field1322);
        var1.method8779(this.field1326);
        var1.method8779(this.field1324);
        var1.method8779(this.field1325);
        var1.method8779(this.field1319 ? 1 : 0);
        var1.method8981(this.field1327);
        var1.method8779(this.field1328);
        return var1;
    }

    @ObfuscatedName("pl.aj(B)Ldx;")
    public static class101 method6809() {
        class526 var0 = null;
        class101 var1 = new class101();
        try {
            var0 = class179.method2825("", Statics.field1432.field4062, false);
            byte[] var2 = new byte[(int) var0.method8568()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method8576(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class101(new class546(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method8566();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("hf.az(I)V")
    public static void method3619() {
        class526 var0 = null;
        try {
            var0 = class179.method2825("", Statics.field1432.field4062, true);
            class546 var1 = Statics.field4879.method2388();
            var0.method8562(var1.field5346, 0, var1.field5344);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8563(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("dx.af(ZB)V")
    public void method2389(boolean arg0) {
        this.field1316 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.aa(I)Z")
    public boolean method2481() {
        return this.field1316;
    }

    @ObfuscatedName("dx.at(ZI)V")
    public void method2398(boolean arg0) {
        this.field1317 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.ab(I)Z")
    public boolean method2392() {
        return this.field1317;
    }

    @ObfuscatedName("dx.ac(ZI)V")
    public void method2503(boolean arg0) {
        this.field1318 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.ao(I)Z")
    public boolean method2394() {
        return this.field1318;
    }

    @ObfuscatedName("dx.ah(ZI)V")
    public void method2513(boolean arg0) {
        this.field1319 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.av(I)V")
    public void method2396() {
        this.method2513(!this.field1319);
    }

    @ObfuscatedName("dx.aq(B)Z")
    public boolean method2397() {
        return this.field1319;
    }

    @ObfuscatedName("dx.ap(II)V")
    public void method2438(int arg0) {
        this.field1327 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.ae(I)I")
    public int method2500() {
        return this.field1327;
    }

    @ObfuscatedName("dx.ax(D)V")
    public void method2400(double arg0) {
        this.field1323 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.ay(I)D")
    public double method2401() {
        return this.field1323;
    }

    @ObfuscatedName("dx.au(II)V")
    public void method2402(int arg0) {
        this.field1322 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.as(B)I")
    public int method2417() {
        return this.field1322;
    }

    @ObfuscatedName("dx.aw(II)V")
    public void method2404(int arg0) {
        this.field1326 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.ad(S)I")
    public int method2484() {
        return this.field1326;
    }

    @ObfuscatedName("dx.ai(II)V")
    public void method2406(int arg0) {
        this.field1324 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.an(I)I")
    public int method2437() {
        return this.field1324;
    }

    @ObfuscatedName("dx.am(Ljava/lang/String;B)V")
    public void method2408(String arg0) {
        this.field1314 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.ar(I)Ljava/lang/String;")
    public String method2409() {
        return this.field1314;
    }

    @ObfuscatedName("dx.ag(II)V")
    public void method2410(int arg0) {
        this.field1325 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.bs(I)I")
    public int method2411() {
        return this.field1325;
    }

    @ObfuscatedName("dx.bf(IB)V")
    public void method2486(int arg0) {
        this.field1321 = arg0;
        method3619();
    }

    @ObfuscatedName("dx.bo(I)I")
    public int method2475() {
        return this.field1321;
    }

    @ObfuscatedName("dx.bi(Ljava/lang/String;II)V")
    public void method2414(String arg0, int arg1) {
        int var3 = this.method2423(arg0);
        if (this.field1329.size() >= 10 && !this.field1329.containsKey(var3)) {
            Iterator var4 = this.field1329.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1329.put(var3, arg1);
        method3619();
    }

    @ObfuscatedName("dx.bt(Ljava/lang/String;B)Z")
    public boolean method2469(String arg0) {
        int var2 = this.method2423(arg0);
        return this.field1329.containsKey(var2);
    }

    @ObfuscatedName("dx.bn(Ljava/lang/String;I)I")
    public int method2416(String arg0) {
        int var2 = this.method2423(arg0);
        return this.field1329.containsKey(var2) ? (Integer) this.field1329.get(var2) : 0;
    }

    @ObfuscatedName("dx.bw(Ljava/lang/String;I)I")
    public int method2423(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        return var4;
    }

    @ObfuscatedName("dx.bl(IB)V")
    public void method2418(int arg0) {
        this.field1328 = arg0;
        if (Statics.field3967 != null) {
            Statics.field3967.field1332.method4621(Statics.field4879.method2459());
        }
        method3619();
    }

    @ObfuscatedName("dx.be(B)I")
    public int method2459() {
        return this.field1328;
    }
}
