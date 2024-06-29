import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class411 {

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "[S")
    public static short[] field5575 = new short[256];

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5576 = null;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "J")
    public static long field5573;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "[Ls;")
    public static class294[] field5572;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 44)
    public static void method2496(byte arg0) {
        field5572 = null;
        field5576 = null;
        field5575 = null;
        if (arg0 > -16) {
            method2496((byte) -26);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I", line = 65)
    public static final int method2497(int arg0, int arg1) {
        field5574++;
        return arg0 == 1739125290 ? arg1 >>> 10 : 8;
    }
}
