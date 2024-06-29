import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class660 {

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "Ljava/lang/String;")
    public static String field9378 = null;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field9377 = 0;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field9376 = -1;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "Ljn;")
    public static class668 field9374;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)Z", line = 6)
    public static final boolean method3740(byte arg0, int arg1) {
        if (arg0 < 120) {
            return false;
        }
        field9375++;
        if (arg1 == 48 || arg1 == 21 || arg1 == 30 || arg1 == 8 || arg1 == 18) {
            return true;
        } else {
            return arg1 == 20 || arg1 == 1006;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V", line = 32)
    public static void method3741(byte arg0) {
        field9378 = null;
        if (arg0 <= 104) {
            field9377 = -24;
        }
        field9374 = null;
    }
}
