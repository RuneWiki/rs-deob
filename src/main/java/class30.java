import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class30 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lsd;")
    public static class166 field560 = class135.method935(" )2> ", 0);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lsd;")
    private static class166 field557 = class135.method935("Unable to find ", 0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[Z")
    public static boolean[] field556 = new boolean[100];

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lsd;")
    private static class166 field565 = class135.method935("Loaded sprites", 0);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lsd;")
    public static class166 field562 = field565;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lsd;")
    public static class166 field561 = field557;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method229(int arg0) {
        field560 = null;
        if (arg0 != 100) {
            method229(102);
        }
        field565 = null;
        field556 = null;
        field562 = null;
        field557 = null;
        field561 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILf;Lf;)Lhb;")
    public static final class66 method230(int arg0, int arg1, int arg2, class47 arg3, class47 arg4) {
        field558++;
        if (arg2 != 100) {
            method229(67);
        }
        return class146.method1003(arg0, arg1, arg3, false) ? class25.method193(arg4.method353(arg0, arg1, -64), true) : null;
    }
}
