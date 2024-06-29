import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class230 {

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "Lob;")
    public static class516 field3354 = new class516("", 12);

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "[I")
    public static int[] field3359 = new int[1];

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Lr;")
    public static class120 field3353;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "Lfk;")
    public static class461 field3355;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 5)
    public static void method1504(byte arg0) {
        field3354 = null;
        field3359 = null;
        field3353 = null;
        int var1 = -20 % ((arg0 - 56) / 46);
        field3355 = null;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)V", line = 23)
    public static final void method1505(int arg0, byte arg1) {
        field3358++;
        class511.field7539 = -1;
        class25.field439 = arg0;
        class504.field7389 = -1;
        class182.method1276((byte) -99);
        if (arg1 < 61) {
            method1504((byte) -40);
        }
    }
}
