package deob;

@ObfuscatedName("dl")
public class class119 implements class329 {

    @ObfuscatedName("dl.o")
    public static final class119 field1499 = new class119(0, 0, (String) null, 0);

    @ObfuscatedName("dl.q")
    public static final class119 field1492 = new class119(1, 1, (String) null, 9);

    @ObfuscatedName("dl.l")
    public static final class119 field1493 = new class119(2, 2, (String) null, 3);

    @ObfuscatedName("dl.k")
    public static final class119 field1500 = new class119(3, 3, (String) null, 6);

    @ObfuscatedName("dl.a")
    public static final class119 field1491 = new class119(4, 4, (String) null, 1);

    @ObfuscatedName("dl.m")
    public static final class119 field1496 = new class119(5, 5, (String) null, 3);

    @ObfuscatedName("dl.p")
    public final int field1497;

    @ObfuscatedName("dl.s")
    public final int field1498;

    @ObfuscatedName("dl.r")
    public final int field1494;

    @ObfuscatedName("ct.k(I)[Ldl;")
    public static class119[] method2214() {
        return new class119[] { field1499, field1492, field1493, field1500, field1491, field1496 };
    }

    public class119(int arg0, int arg1, String arg2, int arg3) {
        this.field1497 = arg0;
        this.field1498 = arg1;
        this.field1494 = arg3;
    }

    @ObfuscatedName("fd.a(II)Ldl;")
    public static class119 method2906(int arg0) {
        class119 var1 = (class119) class330.method4934(method2214(), arg0);
        if (var1 == null) {
            var1 = field1499;
        }
        return var1;
    }

    @ObfuscatedName("dl.m(I)I")
    public int method2587() {
        return this.field1494;
    }

    @ObfuscatedName("dl.o(B)I")
    public int method40() {
        return this.field1498;
    }
}
