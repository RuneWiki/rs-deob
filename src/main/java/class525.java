import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class525 extends class519 {

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public int field7462;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field7463 = 0;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "[Z")
    public static boolean[] field7464;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
    public static void method3113(byte arg0) {
        if (arg0 != -16) {
            field7465 = 45;
        }
        field7464 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Ljw;")
    public final class551 method930(int arg0) {
        field7466++;
        return arg0 == 17503 ? class459.field6630 : null;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljg;Ljha;IIIIIIIIIIIIII)V")
    public class525(class338 arg0, class692 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field7462 = arg15;
    }
}
