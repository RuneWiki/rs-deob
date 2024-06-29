import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class361 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
    public static int[] field4903 = new int[2];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Llu;")
    public static class610 field4902 = new class610(57, 3);

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[Lgm;")
    public static class106[] field4904 = new class106[14];

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lada;")
    public static class144 field4905 = new class144(2, 12);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2176(int arg0, byte arg1, int arg2) {
        field4901++;
        if (arg1 <= 32) {
            method2177(64);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method2177(int arg0) {
        field4905 = null;
        field4904 = null;
        field4903 = null;
        field4902 = null;
        if (arg0 != 57) {
            method2177(12);
        }
    }
}
