import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class523 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Laj;")
    public static class287 field7396 = new class287(64);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)[Lpr;")
    public static final class415[] method3070(int arg0) {
        field7398++;
        if (arg0 < 7) {
            field7396 = null;
        }
        return new class415[] { class328.field4813, class674.field9593, class356.field5330 };
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIII)Z")
    public static final boolean method3071(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field7397++;
        if (!class337.field5036) {
            return false;
        } else if (class481.field6911 < 100) {
            return false;
        } else if (class649.method3708(arg2, -126, arg3, arg4)) {
            int var5 = arg2 << class30.field940;
            int var6 = arg4 << class30.field940;
            if (arg1) {
                return false;
            } else if (class498.method2974(class576.field8369, arg0, class485.field6947[arg3].method551(arg2, arg4, (byte) -104), var6, 8963, var5, class576.field8369)) {
                class518.field7310++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method3072(byte arg0) {
        field7396 = null;
        if (arg0 <= 30) {
            field7396 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JJ)J")
    public static long method3073(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
