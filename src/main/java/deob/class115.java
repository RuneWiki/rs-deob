package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ei")
public class class115 {

    @ObfuscatedName("ei.ag")
    public boolean[] field1465;

    @ObfuscatedName("ei.am")
    public Map field1466;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ei.ax")
    public String[] field1467;

    @ObfuscatedName("ei.aq")
    public boolean field1470 = false;

    @ObfuscatedName("ei.af")
    public long field1469;

    public class115() {
        int var1 = Statics.field355.method6792(19);
        this.field1466 = new HashMap();
        this.field1465 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class185 var3 = Statics.method2771(var2);
            this.field1465[var2] = var3.field1924;
        }
        int var4 = 0;
        if (Statics.field355.method6740(15)) {
            var4 = Statics.field355.method6792(15);
        }
        this.field1467 = new String[var4];
        this.method2876();
    }

    @ObfuscatedName("ei.ac(III)V")
    public void method2913(int arg0, int arg1) {
        this.field1466.put(arg0, arg1);
        if (this.field1465[arg0]) {
            this.field1470 = true;
        }
    }

    @ObfuscatedName("ei.ae(IB)I")
    public int method2891(int arg0) {
        Object var2 = this.field1466.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ei.ag(ILjava/lang/String;I)V")
    public void method2885(int arg0, String arg1) {
        this.field1466.put(arg0, arg1);
    }

    @ObfuscatedName("ei.am(IB)Ljava/lang/String;")
    public String method2879(int arg0) {
        Object var2 = this.field1466.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ei.ax(ILjava/lang/String;B)V")
    public void method2880(int arg0, String arg1) {
        this.field1467[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ei.aq(IB)Ljava/lang/String;")
    public String method2877(int arg0) {
        return this.field1467[arg0];
    }

    @ObfuscatedName("ei.af(I)V")
    public void method2914() {
        for (int var1 = 0; var1 < this.field1465.length; var1++) {
            if (!this.field1465[var1]) {
                this.field1466.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1467.length; var2++) {
            this.field1467[var2] = null;
        }
    }

    @ObfuscatedName("ei.at(ZI)Lud;")
    public class530 method2909(boolean arg0) {
        return class221.method6707("2", Statics.field3604.field4100, arg0);
    }

    @ObfuscatedName("ei.au(I)V")
    public void method2884() {
        class530 var1 = this.method2909(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1466.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1465[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class551.method8819((String) var7);
                    }
                    var3++;
                }
            }
            class551 var8 = new class551(var2);
            var8.method9022(2);
            var8.method8958(var3);
            Iterator var9 = this.field1466.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1465[var11]) {
                    var8.method8958(var11);
                    Object var12 = var10.getValue();
                    class538 var13 = class538.method8821(var12.getClass());
                    var8.method9022(var13.field5335);
                    class538.method8822(var12, var8);
                }
            }
            var1.method8732(var8.field5413, 0, var8.field5415);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method8725();
            } catch (Exception var24) {
            }
        }
        this.field1470 = false;
        this.field1469 = class331.method3482();
    }

    @ObfuscatedName("ei.ar(I)V")
    public void method2876() {
        class530 var1 = this.method2909(false);
        label218: {
            try {
                byte[] var2 = new byte[(int) var1.method8727()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8728(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class551 var5 = new class551(var2);
                if (var5.field5413.length - var5.field5415 < 1) {
                    return;
                }
                int var7 = var5.method8955();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method9119();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label218;
                            }
                            int var11 = var5.method9119();
                            int var12 = var5.method8955();
                            class538 var13 = (class538) class405.method6719(class538.method8833(), var12);
                            Object var14 = var13.method8823(var5);
                            if (var11 >= 0 && var11 < this.field1465.length && this.field1465[var11]) {
                                this.field1466.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method9119();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method9119();
                            int var18 = var5.method9110();
                            if (var17 >= 0 && var17 < this.field1465.length && this.field1465[var17]) {
                                this.field1466.put(var17, var18);
                            }
                        }
                        int var19 = var5.method9119();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label218;
                            }
                            var5.method9119();
                            var5.method9166();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label218;
            } finally {
                try {
                    var1.method8725();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1470 = false;
    }

    @ObfuscatedName("ei.al(I)V")
    public void method2886() {
        if (this.field1470 && this.field1469 < class331.method3482() - 60000L) {
            this.method2884();
        }
    }

    @ObfuscatedName("ei.ad(B)Z")
    public boolean method2887() {
        return this.field1470;
    }
}
