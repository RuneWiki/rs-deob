import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class533 implements class627 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Z")
    public static final boolean method3100(int arg0, int arg1, int arg2) {
        if (arg0 == 2048) {
            field7431++;
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3101(int arg0, boolean arg1) {
        field7432++;
        for (class554 var2 = (class554) class521.field7310.method3731((byte) -99); var2 != null; var2 = (class554) class521.field7310.method3729((byte) -121)) {
            if (class61.method628(67, var2.field7682) && (long) arg0 == var2.field7693) {
                return true;
            }
        }
        if (arg1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z[ILhk;J)Ljava/lang/String;")
    public final String method3102(boolean arg0, int[] arg1, class153 arg2, long arg3) {
        field7433++;
        if (class684.field9683 == arg2) {
            class584 var6 = class433.field6045.method3759(arg1[0], 61);
            return var6.method3429((byte) -91, (int) arg3);
        } else if (arg0) {
            return null;
        } else if (class421.field5844 == arg2 || class703.field9850 == arg2) {
            class42 var7 = class422.field5873.method2937((byte) -112, (int) arg3);
            return var7.field554;
        } else if (class324.field4599 == arg2 || class185.field2808 == arg2 || class584.field8400 == arg2) {
            return class433.field6045.method3759(arg1[0], -113).method3429((byte) -91, (int) arg3);
        } else {
            return null;
        }
    }
}
