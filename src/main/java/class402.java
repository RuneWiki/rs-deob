import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class402 extends class601 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIB)V", line = 4)
    public static final void method2451(int arg0, int arg1, int arg2, byte arg3) {
        ++field5483;
        if (arg3 == -112) {
            String var4 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (63 & arg1) + "," + (63 & arg0);
            System.out.println(var4);
            class132.method827(true, false, (byte) 72, var4);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)I", line = 20)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            return -81;
        } else {
            ++field5486;
            return !super.field8563.method3928((byte) -128).method967(4) ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(ILgn;)V", line = 35)
    public class402(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V", line = 39)
    public final void method40(int arg0, boolean arg1) {
        super.field8565 = arg0;
        if (arg1) {
            method2451(-46, 19, 94, (byte) -45);
        }
        ++field5482;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 50)
    public static final void method2452(int arg0) {
        ++field5484;
        class256.field3132 = null;
        if (arg0 > -41) {
            method2452(-11);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)I", line = 63)
    public final int method34(int arg0, int arg1) {
        if (arg1 != 15706) {
            return -93;
        } else {
            ++field5488;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 75)
    public final void method35(byte arg0) {
        if (super.field8565 < 1 || super.field8565 > 3) {
            super.field8565 = this.method39((byte) -17);
        }
        if (arg0 > -37) {
            this.method35((byte) -77);
        }
        ++field5485;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lgn;)V", line = 89)
    public class402(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I", line = 94)
    public final int method2453(int arg0) {
        int var2 = -17 / ((arg0 - -59) / 61);
        ++field5487;
        return super.field8565;
    }
}
