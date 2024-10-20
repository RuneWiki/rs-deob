package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("eb")
public class class113 {

    @ObfuscatedName("eb.ag")
    public boolean[] field1445;

    @ObfuscatedName("eb.ak")
    public Map field1441;

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("eb.ap")
    public String[] field1442;

    @ObfuscatedName("eb.an")
    public boolean field1443 = false;

    @ObfuscatedName("eb.aj")
    public long field1444;

    public class113() {
        int var1 = Statics.field462.method6549(19);
        this.field1441 = new HashMap();
        this.field1445 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class183 var3 = (class183) class183.field1916.method5495((long) var2);
            class183 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3646.method6539(19, var2);
                class183 var6 = new class183();
                if (var5 != null) {
                    var6.method3313(new class547(var5));
                }
                class183.field1916.method5498(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1445[var2] = var4.field1915;
        }
        int var8 = 0;
        if (Statics.field462.method6507(15)) {
            var8 = Statics.field462.method6549(15);
        }
        this.field1442 = new String[var8];
        this.method2711();
    }

    @ObfuscatedName("eb.aq(IIB)V")
    public void method2702(int arg0, int arg1) {
        this.field1441.put(arg0, arg1);
        if (this.field1445[arg0]) {
            this.field1443 = true;
        }
    }

    @ObfuscatedName("eb.ad(IB)I")
    public int method2743(int arg0) {
        Object var2 = this.field1441.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("eb.ag(ILjava/lang/String;I)V")
    public void method2704(int arg0, String arg1) {
        this.field1441.put(arg0, arg1);
    }

    @ObfuscatedName("eb.ak(II)Ljava/lang/String;")
    public String method2722(int arg0) {
        Object var2 = this.field1441.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("eb.ap(ILjava/lang/String;I)V")
    public void method2706(int arg0, String arg1) {
        this.field1442[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("eb.an(IB)Ljava/lang/String;")
    public String method2707(int arg0) {
        return this.field1442[arg0];
    }

    @ObfuscatedName("eb.aj(I)V")
    public void method2708() {
        for (int var1 = 0; var1 < this.field1445.length; var1++) {
            if (!this.field1445[var1]) {
                this.field1441.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1442.length; var2++) {
            this.field1442[var2] = null;
        }
    }

    @ObfuscatedName("eb.av(ZI)Lus;")
    public class527 method2736(boolean arg0) {
        return class218.method2875("2", Statics.field1401.field4084, arg0);
    }

    @ObfuscatedName("eb.ab(I)V")
    public void method2710() {
        class527 var1 = this.method2736(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1441.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1445[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class547.method2396((String) var7);
                    }
                    var3++;
                }
            }
            class547 var8 = new class547(var2);
            var8.method8711(2);
            var8.method8712(var3);
            Iterator var9 = this.field1441.entrySet().iterator();
            label143: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method8511(var8.field5364, 0, var8.field5363);
                        break label143;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1445[var11]);
                var8.method8712(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class535[] var14 = class535.method8593();
                int var15 = 0;
                class535 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class535 var16 = var14[var15];
                    if (var16.field5292 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method8711(var17.field5289);
                class535.method8587(var12, var8);
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method8506();
            } catch (Exception var29) {
            }
        }
        this.field1443 = false;
        this.field1444 = class327.method4500();
    }

    @ObfuscatedName("eb.ai(B)V")
    public void method2711() {
        class527 var1 = this.method2736(false);
        label220: {
            try {
                byte[] var2 = new byte[(int) var1.method8508()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method8524(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class547 var5 = new class547(var2);
                if (var5.field5364.length - var5.field5363 >= 1) {
                    int var7 = var5.method8804();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method8899();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label220;
                            }
                            int var11 = var5.method8899();
                            int var12 = var5.method8804();
                            class535 var13 = (class535) class402.method3799(class535.method8593(), var12);
                            Object var14 = var13.method8589(var5);
                            if (var11 >= 0 && var11 < this.field1445.length && this.field1445[var11]) {
                                this.field1441.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method8899();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method8899();
                            int var18 = var5.method8734();
                            if (var17 >= 0 && var17 < this.field1445.length && this.field1445[var17]) {
                                this.field1441.put(var17, var18);
                            }
                        }
                        int var19 = var5.method8899();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label220;
                            }
                            var5.method8899();
                            var5.method8739();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label220;
            } finally {
                try {
                    var1.method8506();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1443 = false;
    }

    @ObfuscatedName("eb.ae(I)V")
    public void method2712() {
        if (this.field1443 && this.field1444 < class327.method4500() - 60000L) {
            this.method2710();
        }
    }

    @ObfuscatedName("eb.au(B)Z")
    public boolean method2713() {
        return this.field1443;
    }
}
