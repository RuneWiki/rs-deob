import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class211 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[J")
    public static long[] field3384 = new long[32];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "J")
    public static volatile long field3382 = 0L;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lbk;")
    public static class22 field3385;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method1494(byte arg0) {
        field3384 = null;
        if (arg0 != 40) {
            field3385 = null;
        }
        field3385 = null;
    }
}
