import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class208 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[Lsc;")
    public static class164[] field3531 = new class164[5000];

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lmh;")
    public static class62 field3530 = class201.method1405(true, "<col=c0ff00>");

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Z")
    public static boolean field3527 = false;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lmh;")
    public static class62 field3535 = class201.method1405(true, "blinken1:");

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lwi;")
    public static class242 field3528;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBI)I", line = 8)
    public static final int method1456(int arg0, int arg1, byte arg2, int arg3) {
        field3534++;
        if (arg2 < 73) {
            field3528 = (class242) null;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 31)
    public static void method1457(boolean arg0) {
        if (!arg0) {
            method1458(53);
        }
        field3535 = null;
        field3530 = null;
        field3531 = null;
        field3528 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)I", line = 60)
    public static final int method1458(int arg0) {
        field3533++;
        return arg0 == 6 ? 6 : -7;
    }
}
