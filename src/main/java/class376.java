import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class376 extends class323 {

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Ldr;")
    public static class675 field4835 = new class675(4, 4);

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Lpfa;")
    public static class275 field4837;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILxa;BIIILfa;Lrr;)V")
    public static final void method2169(int arg0, class468 arg1, byte arg2, int arg3, int arg4, int arg5, class219 arg6, class337 arg7) {
        ++field4838;
        if (arg1 != null) {
            if (arg2 != 17) {
                field4835 = null;
            }
            int var8;
            if (class385.field4946 != 4) {
                var8 = (int) class689.field9561 + class290.field3661 & 16383;
            } else {
                var8 = (int) class689.field9561 & 16383;
            }
            int var9 = Math.max(arg7.field4309 / 2, arg7.field4211 / 2) - -10;
            int var10 = arg0 * arg0 + arg3 * arg3;
            if (var9 * var9 >= var10) {
                int var11 = class243.field3129[var8];
                int var12 = class243.field3128[var8];
                if (class385.field4946 != 4) {
                    var12 = var12 * 256 / (class352.field4559 + 256);
                    var11 = var11 * 256 / (class352.field4559 + 256);
                }
                int var13 = arg3 * var11 - -(arg0 * var12) >> 14;
                int var14 = arg3 * var12 + -(arg0 * var11) >> 14;
                arg1.method1557(arg7.field4309 / 2 + arg5 - -var13 + -(arg1.method1552() / 2), arg7.field4211 / 2 + -var14 + arg4 + -(arg1.method1549() / 2), arg6, arg5, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lpfa;Lpfa;Lio;)V")
    public class376(class275 arg0, class275 arg1, class406 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static final void method2170(boolean arg0) {
        ++field4834;
        for (int var1 = 0; var1 < 5; ++var1) {
            class642.field8705[var1] = false;
        }
        class702.field9814 = -1;
        class116.field1446 = -1;
        class465.field5772 = 0;
        class385.field4946 = 1;
        if (!arg0) {
            class699.field9682 = 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZBII)V")
    public final void method1861(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field4833;
        int var5 = this.method1860(0) * super.field4027.field9574 / 10000;
        class309.field3898.method475(arg2, arg3 - -2, var5, super.field4027.field9572 - 2, ((class406) super.field4027).field5231, 0);
        class309.field3898.method475(arg2 - -var5, arg3 + 2, super.field4027.field9574 - var5, super.field4027.field9572 + -2, 0, 0);
        int var6 = -51 / ((arg1 - -83) / 37);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public static void method2171(int arg0) {
        field4837 = null;
        if (arg0 >= 45) {
            field4835 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIZZ)V")
    public final void method1862(int arg0, int arg1, boolean arg2, boolean arg3) {
        class309.field3898.method435(arg1 + -2, arg0, super.field4027.field9574 + 4, super.field4027.field9572 + 2, ((class406) super.field4027).field5228, 0);
        ++field4832;
        class309.field3898.method435(arg1 + -1, arg0 + 1, super.field4027.field9574 + 2, super.field4027.field9572, 0, 0);
        if (!arg3) {
            field4835 = null;
        }
    }
}
