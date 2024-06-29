import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class486 extends class530 {

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)Z", line = 4)
    public static final boolean method2838(int arg0, int arg1, int arg2) {
        ++field6801;
        if (arg2 != -1) {
            return true;
        } else {
            return ~(384 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)Z", line = 17)
    public static final boolean method2839(byte arg0, int arg1, int arg2) {
        ++field6800;
        if (arg0 >= -70) {
            method2838(-36, -76, -43);
        }
        return ~(arg2 & 32768) != -1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIZ)V", line = 28)
    public final void method1159(int arg0, int arg1, int arg2, boolean arg3) {
        super.field7733 = arg1;
        if (arg3) {
            method2839((byte) 66, 37, 14);
        }
        ++field6802;
        super.field7736 = arg2;
        super.field7734 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BF)V", line = 42)
    public final void method1158(byte arg0, float arg1) {
        if (arg0 <= 52) {
            this.method1159(-52, 97, 87, true);
        }
        ++field6799;
        super.field7732 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIF)V", line = 53)
    public class486(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
