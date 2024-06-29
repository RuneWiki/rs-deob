import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class406 extends class305 {

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lqe;")
    public static class469 field6143 = new class469(99, 12);

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return 86;
        } else {
            ++field6146;
            return 1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field6145;
        if (arg0 <= -40) {
            if (super.field4323.method4107(true) == class373.field5652) {
                super.field4320 = 2;
            }
            if (~super.field4320 > -1 || super.field4320 > 2) {
                super.field4320 = this.method305((byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(ILhb;)V")
    public class406(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        ++field6140;
        super.field4320 = arg1;
        if (arg0 != -27751) {
            field6142 = 119;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lhb;)V")
    public class406(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field6141;
        return arg0 != 31401 ? 35 : 1;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static void method2587(int arg0) {
        field6143 = null;
        if (arg0 != -1) {
            field6143 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)I")
    public final int method2588(int arg0) {
        ++field6144;
        if (arg0 != 17503) {
            this.method2588(83);
        }
        return super.field4320;
    }
}
