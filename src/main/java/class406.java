import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class406 extends class268 implements class719 {

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "I")
    private int field5735;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "Lmq;")
    public static class78 field5729 = new class78(110, -2);

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field5733;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "[[[B")
    public static byte[][][] field5734;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)I", line = 9)
    public final int method2404(int arg0) {
        ++field5730;
        return arg0 != -10550 ? -119 : super.field3388;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I", line = 25)
    public final int method2405(int arg0) {
        if (arg0 != -14757) {
            return -57;
        } else {
            ++field5728;
            return this.field5735;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II[BI)V", line = 37)
    public final void method2406(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field5727;
        if (arg1 == -13184) {
            this.method1609(arg3, arg2, 1949);
            this.field5735 = arg0;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)V", line = 51)
    public static final void method2407(int arg0, String arg1, boolean arg2, String arg3) {
        ++field5731;
        class516.field7276 = arg1;
        class405.field5722 = arg2;
        class432.field6111 = arg3;
        if (!class405.field5722 && (class516.field7276.equals("") || class432.field6111.equals(""))) {
            class600.method3307(110, 3);
        } else {
            if (class202.field2576 != 1) {
                class197.field2533 = 0;
                class492.field6972 = -1;
            }
            class541.field7612 = false;
            class600.method3307(108, -3);
            class575.field8031 = 1;
            class542.field7630 = 0;
            class446.field6281 = 0;
            if (arg0 != -1591) {
                field5729 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V", line = 83)
    public static void method2408(int arg0) {
        field5733 = null;
        field5729 = null;
        field5734 = null;
        if (arg0 != -1) {
            method2407(32, (String) null, true, (String) null);
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V", line = 99)
    public final void method1608(int arg0) {
        super.field3390.method2138(28419, this);
        if (arg0 == 23188) {
            ++field5736;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Leq;I[BIZ)V", line = 112)
    public class406(class357 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5735 = arg1;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BIIIIIIII)Z", line = 120)
    public static final boolean method2409(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != -116) {
            return true;
        } else {
            ++field5732;
            if (~(arg5 - -arg1) < ~arg2 && ~(arg2 + arg4) < ~arg5) {
                return arg8 < arg3 + arg6 && arg7 + arg8 > arg6;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)J", line = 139)
    public final long method2410(byte arg0) {
        if (arg0 < 4) {
            this.field5735 = -97;
        }
        ++field5737;
        return 0L;
    }
}
