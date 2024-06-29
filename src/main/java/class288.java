import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class288 extends class673 {

    @OriginalMember(owner = "client!il", name = "q", descriptor = "Z")
    public static boolean field3676 = false;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Lin;")
    public static class68 field3675 = new class68();

    @OriginalMember(owner = "client!il", name = "y", descriptor = "[I")
    public static int[] field3684 = new int[3];

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Lpu;")
    private class772 field3678;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
    public final boolean method1034(int arg0) {
        ++field3677;
        return !super.method1034(arg0) ? false : super.field8706.method130(-2, ((class167) super.field8712).field2223);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZZI)V")
    public final void method1745(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field3682;
        if (arg1) {
            int var5 = this.method3629((byte) 117) * super.field8712.field140 / 10000;
            int[] var6 = new int[4];
            class576.field7320.method924(var6);
            class576.field7320.method915(arg0, arg3 + 2, arg0 + var5, super.field8712.field141 + arg3);
            this.field3678.method4198(arg0, arg3 + 2, super.field8712.field140, super.field8712.field141);
            class576.field7320.method915(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIZ)V")
    public final void method1746(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3680;
        class576.field7320.method911(arg0 + -2, arg1, super.field8712.field140 - -4, super.field8712.field141 + 2, ((class167) super.field8712).field2222, 0);
        if (arg2 > -50) {
            method1749((byte) 33);
        }
        class576.field7320.method911(arg0 - 1, arg1 - -1, super.field8712.field140 + 2, super.field8712.field141, 0, 0);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIII)V")
    public static final void method1747(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -35) {
            field3676 = true;
        }
        ++field3683;
        class614 var4 = class497.method2759(9, 5977, (long) arg0);
        var4.method3277(639);
        var4.field7746 = arg1;
        var4.field7742 = arg2;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public final void method1035(int arg0) {
        super.method1035(arg0);
        ++field3679;
        this.field3678 = class752.method4085(super.field8706, ((class167) super.field8712).field2223, (byte) 36);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Leka;IZ)V")
    public static final void method1748(class654 arg0, int arg1, boolean arg2) {
        ++field3681;
        if (arg1 >= -39) {
            field3684 = null;
        }
        class331.field4047.method1029(arg0, 26707);
        if (arg2) {
            class579.method3105(class681.field8795, arg0, class407.field5402, 16, class664.field8660, class331.field4047);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lwm;Lwm;Lbp;)V")
    public class288(class30 arg0, class30 arg1, class167 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
    public static void method1749(byte arg0) {
        field3684 = null;
        field3675 = null;
        if (arg0 != 45) {
            method1748((class654) null, -47, true);
        }
    }
}
