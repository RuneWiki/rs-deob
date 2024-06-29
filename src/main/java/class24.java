import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class24 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lhi;")
    private static class82 field324 = class95.method664((byte) -41, "green:");

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Lhi;")
    public static class82 field327 = class95.method664((byte) -53, "underlay");

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lhi;")
    public static class82 field331 = class95.method664((byte) -74, "(U3");

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lhi;")
    public static class82 field332 = field324;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Lhi;")
    public static class82 field330 = field324;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Lhi;")
    public static class82 field328 = class95.method664((byte) -121, " s(West connect-B)3");

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[I")
    public static int[] field329;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)Z", line = 5)
    public static final boolean method157(byte arg0, int arg1) {
        field325++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class135.field2333[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0 > -106) {
            return false;
        } else {
            return var2 == 1005;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 64)
    public static void method158(int arg0) {
        field324 = null;
        field327 = null;
        field329 = null;
        field328 = null;
        field331 = null;
        if (arg0 > -93) {
            field331 = (class82) null;
        }
        field330 = null;
        field332 = null;
    }
}
