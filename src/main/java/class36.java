import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class36 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lju;")
    public static class111 field1029 = new class111("LIVE", 0);

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lte;")
    public static class571 field1033 = new class571("", 10);

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "F")
    public static float field1032;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "F")
    public static float field1035;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Llk;")
    public static class545 field1037;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Llk;IIIILua;Lf;I)V")
    public static final void method533(class545 arg0, int arg1, int arg2, int arg3, int arg4, class619 arg5, class702 arg6, int arg7) {
        field1034++;
        if (arg6 == null) {
            return;
        }
        int var8;
        if (class423.field6123 == 4) {
            var8 = (int) class591.field8509 & 0x3FFF;
        } else {
            var8 = (int) class591.field8509 + class527.field7433 & 0x3FFF;
        }
        int var9 = Math.max(arg0.field7718 / 2, arg0.field7652 / 2) + 10;
        int var10 = arg1 * arg1 + arg4 * arg4;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class509.field7210[var8];
        if (arg2 != 15687) {
            field1037 = null;
        }
        int var12 = class509.field7220[var8];
        if (class423.field6123 != 4) {
            var12 = var12 * 256 / (class130.field2350 + 256);
            var11 = var11 * 256 / (class130.field2350 + 256);
        }
        int var13 = arg1 * var11 + arg4 * var12 >> 14;
        int var14 = arg1 * var12 - (arg4 * var11) >> 14;
        arg6.method1744(arg0.field7718 / 2 + arg7 + var13 - (arg6.method1784() / 2), -var14 + arg3 - -(arg0.field7652 / 2) - arg6.method1789() / 2, arg5, arg7, arg3);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1036++;
        if (!class337.field5036) {
            return false;
        } else if (arg3 > class481.field6911) {
            return false;
        } else if (arg0 != arg6 || arg1 != arg2) {
            for (int var9 = arg0; var9 <= arg6; var9++) {
                for (int var12 = arg1; var12 <= arg2; var12++) {
                    if (class85.field1610[arg5][var9][var12] == -class574.field8339) {
                        return false;
                    }
                }
            }
            int var10 = (arg0 << class30.field940) + 1;
            int var11 = (arg1 << class30.field940) + 2;
            if (class498.method2974((arg6 + 1 - arg0) * class576.field8369, arg4, class485.field6947[arg5].method551(arg0, arg1, (byte) -126), var11, 8963, var10, (arg2 + 1 - arg1) * class576.field8369)) {
                class518.field7310++;
                return true;
            } else {
                return false;
            }
        } else if (class649.method3708(arg0, -126, arg5, arg1)) {
            int var7 = arg0 << class30.field940;
            int var8 = arg1 << class30.field940;
            if (class498.method2974(class576.field8369, arg4, class485.field6947[arg5].method551(arg0, arg1, (byte) -111), var8, 8963, var7, class576.field8369)) {
                class518.field7310++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method535(int arg0) {
        field1033 = null;
        field1029 = null;
        field1037 = null;
        if (arg0 != 1) {
            method535(50);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
    public static final void method536(int arg0, int arg1) {
        field1030++;
        if (arg1 != 256) {
            field1035 = 1.2536986F;
        }
        if (class577.field8380 == 0) {
            class114.field2046.method196(arg0, -128);
        } else {
            class486.field6961 = arg0;
        }
    }
}
