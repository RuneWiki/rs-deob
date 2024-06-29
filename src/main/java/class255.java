import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class255 extends class520 {

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field3475 = 0;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field3478 = -2;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3476 = null;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method1523(int arg0) {
        field3476 = null;
        if (arg0 != -2) {
            method1523(35);
        }
    }
}
