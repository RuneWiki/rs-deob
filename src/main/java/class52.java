import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class52 extends class224 {

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
    public static int field693 = 0;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
    public static int field692 = 50;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "[I")
    public static int[] field694 = new int[field692];

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "[I")
    public static int[] field696 = new int[field692];

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "[I")
    public static int[] field707 = new int[field692];

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field706 = new String[field692];

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "[I")
    public static int[] field701 = new int[field692];

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "[I")
    public static int[] field704 = new int[field692];

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "[I")
    public static int[] field697 = new int[field692];

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "Lf;")
    private class702 field698;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "[I")
    public static int[] field702;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZIII)V", line = 3)
    public final void method582(boolean arg0, int arg1, int arg2, int arg3) {
        ++field695;
        int var5 = this.method1645(true) * super.field3611.field7317 / 10000;
        int[] var6 = new int[4];
        class627.field8857.method343(var6);
        class627.field8857.method352(arg1, arg3 + 2, arg1 + var5, super.field3611.field7316 + arg3);
        this.field698.method3956(arg1, arg3 - -2, super.field3611.field7317, super.field3611.field7316);
        class627.field8857.method352(var6[arg2], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZIZ)V", line = 19)
    public final void method583(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg1) {
            class627.field8857.method344(arg0 + -2, arg2, super.field3611.field7317 + 4, super.field3611.field7316 + 2, ((class244) super.field3611).field3886, 0);
            ++field699;
            class627.field8857.method344(arg0 + -1, arg2 + 1, super.field3611.field7317 + 2, super.field3611.field7316, 0, 0);
        }
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V", line = 37)
    public static void method584(int arg0) {
        field706 = null;
        field694 = null;
        field707 = null;
        if (arg0 > 119) {
            field697 = null;
            field701 = null;
            field702 = null;
            field696 = null;
            field704 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lri;Lri;Lrh;)V", line = 56)
    public class52(class97 arg0, class97 arg1, class244 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)Z", line = 62)
    public final boolean method585(byte arg0) {
        if (arg0 <= 119) {
            return false;
        } else {
            ++field705;
            return !super.method585((byte) 120) ? false : super.field3612.method942(0, ((class244) super.field3611).field3889);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIBIII)V", line = 92)
    public static final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        ++field703;
        class640 var10 = null;
        if (arg6 != -73) {
            field694 = null;
        }
        for (class640 var11 = (class640) class580.field8270.method3465((byte) 112); var11 != null; var11 = (class640) class580.field8270.method3469(0)) {
            if (~var11.field8972 == ~arg5 && var11.field8975 == arg4 && ~var11.field8980 == ~arg9 && var11.field8971 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class640();
            var10.field8975 = arg4;
            var10.field8980 = arg9;
            var10.field8971 = arg0;
            var10.field8972 = arg5;
            if (arg4 >= 0 && arg9 >= 0 && ~class275.field4426 < ~arg4 && ~arg9 > ~class417.field6374) {
                class455.method2863(var10, -114);
            }
            class580.field8270.method3463((byte) -87, var10);
        }
        var10.field8981 = arg7;
        var10.field8982 = arg3;
        var10.field8978 = arg1;
        var10.field8979 = arg2;
        var10.field8983 = arg8;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 143)
    public final void method587(int arg0) {
        ++field700;
        super.method587(arg0);
        this.field698 = class592.method3456(((class244) super.field3611).field3889, true, super.field3612);
    }
}
