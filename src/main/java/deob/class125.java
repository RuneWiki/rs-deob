package deob;

@ObfuscatedName("dc")
public class class125 implements class330 {

    @ObfuscatedName("dc.c")
    public static final class125 field1532 = new class125(0, 0);

    @ObfuscatedName("dc.p")
    public static final class125 field1529 = new class125(1, 1);

    @ObfuscatedName("dc.f")
    public static final class125 field1526 = new class125(2, 2);

    @ObfuscatedName("dc.n")
    public static final class125 field1524 = new class125(3, 3);

    @ObfuscatedName("dc.k")
    public static final class125 field1528 = new class125(4, 4);

    @ObfuscatedName("dc.w")
    public static final class125 field1527 = new class125(5, 5);

    @ObfuscatedName("dc.s")
    public static final class125 field1530 = new class125(6, 6);

    @ObfuscatedName("dc.q")
    public static final class125 field1531 = new class125(7, 7);

    @ObfuscatedName("dc.m")
    public static final class125 field1525 = new class125(8, 8);

    @ObfuscatedName("dc.x")
    public final int field1533;

    @ObfuscatedName("dc.j")
    public final int field1534;

    @ObfuscatedName("ci.c(B)[Ldc;")
    public static class125[] method2465() {
        return new class125[] { field1532, field1529, field1526, field1524, field1528, field1527, field1530, field1531, field1525 };
    }

    public class125(int arg0, int arg1) {
        this.field1533 = arg0;
        this.field1534 = arg1;
    }

    @ObfuscatedName("dc.p(B)I")
    public int method42() {
        return this.field1534;
    }

    @ObfuscatedName("ky.f(II)Ldc;")
    public static class125 method5350(int arg0) {
        class125 var1 = (class125) class331.method5118(method2465(), arg0);
        if (var1 == null) {
            var1 = field1525;
        }
        return var1;
    }
}
