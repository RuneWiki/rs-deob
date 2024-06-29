import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class562 extends class256 {

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public int field7964;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public int field7966;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lnt;")
    public static class220 field7965 = new class220();

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Lqe;")
    public static class465 field7971 = new class465(0, 4);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Lkr;")
    public static class743 field7970;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Ljw;", line = 9)
    public final class551 method930(int arg0) {
        if (arg0 == 17503) {
            field7969++;
            return class438.field6122;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V", line = 25)
    public static void method3288(int arg0) {
        if (arg0 == -28309) {
            field7970 = null;
            field7965 = null;
            field7971 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V", line = 37)
    public static final void method3289(int arg0) {
        field7968++;
        if (class226.field3227 != null) {
            class226.field3227.method623(-1);
            class226.field3227 = null;
            class181.field2591 = null;
        }
        int var1 = -31 % ((-arg0 - 25) / 49);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)V", line = 57)
    public static final void method3290(int arg0, byte arg1) {
        if (arg1 < 56) {
            field7965 = null;
        }
        field7967++;
        class118.field1855.method3049(arg0, (byte) 127);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljg;Ljha;IIIIIIIII)V", line = 68)
    public class562(class338 arg0, class692 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7964 = arg10;
        this.field7966 = arg9;
    }
}
