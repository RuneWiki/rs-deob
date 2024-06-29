import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class377 implements class493 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lfca;")
    public static class188 field5414 = null;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
    public static int[] field5413 = new int[4];

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
    public static final int method2289(int arg0) {
        field5417++;
        if (class483.field6542) {
            return 6;
        } else if (class468.field6362 == null) {
            return 0;
        } else {
            if (arg0 != 2) {
                method2289(-41);
            }
            int var1 = class468.field6362.field902;
            if (class521.method2978(0, var1)) {
                return 1;
            } else if (class431.method2482(var1, 21284)) {
                return 2;
            } else if (class488.method2718(var1, arg0 - 19)) {
                return 3;
            } else if (class668.method3705(var1, false)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method2290(int arg0) {
        field5413 = null;
        if (arg0 != 4) {
            method2290(121);
        }
        field5414 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)[Ljv;")
    public static final class606[] method2291(byte arg0) {
        field5418++;
        int var1 = -115 / ((-arg0 - 21) / 48);
        return new class606[] { class45.field601, class225.field2928, class56.field787, class428.field5943, class210.field2753, class167.field2085, class226.field2935, class689.field9732, class106.field1273 };
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[IJLlp;)Ljava/lang/String;")
    public final String method2292(int arg0, int[] arg1, long arg2, class270 arg3) {
        field5412++;
        if (class431.field5987 == arg3) {
            class79 var6 = class39.field469.method3419(32764, arg1[0]);
            return var6.method448(62, (int) arg2);
        }
        if (arg0 != 0) {
            method2291((byte) -8);
        }
        if (class562.field7686 == arg3 || class282.field3785 == arg3) {
            class660 var7 = class237.field3088.method1349(-1, (int) arg2);
            return var7.field9309;
        } else if (class464.field6343 == arg3 || class679.field9654 == arg3 || class238.field3144 == arg3) {
            return class39.field469.method3419(32764, arg1[0]).method448(62, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILuca;IBILoa;)V")
    public static final void method2293(int arg0, class252 arg1, int arg2, byte arg3, int arg4, class689 arg5) {
        field5416++;
        class677 var6 = class70.field916.method1013(arg1.field3398, (byte) 104);
        if (var6.field9599 == -1) {
            return;
        }
        int var8;
        if (arg1.field3426) {
            int var7 = arg1.field3410 + arg4;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class424 var9 = var6.method3742((byte) -127, arg1.field3466, arg5, var8);
        if (var9 == null) {
            return;
        }
        int var10 = arg1.field3450;
        int var11 = arg1.field3431;
        if (arg3 <= 54) {
            return;
        }
        if ((var8 & 0x1) == 1) {
            var11 = arg1.field3450;
            var10 = arg1.field3431;
        }
        int var12 = var9.method1160();
        int var13 = var9.method1157();
        if (var6.field9602) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field9605 == 0) {
            var9.method2446(arg0, arg2 - (var11 - 1) * 4, var12, var13);
        } else {
            var9.method65(arg0, arg2 + 4 - (var11 * 4), var12, var13, 0, var6.field9605 | 0xFF000000, 1);
        }
    }
}
