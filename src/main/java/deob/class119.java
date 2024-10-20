package deob;

@ObfuscatedName("df")
public class class119 implements class329 {

    @ObfuscatedName("df.v")
    public static final class119 field1434 = new class119(0, 0, (String) null, 0);

    @ObfuscatedName("df.c")
    public static final class119 field1431 = new class119(1, 1, (String) null, 9);

    @ObfuscatedName("df.i")
    public static final class119 field1432 = new class119(2, 2, (String) null, 3);

    @ObfuscatedName("df.f")
    public static final class119 field1433 = new class119(3, 3, (String) null, 6);

    @ObfuscatedName("df.b")
    public static final class119 field1435 = new class119(4, 4, (String) null, 1);

    @ObfuscatedName("df.n")
    public static final class119 field1430 = new class119(5, 5, (String) null, 3);

    @ObfuscatedName("df.s")
    public final int field1438;

    @ObfuscatedName("df.l")
    public final int field1437;

    @ObfuscatedName("df.q")
    public final int field1436;

    @ObfuscatedName("g.f(I)[Ldf;")
    public static class119[] method253() {
        return new class119[] { field1434, field1431, field1432, field1433, field1435, field1430 };
    }

    public class119(int arg0, int arg1, String arg2, int arg3) {
        this.field1438 = arg0;
        this.field1437 = arg1;
        this.field1436 = arg3;
    }

    @ObfuscatedName("ni.b(II)Ldf;")
    public static class119 method6219(int arg0) {
        class119 var1 = (class119) class330.method4919(method253(), arg0);
        if (var1 == null) {
            var1 = field1434;
        }
        return var1;
    }

    @ObfuscatedName("df.n(I)I")
    public int method2614() {
        return this.field1436;
    }

    @ObfuscatedName("df.v(B)I")
    public int method38() {
        return this.field1437;
    }
}
