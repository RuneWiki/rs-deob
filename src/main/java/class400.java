import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class400 extends class183 {

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[I")
    public static int[] field5590 = new int[14];

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lkr;")
    private class743 field5592;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBZI)V", line = 4)
    public final void method1309(int arg0, byte arg1, boolean arg2, int arg3) {
        ++field5593;
        int var5 = this.method1307(false) * super.field2610.field3705 / 10000;
        int[] var6 = new int[4];
        if (arg1 <= -100) {
            class359.field5046.method624(var6);
            class359.field5046.method584(arg0, arg3 + 2, arg0 + var5, arg3 - -super.field2610.field3701);
            this.field5592.method4137(arg0, arg3 - -2, super.field2610.field3705, super.field2610.field3701);
            class359.field5046.method584(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljha;Ljg;IIIIIIIIII)V", line = 25)
    public static final void method2475(class692 arg0, class338 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class291.field4087 = arg3;
        class634.field9080 = arg8;
        class31.field413 = arg9;
        class389.field5437 = null;
        class430.field6018 = arg6;
        class49.field702 = arg2;
        class701.field9850 = null;
        class354.field4985 = arg7;
        ++field5591;
        class531.field7521 = arg0;
        class429.field6000 = arg10;
        class219.field3127 = arg1;
        class109.field1781 = arg11;
        class443.field6168 = arg4;
        class684.field9642 = null;
        if (arg5 != -30140) {
            method2476(12);
        }
        class168.method1247(arg5 ^ -30159);
        class237.field3353 = true;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V", line = 51)
    public static void method2476(int arg0) {
        field5590 = null;
        if (arg0 != 1) {
            method2475((class692) null, (class338) null, -3, 114, 64, 60, 27, 64, 53, -88, 38, -98);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Z", line = 62)
    public final boolean method1176(byte arg0) {
        ++field5594;
        if (!super.method1176((byte) 127)) {
            return false;
        } else {
            return arg0 <= 124 ? true : super.field2621.method1472(-25711, ((class162) super.field2610).field2400);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Leq;Leq;Lada;)V", line = 81)
    public class400(class209 arg0, class209 arg1, class162 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZI)V", line = 84)
    public final void method1313(int arg0, int arg1, boolean arg2, int arg3) {
        ++field5589;
        class359.field5046.method616(arg3 + -2, arg0, super.field2610.field3705 + 4, super.field2610.field3701 + 2, ((class162) super.field2610).field2403, arg1);
        class359.field5046.method616(arg3 - 1, arg0 - -1, super.field2610.field3705 + 2, super.field2610.field3701, 0, 0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 96)
    public final void method1173(int arg0) {
        if (arg0 <= -105) {
            super.method1173(-111);
            ++field5588;
            this.field5592 = class458.method2794(super.field2621, ((class162) super.field2610).field2400, -95);
        }
    }
}
