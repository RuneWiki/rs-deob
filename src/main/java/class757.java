import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class757 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "[I")
    public static int[] field10548 = new int[14];

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field10552 = 0;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field10550 = 0;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field10549;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 5)
    public static void method4207(byte arg0) {
        field10548 = null;
        int var1 = 93 / ((arg0 + 5) / 57);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method4208(int arg0, int arg1, int arg2) {
        field10549++;
        if (arg0 != -1) {
            field10551 = 23;
        }
        return (arg1 & 0x180) != 0;
    }
}
