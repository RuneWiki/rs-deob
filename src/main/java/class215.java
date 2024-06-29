import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class215 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[I")
    public static int[] field3715 = new int[32];

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[Laf;")
    public static class165[] field3719 = new class165[4];

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    public static int[] field3717 = new int[128];

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field3721 = 0;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field3718 = 0;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljl;")
    public static class101 field3714;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method1523(boolean arg0) {
        field3719 = null;
        field3715 = null;
        if (arg0) {
            method1524(112, 1);
        }
        field3717 = null;
        field3714 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
    public static final void method1524(int arg0, int arg1) {
        field3716++;
        class208.field3521.method1402((byte) -121, arg1);
        if (arg0 != 128) {
            field3720 = 27;
        }
    }
}
