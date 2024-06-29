import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class231 extends class80 {

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public int field3213 = 0;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "[I")
    public static int[] field3210 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "Lkp;")
    public static class337 field3207;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILlh;I)V", line = 7)
    private final void method1350(int arg0, class365 arg1, int arg2) {
        if (arg2 == 2) {
            this.field3213 = arg1.method2062((byte) 14);
        }
        if (arg0 < -18) {
            field3209++;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Llh;I)V", line = 23)
    public final void method1351(class365 arg0, int arg1) {
        if (arg1 != -25486) {
            this.field3213 = 38;
        }
        field3211++;
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                return;
            }
            this.method1350(arg1 + 25425, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 51)
    public static void method1352(int arg0) {
        field3210 = null;
        field3207 = null;
        if (arg0 >= -65) {
            method1353(75, -15, 53, -66, 34, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIB)Z", line = 64)
    public static final boolean method1353(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3208++;
        if (arg5 != 96) {
            field3207 = null;
        }
        for (int var6 = arg0; var6 <= arg1; var6++) {
            for (int var7 = arg3; var7 <= arg2; var7++) {
                if (class149.field2110[var6][var7] == arg4 && class162.field2319[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
