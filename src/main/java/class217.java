import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class217 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
    public static int[] field3780 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Loc;")
    public static class151 field3779 = class137.method873(2, "Schlie-8en");

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Loc;")
    public static class151 field3783 = class137.method873(2, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Z")
    public static boolean field3786 = false;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[I")
    public static int[] field3787 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3784 = -1;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lsd;")
    public static class192 field3781;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method1349(byte arg0) {
        if (arg0 != -81) {
            return;
        }
        field3780 = null;
        field3781 = null;
        field3779 = null;
        field3783 = null;
        field3787 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIII)V")
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3782++;
        if (arg0 != 4) {
            field3784 = 11;
        }
        if (class79.field1526 <= arg3 && arg5 <= class25.field524 && class233.field4281 <= arg2 && class154.field2793 >= arg1) {
            class40.method292(arg2, arg0 + 44, arg3, arg1, arg5, arg4);
        } else {
            class146.method932(arg4, false, arg1, arg2, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)J")
    public static final synchronized long method1351(int arg0) {
        field3785++;
        long var1 = System.currentTimeMillis();
        if (var1 < class104.field1874) {
            class150.field2681 += class104.field1874 - var1;
        }
        int var3 = -3 / ((-arg0 - 20) / 48);
        class104.field1874 = var1;
        return class150.field2681 + var1;
    }
}
