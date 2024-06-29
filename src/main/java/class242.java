import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class242 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lsg;")
    private static class30 field4332 = class167.method1221((byte) 33, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lsg;")
    public static class30 field4335 = field4332;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Lsg;")
    private static class30 field4337 = class167.method1221((byte) 33, "Connected to update server");

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lsg;")
    public static class30 field4338 = class167.method1221((byte) 33, "details");

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lsg;")
    public static class30 field4330 = field4337;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "[I")
    public static int[] field4336;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[[[I")
    public static int[][][] field4333;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1712(int arg0) {
        field4333 = null;
        field4337 = null;
        field4335 = null;
        field4332 = null;
        field4330 = null;
        field4338 = null;
        field4336 = null;
        if (arg0 != 1) {
            field4331 = -11;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
    public static final void method1713(boolean arg0, int arg1) {
        field4334++;
        if (arg0 == class76.field1676) {
            return;
        }
        class76.field1676 = arg0;
        class105.method840(true);
        if (arg1 != 1) {
            method1714(-93, 125, -69, 45, -35, -68);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class148.field2824[arg0][var8][var14] == -class250.field4425) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = field4333[arg0][arg1][arg3] + arg5;
            if (!class138.method1045(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class138.method1045(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class138.method1045(var9, var11, var13)) {
                return false;
            } else if (class138.method1045(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class87.method731(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class138.method1045(var6 + 1, field4333[arg0][arg1][arg3] + arg5, var7 + 1) && class138.method1045(var6 + 128 - 1, field4333[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class138.method1045(var6 + 128 - 1, field4333[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class138.method1045(var6 + 1, field4333[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
