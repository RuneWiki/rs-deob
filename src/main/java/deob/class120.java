package deob;

@ObfuscatedName("dv")
public class class120 implements class330 {

    @ObfuscatedName("dv.c")
    public static final class120 field1481 = new class120(0, 0, (String) null, 0);

    @ObfuscatedName("dv.p")
    public static final class120 field1471 = new class120(1, 1, (String) null, 9);

    @ObfuscatedName("dv.f")
    public static final class120 field1474 = new class120(2, 2, (String) null, 3);

    @ObfuscatedName("dv.n")
    public static final class120 field1473 = new class120(3, 3, (String) null, 6);

    @ObfuscatedName("dv.k")
    public static final class120 field1472 = new class120(4, 4, (String) null, 1);

    @ObfuscatedName("dv.w")
    public static final class120 field1475 = new class120(5, 5, (String) null, 3);

    @ObfuscatedName("dv.s")
    public final int field1476;

    @ObfuscatedName("dv.q")
    public final int field1477;

    @ObfuscatedName("dv.m")
    public final int field1482;

    public class120(int arg0, int arg1, String arg2, int arg3) {
        this.field1476 = arg0;
        this.field1477 = arg1;
        this.field1482 = arg3;
    }

    @ObfuscatedName("in.c(II)Ldv;")
    public static class120 method4737(int arg0) {
        class120[] var1 = new class120[] { field1481, field1471, field1474, field1473, field1472, field1475 };
        class120 var2 = (class120) class331.method5118(var1, arg0);
        if (var2 == null) {
            var2 = field1481;
        }
        return var2;
    }

    @ObfuscatedName("dv.f(I)I")
    public int method2773() {
        return this.field1482;
    }

    @ObfuscatedName("dv.p(B)I")
    public int method42() {
        return this.field1477;
    }
}
