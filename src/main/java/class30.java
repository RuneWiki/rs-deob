import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class30 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Z")
    public static boolean field471 = false;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lhh;")
    public static class163 field474 = class137.method1065("<col=ffff00>", 17);

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[I")
    public static int[] field473 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lpg;")
    public static class81 field472 = new class81(new byte[5000]);

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "[I")
    public static int[] field477 = new int[1000];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lv;")
    public static class22 field475;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 <= -28) {
            field469++;
            if (class114.method906(0, arg6)) {
                client.method834(class109.field2060[arg6], -1, arg7, arg4, arg3, arg0, arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method184(int arg0) {
        field475 = null;
        field473 = null;
        field472 = null;
        field477 = null;
        field474 = null;
        if (arg0 != 24640) {
            method183(-120, -79, 96, -61, -89, -112, 119, 51);
        }
    }
}
