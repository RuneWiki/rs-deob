import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class50 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lhi;")
    public static class82 field812 = class95.method664((byte) -128, "scrollbar");

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Z")
    public static boolean field813 = true;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lhi;")
    private static class82 field818 = class95.method664((byte) -30, "glow2:");

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lhi;")
    public static class82 field816 = field818;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lhi;")
    public static class82 field811 = field818;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lum;")
    public static class222 field810;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[Lti;")
    public static class186[] field815;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)I", line = 25)
    public static final int method356(int arg0, boolean arg1) {
        field817++;
        if (arg1) {
            method356(-55, true);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 36)
    public static void method357(int arg0) {
        if (arg0 != 907) {
            field812 = (class82) null;
        }
        field816 = null;
        field815 = null;
        field811 = null;
        field810 = null;
        field812 = null;
        field818 = null;
    }
}
