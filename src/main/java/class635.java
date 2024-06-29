import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class635 extends class656 {

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lro;")
    public class2 field8446 = new class2();

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lkaa;")
    public static class47 field8449 = new class47(15, -1);

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Lqr;")
    public static class65 field8452 = new class65(8);

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lwu;")
    public static class376 field8447;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Z")
    public static boolean field8451;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method3484(int arg0) {
        field8452 = null;
        field8447 = null;
        int var1 = 97 % ((arg0 + 20) / 36);
        field8449 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I")
    public static final int method3485(int arg0, int arg1, int arg2) {
        if (arg0 != 27908) {
            return 37;
        }
        field8448++;
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static final void method3486(int arg0) {
        if (arg0 != 7951) {
            method3487(null, false, false);
        }
        field8450++;
        for (class302 var1 = (class302) class409.field5677.method21(2); var1 != null; var1 = (class302) class409.field5677.method9(-127)) {
            if (var1.field4288) {
                var1.method3564(true);
            } else {
                var1.field4279 = true;
                if (var1.field4286 >= 0 && var1.field4289 >= 0 && class719.field10004 > var1.field4286 && class107.field1453 > var1.field4289) {
                    class207.method1382(var1, false);
                }
            }
        }
        for (class302 var2 = (class302) class271.field3785.method21(arg0 - 7949); var2 != null; var2 = (class302) class271.field3785.method9(-128)) {
            if (var2.field4288) {
                var2.method3564(true);
            } else {
                var2.field4279 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lkf;ZZ)V")
    public static final void method3487(class256 arg0, boolean arg1, boolean arg2) {
        arg0.field3503 = arg2;
        if (!class260.field3627) {
            class401.method2362(arg0, class423.field5833);
        } else if (arg1) {
            class289.field4110[class289.field4110.length - 1].method995(false, arg0);
        } else {
            int var3 = class722.method4064(arg0.field3500);
            int var4 = class692.field9642[2] * arg0.method791((byte) 100) / arg0.field3509;
            int var5 = class722.method4064(arg0.field3500 - var4);
            int var6 = class722.method4064(arg0.field3500 + var4);
            if (var5 == var6) {
                class289.field4110[var3].method995(false, arg0);
            } else if (var6 - var5 == 1) {
                class289.field4110[class333.field4736 + var5].method995(false, arg0);
            } else {
                class289.field4110[class289.field4110.length - 1].method995(false, arg0);
            }
        }
    }
}
