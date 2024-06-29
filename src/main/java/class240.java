import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class240 extends class178 {

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field4413 = 0;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lqe;")
    public static class179 field4417 = class206.method1380(" Sekunde(Xn(Y -Ubertragen)3", (byte) -128);

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field4419 = 0;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field4415 = 2;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lqe;")
    public static class179 field4414 = class206.method1380("null", (byte) -128);

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lqe;")
    public static class179 field4420 = class206.method1380("(U", (byte) -127);

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field4416 = 0;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lqe;")
    private static class179 field4410 = class206.method1380("Please contact customer support)3", (byte) -126);

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lqe;")
    public static class179 field4408 = field4410;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Leh;")
    public static class52 field4412;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([Lae;II)V")
    public static final void method1555(class6[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class6 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field128 == 0) {
                    if (var4.field206 != null) {
                        method1555(var4.field206, -1, arg2);
                    }
                    class98 var5 = (class98) class36.field797.method909(-1, (long) var4.field173);
                    if (var5 != null) {
                        class193.method1296(var5.field1831, (byte) 110, arg2);
                    }
                }
                if (arg2 == 0 && var4.field178 != null) {
                    class19 var6 = new class19();
                    var6.field491 = var4.field178;
                    var6.field499 = var4;
                    class102.method681(200000, var6);
                }
                if (arg2 == 1 && var4.field146 != null) {
                    if (var4.field130 >= 0) {
                        class6 var7 = class87.method580(var4.field173, 40);
                        if (var7 == null || var7.field206 == null || var7.field206.length <= var4.field130 || var7.field206[var4.field130] != var4) {
                            continue;
                        }
                    }
                    class19 var8 = new class19();
                    var8.field499 = var4;
                    var8.field491 = var4.field146;
                    class102.method681(200000, var8);
                }
            }
        }
        if (arg1 != -1) {
            field4419 = 113;
        }
        field4421++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)I")
    public static final int method1556(int arg0, int arg1, int arg2) {
        if (arg1 != 100) {
            field4417 = null;
        }
        field4418++;
        int var3 = arg0 >> 31 & arg2 - 1;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public static void method1557(int arg0) {
        if (arg0 != -5973) {
            return;
        }
        field4408 = null;
        field4417 = null;
        field4414 = null;
        field4410 = null;
        field4420 = null;
        field4412 = null;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I")
    public static final int method1558(int arg0) {
        field4409++;
        if (class55.field1218 == 3.0D) {
            return 37;
        } else if (class55.field1218 == 4.0D) {
            return 50;
        } else if (arg0 <= 61) {
            return 30;
        } else if (class55.field1218 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }
}
