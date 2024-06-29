import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class196 {

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "[Lud;")
    public static class35[] field2807 = new class35[2048];

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lbda;")
    public static class503 field2805;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2806++;
        int var7 = arg4 + arg6;
        int var8 = arg5 - arg6;
        for (int var9 = arg4; var9 < var7; var9++) {
            class399.method2472(27113, arg3, arg0, arg1, class329.field4651[var9]);
        }
        if (arg2 != 4146) {
            method1374(97);
        }
        for (int var10 = arg5; var10 > var8; var10--) {
            class399.method2472(27113, arg3, arg0, arg1, class329.field4651[var10]);
        }
        int var11 = arg0 - arg6;
        int var12 = arg3 + arg6;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class329.field4651[var13];
            class399.method2472(27113, arg3, var12, arg1, var14);
            class399.method2472(arg2 ^ 0x79DB, var11, arg0, arg1, var14);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1373(int arg0, byte arg1, int arg2) {
        field2804++;
        int var3 = 1 / (arg1 / 41);
        if ((class618.method3580(544, arg2, arg0) | (arg0 & 0x10000) != 0) || class452.method2694(arg0, arg2, true)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class554.method3244(-1, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static void method1374(int arg0) {
        if (arg0 != -1229686568) {
            field2807 = null;
        }
        field2805 = null;
        field2807 = null;
    }
}
