package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dq")
public class class101 {

    @ObfuscatedName("dq.ap")
    public boolean field1311;

    @ObfuscatedName("dq.an")
    public boolean field1303 = false;

    @ObfuscatedName("dq.aj")
    public boolean field1304;

    @ObfuscatedName("dq.av")
    public boolean field1307 = false;

    @ObfuscatedName("dq.ab")
    public int field1309;

    @ObfuscatedName("dq.ai")
    public double field1306 = 0.8D;

    @ObfuscatedName("dq.ae")
    public int field1308 = 127;

    @ObfuscatedName("dq.au")
    public int field1298 = 127;

    @ObfuscatedName("dq.ah")
    public int field1310 = 127;

    @ObfuscatedName("dq.az")
    public int field1305 = -1;

    @ObfuscatedName("dq.ax")
    public String field1302 = null;

    @ObfuscatedName("dq.ac")
    public int field1313 = 1;

    @ObfuscatedName("dq.al")
    public int field1314 = 25;

    @ObfuscatedName("dq.ay")
    public final Map field1315 = new LinkedHashMap();

    public class101() {
        this.method2441(true);
    }

    public class101(class547 arg0) {
        if (arg0 == null || arg0.field5364 == null) {
            this.method2441(true);
        } else {
            int var2 = arg0.method8804();
            if (var2 >= 0 && var2 <= 11) {
                if (arg0.method8804() == 1) {
                    this.field1311 = true;
                }
                if (var2 > 1) {
                    this.field1304 = arg0.method8804() == 1;
                }
                if (var2 > 3) {
                    this.field1313 = arg0.method8804();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8804();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8734();
                        int var6 = arg0.method8734();
                        this.field1315.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1302 = arg0.method8738();
                }
                if (var2 > 5) {
                    this.field1303 = arg0.method8737();
                }
                if (var2 > 6) {
                    this.field1306 = (double) arg0.method8804() / 100.0D;
                    this.field1308 = arg0.method8804();
                    this.field1298 = arg0.method8804();
                    this.field1310 = arg0.method8804();
                }
                if (var2 > 7) {
                    this.field1305 = arg0.method8804();
                }
                if (var2 > 8) {
                    this.field1307 = arg0.method8804() == 1;
                }
                if (var2 > 9) {
                    this.field1309 = arg0.method8734();
                }
                if (var2 > 10) {
                    this.field1314 = arg0.method8804();
                }
            } else {
                this.method2441(true);
            }
        }
    }

    @ObfuscatedName("dq.aq(ZI)V")
    public void method2441(boolean arg0) {
    }

    @ObfuscatedName("dq.ad(I)Lvp;")
    public class547 method2442() {
        class547 var1 = new class547(418, true);
        var1.method8711(11);
        var1.method8711(this.field1311 ? 1 : 0);
        var1.method8711(this.field1304 ? 1 : 0);
        var1.method8711(this.field1313);
        var1.method8711(this.field1315.size());
        Iterator var2 = this.field1315.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8714((Integer) var3.getKey());
            var1.method8714((Integer) var3.getValue());
        }
        var1.method8718(this.field1302 == null ? "" : this.field1302);
        var1.method8729(this.field1303);
        var1.method8711((int) (this.field1306 * 100.0D));
        var1.method8711(this.field1308);
        var1.method8711(this.field1298);
        var1.method8711(this.field1310);
        var1.method8711(this.field1305);
        var1.method8711(this.field1307 ? 1 : 0);
        var1.method8714(this.field1309);
        var1.method8711(this.field1314);
        return var1;
    }

    @ObfuscatedName("fh.ag(I)V")
    public static void method2966() {
        class527 var0 = null;
        try {
            var0 = class218.method2875("", Statics.field1401.field4084, true);
            class547 var1 = Statics.field1379.method2442();
            var0.method8511(var1.field5364, 0, var1.field5363);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8507(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("dq.ak(ZI)V")
    public void method2443(boolean arg0) {
        this.field1311 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.ap(S)Z")
    public boolean method2535() {
        return this.field1311;
    }

    @ObfuscatedName("dq.an(ZI)V")
    public void method2501(boolean arg0) {
        this.field1303 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.aj(I)Z")
    public boolean method2543() {
        return this.field1303;
    }

    @ObfuscatedName("dq.av(ZB)V")
    public void method2447(boolean arg0) {
        this.field1304 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.ab(B)Z")
    public boolean method2473() {
        return this.field1304;
    }

    @ObfuscatedName("dq.ai(ZI)V")
    public void method2513(boolean arg0) {
        this.field1307 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.ae(I)V")
    public void method2450() {
        this.method2513(!this.field1307);
    }

    @ObfuscatedName("dq.au(I)Z")
    public boolean method2451() {
        return this.field1307;
    }

    @ObfuscatedName("dq.ah(II)V")
    public void method2528(int arg0) {
        this.field1309 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.az(S)I")
    public int method2452() {
        return this.field1309;
    }

    @ObfuscatedName("dq.ax(D)V")
    public void method2509(double arg0) {
        this.field1306 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.ac(S)D")
    public double method2449() {
        return this.field1306;
    }

    @ObfuscatedName("dq.al(IB)V")
    public void method2461(int arg0) {
        this.field1308 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.ay(S)I")
    public int method2525() {
        return this.field1308;
    }

    @ObfuscatedName("dq.ao(II)V")
    public void method2458(int arg0) {
        this.field1298 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.aa(I)I")
    public int method2459() {
        return this.field1298;
    }

    @ObfuscatedName("dq.as(IB)V")
    public void method2460(int arg0) {
        this.field1310 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.aw(I)I")
    public int method2489() {
        return this.field1310;
    }

    @ObfuscatedName("dq.at(Ljava/lang/String;B)V")
    public void method2462(String arg0) {
        this.field1302 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.af(I)Ljava/lang/String;")
    public String method2463() {
        return this.field1302;
    }

    @ObfuscatedName("dq.am(II)V")
    public void method2464(int arg0) {
        this.field1305 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.ar(I)I")
    public int method2465() {
        return this.field1305;
    }

    @ObfuscatedName("dq.bt(II)V")
    public void method2466(int arg0) {
        this.field1313 = arg0;
        method2966();
    }

    @ObfuscatedName("dq.bj(I)I")
    public int method2494() {
        return this.field1313;
    }

    @ObfuscatedName("dq.be(Ljava/lang/String;IB)V")
    public void method2468(String arg0, int arg1) {
        int var3 = this.method2471(arg0);
        if (this.field1315.size() >= 10 && !this.field1315.containsKey(var3)) {
            Iterator var4 = this.field1315.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1315.put(var3, arg1);
        method2966();
    }

    @ObfuscatedName("dq.bm(Ljava/lang/String;I)Z")
    public boolean method2469(String arg0) {
        int var2 = this.method2471(arg0);
        return this.field1315.containsKey(var2);
    }

    @ObfuscatedName("dq.bo(Ljava/lang/String;I)I")
    public int method2470(String arg0) {
        int var2 = this.method2471(arg0);
        return this.field1315.containsKey(var2) ? (Integer) this.field1315.get(var2) : 0;
    }

    @ObfuscatedName("dq.bi(Ljava/lang/String;I)I")
    public int method2471(String arg0) {
        return class416.method5382(arg0.toLowerCase());
    }

    @ObfuscatedName("dq.ba(II)V")
    public void method2472(int arg0) {
        this.field1314 = arg0;
        client.method4340();
        method2966();
    }

    @ObfuscatedName("dq.bg(I)I")
    public int method2440() {
        return this.field1314;
    }
}
