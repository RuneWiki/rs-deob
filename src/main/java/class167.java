import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class167 extends class13 {

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    private int field2845 = -32768;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lqe;")
    public static class168 field2847 = class66.method448(" (X", -109);

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lqe;")
    public static class168 field2850 = class66.method448("<col=00ff00>", -113);

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
    public static int[] field2843 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "D")
    public static double field2852;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lrd;")
    public static class207 field2855;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field2847 = null;
        field2855 = null;
        int var1 = -12 % ((arg0 - 67) / 32);
        field2843 = null;
        field2850 = null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
    public final int method43() {
        field2854++;
        return this.field2845;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class188 var11 = class151.method1005(520, this.field2844).method1591(this.field2851, false, null, 0);
        field2842++;
        if (var11 != null) {
            var11.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2845 = var11.method43();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BJ)V")
    public static final void method1067(byte arg0, long arg1) {
        if (arg0 != 85) {
            method1066(-18);
        }
        field2846++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1068(int arg0, int[] arg1) {
        field2853++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        class22.method116(arg1, 0, var2, 0, arg1.length);
        if (arg0 != -1) {
            method1066(12);
        }
        return var2;
    }
}
