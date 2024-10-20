package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("df")
public class class100 {

    @ObfuscatedName("df.ar")
    public boolean field1312;

    @ObfuscatedName("df.as")
    public boolean field1313 = false;

    @ObfuscatedName("df.aa")
    public boolean field1314;

    @ObfuscatedName("df.az")
    public boolean field1310 = false;

    @ObfuscatedName("df.ao")
    public int field1316;

    @ObfuscatedName("df.au")
    public double field1315 = 0.8D;

    @ObfuscatedName("df.ak")
    public int field1309 = 127;

    @ObfuscatedName("df.ah")
    public int field1318 = 127;

    @ObfuscatedName("df.aj")
    public int field1320 = 127;

    @ObfuscatedName("df.af")
    public int field1321 = -1;

    @ObfuscatedName("df.ax")
    public String field1322 = null;

    @ObfuscatedName("df.an")
    public int field1323 = 1;

    @ObfuscatedName("df.ag")
    public final Map field1324 = new LinkedHashMap();

    public class100() {
        this.method2434(true);
    }

    public class100(class534 arg0) {
        if (arg0 == null || arg0.field5199 == null) {
            this.method2434(true);
        } else {
            int var2 = arg0.method8591();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8591() == 1) {
                    this.field1312 = true;
                }
                if (var2 > 1) {
                    this.field1314 = arg0.method8591() == 1;
                }
                if (var2 > 3) {
                    this.field1323 = arg0.method8591();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8591();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8597();
                        int var6 = arg0.method8597();
                        this.field1324.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1322 = arg0.method8601();
                }
                if (var2 > 5) {
                    this.field1313 = arg0.method8600();
                }
                if (var2 > 6) {
                    this.field1315 = (double) arg0.method8591() / 100.0D;
                    this.field1309 = arg0.method8591();
                    this.field1318 = arg0.method8591();
                    this.field1320 = arg0.method8591();
                }
                if (var2 > 7) {
                    this.field1321 = arg0.method8591();
                }
                if (var2 > 8) {
                    this.field1310 = arg0.method8591() == 1;
                }
                if (var2 > 9) {
                    this.field1316 = arg0.method8597();
                }
            } else {
                this.method2434(true);
            }
        }
    }

    @ObfuscatedName("df.aq(ZI)V")
    public void method2434(boolean arg0) {
    }

    @ObfuscatedName("df.aw(B)Luq;")
    public class534 method2412() {
        class534 var1 = new class534(417, true);
        var1.method8574(10);
        var1.method8574(this.field1312 ? 1 : 0);
        var1.method8574(this.field1314 ? 1 : 0);
        var1.method8574(this.field1323);
        var1.method8574(this.field1324.size());
        Iterator var2 = this.field1324.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8577((Integer) var3.getKey());
            var1.method8577((Integer) var3.getValue());
        }
        var1.method8581(this.field1322 == null ? "" : this.field1322);
        var1.method8580(this.field1313);
        var1.method8574((int) (this.field1315 * 100.0D));
        var1.method8574(this.field1309);
        var1.method8574(this.field1318);
        var1.method8574(this.field1320);
        var1.method8574(this.field1321);
        var1.method8574(this.field1310 ? 1 : 0);
        var1.method8577(this.field1316);
        return var1;
    }

    @ObfuscatedName("go.al(S)Ldf;")
    public static class100 method3191() {
        class514 var0 = null;
        class100 var1 = new class100();
        try {
            var0 = class215.method3279("", Statics.field152.field3988, false);
            byte[] var2 = new byte[(int) var0.method8362()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method8363(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class100(new class534(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method8360();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("gh.ai(I)V")
    public static void method3154() {
        class514 var0 = null;
        try {
            var0 = class215.method3279("", Statics.field152.field3988, true);
            class534 var1 = Statics.field156.method2412();
            var0.method8359(var1.field5199, 0, var1.field5200);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8361(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("df.ar(ZB)V")
    public void method2413(boolean arg0) {
        this.field1312 = arg0;
        method3154();
    }

    @ObfuscatedName("df.as(B)Z")
    public boolean method2518() {
        return this.field1312;
    }

    @ObfuscatedName("df.aa(ZI)V")
    public void method2415(boolean arg0) {
        this.field1313 = arg0;
        method3154();
    }

    @ObfuscatedName("df.az(B)Z")
    public boolean method2416() {
        return this.field1313;
    }

    @ObfuscatedName("df.ao(ZI)V")
    public void method2417(boolean arg0) {
        this.field1314 = arg0;
        method3154();
    }

    @ObfuscatedName("df.au(B)Z")
    public boolean method2463() {
        return this.field1314;
    }

    @ObfuscatedName("df.ak(ZI)V")
    public void method2446(boolean arg0) {
        this.field1310 = arg0;
        method3154();
    }

    @ObfuscatedName("df.ah(I)V")
    public void method2514() {
        this.method2446(!this.field1310);
    }

    @ObfuscatedName("df.aj(I)Z")
    public boolean method2520() {
        return this.field1310;
    }

    @ObfuscatedName("df.af(IB)V")
    public void method2447(int arg0) {
        this.field1316 = arg0;
        method3154();
    }

    @ObfuscatedName("df.ax(I)I")
    public int method2409() {
        return this.field1316;
    }

    @ObfuscatedName("df.an(D)V")
    public void method2421(double arg0) {
        this.field1315 = arg0;
        method3154();
    }

    @ObfuscatedName("df.ag(I)D")
    public double method2425() {
        return this.field1315;
    }

    @ObfuscatedName("df.am(IB)V")
    public void method2439(int arg0) {
        this.field1309 = arg0;
        method3154();
    }

    @ObfuscatedName("df.ad(I)I")
    public int method2427() {
        return this.field1309;
    }

    @ObfuscatedName("df.at(II)V")
    public void method2430(int arg0) {
        this.field1318 = arg0;
        method3154();
    }

    @ObfuscatedName("df.ay(B)I")
    public int method2505() {
        return this.field1318;
    }

    @ObfuscatedName("df.ae(II)V")
    public void method2429(int arg0) {
        this.field1320 = arg0;
        method3154();
    }

    @ObfuscatedName("df.ac(S)I")
    public int method2455() {
        return this.field1320;
    }

    @ObfuscatedName("df.ab(Ljava/lang/String;I)V")
    public void method2431(String arg0) {
        this.field1322 = arg0;
        method3154();
    }

    @ObfuscatedName("df.av(I)Ljava/lang/String;")
    public String method2512() {
        return this.field1322;
    }

    @ObfuscatedName("df.ap(II)V")
    public void method2433(int arg0) {
        this.field1321 = arg0;
        method3154();
    }

    @ObfuscatedName("df.bu(I)I")
    public int method2422() {
        return this.field1321;
    }

    @ObfuscatedName("df.bo(II)V")
    public void method2435(int arg0) {
        this.field1323 = arg0;
        method3154();
    }

    @ObfuscatedName("df.bd(I)I")
    public int method2436() {
        return this.field1323;
    }

    @ObfuscatedName("df.bi(Ljava/lang/String;IS)V")
    public void method2456(String arg0, int arg1) {
        int var3 = this.method2440(arg0);
        if (this.field1324.size() >= 10 && !this.field1324.containsKey(var3)) {
            Iterator var4 = this.field1324.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1324.put(var3, arg1);
        method3154();
    }

    @ObfuscatedName("df.bq(Ljava/lang/String;I)Z")
    public boolean method2438(String arg0) {
        int var2 = this.method2440(arg0);
        return this.field1324.containsKey(var2);
    }

    @ObfuscatedName("df.ba(Ljava/lang/String;I)I")
    public int method2419(String arg0) {
        int var2 = this.method2440(arg0);
        return this.field1324.containsKey(var2) ? (Integer) this.field1324.get(var2) : 0;
    }

    @ObfuscatedName("df.bt(Ljava/lang/String;I)I")
    public int method2440(String arg0) {
        return class406.method2924(arg0.toLowerCase());
    }
}
