package deob;

@ObfuscatedName("dl")
public class class117 implements class320 {

    @ObfuscatedName("dl.c")
    public static final class117 field1444 = new class117(0, 0, (String) null, 0);

    @ObfuscatedName("dl.l")
    public static final class117 field1437 = new class117(1, 1, (String) null, 9);

    @ObfuscatedName("dl.s")
    public static final class117 field1440 = new class117(2, 2, (String) null, 3);

    @ObfuscatedName("dl.e")
    public static final class117 field1439 = new class117(3, 3, (String) null, 6);

    @ObfuscatedName("dl.r")
    public static final class117 field1442 = new class117(4, 4, (String) null, 1);

    @ObfuscatedName("dl.o")
    public static final class117 field1441 = new class117(5, 5, (String) null, 3);

    @ObfuscatedName("dl.i")
    public final int field1438;

    @ObfuscatedName("dl.w")
    public final int field1443;

    @ObfuscatedName("dl.v")
    public final int field1436;

    public class117(int arg0, int arg1, String arg2, int arg3) {
        this.field1438 = arg0;
        this.field1443 = arg1;
        this.field1436 = arg3;
    }

    @ObfuscatedName("dm.e(IB)Ldl;")
    public static class117 method2476(int arg0) {
        class117[] var1 = new class117[] { field1444, field1437, field1440, field1439, field1442, field1441 };
        class117 var2 = (class117) class321.method2696(var1, arg0);
        if (var2 == null) {
            var2 = field1444;
        }
        return var2;
    }

    @ObfuscatedName("dl.r(B)I")
    public int method2512() {
        return this.field1436;
    }

    @ObfuscatedName("dl.c(I)I")
    public int method38() {
        return this.field1443;
    }
}
