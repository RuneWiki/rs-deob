import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class483 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lmw;")
    public static class517 field6762 = new class517(83, -1);

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "[I")
    public static int[] field6764;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 9)
    public static void method2838(byte arg0) {
        if (arg0 > -125) {
            method2838((byte) -45);
        }
        field6762 = null;
        field6764 = null;
    }
}
