import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class145 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Leg;")
    private static class37 field2471 = class174.method1167("Loaded wordpack", 98);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field2472 = -1;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Leg;")
    public static class37 field2475 = field2471;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Leg;")
    private static class37 field2476 = class174.method1167("RuneScape is loading )2 please wait)3)3)3", 95);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Leg;")
    public static class37 field2474 = field2476;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII[I)V")
    public static final void method1010(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2470++;
        if (arg2 != -25086) {
            return;
        }
        arg1--;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg1 < var5) {
            int var7 = arg1 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg1 = var13 + 1;
            arg4[arg1] = arg3;
        }
        while (arg1 < var6) {
            arg1++;
            arg4[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2476 = null;
        field2471 = null;
        field2474 = null;
        if (arg0 <= 36) {
            field2475 = null;
        }
        field2475 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)I")
    public static final int method1012(boolean arg0, int arg1) {
        if (arg0) {
            return 87;
        } else {
            field2469++;
            return arg1 >>> 8;
        }
    }
}
