import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class160 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2062 = 255;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lph;")
    public static class114 field2061 = new class114(64);

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
    public static boolean field2063 = true;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Z")
    public static boolean field2064;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 22)
    public static void method867(boolean arg0) {
        if (arg0) {
            field2061 = null;
        }
    }
}
