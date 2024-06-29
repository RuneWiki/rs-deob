import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class306 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3893 = 0;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[Lsba;")
    public static class183[] field3896 = new class183[14];

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lvj;")
    public static class373 field3895 = new class373(28, -1);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lwb;")
    public static class274 field3892;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Z")
    public static boolean field3898;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method1693(int arg0) {
        field3895 = null;
        field3896 = null;
        field3892 = null;
        if (arg0 != -20866) {
            field3898 = false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILet;II)V")
    public static final void method1694(int arg0, class509 arg1, int arg2, int arg3) {
        field3897++;
        if (arg0 != 2) {
            method1694(-88, null, -17, -24);
        }
        if (arg1.field7200 == 0) {
            arg1.field7139 = arg1.field7071;
        } else if (arg1.field7200 == 1) {
            arg1.field7139 = (arg2 - arg1.field7094) / 2 + arg1.field7071;
        } else if (arg1.field7200 == 2) {
            arg1.field7139 = arg2 - arg1.field7094 - arg1.field7071;
        } else if (arg1.field7200 == 3) {
            arg1.field7139 = arg1.field7071 * arg2 >> 14;
        } else if (arg1.field7200 == 4) {
            arg1.field7139 = (arg1.field7071 * arg2 >> 14) + (arg2 - arg1.field7094) / 2;
        } else {
            arg1.field7139 = arg2 - (arg1.field7071 * arg2 >> 14) - arg1.field7094;
        }
        if (arg1.field7077 == 0) {
            arg1.field7110 = arg1.field7051;
        } else if (arg1.field7077 == 1) {
            arg1.field7110 = (arg3 - arg1.field7059) / 2 + arg1.field7051;
        } else if (arg1.field7077 == 2) {
            arg1.field7110 = arg3 - (arg1.field7059 + arg1.field7051);
        } else if (arg1.field7077 == 3) {
            arg1.field7110 = arg1.field7051 * arg3 >> 14;
        } else if (arg1.field7077 == 4) {
            arg1.field7110 = (arg3 - arg1.field7059) / 2 + (arg1.field7051 * arg3 >> 14);
        } else {
            arg1.field7110 = arg3 - (arg1.field7051 * arg3 >> 14) - arg1.field7059;
        }
        if (!class2.field8) {
            return;
        }
        if (client.method1412(arg1).field3493 == 0 && arg1.field7197 != 0) {
            return;
        }
        if (arg1.field7110 < 0) {
            arg1.field7110 = 0;
        } else if (arg3 < arg1.field7110 + arg1.field7059) {
            arg1.field7110 = arg3 - arg1.field7059;
        }
        if (arg1.field7139 < 0) {
            arg1.field7139 = 0;
            return;
        }
        if (arg2 < (arg1.field7139 + arg1.field7094)) {
            arg1.field7139 = arg2 - arg1.field7094;
            return;
        }
    }
}
