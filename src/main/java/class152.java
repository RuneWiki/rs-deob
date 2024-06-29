import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class152 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "J")
    public static long field2541 = 20000000L;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lkq;")
    public static class696 field2540 = new class696(4, 1);

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lbp;")
    public static class431 field2543 = class547.method3212(121);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method156(int[] arg0);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method163(class152 arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class152 method180();

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method158(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method1152(boolean arg0) {
        if (arg0) {
            field2540 = null;
            field2543 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIII)V")
    public static final void method1153(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2539++;
        if (arg0 != 99) {
            method1152(false);
        }
        if (class600.field8661 == 1) {
            class623.field8874[class435.field6264 / 100].method1638(class386.field5658 - 8, class435.field6268 - 8);
        }
        if (class600.field8661 == 2) {
            class623.field8874[class435.field6264 / 100 + 4].method1638(class386.field5658 - 8, class435.field6268 + -8);
        }
        class43.method349(arg0 - 3172);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static final int method1154(int arg0, int arg1) {
        return class544.field7990 == null ? 0 : class544.field7990[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method164(int arg0);

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method170(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method1155(int arg0) {
        field2542++;
        class117 var1 = class691.field9789;
        synchronized (class691.field9789) {
            class691.field9789.method950((byte) -123);
        }
        if (arg0 != -7921) {
            method1154(-7, -28);
        }
    }

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method166(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method165(int arg0);

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method183(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method176(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method167();

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method171(int arg0);

    @OriginalMember(owner = "client!q", name = "BA", descriptor = "(III[I)V")
    public abstract void method178(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)I")
    public static final int method1156(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class255.field3675 - 1; var2++) {
            if (arg0 < class697.field9887[var2] + class599.field8655[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class255.field3675 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method169(int arg0, int arg1, int arg2, int[] arg3);
}
