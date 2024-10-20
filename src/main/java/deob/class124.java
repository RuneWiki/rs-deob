package deob;

@ObfuscatedName("df")
public class class124 implements class328 {

    @ObfuscatedName("df.c")
    public static final class124 field1536 = new class124(0, 0);

    @ObfuscatedName("df.v")
    public static final class124 field1530 = new class124(1, 1);

    @ObfuscatedName("df.q")
    public static final class124 field1543 = new class124(2, 2);

    @ObfuscatedName("df.f")
    public static final class124 field1532 = new class124(3, 3);

    @ObfuscatedName("df.j")
    public static final class124 field1537 = new class124(4, 4);

    @ObfuscatedName("df.e")
    public static final class124 field1534 = new class124(5, 5);

    @ObfuscatedName("df.g")
    public static final class124 field1535 = new class124(6, 6);

    @ObfuscatedName("df.w")
    public static final class124 field1533 = new class124(7, 7);

    @ObfuscatedName("df.y")
    public static final class124 field1529 = new class124(8, 8);

    @ObfuscatedName("df.i")
    public final int field1538;

    @ObfuscatedName("df.s")
    public final int field1539;

    @ObfuscatedName("bt.f(I)[Ldf;")
    public static class124[] method1777() {
        return new class124[] { field1536, field1530, field1543, field1532, field1537, field1534, field1535, field1533, field1529 };
    }

    public class124(int arg0, int arg1) {
        this.field1538 = arg0;
        this.field1539 = arg1;
    }

    @ObfuscatedName("df.c(B)I")
    public int method33() {
        return this.field1539;
    }

    @ObfuscatedName("bg.j(II)Ldf;")
    public static class124 method982(int arg0) {
        class124 var1 = (class124) class329.method2087(method1777(), arg0);
        if (var1 == null) {
            var1 = field1529;
        }
        return var1;
    }
}
