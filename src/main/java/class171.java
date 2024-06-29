import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class171 {

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "Lvp;")
    public class171 field2561;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lq;")
    public class391 field2559;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)Lal;")
    public static final class86 method1170(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6750;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)Lvp;")
    public final class171 method1171(byte arg0, int arg1) {
        field2563++;
        int var3 = 104 / ((arg0 + 8) / 41);
        return new class171(this.field2568, arg1);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIZLpd;Lpd;II)I")
    public static final int method1172(boolean arg0, int arg1, boolean arg2, class233 arg3, class233 arg4, int arg5, int arg6) {
        field2560++;
        int var7 = class686.method3779(arg5 ^ 0xFFFFFFA4, arg6, arg3, arg4, arg2);
        if (arg5 != var7) {
            return arg2 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class686.method3779(79, arg1, arg3, arg4, arg0);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Lrp;")
    public final class400 method1173(int arg0) {
        int var2 = 51 % ((11 - arg0) / 49);
        field2567++;
        return class634.method3521(-121, this.field2568);
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(II)V")
    public class171(int arg0, int arg1) {
        this.field2568 = arg0;
        this.field2569 = arg1;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lvp;I)V")
    public class171(class171 arg0, int arg1) {
        this.field2561 = arg0;
        this.field2559 = this.field2561.field2559;
        this.field2568 = this.field2561.field2568;
        this.field2569 = this.field2561.field2569 + arg1;
    }

    static {
        new class433("", 76);
        field2566 = 0;
    }
}
