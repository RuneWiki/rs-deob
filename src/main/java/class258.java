import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class258 {

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public int field4141 = -1;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "[I")
    public static int[] field4137 = new int[5];

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "[Lbk;")
    public static class126[] field4140 = new class126[14];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Ldb;")
    public static class102 field4132 = new class102(64);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Ls;")
    public class335 field4138;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Ljava/lang/Thread;")
    public static Thread field4136;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[I")
    public int[] field4135;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field4133;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[Z")
    public static boolean[] field4142;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method1848(boolean arg0) {
        for (class327 var1 = (class327) class273.field4399.method1240(3); var1 != null; var1 = (class327) class273.field4399.method1235(false)) {
            if (var1.field5062 == -1) {
                var1.field5048 = 0;
                class66.method443(0, var1);
            } else {
                var1.method1212((byte) 125);
            }
        }
        field4131++;
        if (arg0) {
            method1849(108, (class44) null);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjj;)Ldg;", line = 32)
    public static final class200 method1849(int arg0, class44 arg1) {
        field4134++;
        if (arg0 != -15032) {
            field4142 = (boolean[]) null;
        }
        return new class200(arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method273(arg0 - 867658032), arg1.method273(arg0 ^ 0x33B79950), arg1.method286((byte) -88));
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 44)
    public static void method1850(int arg0) {
        field4142 = null;
        field4132 = null;
        field4137 = null;
        field4140 = null;
        if (arg0 >= -55) {
            method1849(0, (class44) null);
        }
        field4136 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 67)
    public static final void method1851(int arg0, int arg1) {
        field4130++;
        if (!class231.field3681) {
            arg1 = -1;
        }
        if (class77.field1094 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class273 var2 = class202.method1476(3272, arg1);
            class220 var3 = var2.method1969(-118);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class14.field159.method901(var3.method1560(), var3.field817, false, class94.field1290, var3.field813, new Point(var2.field4404, var2.field4397));
                class77.field1094 = arg1;
            }
        }
        if (arg0 == arg1 && class77.field1094 != -1) {
            class14.field159.method901((int[]) null, -1, false, class94.field1290, -1, new Point());
            class77.field1094 = -1;
        }
    }
}
