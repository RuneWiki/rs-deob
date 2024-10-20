package deob;

@ObfuscatedName("dq")
public class class119 implements class328 {

    @ObfuscatedName("dq.c")
    public static final class119 field1482 = new class119(0, 0, (String) null, 0);

    @ObfuscatedName("dq.v")
    public static final class119 field1478 = new class119(1, 1, (String) null, 9);

    @ObfuscatedName("dq.q")
    public static final class119 field1479 = new class119(2, 2, (String) null, 3);

    @ObfuscatedName("dq.f")
    public static final class119 field1480 = new class119(3, 3, (String) null, 6);

    @ObfuscatedName("dq.j")
    public static final class119 field1481 = new class119(4, 4, (String) null, 1);

    @ObfuscatedName("dq.e")
    public static final class119 field1485 = new class119(5, 5, (String) null, 3);

    @ObfuscatedName("dq.g")
    public final int field1483;

    @ObfuscatedName("dq.w")
    public final int field1484;

    @ObfuscatedName("dq.y")
    public final int field1487;

    public class119(int arg0, int arg1, String arg2, int arg3) {
        this.field1483 = arg0;
        this.field1484 = arg1;
        this.field1487 = arg3;
    }

    @ObfuscatedName("cc.f(II)Ldq;")
    public static class119 method2019(int arg0) {
        class119[] var1 = new class119[] { field1482, field1478, field1479, field1480, field1481, field1485 };
        class119 var2 = (class119) class329.method2087(var1, arg0);
        if (var2 == null) {
            var2 = field1482;
        }
        return var2;
    }

    @ObfuscatedName("dq.j(I)I")
    public int method2606() {
        return this.field1487;
    }

    @ObfuscatedName("dq.c(B)I")
    public int method33() {
        return this.field1484;
    }
}
