package deob;

@ObfuscatedName("eu")
public class class129 implements class353 {

    @ObfuscatedName("eu.aj")
    public static final class129 field1524 = new class129(0, 0, (String) null, 0);

    @ObfuscatedName("eu.al")
    public static final class129 field1535 = new class129(1, 1, (String) null, 9);

    @ObfuscatedName("eu.ac")
    public static final class129 field1525 = new class129(2, 2, (String) null, 3);

    @ObfuscatedName("eu.ab")
    public static final class129 field1526 = new class129(3, 3, (String) null, 6);

    @ObfuscatedName("eu.an")
    public static final class129 field1527 = new class129(4, 4, (String) null, 1);

    @ObfuscatedName("eu.ao")
    public static final class129 field1528 = new class129(5, 5, (String) null, 3);

    @ObfuscatedName("eu.av")
    public final int field1529;

    @ObfuscatedName("eu.aq")
    public final int field1523;

    @ObfuscatedName("eu.ap")
    public final int field1531;

    @ObfuscatedName("fe.ab(B)[Leu;")
    public static class129[] method2897() {
        return new class129[] { field1524, field1535, field1525, field1526, field1527, field1528 };
    }

    public class129(int arg0, int arg1, String arg2, int arg3) {
        this.field1529 = arg0;
        this.field1523 = arg1;
        this.field1531 = arg3;
    }

    @ObfuscatedName("eg.an(II)Leu;")
    public static class129 method2740(int arg0) {
        class129 var1 = (class129) class354.method5197(method2897(), arg0);
        if (var1 == null) {
            var1 = field1524;
        }
        return var1;
    }

    @ObfuscatedName("eu.ao(I)I")
    public int method2869() {
        return this.field1531;
    }

    @ObfuscatedName("eu.aj(I)I")
    public int method33() {
        return this.field1523;
    }
}
