import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class659 extends class514 {

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lec;")
    public class248 field9116;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Ljw;")
    public static class581 field9118 = new class581(123, -1);

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "[S")
    public static short[] field9120;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method3649(int arg0) {
        field9118 = null;
        field9120 = null;
        if (arg0 != 0) {
            field9120 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)I")
    public static final int method3650(boolean arg0, byte arg1) {
        field9117++;
        if (arg1 >= -46) {
            method3649(-17);
        }
        int var2 = class669.field9399;
        if (var2 == 0) {
            return arg0 ? 0 : class107.field1479;
        } else if (var2 == 1) {
            return class107.field1479;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lai;II[B)V")
    public class659(class626 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9116 = arg0.method3462(arg3, arg1, arg2, (byte) -62, false, class250.field3704);
        this.field9116.method1667(false, false, 30135);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lai;II[I)V")
    public class659(class626 arg0, int arg1, int arg2, int[] arg3) {
        this.field9116 = arg0.method3517((byte) -103, arg1, arg2, false, arg3);
        this.field9116.method1667(false, false, 30135);
    }
}
