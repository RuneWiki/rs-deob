import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class265 extends class667 {

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    private int field3858;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "Lnt;")
    public static class220 field3857 = new class220();

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "F")
    public static float field3859;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "[I")
    public static int[] field3861;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field3859 = -1.5002661F;
        }
        ++field3855;
        if (arg2 == 0) {
            this.field3858 = (arg0.method273(255) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 3;
        if ((1 & arg3) == 1) {
            int var8 = arg5;
            arg5 = arg0;
            arg0 = var8;
        }
        ++field3854;
        int var9 = 32 % ((arg6 - -9) / 57);
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return -arg5 - (-1 - -arg4 - 7);
        } else {
            return ~var7 == -3 ? 8 - arg0 + -arg1 : arg4;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
    public static void method1786(byte arg0) {
        field3861 = null;
        field3857 = null;
        if (arg0 < 30) {
            field3861 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
    public class265(int arg0) {
        super(0, true);
        this.field3858 = 4096;
        this.field3858 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static final void method1787(int arg0) {
        ++field3860;
        if (~class363.field5096 == -7) {
            class363.field5096 = 7;
            if (arg0 >= -33) {
                method1786((byte) -39);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class265() {
        this(4096);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field3853;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            class622.method3592(var3, 0, class77.field1455, this.field3858);
        }
        if (arg0 >= -87) {
            field3861 = null;
        }
        return var3;
    }
}
