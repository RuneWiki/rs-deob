import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class247 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
    public static int[] field3872 = new int[25];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field3871 = 0;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field3873 = 0;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[[I")
    public static int[][] field3876;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILbf;IILim;II)V")
    public static final void method1614(int arg0, class108 arg1, int arg2, int arg3, class178 arg4, int arg5, int arg6) {
        field3875++;
        if (arg1 == null) {
            return;
        }
        int var7;
        if (class12.field203 == 4) {
            var7 = (int) class123.field1743 & 0x7FF;
        } else {
            var7 = (int) class123.field1743 + class179.field2712 & 0x7FF;
        }
        int var8 = Math.max(arg4.field2529 / arg5, arg4.field2571 / 2) + 10;
        int var9 = arg2 * arg2 + (arg0 * arg0);
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class118.field1697[var7];
        int var11 = class118.field1690[var7];
        if (class12.field203 != 4) {
            var11 = var11 * 256 / (class42.field627 + 256);
            var10 = var10 * 256 / (class42.field627 + 256);
        }
        int var12 = arg0 * var11 - arg2 * var10 >> 16;
        int var13 = arg0 * var10 + (arg2 * var11) >> 16;
        ((class203) arg1).method1271(arg4.field2529 / 2 + arg3 + var13 - (arg1.field1538 / 2), arg6 - -(arg4.field2571 / 2) + -(arg1.field1534 / 2) - var12, arg4.field2528, arg4.field2631);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)I")
    public static final int method1615(byte arg0, int arg1) {
        field3877++;
        return arg0 >= -125 ? -22 : arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Lc;")
    public static final class301 method1616(byte arg0) {
        if (arg0 == 99) {
            field3874++;
            return class97.field1404;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method1617(int arg0) {
        field3872 = null;
        if (arg0 != -1012210864) {
            field3872 = null;
        }
        field3876 = null;
    }
}
