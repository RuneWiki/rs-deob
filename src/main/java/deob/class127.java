package deob;

@ObfuscatedName("dj")
public class class127 implements class346 {

    @ObfuscatedName("dj.h")
    public static final class127 field1566 = new class127(0, 0, (String) null, 0);

    @ObfuscatedName("dj.e")
    public static final class127 field1564 = new class127(1, 1, (String) null, 9);

    @ObfuscatedName("dj.v")
    public static final class127 field1568 = new class127(2, 2, (String) null, 3);

    @ObfuscatedName("dj.x")
    public static final class127 field1565 = new class127(3, 3, (String) null, 6);

    @ObfuscatedName("dj.m")
    public static final class127 field1567 = new class127(4, 4, (String) null, 1);

    @ObfuscatedName("dj.q")
    public static final class127 field1563 = new class127(5, 5, (String) null, 3);

    @ObfuscatedName("dj.f")
    public final int field1569;

    @ObfuscatedName("dj.r")
    public final int field1571;

    @ObfuscatedName("dj.u")
    public final int field1572;

    public class127(int arg0, int arg1, String arg2, int arg3) {
        this.field1569 = arg0;
        this.field1571 = arg1;
        this.field1572 = arg3;
    }

    @ObfuscatedName("ms.h(II)Ldj;")
    public static class127 method6038(int arg0) {
        class127[] var1 = new class127[] { field1566, field1564, field1568, field1565, field1567, field1563 };
        class127 var2 = (class127) class347.method1688(var1, arg0);
        if (var2 == null) {
            var2 = field1566;
        }
        return var2;
    }

    @ObfuscatedName("dj.v(I)I")
    public int method2826() {
        return this.field1572;
    }

    @ObfuscatedName("dj.e(B)I")
    public int method32() {
        return this.field1571;
    }
}
