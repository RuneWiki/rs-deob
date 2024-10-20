package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ev")
public class class110 {

    @ObfuscatedName("ev.af")
    public boolean[] field1387;

    @ObfuscatedName("ev.aj")
    public Map field1388;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ev.aq")
    public String[] field1389;

    @ObfuscatedName("ev.ar")
    public boolean field1386 = false;

    @ObfuscatedName("ev.ag")
    public long field1391;

    public class110() {
        int var1 = Statics.field243.method6406(19);
        this.field1388 = new HashMap();
        this.field1387 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class179 var3 = (class179) class179.field1866.method5400((long) var2);
            class179 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1865.method6396(19, var2);
                class179 var6 = new class179();
                if (var5 != null) {
                    var6.method3313(new class531(var5));
                }
                class179.field1866.method5402(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1387[var2] = var4.field1867;
        }
        int var8 = 0;
        if (Statics.field243.method6349(15)) {
            var8 = Statics.field243.method6406(15);
        }
        this.field1389 = new String[var8];
        this.method2706();
    }

    @ObfuscatedName("ev.am(III)V")
    public void method2679(int arg0, int arg1) {
        this.field1388.put(arg0, arg1);
        if (this.field1387[arg0]) {
            this.field1386 = true;
        }
    }

    @ObfuscatedName("ev.ap(IB)I")
    public int method2668(int arg0) {
        Object var2 = this.field1388.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ev.af(ILjava/lang/String;S)V")
    public void method2708(int arg0, String arg1) {
        this.field1388.put(arg0, arg1);
    }

    @ObfuscatedName("ev.aj(II)Ljava/lang/String;")
    public String method2670(int arg0) {
        Object var2 = this.field1388.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ev.aq(ILjava/lang/String;I)V")
    public void method2673(int arg0, String arg1) {
        this.field1389[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ev.ar(II)Ljava/lang/String;")
    public String method2674(int arg0) {
        return this.field1389[arg0];
    }

    @ObfuscatedName("ev.ag(B)V")
    public void method2709() {
        for (int var1 = 0; var1 < this.field1387.length; var1++) {
            if (!this.field1387[var1]) {
                this.field1388.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1389.length; var2++) {
            this.field1389[var2] = null;
        }
    }

    @ObfuscatedName("ev.ao(ZB)Ltt;")
    public class511 method2676(boolean arg0) {
        return class213.method6289("2", Statics.field4.field3950, arg0);
    }

    @ObfuscatedName("ev.ae(I)V")
    public void method2677() {
        class511 var1 = this.method2676(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1388.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1387[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class531.method4114((String) var7);
                    }
                    var3++;
                }
            }
            class531 var8 = new class531(var2);
            var8.method8699(2);
            var8.method8737(var3);
            Iterator var9 = this.field1388.entrySet().iterator();
            label143: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method8348(var8.field5178, 0, var8.field5181);
                        break label143;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1387[var11]);
                var8.method8737(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class519[] var14 = class519.method8439();
                int var15 = 0;
                class519 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class519 var16 = var14[var15];
                    if (var16.field5107 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method8699(var17.field5108);
                class519.method8427(var12, var8);
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method8352();
            } catch (Exception var29) {
            }
        }
        this.field1386 = false;
        this.field1391 = Statics.method2852();
    }

    @ObfuscatedName("ev.aa(I)V")
    public void method2706() {
        class511 var1 = this.method2676(false);
        label219: {
            try {
                byte[] var2 = new byte[(int) var1.method8350()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8351(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class531 var5 = new class531(var2);
                if (var5.field5178.length - var5.field5181 >= 1) {
                    int var7 = var5.method8561();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method8775();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label219;
                            }
                            int var11 = var5.method8775();
                            int var12 = var5.method8561();
                            class519 var13 = (class519) class389.method6514(class519.method8439(), var12);
                            Object var14 = var13.method8428(var5);
                            if (var11 >= 0 && var11 < this.field1387.length && this.field1387[var11]) {
                                this.field1388.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method8775();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method8775();
                            int var18 = var5.method8566();
                            if (var17 >= 0 && var17 < this.field1387.length && this.field1387[var17]) {
                                this.field1388.put(var17, var18);
                            }
                        }
                        int var19 = var5.method8775();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label219;
                            }
                            var5.method8775();
                            var5.method8641();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label219;
            } finally {
                try {
                    var1.method8352();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1386 = false;
    }

    @ObfuscatedName("ev.au(I)V")
    public void method2686() {
        if (this.field1386 && this.field1391 < Statics.method2852() - 60000L) {
            this.method2677();
        }
    }

    @ObfuscatedName("ev.an(B)Z")
    public boolean method2680() {
        return this.field1386;
    }
}
