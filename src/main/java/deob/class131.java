package deob;

@ObfuscatedName("fg")
public class class131 implements class370 {

    @ObfuscatedName("fg.at")
    public static final class131 field1535 = new class131(0, 0, (String) null, 0);

    @ObfuscatedName("fg.an")
    public static final class131 field1530 = new class131(1, 1, (String) null, 9);

    @ObfuscatedName("fg.av")
    public static final class131 field1531 = new class131(2, 2, (String) null, 3);

    @ObfuscatedName("fg.as")
    public static final class131 field1532 = new class131(3, 3, (String) null, 6);

    @ObfuscatedName("fg.ax")
    public static final class131 field1533 = new class131(4, 4, (String) null, 1);

    @ObfuscatedName("fg.ap")
    public static final class131 field1534 = new class131(5, 5, (String) null, 3);

    @ObfuscatedName("fg.ab")
    public final int field1539;

    @ObfuscatedName("fg.ak")
    public final int field1536;

    @ObfuscatedName("fg.ae")
    public final int field1537;

    @ObfuscatedName("gz.ab(B)[Lfg;")
    public static class131[] method3098() {
        return new class131[] { field1535, field1530, field1531, field1532, field1533, field1534 };
    }

    public class131(int arg0, int arg1, String arg2, int arg3) {
        this.field1539 = arg0;
        this.field1536 = arg1;
        this.field1537 = arg3;
    }

    @ObfuscatedName("mq.ak(IB)Lfg;")
    public static class131 method5390(int arg0) {
        class131 var1 = (class131) class371.method4632(method3098(), arg0);
        if (var1 == null) {
            var1 = field1535;
        }
        return var1;
    }

    @ObfuscatedName("fg.ae(I)I")
    public int method2853() {
        return this.field1537;
    }

    @ObfuscatedName("fg.at(B)I")
    public int method33() {
        return this.field1536;
    }
}
