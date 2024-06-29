import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class383 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Ldn;")
    public static class357 field5593 = new class357("WTRC", 1);

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lwj;")
    public static class270 field5594 = new class270(75, 12);

    @OriginalMember(owner = "client!el", name = "d", descriptor = "J")
    public static long field5595 = 0L;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[I")
    public static int[] field5592;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 11)
    public static void method2272(byte arg0) {
        field5592 = null;
        if (arg0 <= -114) {
            field5593 = null;
            field5594 = null;
        }
    }
}
