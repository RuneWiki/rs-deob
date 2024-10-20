package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ds")
public class class100 {

    @ObfuscatedName("ds.an")
    public boolean field1309;

    @ObfuscatedName("ds.ao")
    public boolean field1305 = false;

    @ObfuscatedName("ds.ab")
    public boolean field1311;

    @ObfuscatedName("ds.aw")
    public boolean field1317 = false;

    @ObfuscatedName("ds.ad")
    public int field1313;

    @ObfuscatedName("ds.al")
    public double field1319 = 0.8D;

    @ObfuscatedName("ds.as")
    public int field1315 = 127;

    @ObfuscatedName("ds.ag")
    public int field1316 = 127;

    @ObfuscatedName("ds.ai")
    public int field1312 = 127;

    @ObfuscatedName("ds.ax")
    public int field1306 = -1;

    @ObfuscatedName("ds.ar")
    public String field1310 = null;

    @ObfuscatedName("ds.aj")
    public int field1320 = 1;

    @ObfuscatedName("ds.au")
    public final Map field1321 = new LinkedHashMap();

    public class100() {
        this.method2377(true);
    }

    public class100(class535 arg0) {
        if (arg0 == null || arg0.field5231 == null) {
            this.method2377(true);
        } else {
            int var2 = arg0.method8462();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8462() == 1) {
                    this.field1309 = true;
                }
                if (var2 > 1) {
                    this.field1311 = arg0.method8462() == 1;
                }
                if (var2 > 3) {
                    this.field1320 = arg0.method8462();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8462();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8682();
                        int var6 = arg0.method8682();
                        this.field1321.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1310 = arg0.method8622();
                }
                if (var2 > 5) {
                    this.field1305 = arg0.method8640();
                }
                if (var2 > 6) {
                    this.field1319 = (double) arg0.method8462() / 100.0D;
                    this.field1315 = arg0.method8462();
                    this.field1316 = arg0.method8462();
                    this.field1312 = arg0.method8462();
                }
                if (var2 > 7) {
                    this.field1306 = arg0.method8462();
                }
                if (var2 > 8) {
                    this.field1317 = arg0.method8462() == 1;
                }
                if (var2 > 9) {
                    this.field1313 = arg0.method8682();
                }
            } else {
                this.method2377(true);
            }
        }
    }

    @ObfuscatedName("ds.az(ZB)V")
    public void method2377(boolean arg0) {
    }

    @ObfuscatedName("ds.ah(I)Lur;")
    public class535 method2345() {
        class535 var1 = new class535(417, true);
        var1.method8445(10);
        var1.method8445(this.field1309 ? 1 : 0);
        var1.method8445(this.field1311 ? 1 : 0);
        var1.method8445(this.field1320);
        var1.method8445(this.field1321.size());
        Iterator var2 = this.field1321.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8448((Integer) var3.getKey());
            var1.method8448((Integer) var3.getValue());
        }
        var1.method8452(this.field1310 == null ? "" : this.field1310);
        var1.method8451(this.field1305);
        var1.method8445((int) (this.field1319 * 100.0D));
        var1.method8445(this.field1315);
        var1.method8445(this.field1316);
        var1.method8445(this.field1312);
        var1.method8445(this.field1306);
        var1.method8445(this.field1317 ? 1 : 0);
        var1.method8448(this.field1313);
        return var1;
    }

    @ObfuscatedName("ca.af(I)Lds;")
    public static class100 method2083() {
        class515 var0 = null;
        class100 var1 = new class100();
        try {
            var0 = class176.method3126("", Statics.field2090.field3988, false);
            byte[] var2 = new byte[(int) var0.method8243()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method8238(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class100(new class535(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method8247();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("sa.at(I)V")
    public static void method7840() {
        class515 var0 = null;
        try {
            var0 = class176.method3126("", Statics.field2090.field3988, true);
            class535 var1 = Statics.field1336.method2345();
            var0.method8234(var1.field5231, 0, var1.field5233);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8236(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("ds.an(ZB)V")
    public void method2346(boolean arg0) {
        this.field1309 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.ao(I)Z")
    public boolean method2347() {
        return this.field1309;
    }

    @ObfuscatedName("ds.ab(ZI)V")
    public void method2426(boolean arg0) {
        this.field1305 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.aw(I)Z")
    public boolean method2349() {
        return this.field1305;
    }

    @ObfuscatedName("ds.ad(ZB)V")
    public void method2408(boolean arg0) {
        this.field1311 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.al(I)Z")
    public boolean method2351() {
        return this.field1311;
    }

    @ObfuscatedName("ds.as(ZB)V")
    public void method2352(boolean arg0) {
        this.field1317 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.ag(B)V")
    public void method2353() {
        this.method2352(!this.field1317);
    }

    @ObfuscatedName("ds.ai(B)Z")
    public boolean method2354() {
        return this.field1317;
    }

    @ObfuscatedName("ds.ax(II)V")
    public void method2446(int arg0) {
        this.field1313 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.ar(I)I")
    public int method2437() {
        return this.field1313;
    }

    @ObfuscatedName("ds.aj(D)V")
    public void method2357(double arg0) {
        this.field1319 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.au(S)D")
    public double method2358() {
        return this.field1319;
    }

    @ObfuscatedName("ds.ay(IB)V")
    public void method2359(int arg0) {
        this.field1315 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.ap(I)I")
    public int method2391() {
        return this.field1315;
    }

    @ObfuscatedName("ds.av(IB)V")
    public void method2395(int arg0) {
        this.field1316 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.aa(I)I")
    public int method2361() {
        return this.field1316;
    }

    @ObfuscatedName("ds.aq(II)V")
    public void method2429(int arg0) {
        this.field1312 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.am(I)I")
    public int method2363() {
        return this.field1312;
    }

    @ObfuscatedName("ds.ac(Ljava/lang/String;I)V")
    public void method2364(String arg0) {
        this.field1310 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.ae(S)Ljava/lang/String;")
    public String method2435() {
        return this.field1310;
    }

    @ObfuscatedName("ds.ak(II)V")
    public void method2366(int arg0) {
        this.field1306 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.bp(I)I")
    public int method2367() {
        return this.field1306;
    }

    @ObfuscatedName("ds.bz(IB)V")
    public void method2368(int arg0) {
        this.field1320 = arg0;
        method7840();
    }

    @ObfuscatedName("ds.bc(B)I")
    public int method2448() {
        return this.field1320;
    }

    @ObfuscatedName("ds.bf(Ljava/lang/String;IS)V")
    public void method2407(String arg0, int arg1) {
        int var3 = this.method2373(arg0);
        if (this.field1321.size() >= 10 && !this.field1321.containsKey(var3)) {
            Iterator var4 = this.field1321.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1321.put(var3, arg1);
        method7840();
    }

    @ObfuscatedName("ds.be(Ljava/lang/String;I)Z")
    public boolean method2356(String arg0) {
        int var2 = this.method2373(arg0);
        return this.field1321.containsKey(var2);
    }

    @ObfuscatedName("ds.bn(Ljava/lang/String;B)I")
    public int method2372(String arg0) {
        int var2 = this.method2373(arg0);
        return this.field1321.containsKey(var2) ? (Integer) this.field1321.get(var2) : 0;
    }

    @ObfuscatedName("ds.bd(Ljava/lang/String;I)I")
    public int method2373(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        return var4;
    }
}
