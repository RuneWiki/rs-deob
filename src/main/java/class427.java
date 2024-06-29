import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class427 {

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "Lra;")
    public static class361 field5530 = new class361(88, -2);

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "[B")
    public static byte[] field5531 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
    public static int field5532 = 0;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "Lnj;")
    public static class415 field5533 = new class415(42, 7);

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "[[I")
    public static int[][] field5535 = new int[6][];

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "Lpe;")
    public static class615 field5534;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V", line = 6)
    public static void method2452(byte arg0) {
        field5534 = null;
        field5535 = null;
        if (arg0 < 119) {
            field5535 = null;
        }
        field5531 = null;
        field5533 = null;
        field5530 = null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method2453(int arg0, int arg1, int arg2) {
        field5529++;
        if (arg0 != 2048) {
            field5531 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BII)Z", line = 47)
    public static final boolean method2454(byte arg0, int arg1, int arg2) {
        field5528++;
        if (arg0 <= 6) {
            field5533 = null;
        }
        return (arg1 & 0x800) != 0;
    }
}
