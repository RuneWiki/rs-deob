package deob;

@ObfuscatedName("ey")
public class class128 implements class370 {

    @ObfuscatedName("ey.at")
    public static final class128 field1495 = new class128(0, 0);

    @ObfuscatedName("ey.an")
    public static final class128 field1487 = new class128(1, 1);

    @ObfuscatedName("ey.av")
    public static final class128 field1488 = new class128(2, 2);

    @ObfuscatedName("ey.as")
    public static final class128 field1489 = new class128(3, 3);

    @ObfuscatedName("ey.ax")
    public static final class128 field1492 = new class128(4, 4);

    @ObfuscatedName("ey.ap")
    public final int field1491;

    @ObfuscatedName("ey.ab")
    public final int field1490;

    @ObfuscatedName("cq.ab(I)[Ley;")
    public static class128[] method1786() {
        return new class128[] { field1495, field1487, field1488, field1489, field1492 };
    }

    public class128(int arg0, int arg1) {
        this.field1491 = arg0;
        this.field1490 = arg1;
    }

    @ObfuscatedName("ey.at(B)I")
    public int method33() {
        return this.field1490;
    }

    @ObfuscatedName("dq.ak(II)Ley;")
    public static class128 method2170(int arg0) {
        class128 var1 = (class128) class371.method4632(method1786(), arg0);
        if (var1 == null) {
            var1 = field1495;
        }
        return var1;
    }
}
