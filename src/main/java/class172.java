import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class172 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lra;")
    public static class57 field2401;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 3)
    public static void method1138(byte arg0) {
        field2401 = null;
        if (arg0 != -64) {
            field2403 = 115;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z", line = 14)
    public static final boolean method1139(int arg0, int arg1) {
        field2402++;
        if (arg1 == 50 || arg1 == 10 || arg1 == 16 || arg1 == 35 || arg1 == 14) {
            return true;
        } else if (arg1 == 43 || arg1 == 18 || arg1 == 1007) {
            return true;
        } else {
            if (arg0 > -67) {
                method1139(28, -20);
            }
            if (arg1 == 26 || arg1 == 34 || arg1 == 22 || arg1 == 49 || arg1 == 44) {
                return true;
            } else {
                return arg1 == 47 || arg1 == 60 || arg1 == 1012 || arg1 == 41;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V", line = 44)
    public static final void method1140(int arg0, int arg1) {
        field2400++;
        class256.field3440 = arg0;
        class331 var2 = class422.field6060;
        synchronized (class422.field6060) {
            class422.field6060.method2043(-32);
            if (arg1 > -86) {
                field2403 = -103;
            }
        }
        class331 var3 = class350.field5107;
        synchronized (class350.field5107) {
            class350.field5107.method2043(-113);
        }
    }
}
