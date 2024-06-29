import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class701 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Z")
    public static boolean field9925 = false;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3941(int arg0, int arg1, int arg2) {
        field9923++;
        if (arg2 < 19) {
            field9925 = true;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I", line = 16)
    public static final int method3942(int arg0, int arg1) {
        field9924++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else {
            int var2 = -110 % ((-arg1 - 53) / 47);
            if (arg0 != 6402) {
                throw new IllegalArgumentException("");
            }
            return 6402;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ltv;ILtv;)V", line = 49)
    public static final void method3943(class435 arg0, int arg1, class435 arg2) {
        if (arg1 != -15818) {
            field9925 = true;
        }
        field9926++;
        if (arg0.field6258 != null) {
            arg0.method2549((byte) -53);
        }
        arg0.field6259 = arg2;
        arg0.field6258 = arg2.field6258;
        arg0.field6258.field6259 = arg0;
        arg0.field6259.field6258 = arg0;
    }
}
