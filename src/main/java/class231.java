import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class231 {

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "S")
    public static short field3341 = 320;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Z")
    public static boolean field3345 = false;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lnq;")
    public static class268 field3338;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lnq;")
    public static class268 field3342;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZZ)V")
    public static final void method1590(boolean arg0, boolean arg1) {
        class108.method764(arg0, -126, class214.field2993, class59.field801, class47.field661);
        field3347++;
        if (!arg1) {
            method1592(119, 18);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)I")
    public static final int method1591(int arg0, boolean arg1) {
        field3340++;
        return arg1 ? 62 : arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
    public static final int method1592(int arg0, int arg1) {
        field3346++;
        if (arg0 != 8064) {
            method1591(4, false);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method1593(int arg0) {
        field3338 = null;
        field3342 = null;
        if (arg0 != -1331357333) {
            field3341 = -81;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(IZ)V")
    public static final void method1594(int arg0, boolean arg1) {
        if (!arg1) {
            field3344 = 18;
        }
        field3343++;
        class131 var2 = class251.field3543;
        synchronized (class251.field3543) {
            class251.field3543.method901(arg0, 12223);
        }
    }
}
