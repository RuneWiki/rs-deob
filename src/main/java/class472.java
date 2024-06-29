import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class472 extends class504 {

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public int field6538;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "Lkr;")
    public static class602 field6540 = new class602(24, 3);

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "Lst;")
    public static class335 field6542 = new class335(52, 4);

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "Z")
    public static boolean field6539;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "[I")
    public static int[] field6541;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Lww;")
    public final class288 method1206(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field6537++;
            return class548.field7624;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lrg;Lal;IIIIIIIIIIIIII)V")
    public class472(class557 arg0, class125 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field6538 = arg15;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public static void method2867(int arg0) {
        field6540 = null;
        if (arg0 != 8916) {
            method2867(38);
        }
        field6541 = null;
        field6542 = null;
    }
}
