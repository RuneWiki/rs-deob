package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("df")
public class class111 {

    @ObfuscatedName("df.v")
    public boolean[] field1379;

    @ObfuscatedName("df.y")
    public Map field1380;

    @ObfuscatedName("df.j")
    public String[] field1381;

    @ObfuscatedName("df.o")
    public boolean field1384 = false;

    @ObfuscatedName("df.m")
    public long field1383;

    public class111() {
        int var1 = Statics.field1068.method4514(19);
        this.field1380 = new HashMap();
        this.field1379 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class141 var3 = class141.method1752(var2);
            this.field1379[var2] = var3.field1584;
        }
        int var4 = 0;
        if (Statics.field1068.method4468(15)) {
            var4 = Statics.field1068.method4514(15);
        }
        this.field1381 = new String[var4];
        this.method2135();
    }

    @ObfuscatedName("df.f(IIB)V")
    public void method2159(int arg0, int arg1) {
        this.field1380.put(arg0, arg1);
        if (this.field1379[arg0]) {
            this.field1384 = true;
        }
    }

    @ObfuscatedName("df.e(IB)I")
    public int method2133(int arg0) {
        Object var2 = this.field1380.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("df.v(ILjava/lang/String;B)V")
    public void method2128(int arg0, String arg1) {
        this.field1380.put(arg0, arg1);
    }

    @ObfuscatedName("df.y(IB)Ljava/lang/String;")
    public String method2129(int arg0) {
        Object var2 = this.field1380.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("df.j(ILjava/lang/String;I)V")
    public void method2130(int arg0, String arg1) {
        this.field1381[arg0] = arg1;
    }

    @ObfuscatedName("df.o(II)Ljava/lang/String;")
    public String method2131(int arg0) {
        return this.field1381[arg0];
    }

    @ObfuscatedName("df.m(I)V")
    public void method2132() {
        for (int var1 = 0; var1 < this.field1379.length; var1++) {
            if (!this.field1379[var1]) {
                this.field1380.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1381.length; var2++) {
            this.field1381[var2] = null;
        }
    }

    @ObfuscatedName("df.r(ZI)Lnp;")
    public class368 method2126(boolean arg0) {
        return class130.method4424("2", Statics.field2115.field3212, arg0);
    }

    @ObfuscatedName("df.h(I)V")
    public void method2134() {
        class368 var1 = this.method2126(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1380.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1379[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class384.method376((String) var7);
                    }
                    var3++;
                }
            }
            class384 var8 = new class384(var2);
            var8.method5880(2);
            var8.method5881(var3);
            Iterator var9 = this.field1380.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1379[var11]) {
                    var8.method5881(var11);
                    Object var12 = var10.getValue();
                    class376 var13 = class376.method5805(var12.getClass());
                    var8.method5880(var13.field4138);
                    class376.method5806(var12, var8);
                }
            }
            var1.method5728(var8.field4160, 0, var8.field4161);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method5729();
            } catch (Exception var24) {
            }
        }
        this.field1384 = false;
        this.field1383 = class381.method4000();
    }

    @ObfuscatedName("df.d(B)V")
    public void method2135() {
        class368 var1 = this.method2126(false);
        try {
            byte[] var2 = new byte[(int) var1.method5731()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method5732(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class384 var5 = new class384(var2);
            if (var5.field4160.length - var5.field4161 < 1) {
                return;
            }
            int var7 = var5.method5902();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method5899();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method5899();
                    int var12 = var5.method5902();
                    class376[] var13 = new class376[] { class376.field4129, class376.field4135, class376.field4128 };
                    class376 var14 = (class376) class290.method2391(var13, var12);
                    Object var15 = var14.method5804(var5);
                    if (this.field1379[var11]) {
                        this.field1380.put(var11, var15);
                    }
                }
            } else {
                int var16 = var5.method5899();
                for (int var17 = 0; var17 < var16; var17++) {
                    int var18 = var5.method5899();
                    int var19 = var5.method5965();
                    if (this.field1379[var18]) {
                        this.field1380.put(var18, var19);
                    }
                }
                int var20 = var5.method5899();
                for (int var21 = 0; var21 < var20; var21++) {
                    var5.method5899();
                    var5.method5906();
                }
            }
        } catch (Exception var35) {
        } finally {
            try {
                var1.method5729();
            } catch (Exception var34) {
            }
        }
        this.field1384 = false;
    }

    @ObfuscatedName("df.z(I)V")
    public void method2164() {
        if (this.field1384 && this.field1383 < class381.method4000() - 60000L) {
            this.method2134();
        }
    }

    @ObfuscatedName("df.b(I)Z")
    public boolean method2125() {
        return this.field1384;
    }
}
