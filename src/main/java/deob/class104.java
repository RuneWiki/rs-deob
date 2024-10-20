package deob;

@ObfuscatedName("x")
public final class class104 extends class13 {

    @ObfuscatedName("x.g")
    public int field1417;

    @ObfuscatedName("x.d")
    public int field1415;

    @ObfuscatedName("x.e")
    public class181 field1422;

    @ObfuscatedName("x.b")
    public int field1409;

    @ObfuscatedName("x.c")
    public int field1410;

    @ObfuscatedName("x.a")
    public int[] field1419;

    @ObfuscatedName("x.m")
    public int field1412;

    @ObfuscatedName("x.j")
    public class180 field1416;

    @ObfuscatedName("x.k")
    public class180 field1421;

    @ObfuscatedName("x.i")
    public int field1411;

    @ObfuscatedName("x.v")
    public static class71 field1424 = new class71();

    @ObfuscatedName("x.u")
    public int field1423;

    @ObfuscatedName("x.z")
    public int field1413;

    @ObfuscatedName("x.y")
    public int field1418;

    @ObfuscatedName("x.x")
    public int field1414;

    @ObfuscatedName("x.v(B)V")
    public void method1508() {
        int var1 = this.field1415;
        class181 var2 = this.field1422.method3392();
        if (var2 == null) {
            this.field1415 = -1;
            this.field1414 = 0;
            this.field1417 = 0;
            this.field1418 = 0;
            this.field1419 = null;
        } else {
            this.field1415 = var2.field2803;
            this.field1414 = var2.field2804 * 128;
            this.field1417 = var2.field2808;
            this.field1418 = var2.field2806;
            this.field1419 = var2.field2796;
        }
        if (this.field1415 != var1 && this.field1416 != null) {
            Statics.field2665.method2835(this.field1416);
            this.field1416 = null;
        }
    }

    @ObfuscatedName("as.c(IIILaa;IB)V")
    public static void method2973(int arg0, int arg1, int arg2, class181 arg3, int arg4) {
        class104 var5 = new class104();
        var5.field1410 = arg0;
        var5.field1409 = arg1 * 128;
        var5.field1411 = arg2 * 128;
        int var6 = arg3.field2791;
        int var7 = arg3.field2758;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2758;
            var7 = arg3.field2791;
        }
        var5.field1412 = (arg1 + var6) * 128;
        var5.field1413 = (arg2 + var7) * 128;
        var5.field1415 = arg3.field2803;
        var5.field1414 = arg3.field2804 * 128;
        var5.field1417 = arg3.field2808;
        var5.field1418 = arg3.field2806;
        var5.field1419 = arg3.field2796;
        if (arg3.field2800 != null) {
            var5.field1422 = arg3;
            var5.method1508();
        }
        field1424.method1099(var5);
        if (var5.field1419 != null) {
            var5.field1423 = var5.field1417 + (int) (Math.random() * (double) (var5.field1418 - var5.field1417));
        }
    }
}
