import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class310 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Z")
    public static boolean field4387;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    public static final int method1922(int arg0, int arg1) {
        if (arg0 <= 13) {
            method1922(47, 78);
        }
        field4386++;
        return arg1 >> 11 & 0x7F;
    }

    static {
        new class326("Use", "Benutzen", "Utiliser", "Usar");
        field4387 = false;
    }
}
