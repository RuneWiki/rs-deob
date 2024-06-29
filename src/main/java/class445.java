import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class445 {

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field6138 = 0;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "F")
    public static float field6133;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public int field6131;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public int field6139;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "[I")
    public static int[] field6135;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2601(int arg0, int arg1, int arg2) {
        if (arg0 == 6470) {
            field6140++;
            return (arg1 & 0x70000) != 0 | class594.method3446(0, arg1, arg2) || class383.method2215(arg1, 64, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)I", line = 16)
    public static final int method2602(int arg0, boolean arg1) {
        if (arg1) {
            return -39;
        } else {
            field6134++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Los;I)V", line = 28)
    public final void method2603(class374 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2129(-77);
            if (var3 == 0) {
                field6136++;
                if (arg1 != 26744) {
                    method2602(-15, true);
                    return;
                }
                return;
            }
            this.method2604(-7857, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILos;)V", line = 50)
    private final void method2604(int arg0, int arg1, class374 arg2) {
        if (arg1 == 1) {
            this.field6131 = arg2.method2136(false);
            this.field6137 = arg2.method2129(arg0 ^ 0x1ECB);
            this.field6139 = arg2.method2129(-82);
        }
        if (arg0 != -7857) {
            this.method2603(null, -33);
        }
        field6141++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 80)
    public static void method2605(byte arg0) {
        if (arg0 >= -71) {
            method2602(-70, true);
        }
        field6135 = null;
    }
}
