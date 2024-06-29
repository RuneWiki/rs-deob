import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class195 {

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lqe;")
    public static class179 field3625 = class206.method1380("Das ist eine Mitglieder)2Welt(Q", (byte) 111);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
    public static boolean field3624 = true;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lqe;")
    public static class179 field3632 = class206.method1380(":duelstake:", (byte) 95);

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lqe;")
    public static class179 field3630 = null;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lqe;")
    public static class179 field3631 = class206.method1380("<col=00ff80>", (byte) -128);

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[I")
    public static int[] field3628;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBIIIII)I")
    public static final int method1307(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3633++;
        int var7 = arg2 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg4;
        }
        if (arg1 != 98) {
            field3628 = null;
        }
        if (var7 == 1) {
            return 1 + 7 - arg6 - arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg3 - arg4;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1308(int arg0) {
        field3630 = null;
        if (arg0 != -10533) {
            method1311(-76, -43, -9, (byte) 123, 106, 79, -84);
        }
        field3632 = null;
        field3631 = null;
        field3625 = null;
        field3628 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[[I)V")
    public static final void method1309(int arg0, int[][] arg1) {
        field3623++;
        if (arg0 != 3) {
            field3632 = null;
        }
        class14.field331 = arg1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)I")
    public static final int method1310(byte arg0, int arg1) {
        if (arg0 <= 33) {
            method1311(-63, 123, 115, (byte) 56, 105, -87, 12);
        }
        field3629++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1311(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 <= 19) {
            field3624 = true;
        }
        field3634++;
        if (arg4 - arg2 >= class235.field4336 && class40.field869 >= arg2 + arg4 && class168.field3037 <= arg1 - arg2 && arg1 + arg2 <= class70.field1403) {
            class117.method750(arg5, arg0, arg4, arg2, arg1, 0, arg6);
        } else {
            class216.method1417(arg2, arg0, arg1, -30023, arg4, arg6, arg5);
        }
    }
}
