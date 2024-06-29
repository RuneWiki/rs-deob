import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class423 extends class735 {

    @OriginalMember(owner = "client!df", name = "w", descriptor = "F")
    public static float field5793;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "F")
    public static float field5797;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Ljava/lang/String;")
    private String field5795;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)Z", line = 5)
    public static final boolean method2500(int arg0, int arg1) {
        int var2 = 0 % ((63 - arg1) / 61);
        field5790++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lrh;Z)V", line = 17)
    public final void method624(class280 arg0, boolean arg1) {
        field5791++;
        arg0.field3891 = this.field5795;
        if (arg1) {
            this.method624(null, true);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILfca;)V", line = 33)
    public final void method627(int arg0, class93 arg1) {
        this.field5795 = arg1.method752(0);
        field5792++;
        if (arg0 != 5) {
            field5793 = -0.35634336F;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Z", line = 44)
    public static final boolean method2501(int arg0) {
        field5796++;
        if (class27.field516 == null) {
            return false;
        } else {
            if (class27.field516.field7229 >= 2000) {
                class27.field516.field7229 -= 2000;
            }
            return (short) arg0 == class27.field516.field7229;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIII)V", line = 68)
    public static final void method2502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5789++;
        if (class659.method3706(110, arg7)) {
            int var10 = 0;
            int var11 = 0;
            if (arg4 <= -114) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                if (class618.field8597) {
                    var13 = class297.field4076;
                    var10 = class739.field10196;
                    var11 = class204.field3077;
                    var14 = class152.field2495;
                    var12 = class521.field7069;
                    class152.field2495 = 1;
                }
                if (class79.field1113[arg7] == null) {
                    class200.method1444(arg8 < 0, -1, -1, arg2, arg3, arg8, class431.field5870[arg7], arg5, arg0, arg6, arg1);
                } else {
                    class200.method1444(arg8 < 0, -1, -1, arg2, arg3, arg8, class79.field1113[arg7], arg5, arg0, arg6, arg1);
                }
                if (class618.field8597) {
                    if (arg8 >= 0 && class152.field2495 == 2) {
                        class686.method3861(class739.field10196, class521.field7069, 22738, class204.field3077, class297.field4076);
                    }
                    class204.field3077 = var11;
                    class739.field10196 = var10;
                    class521.field7069 = var12;
                    class297.field4076 = var13;
                    class152.field2495 = var14;
                }
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class377.field5145[var9] = true;
            }
        } else {
            class377.field5145[arg8] = true;
        }
    }
}
