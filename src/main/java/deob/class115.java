package deob;

@ObfuscatedName("dh")
public class class115 implements class315 {

    @ObfuscatedName("dh.c")
    public static final class115 field1391 = new class115(0, 0);

    @ObfuscatedName("dh.b")
    public static final class115 field1384 = new class115(1, 1);

    @ObfuscatedName("dh.p")
    public static final class115 field1385 = new class115(2, 2);

    @ObfuscatedName("dh.m")
    public static final class115 field1392 = new class115(3, 3);

    @ObfuscatedName("dh.t")
    public static final class115 field1387 = new class115(4, 4);

    @ObfuscatedName("dh.s")
    public final int field1388;

    @ObfuscatedName("dh.j")
    public final int field1389;

    @ObfuscatedName("cv.c(I)[Ldh;")
    public static class115[] method2146() {
        return new class115[] { field1391, field1384, field1385, field1392, field1387 };
    }

    public class115(int arg0, int arg1) {
        this.field1388 = arg0;
        this.field1389 = arg1;
    }

    @ObfuscatedName("dh.b(B)I")
    public int method46() {
        return this.field1389;
    }

    @ObfuscatedName("cp.p(II)Ldh;")
    public static class115 method2057(int arg0) {
        class115 var1 = (class115) class316.method2616(method2146(), arg0);
        if (var1 == null) {
            var1 = field1391;
        }
        return var1;
    }
}
