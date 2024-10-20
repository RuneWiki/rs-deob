package deob;

@ObfuscatedName("de")
public class class124 implements class350 {

    @ObfuscatedName("de.f")
    public static final class124 field1503 = new class124(0, 0);

    @ObfuscatedName("de.w")
    public static final class124 field1505 = new class124(1, 1);

    @ObfuscatedName("de.v")
    public static final class124 field1504 = new class124(2, 2);

    @ObfuscatedName("de.s")
    public static final class124 field1507 = new class124(3, 3);

    @ObfuscatedName("de.z")
    public static final class124 field1506 = new class124(4, 4);

    @ObfuscatedName("de.j")
    public final int field1509;

    @ObfuscatedName("de.i")
    public final int field1508;

    @ObfuscatedName("di.v(I)[Lde;")
    public static class124[] method2715() {
        return new class124[] { field1503, field1505, field1504, field1507, field1506 };
    }

    public class124(int arg0, int arg1) {
        this.field1509 = arg0;
        this.field1508 = arg1;
    }

    @ObfuscatedName("de.f(B)I")
    public int method46() {
        return this.field1508;
    }

    @ObfuscatedName("cs.s(IB)Lde;")
    public static class124 method2190(int arg0) {
        class124 var1 = (class124) class351.method19(method2715(), arg0);
        if (var1 == null) {
            var1 = field1503;
        }
        return var1;
    }
}
